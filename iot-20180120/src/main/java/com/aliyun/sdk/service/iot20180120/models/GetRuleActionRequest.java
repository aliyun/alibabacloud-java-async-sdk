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
 * {@link GetRuleActionRequest} extends {@link RequestModel}
 *
 * <p>GetRuleActionRequest</p>
 */
public class GetRuleActionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long actionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    private GetRuleActionRequest(Builder builder) {
        super(builder);
        this.actionId = builder.actionId;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRuleActionRequest create() {
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

    public static final class Builder extends Request.Builder<GetRuleActionRequest, Builder> {
        private Long actionId; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetRuleActionRequest request) {
            super(request);
            this.actionId = request.actionId;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
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
         * <p>The rule action ID that you want to query.</p>
         * <p>You can query the rule action ID by using the following methods:</p>
         * <ul>
         * <li>Call the <a href="https://help.aliyun.com/document_detail/69586.html">CreateRuleAction</a> operation and view the <strong>ActionId</strong> parameter in the response.</li>
         * <li>Call the <a href="https://help.aliyun.com/document_detail/69517.html">ListRuleActions</a> operation and view the <strong>Id</strong> parameter in the response.</li>
         * </ul>
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
        public GetRuleActionRequest build() {
            return new GetRuleActionRequest(this);
        } 

    } 

}
