// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCdsFileShareLinkRequest} extends {@link RequestModel}
 *
 * <p>CreateCdsFileShareLinkRequest</p>
 */
public class CreateCdsFileShareLinkRequest extends Request {
    @Query
    @NameInMap("CdsId")
    @Validation(required = true)
    private String cdsId;

    @Query
    @NameInMap("Description")
    @Validation(maxLength = 1024)
    private String description;

    @Query
    @NameInMap("DisableDownload")
    private Boolean disableDownload;

    @Query
    @NameInMap("DisablePreview")
    private Boolean disablePreview;

    @Query
    @NameInMap("DisableSave")
    private Boolean disableSave;

    @Query
    @NameInMap("DownloadLimit")
    @Validation(maximum = 99999)
    private Long downloadLimit;

    @Query
    @NameInMap("EndUserId")
    private String endUserId;

    @Query
    @NameInMap("Expiration")
    private String expiration;

    @Query
    @NameInMap("FileIds")
    private java.util.List < String > fileIds;

    @Query
    @NameInMap("PreviewLimit")
    @Validation(maximum = 99999)
    private Long previewLimit;

    @Query
    @NameInMap("SaveLimit")
    @Validation(maximum = 99999)
    private Long saveLimit;

    @Query
    @NameInMap("ShareName")
    @Validation(maxLength = 128)
    private String shareName;

    @Query
    @NameInMap("SharePwd")
    @Validation(maxLength = 8)
    private String sharePwd;

