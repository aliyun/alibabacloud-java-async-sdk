// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link ListRealTimeAgentResponseBody} extends {@link TeaModel}
 *
 * <p>ListRealTimeAgentResponseBody</p>
 */
public class ListRealTimeAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListRealTimeAgentResponseBody(Builder builder) {
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

    public static ListRealTimeAgentResponseBody create() {
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

        private Builder(ListRealTimeAgentResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListRealTimeAgentResponseBody build() {
            return new ListRealTimeAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRealTimeAgentResponseBody} extends {@link TeaModel}
     *
     * <p>ListRealTimeAgentResponseBody</p>
     */
    public static class Skill extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("SkillGroupDescription")
        private String skillGroupDescription;

        @com.aliyun.core.annotation.NameInMap("SkillGroupId")
        private String skillGroupId;

        @com.aliyun.core.annotation.NameInMap("SkillGroupName")
        private String skillGroupName;

        private Skill(Builder builder) {
            this.instanceId = builder.instanceId;
            this.skillGroupDescription = builder.skillGroupDescription;
            this.skillGroupId = builder.skillGroupId;
            this.skillGroupName = builder.skillGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Skill create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return skillGroupDescription
         */
        public String getSkillGroupDescription() {
            return this.skillGroupDescription;
        }

        /**
         * @return skillGroupId
         */
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        /**
         * @return skillGroupName
         */
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public static final class Builder {
            private String instanceId; 
            private String skillGroupDescription; 
            private String skillGroupId; 
            private String skillGroupName; 

            private Builder() {
            } 

            private Builder(Skill model) {
                this.instanceId = model.instanceId;
                this.skillGroupDescription = model.skillGroupDescription;
                this.skillGroupId = model.skillGroupId;
                this.skillGroupName = model.skillGroupName;
            } 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * SkillGroupDescription.
             */
            public Builder skillGroupDescription(String skillGroupDescription) {
                this.skillGroupDescription = skillGroupDescription;
                return this;
            }

            /**
             * SkillGroupId.
             */
            public Builder skillGroupId(String skillGroupId) {
                this.skillGroupId = skillGroupId;
                return this;
            }

            /**
             * SkillGroupName.
             */
            public Builder skillGroupName(String skillGroupName) {
                this.skillGroupName = skillGroupName;
                return this;
            }

            public Skill build() {
                return new Skill(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRealTimeAgentResponseBody} extends {@link TeaModel}
     *
     * <p>ListRealTimeAgentResponseBody</p>
     */
    public static class SkillLevel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Level")
        private Integer level;

        @com.aliyun.core.annotation.NameInMap("Skill")
        private Skill skill;

        @com.aliyun.core.annotation.NameInMap("SkillLevelId")
        private String skillLevelId;

        private SkillLevel(Builder builder) {
            this.level = builder.level;
            this.skill = builder.skill;
            this.skillLevelId = builder.skillLevelId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillLevel create() {
            return builder().build();
        }

        /**
         * @return level
         */
        public Integer getLevel() {
            return this.level;
        }

        /**
         * @return skill
         */
        public Skill getSkill() {
            return this.skill;
        }

        /**
         * @return skillLevelId
         */
        public String getSkillLevelId() {
            return this.skillLevelId;
        }

        public static final class Builder {
            private Integer level; 
            private Skill skill; 
            private String skillLevelId; 

            private Builder() {
            } 

            private Builder(SkillLevel model) {
                this.level = model.level;
                this.skill = model.skill;
                this.skillLevelId = model.skillLevelId;
            } 

            /**
             * Level.
             */
            public Builder level(Integer level) {
                this.level = level;
                return this;
            }

            /**
             * Skill.
             */
            public Builder skill(Skill skill) {
                this.skill = skill;
                return this;
            }

            /**
             * SkillLevelId.
             */
            public Builder skillLevelId(String skillLevelId) {
                this.skillLevelId = skillLevelId;
                return this;
            }

            public SkillLevel build() {
                return new SkillLevel(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRealTimeAgentResponseBody} extends {@link TeaModel}
     *
     * <p>ListRealTimeAgentResponseBody</p>
     */
    public static class SkillLevels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SkillLevel")
        private java.util.List<SkillLevel> skillLevel;

        private SkillLevels(Builder builder) {
            this.skillLevel = builder.skillLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillLevels create() {
            return builder().build();
        }

        /**
         * @return skillLevel
         */
        public java.util.List<SkillLevel> getSkillLevel() {
            return this.skillLevel;
        }

        public static final class Builder {
            private java.util.List<SkillLevel> skillLevel; 

            private Builder() {
            } 

            private Builder(SkillLevels model) {
                this.skillLevel = model.skillLevel;
            } 

            /**
             * SkillLevel.
             */
            public Builder skillLevel(java.util.List<SkillLevel> skillLevel) {
                this.skillLevel = skillLevel;
                return this;
            }

            public SkillLevels build() {
                return new SkillLevels(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRealTimeAgentResponseBody} extends {@link TeaModel}
     *
     * <p>ListRealTimeAgentResponseBody</p>
     */
    public static class User extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Dn")
        private String dn;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("RamId")
        private String ramId;

        @com.aliyun.core.annotation.NameInMap("SkillLevels")
        private SkillLevels skillLevels;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("StateDesc")
        private String stateDesc;

        private User(Builder builder) {
            this.displayName = builder.displayName;
            this.dn = builder.dn;
            this.phone = builder.phone;
            this.ramId = builder.ramId;
            this.skillLevels = builder.skillLevels;
            this.state = builder.state;
            this.stateDesc = builder.stateDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static User create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return dn
         */
        public String getDn() {
            return this.dn;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return ramId
         */
        public String getRamId() {
            return this.ramId;
        }

        /**
         * @return skillLevels
         */
        public SkillLevels getSkillLevels() {
            return this.skillLevels;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return stateDesc
         */
        public String getStateDesc() {
            return this.stateDesc;
        }

        public static final class Builder {
            private String displayName; 
            private String dn; 
            private String phone; 
            private String ramId; 
            private SkillLevels skillLevels; 
            private String state; 
            private String stateDesc; 

            private Builder() {
            } 

            private Builder(User model) {
                this.displayName = model.displayName;
                this.dn = model.dn;
                this.phone = model.phone;
                this.ramId = model.ramId;
                this.skillLevels = model.skillLevels;
                this.state = model.state;
                this.stateDesc = model.stateDesc;
            } 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Dn.
             */
            public Builder dn(String dn) {
                this.dn = dn;
                return this;
            }

            /**
             * Phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * RamId.
             */
            public Builder ramId(String ramId) {
                this.ramId = ramId;
                return this;
            }

            /**
             * SkillLevels.
             */
            public Builder skillLevels(SkillLevels skillLevels) {
                this.skillLevels = skillLevels;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * StateDesc.
             */
            public Builder stateDesc(String stateDesc) {
                this.stateDesc = stateDesc;
                return this;
            }

            public User build() {
                return new User(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRealTimeAgentResponseBody} extends {@link TeaModel}
     *
     * <p>ListRealTimeAgentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("User")
        private java.util.List<User> user;

        private Data(Builder builder) {
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return user
         */
        public java.util.List<User> getUser() {
            return this.user;
        }

        public static final class Builder {
            private java.util.List<User> user; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.user = model.user;
            } 

            /**
             * User.
             */
            public Builder user(java.util.List<User> user) {
                this.user = user;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
