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
         * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>0-3 项下一步推荐</p>
         */
        public Builder nextActions(java.util.List<NextActions> nextActions) {
            this.nextActions = nextActions;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>会话标题</p>
         * 
         * <strong>example:</strong>
         * <p>示例会话标题</p>
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
             * <p>不超过 15 字的祈使句标题</p>
             * 
             * <strong>example:</strong>
             * <p>继续分析这个指标</p>
             */
            public Builder actionTitle(String actionTitle) {
                this.actionTitle = actionTitle;
                return this;
            }

            /**
             * <p>技能唯一编码，recommend_action 时返回；前端据此触发技能</p>
             * 
             * <strong>example:</strong>
             * <p>exampleSkillCode</p>
             */
            public Builder skillCode(String skillCode) {
                this.skillCode = skillCode;
                return this;
            }

            /**
             * <p>技能展示名，recommend_action 时返回；仅用于展示</p>
             * 
             * <strong>example:</strong>
             * <p>示例技能</p>
             */
            public Builder skillName(String skillName) {
                this.skillName = skillName;
                return this;
            }

            /**
             * <p>推荐类型：recommend_reply=继续追问，recommend_action=触发技能</p>
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
