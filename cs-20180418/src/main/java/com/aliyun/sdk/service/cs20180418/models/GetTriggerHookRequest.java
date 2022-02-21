// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20180418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTriggerHookRequest} extends {@link RequestModel}
 *
 * <p>GetTriggerHookRequest</p>
 */
public class GetTriggerHookRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    private GetTriggerHookRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTriggerHookRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<GetTriggerHookRequest, Builder> {
        private String clusterId; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(GetTriggerHookRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.projectId = response.projectId;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putPathParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public GetTriggerHookRequest build() {
            return new GetTriggerHookRequest(this);
        } 

    } 

}
