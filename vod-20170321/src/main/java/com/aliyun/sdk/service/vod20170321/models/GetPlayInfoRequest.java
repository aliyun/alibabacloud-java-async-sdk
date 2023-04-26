// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPlayInfoRequest} extends {@link RequestModel}
 *
 * <p>GetPlayInfoRequest</p>
 */
public class GetPlayInfoRequest extends Request {
    @Query
    @NameInMap("AdditionType")
    private String additionType;

    @Query
    @NameInMap("AuthTimeout")
    private Long authTimeout;

    @Query
    @NameInMap("Definition")
    private String definition;

    @Query
    @NameInMap("Formats")
    private String formats;

    @Query
    @NameInMap("OutputType")
    private String outputType;

    @Query
    @NameInMap("PlayConfig")
    private String playConfig;

    @Query
    @NameInMap("ReAuthInfo")
    private String reAuthInfo;

    @Query
    @NameInMap("ResultType")
    private String resultType;

    @Query
    @NameInMap("StreamType")
    private String streamType;

    @Query
    @NameInMap("VideoId")
    @Validation(required = true)
    private String videoId;

    private GetPlayInfoRequest(Builder builder) {
        super(builder);
        this.additionType = builder.additionType;
        this.authTimeout = builder.authTimeout;
        this.definition = builder.definition;
        this.formats = builder.formats;
        this.outputType = builder.outputType;
        this.playConfig = builder.playConfig;
        this.reAuthInfo = builder.reAuthInfo;
        this.resultType = builder.resultType;
        this.streamType = builder.streamType;
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPlayInfoRequest create() {
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
     * @return definition
     */
    public String getDefinition() {
        return this.definition;
    }

    /**
     * @return formats
     */
    public String getFormats() {
        return this.formats;
    }

    /**
     * @return outputType
     */
    public String getOutputType() {
        return this.outputType;
    }

    /**
     * @return playConfig
     */
    public String getPlayConfig() {
        return this.playConfig;
    }

    /**
     * @return reAuthInfo
     */
    public String getReAuthInfo() {
        return this.reAuthInfo;
    }

    /**
     * @return resultType
     */
    public String getResultType() {
        return this.resultType;
    }

    /**
     * @return streamType
     */
    public String getStreamType() {
        return this.streamType;
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder extends Request.Builder<GetPlayInfoRequest, Builder> {
        private String additionType; 
        private Long authTimeout; 
        private String definition; 
        private String formats; 
        private String outputType; 
        private String playConfig; 
        private String reAuthInfo; 
        private String resultType; 
        private String streamType; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(GetPlayInfoRequest request) {
            super(request);
            this.additionType = request.additionType;
            this.authTimeout = request.authTimeout;
            this.definition = request.definition;
            this.formats = request.formats;
            this.outputType = request.outputType;
            this.playConfig = request.playConfig;
            this.reAuthInfo = request.reAuthInfo;
            this.resultType = request.resultType;
            this.streamType = request.streamType;
            this.videoId = request.videoId;
        } 

        /**
         * The ID of the media transcoding job. This ID uniquely identifies a media stream.
         */
        public Builder additionType(String additionType) {
            this.putQueryParameter("AdditionType", additionType);
            this.additionType = additionType;
            return this;
        }

        /**
         * The frame rate of the media stream. Unit: frames per second.
         */
        public Builder authTimeout(Long authTimeout) {
            this.putQueryParameter("AuthTimeout", authTimeout);
            this.authTimeout = authTimeout;
            return this;
        }

        /**
         * The type of Narrowband HD transcoding. Valid values:
         * <p>
         * 
         * *   **0**: regular
         * *   **1.0**: Narrowband HD 1.0
         * *   **2.0**: Narrowband HD 2.0
         * 
         * This parameter is returned only when a quality that is available in the built-in Narrowband HD 1.0 transcoding template is specified. For more information, see the [Definition parameter in the TranscodeTemplate](~~52839~~) table.
         */
        public Builder definition(String definition) {
            this.putQueryParameter("Definition", definition);
            this.definition = definition;
            return this;
        }

        /**
         * The update time. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
         */
        public Builder formats(String formats) {
            this.putQueryParameter("Formats", formats);
            this.formats = formats;
            return this;
        }

        /**
         * The URL of the masked live comment data. Set the value to **danmu**.
         * <p>
         * 
         * > This parameter takes effect only when the outputType parameter is set to **cdn**.
         */
        public Builder outputType(String outputType) {
            this.putQueryParameter("OutputType", outputType);
            this.outputType = outputType;
            return this;
        }

        /**
         * The quality of the video stream. Valid values:
         * <p>
         * 
         * *   **FD**: low definition
         * *   **LD**: standard definition
         * *   **SD**: high definition
         * *   **HD**: ultra-high definition
         * *   **OD**: original definition
         * *   **2K**: 2K
         * *   **4K**: 4K
         * *   **SQ**: standard sound quality
         * *   **HQ**: high sound quality
         * *   **AUTO**: adaptive bitrate
         */
        public Builder playConfig(String playConfig) {
            this.putQueryParameter("PlayConfig", playConfig);
            this.playConfig = playConfig;
            return this;
        }

        /**
         * The playback URL of the video stream.
         */
        public Builder reAuthInfo(String reAuthInfo) {
            this.putQueryParameter("ReAuthInfo", reAuthInfo);
            this.reAuthInfo = reAuthInfo;
            return this;
        }

        /**
         * The time when the audio or video file was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
         */
        public Builder resultType(String resultType) {
            this.putQueryParameter("ResultType", resultType);
            this.resultType = resultType;
            return this;
        }

        /**
         * Details of the audio or video file.
         */
        public Builder streamType(String streamType) {
            this.putQueryParameter("StreamType", streamType);
            this.streamType = streamType;
            return this;
        }

        /**
         * The basic information about the audio or video file.
         */
        public Builder videoId(String videoId) {
            this.putQueryParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        @Override
        public GetPlayInfoRequest build() {
            return new GetPlayInfoRequest(this);
        } 

    } 

}
