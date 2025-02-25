// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link DomainInfo} extends {@link TeaModel}
 *
 * <p>DomainInfo</p>
 */
public class DomainInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("certIdentifier")
    private String certIdentifier;

    @com.aliyun.core.annotation.NameInMap("createFrom")
    private String createFrom;

    @com.aliyun.core.annotation.NameInMap("createTimestamp")
    private Long createTimestamp;

    @com.aliyun.core.annotation.NameInMap("domainId")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("forceHttps")
    private Boolean forceHttps;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("protocol")
    private String protocol;

    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("updateTimestamp")
    private Long updateTimestamp;

    private DomainInfo(Builder builder) {
        this.certIdentifier = builder.certIdentifier;
        this.createFrom = builder.createFrom;
        this.createTimestamp = builder.createTimestamp;
        this.domainId = builder.domainId;
        this.forceHttps = builder.forceHttps;
        this.name = builder.name;
        this.protocol = builder.protocol;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.updateTimestamp = builder.updateTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DomainInfo create() {
        return builder().build();
    }

    /**
     * @return certIdentifier
     */
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    /**
     * @return createFrom
     */
    public String getCreateFrom() {
        return this.createFrom;
    }

    /**
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return forceHttps
     */
    public Boolean getForceHttps() {
        return this.forceHttps;
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

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updateTimestamp
     */
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static final class Builder {
        private String certIdentifier; 
        private String createFrom; 
        private Long createTimestamp; 
        private String domainId; 
        private Boolean forceHttps; 
        private String name; 
        private String protocol; 
        private String resourceGroupId; 
        private String status; 
        private Long updateTimestamp; 

        /**
         * certIdentifier.
         */
        public Builder certIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * createFrom.
         */
        public Builder createFrom(String createFrom) {
            this.createFrom = createFrom;
            return this;
        }

        /**
         * createTimestamp.
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * domainId.
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * forceHttps.
         */
        public Builder forceHttps(Boolean forceHttps) {
            this.forceHttps = forceHttps;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * protocol.
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * updateTimestamp.
         */
        public Builder updateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        public DomainInfo build() {
            return new DomainInfo(this);
        } 

    } 

}
