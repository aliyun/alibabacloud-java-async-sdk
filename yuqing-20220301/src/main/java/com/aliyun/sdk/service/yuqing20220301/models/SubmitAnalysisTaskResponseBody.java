// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yuqing20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitAnalysisTaskResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitAnalysisTaskResponseBody</p>
 */
public class SubmitAnalysisTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("analysisId")
    private Long analysisId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultJson")
    private String resultJson;

    private SubmitAnalysisTaskResponseBody(Builder builder) {
        this.analysisId = builder.analysisId;
        this.requestId = builder.requestId;
        this.resultJson = builder.resultJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAnalysisTaskResponseBody create() {
        return builder().build();
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
     * @return resultJson
     */
    public String getResultJson() {
        return this.resultJson;
    }

    public static final class Builder {
        private Long analysisId; 
        private String requestId; 
        private String resultJson; 

        /**
         * analysisId.
         */
        public Builder analysisId(Long analysisId) {
            this.analysisId = analysisId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultJson.
         */
        public Builder resultJson(String resultJson) {
            this.resultJson = resultJson;
            return this;
        }

        public SubmitAnalysisTaskResponseBody build() {
            return new SubmitAnalysisTaskResponseBody(this);
        } 

    } 

}
