// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadStreamByURLRequest} extends {@link RequestModel}
 *
 * <p>UploadStreamByURLRequest</p>
 */
public class UploadStreamByURLRequest extends Request {
    @Query
    @NameInMap("Definition")
    @Validation(required = true)
    private String definition;

    @Query
    @NameInMap("FileExtension")
    private String fileExtension;

    @Query
    @NameInMap("HDRType")
    private String HDRType;

    @Query
    @NameInMap("MediaId")
    @Validation(required = true)
    private String mediaId;

    @Query
    @NameInMap("StreamURL")
    @Validation(required = true)
    private String streamURL;

    @Query
    @NameInMap("UserData")
    private String userData;

    private UploadStreamByURLRequest(Builder builder) {
        super(builder);
        this.definition = builder.definition;
        this.fileExtension = builder.fileExtension;
        this.HDRType = builder.HDRType;
        this.mediaId = builder.mediaId;
        this.streamURL = builder.streamURL;
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
            this.userData = request.userData;
        } 

        /**
         * The media ID in ApsaraVideo VOD.
         */
        public Builder definition(String definition) {
            this.putQueryParameter("Definition", definition);
            this.definition = definition;
            return this;
        }

        /**
         * The quality of the video stream.
         * <p>
         * 
         * For more information about valid values of this parameter, see [Parameters for media assets](~~124671~~).
         */
        public Builder fileExtension(String fileExtension) {
            this.putQueryParameter("FileExtension", fileExtension);
            this.fileExtension = fileExtension;
            return this;
        }

        /**
         * The file name extension of the transcoded stream.
         * <p>
         * 
         * For more information, see the Supported media file formats section in [Overview](~~55396~~).
         * 
         * If you set a value for this parameter, the file name extension specified in StreamURL is overwritten.
         * 
         * >  This parameter is required if you do not specify a file name extension in StreamURL.
         */
        public Builder HDRType(String HDRType) {
            this.putQueryParameter("HDRType", HDRType);
            this.HDRType = HDRType;
            return this;
        }

        /**
         * The URL of the OSS object.
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * The basic information.
         */
        public Builder streamURL(String streamURL) {
            this.putQueryParameter("StreamURL", streamURL);
            this.streamURL = streamURL;
            return this;
        }

        /**
         * The ID of the request.
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
