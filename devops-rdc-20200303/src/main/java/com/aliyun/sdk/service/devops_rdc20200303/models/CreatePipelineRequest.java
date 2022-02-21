// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePipelineRequest} extends {@link RequestModel}
 *
 * <p>CreatePipelineRequest</p>
 */
public class CreatePipelineRequest extends Request {
    @Body
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Body
    @NameInMap("Pipeline")
    @Validation(required = true)
    private String pipeline;

    @Body
    @NameInMap("UserPk")
    private String userPk;

    private CreatePipelineRequest(Builder builder) {
        super(builder);
        this.orgId = builder.orgId;
        this.pipeline = builder.pipeline;
        this.userPk = builder.userPk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePipelineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return pipeline
     */
    public String getPipeline() {
        return this.pipeline;
    }

    /**
     * @return userPk
     */
    public String getUserPk() {
        return this.userPk;
    }

    public static final class Builder extends Request.Builder<CreatePipelineRequest, Builder> {
        private String orgId; 
        private String pipeline; 
        private String userPk; 

        private Builder() {
            super();
        } 

        private Builder(CreatePipelineRequest response) {
            super(response);
            this.orgId = response.orgId;
            this.pipeline = response.pipeline;
            this.userPk = response.userPk;
        } 

        /**
         * OrgId.
         */
        public Builder orgId(String orgId) {
            this.putBodyParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * Pipeline.
         */
        public Builder pipeline(String pipeline) {
            this.putBodyParameter("Pipeline", pipeline);
            this.pipeline = pipeline;
            return this;
        }

        /**
         * UserPk.
         */
        public Builder userPk(String userPk) {
            this.putBodyParameter("UserPk", userPk);
            this.userPk = userPk;
            return this;
        }

        @Override
        public CreatePipelineRequest build() {
            return new CreatePipelineRequest(this);
        } 

    } 

}
