// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link RescaleApplicationRequest} extends {@link RequestModel}
 *
 * <p>RescaleApplicationRequest</p>
 */
public class RescaleApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoEnableApplicationScalingRule")
    private Boolean autoEnableApplicationScalingRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinReadyInstanceRatio")
    private Integer minReadyInstanceRatio;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinReadyInstances")
    private Integer minReadyInstances;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Replicas")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer replicas;

    private RescaleApplicationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.autoEnableApplicationScalingRule = builder.autoEnableApplicationScalingRule;
        this.minReadyInstanceRatio = builder.minReadyInstanceRatio;
        this.minReadyInstances = builder.minReadyInstances;
        this.replicas = builder.replicas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RescaleApplicationRequest create() {
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
    public Boolean getAutoEnableApplicationScalingRule() {
        return this.autoEnableApplicationScalingRule;
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
     * @return replicas
     */
    public Integer getReplicas() {
        return this.replicas;
    }

    public static final class Builder extends Request.Builder<RescaleApplicationRequest, Builder> {
        private String appId; 
        private Boolean autoEnableApplicationScalingRule; 
        private Integer minReadyInstanceRatio; 
        private Integer minReadyInstances; 
        private Integer replicas; 

        private Builder() {
            super();
        } 

        private Builder(RescaleApplicationRequest request) {
            super(request);
            this.appId = request.appId;
            this.autoEnableApplicationScalingRule = request.autoEnableApplicationScalingRule;
            this.minReadyInstanceRatio = request.minReadyInstanceRatio;
            this.minReadyInstances = request.minReadyInstances;
            this.replicas = request.replicas;
        } 

        /**
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0099b7be-5f5b-4512-a7fc-56049ef1****</p>
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
        public Builder autoEnableApplicationScalingRule(Boolean autoEnableApplicationScalingRule) {
            this.putQueryParameter("AutoEnableApplicationScalingRule", autoEnableApplicationScalingRule);
            this.autoEnableApplicationScalingRule = autoEnableApplicationScalingRule;
            return this;
        }

        /**
         * <p>The percentage of the minimum number of available instances. Take note of the following rules:</p>
         * <ul>
         * <li>If you set the value to <strong>-1</strong>, the minimum number of available instances is not determined based on this parameter. Default value: -1.</li>
         * <li>If you set the value to a number <strong>from 0 to 100</strong>, the minimum number of available instances is calculated by using the following formula: Current number of instances × (Value of MinReadyInstanceRatio × 100%). The value is the nearest integer rounded up from the calculated result. For example, if the percentage is set to <strong>50</strong>% and five instances are available, the minimum number of available instances is 3.</li>
         * </ul>
         * <blockquote>
         * <p>When <strong>MinReadyInstance</strong> and <strong>MinReadyInstanceRatio</strong> are specified and <strong>MinReadyInstanceRatio</strong> is set to a number from 0 to 100, the value of MinReadyInstanceRatio** takes precedence.**** For example, if <strong>MinReadyInstances</strong> is set to **5, and <strong>MinReadyInstanceRatio</strong> is set to <strong>50</strong>, the minimum number of available instances is set to the nearest integer rounded up from the calculated result of the following formula: Current number of instances × <strong>50%</strong>.</p>
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
         * <p>The minimum number of available instances. Special values:</p>
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
         * <p>The expected number of instances.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder replicas(Integer replicas) {
            this.putQueryParameter("Replicas", replicas);
            this.replicas = replicas;
            return this;
        }

        @Override
        public RescaleApplicationRequest build() {
            return new RescaleApplicationRequest(this);
        } 

    } 

}
