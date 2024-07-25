// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitMediaAiAnalysisJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitMediaAiAnalysisJobRequest</p>
 */
public class SubmitMediaAiAnalysisJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnalysisParams")
    private String analysisParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Input")
    private String input;

    private SubmitMediaAiAnalysisJobRequest(Builder builder) {
        super(builder);
        this.analysisParams = builder.analysisParams;
        this.input = builder.input;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitMediaAiAnalysisJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return analysisParams
     */
    public String getAnalysisParams() {
        return this.analysisParams;
    }

    /**
     * @return input
     */
    public String getInput() {
        return this.input;
    }

    public static final class Builder extends Request.Builder<SubmitMediaAiAnalysisJobRequest, Builder> {
        private String analysisParams; 
        private String input; 

        private Builder() {
            super();
        } 

        private Builder(SubmitMediaAiAnalysisJobRequest request) {
            super(request);
            this.analysisParams = request.analysisParams;
            this.input = request.input;
        } 

        /**
         * AnalysisParams.
         */
        public Builder analysisParams(String analysisParams) {
            this.putQueryParameter("AnalysisParams", analysisParams);
            this.analysisParams = analysisParams;
            return this;
        }

        /**
         * Input.
         */
        public Builder input(String input) {
            this.putQueryParameter("Input", input);
            this.input = input;
            return this;
        }

        @Override
        public SubmitMediaAiAnalysisJobRequest build() {
            return new SubmitMediaAiAnalysisJobRequest(this);
        } 

    } 

}
