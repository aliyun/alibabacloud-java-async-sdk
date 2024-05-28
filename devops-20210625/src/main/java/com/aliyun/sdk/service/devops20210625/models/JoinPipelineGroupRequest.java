// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JoinPipelineGroupRequest} extends {@link RequestModel}
 *
 * <p>JoinPipelineGroupRequest</p>
 */
public class JoinPipelineGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("groupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pipelineIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pipelineIds;

    private JoinPipelineGroupRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.groupId = builder.groupId;
        this.pipelineIds = builder.pipelineIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JoinPipelineGroupRequest create() {
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
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return pipelineIds
     */
    public String getPipelineIds() {
        return this.pipelineIds;
    }

    public static final class Builder extends Request.Builder<JoinPipelineGroupRequest, Builder> {
        private String organizationId; 
        private Long groupId; 
        private String pipelineIds; 

        private Builder() {
            super();
        } 

        private Builder(JoinPipelineGroupRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.groupId = request.groupId;
            this.pipelineIds = request.pipelineIds;
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
         * groupId.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("groupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * pipelineIds.
         */
        public Builder pipelineIds(String pipelineIds) {
            this.putQueryParameter("pipelineIds", pipelineIds);
            this.pipelineIds = pipelineIds;
            return this;
        }

        @Override
        public JoinPipelineGroupRequest build() {
            return new JoinPipelineGroupRequest(this);
        } 

    } 

}
