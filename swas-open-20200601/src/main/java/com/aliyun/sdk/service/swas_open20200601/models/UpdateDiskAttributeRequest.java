// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDiskAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateDiskAttributeRequest</p>
 */
public class UpdateDiskAttributeRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DiskId")
    @Validation(required = true)
    private String diskId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Remark")
    @Validation(required = true)
    private String remark;

    private UpdateDiskAttributeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.diskId = builder.diskId;
        this.regionId = builder.regionId;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDiskAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<UpdateDiskAttributeRequest, Builder> {
        private String clientToken; 
        private String diskId; 
        private String regionId; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDiskAttributeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.diskId = request.diskId;
            this.regionId = request.regionId;
            this.remark = request.remark;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DiskId.
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
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
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public UpdateDiskAttributeRequest build() {
            return new UpdateDiskAttributeRequest(this);
        } 

    } 

}
