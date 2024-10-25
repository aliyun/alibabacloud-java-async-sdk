// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeActivationCodeDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeActivationCodeDetailsResponseBody</p>
 */
public class DescribeActivationCodeDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActivateAt")
    private String activateAt;

    @com.aliyun.core.annotation.NameInMap("CertContentB64")
    private String certContentB64;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("ExpireAt")
    private String expireAt;

    @com.aliyun.core.annotation.NameInMap("GmtCreated")
    private String gmtCreated;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Integer id;

    @com.aliyun.core.annotation.NameInMap("MacAddress")
    private String macAddress;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SystemIdentifier")
    private String systemIdentifier;

    private DescribeActivationCodeDetailsResponseBody(Builder builder) {
        this.activateAt = builder.activateAt;
        this.certContentB64 = builder.certContentB64;
        this.description = builder.description;
        this.expireAt = builder.expireAt;
        this.gmtCreated = builder.gmtCreated;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.macAddress = builder.macAddress;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.systemIdentifier = builder.systemIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeActivationCodeDetailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return activateAt
     */
    public String getActivateAt() {
        return this.activateAt;
    }

    /**
     * @return certContentB64
     */
    public String getCertContentB64() {
        return this.certContentB64;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return expireAt
     */
    public String getExpireAt() {
        return this.expireAt;
    }

    /**
     * @return gmtCreated
     */
    public String getGmtCreated() {
        return this.gmtCreated;
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
    public Integer getId() {
        return this.id;
    }

    /**
     * @return macAddress
     */
    public String getMacAddress() {
        return this.macAddress;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return systemIdentifier
     */
    public String getSystemIdentifier() {
        return this.systemIdentifier;
    }

    public static final class Builder {
        private String activateAt; 
        private String certContentB64; 
        private String description; 
        private String expireAt; 
        private String gmtCreated; 
        private String gmtModified; 
        private Integer id; 
        private String macAddress; 
        private String name; 
        private String requestId; 
        private String systemIdentifier; 

        /**
         * ActivateAt.
         */
        public Builder activateAt(String activateAt) {
            this.activateAt = activateAt;
            return this;
        }

        /**
         * CertContentB64.
         */
        public Builder certContentB64(String certContentB64) {
            this.certContentB64 = certContentB64;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * ExpireAt.
         */
        public Builder expireAt(String expireAt) {
            this.expireAt = expireAt;
            return this;
        }

        /**
         * GmtCreated.
         */
        public Builder gmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
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
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * MacAddress.
         */
        public Builder macAddress(String macAddress) {
            this.macAddress = macAddress;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>F2A9EFA7-915F-4572-8299-85A307******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SystemIdentifier.
         */
        public Builder systemIdentifier(String systemIdentifier) {
            this.systemIdentifier = systemIdentifier;
            return this;
        }

        public DescribeActivationCodeDetailsResponseBody build() {
            return new DescribeActivationCodeDetailsResponseBody(this);
        } 

    } 

}
