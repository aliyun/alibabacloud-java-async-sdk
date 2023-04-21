// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopyCdsFileRequest} extends {@link RequestModel}
 *
 * <p>CopyCdsFileRequest</p>
 */
public class CopyCdsFileRequest extends Request {
    @Query
    @NameInMap("AutoRename")
    private Boolean autoRename;

    @Query
    @NameInMap("CdsId")
    private String cdsId;

    @Query
    @NameInMap("EndUserId")
    private String endUserId;

    @Query
    @NameInMap("FileId")
    private String fileId;

    @Query
    @NameInMap("ParentFolderId")
    private String parentFolderId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private CopyCdsFileRequest(Builder builder) {
        super(builder);
        this.autoRename = builder.autoRename;
        this.cdsId = builder.cdsId;
        this.endUserId = builder.endUserId;
        this.fileId = builder.fileId;
        this.parentFolderId = builder.parentFolderId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyCdsFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRename
     */
    public Boolean getAutoRename() {
        return this.autoRename;
    }

    /**
     * @return cdsId
     */
    public String getCdsId() {
        return this.cdsId;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return parentFolderId
     */
    public String getParentFolderId() {
        return this.parentFolderId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CopyCdsFileRequest, Builder> {
        private Boolean autoRename; 
        private String cdsId; 
        private String endUserId; 
        private String fileId; 
        private String parentFolderId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CopyCdsFileRequest request) {
            super(request);
            this.autoRename = request.autoRename;
            this.cdsId = request.cdsId;
            this.endUserId = request.endUserId;
            this.fileId = request.fileId;
            this.parentFolderId = request.parentFolderId;
            this.regionId = request.regionId;
        } 

        /**
         * AutoRename.
         */
        public Builder autoRename(Boolean autoRename) {
            this.putQueryParameter("AutoRename", autoRename);
            this.autoRename = autoRename;
            return this;
        }

        /**
         * CdsId.
         */
        public Builder cdsId(String cdsId) {
            this.putQueryParameter("CdsId", cdsId);
            this.cdsId = cdsId;
            return this;
        }

        /**
         * EndUserId.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * FileId.
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * ParentFolderId.
         */
        public Builder parentFolderId(String parentFolderId) {
            this.putQueryParameter("ParentFolderId", parentFolderId);
            this.parentFolderId = parentFolderId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CopyCdsFileRequest build() {
            return new CopyCdsFileRequest(this);
        } 

    } 

}
