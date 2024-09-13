// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteStorageVolumeRequest} extends {@link RequestModel}
 *
 * <p>DeleteStorageVolumeRequest</p>
 */
public class DeleteStorageVolumeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VolumeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String volumeId;

    private DeleteStorageVolumeRequest(Builder builder) {
        super(builder);
        this.volumeId = builder.volumeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteStorageVolumeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return volumeId
     */
    public String getVolumeId() {
        return this.volumeId;
    }

    public static final class Builder extends Request.Builder<DeleteStorageVolumeRequest, Builder> {
        private String volumeId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteStorageVolumeRequest request) {
            super(request);
            this.volumeId = request.volumeId;
        } 

        /**
         * The ID of the volume.
         */
        public Builder volumeId(String volumeId) {
            this.putQueryParameter("VolumeId", volumeId);
            this.volumeId = volumeId;
            return this;
        }

        @Override
        public DeleteStorageVolumeRequest build() {
            return new DeleteStorageVolumeRequest(this);
        } 

    } 

}
