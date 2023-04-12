// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertScoreForApiRequest} extends {@link RequestModel}
 *
 * <p>InsertScoreForApiRequest</p>
 */
public class InsertScoreForApiRequest extends Request {
    @Query
    @NameInMap("BaseMeAgentId")
    private Long baseMeAgentId;

    @Query
    @NameInMap("JsonStr")
    @Validation(required = true)
    private String jsonStr;

    private InsertScoreForApiRequest(Builder builder) {
        super(builder);
        this.baseMeAgentId = builder.baseMeAgentId;
        this.jsonStr = builder.jsonStr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertScoreForApiRequest create() {
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

    public static final class Builder extends Request.Builder<InsertScoreForApiRequest, Builder> {
        private Long baseMeAgentId; 
        private String jsonStr; 

        private Builder() {
            super();
        } 

        private Builder(InsertScoreForApiRequest request) {
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
        public InsertScoreForApiRequest build() {
            return new InsertScoreForApiRequest(this);
        } 

    } 

}
