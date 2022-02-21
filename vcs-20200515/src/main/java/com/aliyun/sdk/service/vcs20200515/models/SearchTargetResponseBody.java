// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchTargetResponseBody} extends {@link TeaModel}
 *
 * <p>SearchTargetResponseBody</p>
 */
public class SearchTargetResponseBody extends TeaModel {
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

    private SearchTargetResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchTargetResponseBody create() {
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

        public SearchTargetResponseBody build() {
            return new SearchTargetResponseBody(this);
        } 

    } 

    public static class Records extends TeaModel {
        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("LeftTopX")
        private Long leftTopX;

        @NameInMap("LeftTopY")
        private Long leftTopY;

        @NameInMap("RightBottomX")
        private Long rightBottomX;

        @NameInMap("RightBottomY")
        private Long rightBottomY;

        @NameInMap("SourceImageUrl")
        private String sourceImageUrl;

        @NameInMap("TargetAttributes")
        private String targetAttributes;

        @NameInMap("TargetImageSimilarity")
        private Double targetImageSimilarity;

        @NameInMap("TargetImageUrl")
        private String targetImageUrl;

        @NameInMap("TargetType")
        private String targetType;

        @NameInMap("Timestamp")
        private String timestamp;

        private Records(Builder builder) {
            this.deviceId = builder.deviceId;
            this.leftTopX = builder.leftTopX;
            this.leftTopY = builder.leftTopY;
            this.rightBottomX = builder.rightBottomX;
            this.rightBottomY = builder.rightBottomY;
            this.sourceImageUrl = builder.sourceImageUrl;
            this.targetAttributes = builder.targetAttributes;
            this.targetImageSimilarity = builder.targetImageSimilarity;
            this.targetImageUrl = builder.targetImageUrl;
            this.targetType = builder.targetType;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return leftTopX
         */
        public Long getLeftTopX() {
            return this.leftTopX;
        }

        /**
         * @return leftTopY
         */
        public Long getLeftTopY() {
            return this.leftTopY;
        }

        /**
         * @return rightBottomX
         */
        public Long getRightBottomX() {
            return this.rightBottomX;
        }

        /**
         * @return rightBottomY
         */
        public Long getRightBottomY() {
            return this.rightBottomY;
        }

        /**
         * @return sourceImageUrl
         */
        public String getSourceImageUrl() {
            return this.sourceImageUrl;
        }

        /**
         * @return targetAttributes
         */
        public String getTargetAttributes() {
            return this.targetAttributes;
        }

        /**
         * @return targetImageSimilarity
         */
        public Double getTargetImageSimilarity() {
            return this.targetImageSimilarity;
        }

        /**
         * @return targetImageUrl
         */
        public String getTargetImageUrl() {
            return this.targetImageUrl;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String deviceId; 
            private Long leftTopX; 
            private Long leftTopY; 
            private Long rightBottomX; 
            private Long rightBottomY; 
            private String sourceImageUrl; 
            private String targetAttributes; 
            private Double targetImageSimilarity; 
            private String targetImageUrl; 
            private String targetType; 
            private String timestamp; 

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * LeftTopX.
             */
            public Builder leftTopX(Long leftTopX) {
                this.leftTopX = leftTopX;
                return this;
            }

            /**
             * LeftTopY.
             */
            public Builder leftTopY(Long leftTopY) {
                this.leftTopY = leftTopY;
                return this;
            }

            /**
             * RightBottomX.
             */
            public Builder rightBottomX(Long rightBottomX) {
                this.rightBottomX = rightBottomX;
                return this;
            }

            /**
             * RightBottomY.
             */
            public Builder rightBottomY(Long rightBottomY) {
                this.rightBottomY = rightBottomY;
                return this;
            }

            /**
             * SourceImageUrl.
             */
            public Builder sourceImageUrl(String sourceImageUrl) {
                this.sourceImageUrl = sourceImageUrl;
                return this;
            }

            /**
             * TargetAttributes.
             */
            public Builder targetAttributes(String targetAttributes) {
                this.targetAttributes = targetAttributes;
                return this;
            }

            /**
             * TargetImageSimilarity.
             */
            public Builder targetImageSimilarity(Double targetImageSimilarity) {
                this.targetImageSimilarity = targetImageSimilarity;
                return this;
            }

            /**
             * TargetImageUrl.
             */
            public Builder targetImageUrl(String targetImageUrl) {
                this.targetImageUrl = targetImageUrl;
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
             * Timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
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
