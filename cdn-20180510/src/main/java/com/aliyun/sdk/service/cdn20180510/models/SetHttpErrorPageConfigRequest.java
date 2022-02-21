// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetHttpErrorPageConfigRequest} extends {@link RequestModel}
 *
 * <p>SetHttpErrorPageConfigRequest</p>
 */
public class SetHttpErrorPageConfigRequest extends Request {
    @Query
    @NameInMap("ConfigId")
    private Long configId;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("ErrorCode")
    @Validation(required = true)
    private String errorCode;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageUrl")
    @Validation(required = true)
    private String pageUrl;

    private SetHttpErrorPageConfigRequest(Builder builder) {
        super(builder);
        this.configId = builder.configId;
        this.domainName = builder.domainName;
        this.errorCode = builder.errorCode;
        this.ownerId = builder.ownerId;
        this.pageUrl = builder.pageUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetHttpErrorPageConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configId
     */
    public Long getConfigId() {
        return this.configId;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageUrl
     */
    public String getPageUrl() {
        return this.pageUrl;
    }

    public static final class Builder extends Request.Builder<SetHttpErrorPageConfigRequest, Builder> {
        private Long configId; 
        private String domainName; 
        private String errorCode; 
        private Long ownerId; 
        private String pageUrl; 

        private Builder() {
            super();
        } 

        private Builder(SetHttpErrorPageConfigRequest response) {
            super(response);
            this.configId = response.configId;
            this.domainName = response.domainName;
            this.errorCode = response.errorCode;
            this.ownerId = response.ownerId;
            this.pageUrl = response.pageUrl;
        } 

        /**
         * ConfigId.
         */
        public Builder configId(Long configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.putQueryParameter("ErrorCode", errorCode);
            this.errorCode = errorCode;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PageUrl.
         */
        public Builder pageUrl(String pageUrl) {
            this.putQueryParameter("PageUrl", pageUrl);
            this.pageUrl = pageUrl;
            return this;
        }

        @Override
        public SetHttpErrorPageConfigRequest build() {
            return new SetHttpErrorPageConfigRequest(this);
        } 

    } 

}
