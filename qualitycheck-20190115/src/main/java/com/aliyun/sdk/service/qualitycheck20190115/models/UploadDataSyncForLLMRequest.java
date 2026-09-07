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
 * {@link UploadDataSyncForLLMRequest} extends {@link RequestModel}
 *
 * <p>UploadDataSyncForLLMRequest</p>
 */
public class UploadDataSyncForLLMRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaseMeAgentId")
    private Long baseMeAgentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JsonStr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jsonStr;

    private UploadDataSyncForLLMRequest(Builder builder) {
        super(builder);
        this.baseMeAgentId = builder.baseMeAgentId;
        this.jsonStr = builder.jsonStr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadDataSyncForLLMRequest create() {
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

    public static final class Builder extends Request.Builder<UploadDataSyncForLLMRequest, Builder> {
        private Long baseMeAgentId; 
        private String jsonStr; 

        private Builder() {
            super();
        } 

        private Builder(UploadDataSyncForLLMRequest request) {
            super(request);
            this.baseMeAgentId = request.baseMeAgentId;
            this.jsonStr = request.jsonStr;
        } 

        /**
         * <p>The business space ID.</p>
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
         * <p>The complete JSON string. For more information, see the following details.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;tickets\&quot;:[{\&quot;dialogue\&quot;:[{\&quot;role\&quot;:\&quot;Agent\&quot;,\&quot;words\&quot;:\&quot;Yes\&quot;,\&quot;end\&quot;:0,\&quot;beginTime\&quot;:1783909236618,\&quot;begin\&quot;:0}],\&quot;tid\&quot;:\&quot;20260713-20240612032225161783909236618\&quot;}],\&quot;commonRuleIds\&quot;:[\&quot;20773\&quot;]}</p>
         */
        public Builder jsonStr(String jsonStr) {
            this.putBodyParameter("JsonStr", jsonStr);
            this.jsonStr = jsonStr;
            return this;
        }

        @Override
        public UploadDataSyncForLLMRequest build() {
            return new UploadDataSyncForLLMRequest(this);
        } 

    } 

}
