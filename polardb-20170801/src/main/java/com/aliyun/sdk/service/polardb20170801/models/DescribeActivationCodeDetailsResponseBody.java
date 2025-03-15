// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeActivationCodeDetailsResponseBody model) {
            this.activateAt = model.activateAt;
            this.certContentB64 = model.certContentB64;
            this.description = model.description;
            this.expireAt = model.expireAt;
            this.gmtCreated = model.gmtCreated;
            this.gmtModified = model.gmtModified;
            this.id = model.id;
            this.macAddress = model.macAddress;
            this.name = model.name;
            this.requestId = model.requestId;
            this.systemIdentifier = model.systemIdentifier;
        } 

        /**
         * <p>The time when the activation code takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-16 16:46:20</p>
         */
        public Builder activateAt(String activateAt) {
            this.activateAt = activateAt;
            return this;
        }

        /**
         * <p>The activation code in the base64 format. The activation code is decoded and stored into a file named license.lic. PolarDB can access and read the license.lic file upon startup to validate the license or perform related operations.</p>
         * 
         * <strong>example:</strong>
         * <p>AAEAA******AAA=</p>
         */
        public Builder certContentB64(String certContentB64) {
            this.certContentB64 = certContentB64;
            return this;
        }

        /**
         * <p>The description of the activation code.</p>
         * 
         * <strong>example:</strong>
         * <p>testCode</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The time when the activation code expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2054-10-09 16:46:20</p>
         */
        public Builder expireAt(String expireAt) {
            this.expireAt = expireAt;
            return this;
        }

        /**
         * <p>The time when the activation code was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-16 16:46:20</p>
         */
        public Builder gmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }

        /**
         * <p>The time when the activation code was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-16 16:46:20</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The ID of the activation code.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The MAC address.</p>
         * 
         * <strong>example:</strong>
         * <p>12:34:56:78:98:00</p>
         */
        public Builder macAddress(String macAddress) {
            this.macAddress = macAddress;
            return this;
        }

        /**
         * <p>The name of the activation code.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F2A9EFA7-915F-4572-8299-85A307******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The system identifier of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456</p>
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
