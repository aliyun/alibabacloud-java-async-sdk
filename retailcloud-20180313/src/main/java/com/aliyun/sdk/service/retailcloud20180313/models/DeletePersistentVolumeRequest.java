// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePersistentVolumeRequest} extends {@link RequestModel}
 *
 * <p>DeletePersistentVolumeRequest</p>
 */
public class DeletePersistentVolumeRequest extends Request {
    @Body
    @NameInMap("ClusterInstanceId")
    @Validation(required = true)
    private String clusterInstanceId;

    @Body
    @NameInMap("PersistentVolumeName")
    @Validation(required = true)
    private String persistentVolumeName;

    private DeletePersistentVolumeRequest(Builder builder) {
        super(builder);
        this.clusterInstanceId = builder.clusterInstanceId;
        this.persistentVolumeName = builder.persistentVolumeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePersistentVolumeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterInstanceId
     */
    public String getClusterInstanceId() {
        return this.clusterInstanceId;
    }

    /**
     * @return persistentVolumeName
     */
    public String getPersistentVolumeName() {
        return this.persistentVolumeName;
    }

    public static final class Builder extends Request.Builder<DeletePersistentVolumeRequest, Builder> {
        private String clusterInstanceId; 
        private String persistentVolumeName; 

        private Builder() {
            super();
        } 

        private Builder(DeletePersistentVolumeRequest request) {
            super(request);
            this.clusterInstanceId = request.clusterInstanceId;
            this.persistentVolumeName = request.persistentVolumeName;
        } 

        /**
         * ClusterInstanceId.
         */
        public Builder clusterInstanceId(String clusterInstanceId) {
            this.putBodyParameter("ClusterInstanceId", clusterInstanceId);
            this.clusterInstanceId = clusterInstanceId;
            return this;
        }

        /**
         * PersistentVolumeName.
         */
        public Builder persistentVolumeName(String persistentVolumeName) {
            this.putBodyParameter("PersistentVolumeName", persistentVolumeName);
            this.persistentVolumeName = persistentVolumeName;
            return this;
        }

        @Override
        public DeletePersistentVolumeRequest build() {
            return new DeletePersistentVolumeRequest(this);
        } 

    } 

}
