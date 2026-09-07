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
 * {@link BatchSubmitReviewInfoRequest} extends {@link RequestModel}
 *
 * <p>BatchSubmitReviewInfoRequest</p>
 */
public class BatchSubmitReviewInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaseMeAgentId")
    private Long baseMeAgentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("jsonStr")
    private String jsonStr;

    private BatchSubmitReviewInfoRequest(Builder builder) {
        super(builder);
        this.baseMeAgentId = builder.baseMeAgentId;
        this.jsonStr = builder.jsonStr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchSubmitReviewInfoRequest create() {
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

    public static final class Builder extends Request.Builder<BatchSubmitReviewInfoRequest, Builder> {
        private Long baseMeAgentId; 
        private String jsonStr; 

        private Builder() {
            super();
        } 

        private Builder(BatchSubmitReviewInfoRequest request) {
            super(request);
            this.baseMeAgentId = request.baseMeAgentId;
            this.jsonStr = request.jsonStr;
        } 

        /**
         * <p>The workspace ID.</p>
         */
        public Builder baseMeAgentId(Long baseMeAgentId) {
            this.putQueryParameter("BaseMeAgentId", baseMeAgentId);
            this.baseMeAgentId = baseMeAgentId;
            return this;
        }

        /**
         * <p>The request parameters are provided in JSON format. For more information, see the supplementary description.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;isSchemeData&quot;:1,&quot;schemeTaskConfigId&quot;:334,&quot;sourceDataType&quot;:2,&quot;startTime&quot;:&quot;2022-08-25 00:00:00&quot;,&quot;endTime&quot;:&quot;2022-09-23 23:59:59&quot;,&quot;sessionList&quot;:[{&quot;taskId&quot;:&quot;20220831-F8D7F4DF-0A16-1A1C-BA63-28F203922692&quot;,&quot;fileId&quot;:&quot;20220831-164343&quot;},{&quot;taskId&quot;:&quot;20220831-F2A50A72-82C4-1E3F-A1FD-52A662283D25&quot;,&quot;fileId&quot;:&quot;20220831-164343&quot;}]}</p>
         */
        public Builder jsonStr(String jsonStr) {
            this.putQueryParameter("jsonStr", jsonStr);
            this.jsonStr = jsonStr;
            return this;
        }

        @Override
        public BatchSubmitReviewInfoRequest build() {
            return new BatchSubmitReviewInfoRequest(this);
        } 

    } 

}
