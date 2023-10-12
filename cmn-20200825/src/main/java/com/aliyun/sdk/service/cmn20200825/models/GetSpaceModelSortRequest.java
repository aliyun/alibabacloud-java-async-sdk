// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSpaceModelSortRequest} extends {@link RequestModel}
 *
 * <p>GetSpaceModelSortRequest</p>
 */
public class GetSpaceModelSortRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("OperateType")
    @Validation(required = true)
    private String operateType;

    @Query
    @NameInMap("SpaceType")
    @Validation(required = true)
    private String spaceType;

    private GetSpaceModelSortRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.operateType = builder.operateType;
        this.spaceType = builder.spaceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSpaceModelSortRequest create() {
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
     * @return spaceType
     */
    public String getSpaceType() {
        return this.spaceType;
    }

    public static final class Builder extends Request.Builder<GetSpaceModelSortRequest, Builder> {
        private String instanceId; 
        private String operateType; 
        private String spaceType; 

        private Builder() {
            super();
        } 

        private Builder(GetSpaceModelSortRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.operateType = request.operateType;
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
         * SpaceType.
         */
        public Builder spaceType(String spaceType) {
            this.putQueryParameter("SpaceType", spaceType);
            this.spaceType = spaceType;
            return this;
        }

        @Override
        public GetSpaceModelSortRequest build() {
            return new GetSpaceModelSortRequest(this);
        } 

    } 

}
