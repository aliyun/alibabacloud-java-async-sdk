// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePhysicalSpaceRequest} extends {@link RequestModel}
 *
 * <p>DeletePhysicalSpaceRequest</p>
 */
public class DeletePhysicalSpaceRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("PhysicalSpaceId")
    @Validation(required = true)
    private String physicalSpaceId;

    private DeletePhysicalSpaceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.physicalSpaceId = builder.physicalSpaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePhysicalSpaceRequest create() {
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

    public static final class Builder extends Request.Builder<DeletePhysicalSpaceRequest, Builder> {
        private String instanceId; 
        private String physicalSpaceId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePhysicalSpaceRequest request) {
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
            this.putBodyParameter("PhysicalSpaceId", physicalSpaceId);
            this.physicalSpaceId = physicalSpaceId;
            return this;
        }

        @Override
        public DeletePhysicalSpaceRequest build() {
            return new DeletePhysicalSpaceRequest(this);
        } 

    } 

}
