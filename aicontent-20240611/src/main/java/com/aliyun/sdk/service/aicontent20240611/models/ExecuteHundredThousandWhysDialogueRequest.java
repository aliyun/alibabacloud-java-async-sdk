// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ExecuteHundredThousandWhysDialogueRequest} extends {@link RequestModel}
 *
 * <p>ExecuteHundredThousandWhysDialogueRequest</p>
 */
public class ExecuteHundredThousandWhysDialogueRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ageGroup")
    private String ageGroup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("chatId")
    private String chatId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("deviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("macAddress")
    @com.aliyun.core.annotation.Validation(required = true)
    private String macAddress;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("messages")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Messages> messages;

    private ExecuteHundredThousandWhysDialogueRequest(Builder builder) {
        super(builder);
        this.ageGroup = builder.ageGroup;
        this.chatId = builder.chatId;
        this.deviceId = builder.deviceId;
        this.macAddress = builder.macAddress;
        this.messages = builder.messages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteHundredThousandWhysDialogueRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ageGroup
     */
    public String getAgeGroup() {
        return this.ageGroup;
    }

    /**
     * @return chatId
     */
    public String getChatId() {
        return this.chatId;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return macAddress
     */
    public String getMacAddress() {
        return this.macAddress;
    }

    /**
     * @return messages
     */
    public java.util.List<Messages> getMessages() {
        return this.messages;
    }

    public static final class Builder extends Request.Builder<ExecuteHundredThousandWhysDialogueRequest, Builder> {
        private String ageGroup; 
        private String chatId; 
        private String deviceId; 
        private String macAddress; 
        private java.util.List<Messages> messages; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteHundredThousandWhysDialogueRequest request) {
            super(request);
            this.ageGroup = request.ageGroup;
            this.chatId = request.chatId;
            this.deviceId = request.deviceId;
            this.macAddress = request.macAddress;
            this.messages = request.messages;
        } 

        /**
         * ageGroup.
         */
        public Builder ageGroup(String ageGroup) {
            this.putBodyParameter("ageGroup", ageGroup);
            this.ageGroup = ageGroup;
            return this;
        }

        /**
         * chatId.
         */
        public Builder chatId(String chatId) {
            this.putBodyParameter("chatId", chatId);
            this.chatId = chatId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>700d4d9411efbe6e0</p>
         */
        public Builder deviceId(String deviceId) {
            this.putBodyParameter("deviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>00:1A:2B:3C:4D:5E</p>
         */
        public Builder macAddress(String macAddress) {
            this.putBodyParameter("macAddress", macAddress);
            this.macAddress = macAddress;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder messages(java.util.List<Messages> messages) {
            this.putBodyParameter("messages", messages);
            this.messages = messages;
            return this;
        }

        @Override
        public ExecuteHundredThousandWhysDialogueRequest build() {
            return new ExecuteHundredThousandWhysDialogueRequest(this);
        } 

    } 

    /**
     * 
     * {@link ExecuteHundredThousandWhysDialogueRequest} extends {@link TeaModel}
     *
     * <p>ExecuteHundredThousandWhysDialogueRequest</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        @com.aliyun.core.annotation.Validation(required = true)
        private String content;

        @com.aliyun.core.annotation.NameInMap("role")
        @com.aliyun.core.annotation.Validation(required = true)
        private String role;

        private Messages(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String content; 
            private String role; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.content = model.content;
                this.role = model.role;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
}
