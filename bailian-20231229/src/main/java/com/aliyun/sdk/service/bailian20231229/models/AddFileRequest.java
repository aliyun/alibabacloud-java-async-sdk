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
 * {@link AddFileRequest} extends {@link RequestModel}
 *
 * <p>AddFileRequest</p>
 */
public class AddFileRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String categoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CategoryType")
    private String categoryType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LeaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String leaseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OriginalFileUrl")
    private String originalFileUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Parser")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parser;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParserConfig")
    private ParserConfig parserConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<String> tags;

    private AddFileRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.regionId = builder.regionId;
        this.categoryId = builder.categoryId;
        this.categoryType = builder.categoryType;
        this.leaseId = builder.leaseId;
        this.originalFileUrl = builder.originalFileUrl;
        this.parser = builder.parser;
        this.parserConfig = builder.parserConfig;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddFileRequest create() {
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
     * @return leaseId
     */
    public String getLeaseId() {
        return this.leaseId;
    }

    /**
     * @return originalFileUrl
     */
    public String getOriginalFileUrl() {
        return this.originalFileUrl;
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

    /**
     * @return tags
     */
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<AddFileRequest, Builder> {
        private String workspaceId; 
        private String regionId; 
        private String categoryId; 
        private String categoryType; 
        private String leaseId; 
        private String originalFileUrl; 
        private String parser; 
        private ParserConfig parserConfig; 
        private java.util.List<String> tags; 

        private Builder() {
            super();
        } 

        private Builder(AddFileRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.regionId = request.regionId;
            this.categoryId = request.categoryId;
            this.categoryType = request.categoryType;
            this.leaseId = request.leaseId;
            this.originalFileUrl = request.originalFileUrl;
            this.parser = request.parser;
            this.parserConfig = request.parserConfig;
            this.tags = request.tags;
        } 

        /**
         * <p>The workspace ID. The file is uploaded to this workspace. For information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/2587495.html">How to use a workspace</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-3shx2gu255oqxxxx</p>
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
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li><p>When CategoryType is set to UNSTRUCTURED, specify the category ID to which the uploaded file belongs. This is the <code>CategoryId</code> returned by the <strong>AddCategory</strong> operation. You can also go to <a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a> &gt; File tab and click the ID icon next to the category name to obtain the category ID. You can set this parameter to default to use the system-created &quot;Default Category&quot;.</p>
         * </li>
         * <li><p>When CategoryType is set to SESSION_FILE, set this parameter to &quot;default&quot;.</p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <p>Specify the category ID to which the uploaded file belongs. This is the <code>CategoryId</code> returned by the <strong>AddCategory</strong> operation. You can also go to <a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a> &gt; File tab and click the ID icon next to the category name to obtain the category ID. You can set this parameter to default to use the system-created &quot;Default Category&quot;.</p>
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
         * <p>The category type. Optional. Default value: UNSTRUCTURED. Valid values:</p>
         * <ul>
         * <li>UNSTRUCTURED: category, used for building knowledge base scenarios.</li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>SESSION_FILE: a file used for <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/file-interaction">conversation interaction</a> in agent applications.
         * <note>When using <code>SESSION_FILE</code>, the CategoryType parameter must also be set to <code>SESSION_FILE</code> when calling the ApplyFileUploadLease operation.</note>
         * <note>The file is valid only for the current user session. After the user closes the session, the file expires (maximum validity period is 7 days) and long-term storage is not supported.</note></li>
         * </ul>
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
         * <p>The upload lease ID, which corresponds to the <code>FileUploadLeaseId</code> returned by the <strong>ApplyFileUploadLease</strong> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>68abd1dea7b6404d8f7d7b9f7fbd332d.17166xxxxxxxx</p>
         */
        public Builder leaseId(String leaseId) {
            this.putBodyParameter("LeaseId", leaseId);
            this.leaseId = leaseId;
            return this;
        }

        /**
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>Adds a URL to the file through this parameter. The system records this link when building a <a href="https://help.aliyun.com/document_detail/2807740.html">document search knowledge base</a>. When you use the Alibaba Cloud Model Studio console to chat with an <a href="https://help.aliyun.com/document_detail/2842749.html">agent application</a>, this URL is returned with the file retrieval results (through the <code>docUrl</code> field).</p>
         * <blockquote>
         * <p>The agent application must have <strong>Knowledge Base</strong> enabled and the <strong>Show Answer Sources</strong> feature turned on. Otherwise, this parameter does not take effect.</p>
         * </blockquote>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <p>Adds a URL to the file through this parameter. The system records this link when building a <a href="https://help.aliyun.com/document_detail/2807740.html">document search knowledge base</a>. When you use the Alibaba Cloud Model Studio console to chat with an <a href="https://help.aliyun.com/document_detail/2842749.html">agent application</a>, this URL is returned with the file retrieval results (through the <code>docUrl</code> field).</p>
         * <blockquote>
         * <p>The agent application must have <strong>Knowledge Base</strong> enabled and the <strong>Show Answer Sources</strong> feature turned on. Otherwise, this parameter does not take effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.test.com/111.docx">www.test.com/111.docx</a></p>
         */
        public Builder originalFileUrl(String originalFileUrl) {
            this.putBodyParameter("OriginalFileUrl", originalFileUrl);
            this.originalFileUrl = originalFileUrl;
            return this;
        }

        /**
         * <p>The parser type. Valid values:</p>
         * <ul>
         * <li>DOCMIND: intelligent document parsing.</li>
         * <li>DOCMIND_DIGITAL: electronic document parsing.</li>
         * <li>DOCMIND_LLM_VERSION: large language model-based document parsing.</li>
         * <li>DASH_QWEN_VL_PARSER: Qwen VL parsing.</li>
         * <li>DOCMIND_LLM_VERSION_MEDIA: audio and video parsing.</li>
         * <li>AUTO_SELECT: automatic parser selection.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;
         * <note>The file you upload is parsed by the currently specified parser. If you set this parameter to AUTO_SELECT, the parser configured for the category is used.</note></p>
         * <p>&lt;props=&quot;china&quot;&gt;
         * <note>When CategoryType is set to UNSTRUCTURED, the parser parses the uploaded file based on the data parsing settings of the current category.</note>
         * <note>When CategoryType is set to SESSION_FILE, the system parses the file content by using the default method, which cannot be changed.</note></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AUTO_SELECT</p>
         */
        public Builder parser(String parser) {
            this.putBodyParameter("Parser", parser);
            this.parser = parser;
            return this;
        }

        /**
         * <p>The parser configuration. This parameter is required only when the parser type is set to Qwen VL parsing.</p>
         */
        public Builder parserConfig(ParserConfig parserConfig) {
            String parserConfigShrink = shrink(parserConfig, "ParserConfig", "json");
            this.putBodyParameter("ParserConfig", parserConfigShrink);
            this.parserConfig = parserConfig;
            return this;
        }

        /**
         * <ul>
         * <li>The list of tags associated with the file. You can specify up to 100 tags, and the total character length of all tags cannot exceed 700.</li>
         * <li>Default value: empty, which means no tags are set.</li>
         * </ul>
         */
        public Builder tags(java.util.List<String> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putBodyParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public AddFileRequest build() {
            return new AddFileRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddFileRequest} extends {@link TeaModel}
     *
     * <p>AddFileRequest</p>
     */
    public static class ParserConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("ModelPrompt")
        @com.aliyun.core.annotation.Validation(maxLength = 1500, minLength = 1)
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
             * <p>#Role
             * You are a professional image content annotator who excels at identifying and describing the content in images.</p>
             * <h1>Task Objective</h1>
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
}
