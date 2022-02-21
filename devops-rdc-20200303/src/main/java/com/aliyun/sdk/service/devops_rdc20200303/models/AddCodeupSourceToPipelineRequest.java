// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCodeupSourceToPipelineRequest} extends {@link RequestModel}
 *
 * <p>AddCodeupSourceToPipelineRequest</p>
 */
public class AddCodeupSourceToPipelineRequest extends Request {
    @Query
    @NameInMap("CodeBranch")
    private String codeBranch;

    @Query
    @NameInMap("CodePath")
    @Validation(required = true)
    private String codePath;

    @Query
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Query
    @NameInMap("PipelineId")
    @Validation(required = true)
    private Long pipelineId;

    private AddCodeupSourceToPipelineRequest(Builder builder) {
        super(builder);
        this.codeBranch = builder.codeBranch;
        this.codePath = builder.codePath;
        this.orgId = builder.orgId;
        this.pipelineId = builder.pipelineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCodeupSourceToPipelineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codeBranch
     */
    public String getCodeBranch() {
        return this.codeBranch;
    }

    /**
     * @return codePath
     */
    public String getCodePath() {
        return this.codePath;
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return pipelineId
     */
    public Long getPipelineId() {
        return this.pipelineId;
    }

    public static final class Builder extends Request.Builder<AddCodeupSourceToPipelineRequest, Builder> {
        private String codeBranch; 
        private String codePath; 
        private String orgId; 
        private Long pipelineId; 

        private Builder() {
            super();
        } 

        private Builder(AddCodeupSourceToPipelineRequest response) {
            super(response);
            this.codeBranch = response.codeBranch;
            this.codePath = response.codePath;
            this.orgId = response.orgId;
            this.pipelineId = response.pipelineId;
        } 

        /**
         * 代码库分支
         */
        public Builder codeBranch(String codeBranch) {
            this.putQueryParameter("CodeBranch", codeBranch);
            this.codeBranch = codeBranch;
            return this;
        }

        /**
         * Codeup的代码库路径，比如 group1/repo1
         */
        public Builder codePath(String codePath) {
            this.putQueryParameter("CodePath", codePath);
            this.codePath = codePath;
            return this;
        }

        /**
         * OrgId.
         */
        public Builder orgId(String orgId) {
            this.putQueryParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * 流水线ID
         */
        public Builder pipelineId(Long pipelineId) {
            this.putQueryParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        @Override
        public AddCodeupSourceToPipelineRequest build() {
            return new AddCodeupSourceToPipelineRequest(this);
        } 

    } 

}
