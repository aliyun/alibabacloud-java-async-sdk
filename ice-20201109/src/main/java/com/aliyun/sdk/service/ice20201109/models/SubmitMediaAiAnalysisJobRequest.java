// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitMediaAiAnalysisJobRequest(Builder builder) {
        super(builder);
        this.analysisParams = builder.analysisParams;
        this.input = builder.input;
        this.userData = builder.userData;
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

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitMediaAiAnalysisJobRequest, Builder> {
        private String analysisParams; 
        private String input; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitMediaAiAnalysisJobRequest request) {
            super(request);
            this.analysisParams = request.analysisParams;
            this.input = request.input;
            this.userData = request.userData;
        } 

        /**
         * <p>The media asset analysis parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;nlpParams&quot;:{&quot;sourceLanguage&quot;:&quot;cn&quot;,&quot;diarizationEnabled&quot;:true,&quot;speakerCount&quot;:0,&quot;summarizationEnabled&quot;:false,&quot;translationEnabled&quot;:false}}</p>
         */
        public Builder analysisParams(String analysisParams) {
            this.putQueryParameter("AnalysisParams", analysisParams);
            this.analysisParams = analysisParams;
            return this;
        }

        /**
         * <p>The input media. Only OSS URLs and media asset IDs in the same region are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;MediaType&quot;:&quot;video&quot;,&quot;Media&quot;:&quot;<a href="https://your-bucket.oss-cn-shanghai.aliyuncs.com/your_movie.mp4%22%7D">https://your-bucket.oss-cn-shanghai.aliyuncs.com/your_movie.mp4&quot;}</a>
         * or
         * {&quot;Type&quot;:&quot;Media&quot;,&quot;Media&quot;:&quot;adbf5a778175ee757c34d0eba4******&quot;}</p>
         */
        public Builder input(String input) {
            this.putQueryParameter("Input", input);
            this.input = input;
            return this;
        }

        /**
         * <p>The custom settings in JSON format. The maximum length is 512 bytes. <a href="https://help.aliyun.com/document_detail/451631.html">Custom callback URL configuration</a> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NotifyAddress&quot;:&quot;<a href="https://xx.com/xx%22%7D">https://xx.com/xx&quot;}</a></p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitMediaAiAnalysisJobRequest build() {
            return new SubmitMediaAiAnalysisJobRequest(this);
        } 

    } 

}
