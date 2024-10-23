// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListMultiDimTableRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMultiDimTableRecordsResponseBody</p>
 */
public class ListMultiDimTableRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("hasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("records")
    private java.util.List < Records> records;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private ListMultiDimTableRecordsResponseBody(Builder builder) {
        this.hasMore = builder.hasMore;
        this.nextToken = builder.nextToken;
        this.records = builder.records;
        this.requestId = builder.requestId;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMultiDimTableRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return records
     */
    public java.util.List < Records> getRecords() {
        return this.records;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private Boolean hasMore; 
        private String nextToken; 
        private java.util.List < Records> records; 
        private String requestId; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * hasMore.
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * records.
         */
        public Builder records(java.util.List < Records> records) {
            this.records = records;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public ListMultiDimTableRecordsResponseBody build() {
            return new ListMultiDimTableRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMultiDimTableRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiDimTableRecordsResponseBody</p>
     */
    public static class CreatedBy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private CreatedBy(Builder builder) {
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreatedBy create() {
            return builder().build();
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String userId; 

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public CreatedBy build() {
                return new CreatedBy(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMultiDimTableRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiDimTableRecordsResponseBody</p>
     */
    public static class LastModifiedBy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private LastModifiedBy(Builder builder) {
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LastModifiedBy create() {
            return builder().build();
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String userId; 

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public LastModifiedBy build() {
                return new LastModifiedBy(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMultiDimTableRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiDimTableRecordsResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedBy")
        private CreatedBy createdBy;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("Fields")
        private java.util.Map < String, ? > fields;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("LastModifiedBy")
        private LastModifiedBy lastModifiedBy;

        @com.aliyun.core.annotation.NameInMap("LastModifiedTime")
        private Long lastModifiedTime;

        private Records(Builder builder) {
            this.createdBy = builder.createdBy;
            this.createdTime = builder.createdTime;
            this.fields = builder.fields;
            this.id = builder.id;
            this.lastModifiedBy = builder.lastModifiedBy;
            this.lastModifiedTime = builder.lastModifiedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return createdBy
         */
        public CreatedBy getCreatedBy() {
            return this.createdBy;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return fields
         */
        public java.util.Map < String, ? > getFields() {
            return this.fields;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return lastModifiedBy
         */
        public LastModifiedBy getLastModifiedBy() {
            return this.lastModifiedBy;
        }

        /**
         * @return lastModifiedTime
         */
        public Long getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public static final class Builder {
            private CreatedBy createdBy; 
            private Long createdTime; 
            private java.util.Map < String, ? > fields; 
            private String id; 
            private LastModifiedBy lastModifiedBy; 
            private Long lastModifiedTime; 

            /**
             * CreatedBy.
             */
            public Builder createdBy(CreatedBy createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * Fields.
             */
            public Builder fields(java.util.Map < String, ? > fields) {
                this.fields = fields;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * LastModifiedBy.
             */
            public Builder lastModifiedBy(LastModifiedBy lastModifiedBy) {
                this.lastModifiedBy = lastModifiedBy;
                return this;
            }

            /**
             * LastModifiedTime.
             */
            public Builder lastModifiedTime(Long lastModifiedTime) {
                this.lastModifiedTime = lastModifiedTime;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
}
