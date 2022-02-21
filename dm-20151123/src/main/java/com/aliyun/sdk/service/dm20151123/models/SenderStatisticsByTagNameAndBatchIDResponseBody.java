// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SenderStatisticsByTagNameAndBatchIDResponseBody} extends {@link TeaModel}
 *
 * <p>SenderStatisticsByTagNameAndBatchIDResponseBody</p>
 */
public class SenderStatisticsByTagNameAndBatchIDResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("data")
    private Data data;

    private SenderStatisticsByTagNameAndBatchIDResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SenderStatisticsByTagNameAndBatchIDResponseBody create() {
        return builder().build();
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    public static final class Builder {
        private String requestId; 
        private Integer totalCount; 
        private Data data; 

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
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public SenderStatisticsByTagNameAndBatchIDResponseBody build() {
            return new SenderStatisticsByTagNameAndBatchIDResponseBody(this);
        } 

    } 

    public static class Stat extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("faildCount")
        private String faildCount;

        @NameInMap("requestCount")
        private String requestCount;

        @NameInMap("succeededPercent")
        private String succeededPercent;

        @NameInMap("successCount")
        private String successCount;

        @NameInMap("unavailableCount")
        private String unavailableCount;

        @NameInMap("unavailablePercent")
        private String unavailablePercent;

        private Stat(Builder builder) {
            this.createTime = builder.createTime;
            this.faildCount = builder.faildCount;
            this.requestCount = builder.requestCount;
            this.succeededPercent = builder.succeededPercent;
            this.successCount = builder.successCount;
            this.unavailableCount = builder.unavailableCount;
            this.unavailablePercent = builder.unavailablePercent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Stat create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return faildCount
         */
        public String getFaildCount() {
            return this.faildCount;
        }

        /**
         * @return requestCount
         */
        public String getRequestCount() {
            return this.requestCount;
        }

        /**
         * @return succeededPercent
         */
        public String getSucceededPercent() {
            return this.succeededPercent;
        }

        /**
         * @return successCount
         */
        public String getSuccessCount() {
            return this.successCount;
        }

        /**
         * @return unavailableCount
         */
        public String getUnavailableCount() {
            return this.unavailableCount;
        }

        /**
         * @return unavailablePercent
         */
        public String getUnavailablePercent() {
            return this.unavailablePercent;
        }

        public static final class Builder {
            private String createTime; 
            private String faildCount; 
            private String requestCount; 
            private String succeededPercent; 
            private String successCount; 
            private String unavailableCount; 
            private String unavailablePercent; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * faildCount.
             */
            public Builder faildCount(String faildCount) {
                this.faildCount = faildCount;
                return this;
            }

            /**
             * requestCount.
             */
            public Builder requestCount(String requestCount) {
                this.requestCount = requestCount;
                return this;
            }

            /**
             * succeededPercent.
             */
            public Builder succeededPercent(String succeededPercent) {
                this.succeededPercent = succeededPercent;
                return this;
            }

            /**
             * successCount.
             */
            public Builder successCount(String successCount) {
                this.successCount = successCount;
                return this;
            }

            /**
             * unavailableCount.
             */
            public Builder unavailableCount(String unavailableCount) {
                this.unavailableCount = unavailableCount;
                return this;
            }

            /**
             * unavailablePercent.
             */
            public Builder unavailablePercent(String unavailablePercent) {
                this.unavailablePercent = unavailablePercent;
                return this;
            }

            public Stat build() {
                return new Stat(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("stat")
        private java.util.List < Stat> stat;

        private Data(Builder builder) {
            this.stat = builder.stat;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return stat
         */
        public java.util.List < Stat> getStat() {
            return this.stat;
        }

        public static final class Builder {
            private java.util.List < Stat> stat; 

            /**
             * stat.
             */
            public Builder stat(java.util.List < Stat> stat) {
                this.stat = stat;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
