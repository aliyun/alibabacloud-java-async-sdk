// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCollectionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCollectionsResponseBody</p>
 */
public class ListCollectionsResponseBody extends TeaModel {
    @NameInMap("Collections")
    private Collections collections;

    @NameInMap("Count")
    private Integer count;

    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("Message")
    private String message;

    @NameInMap("Namespace")
    private String namespace;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private ListCollectionsResponseBody(Builder builder) {
        this.collections = builder.collections;
        this.count = builder.count;
        this.DBInstanceId = builder.DBInstanceId;
        this.message = builder.message;
        this.namespace = builder.namespace;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCollectionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return collections
     */
    public Collections getCollections() {
        return this.collections;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Collections collections; 
        private Integer count; 
        private String DBInstanceId; 
        private String message; 
        private String namespace; 
        private String regionId; 
        private String requestId; 
        private String status; 

        /**
         * Collections.
         */
        public Builder collections(Collections collections) {
            this.collections = collections;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
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
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public ListCollectionsResponseBody build() {
            return new ListCollectionsResponseBody(this);
        } 

    } 

    public static class Collections extends TeaModel {
        @NameInMap("Collection")
        private java.util.List < String > collection;

        private Collections(Builder builder) {
            this.collection = builder.collection;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Collections create() {
            return builder().build();
        }

        /**
         * @return collection
         */
        public java.util.List < String > getCollection() {
            return this.collection;
        }

        public static final class Builder {
            private java.util.List < String > collection; 

            /**
             * Collection.
             */
            public Builder collection(java.util.List < String > collection) {
                this.collection = collection;
                return this;
            }

            public Collections build() {
                return new Collections(this);
            } 

        } 

    }
}
