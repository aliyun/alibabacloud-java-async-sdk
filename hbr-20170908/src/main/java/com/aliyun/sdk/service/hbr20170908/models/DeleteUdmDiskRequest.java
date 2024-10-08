// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteUdmDiskRequest} extends {@link RequestModel}
 *
 * <p>DeleteUdmDiskRequest</p>
 */
public class DeleteUdmDiskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskId")
    private String diskId;

    private DeleteUdmDiskRequest(Builder builder) {
        super(builder);
        this.diskId = builder.diskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUdmDiskRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteUdmDiskRequest, Builder> {
        private String diskId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUdmDiskRequest request) {
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
        public DeleteUdmDiskRequest build() {
            return new DeleteUdmDiskRequest(this);
        } 

    } 

}
