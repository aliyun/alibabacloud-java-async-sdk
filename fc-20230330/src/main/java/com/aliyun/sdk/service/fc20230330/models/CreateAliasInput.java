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
 * {@link CreateAliasInput} extends {@link TeaModel}
 *
 * <p>CreateAliasInput</p>
 */
public class CreateAliasInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("additionalVersionWeight")
    private java.util.Map<String, Float> additionalVersionWeight;

    @com.aliyun.core.annotation.NameInMap("aliasName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String aliasName;

    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String description;

    @com.aliyun.core.annotation.NameInMap("versionId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 10, minLength = 1)
    private String versionId;

    private CreateAliasInput(Builder builder) {
        this.additionalVersionWeight = builder.additionalVersionWeight;
        this.aliasName = builder.aliasName;
        this.description = builder.description;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAliasInput create() {
        return builder().build();
    }

    /**
     * @return additionalVersionWeight
     */
    public java.util.Map<String, Float> getAdditionalVersionWeight() {
        return this.additionalVersionWeight;
    }

    /**
     * @return aliasName
     */
    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder {
        private java.util.Map<String, Float> additionalVersionWeight; 
        private String aliasName; 
        private String description; 
        private String versionId; 

        /**
         * additionalVersionWeight.
         */
        public Builder additionalVersionWeight(java.util.Map<String, Float> additionalVersionWeight) {
            this.additionalVersionWeight = additionalVersionWeight;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>prod</p>
         */
        public Builder aliasName(String aliasName) {
            this.aliasName = aliasName;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        public CreateAliasInput build() {
            return new CreateAliasInput(this);
        } 

    } 

}
