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
         * <p>The expiration time of the image access URL. Unit: seconds.</p>
         * <ul>
         * <li>If OutputType is set to cdn:<ul>
         * <li>Only image URLs with URL authentication enabled expire. Otherwise, the URLs are permanently valid.</li>
         * <li>Minimum value: 1.</li>
         * <li>Maximum value: unlimited.</li>
         * <li>Default value: If this parameter is not specified, the default validity period specified in URL authentication settings is used.</li>
         * </ul>
         * </li>
         * <li>If OutputType is set to oss:<ul>
         * <li>Only image URLs with private storage permissions expire. Otherwise, the URLs are permanently valid.</li>
         * <li>Minimum value: 1.</li>
         * <li>Maximum value: To reduce security risks to the origin server, the maximum value is <strong>2592000</strong> (30 days) if images are stored in a bucket managed by ApsaraVideo VOD, and <strong>129600</strong> (36 hours) if images are stored in your own OSS bucket.</li>
         * <li>Default value: If this parameter is not specified, the value is 3600.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder authTimeout(String authTimeout) {
            this.putQueryParameter("AuthTimeout", authTimeout);
            this.authTimeout = authTimeout;
            return this;
        }

        /**
         * <p>The audio ID. You can query the audio ID in the ApsaraVideo VOD console or obtain it from the response of the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>006204a11bb386bb25491f95f****</p>
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * <p>The type of the output URL. Valid values:</p>
         * <ul>
         * <li><strong>oss</strong>: back-to-origin URL.</li>
         * <li><strong>cdn</strong> (default): accelerated URL.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cdn</p>
         */
        public Builder outputType(String outputType) {
            this.putQueryParameter("OutputType", outputType);
            this.outputType = outputType;
            return this;
        }

        /**
         * <p>The type of analysis results. Separate multiple types with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>Chapter</p>
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
