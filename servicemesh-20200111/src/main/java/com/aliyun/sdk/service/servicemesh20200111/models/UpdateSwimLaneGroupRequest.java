// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSwimLaneGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateSwimLaneGroupRequest</p>
 */
public class UpdateSwimLaneGroupRequest extends Request {
    @Body
    @NameInMap("FallbackTarget")
    private String fallbackTarget;

    @Body
    @NameInMap("GroupName")
    private String groupName;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    @Body
    @NameInMap("ServicesList")
    private String servicesList;

    private UpdateSwimLaneGroupRequest(Builder builder) {
        super(builder);
        this.fallbackTarget = builder.fallbackTarget;
        this.groupName = builder.groupName;
        this.serviceMeshId = builder.serviceMeshId;
        this.servicesList = builder.servicesList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSwimLaneGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fallbackTarget
     */
    public String getFallbackTarget() {
        return this.fallbackTarget;
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

    /**
     * @return servicesList
     */
    public String getServicesList() {
        return this.servicesList;
    }

    public static final class Builder extends Request.Builder<UpdateSwimLaneGroupRequest, Builder> {
        private String fallbackTarget; 
        private String groupName; 
        private String serviceMeshId; 
        private String servicesList; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSwimLaneGroupRequest request) {
            super(request);
            this.fallbackTarget = request.fallbackTarget;
            this.groupName = request.groupName;
            this.serviceMeshId = request.serviceMeshId;
            this.servicesList = request.servicesList;
        } 

        /**
         * FallbackTarget.
         */
        public Builder fallbackTarget(String fallbackTarget) {
            this.putBodyParameter("FallbackTarget", fallbackTarget);
            this.fallbackTarget = fallbackTarget;
            return this;
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
         * The Service Mesh (ASM) instance ID.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        /**
         * A list of services associated with the lane group.
         */
        public Builder servicesList(String servicesList) {
            this.putBodyParameter("ServicesList", servicesList);
            this.servicesList = servicesList;
            return this;
        }

        @Override
        public UpdateSwimLaneGroupRequest build() {
            return new UpdateSwimLaneGroupRequest(this);
        } 

    } 

}
