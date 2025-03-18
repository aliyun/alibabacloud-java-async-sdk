// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DeleteDiskRequest} extends {@link RequestModel}
 *
 * <p>DeleteDiskRequest</p>
 */
public class DeleteDiskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the disk.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-5va95bg6i5f44kgkeuazyfcxm</p>
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
