// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWatchPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWatchPoliciesResponseBody</p>
 */
public class DescribeWatchPoliciesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeWatchPoliciesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWatchPoliciesResponseBody create() {
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
        private String message; 
        private String requestId; 
        private Boolean success; 

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
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeWatchPoliciesResponseBody build() {
            return new DescribeWatchPoliciesResponseBody(this);
        } 

    } 

    public static class Records extends TeaModel {
        @NameInMap("ItemMatchType")
        private String itemMatchType;

        @NameInMap("SimilarityThreshold")
        private Double similarityThreshold;

        @NameInMap("TargetType")
        private String targetType;

        @NameInMap("WatchMode")
        private String watchMode;

        @NameInMap("WatchPolicyId")
        private String watchPolicyId;

        @NameInMap("WatchPolicyName")
        private String watchPolicyName;

        private Records(Builder builder) {
            this.itemMatchType = builder.itemMatchType;
            this.similarityThreshold = builder.similarityThreshold;
            this.targetType = builder.targetType;
            this.watchMode = builder.watchMode;
            this.watchPolicyId = builder.watchPolicyId;
            this.watchPolicyName = builder.watchPolicyName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return itemMatchType
         */
        public String getItemMatchType() {
            return this.itemMatchType;
        }

        /**
         * @return similarityThreshold
         */
        public Double getSimilarityThreshold() {
            return this.similarityThreshold;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return watchMode
         */
        public String getWatchMode() {
            return this.watchMode;
        }

        /**
         * @return watchPolicyId
         */
        public String getWatchPolicyId() {
            return this.watchPolicyId;
        }

        /**
         * @return watchPolicyName
         */
        public String getWatchPolicyName() {
            return this.watchPolicyName;
        }

        public static final class Builder {
            private String itemMatchType; 
            private Double similarityThreshold; 
            private String targetType; 
            private String watchMode; 
            private String watchPolicyId; 
            private String watchPolicyName; 

            /**
             * ItemMatchType.
             */
            public Builder itemMatchType(String itemMatchType) {
                this.itemMatchType = itemMatchType;
                return this;
            }

            /**
             * SimilarityThreshold.
             */
            public Builder similarityThreshold(Double similarityThreshold) {
                this.similarityThreshold = similarityThreshold;
                return this;
            }

            /**
             * TargetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * WatchMode.
             */
            public Builder watchMode(String watchMode) {
                this.watchMode = watchMode;
                return this;
            }

            /**
             * WatchPolicyId.
             */
            public Builder watchPolicyId(String watchPolicyId) {
                this.watchPolicyId = watchPolicyId;
                return this;
            }

            /**
             * WatchPolicyName.
             */
            public Builder watchPolicyName(String watchPolicyName) {
                this.watchPolicyName = watchPolicyName;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNumber")
        private Long pageNumber;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("Records")
        private java.util.List < Records> records;

        @NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.records = builder.records;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return records
         */
        public java.util.List < Records> getRecords() {
            return this.records;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long pageNumber; 
            private Long pageSize; 
            private java.util.List < Records> records; 
            private Long totalCount; 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Records.
             */
            public Builder records(java.util.List < Records> records) {
                this.records = records;
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
