// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link RecommendNextActionsResponseBody} extends {@link TeaModel}
 *
 * <p>RecommendNextActionsResponseBody</p>
 */
public class RecommendNextActionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextActions")
    private java.util.List<NextActions> nextActions;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    private RecommendNextActionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.nextActions = builder.nextActions;
        this.requestId = builder.requestId;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecommendNextActionsResponseBody create() {
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
     * @return nextActions
     */
    public java.util.List<NextActions> getNextActions() {
        return this.nextActions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private java.util.List<NextActions> nextActions; 
        private String requestId; 
        private String title; 

        private Builder() {
        } 

        private Builder(RecommendNextActionsResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.nextActions = model.nextActions;
            this.requestId = model.requestId;
            this.title = model.title;
        } 

        /**
         * <p>The business status code. A value of 200 indicates success. A failure returns a backend error code (ERR.* / InvalidParameter.*).</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The status code description.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The next-step recommendations.</p>
         */
        public Builder nextActions(java.util.List<NextActions> nextActions) {
            this.nextActions = nextActions;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The scheduled meeting title.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample session title</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public RecommendNextActionsResponseBody build() {
            return new RecommendNextActionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RecommendNextActionsResponseBody} extends {@link TeaModel}
     *
     * <p>RecommendNextActionsResponseBody</p>
     */
    public static class NextActions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actionTitle")
        private String actionTitle;

        @com.aliyun.core.annotation.NameInMap("skillCode")
        private String skillCode;

        @com.aliyun.core.annotation.NameInMap("skillName")
        private String skillName;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private NextActions(Builder builder) {
            this.actionTitle = builder.actionTitle;
            this.skillCode = builder.skillCode;
            this.skillName = builder.skillName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NextActions create() {
            return builder().build();
        }

        /**
         * @return actionTitle
         */
        public String getActionTitle() {
            return this.actionTitle;
        }

        /**
         * @return skillCode
         */
        public String getSkillCode() {
            return this.skillCode;
        }

        /**
         * @return skillName
         */
        public String getSkillName() {
            return this.skillName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String actionTitle; 
            private String skillCode; 
            private String skillName; 
            private String type; 

            private Builder() {
            } 

            private Builder(NextActions model) {
                this.actionTitle = model.actionTitle;
                this.skillCode = model.skillCode;
                this.skillName = model.skillName;
                this.type = model.type;
            } 

            /**
             * <p>The recommendation title.</p>
             * 
             * <strong>example:</strong>
             * <p>Continue analyzing this metric</p>
             */
            public Builder actionTitle(String actionTitle) {
                this.actionTitle = actionTitle;
                return this;
            }

            /**
             * <p>The skill code.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleSkillCode</p>
             */
            public Builder skillCode(String skillCode) {
                this.skillCode = skillCode;
                return this;
            }

            /**
             * <p>The skill name.</p>
             * 
             * <strong>example:</strong>
             * <p>SampleSkill</p>
             */
            public Builder skillName(String skillName) {
                this.skillName = skillName;
                return this;
            }

            /**
             * <p>The recommendation type.</p>
             * 
             * <strong>example:</strong>
             * <p>recommend_reply</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public NextActions build() {
                return new NextActions(this);
            } 

        } 

    }
}
