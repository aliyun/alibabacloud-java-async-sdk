// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCollectionsRequest} extends {@link RequestModel}
 *
 * <p>ListCollectionsRequest</p>
 */
public class ListCollectionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespacePassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespacePassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListCollectionsRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.namespace = builder.namespace;
        this.namespacePassword = builder.namespacePassword;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCollectionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListCollectionsRequest, Builder> {
        private String DBInstanceId; 
        private String namespace; 
        private String namespacePassword; 
        private Long ownerId; 
        private String regionId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListCollectionsRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.namespace = request.namespace;
            this.namespacePassword = request.namespacePassword;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * The instance ID.
         * <p>
         * 
         * > You can call the [DescribeDBInstances](~~86911~~) operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The name of the namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The password of the namespace.
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
         * The region ID of the instance.
         * <p>
         * 
         * >  You can call the [DescribeRegions](~~86912~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListCollectionsRequest build() {
            return new ListCollectionsRequest(this);
        } 

    } 

}
