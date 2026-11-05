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
 * {@link DescribePolarClawSkillsMarketResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolarClawSkillsMarketResponseBody</p>
 */
public class DescribePolarClawSkillsMarketResponseBody extends TeaModel {
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

    private DescribePolarClawSkillsMarketResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.skillList = builder.skillList;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarClawSkillsMarketResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private java.util.List<SkillList> skillList; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribePolarClawSkillsMarketResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.skillList = model.skillList;
            this.totalRecordCount = model.totalRecordCount;
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
         * <p>The number of entries on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CDB3258F-B5DE-43C4-8935-CBA0CA******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The skill list.</p>
         */
        public Builder skillList(java.util.List<SkillList> skillList) {
            this.skillList = skillList;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribePolarClawSkillsMarketResponseBody build() {
            return new DescribePolarClawSkillsMarketResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePolarClawSkillsMarketResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarClawSkillsMarketResponseBody</p>
     */
    public static class SkillList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssessmentStatus")
        private String assessmentStatus;

        @com.aliyun.core.annotation.NameInMap("DownloadCount")
        private String downloadCount;

        @com.aliyun.core.annotation.NameInMap("SkillName")
        private String skillName;

        @com.aliyun.core.annotation.NameInMap("SkillVersion")
        private String skillVersion;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("TagList")
        private java.util.List<String> tagList;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private SkillList(Builder builder) {
            this.assessmentStatus = builder.assessmentStatus;
            this.downloadCount = builder.downloadCount;
            this.skillName = builder.skillName;
            this.skillVersion = builder.skillVersion;
            this.summary = builder.summary;
            this.tagList = builder.tagList;
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
         * @return downloadCount
         */
        public String getDownloadCount() {
            return this.downloadCount;
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
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return tagList
         */
        public java.util.List<String> getTagList() {
            return this.tagList;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String assessmentStatus; 
            private String downloadCount; 
            private String skillName; 
            private String skillVersion; 
            private String summary; 
            private java.util.List<String> tagList; 
            private String title; 

            private Builder() {
            } 

            private Builder(SkillList model) {
                this.assessmentStatus = model.assessmentStatus;
                this.downloadCount = model.downloadCount;
                this.skillName = model.skillName;
                this.skillVersion = model.skillVersion;
                this.summary = model.summary;
                this.tagList = model.tagList;
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
             * <p>The number of downloads.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder downloadCount(String downloadCount) {
                this.downloadCount = downloadCount;
                return this;
            }

            /**
             * <p>The skill name.</p>
             * 
             * <strong>example:</strong>
             * <p>alibabacloud-polardbx-sql</p>
             */
            public Builder skillName(String skillName) {
                this.skillName = skillName;
                return this;
            }

            /**
             * <p>The skill version.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.1-beta.1</p>
             */
            public Builder skillVersion(String skillVersion) {
                this.skillVersion = skillVersion;
                return this;
            }

            /**
             * <p>The OpenAPI summary.</p>
             * 
             * <strong>example:</strong>
             * <p>Automatically created repository via Image-manage</p>
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * <p>The tag list.</p>
             */
            public Builder tagList(java.util.List<String> tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * <p>The title.</p>
             * 
             * <strong>example:</strong>
             * <p>Alcohol</p>
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
