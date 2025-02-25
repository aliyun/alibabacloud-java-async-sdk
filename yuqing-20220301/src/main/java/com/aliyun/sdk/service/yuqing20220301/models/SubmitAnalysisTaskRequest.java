// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yuqing20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitAnalysisTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitAnalysisTaskRequest</p>
 */
public class SubmitAnalysisTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("analyseType")
    private String analyseType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("searchCondition")
    private SearchCondition searchCondition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("teamHashId")
    private String teamHashId;

    private SubmitAnalysisTaskRequest(Builder builder) {
        super(builder);
        this.analyseType = builder.analyseType;
        this.requestId = builder.requestId;
        this.searchCondition = builder.searchCondition;
        this.teamHashId = builder.teamHashId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAnalysisTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return analyseType
     */
    public String getAnalyseType() {
        return this.analyseType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return searchCondition
     */
    public SearchCondition getSearchCondition() {
        return this.searchCondition;
    }

    /**
     * @return teamHashId
     */
    public String getTeamHashId() {
        return this.teamHashId;
    }

    public static final class Builder extends Request.Builder<SubmitAnalysisTaskRequest, Builder> {
        private String analyseType; 
        private String requestId; 
        private SearchCondition searchCondition; 
        private String teamHashId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitAnalysisTaskRequest request) {
            super(request);
            this.analyseType = request.analyseType;
            this.requestId = request.requestId;
            this.searchCondition = request.searchCondition;
            this.teamHashId = request.teamHashId;
        } 

        /**
         * analyseType.
         */
        public Builder analyseType(String analyseType) {
            this.putBodyParameter("analyseType", analyseType);
            this.analyseType = analyseType;
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
         * searchCondition.
         */
        public Builder searchCondition(SearchCondition searchCondition) {
            this.putBodyParameter("searchCondition", searchCondition);
            this.searchCondition = searchCondition;
            return this;
        }

        /**
         * teamHashId.
         */
        public Builder teamHashId(String teamHashId) {
            this.putBodyParameter("teamHashId", teamHashId);
            this.teamHashId = teamHashId;
            return this;
        }

        @Override
        public SubmitAnalysisTaskRequest build() {
            return new SubmitAnalysisTaskRequest(this);
        } 

    } 

}
