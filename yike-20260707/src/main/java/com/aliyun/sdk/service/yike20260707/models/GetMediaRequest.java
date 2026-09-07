// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link GetMediaRequest} extends {@link RequestModel}
 *
 * <p>GetMediaRequest</p>
 */
public class GetMediaRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthTimeout")
    private Long authTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizConfig")
    private String bizConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputURL")
    private String inputURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaId")
    private String mediaId;

    private GetMediaRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.authTimeout = builder.authTimeout;
        this.bizConfig = builder.bizConfig;
        this.inputURL = builder.inputURL;
        this.mediaId = builder.mediaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaRequest create() {
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
     * @return bizConfig
     */
    public String getBizConfig() {
        return this.bizConfig;
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

    public static final class Builder extends Request.Builder<GetMediaRequest, Builder> {
        private String regionId; 
        private Long authTimeout; 
        private String bizConfig; 
        private String inputURL; 
        private String mediaId; 

        private Builder() {
            super();
        } 

        private Builder(GetMediaRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.authTimeout = request.authTimeout;
            this.bizConfig = request.bizConfig;
            this.inputURL = request.inputURL;
            this.mediaId = request.mediaId;
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
         * <p>The validity period of the signed file URL. Unit: seconds.</p>
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
         * BizConfig.
         */
        public Builder bizConfig(String bizConfig) {
            this.putQueryParameter("BizConfig", bizConfig);
            this.bizConfig = bizConfig;
            return this;
        }

        /**
         * <p>Currently unavailable.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4">https://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</a></p>
         */
        public Builder inputURL(String inputURL) {
            this.putQueryParameter("InputURL", inputURL);
            this.inputURL = inputURL;
            return this;
        }

        /**
         * <p>The media asset ID. If this parameter is not empty, the query is performed based on this parameter, and the system verifies whether the value is a valid MediaId.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        @Override
        public GetMediaRequest build() {
            return new GetMediaRequest(this);
        } 

    } 

}
