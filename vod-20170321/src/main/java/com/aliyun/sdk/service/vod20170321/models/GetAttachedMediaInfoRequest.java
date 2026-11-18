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
         * <p>The expiration time of the auxiliary media asset URLs. Unit: seconds.</p>
         * <ul>
         * <li>If OutputType is set to <strong>cdn</strong>:<ul>
         * <li>The URLs expire only if URL authentication is enabled. Otherwise, the URLs are permanently valid.</li>
         * <li>Minimum value: <strong>1</strong>.</li>
         * <li>Maximum value: unlimited.</li>
         * <li>Default value: If this parameter is not specified, the default validity period configured for URL authentication is used.</li>
         * </ul>
         * </li>
         * <li>If OutputType is set to <strong>oss</strong>:<ul>
         * <li>The URLs expire only if the storage permission is set to private. Otherwise, the URLs are permanently valid.</li>
         * <li>Minimum value: <strong>1</strong>.</li>
         * <li>Maximum value: To reduce security risks to the origin server, the maximum value is <strong>2592000</strong> (30 days) if the auxiliary media assets are stored in an ApsaraVideo VOD bucket, and <strong>129600</strong> (36 hours) if the auxiliary media assets are stored in a user-owned OSS bucket.</li>
         * <li>Default value: If this parameter is not specified, the value is <strong>3600</strong>.</li>
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
         * <p>The IDs of the auxiliary media assets.</p>
         * <ul>
         * <li>Separate multiple IDs with commas (,). You can specify up to 20 IDs.</li>
         * <li>The IDs are returned after you call the <a href="~~CreateUploadAttachedMedia~~">CreateUploadAttachedMedia</a> operation to obtain the upload URLs and credentials for the auxiliary media assets.</li>
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
         * <p>The type of the output URL. Valid values:</p>
         * <ul>
         * <li><strong>oss</strong>: back-to-origin URL.</li>
         * <li><strong>cdn</strong> (default): accelerated URL.</li>
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
