// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPhysicalSpaceRequest} extends {@link RequestModel}
 *
 * <p>GetPhysicalSpaceRequest</p>
 */
public class GetPhysicalSpaceRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PhysicalSpaceId")
    @Validation(required = true)
    private String physicalSpaceId;

    private GetPhysicalSpaceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.physicalSpaceId = builder.physicalSpaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPhysicalSpaceRequest create() {
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
     * @return physicalSpaceId
     */
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

    public static final class Builder extends Request.Builder<GetPhysicalSpaceRequest, Builder> {
        private String instanceId; 
        private String physicalSpaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetPhysicalSpaceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.physicalSpaceId = request.physicalSpaceId;
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
         * PhysicalSpaceId.
         */
        public Builder physicalSpaceId(String physicalSpaceId) {
            this.putQueryParameter("PhysicalSpaceId", physicalSpaceId);
            this.physicalSpaceId = physicalSpaceId;
            return this;
        }

        @Override
        public GetPhysicalSpaceRequest build() {
            return new GetPhysicalSpaceRequest(this);
        } 

    } 

}
