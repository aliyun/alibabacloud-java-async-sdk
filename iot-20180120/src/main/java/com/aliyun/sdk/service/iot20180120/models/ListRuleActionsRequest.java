// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link ListRuleActionsRequest} extends {@link RequestModel}
 *
 * <p>ListRuleActionsRequest</p>
 */
public class ListRuleActionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ruleId;

    private ListRuleActionsRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRuleActionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<ListRuleActionsRequest, Builder> {
        private String iotInstanceId; 
        private Long ruleId; 

        private Builder() {
            super();
        } 

        private Builder(ListRuleActionsRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.ruleId = request.ruleId;
        } 

        /**
         * <p>The ID of the instance. On the <strong>Overview</strong> page in the IoT Platform console, you can view the <strong>ID</strong> of the instance.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</li>
         * <li>If the <strong>Overview</strong> page or instance ID is not displayed in the IoT Platform console, you do not need to configure this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information about the instance, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot_instc_pu****_c*-v64********</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The ID of the rule.</p>
         * <p>You can log on to the IoT Platform console and go to the details page of the instance that you want to manage. On the instance details page, choose <strong>Rules Engine</strong> &gt; <strong>Data Forwarding</strong> to obtain the rule ID. Alternatively, you can call the <a href="https://help.aliyun.com/document_detail/69486.html">ListRule</a> operation to view the value of the <strong>Id</strong> parameter in the response.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public ListRuleActionsRequest build() {
            return new ListRuleActionsRequest(this);
        } 

    } 

}
