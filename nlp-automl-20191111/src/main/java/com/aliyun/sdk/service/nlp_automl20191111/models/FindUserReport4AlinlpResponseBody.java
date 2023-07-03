// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp_automl20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindUserReport4AlinlpResponseBody} extends {@link TeaModel}
 *
 * <p>FindUserReport4AlinlpResponseBody</p>
 */
public class FindUserReport4AlinlpResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private FindUserReport4AlinlpResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindUserReport4AlinlpResponseBody create() {
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
        private String code; 
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

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

        public FindUserReport4AlinlpResponseBody build() {
            return new FindUserReport4AlinlpResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("FailCount")
        private Long failCount;

        @NameInMap("QpsMax")
        private Integer qpsMax;

        @NameInMap("RptTime")
        private String rptTime;

        @NameInMap("SuccessCount")
        private Long successCount;

        @NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.failCount = builder.failCount;
            this.qpsMax = builder.qpsMax;
            this.rptTime = builder.rptTime;
            this.successCount = builder.successCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return failCount
         */
        public Long getFailCount() {
            return this.failCount;
        }

        /**
         * @return qpsMax
         */
        public Integer getQpsMax() {
            return this.qpsMax;
        }

        /**
         * @return rptTime
         */
        public String getRptTime() {
            return this.rptTime;
        }

        /**
         * @return successCount
         */
        public Long getSuccessCount() {
            return this.successCount;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long failCount; 
            private Integer qpsMax; 
            private String rptTime; 
            private Long successCount; 
            private Long totalCount; 

            /**
             * FailCount.
             */
            public Builder failCount(Long failCount) {
                this.failCount = failCount;
                return this;
            }

            /**
             * QpsMax.
             */
            public Builder qpsMax(Integer qpsMax) {
                this.qpsMax = qpsMax;
                return this;
            }

            /**
             * RptTime.
             */
            public Builder rptTime(String rptTime) {
                this.rptTime = rptTime;
                return this;
            }

            /**
             * SuccessCount.
             */
            public Builder successCount(Long successCount) {
                this.successCount = successCount;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
