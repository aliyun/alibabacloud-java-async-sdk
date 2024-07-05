// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The validity period of the URL of the auxiliary media asset. Unit: seconds.
         * <p>
         * > *   If the OutputType parameter is set to **cdn**:
         * >     *   The URL of the auxiliary media asset has a validity period only if URL signing is enabled. Otherwise, the URL of the auxiliary media asset is permanently valid.
         * >     *   Minimum value: **1**.
         * >     *   Maximum value: unlimited.
         * >     *   Default value: If you do not set this parameter, the default validity period that is specified in URL signing is used.
         * > *   If the OutputType parameter is set to **oss**:
         * >     *   The URL of the auxiliary media asset has a validity period only if the permissions on the Object Storage Service (OSS) bucket are private. Otherwise, the URL of the auxiliary media asset is permanently valid.
         * >     *   Minimum value: **1**.
         * >     *   Maximum value: **2592000** (30 days). The maximum value is limited to reduce security risks of the origin.
         * >     *   Default value: If you do not set this parameter, the default value is **3600**.
         */
        public Builder authTimeout(Long authTimeout) {
            this.putQueryParameter("AuthTimeout", authTimeout);
            this.authTimeout = authTimeout;
            return this;
        }

        /**
         * The ID of the auxiliary media asset. Separate multiple IDs with commas (,). A maximum of 20 IDs can be specified.
         */
        public Builder mediaIds(String mediaIds) {
            this.putQueryParameter("MediaIds", mediaIds);
            this.mediaIds = mediaIds;
            return this;
        }

        /**
         * The type of the URL of the auxiliary media asset. Valid values:
         * <p>
         * *   **oss**: OSS URL
         * *   **cdn** (default): Content Delivery Network (CDN) URL
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
