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
 * {@link GetPolarClawConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetPolarClawConfigResponseBody</p>
 */
public class GetPolarClawConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Config")
    private java.util.Map<String, ?> config;

    @com.aliyun.core.annotation.NameInMap("Hash")
    private String hash;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OpenclawVersion")
    private String openclawVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetPolarClawConfigResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.code = builder.code;
        this.config = builder.config;
        this.hash = builder.hash;
        this.message = builder.message;
        this.openclawVersion = builder.openclawVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPolarClawConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return config
     */
    public java.util.Map<String, ?> getConfig() {
        return this.config;
    }

    /**
     * @return hash
     */
    public String getHash() {
        return this.hash;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return openclawVersion
     */
    public String getOpenclawVersion() {
        return this.openclawVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String applicationId; 
        private Integer code; 
        private java.util.Map<String, ?> config; 
        private String hash; 
        private String message; 
        private String openclawVersion; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetPolarClawConfigResponseBody model) {
            this.applicationId = model.applicationId;
            this.code = model.code;
            this.config = model.config;
            this.hash = model.hash;
            this.message = model.message;
            this.openclawVersion = model.openclawVersion;
            this.requestId = model.requestId;
        } 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Config.
         */
        public Builder config(java.util.Map<String, ?> config) {
            this.config = config;
            return this;
        }

        /**
         * Hash.
         */
        public Builder hash(String hash) {
            this.hash = hash;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * OpenclawVersion.
         */
        public Builder openclawVersion(String openclawVersion) {
            this.openclawVersion = openclawVersion;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CD3FA5F3-FAF3-44CA-AFFF-BAF869******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPolarClawConfigResponseBody build() {
            return new GetPolarClawConfigResponseBody(this);
        } 

    } 

}
