// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMezzanineInfoRequest} extends {@link RequestModel}
 *
 * <p>GetMezzanineInfoRequest</p>
 */
public class GetMezzanineInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdditionType")
    private String additionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthTimeout")
    private Long authTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputType")
    private String outputType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String videoId;

    private GetMezzanineInfoRequest(Builder builder) {
        super(builder);
        this.additionType = builder.additionType;
        this.authTimeout = builder.authTimeout;
        this.outputType = builder.outputType;
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMezzanineInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return additionType
     */
    public String getAdditionType() {
        return this.additionType;
    }

    /**
     * @return authTimeout
     */
    public Long getAuthTimeout() {
        return this.authTimeout;
    }

    /**
     * @return outputType
     */
    public String getOutputType() {
        return this.outputType;
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder extends Request.Builder<GetMezzanineInfoRequest, Builder> {
        private String additionType; 
        private Long authTimeout; 
        private String outputType; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(GetMezzanineInfoRequest request) {
            super(request);
            this.additionType = request.additionType;
            this.authTimeout = request.authTimeout;
            this.outputType = request.outputType;
            this.videoId = request.videoId;
        } 

        /**
         * The type of additional information. Separate multiple values with commas (,). By default, only the basic information is returned. Valid values:
         * <p>
         * 
         * *   **video**: video stream information
         * *   **audio**: audio stream information
         */
        public Builder additionType(String additionType) {
            this.putQueryParameter("AdditionType", additionType);
            this.additionType = additionType;
            return this;
        }

        /**
         * The validity period of the mezzanine file URL. Unit: seconds. Default value: **1800**. Minimum value: **1**.
         * <p>
         * 
         * *   If the OutputType parameter is set to **cdn**:
         * 
         *     *   The mezzanine file URL has a validity period only if URL signing is enabled. Otherwise, the mezzanine file URL is permanently valid.
         *     *   Minimum value: **1**.
         *     *   Maximum Value: unlimited.
         *     *   Default value: If you do not set this parameter, the default validity period that is specified in URL signing is used.
         * 
         * <!---->
         * 
         * *   If the OutputType parameter is set to **oss**:
         * 
         *     *   The mezzanine file URL has a validity period only if the permissions on the Object Storage Service (OSS) bucket are private. Otherwise, the mezzanine file URL is permanently valid.
         *     *   Minimum value: **1**.
         *     *   Maximum value: **2592000** (30 days). The maximum value is limited to reduce security risks of the origin.
         *     *   Default value: If you do not set this parameter, the default value is **3600**.
         */
        public Builder authTimeout(Long authTimeout) {
            this.putQueryParameter("AuthTimeout", authTimeout);
            this.authTimeout = authTimeout;
            return this;
        }

        /**
         * The type of the mezzanine file URL. Valid values:
         * <p>
         * 
         * - **oss**: OSS URL
         * - **cdn** (default): Content Delivery Network (CDN) URL
         * 
         * > If the mezzanine file is stored in a bucket of the in type, only an OSS URL is returned.
         */
        public Builder outputType(String outputType) {
            this.putQueryParameter("OutputType", outputType);
            this.outputType = outputType;
            return this;
        }

        /**
         * The ID of the video.
         */
        public Builder videoId(String videoId) {
            this.putQueryParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        @Override
        public GetMezzanineInfoRequest build() {
            return new GetMezzanineInfoRequest(this);
        } 

    } 

}
