// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshMediaPlayUrlsRequest} extends {@link RequestModel}
 *
 * <p>RefreshMediaPlayUrlsRequest</p>
 */
public class RefreshMediaPlayUrlsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Definitions")
    private String definitions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Formats")
    private String formats;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mediaIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResultType")
    private String resultType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SliceCount")
    private Integer sliceCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SliceFlag")
    private Boolean sliceFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamType")
    private String streamType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private RefreshMediaPlayUrlsRequest(Builder builder) {
        super(builder);
        this.definitions = builder.definitions;
        this.formats = builder.formats;
        this.mediaIds = builder.mediaIds;
        this.resultType = builder.resultType;
        this.sliceCount = builder.sliceCount;
        this.sliceFlag = builder.sliceFlag;
        this.streamType = builder.streamType;
        this.taskType = builder.taskType;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshMediaPlayUrlsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return definitions
     */
    public String getDefinitions() {
        return this.definitions;
    }

    /**
     * @return formats
     */
    public String getFormats() {
        return this.formats;
    }

    /**
     * @return mediaIds
     */
    public String getMediaIds() {
        return this.mediaIds;
    }

    /**
     * @return resultType
     */
    public String getResultType() {
        return this.resultType;
    }

    /**
     * @return sliceCount
     */
    public Integer getSliceCount() {
        return this.sliceCount;
    }

    /**
     * @return sliceFlag
     */
    public Boolean getSliceFlag() {
        return this.sliceFlag;
    }

    /**
     * @return streamType
     */
    public String getStreamType() {
        return this.streamType;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<RefreshMediaPlayUrlsRequest, Builder> {
        private String definitions; 
        private String formats; 
        private String mediaIds; 
        private String resultType; 
        private Integer sliceCount; 
        private Boolean sliceFlag; 
        private String streamType; 
        private String taskType; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(RefreshMediaPlayUrlsRequest request) {
            super(request);
            this.definitions = request.definitions;
            this.formats = request.formats;
            this.mediaIds = request.mediaIds;
            this.resultType = request.resultType;
            this.sliceCount = request.sliceCount;
            this.sliceFlag = request.sliceFlag;
            this.streamType = request.streamType;
            this.taskType = request.taskType;
            this.userData = request.userData;
        } 

        /**
         * Specifies the resolutions of the media streams you want to refresh or prefetch. You can specify multiple resolutions. Separate multiple resolutions with commas (,). If you leave this parameter empty, media streams in all resolutions are refreshed or prefetched by default.
         * <p>
         * 
         * >  The value must be supported in the **Definition** section in [Parameters for media assets](~~124671~~).
         */
        public Builder definitions(String definitions) {
            this.putQueryParameter("Definitions", definitions);
            this.definitions = definitions;
            return this;
        }

        /**
         * The formats of the media streams you want to refresh or prefetch. You can specify multiple formats. Separate multiple formats with commas (,). If you leave this parameter empty, media streams in all formats are refreshed or prefetched by default. Valid values:
         * <p>
         * 
         * *   **mp4**
         * *   **m3u8**
         * *   **mp3**
         * *   **flv**
         * *   **webm**
         * *   **ts**
         */
        public Builder formats(String formats) {
            this.putQueryParameter("Formats", formats);
            this.formats = formats;
            return this;
        }

        /**
         * The IDs of the media files that you want to refresh or prefetch. You can specify a maximum of 20 IDs. Separate multiple IDs with commas (,). You can use one of the following methods to obtain the ID:
         * <p>
         * 
         * *   Log on to the [ApsaraVideo VOD](https://vod.console.aliyun.com) console. In the left-side navigation pane, choose **Media Files** > **Audio/Video**. On the Video and Audio page, view the ID of the audio or video file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.
         * *   Obtain the value of VideoId from the response to the [CreateUploadVideo](~~55407~~) operation that you call to upload media files.
         * *   Obtain the value of VideoId from the response to the [SearchMedia](~~86044~~) operation that you call to query the media ID after the media file is uploaded.
         */
        public Builder mediaIds(String mediaIds) {
            this.putQueryParameter("MediaIds", mediaIds);
            this.mediaIds = mediaIds;
            return this;
        }

        /**
         * Specifies the type of the refresh or prefetch operation. Default value: Single. Valid values:
         * <p>
         * 
         * *   **Single**: Only one latest transcoded stream is refreshed or prefetched for each resolution and format.
         * *   **Multiple**: All transcoded streams are refreshed or prefetched for each resolution and format.
         */
        public Builder resultType(String resultType) {
            this.putQueryParameter("ResultType", resultType);
            this.resultType = resultType;
            return this;
        }

        /**
         * Specifies the number of the playback URLs of the TS files for the M3U8 media stream you want to refresh or prefetch. After you set this parameter, only the playback URLs of the first N TS files will be refreshed or prefetched. Valid values: 1 to 20. Default value: 5.
         */
        public Builder sliceCount(Integer sliceCount) {
            this.putQueryParameter("SliceCount", sliceCount);
            this.sliceCount = sliceCount;
            return this;
        }

        /**
         * Specifies whether to refresh or prefetch the playback URLs of the TS files of the M3U8 media stream. Default value: false. Valid values:
         * <p>
         * 
         * *   **false**
         * *   **true**
         */
        public Builder sliceFlag(Boolean sliceFlag) {
            this.putQueryParameter("SliceFlag", sliceFlag);
            this.sliceFlag = sliceFlag;
            return this;
        }

        /**
         * Specifies the types of media streams you want to refresh or prefetch. You can specify multiple types. Separate multiple types with commas (,). If you leave this parameter empty, media streams in all types are refreshed or prefetched by default. Valid values:
         * <p>
         * 
         * *   **video**
         * *   **audio**
         */
        public Builder streamType(String streamType) {
            this.putQueryParameter("StreamType", streamType);
            this.streamType = streamType;
            return this;
        }

        /**
         * The type of the task that you want to create. Valid values:
         * <p>
         * 
         * *   **Refresh**
         * *   **Preload**
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * The custom configurations such as callback configurations and upload acceleration configurations. The value must be a JSON string. For more information, see the "UserData: specifies the custom configurations for media upload" section in the [Request parameter](~~86952~~) topic.
         * <p>
         * 
         * >*   The callback configurations take effect only after you specify the HTTP callback URL and select specific callback events in the ApsaraVideo VOD console. For more information about how to configure HTTP callback settings in the ApsaraVideo VOD console, see [Configure callback settings](~~86071~~).
         * >*   To enable the upload acceleration feature, submit a ticket. For more information, see [Overview](~~55396~~). For more information about how to submit a ticket, see [Contact us](~~464625~~).
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public RefreshMediaPlayUrlsRequest build() {
            return new RefreshMediaPlayUrlsRequest(this);
        } 

    } 

}
