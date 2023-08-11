// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSwimLaneRequest} extends {@link RequestModel}
 *
 * <p>CreateSwimLaneRequest</p>
 */
public class CreateSwimLaneRequest extends Request {
    @Body
    @NameInMap("GroupName")
    private String groupName;

    @Body
    @NameInMap("LabelSelectorKey")
    private String labelSelectorKey;

    @Body
    @NameInMap("LabelSelectorValue")
    private String labelSelectorValue;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    @Body
    @NameInMap("ServicesList")
    private String servicesList;

    @Body
    @NameInMap("SwimLaneName")
    private String swimLaneName;

    private CreateSwimLaneRequest(Builder builder) {
        super(builder);
        this.groupName = builder.groupName;
        this.labelSelectorKey = builder.labelSelectorKey;
        this.labelSelectorValue = builder.labelSelectorValue;
        this.serviceMeshId = builder.serviceMeshId;
        this.servicesList = builder.servicesList;
        this.swimLaneName = builder.swimLaneName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSwimLaneRequest create() {
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
     * @return labelSelectorKey
     */
    public String getLabelSelectorKey() {
        return this.labelSelectorKey;
    }

    /**
     * @return labelSelectorValue
     */
    public String getLabelSelectorValue() {
        return this.labelSelectorValue;
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

    /**
     * @return swimLaneName
     */
    public String getSwimLaneName() {
        return this.swimLaneName;
    }

    public static final class Builder extends Request.Builder<CreateSwimLaneRequest, Builder> {
        private String groupName; 
        private String labelSelectorKey; 
        private String labelSelectorValue; 
        private String serviceMeshId; 
        private String servicesList; 
        private String swimLaneName; 

        private Builder() {
            super();
        } 

        private Builder(CreateSwimLaneRequest request) {
            super(request);
            this.groupName = request.groupName;
            this.labelSelectorKey = request.labelSelectorKey;
            this.labelSelectorValue = request.labelSelectorValue;
            this.serviceMeshId = request.serviceMeshId;
            this.servicesList = request.servicesList;
            this.swimLaneName = request.swimLaneName;
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
         * The label key of the associated service workload. Set the value to `ASM_TRAFFIC_TAG`.
         */
        public Builder labelSelectorKey(String labelSelectorKey) {
            this.putBodyParameter("LabelSelectorKey", labelSelectorKey);
            this.labelSelectorKey = labelSelectorKey;
            return this;
        }

        /**
         * The label value of the associated service workload.``
         */
        public Builder labelSelectorValue(String labelSelectorValue) {
            this.putBodyParameter("LabelSelectorValue", labelSelectorValue);
            this.labelSelectorValue = labelSelectorValue;
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

        /**
         * The list of services associated with the lane. The value is a JSON array. The format of a single service is `$Cluster name /$Cluster ID/$Namespace/$Service name`.
         */
        public Builder servicesList(String servicesList) {
            this.putBodyParameter("ServicesList", servicesList);
            this.servicesList = servicesList;
            return this;
        }

        /**
         * The name of the lane.
         */
        public Builder swimLaneName(String swimLaneName) {
            this.putBodyParameter("SwimLaneName", swimLaneName);
            this.swimLaneName = swimLaneName;
            return this;
        }

        @Override
        public CreateSwimLaneRequest build() {
            return new CreateSwimLaneRequest(this);
        } 

    } 

}
