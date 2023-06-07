// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSnapshotsRequest} extends {@link RequestModel}
 *
 * <p>DeleteSnapshotsRequest</p>
 */
public class DeleteSnapshotsRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SnapshotIds")
    @Validation(required = true)
    private String snapshotIds;

    private DeleteSnapshotsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
        this.snapshotIds = builder.snapshotIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSnapshotsRequest create() {
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
     * @return snapshotIds
     */
    public String getSnapshotIds() {
        return this.snapshotIds;
    }

    public static final class Builder extends Request.Builder<DeleteSnapshotsRequest, Builder> {
        private String clientToken; 
        private String regionId; 
        private String snapshotIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSnapshotsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.regionId = request.regionId;
            this.snapshotIds = request.snapshotIds;
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
         * SnapshotIds.
         */
        public Builder snapshotIds(String snapshotIds) {
            this.putQueryParameter("SnapshotIds", snapshotIds);
            this.snapshotIds = snapshotIds;
            return this;
        }

        @Override
        public DeleteSnapshotsRequest build() {
            return new DeleteSnapshotsRequest(this);
        } 

    } 

}
