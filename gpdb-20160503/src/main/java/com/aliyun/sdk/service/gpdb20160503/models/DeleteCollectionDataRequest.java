// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCollectionDataRequest} extends {@link RequestModel}
 *
 * <p>DeleteCollectionDataRequest</p>
 */
public class DeleteCollectionDataRequest extends Request {
    @Query
    @NameInMap("Collection")
    @Validation(required = true)
    private String collection;

    @Query
    @NameInMap("CollectionData")
    private String collectionData;

    @Query
    @NameInMap("CollectionDataFilter")
    private String collectionDataFilter;

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
    @Validation(required = true)
    private String regionId;

    private DeleteCollectionDataRequest(Builder builder) {
        super(builder);
        this.collection = builder.collection;
        this.collectionData = builder.collectionData;
        this.collectionDataFilter = builder.collectionDataFilter;
        this.DBInstanceId = builder.DBInstanceId;
        this.namespace = builder.namespace;
        this.namespacePassword = builder.namespacePassword;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCollectionDataRequest create() {
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
     * @return collectionData
     */
    public String getCollectionData() {
        return this.collectionData;
    }

    /**
     * @return collectionDataFilter
     */
    public String getCollectionDataFilter() {
        return this.collectionDataFilter;
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

    public static final class Builder extends Request.Builder<DeleteCollectionDataRequest, Builder> {
        private String collection; 
        private String collectionData; 
        private String collectionDataFilter; 
        private String DBInstanceId; 
        private String namespace; 
        private String namespacePassword; 
        private Long ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCollectionDataRequest request) {
            super(request);
            this.collection = request.collection;
            this.collectionData = request.collectionData;
            this.collectionDataFilter = request.collectionDataFilter;
            this.DBInstanceId = request.DBInstanceId;
            this.namespace = request.namespace;
            this.namespacePassword = request.namespacePassword;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
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
         * CollectionData.
         */
        public Builder collectionData(String collectionData) {
            this.putQueryParameter("CollectionData", collectionData);
            this.collectionData = collectionData;
            return this;
        }

        /**
         * CollectionDataFilter.
         */
        public Builder collectionDataFilter(String collectionDataFilter) {
            this.putQueryParameter("CollectionDataFilter", collectionDataFilter);
            this.collectionDataFilter = collectionDataFilter;
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

        @Override
        public DeleteCollectionDataRequest build() {
            return new DeleteCollectionDataRequest(this);
        } 

    } 

}
