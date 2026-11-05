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
 * {@link DescribePolarClawSkillTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolarClawSkillTemplatesResponseBody</p>
 */
public class DescribePolarClawSkillTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SkillTemplates")
    private java.util.List<SkillTemplates> skillTemplates;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribePolarClawSkillTemplatesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.skillTemplates = builder.skillTemplates;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarClawSkillTemplatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return skillTemplates
     */
    public java.util.List<SkillTemplates> getSkillTemplates() {
        return this.skillTemplates;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private java.util.List<SkillTemplates> skillTemplates; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(DescribePolarClawSkillTemplatesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.skillTemplates = model.skillTemplates;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values:</p>
         * <ul>
         * <li><p><strong>30</strong></p>
         * </li>
         * <li><p><strong>50</strong></p>
         * </li>
         * <li><p><strong>100</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>925B84D9-CA72-432C-95CF-738C22******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The skill templates.</p>
         */
        public Builder skillTemplates(java.util.List<SkillTemplates> skillTemplates) {
            this.skillTemplates = skillTemplates;
            return this;
        }

        /**
         * <p>The total number of entries. This parameter is returned only when a list is queried.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePolarClawSkillTemplatesResponseBody build() {
            return new DescribePolarClawSkillTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePolarClawSkillTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarClawSkillTemplatesResponseBody</p>
     */
    public static class SkillTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Created")
        private String created;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Modified")
        private String modified;

        @com.aliyun.core.annotation.NameInMap("SkillCounts")
        private String skillCounts;

        @com.aliyun.core.annotation.NameInMap("SkillTemplateDesc")
        private String skillTemplateDesc;

        @com.aliyun.core.annotation.NameInMap("SkillTemplateId")
        private String skillTemplateId;

        @com.aliyun.core.annotation.NameInMap("SkillTemplateName")
        private String skillTemplateName;

        @com.aliyun.core.annotation.NameInMap("SkillTemplateType")
        private String skillTemplateType;

        @com.aliyun.core.annotation.NameInMap("SrcApplicationId")
        private String srcApplicationId;

        private SkillTemplates(Builder builder) {
            this.created = builder.created;
            this.id = builder.id;
            this.modified = builder.modified;
            this.skillCounts = builder.skillCounts;
            this.skillTemplateDesc = builder.skillTemplateDesc;
            this.skillTemplateId = builder.skillTemplateId;
            this.skillTemplateName = builder.skillTemplateName;
            this.skillTemplateType = builder.skillTemplateType;
            this.srcApplicationId = builder.srcApplicationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillTemplates create() {
            return builder().build();
        }

        /**
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return modified
         */
        public String getModified() {
            return this.modified;
        }

        /**
         * @return skillCounts
         */
        public String getSkillCounts() {
            return this.skillCounts;
        }

        /**
         * @return skillTemplateDesc
         */
        public String getSkillTemplateDesc() {
            return this.skillTemplateDesc;
        }

        /**
         * @return skillTemplateId
         */
        public String getSkillTemplateId() {
            return this.skillTemplateId;
        }

        /**
         * @return skillTemplateName
         */
        public String getSkillTemplateName() {
            return this.skillTemplateName;
        }

        /**
         * @return skillTemplateType
         */
        public String getSkillTemplateType() {
            return this.skillTemplateType;
        }

        /**
         * @return srcApplicationId
         */
        public String getSrcApplicationId() {
            return this.srcApplicationId;
        }

        public static final class Builder {
            private String created; 
            private String id; 
            private String modified; 
            private String skillCounts; 
            private String skillTemplateDesc; 
            private String skillTemplateId; 
            private String skillTemplateName; 
            private String skillTemplateType; 
            private String srcApplicationId; 

            private Builder() {
            } 

            private Builder(SkillTemplates model) {
                this.created = model.created;
                this.id = model.id;
                this.modified = model.modified;
                this.skillCounts = model.skillCounts;
                this.skillTemplateDesc = model.skillTemplateDesc;
                this.skillTemplateId = model.skillTemplateId;
                this.skillTemplateName = model.skillTemplateName;
                this.skillTemplateType = model.skillTemplateType;
                this.srcApplicationId = model.srcApplicationId;
            } 

            /**
             * <p>Indicates whether the skill template is actually created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-15T16:00Z</p>
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>423</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The last modification time of the parameter template.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-04-07T04:00Z</p>
             */
            public Builder modified(String modified) {
                this.modified = modified;
                return this;
            }

            /**
             * <p>The number of skills.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder skillCounts(String skillCounts) {
                this.skillCounts = skillCounts;
                return this;
            }

            /**
             * <p>The description of the skill template.</p>
             * 
             * <strong>example:</strong>
             * <p>skill template for test</p>
             */
            public Builder skillTemplateDesc(String skillTemplateDesc) {
                this.skillTemplateDesc = skillTemplateDesc;
                return this;
            }

            /**
             * <p>The skill template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pcpg-skill-2ze5v8n27o7x92a</p>
             */
            public Builder skillTemplateId(String skillTemplateId) {
                this.skillTemplateId = skillTemplateId;
                return this;
            }

            /**
             * <p>The name of the skill template.</p>
             * 
             * <strong>example:</strong>
             * <p>skill-template-test</p>
             */
            public Builder skillTemplateName(String skillTemplateName) {
                this.skillTemplateName = skillTemplateName;
                return this;
            }

            /**
             * <p>The templatetype of the skill template. Valid values: 0: system template. 1: user template.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder skillTemplateType(String skillTemplateType) {
                this.skillTemplateType = skillTemplateType;
                return this;
            }

            /**
             * <p>The source application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pa-**************</p>
             */
            public Builder srcApplicationId(String srcApplicationId) {
                this.srcApplicationId = srcApplicationId;
                return this;
            }

            public SkillTemplates build() {
                return new SkillTemplates(this);
            } 

        } 

    }
}
