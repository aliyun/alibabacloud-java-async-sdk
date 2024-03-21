// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveSearchConditionResponseBody} extends {@link TeaModel}
 *
 * <p>SaveSearchConditionResponseBody</p>
 */
public class SaveSearchConditionResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ConditionContent")
    private String conditionContent;

    @NameInMap("ConditionId")
    private Long conditionId;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SessionId")
    private String sessionId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TagName")
    private String tagName;

    @NameInMap("Type")
    private Integer type;

    @NameInMap("Umid")
    private String umid;

    @NameInMap("UserId")
    private Long userId;

    private SaveSearchConditionResponseBody(Builder builder) {
        this.code = builder.code;
        this.conditionContent = builder.conditionContent;
        this.conditionId = builder.conditionId;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.sessionId = builder.sessionId;
        this.success = builder.success;
        this.tagName = builder.tagName;
        this.type = builder.type;
        this.umid = builder.umid;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveSearchConditionResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return conditionContent
     */
    public String getConditionContent() {
        return this.conditionContent;
    }

    /**
     * @return conditionId
     */
    public Long getConditionId() {
        return this.conditionId;
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
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return tagName
     */
    public String getTagName() {
        return this.tagName;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * @return umid
     */
    public String getUmid() {
        return this.umid;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String code; 
        private String conditionContent; 
        private Long conditionId; 
        private String message; 
        private String requestId; 
        private String sessionId; 
        private Boolean success; 
        private String tagName; 
        private Integer type; 
        private String umid; 
        private Long userId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ConditionContent.
         */
        public Builder conditionContent(String conditionContent) {
            this.conditionContent = conditionContent;
            return this;
        }

        /**
         * ConditionId.
         */
        public Builder conditionId(Long conditionId) {
            this.conditionId = conditionId;
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
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TagName.
         */
        public Builder tagName(String tagName) {
            this.tagName = tagName;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.type = type;
            return this;
        }

        /**
         * Umid.
         */
        public Builder umid(String umid) {
            this.umid = umid;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public SaveSearchConditionResponseBody build() {
            return new SaveSearchConditionResponseBody(this);
        } 

    } 

}
