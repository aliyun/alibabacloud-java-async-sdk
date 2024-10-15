// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeFileRequest} extends {@link RequestModel}
 *
 * <p>DescribeFileRequest</p>
 */
public class DescribeFileRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("FileId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DescribeFileRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.fileId = builder.fileId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFileRequest create() {
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
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeFileRequest, Builder> {
        private String workspaceId; 
        private String fileId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFileRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.fileId = request.fileId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the workspace to which the document belongs. On the <a href="https://bailian.console.aliyun.com/knowledge-base#/home">homepage</a> of the console, click the workspace Details icon in the upper-left corner to view the workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws_3AXoiweeTyTd03IN</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The primary key ID of the document, which is the <code>FileId</code> returned by the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/api-bailian-2023-12-29-addfile">AddFile</a> operation. You can also click the ID icon next to the file name on the <a href="https://bailian.console.aliyun.com/knowledge-base#/data-center">Data Management</a> page to view the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>file_9a65732555b54d5ea10796ca5742ba22_XXXXXXXX</p>
         */
        public Builder fileId(String fileId) {
            this.putPathParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeFileRequest build() {
            return new DescribeFileRequest(this);
        } 

    } 

}
