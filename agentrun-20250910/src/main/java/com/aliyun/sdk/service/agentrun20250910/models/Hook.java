// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link Hook} extends {@link TeaModel}
 *
 * <p>Hook</p>
 */
public class Hook extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiVersion")
    private String apiVersion;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("event")
    @com.aliyun.core.annotation.Validation(required = true)
    private String event;

    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("timeout")
    private Integer timeout;

    @com.aliyun.core.annotation.NameInMap("url")
    @com.aliyun.core.annotation.Validation(required = true)
    private String url;

    private Hook(Builder builder) {
        this.apiVersion = builder.apiVersion;
        this.description = builder.description;
        this.enabled = builder.enabled;
        this.event = builder.event;
        this.headers = builder.headers;
        this.timeout = builder.timeout;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Hook create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiVersion
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return event
     */
    public String getEvent() {
        return this.event;
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String apiVersion; 
        private String description; 
        private Boolean enabled; 
        private String event; 
        private java.util.Map<String, String> headers; 
        private Integer timeout; 
        private String url; 

        private Builder() {
        } 

        private Builder(Hook model) {
            this.apiVersion = model.apiVersion;
            this.description = model.description;
            this.enabled = model.enabled;
            this.event = model.event;
            this.headers = model.headers;
            this.timeout = model.timeout;
            this.url = model.url;
        } 

        /**
         * apiVersion.
         */
        public Builder apiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder event(String event) {
            this.event = event;
            return this;
        }

        /**
         * headers.
         */
        public Builder headers(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * timeout.
         */
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Hook build() {
            return new Hook(this);
        } 

    } 

}
