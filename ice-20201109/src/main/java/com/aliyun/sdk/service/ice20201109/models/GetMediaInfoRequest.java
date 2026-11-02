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
 * {@link GetMediaInfoRequest} extends {@link RequestModel}
 *
 * <p>GetMediaInfoRequest</p>
 */
public class GetMediaInfoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthTimeout")
    private Long authTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputURL")
    private String inputURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaId")
    private String mediaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputType")
    private String outputType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReturnDetailedInfo")
    private String returnDetailedInfo;

    private GetMediaInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.authTimeout = builder.authTimeout;
        this.inputURL = builder.inputURL;
        this.mediaId = builder.mediaId;
        this.outputType = builder.outputType;
        this.returnDetailedInfo = builder.returnDetailedInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return authTimeout
     */
    public Long getAuthTimeout() {
        return this.authTimeout;
    }

    /**
     * @return inputURL
     */
    public String getInputURL() {
        return this.inputURL;
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
     * @return returnDetailedInfo
     */
    public String getReturnDetailedInfo() {
        return this.returnDetailedInfo;
    }

    public static final class Builder extends Request.Builder<GetMediaInfoRequest, Builder> {
        private String regionId; 
        private Long authTimeout; 
        private String inputURL; 
        private String mediaId; 
        private String outputType; 
        private String returnDetailedInfo; 

        private Builder() {
            super();
        } 

        private Builder(GetMediaInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.authTimeout = request.authTimeout;
            this.inputURL = request.inputURL;
            this.mediaId = request.mediaId;
            this.outputType = request.outputType;
            this.returnDetailedInfo = request.returnDetailedInfo;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AuthTimeout.
         */
        public Builder authTimeout(Long authTimeout) {
            this.putQueryParameter("AuthTimeout", authTimeout);
            this.authTimeout = authTimeout;
            return this;
        }

        /**
         * <p>The URL of the media asset to be queried in the corresponding system. The media asset must be registered in the IMS content library and attached to an IMS media ID before use.</p>
         * <ul>
         * <li>OSS addresses. Two formats are supported:</li>
         * </ul>
         * <p>http(s)://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4 or</p>
         * <p>oss://example-bucket/example.mp4. In this format, the default OSS region is the same as the service registration area.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</a></p>
         */
        public Builder inputURL(String inputURL) {
            this.putQueryParameter("InputURL", inputURL);
            this.inputURL = inputURL;
            return this;
        }

        /**
         * <p>The IMS media asset ID. If this parameter is empty, InputURL must be specified.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * <p>The type of the media asset file URL in the response. Valid values:</p>
         * <ul>
         * <li><p>oss: Returns the OSS URL. This is the default value.</p>
         * </li>
         * <li><p>cdn: Returns the CDN URL. A CDN URL is returned only when the media asset is imported from ApsaraVideo VOD and an accelerated domain name is configured in ApsaraVideo VOD.</p>
         * </li>
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
         * <p>Specifies whether to return detailed information for the corresponding media asset fields. Supported fields:</p>
         * <p>AiRoughData.StandardSmartTagJob: Specifies whether to return detailed tagging results if the media asset has been submitted for tag analysis. Valid values:</p>
         * <ul>
         * <li><p>false: The task result is returned as a URL. This is the default value.</p>
         * </li>
         * <li><p>true: The task result is returned as text.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AiRoughData.StandardSmartTagJob&quot;: false}</p>
         */
        public Builder returnDetailedInfo(String returnDetailedInfo) {
            this.putQueryParameter("ReturnDetailedInfo", returnDetailedInfo);
            this.returnDetailedInfo = returnDetailedInfo;
            return this;
        }

        @Override
        public GetMediaInfoRequest build() {
            return new GetMediaInfoRequest(this);
        } 

    } 

}
