// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.codesec20260401.models;

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
 * {@link DescribeScanResultsByEngineResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScanResultsByEngineResponseBody</p>
 */
public class DescribeScanResultsByEngineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("projectId")
    private Long projectId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("scanId")
    private Long scanId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private DescribeScanResultsByEngineResponseBody(Builder builder) {
        this.engine = builder.engine;
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.projectId = builder.projectId;
        this.requestId = builder.requestId;
        this.scanId = builder.scanId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScanResultsByEngineResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scanId
     */
    public Long getScanId() {
        return this.scanId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String engine; 
        private java.util.List<Items> items; 
        private Long maxResults; 
        private String nextToken; 
        private Long projectId; 
        private String requestId; 
        private Long scanId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeScanResultsByEngineResponseBody model) {
            this.engine = model.engine;
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.projectId = model.projectId;
            this.requestId = model.requestId;
            this.scanId = model.scanId;
            this.totalCount = model.totalCount;
        } 

        /**
         * engine.
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * projectId.
         */
        public Builder projectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>9A1F403F-0A85-5578-8B7C-55E3E9408659</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * scanId.
         */
        public Builder scanId(Long scanId) {
            this.scanId = scanId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeScanResultsByEngineResponseBody build() {
            return new DescribeScanResultsByEngineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeScanResultsByEngineResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScanResultsByEngineResponseBody</p>
     */
    public static class CveDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cveId")
        private String cveId;

        @com.aliyun.core.annotation.NameInMap("cvss")
        private Double cvss;

        @com.aliyun.core.annotation.NameInMap("cvssVersion")
        private String cvssVersion;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("references")
        private java.util.List<String> references;

        @com.aliyun.core.annotation.NameInMap("severity")
        private String severity;

        private CveDetails(Builder builder) {
            this.cveId = builder.cveId;
            this.cvss = builder.cvss;
            this.cvssVersion = builder.cvssVersion;
            this.description = builder.description;
            this.references = builder.references;
            this.severity = builder.severity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CveDetails create() {
            return builder().build();
        }

        /**
         * @return cveId
         */
        public String getCveId() {
            return this.cveId;
        }

        /**
         * @return cvss
         */
        public Double getCvss() {
            return this.cvss;
        }

        /**
         * @return cvssVersion
         */
        public String getCvssVersion() {
            return this.cvssVersion;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return references
         */
        public java.util.List<String> getReferences() {
            return this.references;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        public static final class Builder {
            private String cveId; 
            private Double cvss; 
            private String cvssVersion; 
            private String description; 
            private java.util.List<String> references; 
            private String severity; 

            private Builder() {
            } 

            private Builder(CveDetails model) {
                this.cveId = model.cveId;
                this.cvss = model.cvss;
                this.cvssVersion = model.cvssVersion;
                this.description = model.description;
                this.references = model.references;
                this.severity = model.severity;
            } 

            /**
             * cveId.
             */
            public Builder cveId(String cveId) {
                this.cveId = cveId;
                return this;
            }

            /**
             * cvss.
             */
            public Builder cvss(Double cvss) {
                this.cvss = cvss;
                return this;
            }

            /**
             * cvssVersion.
             */
            public Builder cvssVersion(String cvssVersion) {
                this.cvssVersion = cvssVersion;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * references.
             */
            public Builder references(java.util.List<String> references) {
                this.references = references;
                return this;
            }

            /**
             * severity.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            public CveDetails build() {
                return new CveDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeScanResultsByEngineResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScanResultsByEngineResponseBody</p>
     */
    public static class ScaComponent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cveCount")
        private Long cveCount;

        @com.aliyun.core.annotation.NameInMap("cveDetails")
        private java.util.List<CveDetails> cveDetails;

        @com.aliyun.core.annotation.NameInMap("introPaths")
        private java.util.List<String> introPaths;

        @com.aliyun.core.annotation.NameInMap("isDirect")
        private Boolean isDirect;

        @com.aliyun.core.annotation.NameInMap("packageName")
        private String packageName;

        @com.aliyun.core.annotation.NameInMap("remediation")
        private String remediation;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private ScaComponent(Builder builder) {
            this.cveCount = builder.cveCount;
            this.cveDetails = builder.cveDetails;
            this.introPaths = builder.introPaths;
            this.isDirect = builder.isDirect;
            this.packageName = builder.packageName;
            this.remediation = builder.remediation;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScaComponent create() {
            return builder().build();
        }

        /**
         * @return cveCount
         */
        public Long getCveCount() {
            return this.cveCount;
        }

        /**
         * @return cveDetails
         */
        public java.util.List<CveDetails> getCveDetails() {
            return this.cveDetails;
        }

        /**
         * @return introPaths
         */
        public java.util.List<String> getIntroPaths() {
            return this.introPaths;
        }

        /**
         * @return isDirect
         */
        public Boolean getIsDirect() {
            return this.isDirect;
        }

        /**
         * @return packageName
         */
        public String getPackageName() {
            return this.packageName;
        }

        /**
         * @return remediation
         */
        public String getRemediation() {
            return this.remediation;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Long cveCount; 
            private java.util.List<CveDetails> cveDetails; 
            private java.util.List<String> introPaths; 
            private Boolean isDirect; 
            private String packageName; 
            private String remediation; 
            private String version; 

            private Builder() {
            } 

            private Builder(ScaComponent model) {
                this.cveCount = model.cveCount;
                this.cveDetails = model.cveDetails;
                this.introPaths = model.introPaths;
                this.isDirect = model.isDirect;
                this.packageName = model.packageName;
                this.remediation = model.remediation;
                this.version = model.version;
            } 

            /**
             * cveCount.
             */
            public Builder cveCount(Long cveCount) {
                this.cveCount = cveCount;
                return this;
            }

            /**
             * cveDetails.
             */
            public Builder cveDetails(java.util.List<CveDetails> cveDetails) {
                this.cveDetails = cveDetails;
                return this;
            }

            /**
             * introPaths.
             */
            public Builder introPaths(java.util.List<String> introPaths) {
                this.introPaths = introPaths;
                return this;
            }

            /**
             * isDirect.
             */
            public Builder isDirect(Boolean isDirect) {
                this.isDirect = isDirect;
                return this;
            }

            /**
             * packageName.
             */
            public Builder packageName(String packageName) {
                this.packageName = packageName;
                return this;
            }

            /**
             * remediation.
             */
            public Builder remediation(String remediation) {
                this.remediation = remediation;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public ScaComponent build() {
                return new ScaComponent(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeScanResultsByEngineResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScanResultsByEngineResponseBody</p>
     */
    public static class TaintFlow extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("file")
        private String file;

        @com.aliyun.core.annotation.NameInMap("kind")
        private String kind;

        @com.aliyun.core.annotation.NameInMap("line")
        private Integer line;

        @com.aliyun.core.annotation.NameInMap("note")
        private String note;

        @com.aliyun.core.annotation.NameInMap("step")
        private Integer step;

        private TaintFlow(Builder builder) {
            this.code = builder.code;
            this.file = builder.file;
            this.kind = builder.kind;
            this.line = builder.line;
            this.note = builder.note;
            this.step = builder.step;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaintFlow create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return file
         */
        public String getFile() {
            return this.file;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return line
         */
        public Integer getLine() {
            return this.line;
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        /**
         * @return step
         */
        public Integer getStep() {
            return this.step;
        }

        public static final class Builder {
            private String code; 
            private String file; 
            private String kind; 
            private Integer line; 
            private String note; 
            private Integer step; 

            private Builder() {
            } 

            private Builder(TaintFlow model) {
                this.code = model.code;
                this.file = model.file;
                this.kind = model.kind;
                this.line = model.line;
                this.note = model.note;
                this.step = model.step;
            } 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * file.
             */
            public Builder file(String file) {
                this.file = file;
                return this;
            }

            /**
             * kind.
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * line.
             */
            public Builder line(Integer line) {
                this.line = line;
                return this;
            }

            /**
             * note.
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * step.
             */
            public Builder step(Integer step) {
                this.step = step;
                return this;
            }

            public TaintFlow build() {
                return new TaintFlow(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeScanResultsByEngineResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScanResultsByEngineResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("baselineState")
        private String baselineState;

        @com.aliyun.core.annotation.NameInMap("category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("codeSnippet")
        private String codeSnippet;

        @com.aliyun.core.annotation.NameInMap("confidence")
        private Double confidence;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("cweId")
        private String cweId;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("endLine")
        private Long endLine;

        @com.aliyun.core.annotation.NameInMap("filePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("itemSummary")
        private String itemSummary;

        @com.aliyun.core.annotation.NameInMap("owaspCategory")
        private String owaspCategory;

        @com.aliyun.core.annotation.NameInMap("projectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("remediationCodeExample")
        private String remediationCodeExample;

        @com.aliyun.core.annotation.NameInMap("remediationSuggestion")
        private String remediationSuggestion;

        @com.aliyun.core.annotation.NameInMap("ruleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("scaComponent")
        private ScaComponent scaComponent;

        @com.aliyun.core.annotation.NameInMap("scanId")
        private Long scanId;

        @com.aliyun.core.annotation.NameInMap("severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("startLine")
        private Long startLine;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("taintFlow")
        private java.util.List<TaintFlow> taintFlow;

        @com.aliyun.core.annotation.NameInMap("taintFlowSummary")
        private String taintFlowSummary;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private Items(Builder builder) {
            this.baselineState = builder.baselineState;
            this.category = builder.category;
            this.codeSnippet = builder.codeSnippet;
            this.confidence = builder.confidence;
            this.createdAt = builder.createdAt;
            this.cweId = builder.cweId;
            this.description = builder.description;
            this.endLine = builder.endLine;
            this.filePath = builder.filePath;
            this.id = builder.id;
            this.itemSummary = builder.itemSummary;
            this.owaspCategory = builder.owaspCategory;
            this.projectName = builder.projectName;
            this.remediationCodeExample = builder.remediationCodeExample;
            this.remediationSuggestion = builder.remediationSuggestion;
            this.ruleId = builder.ruleId;
            this.scaComponent = builder.scaComponent;
            this.scanId = builder.scanId;
            this.severity = builder.severity;
            this.source = builder.source;
            this.startLine = builder.startLine;
            this.status = builder.status;
            this.taintFlow = builder.taintFlow;
            this.taintFlowSummary = builder.taintFlowSummary;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return baselineState
         */
        public String getBaselineState() {
            return this.baselineState;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return codeSnippet
         */
        public String getCodeSnippet() {
            return this.codeSnippet;
        }

        /**
         * @return confidence
         */
        public Double getConfidence() {
            return this.confidence;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return cweId
         */
        public String getCweId() {
            return this.cweId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endLine
         */
        public Long getEndLine() {
            return this.endLine;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return itemSummary
         */
        public String getItemSummary() {
            return this.itemSummary;
        }

        /**
         * @return owaspCategory
         */
        public String getOwaspCategory() {
            return this.owaspCategory;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return remediationCodeExample
         */
        public String getRemediationCodeExample() {
            return this.remediationCodeExample;
        }

        /**
         * @return remediationSuggestion
         */
        public String getRemediationSuggestion() {
            return this.remediationSuggestion;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return scaComponent
         */
        public ScaComponent getScaComponent() {
            return this.scaComponent;
        }

        /**
         * @return scanId
         */
        public Long getScanId() {
            return this.scanId;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return startLine
         */
        public Long getStartLine() {
            return this.startLine;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taintFlow
         */
        public java.util.List<TaintFlow> getTaintFlow() {
            return this.taintFlow;
        }

        /**
         * @return taintFlowSummary
         */
        public String getTaintFlowSummary() {
            return this.taintFlowSummary;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String baselineState; 
            private String category; 
            private String codeSnippet; 
            private Double confidence; 
            private String createdAt; 
            private String cweId; 
            private String description; 
            private Long endLine; 
            private String filePath; 
            private Long id; 
            private String itemSummary; 
            private String owaspCategory; 
            private String projectName; 
            private String remediationCodeExample; 
            private String remediationSuggestion; 
            private String ruleId; 
            private ScaComponent scaComponent; 
            private Long scanId; 
            private String severity; 
            private String source; 
            private Long startLine; 
            private String status; 
            private java.util.List<TaintFlow> taintFlow; 
            private String taintFlowSummary; 
            private String title; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.baselineState = model.baselineState;
                this.category = model.category;
                this.codeSnippet = model.codeSnippet;
                this.confidence = model.confidence;
                this.createdAt = model.createdAt;
                this.cweId = model.cweId;
                this.description = model.description;
                this.endLine = model.endLine;
                this.filePath = model.filePath;
                this.id = model.id;
                this.itemSummary = model.itemSummary;
                this.owaspCategory = model.owaspCategory;
                this.projectName = model.projectName;
                this.remediationCodeExample = model.remediationCodeExample;
                this.remediationSuggestion = model.remediationSuggestion;
                this.ruleId = model.ruleId;
                this.scaComponent = model.scaComponent;
                this.scanId = model.scanId;
                this.severity = model.severity;
                this.source = model.source;
                this.startLine = model.startLine;
                this.status = model.status;
                this.taintFlow = model.taintFlow;
                this.taintFlowSummary = model.taintFlowSummary;
                this.title = model.title;
            } 

            /**
             * baselineState.
             */
            public Builder baselineState(String baselineState) {
                this.baselineState = baselineState;
                return this;
            }

            /**
             * category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * codeSnippet.
             */
            public Builder codeSnippet(String codeSnippet) {
                this.codeSnippet = codeSnippet;
                return this;
            }

            /**
             * confidence.
             */
            public Builder confidence(Double confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>发现记录创建时间（RFC3339）</p>
             * 
             * <strong>example:</strong>
             * <p>2026-07-28T03:36:31.573Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * cweId.
             */
            public Builder cweId(String cweId) {
                this.cweId = cweId;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * endLine.
             */
            public Builder endLine(Long endLine) {
                this.endLine = endLine;
                return this;
            }

            /**
             * filePath.
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * itemSummary.
             */
            public Builder itemSummary(String itemSummary) {
                this.itemSummary = itemSummary;
                return this;
            }

            /**
             * owaspCategory.
             */
            public Builder owaspCategory(String owaspCategory) {
                this.owaspCategory = owaspCategory;
                return this;
            }

            /**
             * projectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * remediationCodeExample.
             */
            public Builder remediationCodeExample(String remediationCodeExample) {
                this.remediationCodeExample = remediationCodeExample;
                return this;
            }

            /**
             * remediationSuggestion.
             */
            public Builder remediationSuggestion(String remediationSuggestion) {
                this.remediationSuggestion = remediationSuggestion;
                return this;
            }

            /**
             * ruleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * scaComponent.
             */
            public Builder scaComponent(ScaComponent scaComponent) {
                this.scaComponent = scaComponent;
                return this;
            }

            /**
             * scanId.
             */
            public Builder scanId(Long scanId) {
                this.scanId = scanId;
                return this;
            }

            /**
             * severity.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * startLine.
             */
            public Builder startLine(Long startLine) {
                this.startLine = startLine;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * taintFlow.
             */
            public Builder taintFlow(java.util.List<TaintFlow> taintFlow) {
                this.taintFlow = taintFlow;
                return this;
            }

            /**
             * taintFlowSummary.
             */
            public Builder taintFlowSummary(String taintFlowSummary) {
                this.taintFlowSummary = taintFlowSummary;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
