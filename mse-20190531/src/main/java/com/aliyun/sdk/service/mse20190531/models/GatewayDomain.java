// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GatewayDomain model) {
            this.certIdentifier = model.certIdentifier;
            this.gatewayId = model.gatewayId;
            this.gatewayName = model.gatewayName;
            this.gatewayUniqueId = model.gatewayUniqueId;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.id = model.id;
            this.mustHttps = model.mustHttps;
            this.name = model.name;
            this.protocol = model.protocol;
        } 

        /**
         * <p>The ID of the certificate in use.</p>
         * 
         * <strong>example:</strong>
         * <p>595xx36-cn-hangzhou</p>
         */
        public Builder certIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * <p>The gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder gatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The name of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder gatewayName(String gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-c9bc5afd61014165bd58f621b491****</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * <p>The time when the gateway was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-31 10:16:46</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The time when the gateway was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-11 15:28:47</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The domain ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Indicates whether HTTPS is forcibly used.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder mustHttps(String mustHttps) {
            this.mustHttps = mustHttps;
            return this;
        }

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The domain protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTPS</p>
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
