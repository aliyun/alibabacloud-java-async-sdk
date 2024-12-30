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
 * {@link PausePhysicalNodeRequest} extends {@link RequestModel}
 *
 * <p>PausePhysicalNodeRequest</p>
 */
public class PausePhysicalNodeRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("PauseCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private PauseCommand pauseCommand;

    private PausePhysicalNodeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.env = builder.env;
        this.opTenantId = builder.opTenantId;
        this.pauseCommand = builder.pauseCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PausePhysicalNodeRequest create() {
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
     * @return pauseCommand
     */
    public PauseCommand getPauseCommand() {
        return this.pauseCommand;
    }

    public static final class Builder extends Request.Builder<PausePhysicalNodeRequest, Builder> {
        private String regionId; 
        private String env; 
        private Long opTenantId; 
        private PauseCommand pauseCommand; 

        private Builder() {
            super();
        } 

        private Builder(PausePhysicalNodeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.env = request.env;
            this.opTenantId = request.opTenantId;
            this.pauseCommand = request.pauseCommand;
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
        public Builder pauseCommand(PauseCommand pauseCommand) {
            String pauseCommandShrink = shrink(pauseCommand, "PauseCommand", "json");
            this.putBodyParameter("PauseCommand", pauseCommandShrink);
            this.pauseCommand = pauseCommand;
            return this;
        }

        @Override
        public PausePhysicalNodeRequest build() {
            return new PausePhysicalNodeRequest(this);
        } 

    } 

    /**
     * 
     * {@link PausePhysicalNodeRequest} extends {@link TeaModel}
     *
     * <p>PausePhysicalNodeRequest</p>
     */
    public static class PauseCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeIdList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> nodeIdList;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long projectId;

        private PauseCommand(Builder builder) {
            this.nodeIdList = builder.nodeIdList;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PauseCommand create() {
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
             * <p>13222210</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            public PauseCommand build() {
                return new PauseCommand(this);
            } 

        } 

    }
}
