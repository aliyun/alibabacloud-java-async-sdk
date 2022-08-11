// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteConnectionRequest} extends {@link RequestModel}
 *
 * <p>DeleteConnectionRequest</p>
 */
public class DeleteConnectionRequest extends Request {
    @Query
    @NameInMap("ConnectionId")
    @Validation(required = true)
    private Long connectionId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteConnectionRequest(Builder builder) {
        super(builder);
        this.connectionId = builder.connectionId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteConnectionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectionId
     */
    public Long getConnectionId() {
        return this.connectionId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteConnectionRequest, Builder> {
        private Long connectionId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteConnectionRequest request) {
            super(request);
            this.connectionId = request.connectionId;
            this.regionId = request.regionId;
        } 

        /**
         * ConnectionId.
         */
        public Builder connectionId(Long connectionId) {
            this.putQueryParameter("ConnectionId", connectionId);
            this.connectionId = connectionId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteConnectionRequest build() {
            return new DeleteConnectionRequest(this);
        } 

    } 

}
