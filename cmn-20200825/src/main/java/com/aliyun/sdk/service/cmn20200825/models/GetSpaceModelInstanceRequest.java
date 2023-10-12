// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSpaceModelInstanceRequest} extends {@link RequestModel}
 *
 * <p>GetSpaceModelInstanceRequest</p>
 */
public class GetSpaceModelInstanceRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("OperateType")
    private String operateType;

    @Query
    @NameInMap("SpaceId")
    private String spaceId;

    @Query
    @NameInMap("SpaceType")
    private String spaceType;

    private GetSpaceModelInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.operateType = builder.operateType;
        this.spaceId = builder.spaceId;
        this.spaceType = builder.spaceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSpaceModelInstanceRequest create() {
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
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    /**
     * @return spaceType
     */
    public String getSpaceType() {
        return this.spaceType;
    }

    public static final class Builder extends Request.Builder<GetSpaceModelInstanceRequest, Builder> {
        private String instanceId; 
        private String operateType; 
        private String spaceId; 
        private String spaceType; 

        private Builder() {
            super();
        } 

        private Builder(GetSpaceModelInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.operateType = request.operateType;
            this.spaceId = request.spaceId;
            this.spaceType = request.spaceType;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * OperateType.
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
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

        /**
         * SpaceType.
         */
        public Builder spaceType(String spaceType) {
            this.putQueryParameter("SpaceType", spaceType);
            this.spaceType = spaceType;
            return this;
        }

        @Override
        public GetSpaceModelInstanceRequest build() {
            return new GetSpaceModelInstanceRequest(this);
        } 

    } 

}
