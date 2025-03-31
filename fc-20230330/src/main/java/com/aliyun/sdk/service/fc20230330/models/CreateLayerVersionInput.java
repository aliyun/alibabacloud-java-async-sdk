// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link CreateLayerVersionInput} extends {@link TeaModel}
 *
 * <p>CreateLayerVersionInput</p>
 */
public class CreateLayerVersionInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private InputCodeLocation code;

    @com.aliyun.core.annotation.NameInMap("compatibleRuntime")
    private java.util.List<String> compatibleRuntime;

    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String description;

    @com.aliyun.core.annotation.NameInMap("license")
    private String license;

    private CreateLayerVersionInput(Builder builder) {
        this.code = builder.code;
        this.compatibleRuntime = builder.compatibleRuntime;
        this.description = builder.description;
        this.license = builder.license;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLayerVersionInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public InputCodeLocation getCode() {
        return this.code;
    }

    /**
     * @return compatibleRuntime
     */
    public java.util.List<String> getCompatibleRuntime() {
        return this.compatibleRuntime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return license
     */
    public String getLicense() {
        return this.license;
    }

    public static final class Builder {
        private InputCodeLocation code; 
        private java.util.List<String> compatibleRuntime; 
        private String description; 
        private String license; 

        private Builder() {
        } 

        private Builder(CreateLayerVersionInput model) {
            this.code = model.code;
            this.compatibleRuntime = model.compatibleRuntime;
            this.description = model.description;
            this.license = model.license;
        } 

        /**
         * code.
         */
        public Builder code(InputCodeLocation code) {
            this.code = code;
            return this;
        }

        /**
         * compatibleRuntime.
         */
        public Builder compatibleRuntime(java.util.List<String> compatibleRuntime) {
            this.compatibleRuntime = compatibleRuntime;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * license.
         */
        public Builder license(String license) {
            this.license = license;
            return this;
        }

        public CreateLayerVersionInput build() {
            return new CreateLayerVersionInput(this);
        } 

    } 

}
