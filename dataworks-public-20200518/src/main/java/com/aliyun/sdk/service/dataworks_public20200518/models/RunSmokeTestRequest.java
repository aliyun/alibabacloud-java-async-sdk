// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunSmokeTestRequest} extends {@link RequestModel}
 *
 * <p>RunSmokeTestRequest</p>
 */
public class RunSmokeTestRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Bizdate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizdate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long nodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeParams")
    private String nodeParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectEnv")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectEnv;

    private RunSmokeTestRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizdate = builder.bizdate;
        this.name = builder.name;
        this.nodeId = builder.nodeId;
        this.nodeParams = builder.nodeParams;
        this.projectEnv = builder.projectEnv;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunSmokeTestRequest create() {
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
     * @return bizdate
     */
    public String getBizdate() {
        return this.bizdate;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nodeId
     */
    public Long getNodeId() {
        return this.nodeId;
    }

    /**
     * @return nodeParams
     */
    public String getNodeParams() {
        return this.nodeParams;
    }

    /**
     * @return projectEnv
     */
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public static final class Builder extends Request.Builder<RunSmokeTestRequest, Builder> {
        private String regionId; 
        private String bizdate; 
        private String name; 
        private Long nodeId; 
        private String nodeParams; 
        private String projectEnv; 

        private Builder() {
            super();
        } 

        private Builder(RunSmokeTestRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizdate = request.bizdate;
            this.name = request.name;
            this.nodeId = request.nodeId;
            this.nodeParams = request.nodeParams;
            this.projectEnv = request.projectEnv;
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
         * The data timestamp.
         */
        public Builder bizdate(String bizdate) {
            this.putBodyParameter("Bizdate", bizdate);
            this.bizdate = bizdate;
            return this;
        }

        /**
         * The name of the workflow.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the node. You can call the [ListNodes](~~173979~~) operation to query the ID.
         */
        public Builder nodeId(Long nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The parameters related to the node. Set this parameter to a JSON string. A key in the string indicates a parameter, and a value in the string indicates the value of the related parameter.
         */
        public Builder nodeParams(String nodeParams) {
            this.putBodyParameter("NodeParams", nodeParams);
            this.nodeParams = nodeParams;
            return this;
        }

        /**
         * The environment of the workspace. Valid values: PROD and DEV. The value PROD indicates the production environment, and the value DEV indicates the development environment.
         * <p>
         * 
         * A workspace in basic mode does not have a development environment. For more information, see [Basic mode and standard mode](~~85772~~).
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        @Override
        public RunSmokeTestRequest build() {
            return new RunSmokeTestRequest(this);
        } 

    } 

}
