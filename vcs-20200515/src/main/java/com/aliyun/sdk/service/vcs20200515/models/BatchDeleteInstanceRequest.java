// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeleteInstanceRequest} extends {@link RequestModel}
 *
 * <p>BatchDeleteInstanceRequest</p>
 */
public class BatchDeleteInstanceRequest extends Request {
    @Body
    @NameInMap("InstanceIds")
    @Validation(required = true)
    private java.util.List < String > instanceIds;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    private BatchDeleteInstanceRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<BatchDeleteInstanceRequest, Builder> {
        private java.util.List < String > instanceIds; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeleteInstanceRequest response) {
            super(response);
            this.instanceIds = response.instanceIds;
            this.projectId = response.projectId;
        } 

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putBodyParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public BatchDeleteInstanceRequest build() {
            return new BatchDeleteInstanceRequest(this);
        } 

    } 

}
