// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteMezzaninesRequest} extends {@link RequestModel}
 *
 * <p>DeleteMezzaninesRequest</p>
 */
public class DeleteMezzaninesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String videoIds;

    private DeleteMezzaninesRequest(Builder builder) {
        super(builder);
        this.force = builder.force;
        this.videoIds = builder.videoIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMezzaninesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return videoIds
     */
    public String getVideoIds() {
        return this.videoIds;
    }

    public static final class Builder extends Request.Builder<DeleteMezzaninesRequest, Builder> {
        private Boolean force; 
        private String videoIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMezzaninesRequest request) {
            super(request);
            this.force = request.force;
            this.videoIds = request.videoIds;
        } 

        /**
         * <p>Specifies whether to forcibly delete the source file. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default)</li>
         * <li><strong>true</strong></li>
         * </ul>
         * <blockquote>
         * <p> If a video is uploaded without transcoding or is asynchronously transcoded, the source file of the video is used for original-quality playback. By default, the source file of the video cannot be deleted. To forcibly delete the mezzanine file, set this parameter to <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * <p>The IDs of audio or video files whose source files that you want to delete. You can specify up to 20 IDs. Separate multiple IDs with commas (,). You can use one of the following methods to obtain the ID:</p>
         * <ul>
         * <li>After you upload a video in the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>, you can log on to the ApsaraVideo VOD console and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the ID of the video.</li>
         * <li>Obtain the value of VideoId from the response to the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation that you called to obtain the upload URL and credential.</li>
         * <li>Obtain the value of VideoId from the response to the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation that you called to query media information after the audio or video file is uploaded.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>23ab850b4f654b6e91d24d8157****,93ab850b4f6f4b6e91d24d81d4****</p>
         */
        public Builder videoIds(String videoIds) {
            this.putQueryParameter("VideoIds", videoIds);
            this.videoIds = videoIds;
            return this;
        }

        @Override
        public DeleteMezzaninesRequest build() {
            return new DeleteMezzaninesRequest(this);
        } 

    } 

}
