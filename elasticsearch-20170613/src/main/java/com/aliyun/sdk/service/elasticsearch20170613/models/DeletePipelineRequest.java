// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePipelineRequest} extends {@link RequestModel}
 *
 * <p>DeletePipelineRequest</p>
 */
public class DeletePipelineRequest extends Request {
    @Path
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Path
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    private DeletePipelineRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePipelineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeletePipelineRequest, Builder> {
        private String projectId; 
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(DeletePipelineRequest response) {
            super(response);
            this.projectId = response.projectId;
            this.id = response.id;
        } 

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putPathParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putPathParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeletePipelineRequest build() {
            return new DeletePipelineRequest(this);
        } 

    } 

}
