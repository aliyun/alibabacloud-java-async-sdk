// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetResourceOverviewResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceOverviewResponseBody</p>
 */
public class GetResourceOverviewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetResourceOverviewResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceOverviewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetResourceOverviewResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The resource information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD19A442-93C5-5C97-AFA0-B9C57EBD781B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetResourceOverviewResponseBody build() {
            return new GetResourceOverviewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetResourceOverviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceOverviewResponseBody</p>
     */
    public static class Api extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("publishedCount")
        private Long publishedCount;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Long totalCount;

        private Api(Builder builder) {
            this.publishedCount = builder.publishedCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Api create() {
            return builder().build();
        }

        /**
         * @return publishedCount
         */
        public Long getPublishedCount() {
            return this.publishedCount;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long publishedCount; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Api model) {
                this.publishedCount = model.publishedCount;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>Number of published APIs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder publishedCount(Long publishedCount) {
                this.publishedCount = publishedCount;
                return this;
            }

            /**
             * <p>Number of APIs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Api build() {
                return new Api(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourceOverviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceOverviewResponseBody</p>
     */
    public static class Gateway extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("runningCount")
        private Long runningCount;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Long totalCount;

        private Gateway(Builder builder) {
            this.runningCount = builder.runningCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Gateway create() {
            return builder().build();
        }

        /**
         * @return runningCount
         */
        public Long getRunningCount() {
            return this.runningCount;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long runningCount; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Gateway model) {
                this.runningCount = model.runningCount;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>Number of running gateways.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder runningCount(Long runningCount) {
                this.runningCount = runningCount;
                return this;
            }

            /**
             * <p>Number of gateway instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Gateway build() {
                return new Gateway(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourceOverviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceOverviewResponseBody</p>
     */
    public static class RiskDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("gatewayName")
        private String gatewayName;

        @com.aliyun.core.annotation.NameInMap("riskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("riskNames")
        private java.util.List<String> riskNames;

        @com.aliyun.core.annotation.NameInMap("score")
        private String score;

        private RiskDetails(Builder builder) {
            this.gatewayId = builder.gatewayId;
            this.gatewayName = builder.gatewayName;
            this.riskLevel = builder.riskLevel;
            this.riskNames = builder.riskNames;
            this.score = builder.score;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskDetails create() {
            return builder().build();
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return gatewayName
         */
        public String getGatewayName() {
            return this.gatewayName;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return riskNames
         */
        public java.util.List<String> getRiskNames() {
            return this.riskNames;
        }

        /**
         * @return score
         */
        public String getScore() {
            return this.score;
        }

        public static final class Builder {
            private String gatewayId; 
            private String gatewayName; 
            private String riskLevel; 
            private java.util.List<String> riskNames; 
            private String score; 

            private Builder() {
            } 

            private Builder(RiskDetails model) {
                this.gatewayId = model.gatewayId;
                this.gatewayName = model.gatewayName;
                this.riskLevel = model.riskLevel;
                this.riskNames = model.riskNames;
                this.score = model.score;
            } 

            /**
             * <p>The gateway ID.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-xxxxxx</p>
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The gateway name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-gateway</p>
             */
            public Builder gatewayName(String gatewayName) {
                this.gatewayName = gatewayName;
                return this;
            }

            /**
             * <p>The risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>LOW</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The risk name list.</p>
             */
            public Builder riskNames(java.util.List<String> riskNames) {
                this.riskNames = riskNames;
                return this;
            }

            /**
             * <p>The risk score.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            public RiskDetails build() {
                return new RiskDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourceOverviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceOverviewResponseBody</p>
     */
    public static class RiskOverview extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("count")
        private String count;

        @com.aliyun.core.annotation.NameInMap("riskDetails")
        private java.util.List<RiskDetails> riskDetails;

        @com.aliyun.core.annotation.NameInMap("riskLevel")
        private String riskLevel;

        private RiskOverview(Builder builder) {
            this.count = builder.count;
            this.riskDetails = builder.riskDetails;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskOverview create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public String getCount() {
            return this.count;
        }

        /**
         * @return riskDetails
         */
        public java.util.List<RiskDetails> getRiskDetails() {
            return this.riskDetails;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private String count; 
            private java.util.List<RiskDetails> riskDetails; 
            private String riskLevel; 

            private Builder() {
            } 

            private Builder(RiskOverview model) {
                this.count = model.count;
                this.riskDetails = model.riskDetails;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * <p>The number of instances at a risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The risk details list.</p>
             */
            public Builder riskDetails(java.util.List<RiskDetails> riskDetails) {
                this.riskDetails = riskDetails;
                return this;
            }

            /**
             * <p>The risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>LOW</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public RiskOverview build() {
                return new RiskOverview(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourceOverviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceOverviewResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("api")
        private Api api;

        @com.aliyun.core.annotation.NameInMap("gateway")
        private Gateway gateway;

        @com.aliyun.core.annotation.NameInMap("riskOverview")
        private java.util.List<RiskOverview> riskOverview;

        private Data(Builder builder) {
            this.api = builder.api;
            this.gateway = builder.gateway;
            this.riskOverview = builder.riskOverview;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return api
         */
        public Api getApi() {
            return this.api;
        }

        /**
         * @return gateway
         */
        public Gateway getGateway() {
            return this.gateway;
        }

        /**
         * @return riskOverview
         */
        public java.util.List<RiskOverview> getRiskOverview() {
            return this.riskOverview;
        }

        public static final class Builder {
            private Api api; 
            private Gateway gateway; 
            private java.util.List<RiskOverview> riskOverview; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.api = model.api;
                this.gateway = model.gateway;
                this.riskOverview = model.riskOverview;
            } 

            /**
             * <p>API information.</p>
             */
            public Builder api(Api api) {
                this.api = api;
                return this;
            }

            /**
             * <p>Gateway information.</p>
             */
            public Builder gateway(Gateway gateway) {
                this.gateway = gateway;
                return this;
            }

            /**
             * <p>The risk overview.</p>
             */
            public Builder riskOverview(java.util.List<RiskOverview> riskOverview) {
                this.riskOverview = riskOverview;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
