// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVulConfigResponseBody</p>
 */
public class DescribeVulConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TargetConfigs")
    private java.util.List < TargetConfigs> targetConfigs;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeVulConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.targetConfigs = builder.targetConfigs;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return targetConfigs
     */
    public java.util.List < TargetConfigs> getTargetConfigs() {
        return this.targetConfigs;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < TargetConfigs> targetConfigs; 
        private Integer totalCount; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TargetConfigs.
         */
        public Builder targetConfigs(java.util.List < TargetConfigs> targetConfigs) {
            this.targetConfigs = targetConfigs;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeVulConfigResponseBody build() {
            return new DescribeVulConfigResponseBody(this);
        } 

    } 

    public static class TargetConfigs extends TeaModel {
        @NameInMap("Config")
        private String config;

        @NameInMap("OverAllConfig")
        private String overAllConfig;

        @NameInMap("Type")
        private String type;

        private TargetConfigs(Builder builder) {
            this.config = builder.config;
            this.overAllConfig = builder.overAllConfig;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetConfigs create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return overAllConfig
         */
        public String getOverAllConfig() {
            return this.overAllConfig;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String config; 
            private String overAllConfig; 
            private String type; 

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * OverAllConfig.
             */
            public Builder overAllConfig(String overAllConfig) {
                this.overAllConfig = overAllConfig;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public TargetConfigs build() {
                return new TargetConfigs(this);
            } 

        } 

    }
}
