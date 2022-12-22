// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.composer20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVersionRequest} extends {@link RequestModel}
 *
 * <p>GetVersionRequest</p>
 */
public class GetVersionRequest extends Request {
    @Body
    @NameInMap("FlowId")
    @Validation(required = true)
    private String flowId;

    @Body
    @NameInMap("VersionId")
    @Validation(required = true)
    private String versionId;

    private GetVersionRequest(Builder builder) {
        super(builder);
        this.flowId = builder.flowId;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVersionRequest create() {
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

    public static final class Builder extends Request.Builder<GetVersionRequest, Builder> {
        private String flowId; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(GetVersionRequest request) {
            super(request);
            this.flowId = request.flowId;
            this.versionId = request.versionId;
        } 

        /**
         * The ID of the workflow.
         */
        public Builder flowId(String flowId) {
            this.putBodyParameter("FlowId", flowId);
            this.flowId = flowId;
            return this;
        }

        /**
         * The ID of the version.
         */
        public Builder versionId(String versionId) {
            this.putBodyParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public GetVersionRequest build() {
            return new GetVersionRequest(this);
        } 

    } 

}
