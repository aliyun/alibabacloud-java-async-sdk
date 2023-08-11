// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSwimLaneGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteSwimLaneGroupRequest</p>
 */
public class DeleteSwimLaneGroupRequest extends Request {
    @Body
    @NameInMap("GroupName")
    private String groupName;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private DeleteSwimLaneGroupRequest(Builder builder) {
        super(builder);
        this.groupName = builder.groupName;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSwimLaneGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<DeleteSwimLaneGroupRequest, Builder> {
        private String groupName; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSwimLaneGroupRequest request) {
            super(request);
            this.groupName = request.groupName;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * The name of the lane group.
         */
        public Builder groupName(String groupName) {
            this.putBodyParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * The ID of the ASM instance.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public DeleteSwimLaneGroupRequest build() {
            return new DeleteSwimLaneGroupRequest(this);
        } 

    } 

}
