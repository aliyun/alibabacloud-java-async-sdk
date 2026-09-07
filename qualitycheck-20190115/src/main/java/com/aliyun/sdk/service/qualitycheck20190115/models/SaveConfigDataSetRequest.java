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
 * {@link SaveConfigDataSetRequest} extends {@link RequestModel}
 *
 * <p>SaveConfigDataSetRequest</p>
 */
public class SaveConfigDataSetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaseMeAgentId")
    private Long baseMeAgentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JsonStr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jsonStr;

    private SaveConfigDataSetRequest(Builder builder) {
        super(builder);
        this.baseMeAgentId = builder.baseMeAgentId;
        this.jsonStr = builder.jsonStr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveConfigDataSetRequest create() {
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

    public static final class Builder extends Request.Builder<SaveConfigDataSetRequest, Builder> {
        private Long baseMeAgentId; 
        private String jsonStr; 

        private Builder() {
            super();
        } 

        private Builder(SaveConfigDataSetRequest request) {
            super(request);
            this.baseMeAgentId = request.baseMeAgentId;
            this.jsonStr = request.jsonStr;
        } 

        /**
         * <p>baseMeAgentId</p>
         */
        public Builder baseMeAgentId(Long baseMeAgentId) {
            this.putQueryParameter("BaseMeAgentId", baseMeAgentId);
            this.baseMeAgentId = baseMeAgentId;
            return this;
        }

        /**
         * <p>A complete JSON string. For details, see the following information.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{&quot;judgeType&quot;:1,&quot;setId&quot;:851,&quot;jsonStrForRule&quot;:{&quot;conditions&quot;:[{&quot;cid&quot;:&quot;1&quot;,&quot;check_range&quot;:{},&quot;lambda&quot;:&quot;1&quot;,&quot;operators&quot;:[{&quot;oid&quot;:1,&quot;type&quot;:&quot;HIT_ANY_KEYWORDS&quot;,&quot;param&quot;:{&quot;keywords&quot;:[&quot;有什么可以帮您&quot;,&quot;客服中心&quot;],&quot;in_sentence&quot;:false}}]}],&quot;rules&quot;:[{&quot;externalProperty&quot;:0,&quot;lambda&quot;:&quot;1&quot;,&quot;rid&quot;:&quot;1&quot;}],&quot;roleJudgeMethod&quot;:&quot;keyword&quot;},&quot;channelType&quot;:1}&quot;</p>
         */
        public Builder jsonStr(String jsonStr) {
            this.putQueryParameter("JsonStr", jsonStr);
            this.jsonStr = jsonStr;
            return this;
        }

        @Override
        public SaveConfigDataSetRequest build() {
            return new SaveConfigDataSetRequest(this);
        } 

    } 

}
