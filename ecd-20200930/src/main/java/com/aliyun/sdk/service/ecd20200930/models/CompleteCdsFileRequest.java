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
 * {@link CompleteCdsFileRequest} extends {@link RequestModel}
 *
 * <p>CompleteCdsFileRequest</p>
 */
public class CompleteCdsFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CdsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cdsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uploadId;

    private CompleteCdsFileRequest(Builder builder) {
        super(builder);
        this.cdsId = builder.cdsId;
        this.endUserId = builder.endUserId;
        this.fileId = builder.fileId;
        this.groupId = builder.groupId;
        this.regionId = builder.regionId;
        this.uploadId = builder.uploadId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompleteCdsFileRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return uploadId
     */
    public String getUploadId() {
        return this.uploadId;
    }

    public static final class Builder extends Request.Builder<CompleteCdsFileRequest, Builder> {
        private String cdsId; 
        private String endUserId; 
        private String fileId; 
        private String groupId; 
        private String regionId; 
        private String uploadId; 

        private Builder() {
            super();
        } 

        private Builder(CompleteCdsFileRequest request) {
            super(request);
            this.cdsId = request.cdsId;
            this.endUserId = request.endUserId;
            this.fileId = request.fileId;
            this.groupId = request.groupId;
            this.regionId = request.regionId;
            this.uploadId = request.uploadId;
        } 

        /**
         * <p>The ID of the cloud disk.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai+cds-465878****</p>
         */
        public Builder cdsId(String cdsId) {
            this.putQueryParameter("CdsId", cdsId);
            this.cdsId = cdsId;
            return this;
        }

        /**
         * <p>The name of the end user.</p>
         * 
         * <strong>example:</strong>
         * <p>test0</p>
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The file ID. An ID is the unique identifier of a file.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>635a316c94f40f35f5354da29b2aee88c9d1****</p>
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
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

        /**
         * <p>The ID of the file uploading task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6C48B55A1FAC4E1A9E0579059514****</p>
         */
        public Builder uploadId(String uploadId) {
            this.putQueryParameter("UploadId", uploadId);
            this.uploadId = uploadId;
            return this;
        }

        @Override
        public CompleteCdsFileRequest build() {
            return new CompleteCdsFileRequest(this);
        } 

    } 

}
