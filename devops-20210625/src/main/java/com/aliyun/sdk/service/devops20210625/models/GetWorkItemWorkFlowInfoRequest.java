// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link GetWorkItemWorkFlowInfoRequest} extends {@link RequestModel}
 *
 * <p>GetWorkItemWorkFlowInfoRequest</p>
 */
public class GetWorkItemWorkFlowInfoRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workitemId")
    private String workitemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("configurationId")
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

        private Builder(GetWorkItemWorkFlowInfoRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.workitemId = request.workitemId;
            this.configurationId = request.configurationId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5ebbc0228123212b59xxxxx</p>
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * workitemId.
         */
        public Builder workitemId(String workitemId) {
            this.putPathParameter("workitemId", workitemId);
            this.workitemId = workitemId;
            return this;
        }

        /**
         * configurationId.
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
