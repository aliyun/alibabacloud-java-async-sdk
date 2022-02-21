// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkItemWorkFlowInfoRequest} extends {@link RequestModel}
 *
 * <p>GetWorkItemWorkFlowInfoRequest</p>
 */
public class GetWorkItemWorkFlowInfoRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Path
    @NameInMap("workitemId")
    private String workitemId;

    @Query
    @NameInMap("configurationId")
    @Validation(required = true)
    private String configurationId;

    private GetWorkItemWorkFlowInfoRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.workitemId = builder.workitemId;
        this.configurationId = builder.configurationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkItemWorkFlowInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return workitemId
     */
    public String getWorkitemId() {
        return this.workitemId;
    }

    /**
     * @return configurationId
     */
    public String getConfigurationId() {
        return this.configurationId;
    }

    public static final class Builder extends Request.Builder<GetWorkItemWorkFlowInfoRequest, Builder> {
        private String organizationId; 
        private String workitemId; 
        private String configurationId; 

        private Builder() {
            super();
        } 

        private Builder(GetWorkItemWorkFlowInfoRequest response) {
            super(response);
            this.organizationId = response.organizationId;
            this.workitemId = response.workitemId;
            this.configurationId = response.configurationId;
        } 

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * 工作项id
         */
        public Builder workitemId(String workitemId) {
            this.putPathParameter("workitemId", workitemId);
            this.workitemId = workitemId;
            return this;
        }

        /**
         * 项目id
         */
        public Builder configurationId(String configurationId) {
            this.putQueryParameter("configurationId", configurationId);
            this.configurationId = configurationId;
            return this;
        }

        @Override
        public GetWorkItemWorkFlowInfoRequest build() {
            return new GetWorkItemWorkFlowInfoRequest(this);
        } 

    } 

}
