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
 * {@link RestartApplicationRequest} extends {@link RequestModel}
 *
 * <p>RestartApplicationRequest</p>
 */
public class RestartApplicationRequest extends Request {
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

    private RestartApplicationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.autoEnableApplicationScalingRule = builder.autoEnableApplicationScalingRule;
        this.minReadyInstanceRatio = builder.minReadyInstanceRatio;
        this.minReadyInstances = builder.minReadyInstances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartApplicationRequest create() {
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

    public static final class Builder extends Request.Builder<RestartApplicationRequest, Builder> {
        private String appId; 
        private Boolean autoEnableApplicationScalingRule; 
        private Integer minReadyInstanceRatio; 
        private Integer minReadyInstances; 

        private Builder() {
            super();
        } 

        private Builder(RestartApplicationRequest request) {
            super(request);
            this.appId = request.appId;
            this.autoEnableApplicationScalingRule = request.autoEnableApplicationScalingRule;
            this.minReadyInstanceRatio = request.minReadyInstanceRatio;
            this.minReadyInstances = request.minReadyInstances;
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
         * <p>Specifies whether the elastic scaling policy for the application is automatically enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables the policy.</li>
         * <li><strong>false</strong>: disables the policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoEnableApplicationScalingRule(Boolean autoEnableApplicationScalingRule) {
            this.putQueryParameter("AutoEnableApplicationScalingRule", autoEnableApplicationScalingRule);
            this.autoEnableApplicationScalingRule = autoEnableApplicationScalingRule;
            return this;
        }

        /**
         * <p>The percentage of the minimum number of ready instances. Valid values:</p>
         * <ul>
         * <li><strong>-1</strong>: the initial value, which indicates that the percentage is not used.</li>
         * <li><strong>0 to 100</strong>: the percentage, which is rounded up. For example, if you set this parameter to <strong>50</strong> and you have 5 instances, the minimum number of ready instances is 3.</li>
         * </ul>
         * <blockquote>
         * <p>If both <strong>MinReadyInstances</strong> and <strong>MinReadyInstanceRatio</strong> are specified and the value of <strong>MinReadyInstanceRatio</strong> is not <strong>-1</strong>, the <strong>MinReadyInstanceRatio</strong> parameter takes precedence. For example, if <strong>MinReadyInstances</strong> is set to <strong>5</strong> and <strong>MinReadyInstanceRatio</strong> is set to <strong>50</strong>, the system uses <strong>50</strong> to calculate the minimum number of ready instances.</p>
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
         * <p>The minimum number of ready instances. Valid values:</p>
         * <ul>
         * <li>If you set this parameter to <strong>0</strong>, services are interrupted during the application upgrade.</li>
         * <li>If you set this parameter to <strong>-1</strong>, the system uses the recommended value, which is 25% of the current number of instances. For example, if you have 5 instances, 5 × 25% = 1.25. The value is rounded up to 2.</li>
         * </ul>
         * <blockquote>
         * <p>For each rolling deployment, set the minimum number of ready instances to 1 or greater to ensure service continuity.</p>
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

        @Override
        public RestartApplicationRequest build() {
            return new RestartApplicationRequest(this);
        } 

    } 

}
