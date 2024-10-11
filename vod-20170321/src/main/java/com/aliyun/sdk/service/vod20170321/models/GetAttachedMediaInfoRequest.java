// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAttachedMediaInfoRequest} extends {@link RequestModel}
 *
 * <p>GetAttachedMediaInfoRequest</p>
 */
public class GetAttachedMediaInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthTimeout")
    private Long authTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mediaIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputType")
    private String outputType;

    private GetAttachedMediaInfoRequest(Builder builder) {
        super(builder);
        this.authTimeout = builder.authTimeout;
        this.mediaIds = builder.mediaIds;
        this.outputType = builder.outputType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAttachedMediaInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authTimeout
     */
    public Long getAuthTimeout() {
        return this.authTimeout;
    }

    /**
     * @return mediaIds
     */
    public String getMediaIds() {
        return this.mediaIds;
    }

    /**
     * @return outputType
     */
    public String getOutputType() {
        return this.outputType;
    }

    public static final class Builder extends Request.Builder<GetAttachedMediaInfoRequest, Builder> {
        private Long authTimeout; 
        private String mediaIds; 
        private String outputType; 

        private Builder() {
            super();
        } 

        private Builder(GetAttachedMediaInfoRequest request) {
            super(request);
            this.authTimeout = request.authTimeout;
            this.mediaIds = request.mediaIds;
            this.outputType = request.outputType;
        } 

        /**
         * <p>The validity period of the URL. Unit: seconds.</p>
         * <ul>
         * <li><p>If you set the OutputType parameter to <strong>cdn</strong>:</p>
         * <ul>
         * <li>The URL of the auxiliary media asset has a validity period only if URL signing is enabled. Otherwise, the URL of the auxiliary media asset is permanently valid.</li>
         * <li>Minimum value: <strong>1</strong>.</li>
         * <li>Maximum value: unlimited.</li>
         * <li>Default value: If you do not set this parameter, the default validity period that is specified in URL signing is used.</li>
         * </ul>
         * </li>
         * <li><p>If you set the OutputType parameter to <strong>oss</strong>:</p>
         * <ul>
         * <li>The URL of the auxiliary media asset has a validity period only if the permissions on the Object Storage Service (OSS) bucket are private. Otherwise, the URL of the auxiliary media asset is permanently valid.</li>
         * <li>Minimum value: <strong>1</strong>.</li>
         * <li>The maximum value for a media asset stored in the VOD bucket is <strong>2592000</strong> (30 days) and the maximum value for a media asset stored in an OSS bucket is <strong>129600</strong> (36 hours). The maximum value is limited to reduce security risks of the origin.</li>
         * <li>Default value: If you do not set this parameter, the default value <strong>3600</strong> is used.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder authTimeout(Long authTimeout) {
            this.putQueryParameter("AuthTimeout", authTimeout);
            this.authTimeout = authTimeout;
            return this;
        }

        /**
         * <p>The ID of the auxiliary media asset.</p>
         * <ul>
         * <li>Separate multiple IDs with commas (,). You can specify up to 20 IDs.</li>
         * <li>You can obtain the ID from the response to the <a href="~~CreateUploadAttachedMedia~~">CreateUploadAttachedMedia</a> operation that you call to obtain the upload URL and credential.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eb1861d2c9a842340e989dd56****,0222e203cf80f9c22870a4d2c****</p>
         */
        public Builder mediaIds(String mediaIds) {
            this.putQueryParameter("MediaIds", mediaIds);
            this.mediaIds = mediaIds;
            return this;
        }

        /**
         * <p>The type of the media asset URL. Valid values:</p>
         * <ul>
         * <li><strong>oss</strong></li>
         * <li><strong>cdn</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        public Builder outputType(String outputType) {
            this.putQueryParameter("OutputType", outputType);
            this.outputType = outputType;
            return this;
        }

        @Override
        public GetAttachedMediaInfoRequest build() {
            return new GetAttachedMediaInfoRequest(this);
        } 

    } 

}
