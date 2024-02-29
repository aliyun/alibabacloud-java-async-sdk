// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDagTestRequest} extends {@link RequestModel}
 *
 * <p>CreateDagTestRequest</p>
 */
public class CreateDagTestRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Bizdate")
    @Validation(required = true)
    private String bizdate;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("NodeId")
    @Validation(required = true)
    private Long nodeId;

    @Body
    @NameInMap("NodeParams")
    private String nodeParams;

    @Body
    @NameInMap("ProjectEnv")
    @Validation(required = true)
    private String projectEnv;

    private CreateDagTestRequest(Builder builder) {
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

    public static CreateDagTestRequest create() {
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

    public static final class Builder extends Request.Builder<CreateDagTestRequest, Builder> {
        private String regionId; 
        private String bizdate; 
        private String name; 
        private Long nodeId; 
        private String nodeParams; 
        private String projectEnv; 

        private Builder() {
            super();
        } 

        private Builder(CreateDagTestRequest request) {
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
         * Bizdate.
         */
        public Builder bizdate(String bizdate) {
            this.putBodyParameter("Bizdate", bizdate);
            this.bizdate = bizdate;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NodeId.
         */
        public Builder nodeId(Long nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * NodeParams.
         */
        public Builder nodeParams(String nodeParams) {
            this.putBodyParameter("NodeParams", nodeParams);
            this.nodeParams = nodeParams;
            return this;
        }

        /**
         * ProjectEnv.
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        @Override
        public CreateDagTestRequest build() {
            return new CreateDagTestRequest(this);
        } 

    } 

}
