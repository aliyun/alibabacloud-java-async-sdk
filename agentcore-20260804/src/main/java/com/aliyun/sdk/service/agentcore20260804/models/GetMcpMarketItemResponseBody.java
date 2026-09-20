// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link GetMcpMarketItemResponseBody} extends {@link TeaModel}
 *
 * <p>GetMcpMarketItemResponseBody</p>
 */
public class GetMcpMarketItemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetMcpMarketItemResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMcpMarketItemResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetMcpMarketItemResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business status code.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>request-123456</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMcpMarketItemResponseBody build() {
            return new GetMcpMarketItemResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMcpMarketItemResponseBody} extends {@link TeaModel}
     *
     * <p>GetMcpMarketItemResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayMetadata")
        private java.util.Map<String, ?> displayMetadata;

        @com.aliyun.core.annotation.NameInMap("i18n")
        private java.util.Map<String, DataI18nValue> i18n;

        @com.aliyun.core.annotation.NameInMap("iconUrl")
        private String iconUrl;

        @com.aliyun.core.annotation.NameInMap("installCount")
        private Long installCount;

        @com.aliyun.core.annotation.NameInMap("marketItemId")
        private String marketItemId;

        @com.aliyun.core.annotation.NameInMap("mcpType")
        private String mcpType;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("officialTag")
        private String officialTag;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("readme")
        private String readme;

        @com.aliyun.core.annotation.NameInMap("schemaVersion")
        private String schemaVersion;

        @com.aliyun.core.annotation.NameInMap("templateInputSchema")
        private String templateInputSchema;

        @com.aliyun.core.annotation.NameInMap("templateVersion")
        private String templateVersion;

        private Data(Builder builder) {
            this.category = builder.category;
            this.description = builder.description;
            this.displayMetadata = builder.displayMetadata;
            this.i18n = builder.i18n;
            this.iconUrl = builder.iconUrl;
            this.installCount = builder.installCount;
            this.marketItemId = builder.marketItemId;
            this.mcpType = builder.mcpType;
            this.name = builder.name;
            this.officialTag = builder.officialTag;
            this.protocol = builder.protocol;
            this.readme = builder.readme;
            this.schemaVersion = builder.schemaVersion;
            this.templateInputSchema = builder.templateInputSchema;
            this.templateVersion = builder.templateVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayMetadata
         */
        public java.util.Map<String, ?> getDisplayMetadata() {
            return this.displayMetadata;
        }

        /**
         * @return i18n
         */
        public java.util.Map<String, DataI18nValue> getI18n() {
            return this.i18n;
        }

        /**
         * @return iconUrl
         */
        public String getIconUrl() {
            return this.iconUrl;
        }

        /**
         * @return installCount
         */
        public Long getInstallCount() {
            return this.installCount;
        }

        /**
         * @return marketItemId
         */
        public String getMarketItemId() {
            return this.marketItemId;
        }

        /**
         * @return mcpType
         */
        public String getMcpType() {
            return this.mcpType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return officialTag
         */
        public String getOfficialTag() {
            return this.officialTag;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return readme
         */
        public String getReadme() {
            return this.readme;
        }

        /**
         * @return schemaVersion
         */
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        /**
         * @return templateInputSchema
         */
        public String getTemplateInputSchema() {
            return this.templateInputSchema;
        }

        /**
         * @return templateVersion
         */
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public static final class Builder {
            private String category; 
            private String description; 
            private java.util.Map<String, ?> displayMetadata; 
            private java.util.Map<String, DataI18nValue> i18n; 
            private String iconUrl; 
            private Long installCount; 
            private String marketItemId; 
            private String mcpType; 
            private String name; 
            private String officialTag; 
            private String protocol; 
            private String readme; 
            private String schemaVersion; 
            private String templateInputSchema; 
            private String templateVersion; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.category = model.category;
                this.description = model.description;
                this.displayMetadata = model.displayMetadata;
                this.i18n = model.i18n;
                this.iconUrl = model.iconUrl;
                this.installCount = model.installCount;
                this.marketItemId = model.marketItemId;
                this.mcpType = model.mcpType;
                this.name = model.name;
                this.officialTag = model.officialTag;
                this.protocol = model.protocol;
                this.readme = model.readme;
                this.schemaVersion = model.schemaVersion;
                this.templateInputSchema = model.templateInputSchema;
                this.templateVersion = model.templateVersion;
            } 

            /**
             * <p>The MCP marketplace template category.</p>
             * 
             * <strong>example:</strong>
             * <p>knowledge</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The MCP service description.</p>
             * 
             * <strong>example:</strong>
             * <p>An MCP service for querying knowledge bases</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The template display metadata.</p>
             */
            public Builder displayMetadata(java.util.Map<String, ?> displayMetadata) {
                this.displayMetadata = displayMetadata;
                return this;
            }

            /**
             * <p>The multilingual display content, organized by BCP-47 language tags. Falls back to default fields when the specified language is not matched.</p>
             */
            public Builder i18n(java.util.Map<String, DataI18nValue> i18n) {
                this.i18n = i18n;
                return this;
            }

            /**
             * <p>The icon URL of the MCP marketplace template.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/mcp-icon.png">https://example.com/mcp-icon.png</a></p>
             */
            public Builder iconUrl(String iconUrl) {
                this.iconUrl = iconUrl;
                return this;
            }

            /**
             * <p>The number of times the template has been installed.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder installCount(Long installCount) {
                this.installCount = installCount;
                return this;
            }

            /**
             * <p>The MCP marketplace template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>market-1</p>
             */
            public Builder marketItemId(String marketItemId) {
                this.marketItemId = marketItemId;
                return this;
            }

            /**
             * <p>The MCP type.</p>
             * 
             * <strong>example:</strong>
             * <p>CODE_PACKAGE</p>
             */
            public Builder mcpType(String mcpType) {
                this.mcpType = mcpType;
                return this;
            }

            /**
             * <p>The MCP marketplace template name.</p>
             * 
             * <strong>example:</strong>
             * <p>Knowledge</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The official usage tag.</p>
             * 
             * <strong>example:</strong>
             * <p>KNOWLEDGE_BASE</p>
             */
            public Builder officialTag(String officialTag) {
                this.officialTag = officialTag;
                return this;
            }

            /**
             * <p>The MCP protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>StreamableHTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The usage instructions for the MCP marketplace template.</p>
             * 
             * <strong>example:</strong>
             * <h1>Knowledge\nKnowledge base query service</h1>
             */
            public Builder readme(String readme) {
                this.readme = readme;
                return this;
            }

            /**
             * <p>The template schema version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder schemaVersion(String schemaVersion) {
                this.schemaVersion = schemaVersion;
                return this;
            }

            /**
             * <p>The template input schema, represented as a JSON Schema string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;addresses&quot;:{&quot;type&quot;:&quot;array&quot;,&quot;items&quot;:{&quot;type&quot;:&quot;string&quot;}}}}</p>
             */
            public Builder templateInputSchema(String templateInputSchema) {
                this.templateInputSchema = templateInputSchema;
                return this;
            }

            /**
             * <p>The MCP marketplace template version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder templateVersion(String templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
