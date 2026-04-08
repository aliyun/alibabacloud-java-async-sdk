// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ValidationOptions} extends {@link TeaModel}
 *
 * <p>ValidationOptions</p>
 */
public class ValidationOptions extends TeaModel {
    private ValidationOptions(Builder builder) {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidationOptions create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder {

        private Builder() {
        } 

        private Builder(ValidationOptions model) {
        } 

        public ValidationOptions build() {
            return new ValidationOptions(this);
        } 

    } 

}
