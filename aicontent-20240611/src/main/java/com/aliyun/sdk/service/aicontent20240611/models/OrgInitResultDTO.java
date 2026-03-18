// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link OrgInitResultDTO} extends {@link TeaModel}
 *
 * <p>OrgInitResultDTO</p>
 */
public class OrgInitResultDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiKey")
    private String apiKey;

    @com.aliyun.core.annotation.NameInMap("clientId")
    private Long clientId;

    @com.aliyun.core.annotation.NameInMap("clientUuid")
    private String clientUuid;

    @com.aliyun.core.annotation.NameInMap("isNew")
    private Boolean isNew;

    @com.aliyun.core.annotation.NameInMap("orgId")
    private Long orgId;

    @com.aliyun.core.annotation.NameInMap("userId")
    private Long userId;

    private OrgInitResultDTO(Builder builder) {
        this.apiKey = builder.apiKey;
        this.clientId = builder.clientId;
        this.clientUuid = builder.clientUuid;
        this.isNew = builder.isNew;
        this.orgId = builder.orgId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OrgInitResultDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return clientId
     */
    public Long getClientId() {
        return this.clientId;
    }

    /**
     * @return clientUuid
     */
    public String getClientUuid() {
        return this.clientUuid;
    }

    /**
     * @return isNew
     */
    public Boolean getIsNew() {
        return this.isNew;
    }

    /**
     * @return orgId
     */
    public Long getOrgId() {
        return this.orgId;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String apiKey; 
        private Long clientId; 
        private String clientUuid; 
        private Boolean isNew; 
        private Long orgId; 
        private Long userId; 

        private Builder() {
        } 

        private Builder(OrgInitResultDTO model) {
            this.apiKey = model.apiKey;
            this.clientId = model.clientId;
            this.clientUuid = model.clientUuid;
            this.isNew = model.isNew;
            this.orgId = model.orgId;
            this.userId = model.userId;
        } 

        /**
         * apiKey.
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * clientId.
         */
        public Builder clientId(Long clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * clientUuid.
         */
        public Builder clientUuid(String clientUuid) {
            this.clientUuid = clientUuid;
            return this;
        }

        /**
         * isNew.
         */
        public Builder isNew(Boolean isNew) {
            this.isNew = isNew;
            return this;
        }

        /**
         * orgId.
         */
        public Builder orgId(Long orgId) {
            this.orgId = orgId;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public OrgInitResultDTO build() {
            return new OrgInitResultDTO(this);
        } 

    } 

}
