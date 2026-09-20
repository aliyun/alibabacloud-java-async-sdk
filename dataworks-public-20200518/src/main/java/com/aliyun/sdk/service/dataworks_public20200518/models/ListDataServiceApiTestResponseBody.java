// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link ListDataServiceApiTestResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataServiceApiTestResponseBody</p>
 */
public class ListDataServiceApiTestResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListDataServiceApiTestResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data list.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ESDAFWEA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDataServiceApiTestResponseBody build() {
            return new ListDataServiceApiTestResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataServiceApiTestResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServiceApiTestResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private Long apiId;

        @com.aliyun.core.annotation.NameInMap("CostTime")
        private Integer costTime;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("ParamMap")
        private String paramMap;

        @com.aliyun.core.annotation.NameInMap("RetCode")
        private Long retCode;

        @com.aliyun.core.annotation.NameInMap("RetResult")
        private String retResult;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TestId")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.apiId = model.apiId;
                this.costTime = model.costTime;
                this.createTime = model.createTime;
                this.paramMap = model.paramMap;
                this.retCode = model.retCode;
                this.retResult = model.retResult;
                this.status = model.status;
                this.testId = model.testId;
            } 

            /**
             * <p>The ID of the API to test.</p>
             * 
             * <strong>example:</strong>
             * <p>2343</p>
             */
            public Builder apiId(Long apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The time consumed by the API request.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder costTime(Integer costTime) {
                this.costTime = costTime;
                return this;
            }

            /**
             * <p>The time when the task was created.</p>
             * <p>The value is a 13-digit number, such as <code>1651824913000</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>1651824913000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The request parameters of the test API.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;name&quot;:&quot;test&quot;}</p>
             */
            public Builder paramMap(String paramMap) {
                this.paramMap = paramMap;
                return this;
            }

            /**
             * <p>The return code of the test API. This field is empty if the test is not completed.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder retCode(Long retCode) {
                this.retCode = retCode;
                return this;
            }

            /**
             * <p>The returned data.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;id&quot;:2}</p>
             */
            public Builder retResult(String retResult) {
                this.retResult = retResult;
                return this;
            }

            /**
             * <p>Indicates whether the task is completed. Valid values:</p>
             * <ul>
             * <li>RUNNING</li>
             * <li>FINISHED</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FINISHED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The test ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
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
