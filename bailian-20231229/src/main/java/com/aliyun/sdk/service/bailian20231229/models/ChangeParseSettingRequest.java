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
 * {@link ChangeParseSettingRequest} extends {@link RequestModel}
 *
 * <p>ChangeParseSettingRequest</p>
 */
public class ChangeParseSettingRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String categoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Parser")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parser;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParserConfig")
    private ParserConfig parserConfig;

    private ChangeParseSettingRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
        this.categoryId = builder.categoryId;
        this.fileType = builder.fileType;
        this.parser = builder.parser;
        this.parserConfig = builder.parserConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeParseSettingRequest create() {
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
     * @return fileType
     */
    public String getFileType() {
        return this.fileType;
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

    public static final class Builder extends Request.Builder<ChangeParseSettingRequest, Builder> {
        private String regionId; 
        private String workspaceId; 
        private String categoryId; 
        private String fileType; 
        private String parser; 
        private ParserConfig parserConfig; 

        private Builder() {
            super();
        } 

        private Builder(ChangeParseSettingRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
            this.categoryId = request.categoryId;
            this.fileType = request.fileType;
            this.parser = request.parser;
            this.parserConfig = request.parserConfig;
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
         * <p>The ID of the workspace to which the category belongs. For more information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/2587495.html">How to use a workspace</a>.</p>
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
         * <p>The category ID, which is the <code>CategoryId</code> returned by the <strong>AddCategory</strong> operation. You can also obtain it by clicking the ID icon next to the category name on the &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a> - Files tab&lt;props=&quot;intl&quot;&gt;<a href="https://bailian.console.alibabacloud.com/?tab=app#/data-center">Application Data</a> - Unstructured Data tab.</p>
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
         * <p>The file type (extension). Valid values:</p>
         * <ul>
         * <li>doc</li>
         * <li>docx</li>
         * <li>ppt</li>
         * <li>pptx</li>
         * <li>xls</li>
         * <li>xlsx</li>
         * <li>md</li>
         * <li>txt</li>
         * <li>pdf</li>
         * <li>png</li>
         * <li>jpg</li>
         * <li>jpeg</li>
         * <li>bmp</li>
         * <li>gif</li>
         * <li>html</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pdf</p>
         */
        public Builder fileType(String fileType) {
            this.putBodyParameter("FileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * <p>The parser identifier code. Different parsers are applicable to different scenarios. For more information, see &quot;Knowledge Base&quot;. Valid values:</p>
         * <ul>
         * <li>DOCMIND (intelligent document parsing)</li>
         * <li>DOCMIND_DIGITAL (electronic document parsing)</li>
         * <li>DOCMIND_LLM_VERSION (large model document parsing)</li>
         * <li>DASH_QWEN_VL_PARSER (Qwen VL parsing)</li>
         * <li>DOCMIND_LLM_VERSION_MEDIA (audio and video parsing)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DOCMIND</p>
         */
        public Builder parser(String parser) {
            this.putBodyParameter("Parser", parser);
            this.parser = parser;
            return this;
        }

        /**
         * <p>The parser configuration. This parameter is required only when the parser is set to Qwen VL parsing.</p>
         */
        public Builder parserConfig(ParserConfig parserConfig) {
            String parserConfigShrink = shrink(parserConfig, "ParserConfig", "json");
            this.putBodyParameter("ParserConfig", parserConfigShrink);
            this.parserConfig = parserConfig;
            return this;
        }

        @Override
        public ChangeParseSettingRequest build() {
            return new ChangeParseSettingRequest(this);
        } 

    } 

    /**
     * 
     * {@link ChangeParseSettingRequest} extends {@link TeaModel}
     *
     * <p>ChangeParseSettingRequest</p>
     */
    public static class ParserConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("modelPrompt")
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
             * <h1>Role</h1>
             * <p>You are a professional image content annotator who excels at identifying and describing the content in images.</p>
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
