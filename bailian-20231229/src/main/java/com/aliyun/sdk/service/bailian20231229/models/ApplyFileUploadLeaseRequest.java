// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ApplyFileUploadLeaseRequest} extends {@link RequestModel}
 *
 * <p>ApplyFileUploadLeaseRequest</p>
 */
public class ApplyFileUploadLeaseRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String categoryId;

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
    @com.aliyun.core.annotation.NameInMap("Md5")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String md5;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SizeInBytes")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sizeInBytes;

    private ApplyFileUploadLeaseRequest(Builder builder) {
        super(builder);
        this.categoryId = builder.categoryId;
        this.workspaceId = builder.workspaceId;
        this.regionId = builder.regionId;
        this.fileName = builder.fileName;
        this.md5 = builder.md5;
        this.sizeInBytes = builder.sizeInBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyFileUploadLeaseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryId
     */
    public String getCategoryId() {
        return this.categoryId;
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
     * @return md5
     */
    public String getMd5() {
        return this.md5;
    }

    /**
     * @return sizeInBytes
     */
    public String getSizeInBytes() {
        return this.sizeInBytes;
    }

    public static final class Builder extends Request.Builder<ApplyFileUploadLeaseRequest, Builder> {
        private String categoryId; 
        private String workspaceId; 
        private String regionId; 
        private String fileName; 
        private String md5; 
        private String sizeInBytes; 

        private Builder() {
            super();
        } 

        private Builder(ApplyFileUploadLeaseRequest request) {
            super(request);
            this.categoryId = request.categoryId;
            this.workspaceId = request.workspaceId;
            this.regionId = request.regionId;
            this.fileName = request.fileName;
            this.md5 = request.md5;
            this.sizeInBytes = request.sizeInBytes;
        } 

        /**
         * <p>The primary key ID of the category to which the uploaded document belongs, which is the <code>CategoryId</code> returned by the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/api-bailian-2023-12-29-addcategory">AddCategory</a> interface. You can also click the ID icon next to the category name on the Unstructured Data tab of the <a href="https://bailian.console.aliyun.com/#/data-center">Data Management</a> page to view the ID. You can set the parameter to default, which specifies the Default Category created by the system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cate_cdd11b1b79a74e8bbd675c356a91ee3510024405</p>
         */
        public Builder categoryId(String categoryId) {
            this.putPathParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * <p>The ID of the workspace to which the uploaded document belongs. On the <a href="https://bailian.console.aliyun.com/knowledge-base#/home">homepage</a> of the console, click the workspace Details icon in the upper-left corner to view the workspace ID.</p>
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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the uploaded document, including the extension. Supported formats: pdf, doc, docx, md, txt, ppt, and pptx. The document name must be 4 to 128 characters in length.</p>
         * <p>This parameter is required.</p>
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The MD5 value of the uploaded document. This parameter is verified by the server (not in the current version).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>19657c391f6c70bcea63c154d8606bb3</p>
         */
        public Builder md5(String md5) {
            this.putBodyParameter("Md5", md5);
            this.md5 = md5;
            return this;
        }

        /**
         * <p>The size of the uploaded document, in bytes. This parameter is verified by the server (not in the current version). Valid values: 1 to 100000000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder sizeInBytes(String sizeInBytes) {
            this.putBodyParameter("SizeInBytes", sizeInBytes);
            this.sizeInBytes = sizeInBytes;
            return this;
        }

        @Override
        public ApplyFileUploadLeaseRequest build() {
            return new ApplyFileUploadLeaseRequest(this);
        } 

    } 

}
