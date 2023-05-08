// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCommonOverallConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCommonOverallConfigResponseBody</p>
 */
public class DescribeCommonOverallConfigResponseBody extends TeaModel {
    @NameInMap("OverallConfig")
    private OverallConfig overallConfig;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCommonOverallConfigResponseBody(Builder builder) {
        this.overallConfig = builder.overallConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCommonOverallConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return overallConfig
     */
    public OverallConfig getOverallConfig() {
        return this.overallConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private OverallConfig overallConfig; 
        private String requestId; 

        /**
         * OverallConfig.
         */
        public Builder overallConfig(OverallConfig overallConfig) {
            this.overallConfig = overallConfig;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCommonOverallConfigResponseBody build() {
            return new DescribeCommonOverallConfigResponseBody(this);
        } 

    } 

    public static class OverallConfig extends TeaModel {
        @NameInMap("Config")
        private String config;

        @NameInMap("Type")
        private String type;

        private OverallConfig(Builder builder) {
            this.config = builder.config;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OverallConfig create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String config; 
            private String type; 

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public OverallConfig build() {
                return new OverallConfig(this);
            } 

        } 

    }
}
