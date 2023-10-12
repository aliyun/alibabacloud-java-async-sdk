// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LockSpaceModelRequest} extends {@link RequestModel}
 *
 * <p>LockSpaceModelRequest</p>
 */
public class LockSpaceModelRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("SpaceModelId")
    @Validation(required = true)
    private String spaceModelId;

    private LockSpaceModelRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.spaceModelId = builder.spaceModelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LockSpaceModelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return spaceModelId
     */
    public String getSpaceModelId() {
        return this.spaceModelId;
    }

    public static final class Builder extends Request.Builder<LockSpaceModelRequest, Builder> {
        private String instanceId; 
        private String spaceModelId; 

        private Builder() {
            super();
        } 

        private Builder(LockSpaceModelRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.spaceModelId = request.spaceModelId;
        } 

        /**
         * instanceId
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * SpaceModelId.
         */
        public Builder spaceModelId(String spaceModelId) {
            this.putQueryParameter("SpaceModelId", spaceModelId);
            this.spaceModelId = spaceModelId;
            return this;
        }

        @Override
        public LockSpaceModelRequest build() {
            return new LockSpaceModelRequest(this);
        } 

    } 

}
