// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link ApplyTempStorageLeaseRequest} extends {@link RequestModel}
 *
 * <p>ApplyTempStorageLeaseRequest</p>
 */
public class ApplyTempStorageLeaseRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SizeInBytes")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sizeInBytes;

    private ApplyTempStorageLeaseRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.regionId = builder.regionId;
        this.fileName = builder.fileName;
        this.sizeInBytes = builder.sizeInBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyTempStorageLeaseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return sizeInBytes
     */
    public Long getSizeInBytes() {
        return this.sizeInBytes;
    }

    public static final class Builder extends Request.Builder<ApplyTempStorageLeaseRequest, Builder> {
        private String workspaceId; 
        private String regionId; 
        private String fileName; 
        private Long sizeInBytes; 

        private Builder() {
            super();
        } 

        private Builder(ApplyTempStorageLeaseRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.regionId = request.regionId;
            this.fileName = request.fileName;
            this.sizeInBytes = request.sizeInBytes;
        } 

        /**
         * <p>The Model Studio workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-mbhn96xxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The file name, including the file extension.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.txt</p>
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The size of the file, in bytes.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder sizeInBytes(Long sizeInBytes) {
            this.putBodyParameter("SizeInBytes", sizeInBytes);
            this.sizeInBytes = sizeInBytes;
            return this;
        }

        @Override
        public ApplyTempStorageLeaseRequest build() {
            return new ApplyTempStorageLeaseRequest(this);
        } 

    } 

}
