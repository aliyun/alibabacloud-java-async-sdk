// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link CreateDataAgentSessionRequest} extends {@link RequestModel}
 *
 * <p>CreateDataAgentSessionRequest</p>
 */
public class CreateDataAgentSessionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DMSUnit")
    private String DMSUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("File")
    private String file;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionConfig")
    private SessionConfig sessionConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateDataAgentSessionRequest(Builder builder) {
        super(builder);
        this.DMSUnit = builder.DMSUnit;
        this.file = builder.file;
        this.sessionConfig = builder.sessionConfig;
        this.title = builder.title;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataAgentSessionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DMSUnit
     */
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    /**
     * @return file
     */
    public String getFile() {
        return this.file;
    }

    /**
     * @return sessionConfig
     */
    public SessionConfig getSessionConfig() {
        return this.sessionConfig;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateDataAgentSessionRequest, Builder> {
        private String DMSUnit; 
        private String file; 
        private SessionConfig sessionConfig; 
        private String title; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataAgentSessionRequest request) {
            super(request);
            this.DMSUnit = request.DMSUnit;
            this.file = request.file;
            this.sessionConfig = request.sessionConfig;
            this.title = request.title;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The current DMS unit.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder DMSUnit(String DMSUnit) {
            this.putQueryParameter("DMSUnit", DMSUnit);
            this.DMSUnit = DMSUnit;
            return this;
        }

        /**
         * <p>The file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f-8*******01m</p>
         */
        public Builder file(String file) {
            this.putQueryParameter("File", file);
            this.file = file;
            return this;
        }

        /**
         * <p>The session configuration.</p>
         */
        public Builder sessionConfig(SessionConfig sessionConfig) {
            String sessionConfigShrink = shrink(sessionConfig, "SessionConfig", "json");
            this.putQueryParameter("SessionConfig", sessionConfigShrink);
            this.sessionConfig = sessionConfig;
            return this;
        }

        /**
         * <p>The session title. Supports Chinese and English. Maximum length: 128 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>帮我分析一下这份数据，给出报告。</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateDataAgentSessionRequest build() {
            return new CreateDataAgentSessionRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDataAgentSessionRequest} extends {@link TeaModel}
     *
     * <p>CreateDataAgentSessionRequest</p>
     */
    public static class SessionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomAgentId")
        private String customAgentId;

        @com.aliyun.core.annotation.NameInMap("CustomAgentStage")
        private String customAgentStage;

        @com.aliyun.core.annotation.NameInMap("EnableSearch")
        private Boolean enableSearch;

        @com.aliyun.core.annotation.NameInMap("EncryptKey")
        private String encryptKey;

        @com.aliyun.core.annotation.NameInMap("EncryptType")
        private String encryptType;

        @com.aliyun.core.annotation.NameInMap("KbUuidList")
        private java.util.List<String> kbUuidList;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("McpServerIds")
        private java.util.List<String> mcpServerIds;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("ReportPageWidth")
        private Long reportPageWidth;

        @com.aliyun.core.annotation.NameInMap("ReportWaterMark")
        private String reportWaterMark;

        @com.aliyun.core.annotation.NameInMap("UserOssBucket")
        private String userOssBucket;

        private SessionConfig(Builder builder) {
            this.customAgentId = builder.customAgentId;
            this.customAgentStage = builder.customAgentStage;
            this.enableSearch = builder.enableSearch;
            this.encryptKey = builder.encryptKey;
            this.encryptType = builder.encryptType;
            this.kbUuidList = builder.kbUuidList;
            this.language = builder.language;
            this.mcpServerIds = builder.mcpServerIds;
            this.mode = builder.mode;
            this.reportPageWidth = builder.reportPageWidth;
            this.reportWaterMark = builder.reportWaterMark;
            this.userOssBucket = builder.userOssBucket;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SessionConfig create() {
            return builder().build();
        }

        /**
         * @return customAgentId
         */
        public String getCustomAgentId() {
            return this.customAgentId;
        }

        /**
         * @return customAgentStage
         */
        public String getCustomAgentStage() {
            return this.customAgentStage;
        }

        /**
         * @return enableSearch
         */
        public Boolean getEnableSearch() {
            return this.enableSearch;
        }

        /**
         * @return encryptKey
         */
        public String getEncryptKey() {
            return this.encryptKey;
        }

        /**
         * @return encryptType
         */
        public String getEncryptType() {
            return this.encryptType;
        }

        /**
         * @return kbUuidList
         */
        public java.util.List<String> getKbUuidList() {
            return this.kbUuidList;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return mcpServerIds
         */
        public java.util.List<String> getMcpServerIds() {
            return this.mcpServerIds;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return reportPageWidth
         */
        public Long getReportPageWidth() {
            return this.reportPageWidth;
        }

        /**
         * @return reportWaterMark
         */
        public String getReportWaterMark() {
            return this.reportWaterMark;
        }

        /**
         * @return userOssBucket
         */
        public String getUserOssBucket() {
            return this.userOssBucket;
        }

        public static final class Builder {
            private String customAgentId; 
            private String customAgentStage; 
            private Boolean enableSearch; 
            private String encryptKey; 
            private String encryptType; 
            private java.util.List<String> kbUuidList; 
            private String language; 
            private java.util.List<String> mcpServerIds; 
            private String mode; 
            private Long reportPageWidth; 
            private String reportWaterMark; 
            private String userOssBucket; 

            private Builder() {
            } 

            private Builder(SessionConfig model) {
                this.customAgentId = model.customAgentId;
                this.customAgentStage = model.customAgentStage;
                this.enableSearch = model.enableSearch;
                this.encryptKey = model.encryptKey;
                this.encryptType = model.encryptType;
                this.kbUuidList = model.kbUuidList;
                this.language = model.language;
                this.mcpServerIds = model.mcpServerIds;
                this.mode = model.mode;
                this.reportPageWidth = model.reportPageWidth;
                this.reportWaterMark = model.reportWaterMark;
                this.userOssBucket = model.userOssBucket;
            } 

            /**
             * <p>The custom agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ca-e*******ckd</p>
             */
            public Builder customAgentId(String customAgentId) {
                this.customAgentId = customAgentId;
                return this;
            }

            /**
             * <p>The custom agent stage. Valid values:</p>
             * <ul>
             * <li><p><strong>debug</strong>: Test stage.</p>
             * </li>
             * <li><p><strong>prod</strong>: Production stage.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>debug</p>
             */
            public Builder customAgentStage(String customAgentStage) {
                this.customAgentStage = customAgentStage;
                return this;
            }

            /**
             * <p>Specifies whether to enable web search.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableSearch(Boolean enableSearch) {
                this.enableSearch = enableSearch;
                return this;
            }

            /**
             * EncryptKey.
             */
            public Builder encryptKey(String encryptKey) {
                this.encryptKey = encryptKey;
                return this;
            }

            /**
             * EncryptType.
             */
            public Builder encryptType(String encryptType) {
                this.encryptType = encryptType;
                return this;
            }

            /**
             * KbUuidList.
             */
            public Builder kbUuidList(java.util.List<String> kbUuidList) {
                this.kbUuidList = kbUuidList;
                return this;
            }

            /**
             * <p>The language. Valid values:</p>
             * <ul>
             * <li><p><strong>CHINESE</strong>: Chinese</p>
             * </li>
             * <li><p><strong>ENGLISH</strong>: English</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CHINESE</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>A list of MCP server IDs.</p>
             */
            public Builder mcpServerIds(java.util.List<String> mcpServerIds) {
                this.mcpServerIds = mcpServerIds;
                return this;
            }

            /**
             * <p>The mode. Valid values:</p>
             * <ul>
             * <li><p><strong>ASK_DATA</strong>: Quick inquiry mode.</p>
             * </li>
             * <li><p><strong>ANALYSIS</strong>: Analysis mode.</p>
             * </li>
             * <li><p><strong>INSIGHT</strong>: Insight mode.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ANALYSIS</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * ReportPageWidth.
             */
            public Builder reportPageWidth(Long reportPageWidth) {
                this.reportPageWidth = reportPageWidth;
                return this;
            }

            /**
             * ReportWaterMark.
             */
            public Builder reportWaterMark(String reportWaterMark) {
                this.reportWaterMark = reportWaterMark;
                return this;
            }

            /**
             * <p>The OSS bucket name.</p>
             * <ul>
             * <li>This bucket stores intermediate files and report artifacts from the analysis.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>user-oss-bucket</p>
             */
            public Builder userOssBucket(String userOssBucket) {
                this.userOssBucket = userOssBucket;
                return this;
            }

            public SessionConfig build() {
                return new SessionConfig(this);
            } 

        } 

    }
}
