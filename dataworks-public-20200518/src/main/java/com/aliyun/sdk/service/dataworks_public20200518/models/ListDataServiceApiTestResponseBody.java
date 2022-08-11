// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataServiceApiTestResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataServiceApiTestResponseBody</p>
 */
public class ListDataServiceApiTestResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private ListDataServiceApiTestResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataServiceApiTestResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
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

        public ListDataServiceApiTestResponseBody build() {
            return new ListDataServiceApiTestResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ApiId")
        private Long apiId;

        @NameInMap("CostTime")
        private Integer costTime;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("ParamMap")
        private String paramMap;

        @NameInMap("RetCode")
        private Long retCode;

        @NameInMap("RetResult")
        private String retResult;

        @NameInMap("Status")
        private String status;

        @NameInMap("TestId")
        private Long testId;

        private Data(Builder builder) {
            this.apiId = builder.apiId;
            this.costTime = builder.costTime;
            this.createTime = builder.createTime;
            this.paramMap = builder.paramMap;
            this.retCode = builder.retCode;
            this.retResult = builder.retResult;
            this.status = builder.status;
            this.testId = builder.testId;
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
        public Integer getCostTime() {
            return this.costTime;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
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

        /**
         * @return testId
         */
        public Long getTestId() {
            return this.testId;
        }

        public static final class Builder {
            private Long apiId; 
            private Integer costTime; 
            private Long createTime; 
            private String paramMap; 
            private Long retCode; 
            private String retResult; 
            private String status; 
            private Long testId; 

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
            public Builder costTime(Integer costTime) {
                this.costTime = costTime;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
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

            /**
             * TestId.
             */
            public Builder testId(Long testId) {
                this.testId = testId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
