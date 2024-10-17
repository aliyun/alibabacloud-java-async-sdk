// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDataServiceApiTestResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataServiceApiTestResponseBody</p>
 */
public class GetDataServiceApiTestResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDataServiceApiTestResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataServiceApiTestResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDataServiceApiTestResponseBody build() {
            return new GetDataServiceApiTestResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataServiceApiTestResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataServiceApiTestResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private Long apiId;

        @com.aliyun.core.annotation.NameInMap("CostTime")
        private String costTime;

        @com.aliyun.core.annotation.NameInMap("DebugInfo")
        private String debugInfo;

        @com.aliyun.core.annotation.NameInMap("NodesDebugInfo")
        private String nodesDebugInfo;

        @com.aliyun.core.annotation.NameInMap("ParamMap")
        private String paramMap;

        @com.aliyun.core.annotation.NameInMap("RetCode")
        private Long retCode;

        @com.aliyun.core.annotation.NameInMap("RetResult")
        private String retResult;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.apiId = builder.apiId;
            this.costTime = builder.costTime;
            this.debugInfo = builder.debugInfo;
            this.nodesDebugInfo = builder.nodesDebugInfo;
            this.paramMap = builder.paramMap;
            this.retCode = builder.retCode;
            this.retResult = builder.retResult;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public Long getApiId() {
            return this.apiId;
        }

        /**
         * @return costTime
         */
        public String getCostTime() {
            return this.costTime;
        }

        /**
         * @return debugInfo
         */
        public String getDebugInfo() {
            return this.debugInfo;
        }

        /**
         * @return nodesDebugInfo
         */
        public String getNodesDebugInfo() {
            return this.nodesDebugInfo;
        }

        /**
         * @return paramMap
         */
        public String getParamMap() {
            return this.paramMap;
        }

        /**
         * @return retCode
         */
        public Long getRetCode() {
            return this.retCode;
        }

        /**
         * @return retResult
         */
        public String getRetResult() {
            return this.retResult;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long apiId; 
            private String costTime; 
            private String debugInfo; 
            private String nodesDebugInfo; 
            private String paramMap; 
            private Long retCode; 
            private String retResult; 
            private String status; 

            /**
             * ApiId.
             */
            public Builder apiId(Long apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * CostTime.
             */
            public Builder costTime(String costTime) {
                this.costTime = costTime;
                return this;
            }

            /**
             * DebugInfo.
             */
            public Builder debugInfo(String debugInfo) {
                this.debugInfo = debugInfo;
                return this;
            }

            /**
             * NodesDebugInfo.
             */
            public Builder nodesDebugInfo(String nodesDebugInfo) {
                this.nodesDebugInfo = nodesDebugInfo;
                return this;
            }

            /**
             * ParamMap.
             */
            public Builder paramMap(String paramMap) {
                this.paramMap = paramMap;
                return this;
            }

            /**
             * RetCode.
             */
            public Builder retCode(Long retCode) {
                this.retCode = retCode;
                return this;
            }

            /**
             * RetResult.
             */
            public Builder retResult(String retResult) {
                this.retResult = retResult;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
