// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFlowNodeInstanceContainerLogRequest} extends {@link RequestModel}
 *
 * <p>DescribeFlowNodeInstanceContainerLogRequest</p>
 */
public class DescribeFlowNodeInstanceContainerLogRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("ContainerId")
    @Validation(required = true)
    private String containerId;

    @Query
    @NameInMap("Length")
    private Integer length;

    @Query
    @NameInMap("LogName")
    @Validation(required = true)
    private String logName;

    @Query
    @NameInMap("NodeInstanceId")
    @Validation(required = true)
    private String nodeInstanceId;

    @Query
    @NameInMap("Offset")
    private Integer offset;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeFlowNodeInstanceContainerLogRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.containerId = builder.containerId;
        this.length = builder.length;
        this.logName = builder.logName;
        this.nodeInstanceId = builder.nodeInstanceId;
        this.offset = builder.offset;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFlowNodeInstanceContainerLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return containerId
     */
    public String getContainerId() {
        return this.containerId;
    }

    /**
     * @return length
     */
    public Integer getLength() {
        return this.length;
    }

    /**
     * @return logName
     */
    public String getLogName() {
        return this.logName;
    }

    /**
     * @return nodeInstanceId
     */
    public String getNodeInstanceId() {
        return this.nodeInstanceId;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeFlowNodeInstanceContainerLogRequest, Builder> {
        private String appId; 
        private String containerId; 
        private Integer length; 
        private String logName; 
        private String nodeInstanceId; 
        private Integer offset; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFlowNodeInstanceContainerLogRequest response) {
            super(response);
            this.appId = response.appId;
            this.containerId = response.containerId;
            this.length = response.length;
            this.logName = response.logName;
            this.nodeInstanceId = response.nodeInstanceId;
            this.offset = response.offset;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * ContainerId.
         */
        public Builder containerId(String containerId) {
            this.putQueryParameter("ContainerId", containerId);
            this.containerId = containerId;
            return this;
        }

        /**
         * Length.
         */
        public Builder length(Integer length) {
            this.putQueryParameter("Length", length);
            this.length = length;
            return this;
        }

        /**
         * LogName.
         */
        public Builder logName(String logName) {
            this.putQueryParameter("LogName", logName);
            this.logName = logName;
            return this;
        }

        /**
         * NodeInstanceId.
         */
        public Builder nodeInstanceId(String nodeInstanceId) {
            this.putQueryParameter("NodeInstanceId", nodeInstanceId);
            this.nodeInstanceId = nodeInstanceId;
            return this;
        }

        /**
         * Offset.
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeFlowNodeInstanceContainerLogRequest build() {
            return new DescribeFlowNodeInstanceContainerLogRequest(this);
        } 

    } 

}
