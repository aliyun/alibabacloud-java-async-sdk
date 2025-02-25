// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ResumePhysicalNodeRequest} extends {@link RequestModel}
 *
 * <p>ResumePhysicalNodeRequest</p>
 */
public class ResumePhysicalNodeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Env")
    private String env;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResumeCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private ResumeCommand resumeCommand;

    private ResumePhysicalNodeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.env = builder.env;
        this.opTenantId = builder.opTenantId;
        this.resumeCommand = builder.resumeCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResumePhysicalNodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return resumeCommand
     */
    public ResumeCommand getResumeCommand() {
        return this.resumeCommand;
    }

    public static final class Builder extends Request.Builder<ResumePhysicalNodeRequest, Builder> {
        private String regionId; 
        private String env; 
        private Long opTenantId; 
        private ResumeCommand resumeCommand; 

        private Builder() {
            super();
        } 

        private Builder(ResumePhysicalNodeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.env = request.env;
            this.opTenantId = request.opTenantId;
            this.resumeCommand = request.resumeCommand;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Env.
         */
        public Builder env(String env) {
            this.putQueryParameter("Env", env);
            this.env = env;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder resumeCommand(ResumeCommand resumeCommand) {
            String resumeCommandShrink = shrink(resumeCommand, "ResumeCommand", "json");
            this.putBodyParameter("ResumeCommand", resumeCommandShrink);
            this.resumeCommand = resumeCommand;
            return this;
        }

        @Override
        public ResumePhysicalNodeRequest build() {
            return new ResumePhysicalNodeRequest(this);
        } 

    } 

    /**
     * 
     * {@link ResumePhysicalNodeRequest} extends {@link TeaModel}
     *
     * <p>ResumePhysicalNodeRequest</p>
     */
    public static class ResumeCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeIdList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> nodeIdList;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long projectId;

        private ResumeCommand(Builder builder) {
            this.nodeIdList = builder.nodeIdList;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResumeCommand create() {
            return builder().build();
        }

        /**
         * @return nodeIdList
         */
        public java.util.List<String> getNodeIdList() {
            return this.nodeIdList;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private java.util.List<String> nodeIdList; 
            private Long projectId; 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder nodeIdList(java.util.List<String> nodeIdList) {
                this.nodeIdList = nodeIdList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>102011</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            public ResumeCommand build() {
                return new ResumeCommand(this);
            } 

        } 

    }
}
