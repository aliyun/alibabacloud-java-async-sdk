// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RollbackApplicationRequest} extends {@link RequestModel}
 *
 * <p>RollbackApplicationRequest</p>
 */
public class RollbackApplicationRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("AutoEnableApplicationScalingRule")
    private String autoEnableApplicationScalingRule;

    @Query
    @NameInMap("BatchWaitTime")
    private Integer batchWaitTime;

    @Query
    @NameInMap("MinReadyInstanceRatio")
    private Integer minReadyInstanceRatio;

    @Query
    @NameInMap("MinReadyInstances")
    private Integer minReadyInstances;

    @Query
    @NameInMap("UpdateStrategy")
    private String updateStrategy;

    @Query
    @NameInMap("VersionId")
    @Validation(required = true)
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
         * The ID of the application.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Specifies whether to automatically enable an auto scaling policy for the application. Take note of the following rules:
         * <p>
         * 
         * *   **true**: turns on Logon-free Sharing
         * *   **false**: turns off Logon-free Sharing
         */
        public Builder autoEnableApplicationScalingRule(String autoEnableApplicationScalingRule) {
            this.putQueryParameter("AutoEnableApplicationScalingRule", autoEnableApplicationScalingRule);
            this.autoEnableApplicationScalingRule = autoEnableApplicationScalingRule;
            return this;
        }

        /**
         * The wait time between batches. Unit: seconds.
         */
        public Builder batchWaitTime(Integer batchWaitTime) {
            this.putQueryParameter("BatchWaitTime", batchWaitTime);
            this.batchWaitTime = batchWaitTime;
            return this;
        }

        /**
         * The percentage of the minimum number of available instances. Take note of the following rules:
         * <p>
         * 
         * *   If you set the value to **-1**, the minimum number of available instances is not determined based on this parameter. Default value: -1.
         * *   If you set the value to a number **from 0 to 100**, the minimum number of available instances is calculated by using the following formula: Current number of instances × (Value of MinReadyInstanceRatio × 100%). The value is the nearest integer rounded up from the calculated result. For example, if the percentage is set to **50**% and five instances are available, the minimum number of available instances is 3.
         * 
         * > When both **MinReadyInstance** and **MinReadyInstanceRatio** are specified and **MinReadyInstanceRatio** is set to a number from 0 to 100, the value of **MinReadyInstanceRatio** takes precedence.** For example, if **MinReadyInstances** is set to **5, and **MinReadyInstanceRatio** is set to **50**, the minimum number of available instances is set to the nearest integer rounded up from the calculated result of the following formula: Current number of instances × **50%**.
         */
        public Builder minReadyInstanceRatio(Integer minReadyInstanceRatio) {
            this.putQueryParameter("MinReadyInstanceRatio", minReadyInstanceRatio);
            this.minReadyInstanceRatio = minReadyInstanceRatio;
            return this;
        }

        /**
         * The minimum number of available instances. Take note of the following rules:
         * <p>
         * 
         * *   If you set the value to **0**, business interruptions occur when the application is updated.
         * *   If you set the value to \*\*-1\*\*, the minimum number of available instances is automatically set to a system-recommended value. The value is the nearest integer to which the calculated result of the following formula is rounded up: Current number of instances × 25%. For example, if five instances are available, the minimum number of available instances is calculated by using the following formula: 5 × 25% = 1.25. In this case, the minimum number of available instances is 2.
         * 
         * > Make sure that at least one instance is available during application deployment and rollback to prevent business interruptions.
         */
        public Builder minReadyInstances(Integer minReadyInstances) {
            this.putQueryParameter("MinReadyInstances", minReadyInstances);
            this.minReadyInstances = minReadyInstances;
            return this;
        }

        /**
         * The deployment policy. If the minimum number of available instances is 1, the value of the **UpdateStrategy** parameter is an empty string (""). If the minimum number of available instances is larger than 1, specify this parameter based on your requirements. Examples:
         * <p>
         * 
         * *   Perform canary release for one instance and release the remaining instances in two batches automatically with a one-minute interval between the deployment of each instance:
         * 
         *     `{"type":"GrayBatchUpdate","batchUpdate":{"batch":2,"releaseType":"auto","batchWaitTime":1},"grayUpdate":{"gray":1}}`
         * 
         * *   Perform canary release for one instance and release the remaining instances in two batches manually:
         * 
         *     `{"type":"GrayBatchUpdate","batchUpdate":{"batch":2,"releaseType":"manual"},"grayUpdate":{"gray":1}}`
         * 
         * *   Release the instances in two batches automatically with no interval between the deployment of each instance:
         * 
         *     `{"type":"BatchUpdate","batchUpdate":{"batch":2,"releaseType":"auto","batchWaitTime":0}}`
         * 
         * The following table describes the parameters that are used in the preceding statements.
         * 
         * *   **type**: the type of the release policy. Valid values: **GrayBatchUpdate** and **BatchUpdate**.
         * 
         * *   **batchUpdate**: the phased release policy.
         * 
         *     *   **batch**: the number of release batches.
         *     *   **releaseType**: the processing method for the batches. Valid values: **auto** and **manual**.
         *     *   **batchWaitTime**: the interval between release batches. Unit: seconds.
         * 
         * *   **grayUpdate**: the number of release batches in the phased release after a canary release. This parameter is returned only if the **type** parameter is set to **GrayBatchUpdate**.
         */
        public Builder updateStrategy(String updateStrategy) {
            this.putQueryParameter("UpdateStrategy", updateStrategy);
            this.updateStrategy = updateStrategy;
            return this;
        }

        /**
         * The ID of the application version. Call the [ListAppVersions](~~162054~~) operation to obtain the version ID.
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
