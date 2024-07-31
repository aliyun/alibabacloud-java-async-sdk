// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSnapshotsRequest} extends {@link RequestModel}
 *
 * <p>DeleteSnapshotsRequest</p>
 */
public class DeleteSnapshotsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotIds")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The value of **ClientToken** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The region ID of the simple application server. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The snapshot IDs. The value can be a JSON array that consists of up to 100 snapshot IDs. Separate multiple snapshot IDs with commas (,).
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