    private CreateCdsFileShareLinkRequest(Builder builder) {
        super(builder);
        this.cdsId = builder.cdsId;
        this.description = builder.description;
        this.disableDownload = builder.disableDownload;
        this.disablePreview = builder.disablePreview;
        this.disableSave = builder.disableSave;
        this.downloadLimit = builder.downloadLimit;
        this.endUserId = builder.endUserId;
        this.expiration = builder.expiration;
        this.fileIds = builder.fileIds;
        this.previewLimit = builder.previewLimit;
        this.saveLimit = builder.saveLimit;
        this.shareName = builder.shareName;
        this.sharePwd = builder.sharePwd;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCdsFileShareLinkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cdsId
     */
    public String getCdsId() {
        return this.cdsId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return disableDownload
     */
    public Boolean getDisableDownload() {
        return this.disableDownload;
    }

    /**
     * @return disablePreview
     */
    public Boolean getDisablePreview() {
        return this.disablePreview;
    }

    /**
     * @return disableSave
     */
    public Boolean getDisableSave() {
        return this.disableSave;
    }

    /**
     * @return downloadLimit
     */
    public Long getDownloadLimit() {
        return this.downloadLimit;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return expiration
     */
    public String getExpiration() {
        return this.expiration;
    }

    /**
     * @return fileIds
     */
    public java.util.List < String > getFileIds() {
        return this.fileIds;
    }

    /**
     * @return previewLimit
     */
    public Long getPreviewLimit() {
        return this.previewLimit;
    }

    /**
     * @return saveLimit
     */
    public Long getSaveLimit() {
        return this.saveLimit;
    }

    /**
     * @return shareName
     */
    public String getShareName() {
        return this.shareName;
    }

    /**
     * @return sharePwd
     */
    public String getSharePwd() {
        return this.sharePwd;
    }

    public static final class Builder extends Request.Builder<CreateCdsFileShareLinkRequest, Builder> {
        private String cdsId; 
        private String description; 
        private Boolean disableDownload; 
        private Boolean disablePreview; 
        private Boolean disableSave; 
        private Long downloadLimit; 
        private String endUserId; 
        private String expiration; 
        private java.util.List < String > fileIds; 
        private Long previewLimit; 
        private Long saveLimit; 
        private String shareName; 
        private String sharePwd; 

        private Builder() {
            super();
        } 

        private Builder(CreateCdsFileShareLinkRequest request) {
            super(request);
            this.cdsId = request.cdsId;
            this.description = request.description;
            this.disableDownload = request.disableDownload;
            this.disablePreview = request.disablePreview;
            this.disableSave = request.disableSave;
            this.downloadLimit = request.downloadLimit;
            this.endUserId = request.endUserId;
            this.expiration = request.expiration;
            this.fileIds = request.fileIds;
            this.previewLimit = request.previewLimit;
            this.saveLimit = request.saveLimit;
            this.shareName = request.shareName;
            this.sharePwd = request.sharePwd;
        } 

        /**
         * The ID of the cloud disk.
         */
        public Builder cdsId(String cdsId) {
            this.putQueryParameter("CdsId", cdsId);
            this.cdsId = cdsId;
            return this;
        }

        /**
         * The description of the file sharing task. The description must be 0 to 1,024 characters in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Specifies whether to prohibit the download of the files that are being shared.
         * <p>
         * 
         * Valid values:
         * 
         * *   true
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     prohibits file download
         * 
         *     <!-- -->
         * 
         *     .
         * 
         * *   false
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     allows file download
         * 
         *     <!-- -->
         * 
         *     .
         */
        public Builder disableDownload(Boolean disableDownload) {
            this.putQueryParameter("DisableDownload", disableDownload);
            this.disableDownload = disableDownload;
            return this;
        }

        /**
         * Specifies whether to prohibit the preview of the files that are being shared.
         * <p>
         * 
         * Valid values:
         * 
         * *   true
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     prohibits file preview
         * 
         *     <!-- -->
         * 
         *     .
         * 
         * *   false
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     allows file preview
         * 
         *     <!-- -->
         * 
         *     .
         */
        public Builder disablePreview(Boolean disablePreview) {
            this.putQueryParameter("DisablePreview", disablePreview);
            this.disablePreview = disablePreview;
            return this;
        }

        /**
         * Specifies whether to prohibit the dump of the files that are being shared.
         * <p>
         * 
         * Valid values:
         * 
         * *   true
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     prohibits file dump
         * 
         *     <!-- -->
         * 
         *     .
         * 
         * *   false
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     allows file dump
         * 
         *     <!-- -->
         * 
         *     .
         */
        public Builder disableSave(Boolean disableSave) {
            this.putQueryParameter("DisableSave", disableSave);
            this.disableSave = disableSave;
            return this;
        }

        /**
         * The limit on the number of times that the shared files can be downloaded. The value of this parameter must be equal to or greater than 0. The value 0 specifies that no limit is imposed on the number of times that the shared files can be downloaded.
         */
        public Builder downloadLimit(Long downloadLimit) {
            this.putQueryParameter("DownloadLimit", downloadLimit);
            this.downloadLimit = downloadLimit;
            return this;
        }

        /**
         * The ID of the end user.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * The time when the file sharing link expires. The value of this parameter follows the RFC 3339 standard. Example: "2020-06-28T11:33:00.000+08:00". If this parameter is set to "", the file sharing link never expires.
         */
        public Builder expiration(String expiration) {
            this.putQueryParameter("Expiration", expiration);
            this.expiration = expiration;
            return this;
        }

        /**
         * The file IDs.
         */
        public Builder fileIds(java.util.List < String > fileIds) {
            this.putQueryParameter("FileIds", fileIds);
            this.fileIds = fileIds;
            return this;
        }

        /**
         * The limit on the number of times that the shared files can be previewed. The value of this parameter must be equal to or greater than 0. The value 0 specifies that no limit is imposed on the number of times that the shared files can be previewed.
         */
        public Builder previewLimit(Long previewLimit) {
            this.putQueryParameter("PreviewLimit", previewLimit);
            this.previewLimit = previewLimit;
            return this;
        }

        /**
         * The limit on the number of times that the shared files can be dumped. The value of this parameter must be equal to or greater than 0. The value 0 specifies that no limit is imposed on the number of times that the shared files can be dumped.
         */
        public Builder saveLimit(Long saveLimit) {
            this.putQueryParameter("SaveLimit", saveLimit);
            this.saveLimit = saveLimit;
            return this;
        }

        /**
         * The name of the file sharing task. If you leave this parameter empty, the file name that corresponds to the first ID in the file ID list is used. The name must be 0 to 128 characters in length.
         */
        public Builder shareName(String shareName) {
            this.putQueryParameter("ShareName", shareName);
            this.shareName = shareName;
            return this;
        }

        /**
         * The length of the access code. Valid values: 6 to 8. Unit: bytes. If you leave this parameter empty or set it to null, no access code is required. If you use a token to share files, you do not need to configure this parameter. The access code can contain only visible ASCII characters.
         */
        public Builder sharePwd(String sharePwd) {
            this.putQueryParameter("SharePwd", sharePwd);
            this.sharePwd = sharePwd;
            return this;
        }

        @Override
        public CreateCdsFileShareLinkRequest build() {
            return new CreateCdsFileShareLinkRequest(this);
        } 

    } 

}
