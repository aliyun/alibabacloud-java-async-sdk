// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSubScoreForApiRequest} extends {@link RequestModel}
 *
 * <p>UpdateSubScoreForApiRequest</p>
 */
public class UpdateSubScoreForApiRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaseMeAgentId")
    private Long baseMeAgentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JsonStr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jsonStr;

    private UpdateSubScoreForApiRequest(Builder builder) {
        super(builder);
        this.baseMeAgentId = builder.baseMeAgentId;
        this.jsonStr = builder.jsonStr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSubScoreForApiRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateSubScoreForApiRequest, Builder> {
        private Long baseMeAgentId; 
        private String jsonStr; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSubScoreForApiRequest request) {
            super(request);
            this.baseMeAgentId = request.baseMeAgentId;
            this.jsonStr = request.jsonStr;
        } 

        /**
         * baseMeAgentId
         */
        public Builder baseMeAgentId(Long baseMeAgentId) {
            this.putQueryParameter("BaseMeAgentId", baseMeAgentId);
            this.baseMeAgentId = baseMeAgentId;
            return this;
        }

        /**
         * JsonStr.
         */
        public Builder jsonStr(String jsonStr) {
            this.putQueryParameter("JsonStr", jsonStr);
            this.jsonStr = jsonStr;
            return this;
        }

        @Override
        public UpdateSubScoreForApiRequest build() {
            return new UpdateSubScoreForApiRequest(this);
        } 

    } 

}
