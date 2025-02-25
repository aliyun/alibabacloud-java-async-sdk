// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yuqing20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAnalysisTaskResultRequest} extends {@link RequestModel}
 *
 * <p>GetAnalysisTaskResultRequest</p>
 */
public class GetAnalysisTaskResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("analysisId")
    private Long analysisId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("teamHashId")
    private String teamHashId;

    private GetAnalysisTaskResultRequest(Builder builder) {
        super(builder);
        this.analysisId = builder.analysisId;
        this.requestId = builder.requestId;
        this.teamHashId = builder.teamHashId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAnalysisTaskResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return analysisId
     */
    public Long getAnalysisId() {
        return this.analysisId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return teamHashId
     */
    public String getTeamHashId() {
        return this.teamHashId;
    }

    public static final class Builder extends Request.Builder<GetAnalysisTaskResultRequest, Builder> {
        private Long analysisId; 
        private String requestId; 
        private String teamHashId; 

        private Builder() {
            super();
        } 

        private Builder(GetAnalysisTaskResultRequest request) {
            super(request);
            this.analysisId = request.analysisId;
            this.requestId = request.requestId;
            this.teamHashId = request.teamHashId;
        } 

        /**
         * analysisId.
         */
        public Builder analysisId(Long analysisId) {
            this.putQueryParameter("analysisId", analysisId);
            this.analysisId = analysisId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("requestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * teamHashId.
         */
        public Builder teamHashId(String teamHashId) {
            this.putQueryParameter("teamHashId", teamHashId);
            this.teamHashId = teamHashId;
            return this;
        }

        @Override
        public GetAnalysisTaskResultRequest build() {
            return new GetAnalysisTaskResultRequest(this);
        } 

    } 

}
