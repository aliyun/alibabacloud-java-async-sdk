// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DeletePolarFsObjectsRequest} extends {@link RequestModel}
 *
 * <p>DeletePolarFsObjectsRequest</p>
 */
public class DeletePolarFsObjectsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectsToDelete")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> objectsToDelete;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String polarFsInstanceId;

    private DeletePolarFsObjectsRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.objectsToDelete = builder.objectsToDelete;
        this.polarFsInstanceId = builder.polarFsInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePolarFsObjectsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return objectsToDelete
     */
    public java.util.List<String> getObjectsToDelete() {
        return this.objectsToDelete;
    }

    /**
     * @return polarFsInstanceId
     */
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public static final class Builder extends Request.Builder<DeletePolarFsObjectsRequest, Builder> {
        private String DBClusterId; 
        private java.util.List<String> objectsToDelete; 
        private String polarFsInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePolarFsObjectsRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.objectsToDelete = request.objectsToDelete;
            this.polarFsInstanceId = request.polarFsInstanceId;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder objectsToDelete(java.util.List<String> objectsToDelete) {
            String objectsToDeleteShrink = shrink(objectsToDelete, "ObjectsToDelete", "json");
            this.putQueryParameter("ObjectsToDelete", objectsToDeleteShrink);
            this.objectsToDelete = objectsToDelete;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-2ze0i7*****</p>
         */
        public Builder polarFsInstanceId(String polarFsInstanceId) {
            this.putQueryParameter("PolarFsInstanceId", polarFsInstanceId);
            this.polarFsInstanceId = polarFsInstanceId;
            return this;
        }

        @Override
        public DeletePolarFsObjectsRequest build() {
            return new DeletePolarFsObjectsRequest(this);
        } 

    } 

}
