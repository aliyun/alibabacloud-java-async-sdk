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
 * {@link GetDeploymentBySelectorRequest} extends {@link RequestModel}
 *
 * <p>GetDeploymentBySelectorRequest</p>
 */
public class GetDeploymentBySelectorRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GuestCluster")
    private String guestCluster;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelSelector")
    private java.util.Map<String, String> labelSelector;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Long limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Mark")
    private String mark;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NameSpace")
    private String nameSpace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceMeshId;

    private GetDeploymentBySelectorRequest(Builder builder) {
        super(builder);
        this.guestCluster = builder.guestCluster;
        this.labelSelector = builder.labelSelector;
        this.limit = builder.limit;
        this.mark = builder.mark;
        this.nameSpace = builder.nameSpace;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeploymentBySelectorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return guestCluster
     */
    public String getGuestCluster() {
        return this.guestCluster;
    }

    /**
     * @return labelSelector
     */
    public java.util.Map<String, String> getLabelSelector() {
        return this.labelSelector;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return mark
     */
    public String getMark() {
        return this.mark;
    }

    /**
     * @return nameSpace
     */
    public String getNameSpace() {
        return this.nameSpace;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<GetDeploymentBySelectorRequest, Builder> {
        private String guestCluster; 
        private java.util.Map<String, String> labelSelector; 
        private Long limit; 
        private String mark; 
        private String nameSpace; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(GetDeploymentBySelectorRequest request) {
            super(request);
            this.guestCluster = request.guestCluster;
            this.labelSelector = request.labelSelector;
            this.limit = request.limit;
            this.mark = request.mark;
            this.nameSpace = request.nameSpace;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cbe80a56d07ed45818b4d39273e23****</p>
         */
        public Builder guestCluster(String guestCluster) {
            this.putBodyParameter("GuestCluster", guestCluster);
            this.guestCluster = guestCluster;
            return this;
        }

        /**
         * <p>The label selector information.</p>
         */
        public Builder labelSelector(java.util.Map<String, String> labelSelector) {
            String labelSelectorShrink = shrink(labelSelector, "LabelSelector", "json");
            this.putBodyParameter("LabelSelector", labelSelectorShrink);
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * <p>The maximum number of returned data entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limit(Long limit) {
            this.putBodyParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The marker of data queried last time.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJ2IjoibWV0YS5rOHMuaW8vdjEiLCJydiI6NzgxODk3MCwic3RhcnQiOiJuZ2lueDQ1N1x1MDAw****</p>
         */
        public Builder mark(String mark) {
            this.putBodyParameter("Mark", mark);
            this.mark = mark;
            return this;
        }

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder nameSpace(String nameSpace) {
            this.putBodyParameter("NameSpace", nameSpace);
            this.nameSpace = nameSpace;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud Service Mesh (ASM) instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ce9fc65def2aa4c918747b9360fbd****</p>
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public GetDeploymentBySelectorRequest build() {
            return new GetDeploymentBySelectorRequest(this);
        } 

    } 

}
