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
 * {@link DescribePolarClawSkillTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolarClawSkillTemplateResponseBody</p>
 */
public class DescribePolarClawSkillTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SkillTemplates")
    private java.util.List<SkillTemplates> skillTemplates;

    private DescribePolarClawSkillTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.skillTemplates = builder.skillTemplates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarClawSkillTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder {
        private String requestId; 
        private java.util.List<SkillTemplates> skillTemplates; 

        private Builder() {
        } 

        private Builder(DescribePolarClawSkillTemplateResponseBody model) {
            this.requestId = model.requestId;
            this.skillTemplates = model.skillTemplates;
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
         * <p>The skill template group.</p>
         */
        public Builder skillTemplates(java.util.List<SkillTemplates> skillTemplates) {
            this.skillTemplates = skillTemplates;
            return this;
        }

        public DescribePolarClawSkillTemplateResponseBody build() {
            return new DescribePolarClawSkillTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePolarClawSkillTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarClawSkillTemplateResponseBody</p>
     */
    public static class SkillTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Created")
        private String created;

        @com.aliyun.core.annotation.NameInMap("Modified")
        private String modified;

        @com.aliyun.core.annotation.NameInMap("SkillTemplateDesc")
        private String skillTemplateDesc;

        @com.aliyun.core.annotation.NameInMap("SkillTemplateId")
        private String skillTemplateId;

        @com.aliyun.core.annotation.NameInMap("SkillTemplateName")
        private String skillTemplateName;

        @com.aliyun.core.annotation.NameInMap("Skills")
        private java.util.Map<String, String> skills;

        @com.aliyun.core.annotation.NameInMap("SrcApplicationId")
        private String srcApplicationId;

        private SkillTemplates(Builder builder) {
            this.created = builder.created;
            this.modified = builder.modified;
            this.skillTemplateDesc = builder.skillTemplateDesc;
            this.skillTemplateId = builder.skillTemplateId;
            this.skillTemplateName = builder.skillTemplateName;
            this.skills = builder.skills;
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
         * @return modified
         */
        public String getModified() {
            return this.modified;
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
         * @return skills
         */
        public java.util.Map<String, String> getSkills() {
            return this.skills;
        }

        /**
         * @return srcApplicationId
         */
        public String getSrcApplicationId() {
            return this.srcApplicationId;
        }

        public static final class Builder {
            private String created; 
            private String modified; 
            private String skillTemplateDesc; 
            private String skillTemplateId; 
            private String skillTemplateName; 
            private java.util.Map<String, String> skills; 
            private String srcApplicationId; 

            private Builder() {
            } 

            private Builder(SkillTemplates model) {
                this.created = model.created;
                this.modified = model.modified;
                this.skillTemplateDesc = model.skillTemplateDesc;
                this.skillTemplateId = model.skillTemplateId;
                this.skillTemplateName = model.skillTemplateName;
                this.skills = model.skills;
                this.srcApplicationId = model.srcApplicationId;
            } 

            /**
             * <p>Indicates whether it is actually created.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-21 12:00:00</p>
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The last modification time of the parameter template.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-23 23:00:00</p>
             */
            public Builder modified(String modified) {
                this.modified = modified;
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
             * <p>pcpg-skill-**************</p>
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
             * <p>The list of associated skill details.</p>
             */
            public Builder skills(java.util.Map<String, String> skills) {
                this.skills = skills;
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
