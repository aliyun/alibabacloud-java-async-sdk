// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSnapshotAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateSnapshotAttributeRequest</p>
 */
public class UpdateSnapshotAttributeRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("SnapshotId")
    @Validation(required = true)
    private String snapshotId;

    private UpdateSnapshotAttributeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
        this.remark = builder.remark;
        this.snapshotId = builder.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSnapshotAttributeRequest create() {
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

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public static final class Builder extends Request.Builder<UpdateSnapshotAttributeRequest, Builder> {
        private String clientToken; 
        private String regionId; 
        private String remark; 
        private String snapshotId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSnapshotAttributeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.regionId = request.regionId;
            this.remark = request.remark;
            this.snapshotId = request.snapshotId;
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

        /**
         * SnapshotId.
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        @Override
        public UpdateSnapshotAttributeRequest build() {
            return new UpdateSnapshotAttributeRequest(this);
        } 

    } 

}
