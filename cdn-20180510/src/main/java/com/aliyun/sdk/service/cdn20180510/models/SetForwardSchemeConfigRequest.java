// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetForwardSchemeConfigRequest} extends {@link RequestModel}
 *
 * <p>SetForwardSchemeConfigRequest</p>
 */
public class SetForwardSchemeConfigRequest extends Request {
    @Query
    @NameInMap("ConfigId")
    private Long configId;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("Enable")
    @Validation(required = true)
    private String enable;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SchemeOrigin")
    @Validation(required = true)
    private String schemeOrigin;

    @Query
    @NameInMap("SchemeOriginPort")
    @Validation(required = true)
    private String schemeOriginPort;

    private SetForwardSchemeConfigRequest(Builder builder) {
        super(builder);
        this.configId = builder.configId;
        this.domainName = builder.domainName;
        this.enable = builder.enable;
        this.ownerId = builder.ownerId;
        this.schemeOrigin = builder.schemeOrigin;
        this.schemeOriginPort = builder.schemeOriginPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetForwardSchemeConfigRequest create() {
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
     * @return enable
     */
    public String getEnable() {
        return this.enable;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return schemeOrigin
     */
    public String getSchemeOrigin() {
        return this.schemeOrigin;
    }

    /**
     * @return schemeOriginPort
     */
    public String getSchemeOriginPort() {
        return this.schemeOriginPort;
    }

    public static final class Builder extends Request.Builder<SetForwardSchemeConfigRequest, Builder> {
        private Long configId; 
        private String domainName; 
        private String enable; 
        private Long ownerId; 
        private String schemeOrigin; 
        private String schemeOriginPort; 

        private Builder() {
            super();
        } 

        private Builder(SetForwardSchemeConfigRequest response) {
            super(response);
            this.configId = response.configId;
            this.domainName = response.domainName;
            this.enable = response.enable;
            this.ownerId = response.ownerId;
            this.schemeOrigin = response.schemeOrigin;
            this.schemeOriginPort = response.schemeOriginPort;
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
         * Enable.
         */
        public Builder enable(String enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
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
         * SchemeOrigin.
         */
        public Builder schemeOrigin(String schemeOrigin) {
            this.putQueryParameter("SchemeOrigin", schemeOrigin);
            this.schemeOrigin = schemeOrigin;
            return this;
        }

        /**
         * SchemeOriginPort.
         */
        public Builder schemeOriginPort(String schemeOriginPort) {
            this.putQueryParameter("SchemeOriginPort", schemeOriginPort);
            this.schemeOriginPort = schemeOriginPort;
            return this;
        }

        @Override
        public SetForwardSchemeConfigRequest build() {
            return new SetForwardSchemeConfigRequest(this);
        } 

    } 

}
