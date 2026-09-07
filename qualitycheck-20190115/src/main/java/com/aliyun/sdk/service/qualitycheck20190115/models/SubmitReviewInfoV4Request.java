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
 * {@link SubmitReviewInfoV4Request} extends {@link RequestModel}
 *
 * <p>SubmitReviewInfoV4Request</p>
 */
public class SubmitReviewInfoV4Request extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BaseMeAgentId")
    private Long baseMeAgentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JsonStr")
    private String jsonStr;

    private SubmitReviewInfoV4Request(Builder builder) {
        super(builder);
        this.baseMeAgentId = builder.baseMeAgentId;
        this.jsonStr = builder.jsonStr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitReviewInfoV4Request create() {
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

    public static final class Builder extends Request.Builder<SubmitReviewInfoV4Request, Builder> {
        private Long baseMeAgentId; 
        private String jsonStr; 

        private Builder() {
            super();
        } 

        private Builder(SubmitReviewInfoV4Request request) {
            super(request);
            this.baseMeAgentId = request.baseMeAgentId;
            this.jsonStr = request.jsonStr;
        } 

        /**
         * <p>Workspace ID</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder baseMeAgentId(Long baseMeAgentId) {
            this.putBodyParameter("BaseMeAgentId", baseMeAgentId);
            this.baseMeAgentId = baseMeAgentId;
            return this;
        }

        /**
         * <p>Complete JSON string. For details, see the following sections.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;comments&quot;:&quot;tidComment&quot;,&quot;jsonReviewResult&quot;:&quot;{\&quot;reviewInfoList\&quot;:[{\&quot;changed\&quot;:true,\&quot;comment\&quot;:\&quot;ridComment\&quot;,\&quot;matched\&quot;:true,\&quot;reviewHitResult\&quot;:0,\&quot;reviewResult\&quot;:1,\&quot;rid\&quot;:31459,\&quot;sentenceReviewResults\&quot;:[{\&quot;changed\&quot;:true,\&quot;cid\&quot;:95302,\&quot;comment\&quot;:\&quot;pidComment\&quot;,\&quot;hitStatus\&quot;:0,\&quot;pid\&quot;:\&quot;0\&quot;,\&quot;reviewDimensionType\&quot;:\&quot;2\&quot;,\&quot;rid\&quot;:31459,\&quot;sid\&quot;:54104}]}]}&quot;,&quot;taskId&quot;:&quot;20251224-62931498-881B-1436-A93D-1FFBC5D7D4A0&quot;,&quot;vid&quot;:&quot;8cbe2bccf3be4b42bada45136f77d4e9&quot;}</p>
         */
        public Builder jsonStr(String jsonStr) {
            this.putBodyParameter("JsonStr", jsonStr);
            this.jsonStr = jsonStr;
            return this;
        }

        @Override
        public SubmitReviewInfoV4Request build() {
            return new SubmitReviewInfoV4Request(this);
        } 

    } 

}
