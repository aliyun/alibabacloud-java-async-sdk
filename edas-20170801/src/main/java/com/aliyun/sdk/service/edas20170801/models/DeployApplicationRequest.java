// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link DeployApplicationRequest} extends {@link RequestModel}
 *
 * <p>DeployApplicationRequest</p>
 */
public class DeployApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppEnv")
    private String appEnv;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Batch")
    private Integer batch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchWaitTime")
    private Integer batchWaitTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BuildPackId")
    private Long buildPackId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComponentIds")
    private String componentIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deployType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Desc")
    private String desc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Gray")
    private Boolean gray;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    private String imageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String packageVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReleaseType")
    private Long releaseType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficControlStrategy")
    private String trafficControlStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WarUrl")
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
         * <p>The environment variables of the application. Specify each environment variable by using two key-value pairs. Example: <code>{&quot;name&quot;:&quot;x&quot;,&quot;value&quot;:&quot;y&quot;},{&quot;name&quot;:&quot;x2&quot;,&quot;value&quot;:&quot;y2&quot;}</code>. The <code>keys</code> of the two key-value pairs are <code>name</code> and <code>value</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;env_name_1&quot;, &quot;value&quot;:&quot;env_value_1&quot;}, {&quot;name&quot;:&quot;env_name_2&quot;,&quot;value&quot;:&quot;env_value_2&quot;}]</p>
         */
        public Builder appEnv(String appEnv) {
            this.putQueryParameter("AppEnv", appEnv);
            this.appEnv = appEnv;
            return this;
        }

        /**
         * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/423162.html">ListApplication</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3616cdca-********************</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The number of batches per instance group.</p>
         * <ul>
         * <li>If you specify an ID when you set the GroupId parameter, the application is deployed to the specified instance group. The minimum number of batches that can be specified is 1. The maximum number of batches is the maximum number of ECS instances in the Normal state in the instance group. The actual value falls in the range of [1, specified number]. The specified number of batches equals the number of ECS instances in the specified instance group.</li>
         * <li>If you set the GroupId parameter to all, the application is deployed to all instance groups. The minimum number of batches that can be specified is 1. The maximum number of batches is the number of ECS instances in the instance group that has the largest number of ECS instances in the Normal state.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder batch(Integer batch) {
            this.putQueryParameter("Batch", batch);
            this.batch = batch;
            return this;
        }

        /**
         * <p>The wait time between deployment batches for the application. Unit: minutes.</p>
         * <ul>
         * <li>Default value: 0. If no wait time between deployment batches is needed, set this parameter to 0.</li>
         * <li>Maximum value: 5.</li>
         * </ul>
         * <p>If many deployment batches are needed, we recommend that you specify a small value for this parameter. Otherwise, the application deployment is time-consuming.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder batchWaitTime(Integer batchWaitTime) {
            this.putQueryParameter("BatchWaitTime", batchWaitTime);
            this.batchWaitTime = batchWaitTime;
            return this;
        }

        /**
         * <p>The build package number of EDAS Container.</p>
         * <ul>
         * <li>You do not need to set the parameter if you do not need to change the EDAS Container version during the deployment.</li>
         * <li>Set the parameter if you need to update the EDAS Container version of the application during the deployment.</li>
         * </ul>
         * <p>You can query the build package number by using one of the following methods:</p>
         * <ul>
         * <li>Call the ListBuildPack operation. For more information, see <a href="https://help.aliyun.com/document_detail/149391.html">ListBuildPack</a>.</li>
         * <li>Obtain the value in the <strong>Build package number</strong> column of the <a href="https://help.aliyun.com/document_detail/92614.html">Release notes for EDAS Container</a> topic. For example, <code>59</code> indicates <code>EDAS Container 3.5.8</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>59</p>
         */
        public Builder buildPackId(Long buildPackId) {
            this.putQueryParameter("BuildPackId", buildPackId);
            this.buildPackId = buildPackId;
            return this;
        }

        /**
         * <p>The IDs of the components used by the application. The parameter is not applicable to High-Speed Framework (HSF) applications. You can call the ListComponents operation to query the component IDs. For more information, see <a href="https://help.aliyun.com/document_detail/423223.html">ListComponents</a>.</p>
         * <ul>
         * <li>If you have specified the component IDs when you create the application, you do not need to set the parameter when you deploy the application.</li>
         * <li>Set the parameter if you need to update the component versions for the application during the deployment.</li>
         * </ul>
         * <p>Valid values for common application components:</p>
         * <ul>
         * <li>4: Apache Tomcat 7.0.91</li>
         * <li>7: Apache Tomcat 8.5.42</li>
         * <li>5: OpenJDK 1.8.x</li>
         * <li>6: OpenJDK 1.7.x</li>
         * </ul>
         * <p>For more information, see the Common application parameters section of the <a href="https://help.aliyun.com/document_detail/423185.html">InsertApplication</a> topic.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder componentIds(String componentIds) {
            this.putQueryParameter("ComponentIds", componentIds);
            this.componentIds = componentIds;
            return this;
        }

        /**
         * <p>The deployment mode of the application. Valid values: <code>url</code> and <code>image</code>. The image value is deprecated. You can deploy an application to a Swarm cluster only by using an image.``</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>URL</p>
         */
        public Builder deployType(String deployType) {
            this.putQueryParameter("DeployType", deployType);
            this.deployType = deployType;
            return this;
        }

        /**
         * <p>The description of the application deployment.</p>
         * 
         * <strong>example:</strong>
         * <p>Deploy by edas pop api</p>
         */
        public Builder desc(String desc) {
            this.putQueryParameter("Desc", desc);
            this.desc = desc;
            return this;
        }

        /**
         * <p>Specifies whether canary release is selected as the deployment method. Valid values:</p>
         * <ul>
         * <li><p>true: Canary release is selected.</p>
         * <ul>
         * <li>To implement a canary release, specify the GroupId parameter, which specifies the ID of the instance group for the canary release.</li>
         * <li>Canary release can be selected as the deployment method for only one batch.</li>
         * <li>After the canary release is complete, the application is released in regular mode. The Batch parameter specifies the number of batches.</li>
         * </ul>
         * </li>
         * <li><p>false: Single-batch release or phased release is selected.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder gray(Boolean gray) {
            this.putQueryParameter("Gray", gray);
            this.gray = gray;
            return this;
        }

        /**
         * <p>The ID of the instance group to which the application is deployed. You can call the ListDeployGroup operation to query the ID of the instance group. For more information, see <a href="https://help.aliyun.com/document_detail/423184.html">ListDeployGroup</a>.</p>
         * <p>Set the parameter to <code>all</code> if you want to deploy the application to all instance groups.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The URL of the application image that is used to deploy the application in a Swarm cluster. We recommend that you use an image that is stored in Alibaba Cloud Container Registry. This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-hangzhou.aliyuncs.com/mw/testapp:latest</p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>The version of the application deployment package. The value can be up to 64 characters in length. We recommend that you use a timestamp.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder packageVersion(String packageVersion) {
            this.putQueryParameter("PackageVersion", packageVersion);
            this.packageVersion = packageVersion;
            return this;
        }

        /**
         * <p>The mode in which the deployment batches are triggered. Valid values:</p>
         * <ul>
         * <li>0: automatic.</li>
         * <li>1: You must manually trigger the next batch. You can manually click <strong>Proceed to Next Batch</strong> in the console or call the ContinuePipeline operation to proceed to the next batch. We recommend that you choose the automatic mode when you call an API operation to deploy the application. For more information, see <a href="https://help.aliyun.com/document_detail/126990.html">ContinuePipeline</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder releaseType(Long releaseType) {
            this.putQueryParameter("ReleaseType", releaseType);
            this.releaseType = releaseType;
            return this;
        }

        /**
         * <p>The canary release policy. For more information about canary release policies, see <a href="https://help.aliyun.com/document_detail/423212.html">DeployK8sApplication</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;http&quot;:{&quot;rules&quot;:[{&quot;conditionType&quot;:&quot;percent&quot;,&quot;percent&quot;:10}]}}</p>
         */
        public Builder trafficControlStrategy(String trafficControlStrategy) {
            this.putQueryParameter("TrafficControlStrategy", trafficControlStrategy);
            this.trafficControlStrategy = trafficControlStrategy;
            return this;
        }

        /**
         * <p>The URL of the application deployment package. The package can be a WAR or JAR package. This parameter is required if you set the <strong>DeployType</strong> parameter to <code>url</code>. We recommend that you specify the URL of an application deployment package that is stored in an Object Storage Service (OSS) bucket.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://edas.oss-cn-hangzhou.aliyuncs.com/demo/hello-edas.war">https://edas.oss-cn-hangzhou.aliyuncs.com/demo/hello-edas.war</a></p>
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
