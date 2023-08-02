// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpsertCollectionDataRequest} extends {@link RequestModel}
 *
 * <p>UpsertCollectionDataRequest</p>
 */
public class UpsertCollectionDataRequest extends Request {
    @Query
    @NameInMap("Collection")
    @Validation(required = true)
    private String collection;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("Namespace")
    private String namespace;

    @Query
    @NameInMap("NamespacePassword")
    @Validation(required = true)
    private String namespacePassword;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Rows")
    @Validation(required = true)
    private java.util.List < Rows> rows;

    private UpsertCollectionDataRequest(Builder builder) {
        super(builder);
        this.collection = builder.collection;
        this.DBInstanceId = builder.DBInstanceId;
        this.namespace = builder.namespace;
        this.namespacePassword = builder.namespacePassword;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.rows = builder.rows;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpsertCollectionDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return collection
     */
    public String getCollection() {
        return this.collection;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return namespacePassword
     */
    public String getNamespacePassword() {
        return this.namespacePassword;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return rows
     */
    public java.util.List < Rows> getRows() {
        return this.rows;
    }

    public static final class Builder extends Request.Builder<UpsertCollectionDataRequest, Builder> {
        private String collection; 
        private String DBInstanceId; 
        private String namespace; 
        private String namespacePassword; 
        private Long ownerId; 
        private String regionId; 
        private java.util.List < Rows> rows; 

        private Builder() {
            super();
        } 

        private Builder(UpsertCollectionDataRequest request) {
            super(request);
            this.collection = request.collection;
            this.DBInstanceId = request.DBInstanceId;
            this.namespace = request.namespace;
            this.namespacePassword = request.namespacePassword;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.rows = request.rows;
        } 

        /**
         * Collection.
         */
        public Builder collection(String collection) {
            this.putQueryParameter("Collection", collection);
            this.collection = collection;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * NamespacePassword.
         */
        public Builder namespacePassword(String namespacePassword) {
            this.putQueryParameter("NamespacePassword", namespacePassword);
            this.namespacePassword = namespacePassword;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Rows.
         */
        public Builder rows(java.util.List < Rows> rows) {
            String rowsShrink = shrink(rows, "Rows", "json");
            this.putQueryParameter("Rows", rowsShrink);
            this.rows = rows;
            return this;
        }

        @Override
        public UpsertCollectionDataRequest build() {
            return new UpsertCollectionDataRequest(this);
        } 

    } 

    public static class Rows extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Metadata")
        private java.util.Map < String, String > metadata;

        @NameInMap("Vector")
        private java.util.List < Double > vector;

        private Rows(Builder builder) {
            this.id = builder.id;
            this.metadata = builder.metadata;
            this.vector = builder.vector;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rows create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return metadata
         */
        public java.util.Map < String, String > getMetadata() {
            return this.metadata;
        }

        /**
         * @return vector
         */
        public java.util.List < Double > getVector() {
            return this.vector;
        }

        public static final class Builder {
            private String id; 
            private java.util.Map < String, String > metadata; 
            private java.util.List < Double > vector; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Metadata.
             */
            public Builder metadata(java.util.Map < String, String > metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * Vector.
             */
            public Builder vector(java.util.List < Double > vector) {
                this.vector = vector;
                return this;
            }

            public Rows build() {
                return new Rows(this);
            } 

        } 

    }
}
