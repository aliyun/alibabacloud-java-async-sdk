// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVulTargetConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVulTargetConfigResponseBody</p>
 */
public class DescribeVulTargetConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TargetConfigs")
    private java.util.List < TargetConfigs> targetConfigs;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeVulTargetConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.targetConfigs = builder.targetConfigs;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulTargetConfigResponseBody create() {
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9FBC6E47-7508-58C9-9E76-528E118CB1CC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of the configurations.</p>
         */
        public Builder targetConfigs(java.util.List < TargetConfigs> targetConfigs) {
            this.targetConfigs = targetConfigs;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeVulTargetConfigResponseBody build() {
            return new DescribeVulTargetConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVulTargetConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVulTargetConfigResponseBody</p>
     */
    public static class TargetConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("OverAllConfig")
        private String overAllConfig;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>Indicates whether the vulnerability scan feature is enabled for the server.</p>
             * <ul>
             * <li><strong>off</strong>: disabled</li>
             * <li><strong>on</strong>: enabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>Indicates whether the vulnerability scan feature is enabled for all servers. Valid values:</p>
             * <ul>
             * <li><strong>off</strong>: disabled</li>
             * <li><strong>on</strong>: enabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder overAllConfig(String overAllConfig) {
                this.overAllConfig = overAllConfig;
                return this;
            }

            /**
             * <p>The type of the vulnerability. Valid values:</p>
             * <ul>
             * <li><strong>cve</strong>: Linux software vulnerability</li>
             * <li><strong>sys</strong>: Windows system vulnerability</li>
             * <li><strong>cms</strong>: Web-CMS vulnerability</li>
             * <li><strong>emg</strong>: urgent vulnerability</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cve</p>
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
