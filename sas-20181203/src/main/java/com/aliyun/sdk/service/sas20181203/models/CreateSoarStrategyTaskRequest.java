// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link CreateSoarStrategyTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateSoarStrategyTaskRequest</p>
 */
public class CreateSoarStrategyTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long strategyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String strategyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyTaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String strategyTaskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyTaskParams")
    @com.aliyun.core.annotation.Validation(required = true)
    private String strategyTaskParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyTaskPlanExeTime")
    private Long strategyTaskPlanExeTime;

    private CreateSoarStrategyTaskRequest(Builder builder) {
        super(builder);
        this.strategyId = builder.strategyId;
        this.strategyName = builder.strategyName;
        this.strategyTaskName = builder.strategyTaskName;
        this.strategyTaskParams = builder.strategyTaskParams;
        this.strategyTaskPlanExeTime = builder.strategyTaskPlanExeTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSoarStrategyTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return strategyId
     */
    public Long getStrategyId() {
        return this.strategyId;
    }

    /**
     * @return strategyName
     */
    public String getStrategyName() {
        return this.strategyName;
    }

    /**
     * @return strategyTaskName
     */
    public String getStrategyTaskName() {
        return this.strategyTaskName;
    }

    /**
     * @return strategyTaskParams
     */
    public String getStrategyTaskParams() {
        return this.strategyTaskParams;
    }

    /**
     * @return strategyTaskPlanExeTime
     */
    public Long getStrategyTaskPlanExeTime() {
        return this.strategyTaskPlanExeTime;
    }

    public static final class Builder extends Request.Builder<CreateSoarStrategyTaskRequest, Builder> {
        private Long strategyId; 
        private String strategyName; 
        private String strategyTaskName; 
        private String strategyTaskParams; 
        private Long strategyTaskPlanExeTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateSoarStrategyTaskRequest request) {
            super(request);
            this.strategyId = request.strategyId;
            this.strategyName = request.strategyName;
            this.strategyTaskName = request.strategyTaskName;
            this.strategyTaskParams = request.strategyTaskParams;
            this.strategyTaskPlanExeTime = request.strategyTaskPlanExeTime;
        } 

        /**
         * <p>The ID of the policy.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeSoarSubscribedStrategy~~">DescribeSoarSubscribedStrategy</a> operation to obtain the ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>13840</p>
         */
        public Builder strategyId(Long strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        /**
         * <p>The name of the policy. Set the value to Automated Batch Vulnerability Fixing Policy for Multiple Servers.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Automated Batch Vulnerability Fixing Policy for Multiple Servers</p>
         */
        public Builder strategyName(String strategyName) {
            this.putQueryParameter("StrategyName", strategyName);
            this.strategyName = strategyName;
            return this;
        }

        /**
         * <p>The name of.the policy task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>task1</p>
         */
        public Builder strategyTaskName(String strategyTaskName) {
            this.putQueryParameter("StrategyTaskName", strategyTaskName);
            this.strategyTaskName = strategyTaskName;
            return this;
        }

        /**
         * <p>The parameters of the policy task. The value is a JSON array.</p>
         * <p>Vulnerability-related parameters:</p>
         * <ul>
         * <li>name: vluList</li>
         * <li>associationProperty: sasAllVul</li>
         * <li>value: basic vulnerability information</li>
         * </ul>
         * <p>Snapshot-related parameters:</p>
         * <ul>
         * <li>name: snapshotConfig</li>
         * <li>associationProperty: snapshotConfig</li>
         * <li>value: retention period</li>
         * </ul>
         * <p>Notification-related parameters:</p>
         * <ul>
         * <li>name: notifyConfig</li>
         * <li>associationProperty: notifyConfig</li>
         * <li>value: email or DingTalk configuration information</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;name&quot;: &quot;vulList&quot;,
         *         &quot;associationProperty&quot;: &quot;sasAllVul&quot;,
         *         &quot;value&quot;: [
         *             {
         *                 &quot;regionId&quot;: &quot;cn-hangzhou&quot;,
         *                 &quot;instanceId&quot;: &quot;i-bp10i<strong><strong><strong>68lo5e&quot;,
         *                 &quot;instanceName&quot;: &quot;instance</strong></strong>&quot;,
         *                 &quot;vulId&quot;: 3974347681,
         *                 &quot;vulName&quot;: &quot;centos:7:cesa-2024:1249&quot;,
         *                 &quot;vulAliasName&quot;: &quot;CESA-2024:1249&quot;,
         *                 &quot;vulTag&quot;: &quot;oval&quot;,
         *                 &quot;vulUuid&quot;: &quot;3c5eb76a-</strong>****-85ef-67562cdc2344&quot;,
         *                 &quot;vulType&quot;: &quot;cve&quot;,
         *                 &quot;vulModifyTs&quot;: 1721324258000
         *             }
         *         ]
         *     },
         *     {
         *         &quot;name&quot;: &quot;snapshotConfig&quot;,
         *         &quot;associationProperty&quot;: &quot;snapshotConfig&quot;,
         *         &quot;value&quot;: {
         *             &quot;ttl&quot;: 1
         *         }
         *     },
         *     {
         *         &quot;name&quot;: &quot;notifyConfig&quot;,
         *         &quot;associationProperty&quot;: &quot;notifyConfig&quot;,
         *         &quot;value&quot;: {
         *             &quot;ding&quot;: [
         *                 {
         *                     &quot;value&quot;: 2195,
         *                     &quot;label&quot;: &quot;test&quot;
         *                 }
         *             ]
         *         }
         *     }
         * ]</p>
         */
        public Builder strategyTaskParams(String strategyTaskParams) {
            this.putQueryParameter("StrategyTaskParams", strategyTaskParams);
            this.strategyTaskParams = strategyTaskParams;
            return this;
        }

        /**
         * <p>The timestamp when the task is scheduled to start. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1586739841000</p>
         */
        public Builder strategyTaskPlanExeTime(Long strategyTaskPlanExeTime) {
            this.putQueryParameter("StrategyTaskPlanExeTime", strategyTaskPlanExeTime);
            this.strategyTaskPlanExeTime = strategyTaskPlanExeTime;
            return this;
        }

        @Override
        public CreateSoarStrategyTaskRequest build() {
            return new CreateSoarStrategyTaskRequest(this);
        } 

    } 

}
