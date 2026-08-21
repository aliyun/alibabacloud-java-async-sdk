// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetMediaAiAnalysisRequest} extends {@link RequestModel}
 *
 * <p>GetMediaAiAnalysisRequest</p>
 */
public class GetMediaAiAnalysisRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthTimeout")
    private String authTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaId")
    private String mediaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputType")
    private String outputType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResultTypes")
    private String resultTypes;

    private GetMediaAiAnalysisRequest(Builder builder) {
        super(builder);
        this.authTimeout = builder.authTimeout;
        this.mediaId = builder.mediaId;
        this.outputType = builder.outputType;
        this.resultTypes = builder.resultTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaAiAnalysisRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authTimeout
     */
    public String getAuthTimeout() {
        return this.authTimeout;
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return outputType
     */
    public String getOutputType() {
        return this.outputType;
    }

    /**
     * @return resultTypes
     */
    public String getResultTypes() {
        return this.resultTypes;
    }

    public static final class Builder extends Request.Builder<GetMediaAiAnalysisRequest, Builder> {
        private String authTimeout; 
        private String mediaId; 
        private String outputType; 
        private String resultTypes; 

        private Builder() {
            super();
        } 

        private Builder(GetMediaAiAnalysisRequest request) {
            super(request);
            this.authTimeout = request.authTimeout;
            this.mediaId = request.mediaId;
            this.outputType = request.outputType;
            this.resultTypes = request.resultTypes;
        } 

        /**
         * AuthTimeout.
         */
        public Builder authTimeout(String authTimeout) {
            this.putQueryParameter("AuthTimeout", authTimeout);
            this.authTimeout = authTimeout;
            return this;
        }

        /**
         * MediaId.
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * OutputType.
         */
        public Builder outputType(String outputType) {
            this.putQueryParameter("OutputType", outputType);
            this.outputType = outputType;
            return this;
        }

        /**
         * ResultTypes.
         */
        public Builder resultTypes(String resultTypes) {
            this.putQueryParameter("ResultTypes", resultTypes);
            this.resultTypes = resultTypes;
            return this;
        }

        @Override
        public GetMediaAiAnalysisRequest build() {
            return new GetMediaAiAnalysisRequest(this);
        } 

    } 

}
