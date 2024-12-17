// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeVodTieringStorageRetrievalDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodTieringStorageRetrievalDataResponseBody</p>
 */
public class DescribeVodTieringStorageRetrievalDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RetrievalData")
    private java.util.List<RetrievalData> retrievalData;

    private DescribeVodTieringStorageRetrievalDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.retrievalData = builder.retrievalData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodTieringStorageRetrievalDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return retrievalData
     */
    public java.util.List<RetrievalData> getRetrievalData() {
        return this.retrievalData;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<RetrievalData> retrievalData; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4A13-BEF6-D73936****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The data retrieval information.</p>
         */
        public Builder retrievalData(java.util.List<RetrievalData> retrievalData) {
            this.retrievalData = retrievalData;
            return this;
        }

        public DescribeVodTieringStorageRetrievalDataResponseBody build() {
            return new DescribeVodTieringStorageRetrievalDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodTieringStorageRetrievalDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodTieringStorageRetrievalDataResponseBody</p>
     */
    public static class RetrievalData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CABulkRetrievalData")
        private Long CABulkRetrievalData;

        @com.aliyun.core.annotation.NameInMap("CAHighPriorRetrievalData")
        private Long CAHighPriorRetrievalData;

        @com.aliyun.core.annotation.NameInMap("CAStdRetrievalData")
        private Long CAStdRetrievalData;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RetrievalData")
        private Long retrievalData;

        @com.aliyun.core.annotation.NameInMap("StorageClass")
        private String storageClass;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private RetrievalData(Builder builder) {
            this.CABulkRetrievalData = builder.CABulkRetrievalData;
            this.CAHighPriorRetrievalData = builder.CAHighPriorRetrievalData;
            this.CAStdRetrievalData = builder.CAStdRetrievalData;
            this.region = builder.region;
            this.retrievalData = builder.retrievalData;
            this.storageClass = builder.storageClass;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetrievalData create() {
            return builder().build();
        }

        /**
         * @return CABulkRetrievalData
         */
        public Long getCABulkRetrievalData() {
            return this.CABulkRetrievalData;
        }

        /**
         * @return CAHighPriorRetrievalData
         */
        public Long getCAHighPriorRetrievalData() {
            return this.CAHighPriorRetrievalData;
        }

        /**
         * @return CAStdRetrievalData
         */
        public Long getCAStdRetrievalData() {
            return this.CAStdRetrievalData;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return retrievalData
         */
        public Long getRetrievalData() {
            return this.retrievalData;
        }

        /**
         * @return storageClass
         */
        public String getStorageClass() {
            return this.storageClass;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Long CABulkRetrievalData; 
            private Long CAHighPriorRetrievalData; 
            private Long CAStdRetrievalData; 
            private String region; 
            private Long retrievalData; 
            private String storageClass; 
            private String timeStamp; 

            /**
             * <p>The retrieved Cold Archive data in the bulk mode.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder CABulkRetrievalData(Long CABulkRetrievalData) {
                this.CABulkRetrievalData = CABulkRetrievalData;
                return this;
            }

            /**
             * <p>The retrieved Cold Archive data in the expedited mode.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder CAHighPriorRetrievalData(Long CAHighPriorRetrievalData) {
                this.CAHighPriorRetrievalData = CAHighPriorRetrievalData;
                return this;
            }

            /**
             * <p>The retrieved Cold Archive data in the standard mode.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder CAStdRetrievalData(Long CAStdRetrievalData) {
                this.CAStdRetrievalData = CAStdRetrievalData;
                return this;
            }

            /**
             * <p>The storage region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The data retrieval information.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder retrievalData(Long retrievalData) {
                this.retrievalData = retrievalData;
                return this;
            }

            /**
             * <p>The storage type.</p>
             * 
             * <strong>example:</strong>
             * <p>IA</p>
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            /**
             * <p>The timestamp of the returned data. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-06-02T10:20:00Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public RetrievalData build() {
                return new RetrievalData(this);
            } 

        } 

    }
}
