// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.composer20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloneFlowRequest} extends {@link RequestModel}
 *
 * <p>CloneFlowRequest</p>
 */
public class CloneFlowRequest extends Request {
    @Body
    @NameInMap("FlowId")
    @Validation(required = true)
    private String flowId;

    @Body
    @NameInMap("VersionId")
    private String versionId;

    private CloneFlowRequest(Builder builder) {
        super(builder);
        this.flowId = builder.flowId;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneFlowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flowId
     */
    public String getFlowId() {
        return this.flowId;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<CloneFlowRequest, Builder> {
        private String flowId; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(CloneFlowRequest request) {
            super(request);
            this.flowId = request.flowId;
            this.versionId = request.versionId;
        } 

        /**
         * The ID of the workflow that you want to clone.
         */
        public Builder flowId(String flowId) {
            this.putBodyParameter("FlowId", flowId);
            this.flowId = flowId;
            return this;
        }

        /**
         * The version of the workflow that you want to clone. If you do not specify this parameter, the latest version of the workflow is cloned.
         */
        public Builder versionId(String versionId) {
            this.putBodyParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public CloneFlowRequest build() {
            return new CloneFlowRequest(this);
        } 

    } 

}
