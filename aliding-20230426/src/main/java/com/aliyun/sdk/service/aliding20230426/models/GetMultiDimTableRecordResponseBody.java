// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link GetMultiDimTableRecordResponseBody} extends {@link TeaModel}
 *
 * <p>GetMultiDimTableRecordResponseBody</p>
 */
public class GetMultiDimTableRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreatedBy")
    private CreatedBy createdBy;

    @com.aliyun.core.annotation.NameInMap("CreatedTime")
    private Long createdTime;

    @com.aliyun.core.annotation.NameInMap("Fields")
    private java.util.Map<String, ?> fields;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("LastModifiedBy")
    private LastModifiedBy lastModifiedBy;

    @com.aliyun.core.annotation.NameInMap("LastModifiedTime")
    private Long lastModifiedTime;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private GetMultiDimTableRecordResponseBody(Builder builder) {
        this.createdBy = builder.createdBy;
        this.createdTime = builder.createdTime;
        this.fields = builder.fields;
        this.id = builder.id;
        this.lastModifiedBy = builder.lastModifiedBy;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.requestId = builder.requestId;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMultiDimTableRecordResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.Map<String, ?> getFields() {
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
        private CreatedBy createdBy; 
        private Long createdTime; 
        private java.util.Map<String, ?> fields; 
        private String id; 
        private LastModifiedBy lastModifiedBy; 
        private Long lastModifiedTime; 
        private String requestId; 
        private String vendorRequestId; 
        private String vendorType; 

        private Builder() {
        } 

        private Builder(GetMultiDimTableRecordResponseBody model) {
            this.createdBy = model.createdBy;
            this.createdTime = model.createdTime;
            this.fields = model.fields;
            this.id = model.id;
            this.lastModifiedBy = model.lastModifiedBy;
            this.lastModifiedTime = model.lastModifiedTime;
            this.requestId = model.requestId;
            this.vendorRequestId = model.vendorRequestId;
            this.vendorType = model.vendorType;
        } 

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
        public Builder fields(java.util.Map<String, ?> fields) {
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

        public GetMultiDimTableRecordResponseBody build() {
            return new GetMultiDimTableRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMultiDimTableRecordResponseBody} extends {@link TeaModel}
     *
     * <p>GetMultiDimTableRecordResponseBody</p>
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

            private Builder() {
            } 

            private Builder(CreatedBy model) {
                this.userId = model.userId;
            } 

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
     * {@link GetMultiDimTableRecordResponseBody} extends {@link TeaModel}
     *
     * <p>GetMultiDimTableRecordResponseBody</p>
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

            private Builder() {
            } 

            private Builder(LastModifiedBy model) {
                this.userId = model.userId;
            } 

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
}
