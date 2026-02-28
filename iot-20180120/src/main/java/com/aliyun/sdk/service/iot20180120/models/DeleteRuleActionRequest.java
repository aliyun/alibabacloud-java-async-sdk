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
 * {@link DeleteRuleActionRequest} extends {@link RequestModel}
 *
 * <p>DeleteRuleActionRequest</p>
 */
public class DeleteRuleActionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long actionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    private DeleteRuleActionRequest(Builder builder) {
        super(builder);
        this.actionId = builder.actionId;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRuleActionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionId
     */
    public Long getActionId() {
        return this.actionId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<DeleteRuleActionRequest, Builder> {
        private Long actionId; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRuleActionRequest request) {
            super(request);
            this.actionId = request.actionId;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * <p>The identifier of the rule action that you want to delete.</p>
         * <p>After you call the <a href="https://help.aliyun.com/document_detail/69586.html">CreateRuleAction</a> operation to create a rule action, the rule action ID is returned. You can call the <a href="https://help.aliyun.com/document_detail/69517.html">ListRuleActions</a> operation to view the rule action ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100001</p>
         */
        public Builder actionId(Long actionId) {
            this.putQueryParameter("ActionId", actionId);
            this.actionId = actionId;
            return this;
        }

        /**
         * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
         * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot_instc_pu****_c*-v64********</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        @Override
        public DeleteRuleActionRequest build() {
            return new DeleteRuleActionRequest(this);
        } 

    } 

}
