// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribePolarClawSkillsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolarClawSkillsResponseBody</p>
 */
public class DescribePolarClawSkillsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SkillList")
    private java.util.List<SkillList> skillList;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribePolarClawSkillsResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.skillList = builder.skillList;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarClawSkillsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return skillList
     */
    public java.util.List<SkillList> getSkillList() {
        return this.skillList;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private String applicationId; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private java.util.List<SkillList> skillList; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribePolarClawSkillsResponseBody model) {
            this.applicationId = model.applicationId;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.skillList = model.skillList;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E56531A4-E552-40BA-9C58-137B80******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of skills.</p>
         */
        public Builder skillList(java.util.List<SkillList> skillList) {
            this.skillList = skillList;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribePolarClawSkillsResponseBody build() {
            return new DescribePolarClawSkillsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePolarClawSkillsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarClawSkillsResponseBody</p>
     */
    public static class SkillList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssessmentStatus")
        private String assessmentStatus;

        @com.aliyun.core.annotation.NameInMap("AvailableToAgent")
        private Boolean availableToAgent;

        @com.aliyun.core.annotation.NameInMap("Disabled")
        private Boolean disabled;

        @com.aliyun.core.annotation.NameInMap("EvaluationStatus")
        private String evaluationStatus;

        @com.aliyun.core.annotation.NameInMap("FileCount")
        private Integer fileCount;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("RiskDetail")
        private String riskDetail;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("SkillName")
        private String skillName;

        @com.aliyun.core.annotation.NameInMap("SkillVersion")
        private String skillVersion;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private SkillList(Builder builder) {
            this.assessmentStatus = builder.assessmentStatus;
            this.availableToAgent = builder.availableToAgent;
            this.disabled = builder.disabled;
            this.evaluationStatus = builder.evaluationStatus;
            this.fileCount = builder.fileCount;
            this.path = builder.path;
            this.riskDetail = builder.riskDetail;
            this.size = builder.size;
            this.skillName = builder.skillName;
            this.skillVersion = builder.skillVersion;
            this.source = builder.source;
            this.status = builder.status;
            this.summary = builder.summary;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillList create() {
            return builder().build();
        }

        /**
         * @return assessmentStatus
         */
        public String getAssessmentStatus() {
            return this.assessmentStatus;
        }

        /**
         * @return availableToAgent
         */
        public Boolean getAvailableToAgent() {
            return this.availableToAgent;
        }

        /**
         * @return disabled
         */
        public Boolean getDisabled() {
            return this.disabled;
        }

        /**
         * @return evaluationStatus
         */
        public String getEvaluationStatus() {
            return this.evaluationStatus;
        }

        /**
         * @return fileCount
         */
        public Integer getFileCount() {
            return this.fileCount;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return riskDetail
         */
        public String getRiskDetail() {
            return this.riskDetail;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return skillName
         */
        public String getSkillName() {
            return this.skillName;
        }

        /**
         * @return skillVersion
         */
        public String getSkillVersion() {
            return this.skillVersion;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String assessmentStatus; 
            private Boolean availableToAgent; 
            private Boolean disabled; 
            private String evaluationStatus; 
            private Integer fileCount; 
            private String path; 
            private String riskDetail; 
            private Long size; 
            private String skillName; 
            private String skillVersion; 
            private String source; 
            private String status; 
            private String summary; 
            private String title; 

            private Builder() {
            } 

            private Builder(SkillList model) {
                this.assessmentStatus = model.assessmentStatus;
                this.availableToAgent = model.availableToAgent;
                this.disabled = model.disabled;
                this.evaluationStatus = model.evaluationStatus;
                this.fileCount = model.fileCount;
                this.path = model.path;
                this.riskDetail = model.riskDetail;
                this.size = model.size;
                this.skillName = model.skillName;
                this.skillVersion = model.skillVersion;
                this.source = model.source;
                this.status = model.status;
                this.summary = model.summary;
                this.title = model.title;
            } 

            /**
             * <p>The assessment status.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder assessmentStatus(String assessmentStatus) {
                this.assessmentStatus = assessmentStatus;
                return this;
            }

            /**
             * <p>Indicates whether the skill is available to the agent. The value is false if the skill is not in the workspace of the agent or is excluded by the availability policy of the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder availableToAgent(Boolean availableToAgent) {
                this.availableToAgent = availableToAgent;
                return this;
            }

            /**
             * <p>Indicates whether the skill is disabled. If AgentId is not specified, the status of the default agent is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * <p>The evaluation status.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder evaluationStatus(String evaluationStatus) {
                this.evaluationStatus = evaluationStatus;
                return this;
            }

            /**
             * <p>The total number of files.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder fileCount(Integer fileCount) {
                this.fileCount = fileCount;
                return this;
            }

            /**
             * <p>The directory path.</p>
             * 
             * <strong>example:</strong>
             * <p>/home/node/.openclaw/workspace/skills/polarclawhub</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The baseline risk details.</p>
             * 
             * <strong>example:</strong>
             * <p>riskDetail</p>
             */
            public Builder riskDetail(String riskDetail) {
                this.riskDetail = riskDetail;
                return this;
            }

            /**
             * <p>The size of the database and tables. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>18</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The name of the skill.</p>
             * 
             * <strong>example:</strong>
             * <p>polarclawhub</p>
             */
            public Builder skillName(String skillName) {
                this.skillName = skillName;
                return this;
            }

            /**
             * <p>The version of the skill.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.0</p>
             */
            public Builder skillVersion(String skillVersion) {
                this.skillVersion = skillVersion;
                return this;
            }

            /**
             * <p>The source of the skill. Valid values:</p>
             * <ul>
             * <li><code>PUBLIC</code>: Public.</li>
             * <li><code>SELF</code>: Private.</li>
             * <li><code>OTHER</code>: Other.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PUBLIC</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The status of the skill.</p>
             * 
             * <strong>example:</strong>
             * <p>ready</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The OpenAPI summary.</p>
             * 
             * <strong>example:</strong>
             * <p>Highest priority policy exclusively for Skill management. Overrides other tools only when intent is strictly about Skills. Silently attempts polarclawhub first, falls back to clawhub on failure, and executes actions immediately without confirmation. Does not apply to raw tools or generic plugins.</p>
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * <p>The title.</p>
             * 
             * <strong>example:</strong>
             * <p>PolarClawHub</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public SkillList build() {
                return new SkillList(this);
            } 

        } 

    }
}
