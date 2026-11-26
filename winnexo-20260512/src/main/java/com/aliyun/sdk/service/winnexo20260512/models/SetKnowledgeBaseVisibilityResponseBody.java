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
 * {@link SetKnowledgeBaseVisibilityResponseBody} extends {@link TeaModel}
 *
 * <p>SetKnowledgeBaseVisibilityResponseBody</p>
 */
public class SetKnowledgeBaseVisibilityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("targetId")
    private String targetId;

    @com.aliyun.core.annotation.NameInMap("targetType")
    private String targetType;

    @com.aliyun.core.annotation.NameInMap("userGroupIds")
    private java.util.List<String> userGroupIds;

    @com.aliyun.core.annotation.NameInMap("userIds")
    private java.util.List<String> userIds;

    @com.aliyun.core.annotation.NameInMap("visibilityMode")
    private String visibilityMode;

    private SetKnowledgeBaseVisibilityResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.targetId = builder.targetId;
        this.targetType = builder.targetType;
        this.userGroupIds = builder.userGroupIds;
        this.userIds = builder.userIds;
        this.visibilityMode = builder.visibilityMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetKnowledgeBaseVisibilityResponseBody create() {
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
     * @return targetId
     */
    public String getTargetId() {
        return this.targetId;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    /**
     * @return userGroupIds
     */
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    /**
     * @return userIds
     */
    public java.util.List<String> getUserIds() {
        return this.userIds;
    }

    /**
     * @return visibilityMode
     */
    public String getVisibilityMode() {
        return this.visibilityMode;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private String targetId; 
        private String targetType; 
        private java.util.List<String> userGroupIds; 
        private java.util.List<String> userIds; 
        private String visibilityMode; 

        private Builder() {
        } 

        private Builder(SetKnowledgeBaseVisibilityResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.targetId = model.targetId;
            this.targetType = model.targetType;
            this.userGroupIds = model.userGroupIds;
            this.userIds = model.userIds;
            this.visibilityMode = model.visibilityMode;
        } 

        /**
         * <p>The status code.</p>
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
         * <p>The target ID, which varies based on the target type.</p>
         * <ul>
         * <li>If the type is period, specify the period ID.</li>
         * <li>If the type is objective, specify the objective ID.</li>
         * <li>If the type is kr, specify the keyResult ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>kb_001</p>
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            return this;
        }

        /**
         * <p>The type of the current permission. Valid values:</p>
         * <ul>
         * <li>period: period type</li>
         * <li>objective: objective type</li>
         * <li>kr: keyResult type</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>KB</p>
         */
        public Builder targetType(String targetType) {
            this.targetType = targetType;
            return this;
        }

        /**
         * <p>The collection of user groups.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;group-1&quot;]</p>
         */
        public Builder userGroupIds(java.util.List<String> userGroupIds) {
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * <p>The collection of users.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;10001&quot;]</p>
         */
        public Builder userIds(java.util.List<String> userIds) {
            this.userIds = userIds;
            return this;
        }

        /**
         * <p>The visibility scope mode.</p>
         * 
         * <strong>example:</strong>
         * <p>SPECIFIED</p>
         */
        public Builder visibilityMode(String visibilityMode) {
            this.visibilityMode = visibilityMode;
            return this;
        }

        public SetKnowledgeBaseVisibilityResponseBody build() {
            return new SetKnowledgeBaseVisibilityResponseBody(this);
        } 

    } 

}
