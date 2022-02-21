// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetHttpsOptionConfigRequest} extends {@link RequestModel}
 *
 * <p>SetHttpsOptionConfigRequest</p>
 */
public class SetHttpsOptionConfigRequest extends Request {
    @Query
    @NameInMap("ConfigId")
    private Long configId;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("Http2")
    @Validation(required = true)
    private String http2;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private SetHttpsOptionConfigRequest(Builder builder) {
        super(builder);
        this.configId = builder.configId;
        this.domainName = builder.domainName;
        this.http2 = builder.http2;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetHttpsOptionConfigRequest create() {
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
     * @return http2
     */
    public String getHttp2() {
        return this.http2;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<SetHttpsOptionConfigRequest, Builder> {
        private Long configId; 
        private String domainName; 
        private String http2; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(SetHttpsOptionConfigRequest response) {
            super(response);
            this.configId = response.configId;
            this.domainName = response.domainName;
            this.http2 = response.http2;
            this.ownerId = response.ownerId;
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
         * Http2.
         */
        public Builder http2(String http2) {
            this.putQueryParameter("Http2", http2);
            this.http2 = http2;
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

        @Override
        public SetHttpsOptionConfigRequest build() {
            return new SetHttpsOptionConfigRequest(this);
        } 

    } 

}
