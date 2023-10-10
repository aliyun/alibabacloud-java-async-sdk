// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeployApplicationRequest} extends {@link RequestModel}
 *
 * <p>DeployApplicationRequest</p>
 */
public class DeployApplicationRequest extends Request {
    @Query
    @NameInMap("AppEnv")
    private String appEnv;

    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("Batch")
    private Integer batch;

    @Query
    @NameInMap("BatchWaitTime")
    private Integer batchWaitTime;

    @Query
    @NameInMap("BuildPackId")
    private Long buildPackId;

    @Query
    @NameInMap("ComponentIds")
    private String componentIds;

    @Query
    @NameInMap("DeployType")
    @Validation(required = true)
    private String deployType;

    @Query
    @NameInMap("Desc")
    private String desc;

    @Query
    @NameInMap("Gray")
    private Boolean gray;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("ImageUrl")
    private String imageUrl;

    @Query
    @NameInMap("PackageVersion")
    @Validation(required = true)
    private String packageVersion;

    @Query
    @NameInMap("ReleaseType")
    private Long releaseType;

    @Query
    @NameInMap("TrafficControlStrategy")
    private String trafficControlStrategy;

    @Query
    @NameInMap("WarUrl")
    private String warUrl;

    private DeployApplicationRequest(Builder builder) {
        super(builder);
        this.appEnv = builder.appEnv;
        this.appId = builder.appId;
        this.batch = builder.batch;
        this.batchWaitTime = builder.batchWaitTime;
        this.buildPackId = builder.buildPackId;
        this.componentIds = builder.componentIds;
        this.deployType = builder.deployType;
        this.desc = builder.desc;
        this.gray = builder.gray;
        this.groupId = builder.groupId;
        this.imageUrl = builder.imageUrl;
        this.packageVersion = builder.packageVersion;
        this.releaseType = builder.releaseType;
        this.trafficControlStrategy = builder.trafficControlStrategy;
        this.warUrl = builder.warUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployApplicationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appEnv
     */
    public String getAppEnv() {
        return this.appEnv;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return batch
     */
    public Integer getBatch() {
        return this.batch;
    }

    /**
     * @return batchWaitTime
     */
    public Integer getBatchWaitTime() {
        return this.batchWaitTime;
    }

    /**
     * @return buildPackId
     */
    public Long getBuildPackId() {
        return this.buildPackId;
    }

    /**
     * @return componentIds
     */
    public String getComponentIds() {
        return this.componentIds;
    }

    /**
     * @return deployType
     */
    public String getDeployType() {
        return this.deployType;
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return gray
     */
    public Boolean getGray() {
        return this.gray;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return packageVersion
     */
    public String getPackageVersion() {
        return this.packageVersion;
    }

    /**
     * @return releaseType
     */
    public Long getReleaseType() {
        return this.releaseType;
    }

    /**
     * @return trafficControlStrategy
     */
    public String getTrafficControlStrategy() {
        return this.trafficControlStrategy;
    }

    /**
     * @return warUrl
     */
    public String getWarUrl() {
        return this.warUrl;
    }

    public static final class Builder extends Request.Builder<DeployApplicationRequest, Builder> {
        private String appEnv; 
        private String appId; 
        private Integer batch; 
        private Integer batchWaitTime; 
        private Long buildPackId; 
        private String componentIds; 
        private String deployType; 
        private String desc; 
        private Boolean gray; 
        private String groupId; 
        private String imageUrl; 
        private String packageVersion; 
        private Long releaseType; 
        private String trafficControlStrategy; 
        private String warUrl; 

        private Builder() {
            super();
        } 

        private Builder(DeployApplicationRequest request) {
            super(request);
            this.appEnv = request.appEnv;
            this.appId = request.appId;
            this.batch = request.batch;
            this.batchWaitTime = request.batchWaitTime;
            this.buildPackId = request.buildPackId;
            this.componentIds = request.componentIds;
            this.deployType = request.deployType;
            this.desc = request.desc;
            this.gray = request.gray;
            this.groupId = request.groupId;
            this.imageUrl = request.imageUrl;
            this.packageVersion = request.packageVersion;
            this.releaseType = request.releaseType;
            this.trafficControlStrategy = request.trafficControlStrategy;
            this.warUrl = request.warUrl;
        } 

        /**
         * The environment variables of the application. Specify each environment variable by using two key-value pairs. Example: `{"name":"x","value":"y"},{"name":"x2","value":"y2"}`. The `keys` of the two key-value pairs are `name` and `value`.
         */
        public Builder appEnv(String appEnv) {
            this.putQueryParameter("AppEnv", appEnv);
            this.appEnv = appEnv;
            return this;
        }

        /**
         * The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see [ListApplication](~~423162~~).
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The number of batches per instance group.
         * <p>
         * 
         * *   If you specify an ID when you set the GroupId parameter, the application is deployed to the specified instance group. The minimum number of batches that can be specified is 1. The maximum number of batches is the maximum number of ECS instances in the Normal state in the instance group. The actual value falls in the range of \[1, specified number]. The specified number of batches equals the number of ECS instances in the specified instance group.
         * *   If you set the GroupId parameter to all, the application is deployed to all instance groups. The minimum number of batches that can be specified is 1. The maximum number of batches is the number of ECS instances in the instance group that has the largest number of ECS instances in the Normal state.
         */
        public Builder batch(Integer batch) {
            this.putQueryParameter("Batch", batch);
            this.batch = batch;
            return this;
        }

        /**
         * The wait time between deployment batches for the application. Unit: minutes.
         * <p>
         * 
         * *   Default value: 0. If no wait time between deployment batches is needed, set this parameter to 0.
         * *   Maximum value: 5.
         * 
         * If many deployment batches are needed, we recommend that you specify a small value for this parameter. Otherwise, the application deployment is time-consuming.
         */
        public Builder batchWaitTime(Integer batchWaitTime) {
            this.putQueryParameter("BatchWaitTime", batchWaitTime);
            this.batchWaitTime = batchWaitTime;
            return this;
        }

        /**
         * The build package number of EDAS Container.
         * <p>
         * 
         * *   You do not need to set the parameter if you do not need to change the EDAS Container version during the deployment.
         * *   Set the parameter if you need to update the EDAS Container version of the application during the deployment.
         * 
         * You can query the build package number by using one of the following methods:
         * 
         * *   Call the ListBuildPack operation. For more information, see [ListBuildPack](~~149391~~).
         * *   Obtain the value in the **Build package number** column of the [Release notes for EDAS Container](~~92614~~) topic. For example, `59` indicates `EDAS Container 3.5.8`.
         */
        public Builder buildPackId(Long buildPackId) {
            this.putQueryParameter("BuildPackId", buildPackId);
            this.buildPackId = buildPackId;
            return this;
        }

        /**
         * The IDs of the components used by the application. The parameter is not applicable to High-Speed Framework (HSF) applications. You can call the ListComponents operation to query the component IDs. For more information, see [ListComponents](~~423223~~).
         * <p>
         * 
         * *   If you have specified the component IDs when you create the application, you do not need to set the parameter when you deploy the application.
         * *   Set the parameter if you need to update the component versions for the application during the deployment.
         * 
         * Valid values for common application components:
         * 
         * *   4: Apache Tomcat 7.0.91
         * *   7: Apache Tomcat 8.5.42
         * *   5: OpenJDK 1.8.x
         * *   6: OpenJDK 1.7.x
         * 
         * For more information, see the Common application parameters section of the [InsertApplication](~~423185~~) topic.
         */
        public Builder componentIds(String componentIds) {
            this.putQueryParameter("ComponentIds", componentIds);
            this.componentIds = componentIds;
            return this;
        }

        /**
         * The deployment mode of the application. Valid values: `url` and `image`. The image value is deprecated. You can deploy an application to a Swarm cluster only by using an image.``
         */
        public Builder deployType(String deployType) {
            this.putQueryParameter("DeployType", deployType);
            this.deployType = deployType;
            return this;
        }

        /**
         * The description of the application deployment.
         */
        public Builder desc(String desc) {
            this.putQueryParameter("Desc", desc);
            this.desc = desc;
            return this;
        }

        /**
         * Specifies whether canary release is selected as the deployment method. Valid values:
         * <p>
         * 
         * *   true: Canary release is selected.
         * 
         *     *   To implement a canary release, specify the GroupId parameter, which specifies the ID of the instance group for the canary release.
         *     *   Canary release can be selected as the deployment method for only one batch.
         *     *   After the canary release is complete, the application is released in regular mode. The Batch parameter specifies the number of batches.
         * 
         * *   false: Single-batch release or phased release is selected.
         */
        public Builder gray(Boolean gray) {
            this.putQueryParameter("Gray", gray);
            this.gray = gray;
            return this;
        }

        /**
         * The ID of the instance group to which the application is deployed. You can call the ListDeployGroup operation to query the ID of the instance group. For more information, see [ListDeployGroup](~~423184~~).
         * <p>
         * 
         * Set the parameter to `all` if you want to deploy the application to all instance groups.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The URL of the application image that is used to deploy the application in a Swarm cluster. We recommend that you use an image that is stored in Alibaba Cloud Container Registry. This parameter is deprecated.
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * The version of the application deployment package. The value can be up to 64 characters in length. We recommend that you use a timestamp.
         */
        public Builder packageVersion(String packageVersion) {
            this.putQueryParameter("PackageVersion", packageVersion);
            this.packageVersion = packageVersion;
            return this;
        }

        /**
         * The mode in which the deployment batches are triggered. Valid values:
         * <p>
         * 
         * *   0: automatic.
         * *   1: You must manually trigger the next batch. You can manually click **Proceed to Next Batch** in the console or call the ContinuePipeline operation to proceed to the next batch. We recommend that you choose the automatic mode when you call an API operation to deploy the application. For more information, see [ContinuePipeline](~~126990~~).
         */
        public Builder releaseType(Long releaseType) {
            this.putQueryParameter("ReleaseType", releaseType);
            this.releaseType = releaseType;
            return this;
        }

        /**
         * The canary release policy. For more information about canary release policies, see [DeployK8sApplication](~~423212~~).
         */
        public Builder trafficControlStrategy(String trafficControlStrategy) {
            this.putQueryParameter("TrafficControlStrategy", trafficControlStrategy);
            this.trafficControlStrategy = trafficControlStrategy;
            return this;
        }

        /**
         * The URL of the application deployment package. The package can be a WAR or JAR package. This parameter is required if you set the **DeployType** parameter to `url`. We recommend that you specify the URL of an application deployment package that is stored in an Object Storage Service (OSS) bucket.
         */
        public Builder warUrl(String warUrl) {
            this.putQueryParameter("WarUrl", warUrl);
            this.warUrl = warUrl;
            return this;
        }

        @Override
        public DeployApplicationRequest build() {
            return new DeployApplicationRequest(this);
        } 

    } 

}
