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

        private Builder(UploadStreamByURLRequest response) {
            super(response);
            this.definition = response.definition;
            this.fileExtension = response.fileExtension;
            this.HDRType = response.HDRType;
            this.mediaId = response.mediaId;
            this.streamURL = response.streamURL;
            this.userData = response.userData;
        } 

        /**
         * Definition.
         */
        public Builder definition(String definition) {
            this.putQueryParameter("Definition", definition);
            this.definition = definition;
            return this;
        }

        /**
         * FileExtension.
         */
        public Builder fileExtension(String fileExtension) {
            this.putQueryParameter("FileExtension", fileExtension);
            this.fileExtension = fileExtension;
            return this;
        }

        /**
         * 视频流HDR类型
         */
        public Builder HDRType(String HDRType) {
            this.putQueryParameter("HDRType", HDRType);
            this.HDRType = HDRType;
            return this;
        }

        /**
         * MediaId.
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * StreamURL.
         */
        public Builder streamURL(String streamURL) {
            this.putQueryParameter("StreamURL", streamURL);
            this.streamURL = streamURL;
            return this;
        }

        /**
         * UserData.
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
