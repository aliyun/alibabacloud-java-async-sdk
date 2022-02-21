// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddFileInfoRequest} extends {@link RequestModel}
 *
 * <p>AddFileInfoRequest</p>
 */
public class AddFileInfoRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("BusinessType")
    private Long businessType;

    @Query
    @NameInMap("FileType")
    private Long fileType;

    @Query
    @NameInMap("FileUrl")
    private String fileUrl;

    @Query
    @NameInMap("Filename")
    private String filename;

    @Query
    @NameInMap("MediaId")
    private String mediaId;

    private AddFileInfoRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.businessType = builder.businessType;
        this.fileType = builder.fileType;
        this.fileUrl = builder.fileUrl;
        this.filename = builder.filename;
        this.mediaId = builder.mediaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddFileInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return businessType
     */
    public Long getBusinessType() {
        return this.businessType;
    }

    /**
     * @return fileType
     */
    public Long getFileType() {
        return this.fileType;
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
    }

    /**
     * @return filename
     */
    public String getFilename() {
        return this.filename;
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    public static final class Builder extends Request.Builder<AddFileInfoRequest, Builder> {
        private String appId; 
        private Long businessType; 
        private Long fileType; 
        private String fileUrl; 
        private String filename; 
        private String mediaId; 

        private Builder() {
            super();
        } 

        private Builder(AddFileInfoRequest response) {
            super(response);
            this.appId = response.appId;
            this.businessType = response.businessType;
            this.fileType = response.fileType;
            this.fileUrl = response.fileUrl;
            this.filename = response.filename;
            this.mediaId = response.mediaId;
        } 

        /**
         * 应用
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * 文件业务类型
         */
        public Builder businessType(Long businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * 文件类型
         */
        public Builder fileType(Long fileType) {
            this.putQueryParameter("FileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * 文件oss地址
         */
        public Builder fileUrl(String fileUrl) {
            this.putQueryParameter("FileUrl", fileUrl);
            this.fileUrl = fileUrl;
            return this;
        }

        /**
         * 文件标题
         */
        public Builder filename(String filename) {
            this.putQueryParameter("Filename", filename);
            this.filename = filename;
            return this;
        }

        /**
         * 媒资Id
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        @Override
        public AddFileInfoRequest build() {
            return new AddFileInfoRequest(this);
        } 

    } 

}
