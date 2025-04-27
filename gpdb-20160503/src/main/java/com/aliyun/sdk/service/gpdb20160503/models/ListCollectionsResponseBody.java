// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ListCollectionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCollectionsResponseBody</p>
 */
public class ListCollectionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Collections")
    private Collections collections;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListCollectionsResponseBody model) {
            this.collections = model.collections;
            this.count = model.count;
            this.DBInstanceId = model.DBInstanceId;
            this.message = model.message;
            this.namespace = model.namespace;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The queried vector collections.</p>
         */
        public Builder collections(Collections collections) {
            this.collections = collections;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The name of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>mynamespace</p>
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>success</strong></li>
         * <li><strong>fail</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public ListCollectionsResponseBody build() {
            return new ListCollectionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCollectionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCollectionsResponseBody</p>
     */
    public static class Collections extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Collection")
        private java.util.List<String> collection;

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
        public java.util.List<String> getCollection() {
            return this.collection;
        }

        public static final class Builder {
            private java.util.List<String> collection; 

            private Builder() {
            } 

            private Builder(Collections model) {
                this.collection = model.collection;
            } 

            /**
             * Collection.
             */
            public Builder collection(java.util.List<String> collection) {
                this.collection = collection;
                return this;
            }

            public Collections build() {
                return new Collections(this);
            } 

        } 

    }
}
