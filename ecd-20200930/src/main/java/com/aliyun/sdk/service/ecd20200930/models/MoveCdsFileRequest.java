// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link MoveCdsFileRequest} extends {@link RequestModel}
 *
 * <p>MoveCdsFileRequest</p>
 */
public class MoveCdsFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CdsId")
    private String cdsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConflictPolicy")
    private String conflictPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileId")
    private String fileId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentFolderId")
    private String parentFolderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private MoveCdsFileRequest(Builder builder) {
        super(builder);
        this.cdsId = builder.cdsId;
        this.conflictPolicy = builder.conflictPolicy;
        this.endUserId = builder.endUserId;
        this.fileId = builder.fileId;
        this.groupId = builder.groupId;
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
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
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
        private String groupId; 
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
            this.groupId = request.groupId;
            this.parentFolderId = request.parentFolderId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The enterprise cloud disk ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+cds-346063****</p>
         */
        public Builder cdsId(String cdsId) {
            this.putQueryParameter("CdsId", cdsId);
            this.cdsId = cdsId;
            return this;
        }

        /**
         * <p>The policy for handling files with the same name.</p>
         * 
         * <strong>example:</strong>
         * <p>ignore</p>
         */
        public Builder conflictPolicy(String conflictPolicy) {
            this.putQueryParameter("ConflictPolicy", conflictPolicy);
            this.conflictPolicy = conflictPolicy;
            return this;
        }

        /**
         * <p>The ID of the user who uses the cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>user01</p>
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The file ID. You can call <a href="https://help.aliyun.com/document_detail/2247622.html">ListCdsFiles</a> to query the ID of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>63f3257b68b018170b194d87b875512d108f****</p>
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>The team space ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cg-hvyou5jbob3b0****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the parent folder at the destination. You can call <a href="https://help.aliyun.com/document_detail/2247622.html">ListCdsFiles</a> to query the ID of the file. Set this parameter to <code>root</code> if you want to move the file to the root directory.</p>
         * 
         * <strong>example:</strong>
         * <p>6409848a6da91d6240604e7ba7337d85ba8a1****</p>
         */
        public Builder parentFolderId(String parentFolderId) {
            this.putQueryParameter("ParentFolderId", parentFolderId);
            this.parentFolderId = parentFolderId;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
