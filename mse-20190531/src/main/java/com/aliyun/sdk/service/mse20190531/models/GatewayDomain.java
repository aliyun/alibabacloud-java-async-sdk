// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GatewayDomain} extends {@link TeaModel}
 *
 * <p>GatewayDomain</p>
 */
public class GatewayDomain extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertIdentifier")
    private String certIdentifier;

    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private Long gatewayId;

    @com.aliyun.core.annotation.NameInMap("GatewayName")
    private String gatewayName;

    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("MustHttps")
    private String mustHttps;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    private GatewayDomain(Builder builder) {
        this.certIdentifier = builder.certIdentifier;
        this.gatewayId = builder.gatewayId;
        this.gatewayName = builder.gatewayName;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.mustHttps = builder.mustHttps;
        this.name = builder.name;
        this.protocol = builder.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GatewayDomain create() {
        return builder().build();
    }

    /**
     * @return certIdentifier
     */
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    /**
     * @return gatewayId
     */
    public Long getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return gatewayName
     */
    public String getGatewayName() {
        return this.gatewayName;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return mustHttps
     */
    public String getMustHttps() {
        return this.mustHttps;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    public static final class Builder {
        private String certIdentifier; 
        private Long gatewayId; 
        private String gatewayName; 
        private String gatewayUniqueId; 
        private String gmtCreate; 
        private String gmtModified; 
        private Long id; 
        private String mustHttps; 
        private String name; 
        private String protocol; 

        /**
         * CertIdentifier.
         */
        public Builder certIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * GatewayId.
         */
        public Builder gatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * GatewayName.
         */
        public Builder gatewayName(String gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }

        /**
         * GatewayUniqueId.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * MustHttps.
         */
        public Builder mustHttps(String mustHttps) {
            this.mustHttps = mustHttps;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        public GatewayDomain build() {
            return new GatewayDomain(this);
        } 

    } 

}
