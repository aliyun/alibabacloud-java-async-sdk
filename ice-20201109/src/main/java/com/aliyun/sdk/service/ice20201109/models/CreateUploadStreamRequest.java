// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link CreateUploadStreamRequest} extends {@link RequestModel}
 *
 * <p>CreateUploadStreamRequest</p>
 */
public class CreateUploadStreamRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Definition")
    private String definition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileExtension")
    private String fileExtension;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HDRType")
    private String HDRType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaId")
    private String mediaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private CreateUploadStreamRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.definition = builder.definition;
        this.fileExtension = builder.fileExtension;
        this.HDRType = builder.HDRType;
        this.mediaId = builder.mediaId;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUploadStreamRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<CreateUploadStreamRequest, Builder> {
        private String regionId; 
        private String definition; 
        private String fileExtension; 
        private String HDRType; 
        private String mediaId; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(CreateUploadStreamRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.definition = request.definition;
            this.fileExtension = request.fileExtension;
            this.HDRType = request.HDRType;
            this.mediaId = request.mediaId;
            this.userData = request.userData;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The quality of the media stream. Valid values:</p>
         * <ul>
         * <li>FD: low definition.</li>
         * <li>LD: standard definition.</li>
         * <li>SD: high definition.</li>
         * <li>HD: ultra-high definition.</li>
         * <li>OD: original quality.</li>
         * <li>2K: 2K resolution.</li>
         * <li>4K: 4K resolution.</li>
         * <li>SQ: standard sound quality.</li>
         * <li>HQ: high sound quality.</li>
         * </ul>
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
         * <p>The file name extension of the media stream.</p>
         * 
         * <strong>example:</strong>
         * <p>MP4</p>
         */
        public Builder fileExtension(String fileExtension) {
            this.putQueryParameter("FileExtension", fileExtension);
            this.fileExtension = fileExtension;
            return this;
        }

        /**
         * <p>The high dynamic range (HDR) format of the transcoded stream. Valid values:</p>
         * <ul>
         * <li>HDR</li>
         * <li>HDR10</li>
         * <li>HLG</li>
         * <li>DolbyVision</li>
         * <li>HDRVivid</li>
         * <li>SDR+</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The value is not case-sensitive,</p>
         * </li>
         * <li><p>You can leave this parameter empty for non-HDR streams.</p>
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
         * <p>The ID of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * <p>The user data.</p>
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
        public CreateUploadStreamRequest build() {
            return new CreateUploadStreamRequest(this);
        } 

    } 

}
