// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link SenderStatisticsByTagNameAndBatchIDResponseBody} extends {@link TeaModel}
 *
 * <p>SenderStatisticsByTagNameAndBatchIDResponseBody</p>
 */
public class SenderStatisticsByTagNameAndBatchIDResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("data")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(SenderStatisticsByTagNameAndBatchIDResponseBody model) {
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.data = model.data;
        } 

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>10A1AD70-E48E-476D-98D9-39BD92193837</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total count</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>Data records</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public SenderStatisticsByTagNameAndBatchIDResponseBody build() {
            return new SenderStatisticsByTagNameAndBatchIDResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SenderStatisticsByTagNameAndBatchIDResponseBody} extends {@link TeaModel}
     *
     * <p>SenderStatisticsByTagNameAndBatchIDResponseBody</p>
     */
    public static class Stat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("faildCount")
        private String faildCount;

        @com.aliyun.core.annotation.NameInMap("requestCount")
        private String requestCount;

        @com.aliyun.core.annotation.NameInMap("succeededPercent")
        private String succeededPercent;

        @com.aliyun.core.annotation.NameInMap("successCount")
        private String successCount;

        @com.aliyun.core.annotation.NameInMap("unavailableCount")
        private String unavailableCount;

        @com.aliyun.core.annotation.NameInMap("unavailablePercent")
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

            private Builder() {
            } 

            private Builder(Stat model) {
                this.createTime = model.createTime;
                this.faildCount = model.faildCount;
                this.requestCount = model.requestCount;
                this.succeededPercent = model.succeededPercent;
                this.successCount = model.successCount;
                this.unavailableCount = model.unavailableCount;
                this.unavailablePercent = model.unavailablePercent;
            } 

            /**
             * <p>Creation time</p>
             * 
             * <strong>example:</strong>
             * <p>2021-07-02</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Failure count</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder faildCount(String faildCount) {
                this.faildCount = faildCount;
                return this;
            }

            /**
             * <p>Request count</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder requestCount(String requestCount) {
                this.requestCount = requestCount;
                return this;
            }

            /**
             * <p>Success rate</p>
             * 
             * <strong>example:</strong>
             * <p>100.00%</p>
             */
            public Builder succeededPercent(String succeededPercent) {
                this.succeededPercent = succeededPercent;
                return this;
            }

            /**
             * <p>Success count</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder successCount(String successCount) {
                this.successCount = successCount;
                return this;
            }

            /**
             * <p>Invalid count</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder unavailableCount(String unavailableCount) {
                this.unavailableCount = unavailableCount;
                return this;
            }

            /**
             * <p>Unavailability rate</p>
             * 
             * <strong>example:</strong>
             * <p>0%</p>
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
    /**
     * 
     * {@link SenderStatisticsByTagNameAndBatchIDResponseBody} extends {@link TeaModel}
     *
     * <p>SenderStatisticsByTagNameAndBatchIDResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("stat")
        private java.util.List<Stat> stat;

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
        public java.util.List<Stat> getStat() {
            return this.stat;
        }

        public static final class Builder {
            private java.util.List<Stat> stat; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.stat = model.stat;
            } 

            /**
             * stat.
             */
            public Builder stat(java.util.List<Stat> stat) {
                this.stat = stat;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
