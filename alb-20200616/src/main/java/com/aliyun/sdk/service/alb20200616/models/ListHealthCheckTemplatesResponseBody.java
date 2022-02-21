// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHealthCheckTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListHealthCheckTemplatesResponseBody</p>
 */
public class ListHealthCheckTemplatesResponseBody extends TeaModel {
    @NameInMap("HealthCheckTemplates")
    private java.util.List < HealthCheckTemplates> healthCheckTemplates;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListHealthCheckTemplatesResponseBody(Builder builder) {
        this.healthCheckTemplates = builder.healthCheckTemplates;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHealthCheckTemplatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return healthCheckTemplates
     */
    public java.util.List < HealthCheckTemplates> getHealthCheckTemplates() {
        return this.healthCheckTemplates;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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

    public static final class Builder {
        private java.util.List < HealthCheckTemplates> healthCheckTemplates; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * 健康检查模板
         */
        public Builder healthCheckTemplates(java.util.List < HealthCheckTemplates> healthCheckTemplates) {
            this.healthCheckTemplates = healthCheckTemplates;
            return this;
        }

        /**
         * 本次查询返回记录数量
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 分页查询标识
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 总记录数
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListHealthCheckTemplatesResponseBody build() {
            return new ListHealthCheckTemplatesResponseBody(this);
        } 

    } 

    public static class HealthCheckTemplates extends TeaModel {
        @NameInMap("HealthCheckCodes")
        private java.util.List < String > healthCheckCodes;

        @NameInMap("HealthCheckConnectPort")
        private Integer healthCheckConnectPort;

        @NameInMap("HealthCheckHost")
        private String healthCheckHost;

        @NameInMap("HealthCheckHttpVersion")
        private String healthCheckHttpVersion;

        @NameInMap("HealthCheckInterval")
        private Integer healthCheckInterval;

        @NameInMap("HealthCheckMethod")
        private String healthCheckMethod;

        @NameInMap("HealthCheckPath")
        private String healthCheckPath;

        @NameInMap("HealthCheckProtocol")
        private String healthCheckProtocol;

        @NameInMap("HealthCheckTemplateId")
        private String healthCheckTemplateId;

        @NameInMap("HealthCheckTemplateName")
        private String healthCheckTemplateName;

        @NameInMap("HealthCheckTimeout")
        private Integer healthCheckTimeout;

        @NameInMap("HealthyThreshold")
        private Integer healthyThreshold;

        @NameInMap("UnhealthyThreshold")
        private Integer unhealthyThreshold;

        private HealthCheckTemplates(Builder builder) {
            this.healthCheckCodes = builder.healthCheckCodes;
            this.healthCheckConnectPort = builder.healthCheckConnectPort;
            this.healthCheckHost = builder.healthCheckHost;
            this.healthCheckHttpVersion = builder.healthCheckHttpVersion;
            this.healthCheckInterval = builder.healthCheckInterval;
            this.healthCheckMethod = builder.healthCheckMethod;
            this.healthCheckPath = builder.healthCheckPath;
            this.healthCheckProtocol = builder.healthCheckProtocol;
            this.healthCheckTemplateId = builder.healthCheckTemplateId;
            this.healthCheckTemplateName = builder.healthCheckTemplateName;
            this.healthCheckTimeout = builder.healthCheckTimeout;
            this.healthyThreshold = builder.healthyThreshold;
            this.unhealthyThreshold = builder.unhealthyThreshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthCheckTemplates create() {
            return builder().build();
        }

        /**
         * @return healthCheckCodes
         */
        public java.util.List < String > getHealthCheckCodes() {
            return this.healthCheckCodes;
        }

        /**
         * @return healthCheckConnectPort
         */
        public Integer getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        /**
         * @return healthCheckHost
         */
        public String getHealthCheckHost() {
            return this.healthCheckHost;
        }

        /**
         * @return healthCheckHttpVersion
         */
        public String getHealthCheckHttpVersion() {
            return this.healthCheckHttpVersion;
        }

        /**
         * @return healthCheckInterval
         */
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        /**
         * @return healthCheckMethod
         */
        public String getHealthCheckMethod() {
            return this.healthCheckMethod;
        }

        /**
         * @return healthCheckPath
         */
        public String getHealthCheckPath() {
            return this.healthCheckPath;
        }

        /**
         * @return healthCheckProtocol
         */
        public String getHealthCheckProtocol() {
            return this.healthCheckProtocol;
        }

        /**
         * @return healthCheckTemplateId
         */
        public String getHealthCheckTemplateId() {
            return this.healthCheckTemplateId;
        }

        /**
         * @return healthCheckTemplateName
         */
        public String getHealthCheckTemplateName() {
            return this.healthCheckTemplateName;
        }

        /**
         * @return healthCheckTimeout
         */
        public Integer getHealthCheckTimeout() {
            return this.healthCheckTimeout;
        }

        /**
         * @return healthyThreshold
         */
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        /**
         * @return unhealthyThreshold
         */
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public static final class Builder {
            private java.util.List < String > healthCheckCodes; 
            private Integer healthCheckConnectPort; 
            private String healthCheckHost; 
            private String healthCheckHttpVersion; 
            private Integer healthCheckInterval; 
            private String healthCheckMethod; 
            private String healthCheckPath; 
            private String healthCheckProtocol; 
            private String healthCheckTemplateId; 
            private String healthCheckTemplateName; 
            private Integer healthCheckTimeout; 
            private Integer healthyThreshold; 
            private Integer unhealthyThreshold; 

            /**
             * 状态码
             */
            public Builder healthCheckCodes(java.util.List < String > healthCheckCodes) {
                this.healthCheckCodes = healthCheckCodes;
                return this;
            }

            /**
             * 端口
             */
            public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
                this.healthCheckConnectPort = healthCheckConnectPort;
                return this;
            }

            /**
             * 域名
             */
            public Builder healthCheckHost(String healthCheckHost) {
                this.healthCheckHost = healthCheckHost;
                return this;
            }

            /**
             * 版本
             */
            public Builder healthCheckHttpVersion(String healthCheckHttpVersion) {
                this.healthCheckHttpVersion = healthCheckHttpVersion;
                return this;
            }

            /**
             * 间隔时间
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * 方法
             */
            public Builder healthCheckMethod(String healthCheckMethod) {
                this.healthCheckMethod = healthCheckMethod;
                return this;
            }

            /**
             * uri
             */
            public Builder healthCheckPath(String healthCheckPath) {
                this.healthCheckPath = healthCheckPath;
                return this;
            }

            /**
             * 协议
             */
            public Builder healthCheckProtocol(String healthCheckProtocol) {
                this.healthCheckProtocol = healthCheckProtocol;
                return this;
            }

            /**
             * 健康检查模板Id
             */
            public Builder healthCheckTemplateId(String healthCheckTemplateId) {
                this.healthCheckTemplateId = healthCheckTemplateId;
                return this;
            }

            /**
             * 名称
             */
            public Builder healthCheckTemplateName(String healthCheckTemplateName) {
                this.healthCheckTemplateName = healthCheckTemplateName;
                return this;
            }

            /**
             * 超时时间
             */
            public Builder healthCheckTimeout(Integer healthCheckTimeout) {
                this.healthCheckTimeout = healthCheckTimeout;
                return this;
            }

            /**
             * 健康阈值
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * 不健康阈值
             */
            public Builder unhealthyThreshold(Integer unhealthyThreshold) {
                this.unhealthyThreshold = unhealthyThreshold;
                return this;
            }

            public HealthCheckTemplates build() {
                return new HealthCheckTemplates(this);
            } 

        } 

    }
}
