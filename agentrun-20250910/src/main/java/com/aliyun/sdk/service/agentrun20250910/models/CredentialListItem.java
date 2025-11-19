// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link CredentialListItem} extends {@link TeaModel}
 *
 * <p>CredentialListItem</p>
 */
public class CredentialListItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("credentialAuthType")
    private String credentialAuthType;

    @com.aliyun.core.annotation.NameInMap("credentialId")
    private String credentialId;

    @com.aliyun.core.annotation.NameInMap("credentialName")
    private String credentialName;

    @com.aliyun.core.annotation.NameInMap("credentialSourceType")
    private String credentialSourceType;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("relatedResourceCount")
    private Integer relatedResourceCount;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private String updatedAt;

    private CredentialListItem(Builder builder) {
        this.createdAt = builder.createdAt;
        this.credentialAuthType = builder.credentialAuthType;
        this.credentialId = builder.credentialId;
        this.credentialName = builder.credentialName;
        this.credentialSourceType = builder.credentialSourceType;
        this.enabled = builder.enabled;
        this.relatedResourceCount = builder.relatedResourceCount;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CredentialListItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return credentialAuthType
     */
    public String getCredentialAuthType() {
        return this.credentialAuthType;
    }

    /**
     * @return credentialId
     */
    public String getCredentialId() {
        return this.credentialId;
    }

    /**
     * @return credentialName
     */
    public String getCredentialName() {
        return this.credentialName;
    }

    /**
     * @return credentialSourceType
     */
    public String getCredentialSourceType() {
        return this.credentialSourceType;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return relatedResourceCount
     */
    public Integer getRelatedResourceCount() {
        return this.relatedResourceCount;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private String createdAt; 
        private String credentialAuthType; 
        private String credentialId; 
        private String credentialName; 
        private String credentialSourceType; 
        private Boolean enabled; 
        private Integer relatedResourceCount; 
        private String updatedAt; 

        private Builder() {
        } 

        private Builder(CredentialListItem model) {
            this.createdAt = model.createdAt;
            this.credentialAuthType = model.credentialAuthType;
            this.credentialId = model.credentialId;
            this.credentialName = model.credentialName;
            this.credentialSourceType = model.credentialSourceType;
            this.enabled = model.enabled;
            this.relatedResourceCount = model.relatedResourceCount;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * createdAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * credentialAuthType.
         */
        public Builder credentialAuthType(String credentialAuthType) {
            this.credentialAuthType = credentialAuthType;
            return this;
        }

        /**
         * credentialId.
         */
        public Builder credentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }

        /**
         * credentialName.
         */
        public Builder credentialName(String credentialName) {
            this.credentialName = credentialName;
            return this;
        }

        /**
         * credentialSourceType.
         */
        public Builder credentialSourceType(String credentialSourceType) {
            this.credentialSourceType = credentialSourceType;
            return this;
        }

        /**
         * enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * relatedResourceCount.
         */
        public Builder relatedResourceCount(Integer relatedResourceCount) {
            this.relatedResourceCount = relatedResourceCount;
            return this;
        }

        /**
         * updatedAt.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public CredentialListItem build() {
            return new CredentialListItem(this);
        } 

    } 

}
