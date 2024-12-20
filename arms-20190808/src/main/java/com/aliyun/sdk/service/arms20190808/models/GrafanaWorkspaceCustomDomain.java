// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link GrafanaWorkspaceCustomDomain} extends {@link TeaModel}
 *
 * <p>GrafanaWorkspaceCustomDomain</p>
 */
public class GrafanaWorkspaceCustomDomain extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cert")
    private String cert;

    @com.aliyun.core.annotation.NameInMap("date")
    private Long date;

    @com.aliyun.core.annotation.NameInMap("domain")
    private String domain;

    @com.aliyun.core.annotation.NameInMap("grafanaWorkspaceId")
    private String grafanaWorkspaceId;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("privateZone")
    private String privateZone;

    @com.aliyun.core.annotation.NameInMap("protocol")
    private String protocol;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("uri")
    private String uri;

    private GrafanaWorkspaceCustomDomain(Builder builder) {
        this.cert = builder.cert;
        this.date = builder.date;
        this.domain = builder.domain;
        this.grafanaWorkspaceId = builder.grafanaWorkspaceId;
        this.id = builder.id;
        this.key = builder.key;
        this.privateZone = builder.privateZone;
        this.protocol = builder.protocol;
        this.status = builder.status;
        this.uri = builder.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrafanaWorkspaceCustomDomain create() {
        return builder().build();
    }

    /**
     * @return cert
     */
    public String getCert() {
        return this.cert;
    }

    /**
     * @return date
     */
    public Long getDate() {
        return this.date;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return grafanaWorkspaceId
     */
    public String getGrafanaWorkspaceId() {
        return this.grafanaWorkspaceId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return privateZone
     */
    public String getPrivateZone() {
        return this.privateZone;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    public static final class Builder {
        private String cert; 
        private Long date; 
        private String domain; 
        private String grafanaWorkspaceId; 
        private Long id; 
        private String key; 
        private String privateZone; 
        private String protocol; 
        private String status; 
        private String uri; 

        /**
         * cert.
         */
        public Builder cert(String cert) {
            this.cert = cert;
            return this;
        }

        /**
         * date.
         */
        public Builder date(Long date) {
            this.date = date;
            return this;
        }

        /**
         * domain.
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * grafanaWorkspaceId.
         */
        public Builder grafanaWorkspaceId(String grafanaWorkspaceId) {
            this.grafanaWorkspaceId = grafanaWorkspaceId;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * key.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * privateZone.
         */
        public Builder privateZone(String privateZone) {
            this.privateZone = privateZone;
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
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * uri.
         */
        public Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        public GrafanaWorkspaceCustomDomain build() {
            return new GrafanaWorkspaceCustomDomain(this);
        } 

    } 

}
