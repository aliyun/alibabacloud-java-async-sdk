// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link CreateAgentSkillResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAgentSkillResponseBody</p>
 */
public class CreateAgentSkillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SkillInfo")
    private java.util.List<SkillInfo> skillInfo;

    private CreateAgentSkillResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.skillInfo = builder.skillInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgentSkillResponseBody create() {
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
     * @return skillInfo
     */
    public java.util.List<SkillInfo> getSkillInfo() {
        return this.skillInfo;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.List<SkillInfo> skillInfo; 

        private Builder() {
        } 

        private Builder(CreateAgentSkillResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.skillInfo = model.skillInfo;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * SkillInfo.
         */
        public Builder skillInfo(java.util.List<SkillInfo> skillInfo) {
            this.skillInfo = skillInfo;
            return this;
        }

        public CreateAgentSkillResponseBody build() {
            return new CreateAgentSkillResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAgentSkillResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAgentSkillResponseBody</p>
     */
    public static class SkillInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Instruction")
        private String instruction;

        @com.aliyun.core.annotation.NameInMap("SkillId")
        private String skillId;

        @com.aliyun.core.annotation.NameInMap("SkillName")
        private String skillName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private SkillInfo(Builder builder) {
            this.description = builder.description;
            this.instruction = builder.instruction;
            this.skillId = builder.skillId;
            this.skillName = builder.skillName;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillInfo create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instruction
         */
        public String getInstruction() {
            return this.instruction;
        }

        /**
         * @return skillId
         */
        public String getSkillId() {
            return this.skillId;
        }

        /**
         * @return skillName
         */
        public String getSkillName() {
            return this.skillName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String description; 
            private String instruction; 
            private String skillId; 
            private String skillName; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(SkillInfo model) {
                this.description = model.description;
                this.instruction = model.instruction;
                this.skillId = model.skillId;
                this.skillName = model.skillName;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Instruction.
             */
            public Builder instruction(String instruction) {
                this.instruction = instruction;
                return this;
            }

            /**
             * SkillId.
             */
            public Builder skillId(String skillId) {
                this.skillId = skillId;
                return this;
            }

            /**
             * SkillName.
             */
            public Builder skillName(String skillName) {
                this.skillName = skillName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SkillInfo build() {
                return new SkillInfo(this);
            } 

        } 

    }
}
