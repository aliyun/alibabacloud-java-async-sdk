// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMezzanineInfoRequest} extends {@link RequestModel}
 *
 * <p>GetMezzanineInfoRequest</p>
 */
public class GetMezzanineInfoRequest extends Request {
    @Query
    @NameInMap("AdditionType")
    private String additionType;

    @Query
    @NameInMap("AuthTimeout")
    private Long authTimeout;

    @Query
    @NameInMap("OutputType")
    private String outputType;

    @Query
    @NameInMap("VideoId")
    @Validation(required = true)
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
         * The ID of the video.
         */
        public Builder additionType(String additionType) {
            this.putQueryParameter("AdditionType", additionType);
            this.additionType = additionType;
            return this;
        }

        /**
         * The type of the mezzanine file URL. Valid values:
         * <p>
         * 
         * - **oss**: OSS URL
         * - **cdn** (default): CDN URL
         * 
         * > If you specify an OSS URL for the video stream, the video stream must be in the MP4 format.
         */
        public Builder authTimeout(Long authTimeout) {
            this.putQueryParameter("AuthTimeout", authTimeout);
            this.authTimeout = authTimeout;
            return this;
        }

        /**
         * The frame rate of the file. Unit: frames per second.
         */
        public Builder outputType(String outputType) {
            this.putQueryParameter("OutputType", outputType);
            this.outputType = outputType;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **GetMezzanineInfo**.
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
