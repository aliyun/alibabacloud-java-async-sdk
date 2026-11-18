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
 * {@link UploadStreamByURLRequest} extends {@link RequestModel}
 *
 * <p>UploadStreamByURLRequest</p>
 */
public class UploadStreamByURLRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Definition")
    @com.aliyun.core.annotation.Validation(required = true)
    private String definition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileExtension")
    private String fileExtension;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HDRType")
    private String HDRType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mediaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamURL")
    @com.aliyun.core.annotation.Validation(required = true)
    private String streamURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadMetadata")
    private String uploadMetadata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private UploadStreamByURLRequest(Builder builder) {
        super(builder);
        this.definition = builder.definition;
        this.fileExtension = builder.fileExtension;
        this.HDRType = builder.HDRType;
        this.mediaId = builder.mediaId;
        this.streamURL = builder.streamURL;
        this.uploadMetadata = builder.uploadMetadata;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadStreamByURLRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return definition
     */
    public String getDefinition() {
        return this.definition;
    }

    /**
     * @return fileExtension
     */
    public String getFileExtension() {
        return this.fileExtension;
    }

    /**
     * @return HDRType
     */
    public String getHDRType() {
        return this.HDRType;
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return streamURL
     */
    public String getStreamURL() {
        return this.streamURL;
    }

    /**
     * @return uploadMetadata
     */
    public String getUploadMetadata() {
        return this.uploadMetadata;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<UploadStreamByURLRequest, Builder> {
        private String definition; 
        private String fileExtension; 
        private String HDRType; 
        private String mediaId; 
        private String streamURL; 
        private String uploadMetadata; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(UploadStreamByURLRequest request) {
            super(request);
            this.definition = request.definition;
            this.fileExtension = request.fileExtension;
            this.HDRType = request.HDRType;
            this.mediaId = request.mediaId;
            this.streamURL = request.streamURL;
            this.uploadMetadata = request.uploadMetadata;
            this.userData = request.userData;
        } 

        /**
         * <p>The definition of the video stream.</p>
         * <p>For details, see <a href="https://help.aliyun.com/document_detail/124671.html">Media asset parameter description - Definition</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HD</p>
         */
        public Builder definition(String definition) {
            this.putQueryParameter("Definition", definition);
            this.definition = definition;
            return this;
        }

        /**
         * <p>The file name extension of the transcoded stream file.</p>
         * <p>For supported audio and video file formats, see <a href="https://help.aliyun.com/document_detail/55396.html">Overview</a>.</p>
         * <p>If this parameter is not empty, it overwrites the file name extension in the StreamURL.</p>
         * <blockquote>
         * <p>Notice: This parameter is required if the StreamURL does not contain a file name extension.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>mp4</p>
         */
        public Builder fileExtension(String fileExtension) {
            this.putQueryParameter("FileExtension", fileExtension);
            this.fileExtension = fileExtension;
            return this;
        }

        /**
         * <p>The HDR type of the transcoded stream. Valid values:</p>
         * <ul>
         * <li>HDR</li>
         * <li>HDR10</li>
         * <li>HLG</li>
         * <li>DolbyVision</li>
         * <li>HDRVivid</li>
         * <li>SDR+<blockquote>
         * <ul>
         * <li>This parameter is case-insensitive.</li>
         * <li>Leave this parameter empty for non-HDR videos.</li>
         * </ul>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HDR10</p>
         */
        public Builder HDRType(String HDRType) {
            this.putQueryParameter("HDRType", HDRType);
            this.HDRType = HDRType;
            return this;
        }

        /**
         * <p>The ID of the ApsaraVideo VOD media asset that corresponds to the transcoded stream.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ca3a8f6e49*****57b65806709586</p>
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * <p>The URL of the transcoded stream file.</p>
         * <p>If the URL of the transcoded stream requires authentication, include the authentication parameters in StreamURL and make sure that the URL is accessible over public network access.</p>
         * <blockquote>
         * <p>You can obtain the audio or video URL from the console or by invoking the GetPlayInfo operation.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/lesson-01.mp4">https://example.com/lesson-01.mp4</a></p>
         */
        public Builder streamURL(String streamURL) {
            this.putQueryParameter("StreamURL", streamURL);
            this.streamURL = streamURL;
            return this;
        }

        /**
         * <p>The metadata of the media file to upload. The value is a JSON string.</p>
         * <ul>
         * <li>For more information, see the <strong>UploadMetadata</strong> table below.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AddressMapping&quot;:&quot;1&quot;,&quot;CustomPath&quot;:&quot;test/xxx&quot;,&quot;CustomFileName&quot;:&quot;xxx.mp4&quot;,&quot;isOverwritePath&quot;:&quot;0&quot;}</p>
         */
        public Builder uploadMetadata(String uploadMetadata) {
            this.putQueryParameter("UploadMetadata", uploadMetadata);
            this.uploadMetadata = uploadMetadata;
            return this;
        }

        /**
         * <p>The custom parameter. For more information, see <a href="https://help.aliyun.com/document_detail/86952.html">UserData</a>.</p>
         * <blockquote>
         * <p>To use the message callback in this parameter, configure the HTTP callback URL and select the corresponding callback event types in the console. Otherwise, the callback settings do not take effect. For information about how to configure HTTP callbacks in the console, see <a href="https://help.aliyun.com/document_detail/86071.html">Callback settings</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://aliyundoc.com%22%7D">http://aliyundoc.com&quot;}</a>, &quot;Extend&quot;:{&quot;localId&quot;:&quot;xxx&quot;,&quot;test&quot;:&quot;www&quot;}}</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public UploadStreamByURLRequest build() {
            return new UploadStreamByURLRequest(this);
        } 

    } 

}
