// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RollbackApplicationRequest} extends {@link RequestModel}
 *
 * <p>RollbackApplicationRequest</p>
 */
public class RollbackApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoEnableApplicationScalingRule")
    private String autoEnableApplicationScalingRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchWaitTime")
    private Integer batchWaitTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinReadyInstanceRatio")
    private Integer minReadyInstanceRatio;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinReadyInstances")
    private Integer minReadyInstances;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateStrategy")
    private String updateStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String versionId;

    private RollbackApplicationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.autoEnableApplicationScalingRule = builder.autoEnableApplicationScalingRule;
        this.batchWaitTime = builder.batchWaitTime;
        this.minReadyInstanceRatio = builder.minReadyInstanceRatio;
        this.minReadyInstances = builder.minReadyInstances;
        this.updateStrategy = builder.updateStrategy;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RollbackApplicationRequest create() {
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
     * @return autoEnableApplicationScalingRule
     */
    public String getAutoEnableApplicationScalingRule() {
        return this.autoEnableApplicationScalingRule;
    }

    /**
     * @return batchWaitTime
     */
    public Integer getBatchWaitTime() {
        return this.batchWaitTime;
    }

    /**
     * @return minReadyInstanceRatio
     */
    public Integer getMinReadyInstanceRatio() {
        return this.minReadyInstanceRatio;
    }

    /**
     * @return minReadyInstances
     */
    public Integer getMinReadyInstances() {
        return this.minReadyInstances;
    }

    /**
     * @return updateStrategy
     */
    public String getUpdateStrategy() {
        return this.updateStrategy;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<RollbackApplicationRequest, Builder> {
        private String appId; 
        private String autoEnableApplicationScalingRule; 
        private Integer batchWaitTime; 
        private Integer minReadyInstanceRatio; 
        private Integer minReadyInstances; 
        private String updateStrategy; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(RollbackApplicationRequest request) {
            super(request);
            this.appId = request.appId;
            this.autoEnableApplicationScalingRule = request.autoEnableApplicationScalingRule;
            this.batchWaitTime = request.batchWaitTime;
            this.minReadyInstanceRatio = request.minReadyInstanceRatio;
            this.minReadyInstances = request.minReadyInstances;
            this.updateStrategy = request.updateStrategy;
            this.versionId = request.versionId;
        } 

        /**
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>017f39b8-dfa4-4e16-a84b-1dcee4b1****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>Specifies whether to automatically enable an auto scaling policy for the application. Take note of the following rules:</p>
         * <ul>
         * <li><strong>true</strong>: turns on Logon-free Sharing</li>
         * <li><strong>false</strong>: turns off Logon-free Sharing</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoEnableApplicationScalingRule(String autoEnableApplicationScalingRule) {
            this.putQueryParameter("AutoEnableApplicationScalingRule", autoEnableApplicationScalingRule);
            this.autoEnableApplicationScalingRule = autoEnableApplicationScalingRule;
            return this;
        }

        /**
         * <p>The wait time between batches. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder batchWaitTime(Integer batchWaitTime) {
            this.putQueryParameter("BatchWaitTime", batchWaitTime);
            this.batchWaitTime = batchWaitTime;
            return this;
        }

        /**
         * <p>The percentage of the minimum number of available instances. Take note of the following rules:</p>
         * <ul>
         * <li>If you set the value to <strong>-1</strong>, the minimum number of available instances is not determined based on this parameter. Default value: -1.</li>
         * <li>If you set the value to a number <strong>from 0 to 100</strong>, the minimum number of available instances is calculated by using the following formula: Current number of instances × (Value of MinReadyInstanceRatio × 100%). The value is the nearest integer rounded up from the calculated result. For example, if the percentage is set to <strong>50</strong>% and five instances are available, the minimum number of available instances is 3.</li>
         * </ul>
         * <blockquote>
         * <p>When both <strong>MinReadyInstance</strong> and <strong>MinReadyInstanceRatio</strong> are specified and <strong>MinReadyInstanceRatio</strong> is set to a number from 0 to 100, the value of <strong>MinReadyInstanceRatio</strong> takes precedence.** For example, if <strong>MinReadyInstances</strong> is set to **5, and <strong>MinReadyInstanceRatio</strong> is set to <strong>50</strong>, the minimum number of available instances is set to the nearest integer rounded up from the calculated result of the following formula: Current number of instances × <strong>50%</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder minReadyInstanceRatio(Integer minReadyInstanceRatio) {
            this.putQueryParameter("MinReadyInstanceRatio", minReadyInstanceRatio);
            this.minReadyInstanceRatio = minReadyInstanceRatio;
            return this;
        }

        /**
         * <p>The minimum number of available instances. Take note of the following rules:</p>
         * <ul>
         * <li>If you set the value to <strong>0</strong>, business interruptions occur when the application is updated.</li>
         * <li>If you set the value to **-1**, the minimum number of available instances is automatically set to a system-recommended value. The value is the nearest integer to which the calculated result of the following formula is rounded up: Current number of instances × 25%. For example, if five instances are available, the minimum number of available instances is calculated by using the following formula: 5 × 25% = 1.25. In this case, the minimum number of available instances is 2.</li>
         * </ul>
         * <blockquote>
         * <p>Make sure that at least one instance is available during application deployment and rollback to prevent business interruptions.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder minReadyInstances(Integer minReadyInstances) {
            this.putQueryParameter("MinReadyInstances", minReadyInstances);
            this.minReadyInstances = minReadyInstances;
            return this;
        }

        /**
         * <p>The deployment policy. If the minimum number of available instances is 1, the value of the <strong>UpdateStrategy</strong> parameter is an empty string (&quot;&quot;). If the minimum number of available instances is larger than 1, specify this parameter based on your requirements. Examples:</p>
         * <ul>
         * <li><p>Perform canary release for one instance and release the remaining instances in two batches automatically with a one-minute interval between the deployment of each instance:</p>
         * <p><code>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:1},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</code></p>
         * </li>
         * <li><p>Perform canary release for one instance and release the remaining instances in two batches manually:</p>
         * <p><code>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;manual&quot;},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</code></p>
         * </li>
         * <li><p>Release the instances in two batches automatically with no interval between the deployment of each instance:</p>
         * <p><code>{&quot;type&quot;:&quot;BatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:0}}</code></p>
         * </li>
         * </ul>
         * <p>The following table describes the parameters that are used in the preceding statements.</p>
         * <ul>
         * <li><p><strong>type</strong>: the type of the release policy. Valid values: <strong>GrayBatchUpdate</strong> and <strong>BatchUpdate</strong>.</p>
         * </li>
         * <li><p><strong>batchUpdate</strong>: the phased release policy.</p>
         * <ul>
         * <li><strong>batch</strong>: the number of release batches.</li>
         * <li><strong>releaseType</strong>: the processing method for the batches. Valid values: <strong>auto</strong> and <strong>manual</strong>.</li>
         * <li><strong>batchWaitTime</strong>: the interval between release batches. Unit: seconds.</li>
         * </ul>
         * </li>
         * <li><p><strong>grayUpdate</strong>: the number of release batches in the phased release after a canary release. This parameter is returned only if the <strong>type</strong> parameter is set to <strong>GrayBatchUpdate</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:1},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</p>
         */
        public Builder updateStrategy(String updateStrategy) {
            this.putQueryParameter("UpdateStrategy", updateStrategy);
            this.updateStrategy = updateStrategy;
            return this;
        }

        /**
         * <p>The ID of the application version. Call the <a href="https://help.aliyun.com/document_detail/162054.html">ListAppVersions</a> operation to obtain the version ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0026ff7f-2b57-4127-bdd0-9bf202bb9****</p>
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public RollbackApplicationRequest build() {
            return new RollbackApplicationRequest(this);
        } 

    } 

}
