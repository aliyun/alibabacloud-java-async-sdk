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
 * {@link ListNetworkOptimizationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListNetworkOptimizationsResponseBody</p>
 */
public class ListNetworkOptimizationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Configs")
    private java.util.List<Configs> configs;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private ListNetworkOptimizationsResponseBody(Builder builder) {
        this.configs = builder.configs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNetworkOptimizationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return configs
     */
    public java.util.List<Configs> getConfigs() {
        return this.configs;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private java.util.List<Configs> configs; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Integer totalPage; 

        /**
         * Configs.
         */
        public Builder configs(java.util.List<Configs> configs) {
            this.configs = configs;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TotalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public ListNetworkOptimizationsResponseBody build() {
            return new ListNetworkOptimizationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNetworkOptimizationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListNetworkOptimizationsResponseBody</p>
     */
    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("ConfigType")
        private String configType;

        @com.aliyun.core.annotation.NameInMap("Grpc")
        private String grpc;

        @com.aliyun.core.annotation.NameInMap("Http2Origin")
        private String http2Origin;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private String rule;

        @com.aliyun.core.annotation.NameInMap("RuleEnable")
        private String ruleEnable;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private Integer sequence;

        @com.aliyun.core.annotation.NameInMap("SiteVersion")
        private Integer siteVersion;

        @com.aliyun.core.annotation.NameInMap("SmartRouting")
        private String smartRouting;

        @com.aliyun.core.annotation.NameInMap("UploadMaxFilesize")
        private String uploadMaxFilesize;

        @com.aliyun.core.annotation.NameInMap("Websocket")
        private String websocket;

        private Configs(Builder builder) {
            this.configId = builder.configId;
            this.configType = builder.configType;
            this.grpc = builder.grpc;
            this.http2Origin = builder.http2Origin;
            this.rule = builder.rule;
            this.ruleEnable = builder.ruleEnable;
            this.ruleName = builder.ruleName;
            this.sequence = builder.sequence;
            this.siteVersion = builder.siteVersion;
            this.smartRouting = builder.smartRouting;
            this.uploadMaxFilesize = builder.uploadMaxFilesize;
            this.websocket = builder.websocket;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public Long getConfigId() {
            return this.configId;
        }

        /**
         * @return configType
         */
        public String getConfigType() {
            return this.configType;
        }

        /**
         * @return grpc
         */
        public String getGrpc() {
            return this.grpc;
        }

        /**
         * @return http2Origin
         */
        public String getHttp2Origin() {
            return this.http2Origin;
        }

        /**
         * @return rule
         */
        public String getRule() {
            return this.rule;
        }

        /**
         * @return ruleEnable
         */
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return sequence
         */
        public Integer getSequence() {
            return this.sequence;
        }

        /**
         * @return siteVersion
         */
        public Integer getSiteVersion() {
            return this.siteVersion;
        }

        /**
         * @return smartRouting
         */
        public String getSmartRouting() {
            return this.smartRouting;
        }

        /**
         * @return uploadMaxFilesize
         */
        public String getUploadMaxFilesize() {
            return this.uploadMaxFilesize;
        }

        /**
         * @return websocket
         */
        public String getWebsocket() {
            return this.websocket;
        }

        public static final class Builder {
            private Long configId; 
            private String configType; 
            private String grpc; 
            private String http2Origin; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 
            private Integer sequence; 
            private Integer siteVersion; 
            private String smartRouting; 
            private String uploadMaxFilesize; 
            private String websocket; 

            /**
             * ConfigId.
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * ConfigType.
             */
            public Builder configType(String configType) {
                this.configType = configType;
                return this;
            }

            /**
             * Grpc.
             */
            public Builder grpc(String grpc) {
                this.grpc = grpc;
                return this;
            }

            /**
             * Http2Origin.
             */
            public Builder http2Origin(String http2Origin) {
                this.http2Origin = http2Origin;
                return this;
            }

            /**
             * Rule.
             */
            public Builder rule(String rule) {
                this.rule = rule;
                return this;
            }

            /**
             * RuleEnable.
             */
            public Builder ruleEnable(String ruleEnable) {
                this.ruleEnable = ruleEnable;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * Sequence.
             */
            public Builder sequence(Integer sequence) {
                this.sequence = sequence;
                return this;
            }

            /**
             * SiteVersion.
             */
            public Builder siteVersion(Integer siteVersion) {
                this.siteVersion = siteVersion;
                return this;
            }

            /**
             * SmartRouting.
             */
            public Builder smartRouting(String smartRouting) {
                this.smartRouting = smartRouting;
                return this;
            }

            /**
             * UploadMaxFilesize.
             */
            public Builder uploadMaxFilesize(String uploadMaxFilesize) {
                this.uploadMaxFilesize = uploadMaxFilesize;
                return this;
            }

            /**
             * Websocket.
             */
            public Builder websocket(String websocket) {
                this.websocket = websocket;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
}
