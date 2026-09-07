// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link ApplyWsTokenRequest} extends {@link RequestModel}
 *
 * <p>ApplyWsTokenRequest</p>
 */
public class ApplyWsTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaseMeAgentId")
    private Long baseMeAgentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JsonStr")
    private String jsonStr;

    private ApplyWsTokenRequest(Builder builder) {
        super(builder);
        this.baseMeAgentId = builder.baseMeAgentId;
        this.jsonStr = builder.jsonStr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyWsTokenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baseMeAgentId
     */
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    /**
     * @return jsonStr
     */
    public String getJsonStr() {
        return this.jsonStr;
    }

    public static final class Builder extends Request.Builder<ApplyWsTokenRequest, Builder> {
        private Long baseMeAgentId; 
        private String jsonStr; 

        private Builder() {
            super();
        } 

        private Builder(ApplyWsTokenRequest request) {
            super(request);
            this.baseMeAgentId = request.baseMeAgentId;
            this.jsonStr = request.jsonStr;
        } 

        /**
         * <p>Workspace ID</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder baseMeAgentId(Long baseMeAgentId) {
            this.putQueryParameter("BaseMeAgentId", baseMeAgentId);
            this.baseMeAgentId = baseMeAgentId;
            return this;
        }

        /**
         * <p>Complete JSON string information. For details, see the following specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;business&quot;: &quot;test&quot;,
         *     &quot;callType&quot;: 1,
         *     &quot;callee&quot;: &quot;13111111111&quot;,
         *     &quot;caller&quot;: &quot;13800000000&quot;,
         *     &quot;skillGroupId&quot;: 1,
         *     &quot;skillGroupName&quot;: &quot;test&quot;,
         *     &quot;taskConfigId&quot;: 399,
         *     &quot;tid&quot;: &quot;2025012412cb129e-1579-46b5-9326-1b2ececf8f30&quot;
         * }</p>
         */
        public Builder jsonStr(String jsonStr) {
            this.putQueryParameter("JsonStr", jsonStr);
            this.jsonStr = jsonStr;
            return this;
        }

        @Override
        public ApplyWsTokenRequest build() {
            return new ApplyWsTokenRequest(this);
        } 

    } 

}
