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
         * <p>Specifies the resolutions of the media streams you want to refresh or prefetch. You can specify multiple resolutions. Separate multiple resolutions with commas (,). If you leave this parameter empty, media streams in all resolutions are refreshed or prefetched by default.</p>
         * <blockquote>
         * <p> The value must be supported in the <strong>Definition</strong> section in <a href="https://help.aliyun.com/document_detail/124671.html">Parameters for media assets</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HD, SD</p>
         */
        public Builder definitions(String definitions) {
            this.putQueryParameter("Definitions", definitions);
            this.definitions = definitions;
            return this;
        }

        /**
         * <p>The formats of the media streams you want to refresh or prefetch. You can specify multiple formats. Separate multiple formats with commas (,). If you leave this parameter empty, media streams in all formats are refreshed or prefetched by default. Valid values:</p>
         * <ul>
         * <li><strong>mp4</strong></li>
         * <li><strong>m3u8</strong></li>
         * <li><strong>mp3</strong></li>
         * <li><strong>flv</strong></li>
         * <li><strong>webm</strong></li>
         * <li><strong>ts</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mp4,m3u8</p>
         */
        public Builder formats(String formats) {
            this.putQueryParameter("Formats", formats);
            this.formats = formats;
            return this;
        }

        /**
         * <p>The IDs of the media files that you want to refresh or prefetch. You can specify a maximum of 20 IDs. Separate multiple IDs with commas (,). You can use one of the following methods to obtain the ID:</p>
         * <ul>
         * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD</a> console. In the left-side navigation pane, choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong>. On the Video and Audio page, view the ID of the audio or video file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.</li>
         * <li>Obtain the value of VideoId from the response to the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation that you call to upload media files.</li>
         * <li>Obtain the value of VideoId from the response to the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation that you call to query the media ID after the media file is uploaded.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ca3a8f6e4957b658067095869****, a6e49sfgd23p5g9ja7095863****</p>
         */
        public Builder mediaIds(String mediaIds) {
            this.putQueryParameter("MediaIds", mediaIds);
            this.mediaIds = mediaIds;
            return this;
        }

        /**
         * <p>Specifies the type of the refresh or prefetch operation. Default value: Single. Valid values:</p>
         * <ul>
         * <li><strong>Single</strong>: Only one latest transcoded stream is refreshed or prefetched for each resolution and format.</li>
         * <li><strong>Multiple</strong>: All transcoded streams are refreshed or prefetched for each resolution and format.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Single</p>
         */
        public Builder resultType(String resultType) {
            this.putQueryParameter("ResultType", resultType);
            this.resultType = resultType;
            return this;
        }

        /**
         * <p>Specifies the number of the playback URLs of the TS files for the M3U8 media stream you want to refresh or prefetch. After you set this parameter, only the playback URLs of the first N TS files will be refreshed or prefetched. Valid values: 1 to 20. Default value: 5.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder sliceCount(Integer sliceCount) {
            this.putQueryParameter("SliceCount", sliceCount);
            this.sliceCount = sliceCount;
            return this;
        }

        /**
         * <p>Specifies whether to refresh or prefetch the playback URLs of the TS files of the M3U8 media stream. Default value: false. Valid values:</p>
         * <ul>
         * <li><strong>false</strong></li>
         * <li><strong>true</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder sliceFlag(Boolean sliceFlag) {
            this.putQueryParameter("SliceFlag", sliceFlag);
            this.sliceFlag = sliceFlag;
            return this;
        }

        /**
         * <p>Specifies the types of media streams you want to refresh or prefetch. You can specify multiple types. Separate multiple types with commas (,). If you leave this parameter empty, media streams in all types are refreshed or prefetched by default. Valid values:</p>
         * <ul>
         * <li><strong>video</strong></li>
         * <li><strong>audio</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        public Builder streamType(String streamType) {
            this.putQueryParameter("StreamType", streamType);
            this.streamType = streamType;
            return this;
        }

        /**
         * <p>The type of the task that you want to create. Valid values:</p>
         * <ul>
         * <li><strong>Refresh</strong></li>
         * <li><strong>Preload</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Preload</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * <p>The custom configurations such as callback configurations and upload acceleration configurations. The value must be a JSON string. For more information, see the &quot;UserData: specifies the custom configurations for media upload&quot; section in the <a href="https://help.aliyun.com/document_detail/86952.html">Request parameter</a> topic.</p>
         * <blockquote>
         * <ul>
         * <li>The callback configurations take effect only after you specify the HTTP callback URL and select specific callback events in the ApsaraVideo VOD console. For more information about how to configure HTTP callback settings in the ApsaraVideo VOD console, see <a href="https://help.aliyun.com/document_detail/86071.html">Configure callback settings</a>.</li>
         * <li>To enable the upload acceleration feature, submit a ticket. For more information, see <a href="https://help.aliyun.com/document_detail/55396.html">Overview</a>. For more information about how to submit a ticket, see <a href="https://help.aliyun.com/document_detail/464625.html">Contact us</a>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://example.aliyundoc.com%22%7D">http://example.aliyundoc.com&quot;}</a>, &quot;Extend&quot;:{&quot;localId&quot;:&quot;xxx&quot;,&quot;test&quot;:&quot;www&quot;}}</p>
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
