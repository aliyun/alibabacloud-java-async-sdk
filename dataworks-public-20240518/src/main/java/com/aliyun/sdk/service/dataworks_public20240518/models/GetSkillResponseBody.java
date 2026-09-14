// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetSkillResponseBody} extends {@link TeaModel}
 *
 * <p>GetSkillResponseBody</p>
 */
public class GetSkillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Skill")
    private Skill skill;

    private GetSkillResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.skill = builder.skill;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSkillResponseBody create() {
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
     * @return skill
     */
    public Skill getSkill() {
        return this.skill;
    }

    public static final class Builder {
        private String requestId; 
        private Skill skill; 

        private Builder() {
        } 

        private Builder(GetSkillResponseBody model) {
            this.requestId = model.requestId;
            this.skill = model.skill;
        } 

        /**
         * <p>The unique ID for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>824F80BA-1778-5D8A-BAFF-668A4D9C4CC7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned Skill object.</p>
         */
        public Builder skill(Skill skill) {
            this.skill = skill;
            return this;
        }

        public GetSkillResponseBody build() {
            return new GetSkillResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSkillResponseBody} extends {@link TeaModel}
     *
     * <p>GetSkillResponseBody</p>
     */
    public static class VisibilityScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProjectIds")
        private java.util.List<String> projectIds;

        @com.aliyun.core.annotation.NameInMap("UserIds")
        private java.util.List<String> userIds;

        private VisibilityScope(Builder builder) {
            this.projectIds = builder.projectIds;
            this.userIds = builder.userIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VisibilityScope create() {
            return builder().build();
        }

        /**
         * @return projectIds
         */
        public java.util.List<String> getProjectIds() {
            return this.projectIds;
        }

        /**
         * @return userIds
         */
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

        public static final class Builder {
            private java.util.List<String> projectIds; 
            private java.util.List<String> userIds; 

            private Builder() {
            } 

            private Builder(VisibilityScope model) {
                this.projectIds = model.projectIds;
                this.userIds = model.userIds;
            } 

            /**
             * <p><strong>A list of project IDs that can access the Skill.</strong></p>
             */
            public Builder projectIds(java.util.List<String> projectIds) {
                this.projectIds = projectIds;
                return this;
            }

            /**
             * <p>A list of user IDs that can access the Skill.</p>
             */
            public Builder userIds(java.util.List<String> userIds) {
                this.userIds = userIds;
                return this;
            }

            public VisibilityScope build() {
                return new VisibilityScope(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSkillResponseBody} extends {@link TeaModel}
     *
     * <p>GetSkillResponseBody</p>
     */
    public static class Skill extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Body")
        private String body;

        @com.aliyun.core.annotation.NameInMap("BundleUrl")
        private String bundleUrl;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("ModifierId")
        private String modifierId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Visibility")
        private String visibility;

        @com.aliyun.core.annotation.NameInMap("VisibilityScope")
        private VisibilityScope visibilityScope;

        private Skill(Builder builder) {
            this.body = builder.body;
            this.bundleUrl = builder.bundleUrl;
            this.creatorId = builder.creatorId;
            this.description = builder.description;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.modifierId = builder.modifierId;
            this.name = builder.name;
            this.visibility = builder.visibility;
            this.visibilityScope = builder.visibilityScope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Skill create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public String getBody() {
            return this.body;
        }

        /**
         * @return bundleUrl
         */
        public String getBundleUrl() {
            return this.bundleUrl;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return modifierId
         */
        public String getModifierId() {
            return this.modifierId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return visibility
         */
        public String getVisibility() {
            return this.visibility;
        }

        /**
         * @return visibilityScope
         */
        public VisibilityScope getVisibilityScope() {
            return this.visibilityScope;
        }

        public static final class Builder {
            private String body; 
            private String bundleUrl; 
            private String creatorId; 
            private String description; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String modifierId; 
            private String name; 
            private String visibility; 
            private VisibilityScope visibilityScope; 

            private Builder() {
            } 

            private Builder(Skill model) {
                this.body = model.body;
                this.bundleUrl = model.bundleUrl;
                this.creatorId = model.creatorId;
                this.description = model.description;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.modifierId = model.modifierId;
                this.name = model.name;
                this.visibility = model.visibility;
                this.visibilityScope = model.visibilityScope;
            } 

            /**
             * <p><strong>The content of the SKILL.md file.</strong></p>
             * 
             * <strong>example:</strong>
             * <p>把大象装冰箱需要3步，把冰箱门打开，把大象放进去，把冰箱门关上。</p>
             */
            public Builder body(String body) {
                this.body = body;
                return this;
            }

            /**
             * <p>A temporary download link for <code>bundle.zip</code>, which does not require authentication and will expire.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://your-bucket.oss-cn-hangzhou.aliyuncs.com/xxx.zip?Expires=...&Signature=">https://your-bucket.oss-cn-hangzhou.aliyuncs.com/xxx.zip?Expires=...&amp;Signature=</a>...</p>
             */
            public Builder bundleUrl(String bundleUrl) {
                this.bundleUrl = bundleUrl;
                return this;
            }

            /**
             * <p>The ID of the user who created the Skill.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p><strong>The Skill description.</strong></p>
             * 
             * <strong>example:</strong>
             * <p>数据分析技能</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time the Skill was created, provided as a UNIX timestamp in milliseconds.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>1780555634000</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>The time the Skill was last modified, provided as a UNIX timestamp in milliseconds.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>1780555634000</p>
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * <p>The ID of the user who last modified the Skill.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder modifierId(String modifierId) {
                this.modifierId = modifierId;
                return this;
            }

            /**
             * <p><strong>The name of the Skill.</strong></p>
             * 
             * <strong>example:</strong>
             * <p>my-skill</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p><strong>The visibility level.</strong></p>
             * 
             * <strong>example:</strong>
             * <p>TENANT</p>
             */
            public Builder visibility(String visibility) {
                this.visibility = visibility;
                return this;
            }

            /**
             * <p><strong>The visibility scope.</strong></p>
             */
            public Builder visibilityScope(VisibilityScope visibilityScope) {
                this.visibilityScope = visibilityScope;
                return this;
            }

            public Skill build() {
                return new Skill(this);
            } 

        } 

    }
}
