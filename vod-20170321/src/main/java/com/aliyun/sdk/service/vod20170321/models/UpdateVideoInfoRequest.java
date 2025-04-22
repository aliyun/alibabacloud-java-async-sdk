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
 * {@link UpdateVideoInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateVideoInfoRequest</p>
 */
public class UpdateVideoInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CateId")
    private Long cateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoverURL")
    private String coverURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String videoId;

    private UpdateVideoInfoRequest(Builder builder) {
        super(builder);
        this.cateId = builder.cateId;
        this.coverURL = builder.coverURL;
        this.description = builder.description;
        this.tags = builder.tags;
        this.title = builder.title;
        this.userData = builder.userData;
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVideoInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cateId
     */
    public Long getCateId() {
        return this.cateId;
    }

    /**
     * @return coverURL
     */
    public String getCoverURL() {
        return this.coverURL;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder extends Request.Builder<UpdateVideoInfoRequest, Builder> {
        private Long cateId; 
        private String coverURL; 
        private String description; 
        private String tags; 
        private String title; 
        private String userData; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVideoInfoRequest request) {
            super(request);
            this.cateId = request.cateId;
            this.coverURL = request.coverURL;
            this.description = request.description;
            this.tags = request.tags;
            this.title = request.title;
            this.userData = request.userData;
            this.videoId = request.videoId;
        } 

        /**
         * <p>The category ID. You can use one of the following methods to obtain the ID:</p>
         * <ul>
         * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Configuration Management</strong> &gt; <strong>Media Management</strong> &gt; <strong>Categories</strong> to view the category ID of the media file.</li>
         * <li>View the value of the CateId parameter returned by the <a href="https://help.aliyun.com/document_detail/56401.html">AddCategory</a> operation that you called to create a category.</li>
         * <li>View the value of the CateId parameter returned by the <a href="https://help.aliyun.com/document_detail/56406.html">GetCategories</a> operation that you called to query a category.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>384761111</p>
         */
        public Builder cateId(Long cateId) {
            this.putQueryParameter("CateId", cateId);
            this.cateId = cateId;
            return this;
        }

        /**
         * <p>The URL of the audio/video thumbnail.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.aliyundoc.com/****.jpg">https://example.aliyundoc.com/****.jpg</a></p>
         */
        public Builder coverURL(String coverURL) {
            this.putQueryParameter("CoverURL", coverURL);
            this.coverURL = coverURL;
            return this;
        }

        /**
         * <p>The description of the audio or video file.</p>
         * <ul>
         * <li>The description can be up to 1,024 bytes in length.</li>
         * <li>The value is encoded in UTF-8.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>video description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The tags of the media file.</p>
         * <ul>
         * <li>Each tag can be up to 32 bytes in length. You can specify up to 16 tags.</li>
         * <li>Separate multiple tags with commas (,).</li>
         * <li>The value is encoded in UTF-8.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tag1,tag2</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The title of the audio or video file.</p>
         * <ul>
         * <li>The name cannot exceed 128 bytes.</li>
         * <li>The value is encoded in UTF-8.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>video title</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>Custom settings. This is a JSON string that supports message callbacks, upload acceleration, and other settings. For more information, please refer to <a href="https://help.aliyun.com/document_detail/86952.html">UserData</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://example.aliyundoc.com%22%7D,%22Extend%22:%7B%22localId%22:%22*****%22,%22test%22:%22www%22%7D%7D">http://example.aliyundoc.com&quot;},&quot;Extend&quot;:{&quot;localId&quot;:&quot;*****&quot;,&quot;test&quot;:&quot;www&quot;}}</a></p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * <p>The ID of the audio or video file. Perform the following operations to obtain the storage address:</p>
         * <ul>
         * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong>. On the Video and Audio page, view the ID of the audio or video file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.</li>
         * <li>Obtain the value of VideoId from the response to the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation that you called to obtain the upload URL and credential.</li>
         * <li>View the value of the VideoId parameter returned by the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation that you called to query media information after the audio or video file is uploaded.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2deda93265312baf9b0ed810d****</p>
         */
        public Builder videoId(String videoId) {
            this.putQueryParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        @Override
        public UpdateVideoInfoRequest build() {
            return new UpdateVideoInfoRequest(this);
        } 

    } 

}
