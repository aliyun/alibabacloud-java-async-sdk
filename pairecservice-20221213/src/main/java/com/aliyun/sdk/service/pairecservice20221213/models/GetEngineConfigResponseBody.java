// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEngineConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetEngineConfigResponseBody</p>
 */
public class GetEngineConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigValue")
    private String configValue;

    @com.aliyun.core.annotation.NameInMap("Environment")
    private String environment;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("GmtReleasedTime")
    private String gmtReleasedTime;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private GetEngineConfigResponseBody(Builder builder) {
        this.configValue = builder.configValue;
        this.environment = builder.environment;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.gmtReleasedTime = builder.gmtReleasedTime;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEngineConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return configValue
     */
    public String getConfigValue() {
        return this.configValue;
    }

    /**
     * @return environment
     */
    public String getEnvironment() {
        return this.environment;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return gmtReleasedTime
     */
    public String getGmtReleasedTime() {
        return this.gmtReleasedTime;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String configValue; 
        private String environment; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String gmtReleasedTime; 
        private String name; 
        private String requestId; 
        private String status; 

        /**
         * ConfigValue.
         */
        public Builder configValue(String configValue) {
            this.configValue = configValue;
            return this;
        }

        /**
         * Environment.
         */
        public Builder environment(String environment) {
            this.environment = environment;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * GmtReleasedTime.
         */
        public Builder gmtReleasedTime(String gmtReleasedTime) {
            this.gmtReleasedTime = gmtReleasedTime;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetEngineConfigResponseBody build() {
            return new GetEngineConfigResponseBody(this);
        } 

    } 

}
