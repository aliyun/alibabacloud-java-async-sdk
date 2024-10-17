// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
         * <p>The input URL of the media asset in another service. The URL must be registered in the IMS content library and bound to the ID of the media asset in IMS.</p>
         * <ul>
         * <li>For a media asset from Object Storage Service (OSS), the URL may have one of the following formats:</li>
         * </ul>
         * <p>http(s)://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4 or</p>
         * <p>oss://example-bucket/example.mp4. The second format indicates that the region in which the OSS bucket of the media asset resides is the same as the region in which OSS is activated.</p>
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
         * <p>The ID of the media asset in IMS. If this parameter is left empty, the InputURL parameter must be specified.</p>
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
         * <p>The type of the URL of the media asset to return in the response. Valid values:</p>
         * <ul>
         * <li>oss (default): an OSS URL.</li>
         * <li>cdn: a CDN URL. A CDN URL is returned only if the media asset is imported from ApsaraVideo VOD and the relevant domain name is an accelerated domain name in ApsaraVideo VOD.</li>
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
         * <p>Specifies whether to return detailed information for specific media asset attributes. Supported attributes: AiRoughData.StandardSmartTagJob, which specifies whether to return detailed tag information if a tagging job has been submitted for the media asset. Valid values for the attribute:</p>
         * <ul>
         * <li>false (default): The job result is returned as a URL.</li>
         * <li>true: The job result is returned as text.</li>
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
