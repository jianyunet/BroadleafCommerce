/*
 * Copyright 2008-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.broadleafcommerce.profile.core.service.validator;

import org.springframework.validation.BindException;
import org.springframework.validation.Errors;

public class BaseResponse {

    private Errors errors;

    public BaseResponse(Object target, String objectName) {
        errors = new BindException(target, objectName);
    }

    public boolean hasErrors() {
        return errors.hasErrors();
    }

    public Errors getErrors() {
        return errors;
    }
}
