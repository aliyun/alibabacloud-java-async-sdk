// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link ModuleResultsValue} extends {@link TeaModel}
 *
 * <p>ModuleResultsValue</p>
 */
public class ModuleResultsValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Passed")
    private Boolean passed;

    @com.aliyun.core.annotation.NameInMap("ResourceCode")
    private String resourceCode;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    private ModuleResultsValue(Builder builder) {
        this.passed = builder.passed;
        this.resourceCode = builder.resourceCode;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModuleResultsValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return passed
     */
    public Boolean getPassed() {
        return this.passed;
    }

    /**
     * @return resourceCode
     */
    public String getResourceCode() {
        return this.resourceCode;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public static final class Builder {
        private Boolean passed; 
        private String resourceCode; 
        private String errorCode; 
        private String errorMessage; 

        private Builder() {
        } 

        private Builder(ModuleResultsValue model) {
            this.passed = model.passed;
            this.resourceCode = model.resourceCode;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
        } 

        /**
         * Passed.
         */
        public Builder passed(Boolean passed) {
            this.passed = passed;
            return this;
        }

        /**
         * ResourceCode.
         */
        public Builder resourceCode(String resourceCode) {
            this.resourceCode = resourceCode;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        public ModuleResultsValue build() {
            return new ModuleResultsValue(this);
        } 

    } 

}
