// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetKeylessServerResponseBody} extends {@link TeaModel}
 *
 * <p>GetKeylessServerResponseBody</p>
 */
public class GetKeylessServerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CaCertificate")
    private String caCertificate;

    @com.aliyun.core.annotation.NameInMap("ClientCertificate")
    private String clientCertificate;

    @com.aliyun.core.annotation.NameInMap("ClientPrivateKey")
    private String clientPrivateKey;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Host")
    private String host;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Port")
    private Long port;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    @com.aliyun.core.annotation.NameInMap("SiteName")
    private String siteName;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("Verify")
    private Boolean verify;

    private GetKeylessServerResponseBody(Builder builder) {
        this.caCertificate = builder.caCertificate;
        this.clientCertificate = builder.clientCertificate;
        this.clientPrivateKey = builder.clientPrivateKey;
        this.createTime = builder.createTime;
        this.host = builder.host;
        this.id = builder.id;
        this.name = builder.name;
        this.port = builder.port;
        this.requestId = builder.requestId;
        this.siteId = builder.siteId;
        this.siteName = builder.siteName;
        this.updateTime = builder.updateTime;
        this.verify = builder.verify;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKeylessServerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caCertificate
     */
    public String getCaCertificate() {
        return this.caCertificate;
    }

    /**
     * @return clientCertificate
     */
    public String getClientCertificate() {
        return this.clientCertificate;
    }

    /**
     * @return clientPrivateKey
     */
    public String getClientPrivateKey() {
        return this.clientPrivateKey;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return port
     */
    public Long getPort() {
        return this.port;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return siteName
     */
    public String getSiteName() {
        return this.siteName;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return verify
     */
    public Boolean getVerify() {
        return this.verify;
    }

    public static final class Builder {
        private String caCertificate; 
        private String clientCertificate; 
        private String clientPrivateKey; 
        private String createTime; 
        private String host; 
        private String id; 
        private String name; 
        private Long port; 
        private String requestId; 
        private Long siteId; 
        private String siteName; 
        private String updateTime; 
        private Boolean verify; 

        private Builder() {
        } 

        private Builder(GetKeylessServerResponseBody model) {
            this.caCertificate = model.caCertificate;
            this.clientCertificate = model.clientCertificate;
            this.clientPrivateKey = model.clientPrivateKey;
            this.createTime = model.createTime;
            this.host = model.host;
            this.id = model.id;
            this.name = model.name;
            this.port = model.port;
            this.requestId = model.requestId;
            this.siteId = model.siteId;
            this.siteName = model.siteName;
            this.updateTime = model.updateTime;
            this.verify = model.verify;
        } 

        /**
         * CaCertificate.
         */
        public Builder caCertificate(String caCertificate) {
            this.caCertificate = caCertificate;
            return this;
        }

        /**
         * ClientCertificate.
         */
        public Builder clientCertificate(String clientCertificate) {
            this.clientCertificate = clientCertificate;
            return this;
        }

        /**
         * ClientPrivateKey.
         */
        public Builder clientPrivateKey(String clientPrivateKey) {
            this.clientPrivateKey = clientPrivateKey;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Host.
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * <p>Keyless server ID。</p>
         * 
         * <strong>example:</strong>
         * <p>baba39055622c008b90285a8838e****</p>
         */
        public Builder id(String id) {
            this.id = id;
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
         * Port.
         */
        public Builder port(Long port) {
            this.port = port;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SiteId.
         */
        public Builder siteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }

        /**
         * SiteName.
         */
        public Builder siteName(String siteName) {
            this.siteName = siteName;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * Verify.
         */
        public Builder verify(Boolean verify) {
            this.verify = verify;
            return this;
        }

        public GetKeylessServerResponseBody build() {
            return new GetKeylessServerResponseBody(this);
        } 

    } 

}
