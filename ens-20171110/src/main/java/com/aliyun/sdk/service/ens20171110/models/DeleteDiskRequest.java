// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDiskRequest} extends {@link RequestModel}
 *
 * <p>DeleteDiskRequest</p>
 */
public class DeleteDiskRequest extends Request {
    @Query
    @NameInMap("DiskId")
    @Validation(required = true)
    private String diskId;

    private DeleteDiskRequest(Builder builder) {
        super(builder);
        this.diskId = builder.diskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDiskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    public static final class Builder extends Request.Builder<DeleteDiskRequest, Builder> {
        private String diskId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDiskRequest request) {
            super(request);
            this.diskId = request.diskId;
        } 

        /**
         * DiskId.
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        @Override
        public DeleteDiskRequest build() {
            return new DeleteDiskRequest(this);
        } 

    } 

}
