// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSafetyCoverResponseBody} extends {@link TeaModel}
 *
 * <p>GetSafetyCoverResponseBody</p>
 */
public class GetSafetyCoverResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSafetyCoverResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSafetyCoverResponseBody create() {
        return builder().build();
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>API return code.</p>
         * 
         * <strong>example:</strong>
         * <p>404</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data query result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Message of the response result.</p>
         * 
         * <strong>example:</strong>
         * <p>system error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>564f8bb9-df3c-42a0-877a-b35d48f66603</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Whether the call was successful:</p>
         * <ul>
         * <li><strong>true</strong>: Call succeeded.</li>
         * <li><strong>false</strong>: Call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSafetyCoverResponseBody build() {
            return new GetSafetyCoverResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSafetyCoverResponseBody} extends {@link TeaModel}
     *
     * <p>GetSafetyCoverResponseBody</p>
     */
    public static class CfwProtection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NoProtectionCount")
        private Long noProtectionCount;

        @com.aliyun.core.annotation.NameInMap("ProtectionCount")
        private Long protectionCount;

        @com.aliyun.core.annotation.NameInMap("ProtectionGrowthRate")
        private String protectionGrowthRate;

        @com.aliyun.core.annotation.NameInMap("ProtectionRate")
        private String protectionRate;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private CfwProtection(Builder builder) {
            this.noProtectionCount = builder.noProtectionCount;
            this.protectionCount = builder.protectionCount;
            this.protectionGrowthRate = builder.protectionGrowthRate;
            this.protectionRate = builder.protectionRate;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CfwProtection create() {
            return builder().build();
        }

        /**
         * @return noProtectionCount
         */
        public Long getNoProtectionCount() {
            return this.noProtectionCount;
        }

        /**
         * @return protectionCount
         */
        public Long getProtectionCount() {
            return this.protectionCount;
        }

        /**
         * @return protectionGrowthRate
         */
        public String getProtectionGrowthRate() {
            return this.protectionGrowthRate;
        }

        /**
         * @return protectionRate
         */
        public String getProtectionRate() {
            return this.protectionRate;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long noProtectionCount; 
            private Long protectionCount; 
            private String protectionGrowthRate; 
            private String protectionRate; 
            private Long totalCount; 

            /**
             * <p>Number of unprotected items.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder noProtectionCount(Long noProtectionCount) {
                this.noProtectionCount = noProtectionCount;
                return this;
            }

            /**
             * <p>Number of protected items.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder protectionCount(Long protectionCount) {
                this.protectionCount = protectionCount;
                return this;
            }

            /**
             * <p>Year-over-year protection rate.</p>
             * 
             * <strong>example:</strong>
             * <p>35.00</p>
             */
            public Builder protectionGrowthRate(String protectionGrowthRate) {
                this.protectionGrowthRate = protectionGrowthRate;
                return this;
            }

            /**
             * <p>Protection rate.</p>
             * 
             * <strong>example:</strong>
             * <p>50.00</p>
             */
            public Builder protectionRate(String protectionRate) {
                this.protectionRate = protectionRate;
                return this;
            }

            /**
             * <p>Total quantity.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public CfwProtection build() {
                return new CfwProtection(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSafetyCoverResponseBody} extends {@link TeaModel}
     *
     * <p>GetSafetyCoverResponseBody</p>
     */
    public static class EcsProtection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NoProtectionCount")
        private Long noProtectionCount;

        @com.aliyun.core.annotation.NameInMap("ProtectionCount")
        private Long protectionCount;

        @com.aliyun.core.annotation.NameInMap("ProtectionGrowthRate")
        private String protectionGrowthRate;

        @com.aliyun.core.annotation.NameInMap("ProtectionRate")
        private String protectionRate;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private EcsProtection(Builder builder) {
            this.noProtectionCount = builder.noProtectionCount;
            this.protectionCount = builder.protectionCount;
            this.protectionGrowthRate = builder.protectionGrowthRate;
            this.protectionRate = builder.protectionRate;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsProtection create() {
            return builder().build();
        }

        /**
         * @return noProtectionCount
         */
        public Long getNoProtectionCount() {
            return this.noProtectionCount;
        }

        /**
         * @return protectionCount
         */
        public Long getProtectionCount() {
            return this.protectionCount;
        }

        /**
         * @return protectionGrowthRate
         */
        public String getProtectionGrowthRate() {
            return this.protectionGrowthRate;
        }

        /**
         * @return protectionRate
         */
        public String getProtectionRate() {
            return this.protectionRate;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long noProtectionCount; 
            private Long protectionCount; 
            private String protectionGrowthRate; 
            private String protectionRate; 
            private Long totalCount; 

            /**
             * <p>Number of unprotected items.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder noProtectionCount(Long noProtectionCount) {
                this.noProtectionCount = noProtectionCount;
                return this;
            }

            /**
             * <p>Number of protected items.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder protectionCount(Long protectionCount) {
                this.protectionCount = protectionCount;
                return this;
            }

            /**
             * <p>Year-over-year growth in protection rate.</p>
             * 
             * <strong>example:</strong>
             * <p>35.00</p>
             */
            public Builder protectionGrowthRate(String protectionGrowthRate) {
                this.protectionGrowthRate = protectionGrowthRate;
                return this;
            }

            /**
             * <p>Protection rate.</p>
             * 
             * <strong>example:</strong>
             * <p>50.00</p>
             */
            public Builder protectionRate(String protectionRate) {
                this.protectionRate = protectionRate;
                return this;
            }

            /**
             * <p>Total number of items.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public EcsProtection build() {
                return new EcsProtection(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSafetyCoverResponseBody} extends {@link TeaModel}
     *
     * <p>GetSafetyCoverResponseBody</p>
     */
    public static class WafProtection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NoProtectionCount")
        private Long noProtectionCount;

        @com.aliyun.core.annotation.NameInMap("ProtectionCount")
        private Long protectionCount;

        @com.aliyun.core.annotation.NameInMap("ProtectionGrowthRate")
        private String protectionGrowthRate;

        @com.aliyun.core.annotation.NameInMap("ProtectionRate")
        private String protectionRate;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private WafProtection(Builder builder) {
            this.noProtectionCount = builder.noProtectionCount;
            this.protectionCount = builder.protectionCount;
            this.protectionGrowthRate = builder.protectionGrowthRate;
            this.protectionRate = builder.protectionRate;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WafProtection create() {
            return builder().build();
        }

        /**
         * @return noProtectionCount
         */
        public Long getNoProtectionCount() {
            return this.noProtectionCount;
        }

        /**
         * @return protectionCount
         */
        public Long getProtectionCount() {
            return this.protectionCount;
        }

        /**
         * @return protectionGrowthRate
         */
        public String getProtectionGrowthRate() {
            return this.protectionGrowthRate;
        }

        /**
         * @return protectionRate
         */
        public String getProtectionRate() {
            return this.protectionRate;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long noProtectionCount; 
            private Long protectionCount; 
            private String protectionGrowthRate; 
            private String protectionRate; 
            private Long totalCount; 

            /**
             * <p>Number of unprotected items.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder noProtectionCount(Long noProtectionCount) {
                this.noProtectionCount = noProtectionCount;
                return this;
            }

            /**
             * <p>Number of protected items.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder protectionCount(Long protectionCount) {
                this.protectionCount = protectionCount;
                return this;
            }

            /**
             * <p>Year-over-year growth in protection rate.</p>
             * 
             * <strong>example:</strong>
             * <p>35.00</p>
             */
            public Builder protectionGrowthRate(String protectionGrowthRate) {
                this.protectionGrowthRate = protectionGrowthRate;
                return this;
            }

            /**
             * <p>Protection rate.</p>
             * 
             * <strong>example:</strong>
             * <p>50.00</p>
             */
            public Builder protectionRate(String protectionRate) {
                this.protectionRate = protectionRate;
                return this;
            }

            /**
             * <p>Total number of items.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public WafProtection build() {
                return new WafProtection(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSafetyCoverResponseBody} extends {@link TeaModel}
     *
     * <p>GetSafetyCoverResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CfwProtection")
        private CfwProtection cfwProtection;

        @com.aliyun.core.annotation.NameInMap("EcsProtection")
        private EcsProtection ecsProtection;

        @com.aliyun.core.annotation.NameInMap("WafProtection")
        private WafProtection wafProtection;

        private Data(Builder builder) {
            this.cfwProtection = builder.cfwProtection;
            this.ecsProtection = builder.ecsProtection;
            this.wafProtection = builder.wafProtection;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cfwProtection
         */
        public CfwProtection getCfwProtection() {
            return this.cfwProtection;
        }

        /**
         * @return ecsProtection
         */
        public EcsProtection getEcsProtection() {
            return this.ecsProtection;
        }

        /**
         * @return wafProtection
         */
        public WafProtection getWafProtection() {
            return this.wafProtection;
        }

        public static final class Builder {
            private CfwProtection cfwProtection; 
            private EcsProtection ecsProtection; 
            private WafProtection wafProtection; 

            /**
             * <p>CFW protection coverage.</p>
             */
            public Builder cfwProtection(CfwProtection cfwProtection) {
                this.cfwProtection = cfwProtection;
                return this;
            }

            /**
             * <p>ECS protection coverage.</p>
             */
            public Builder ecsProtection(EcsProtection ecsProtection) {
                this.ecsProtection = ecsProtection;
                return this;
            }

            /**
             * <p>WAF protection coverage.</p>
             */
            public Builder wafProtection(WafProtection wafProtection) {
                this.wafProtection = wafProtection;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
