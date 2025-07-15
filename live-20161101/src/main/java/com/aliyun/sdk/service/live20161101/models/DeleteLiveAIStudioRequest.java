// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DeleteLiveAIStudioRequest} extends {@link RequestModel}
 *
 * <p>DeleteLiveAIStudioRequest</p>
 */
public class DeleteLiveAIStudioRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StudioId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String studioId;

    private DeleteLiveAIStudioRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.studioId = builder.studioId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLiveAIStudioRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return studioId
     */
    public String getStudioId() {
        return this.studioId;
    }

    public static final class Builder extends Request.Builder<DeleteLiveAIStudioRequest, Builder> {
        private Long ownerId; 
        private String regionId; 
        private String studioId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLiveAIStudioRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.studioId = request.studioId;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * <p>The ID of the template. You can obtain the ID from the response to the CreateLiveAIStudio operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>369ced1f-c33a-49e5-91da-bdaae3d6c1c2</p>
         */
        public Builder studioId(String studioId) {
            this.putQueryParameter("StudioId", studioId);
            this.studioId = studioId;
            return this;
        }

        @Override
        public DeleteLiveAIStudioRequest build() {
            return new DeleteLiveAIStudioRequest(this);
        } 

    } 

}
