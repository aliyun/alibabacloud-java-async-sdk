// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateSwimLaneRequest} extends {@link RequestModel}
 *
 * <p>UpdateSwimLaneRequest</p>
 */
public class UpdateSwimLaneRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelSelectorKey")
    private String labelSelectorKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelSelectorValue")
    private String labelSelectorValue;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceMeshId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServicesList")
    private String servicesList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SwimLaneName")
    private String swimLaneName;

    private UpdateSwimLaneRequest(Builder builder) {
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

    public static UpdateSwimLaneRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateSwimLaneRequest, Builder> {
        private String groupName; 
        private String labelSelectorKey; 
        private String labelSelectorValue; 
        private String serviceMeshId; 
        private String servicesList; 
        private String swimLaneName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSwimLaneRequest request) {
            super(request);
            this.groupName = request.groupName;
            this.labelSelectorKey = request.labelSelectorKey;
            this.labelSelectorValue = request.labelSelectorValue;
            this.serviceMeshId = request.serviceMeshId;
            this.servicesList = request.servicesList;
            this.swimLaneName = request.swimLaneName;
        } 

        /**
         * <p>The name of the lane group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder groupName(String groupName) {
            this.putBodyParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The label key of the associated service workload. Set the value to <code>ASM_TRAFFIC_TAG</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>ASM_TRAFFIC_TAG</p>
         */
        public Builder labelSelectorKey(String labelSelectorKey) {
            this.putBodyParameter("LabelSelectorKey", labelSelectorKey);
            this.labelSelectorKey = labelSelectorKey;
            return this;
        }

        /**
         * <p>The label value of the associated service workload.``</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder labelSelectorValue(String labelSelectorValue) {
            this.putBodyParameter("LabelSelectorValue", labelSelectorValue);
            this.labelSelectorValue = labelSelectorValue;
            return this;
        }

        /**
         * <p>The ID of the Service Mesh (ASM) instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        /**
         * <p>A list of services associated with the lane.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mocka&quot;,&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mockb&quot;,&quot;sh01/c089443ea9e50403fa4f0a6237d11e0a9/default/mockc&quot;]</p>
         */
        public Builder servicesList(String servicesList) {
            this.putBodyParameter("ServicesList", servicesList);
            this.servicesList = servicesList;
            return this;
        }

        /**
         * <p>The name of the lane.</p>
         * 
         * <strong>example:</strong>
         * <p>s1</p>
         */
        public Builder swimLaneName(String swimLaneName) {
            this.putBodyParameter("SwimLaneName", swimLaneName);
            this.swimLaneName = swimLaneName;
            return this;
        }

        @Override
        public UpdateSwimLaneRequest build() {
            return new UpdateSwimLaneRequest(this);
        } 

    } 

}
