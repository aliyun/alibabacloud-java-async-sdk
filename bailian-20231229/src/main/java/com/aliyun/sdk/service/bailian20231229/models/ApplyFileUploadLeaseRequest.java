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
    @com.aliyun.core.annotation.NameInMap("CategoryType")
    private String categoryType;

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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UseInternalEndpoint")
    private Boolean useInternalEndpoint;

    private ApplyFileUploadLeaseRequest(Builder builder) {
        super(builder);
        this.categoryId = builder.categoryId;
        this.workspaceId = builder.workspaceId;
        this.regionId = builder.regionId;
        this.categoryType = builder.categoryType;
        this.fileName = builder.fileName;
        this.md5 = builder.md5;
        this.sizeInBytes = builder.sizeInBytes;
        this.useInternalEndpoint = builder.useInternalEndpoint;
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
     * @return categoryType
     */
    public String getCategoryType() {
        return this.categoryType;
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

    /**
     * @return useInternalEndpoint
     */
    public Boolean getUseInternalEndpoint() {
        return this.useInternalEndpoint;
    }

    public static final class Builder extends Request.Builder<ApplyFileUploadLeaseRequest, Builder> {
        private String categoryId; 
        private String workspaceId; 
        private String regionId; 
        private String categoryType; 
        private String fileName; 
        private String md5; 
        private String sizeInBytes; 
        private Boolean useInternalEndpoint; 

        private Builder() {
            super();
        } 

        private Builder(ApplyFileUploadLeaseRequest request) {
            super(request);
            this.categoryId = request.categoryId;
            this.workspaceId = request.workspaceId;
            this.regionId = request.regionId;
            this.categoryType = request.categoryType;
            this.fileName = request.fileName;
            this.md5 = request.md5;
            this.sizeInBytes = request.sizeInBytes;
            this.useInternalEndpoint = request.useInternalEndpoint;
        } 

        /**
         * <p>When uploading a file for building a <a href="https://help.aliyun.com/document_detail/2807740.html">knowledge base</a>:</p>
         * <ul>
         * <li><p>This parameter specifies the category ID to which the uploaded file belongs, which is the <code>CategoryId</code> returned by the <strong>AddCategory</strong> operation. You can also obtain it on the &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a> - Files tab&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a> - Files tab by clicking the ID icon next to the category name. You can pass in default to use the system-created &quot;Default Category&quot;.</p>
         * <blockquote>
         * <p>To create a new data table and upload data, use the Alibaba Cloud Model Studio console. This is not supported through the API.</p>
         * </blockquote>
         * <p>&lt;props=&quot;china&quot;&gt;
         * When uploading a file for agent application <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/file-interaction">session interaction</a>:</p>
         * </li>
         * <li><p>Pass in default. The system performs automatic creation or matches the default category. Dynamic file category APIs and console management pages will be available in the future.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cate_cdd11b1b79a74e8bbd675c356a91ee35xxxxxxxx</p>
         */
        public Builder categoryId(String categoryId) {
            this.putPathParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * <p>The workspace ID to which the uploaded file belongs. For information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/2587495.html">How to use a workspace</a>. The bailian 2023-12-29 version does not provide an API for listing workspaces. Obtain the workspace ID from the Model Studio console before calling this operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-3z7uw7fwz0vexxxx</p>
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
         * <p>The category type. If this parameter is not specified, the default value is UNSTRUCTURED. Valid values:</p>
         * <p>UNSTRUCTURED: category, used for building <a href="https://help.aliyun.com/document_detail/2807740.html">knowledge base</a> scenarios.
         * &lt;props=&quot;china&quot;&gt;
         * SESSION_FILE: upload a file for agent application <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/file-interaction">session interaction</a>.</p>
         * <blockquote>
         * <p>To create a new data table and upload data, use the Alibaba Cloud Model Studio console. This is not supported through the API.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>UNSTRUCTURED</p>
         */
        public Builder categoryType(String categoryType) {
            this.putBodyParameter("CategoryType", categoryType);
            this.categoryType = categoryType;
            return this;
        }

        /**
         * <p>When uploading a file for building a <a href="https://help.aliyun.com/document_detail/2807740.html">knowledge base</a>:</p>
         * <ul>
         * <li><p>This parameter specifies the name of the file to upload. The file name extension must match the file format. Supported formats:</p>
         * <ul>
         * <li>Documents (less than 150 MB): doc, docx, wps, ppt, pptx, xls, xlsx, md, txt, pdf, epub, mobi.</li>
         * <li>Spreadsheets (10 MB or less recommended, 100,000 rows or less): xls, xlsx.</li>
         * <li>Plain text (10 MB or less recommended): md, txt.</li>
         * <li>Images (less than 20 MB, shortest side &gt; 15 px, longest side &lt; 8192 px, aspect ratio &lt; 50): png, jpg, jpeg, bmp, gif.</li>
         * <li>Audio: aac, amr, flac, flv, m4a, mp3, mpeg, ogg, opus, wav, webm, wma.</li>
         * <li>Video: mp4, mkv, avi, mov, wmv.</li>
         * </ul>
         * </li>
         * <li><p>The file name must be 4 to 128 characters in length. For other limits, see <a href="https://help.aliyun.com/document_detail/2880605.html">Knowledge base quotas and limits</a>.</p>
         * <blockquote>
         * <p>To create a new data table and upload data, use the Alibaba Cloud Model Studio console. This is not supported through the API.</p>
         * </blockquote>
         * <p>&lt;props=&quot;china&quot;&gt;
         * When uploading a file for agent application <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/file-interaction">session interaction</a>:</p>
         * </li>
         * <li><p>This parameter specifies the name of the file to upload. The file name extension must match the file format. Supported formats:</p>
         * <ul>
         * <li>Documents: doc, docx, wps, ppt, pptx, xls, xlsx, md, txt, pdf, epub, mobi.</li>
         * <li>Images: png, jpg, jpeg, bmp, gif.</li>
         * <li>Audio: aac, amr, flac, flv, m4a, mp3, mpeg, ogg, opus, wav, webm, wma.</li>
         * <li>Video: mp4, mkv, avi, mov, wmv.</li>
         * </ul>
         * </li>
         * <li><p>The file name must be 4 to 128 characters in length.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ProductList.pdf</p>
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The MD5 value of the file to upload. The server validates this parameter (validation is not currently enabled). Specify the correct value.</p>
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
         * <p>The size of the file to upload, in bytes. The server validates this parameter (validation is not currently enabled). Specify the correct value. Valid values: 1 B to 100 MB.</p>
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

        /**
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>If you use <a href="https://www.alibabacloud.com/help/en/model-studio/configure-resources-in-private-network">Alibaba Cloud Model Studio secure storage</a> and need to generate a lease URL accessible only from the Alibaba Cloud internal network in the same region, set this parameter to true for improved security. If this parameter is not specified, the default value is false, which generates a publicly accessible lease URL.</p>
         * <blockquote>
         * <p>If you have not activated Alibaba Cloud Model Studio secure storage, or are unsure whether you are using it, do not set this parameter to true (the upload will fail).</p>
         * </blockquote>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <p>If you use Alibaba Cloud Model Studio secure storage and need to generate a lease URL accessible only from the Alibaba Cloud internal network in the same region, set this parameter to true for improved security. If this parameter is not specified, the default value is false, which generates a publicly accessible lease URL.</p>
         * <blockquote>
         * <p>If you have not activated Alibaba Cloud Model Studio secure storage, or are unsure whether you are using it, do not set this parameter to true (the upload will fail).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder useInternalEndpoint(Boolean useInternalEndpoint) {
            this.putBodyParameter("UseInternalEndpoint", useInternalEndpoint);
            this.useInternalEndpoint = useInternalEndpoint;
            return this;
        }

        @Override
        public ApplyFileUploadLeaseRequest build() {
            return new ApplyFileUploadLeaseRequest(this);
        } 

    } 

}
