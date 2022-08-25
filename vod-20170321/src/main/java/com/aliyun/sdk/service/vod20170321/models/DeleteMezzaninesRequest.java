// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMezzaninesRequest} extends {@link RequestModel}
 *
 * <p>DeleteMezzaninesRequest</p>
 */
public class DeleteMezzaninesRequest extends Request {
    @Query
    @NameInMap("Force")
    private Boolean force;

    @Query
    @NameInMap("VideoIds")
    @Validation(required = true)
    private String videoIds;

    private DeleteMezzaninesRequest(Builder builder) {
        super(builder);
        this.force = builder.force;
        this.videoIds = builder.videoIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMezzaninesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return videoIds
     */
    public String getVideoIds() {
        return this.videoIds;
    }

    public static final class Builder extends Request.Builder<DeleteMezzaninesRequest, Builder> {
        private Boolean force; 
        private String videoIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMezzaninesRequest request) {
            super(request);
            this.force = request.force;
            this.videoIds = request.videoIds;
        } 

        /**
         * Force.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * VideoIds.
         */
        public Builder videoIds(String videoIds) {
            this.putQueryParameter("VideoIds", videoIds);
            this.videoIds = videoIds;
            return this;
        }

        @Override
        public DeleteMezzaninesRequest build() {
            return new DeleteMezzaninesRequest(this);
        } 

    } 

}
