// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wss20211221.models;

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
 * {@link DescribeAICallDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAICallDetailsResponseBody</p>
 */
public class DescribeAICallDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CallDetails")
    private java.util.List<CallDetails> callDetails;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("QueryEndTime")
    private String queryEndTime;

    @com.aliyun.core.annotation.NameInMap("QueryStartTime")
    private String queryStartTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeAICallDetailsResponseBody(Builder builder) {
        this.callDetails = builder.callDetails;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryEndTime = builder.queryEndTime;
        this.queryStartTime = builder.queryStartTime;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAICallDetailsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callDetails
     */
    public java.util.List<CallDetails> getCallDetails() {
        return this.callDetails;
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
     * @return queryEndTime
     */
    public String getQueryEndTime() {
        return this.queryEndTime;
    }

    /**
     * @return queryStartTime
     */
    public String getQueryStartTime() {
        return this.queryStartTime;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<CallDetails> callDetails; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String queryEndTime; 
        private String queryStartTime; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeAICallDetailsResponseBody model) {
            this.callDetails = model.callDetails;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.queryEndTime = model.queryEndTime;
            this.queryStartTime = model.queryStartTime;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>调用明细列表。</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder callDetails(java.util.List<CallDetails> callDetails) {
            this.callDetails = callDetails;
            return this;
        }

        /**
         * <p>当前页码。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>当前页大小。</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>实际查询终点。翻页时应复用此值。</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-06T00:00:00+08:00</p>
         */
        public Builder queryEndTime(String queryEndTime) {
            this.queryEndTime = queryEndTime;
            return this;
        }

        /**
         * <p>实际查询起点。翻页时应复用此值。</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-05T00:00:00+08:00</p>
         */
        public Builder queryStartTime(String queryStartTime) {
            this.queryStartTime = queryStartTime;
            return this;
        }

        /**
         * <p>POP 请求 ID。</p>
         * 
         * <strong>example:</strong>
         * <p>00000000-0000-4000-8000-000000000001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>满足条件的总记录数。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAICallDetailsResponseBody build() {
            return new DescribeAICallDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAICallDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAICallDetailsResponseBody</p>
     */
    public static class PointsBreakdown extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExplicitCacheCreation")
        private String explicitCacheCreation;

        @com.aliyun.core.annotation.NameInMap("ExplicitCacheHit")
        private String explicitCacheHit;

        @com.aliyun.core.annotation.NameInMap("ImplicitCacheHit")
        private String implicitCacheHit;

        @com.aliyun.core.annotation.NameInMap("NormalInput")
        private String normalInput;

        @com.aliyun.core.annotation.NameInMap("Output")
        private String output;

        private PointsBreakdown(Builder builder) {
            this.explicitCacheCreation = builder.explicitCacheCreation;
            this.explicitCacheHit = builder.explicitCacheHit;
            this.implicitCacheHit = builder.implicitCacheHit;
            this.normalInput = builder.normalInput;
            this.output = builder.output;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PointsBreakdown create() {
            return builder().build();
        }

        /**
         * @return explicitCacheCreation
         */
        public String getExplicitCacheCreation() {
            return this.explicitCacheCreation;
        }

        /**
         * @return explicitCacheHit
         */
        public String getExplicitCacheHit() {
            return this.explicitCacheHit;
        }

        /**
         * @return implicitCacheHit
         */
        public String getImplicitCacheHit() {
            return this.implicitCacheHit;
        }

        /**
         * @return normalInput
         */
        public String getNormalInput() {
            return this.normalInput;
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        public static final class Builder {
            private String explicitCacheCreation; 
            private String explicitCacheHit; 
            private String implicitCacheHit; 
            private String normalInput; 
            private String output; 

            private Builder() {
            } 

            private Builder(PointsBreakdown model) {
                this.explicitCacheCreation = model.explicitCacheCreation;
                this.explicitCacheHit = model.explicitCacheHit;
                this.implicitCacheHit = model.implicitCacheHit;
                this.normalInput = model.normalInput;
                this.output = model.output;
            } 

            /**
             * <p>显式缓存创建积分，单位为积分，使用十进制字符串表示；真实零值为 0。</p>
             * 
             * <strong>example:</strong>
             * <p>0.15</p>
             */
            public Builder explicitCacheCreation(String explicitCacheCreation) {
                this.explicitCacheCreation = explicitCacheCreation;
                return this;
            }

            /**
             * <p>显式缓存命中积分，单位为积分，使用十进制字符串表示；真实零值为 0。</p>
             * 
             * <strong>example:</strong>
             * <p>0.01896</p>
             */
            public Builder explicitCacheHit(String explicitCacheHit) {
                this.explicitCacheHit = explicitCacheHit;
                return this;
            }

            /**
             * <p>隐式缓存命中积分，单位为积分，使用十进制字符串表示；真实零值为 0。</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder implicitCacheHit(String implicitCacheHit) {
                this.implicitCacheHit = implicitCacheHit;
                return this;
            }

            /**
             * <p>普通输入积分，单位为积分，使用十进制字符串表示；真实零值为 0。</p>
             * 
             * <strong>example:</strong>
             * <p>0.02</p>
             */
            public Builder normalInput(String normalInput) {
                this.normalInput = normalInput;
                return this;
            }

            /**
             * <p>输出积分，单位为积分，使用十进制字符串表示；真实零值为 0。</p>
             * 
             * <strong>example:</strong>
             * <p>0.1</p>
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            public PointsBreakdown build() {
                return new PointsBreakdown(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAICallDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAICallDetailsResponseBody</p>
     */
    public static class CallDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentType")
        private String agentType;

        @com.aliyun.core.annotation.NameInMap("CallStatus")
        private String callStatus;

        @com.aliyun.core.annotation.NameInMap("CallTime")
        private String callTime;

        @com.aliyun.core.annotation.NameInMap("FirstTokenLatencyMs")
        private Long firstTokenLatencyMs;

        @com.aliyun.core.annotation.NameInMap("GatewayRegion")
        private String gatewayRegion;

        @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
        private Integer httpStatusCode;

        @com.aliyun.core.annotation.NameInMap("InputToken")
        private Long inputToken;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("Points")
        private String points;

        @com.aliyun.core.annotation.NameInMap("PointsBreakdown")
        private PointsBreakdown pointsBreakdown;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("WyId")
        private String wyId;

        private CallDetails(Builder builder) {
            this.agentType = builder.agentType;
            this.callStatus = builder.callStatus;
            this.callTime = builder.callTime;
            this.firstTokenLatencyMs = builder.firstTokenLatencyMs;
            this.gatewayRegion = builder.gatewayRegion;
            this.httpStatusCode = builder.httpStatusCode;
            this.inputToken = builder.inputToken;
            this.instanceId = builder.instanceId;
            this.model = builder.model;
            this.points = builder.points;
            this.pointsBreakdown = builder.pointsBreakdown;
            this.requestId = builder.requestId;
            this.wyId = builder.wyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallDetails create() {
            return builder().build();
        }

        /**
         * @return agentType
         */
        public String getAgentType() {
            return this.agentType;
        }

        /**
         * @return callStatus
         */
        public String getCallStatus() {
            return this.callStatus;
        }

        /**
         * @return callTime
         */
        public String getCallTime() {
            return this.callTime;
        }

        /**
         * @return firstTokenLatencyMs
         */
        public Long getFirstTokenLatencyMs() {
            return this.firstTokenLatencyMs;
        }

        /**
         * @return gatewayRegion
         */
        public String getGatewayRegion() {
            return this.gatewayRegion;
        }

        /**
         * @return httpStatusCode
         */
        public Integer getHttpStatusCode() {
            return this.httpStatusCode;
        }

        /**
         * @return inputToken
         */
        public Long getInputToken() {
            return this.inputToken;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return points
         */
        public String getPoints() {
            return this.points;
        }

        /**
         * @return pointsBreakdown
         */
        public PointsBreakdown getPointsBreakdown() {
            return this.pointsBreakdown;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return wyId
         */
        public String getWyId() {
            return this.wyId;
        }

        public static final class Builder {
            private String agentType; 
            private String callStatus; 
            private String callTime; 
            private Long firstTokenLatencyMs; 
            private String gatewayRegion; 
            private Integer httpStatusCode; 
            private Long inputToken; 
            private String instanceId; 
            private String model; 
            private String points; 
            private PointsBreakdown pointsBreakdown; 
            private String requestId; 
            private String wyId; 

            private Builder() {
            } 

            private Builder(CallDetails model) {
                this.agentType = model.agentType;
                this.callStatus = model.callStatus;
                this.callTime = model.callTime;
                this.firstTokenLatencyMs = model.firstTokenLatencyMs;
                this.gatewayRegion = model.gatewayRegion;
                this.httpStatusCode = model.httpStatusCode;
                this.inputToken = model.inputToken;
                this.instanceId = model.instanceId;
                this.model = model.model;
                this.points = model.points;
                this.pointsBreakdown = model.pointsBreakdown;
                this.requestId = model.requestId;
                this.wyId = model.wyId;
            } 

            /**
             * <p>售卖 deduction 记录中的原始 agent_type；未匹配或 ADB 查询失败时不返回。</p>
             * 
             * <strong>example:</strong>
             * <p>AIComputer</p>
             */
            public Builder agentType(String agentType) {
                this.agentType = agentType;
                return this;
            }

            /**
             * <p>调用状态：SUCCESS、RATE_LIMITED、TIMEOUT 或 FAILED。</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder callStatus(String callStatus) {
                this.callStatus = callStatus;
                return this;
            }

            /**
             * <p>日志时间，ISO 8601。</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-05T12:30:00+08:00</p>
             */
            public Builder callTime(String callTime) {
                this.callTime = callTime;
                return this;
            }

            /**
             * <p>首包时延，单位毫秒；失败或无首包数据时为空。</p>
             * 
             * <strong>example:</strong>
             * <p>620</p>
             */
            public Builder firstTokenLatencyMs(Long firstTokenLatencyMs) {
                this.firstTokenLatencyMs = firstTokenLatencyMs;
                return this;
            }

            /**
             * <p>本条调用日志的实际数据地域，取值为 cn-shanghai、cn-hangzhou、cn-hongkong、ap-southeast-1 或 us-east-1；杭州预发返回 cn-hangzhou。</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder gatewayRegion(String gatewayRegion) {
                this.gatewayRegion = gatewayRegion;
                return this;
            }

            /**
             * <p>AI 网关返回的 HTTP 状态码。</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder httpStatusCode(Integer httpStatusCode) {
                this.httpStatusCode = httpStatusCode;
                return this;
            }

            /**
             * <p>原始输入 token 数，前端据此转换上下文规模。</p>
             * 
             * <strong>example:</strong>
             * <p>1200</p>
             */
            public Builder inputToken(Long inputToken) {
                this.inputToken = inputToken;
                return this;
            }

            /**
             * <p>产品实例 ID。</p>
             * 
             * <strong>example:</strong>
             * <p>example-instance-001</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>实际调用模型。</p>
             * 
             * <strong>example:</strong>
             * <p>example-model</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>按请求 ID 和输入输出 token 匹配的实际抵扣积分，十进制字符串；积分查询失败或超时时为空。</p>
             * 
             * <strong>example:</strong>
             * <p>0.28896</p>
             */
            public Builder points(String points) {
                this.points = points;
                return this;
            }

            /**
             * <p>本条调用已匹配抵扣记录的积分构成，与 Points 来自同一条记录。缺少有效明细时不返回此对象；对象存在时完整返回五项积分，五项之和等于 Points，真实零值返回字符串 0。</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;NormalInput&quot;:&quot;0.02&quot;,&quot;Output&quot;:&quot;0.1&quot;,&quot;ImplicitCacheHit&quot;:&quot;0&quot;,&quot;ExplicitCacheCreation&quot;:&quot;0.15&quot;,&quot;ExplicitCacheHit&quot;:&quot;0.01896&quot;}</p>
             */
            public Builder pointsBreakdown(PointsBreakdown pointsBreakdown) {
                this.pointsBreakdown = pointsBreakdown;
                return this;
            }

            /**
             * <p>AI 网关请求 ID，与外层 POP 请求 ID 不同。</p>
             * 
             * <strong>example:</strong>
             * <p>model-call-example-001</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>用户 WyId，用户名由前端组装。</p>
             * 
             * <strong>example:</strong>
             * <p>wy-example-001</p>
             */
            public Builder wyId(String wyId) {
                this.wyId = wyId;
                return this;
            }

            public CallDetails build() {
                return new CallDetails(this);
            } 

        } 

    }
}
