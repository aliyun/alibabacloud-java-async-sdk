// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateActivationCodeResponseBody} extends {@link TeaModel}
 *
 * <p>CreateActivationCodeResponseBody</p>
 */
public class CreateActivationCodeResponseBody extends TeaModel {
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

    private CreateActivationCodeResponseBody(Builder builder) {
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

    public static CreateActivationCodeResponseBody create() {
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
         * <p>The activation code ID.</p>
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
         * <p>4CE6DF97-AEA4-484F-906F-C407EE******</p>
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

        public CreateActivationCodeResponseBody build() {
            return new CreateActivationCodeResponseBody(this);
        } 

    } 

}
