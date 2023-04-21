// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MoveCdsFileRequest} extends {@link RequestModel}
 *
 * <p>MoveCdsFileRequest</p>
 */
public class MoveCdsFileRequest extends Request {
    @Query
    @NameInMap("CdsId")
    private String cdsId;

    @Query
    @NameInMap("ConflictPolicy")
    private String conflictPolicy;

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

    private MoveCdsFileRequest(Builder builder) {
        super(builder);
        this.cdsId = builder.cdsId;
        this.conflictPolicy = builder.conflictPolicy;
        this.endUserId = builder.endUserId;
        this.fileId = builder.fileId;
        this.parentFolderId = builder.parentFolderId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoveCdsFileRequest create() {
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
     * @return conflictPolicy
     */
    public String getConflictPolicy() {
        return this.conflictPolicy;
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

    public static final class Builder extends Request.Builder<MoveCdsFileRequest, Builder> {
        private String cdsId; 
        private String conflictPolicy; 
        private String endUserId; 
        private String fileId; 
        private String parentFolderId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(MoveCdsFileRequest request) {
            super(request);
            this.cdsId = request.cdsId;
            this.conflictPolicy = request.conflictPolicy;
            this.endUserId = request.endUserId;
            this.fileId = request.fileId;
            this.parentFolderId = request.parentFolderId;
            this.regionId = request.regionId;
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
         * ConflictPolicy.
         */
        public Builder conflictPolicy(String conflictPolicy) {
            this.putQueryParameter("ConflictPolicy", conflictPolicy);
            this.conflictPolicy = conflictPolicy;
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
        public MoveCdsFileRequest build() {
            return new MoveCdsFileRequest(this);
        } 

    } 

}
