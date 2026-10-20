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
 * {@link AddFilesFromAuthorizedOssRequest} extends {@link RequestModel}
 *
 * <p>AddFilesFromAuthorizedOssRequest</p>
 */
public class AddFilesFromAuthorizedOssRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String categoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CategoryType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String categoryType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileDetails")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<FileDetails> fileDetails;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OssBucketName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossBucketName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OssRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OverWriteFileByOssKey")
    private Boolean overWriteFileByOssKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<String> tags;

    private AddFilesFromAuthorizedOssRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
        this.categoryId = builder.categoryId;
        this.categoryType = builder.categoryType;
        this.fileDetails = builder.fileDetails;
        this.ossBucketName = builder.ossBucketName;
        this.ossRegionId = builder.ossRegionId;
        this.overWriteFileByOssKey = builder.overWriteFileByOssKey;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddFilesFromAuthorizedOssRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return categoryId
     */
    public String getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return categoryType
     */
    public String getCategoryType() {
        return this.categoryType;
    }

    /**
     * @return fileDetails
     */
    public java.util.List<FileDetails> getFileDetails() {
        return this.fileDetails;
    }

    /**
     * @return ossBucketName
     */
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    /**
     * @return ossRegionId
     */
    public String getOssRegionId() {
        return this.ossRegionId;
    }

    /**
     * @return overWriteFileByOssKey
     */
    public Boolean getOverWriteFileByOssKey() {
        return this.overWriteFileByOssKey;
    }

    /**
     * @return tags
     */
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<AddFilesFromAuthorizedOssRequest, Builder> {
        private String regionId; 
        private String workspaceId; 
        private String categoryId; 
        private String categoryType; 
        private java.util.List<FileDetails> fileDetails; 
        private String ossBucketName; 
        private String ossRegionId; 
        private Boolean overWriteFileByOssKey; 
        private java.util.List<String> tags; 

        private Builder() {
            super();
        } 

        private Builder(AddFilesFromAuthorizedOssRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
            this.categoryId = request.categoryId;
            this.categoryType = request.categoryType;
            this.fileDetails = request.fileDetails;
            this.ossBucketName = request.ossBucketName;
            this.ossRegionId = request.ossRegionId;
            this.overWriteFileByOssKey = request.overWriteFileByOssKey;
            this.tags = request.tags;
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
         * <p>The workspace ID. Files are imported to this workspace. For more information about how to obtain the ID, see <a href="https://help.aliyun.com/document_detail/2587495.html">How to use a workspace</a>. The bailian 2023-12-29 version does not provide an API to enumerate workspaces. You must obtain the workspace ID in the Model Studio console before you call this operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-3z7uw7fwz0vxxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The ID of the destination category for the imported files. This is the CategoryId returned by the AddCategory operation. You can also obtain the category ID by clicking the ID icon next to the category name on the &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a> &gt; Files tab&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a> &gt; Files tab. You can set this parameter to default to use the default category created by the system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cate_cdd11b1b79a74e8bbd675c356a91ee35xxxxxxxx</p>
         */
        public Builder categoryId(String categoryId) {
            this.putBodyParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * <p>The category type. This parameter is optional. Default value: UNSTRUCTURED. Valid values:</p>
         * <ul>
         * <li>UNSTRUCTURED: category, used for building knowledge bases.</li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <blockquote>
         * <p>This operation does not support importing SESSION_FILE for <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/file-interaction">session interaction</a> in agent applications. Use the <strong>AddFile</strong> operation to upload SESSION_FILE from your local machine.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
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
         * <p>The list of files to import. You can upload up to 10 files at a time.</p>
         * <blockquote>
         * <p>You can upload up to 10 files at a time.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        public Builder fileDetails(java.util.List<FileDetails> fileDetails) {
            String fileDetailsShrink = shrink(fileDetails, "FileDetails", "json");
            this.putBodyParameter("FileDetails", fileDetailsShrink);
            this.fileDetails = fileDetails;
            return this;
        }

        /**
         * <p>The name of the OSS bucket. For more information, see <a href="https://help.aliyun.com/document_detail/177682.html">Buckets</a>. Before you import data from OSS for the first time, you must complete the authorization as prompted in the Model Studio console and add a tag with the key bailian-datahub-access and the value read to the destination bucket. You must also authorize the OSS service-linked role as prompted in the Model Studio console (service name: datahub.sfm.aliyuncs.com).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bucketNamexxxxx</p>
         */
        public Builder ossBucketName(String ossBucketName) {
            this.putBodyParameter("OssBucketName", ossBucketName);
            this.ossBucketName = ossBucketName;
            return this;
        }

        /**
         * <p>The region ID of the OSS bucket. For more information about how to obtain the ID, see <a href="https://help.aliyun.com/document_detail/31837.html">OSS regions and endpoints</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder ossRegionId(String ossRegionId) {
            this.putBodyParameter("OssRegionId", ossRegionId);
            this.ossRegionId = ossRegionId;
            return this;
        }

        /**
         * <p>Specifies whether to overwrite identical files in the category based on the OssKey. Default value: false, which means identical files are not overwritten.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder overWriteFileByOssKey(Boolean overWriteFileByOssKey) {
            this.putBodyParameter("OverWriteFileByOssKey", overWriteFileByOssKey);
            this.overWriteFileByOssKey = overWriteFileByOssKey;
            return this;
        }

        /**
         * <p>The list of tags associated with the file. Default value: empty, which means the file is not associated with any tags. You can specify up to 10 tags.</p>
         */
        public Builder tags(java.util.List<String> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putBodyParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public AddFilesFromAuthorizedOssRequest build() {
            return new AddFilesFromAuthorizedOssRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddFilesFromAuthorizedOssRequest} extends {@link TeaModel}
     *
     * <p>AddFilesFromAuthorizedOssRequest</p>
     */
    public static class ParserConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("ModelPrompt")
        @com.aliyun.core.annotation.Validation(maxLength = 1000, minLength = 1)
        private String modelPrompt;

        private ParserConfig(Builder builder) {
            this.modelName = builder.modelName;
            this.modelPrompt = builder.modelPrompt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParserConfig create() {
            return builder().build();
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return modelPrompt
         */
        public String getModelPrompt() {
            return this.modelPrompt;
        }

        public static final class Builder {
            private String modelName; 
            private String modelPrompt; 

            private Builder() {
            } 

            private Builder(ParserConfig model) {
                this.modelName = model.modelName;
                this.modelPrompt = model.modelPrompt;
            } 

            /**
             * <p>The model name.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-vl-max</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * <p>The prompt used when calling Qwen VL parsing.</p>
             * 
             * <strong>example:</strong>
             * <h1>Role</h1>
             * <p>You are a professional image content annotator, skilled at identifying and describing the content in images.</p>
             * <h1>Task objective</h1>
             * <p>Based on the input image, describe the content in the image in detail</p>
             */
            public Builder modelPrompt(String modelPrompt) {
                this.modelPrompt = modelPrompt;
                return this;
            }

            public ParserConfig build() {
                return new ParserConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddFilesFromAuthorizedOssRequest} extends {@link TeaModel}
     *
     * <p>AddFilesFromAuthorizedOssRequest</p>
     */
    public static class FileDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileName")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 500, minLength = 1)
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("OssKey")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 256, minLength = 1)
        private String ossKey;

        @com.aliyun.core.annotation.NameInMap("Parser")
        private String parser;

        @com.aliyun.core.annotation.NameInMap("ParserConfig")
        private ParserConfig parserConfig;

        private FileDetails(Builder builder) {
            this.fileName = builder.fileName;
            this.ossKey = builder.ossKey;
            this.parser = builder.parser;
            this.parserConfig = builder.parserConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileDetails create() {
            return builder().build();
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return ossKey
         */
        public String getOssKey() {
            return this.ossKey;
        }

        /**
         * @return parser
         */
        public String getParser() {
            return this.parser;
        }

        /**
         * @return parserConfig
         */
        public ParserConfig getParserConfig() {
            return this.parserConfig;
        }

        public static final class Builder {
            private String fileName; 
            private String ossKey; 
            private String parser; 
            private ParserConfig parserConfig; 

            private Builder() {
            } 

            private Builder(FileDetails model) {
                this.fileName = model.fileName;
                this.ossKey = model.ossKey;
                this.parser = model.parser;
                this.parserConfig = model.parserConfig;
            } 

            /**
             * <p>The name of the file to import. Make sure that the file name extension is included.</p>
             * <ul>
             * <li>Supported formats: pdf, docx, doc, txt, md, pptx, ppt, xlsx, xls, html, png, jpg, jpeg, bmp, and gif.</li>
             * <li>The file name must be 4 to 128 characters in length.</li>
             * <li>For more information about the limits on file uploads, see <a href="https://help.aliyun.com/document_detail/2880605.html">Knowledge base quotas and limits</a>.</li>
             * </ul>
             * <blockquote>
             * <p>Notice: If the name of the imported file is the same as the name of an existing file in the knowledge base, the operation still returns SUCCESS for Status, but the file is not actually imported into the knowledge base and the existing file with the same name remains unchanged. Make sure that the name of each imported file is unique.</notice>
             * To add a data table and upload data, use the Alibaba Cloud Model Studio console. This is not supported by the API.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>this_is_temp_xxxx.pdf</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The key of the imported file in the OSS bucket. For more information, see <a href="https://help.aliyun.com/document_detail/273129.html">Object naming</a>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>root/path/this_is_temp_xxxx.pdf</p>
             */
            public Builder ossKey(String ossKey) {
                this.ossKey = ossKey;
                return this;
            }

            /**
             * <p>The parser type. Valid values:</p>
             * <ul>
             * <li>DOCMIND (Intelligent document parsing)</li>
             * <li>DOCMIND_DIGITAL (Electronic document parsing)</li>
             * <li>DOCMIND_LLM_VERSION (Large model document parsing)</li>
             * <li>DASH_QWEN_VL_PARSER (Qwen VL parsing)</li>
             * <li>DOCMIND_LLM_VERSION_MEDIA (Audio and video parsing)</li>
             * <li>AUTO_SELECT (Automatic parser selection)</li>
             * </ul>
             * <p>&lt;props=&quot;intl&quot;&gt;
             * <note>The uploaded file is parsed by using the specified parser. If you set this parameter to AUTO_SELECT, the parser configured for the category is used.</note></p>
             * <p>&lt;props=&quot;china&quot;&gt;
             * <note>If CategoryType is set to UNSTRUCTURED, the file is parsed based on the data parsing settings of the current category.</note>
             * <note>If CategoryType is set to SESSION_FILE, the system parses the file content by using the default method, which cannot be changed.</note></p>
             * 
             * <strong>example:</strong>
             * <p>AUTO_SELECT</p>
             */
            public Builder parser(String parser) {
                this.parser = parser;
                return this;
            }

            /**
             * <p>The parser configuration. This parameter is required only when the parser type is set to Qwen VL parsing.</p>
             */
            public Builder parserConfig(ParserConfig parserConfig) {
                this.parserConfig = parserConfig;
                return this;
            }

            public FileDetails build() {
                return new FileDetails(this);
            } 

        } 

    }
}
