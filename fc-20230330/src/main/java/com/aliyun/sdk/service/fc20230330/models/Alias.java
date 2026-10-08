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
 * {@link Alias} extends {@link TeaModel}
 *
 * <p>Alias</p>
 */
public class Alias extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("additionalVersionWeight")
    private java.util.Map<String, Float> additionalVersionWeight;

    @com.aliyun.core.annotation.NameInMap("aliasName")
    private String aliasName;

    @com.aliyun.core.annotation.NameInMap("createdTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("lastModifiedTime")
    private String lastModifiedTime;

    @com.aliyun.core.annotation.NameInMap("versionId")
    private String versionId;

    private Alias(Builder builder) {
        this.additionalVersionWeight = builder.additionalVersionWeight;
        this.aliasName = builder.aliasName;
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Alias create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
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
        private String createdTime; 
        private String description; 
        private String lastModifiedTime; 
        private String versionId; 

        private Builder() {
        } 

        private Builder(Alias model) {
            this.additionalVersionWeight = model.additionalVersionWeight;
            this.aliasName = model.aliasName;
            this.createdTime = model.createdTime;
            this.description = model.description;
            this.lastModifiedTime = model.lastModifiedTime;
            this.versionId = model.versionId;
        } 

        /**
         * <p>The weight of the canary release version.</p>
         */
        public Builder additionalVersionWeight(java.util.Map<String, Float> additionalVersionWeight) {
            this.additionalVersionWeight = additionalVersionWeight;
            return this;
        }

        /**
         * <p>The name of the alias.</p>
         * 
         * <strong>example:</strong>
         * <p>prod</p>
         */
        public Builder aliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }

        /**
         * <p>The time when the alias was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2006-01-02T15:04:05Z07:00</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>The description of the alias.</p>
         * 
         * <strong>example:</strong>
         * <p>alias for pre env</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The time when the alias was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2006-01-02T15:04:05Z07:00</p>
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * <p>The version to which the alias points.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        public Alias build() {
            return new Alias(this);
        } 

    } 

}
