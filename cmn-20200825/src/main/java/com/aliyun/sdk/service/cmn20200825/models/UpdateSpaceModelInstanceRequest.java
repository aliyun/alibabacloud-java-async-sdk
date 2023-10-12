// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSpaceModelInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateSpaceModelInstanceRequest</p>
 */
public class UpdateSpaceModelInstanceRequest extends Request {
    @Query
    @NameInMap("Instance")
    private String instance;

    @Query
    @NameInMap("SpaceId")
    private String spaceId;

    private UpdateSpaceModelInstanceRequest(Builder builder) {
        super(builder);
        this.instance = builder.instance;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSpaceModelInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instance
     */
    public String getInstance() {
        return this.instance;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<UpdateSpaceModelInstanceRequest, Builder> {
        private String instance; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSpaceModelInstanceRequest request) {
            super(request);
            this.instance = request.instance;
            this.spaceId = request.spaceId;
        } 

        /**
         * Instance.
         */
        public Builder instance(String instance) {
            this.putQueryParameter("Instance", instance);
            this.instance = instance;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putQueryParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public UpdateSpaceModelInstanceRequest build() {
            return new UpdateSpaceModelInstanceRequest(this);
        } 

    } 

}
