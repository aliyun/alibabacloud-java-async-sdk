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
 * {@link GetResultRequest} extends {@link RequestModel}
 *
 * <p>GetResultRequest</p>
 */
public class GetResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaseMeAgentId")
    private Long baseMeAgentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JsonStr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jsonStr;

    private GetResultRequest(Builder builder) {
        super(builder);
        this.baseMeAgentId = builder.baseMeAgentId;
        this.jsonStr = builder.jsonStr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResultRequest create() {
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

    public static final class Builder extends Request.Builder<GetResultRequest, Builder> {
        private Long baseMeAgentId; 
        private String jsonStr; 

        private Builder() {
            super();
        } 

        private Builder(GetResultRequest request) {
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;pageNumber&quot;:1,&quot;pageSize&quot;:10,&quot;excludeFields&quot;:&quot;hitResult.hits, recording.url&quot;,&quot;requiredFields&quot;:&quot;agent,status,errorMessage,reviewStatus,reviewResult,score,taskId,reviewer,resolver,recording.name,recording.duration,hitResult,business&quot;,&quot;dataType&quot;:1,&quot;sourceType&quot;:0,&quot;startTime&quot;:&quot;2020-06-25 00:00:00&quot;,&quot;endTime&quot;:&quot;2020-07-01 23:59:59&quot;}</p>
         */
        public Builder jsonStr(String jsonStr) {
            this.putQueryParameter("JsonStr", jsonStr);
            this.jsonStr = jsonStr;
            return this;
        }

        @Override
        public GetResultRequest build() {
            return new GetResultRequest(this);
        } 

    } 

}
