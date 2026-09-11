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
 * {@link GetScheduledTaskPushOptionsResponseBody} extends {@link TeaModel}
 *
 * <p>GetScheduledTaskPushOptionsResponseBody</p>
 */
public class GetScheduledTaskPushOptionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("channels")
    private java.util.List<Channels> channels;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("emptyHint")
    private String emptyHint;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetScheduledTaskPushOptionsResponseBody(Builder builder) {
        this.channels = builder.channels;
        this.code = builder.code;
        this.emptyHint = builder.emptyHint;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScheduledTaskPushOptionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channels
     */
    public java.util.List<Channels> getChannels() {
        return this.channels;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return emptyHint
     */
    public String getEmptyHint() {
        return this.emptyHint;
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

    public static final class Builder {
        private java.util.List<Channels> channels; 
        private String code; 
        private String emptyHint; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetScheduledTaskPushOptionsResponseBody model) {
            this.channels = model.channels;
            this.code = model.code;
            this.emptyHint = model.emptyHint;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of notification channels.</p>
         */
        public Builder channels(java.util.List<Channels> channels) {
            this.channels = channels;
            return this;
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
         * <p>The prompt displayed when no third-party accounts are bound.</p>
         * 
         * <strong>example:</strong>
         * <p>No push channels available</p>
         */
        public Builder emptyHint(String emptyHint) {
            this.emptyHint = emptyHint;
            return this;
        }

        /**
         * <p>The prompt message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
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

        public GetScheduledTaskPushOptionsResponseBody build() {
            return new GetScheduledTaskPushOptionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetScheduledTaskPushOptionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetScheduledTaskPushOptionsResponseBody</p>
     */
    public static class ImGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("imGroupId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String imGroupId;

        @com.aliyun.core.annotation.NameInMap("imGroupName")
        private String imGroupName;

        @com.aliyun.core.annotation.NameInMap("mappingId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long mappingId;

        private ImGroups(Builder builder) {
            this.imGroupId = builder.imGroupId;
            this.imGroupName = builder.imGroupName;
            this.mappingId = builder.mappingId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImGroups create() {
            return builder().build();
        }

        /**
         * @return imGroupId
         */
        public String getImGroupId() {
            return this.imGroupId;
        }

        /**
         * @return imGroupName
         */
        public String getImGroupName() {
            return this.imGroupName;
        }

        /**
         * @return mappingId
         */
        public Long getMappingId() {
            return this.mappingId;
        }

        public static final class Builder {
            private String imGroupId; 
            private String imGroupName; 
            private Long mappingId; 

            private Builder() {
            } 

            private Builder(ImGroups model) {
                this.imGroupId = model.imGroupId;
                this.imGroupName = model.imGroupName;
                this.mappingId = model.mappingId;
            } 

            /**
             * <p>The external IM group ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cidExample</p>
             */
            public Builder imGroupId(String imGroupId) {
                this.imGroupId = imGroupId;
                return this;
            }

            /**
             * <p>The external IM group name.</p>
             * 
             * <strong>example:</strong>
             * <p>Project collaboration group</p>
             */
            public Builder imGroupName(String imGroupName) {
                this.imGroupName = imGroupName;
                return this;
            }

            /**
             * <p>The binding record ID of the IM group.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>101</p>
             */
            public Builder mappingId(Long mappingId) {
                this.mappingId = mappingId;
                return this;
            }

            public ImGroups build() {
                return new ImGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScheduledTaskPushOptionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetScheduledTaskPushOptionsResponseBody</p>
     */
    public static class Methods extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("disabledReason")
        private String disabledReason;

        @com.aliyun.core.annotation.NameInMap("enabled")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("method")
        @com.aliyun.core.annotation.Validation(required = true)
        private String method;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        private Methods(Builder builder) {
            this.disabledReason = builder.disabledReason;
            this.enabled = builder.enabled;
            this.method = builder.method;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Methods create() {
            return builder().build();
        }

        /**
         * @return disabledReason
         */
        public String getDisabledReason() {
            return this.disabledReason;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String disabledReason; 
            private Boolean enabled; 
            private String method; 
            private String name; 

            private Builder() {
            } 

            private Builder(Methods model) {
                this.disabledReason = model.disabledReason;
                this.enabled = model.enabled;
                this.method = model.method;
                this.name = model.name;
            } 

            /**
             * <p>The reason why the option is grayed out.</p>
             * 
             * <strong>example:</strong>
             * <p>No push channel is bound</p>
             */
            public Builder disabledReason(String disabledReason) {
                this.disabledReason = disabledReason;
                return this;
            }

            /**
             * <p>The feature switch. This parameter is optional when type is set to web_search.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The method.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>channel_bot</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The name.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Group chatbot</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Methods build() {
                return new Methods(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScheduledTaskPushOptionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetScheduledTaskPushOptionsResponseBody</p>
     */
    public static class Channels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("channelName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String channelName;

        @com.aliyun.core.annotation.NameInMap("channelType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String channelType;

        @com.aliyun.core.annotation.NameInMap("imGroups")
        private java.util.List<ImGroups> imGroups;

        @com.aliyun.core.annotation.NameInMap("methods")
        private java.util.List<Methods> methods;

        private Channels(Builder builder) {
            this.channelName = builder.channelName;
            this.channelType = builder.channelType;
            this.imGroups = builder.imGroups;
            this.methods = builder.methods;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Channels create() {
            return builder().build();
        }

        /**
         * @return channelName
         */
        public String getChannelName() {
            return this.channelName;
        }

        /**
         * @return channelType
         */
        public String getChannelType() {
            return this.channelType;
        }

        /**
         * @return imGroups
         */
        public java.util.List<ImGroups> getImGroups() {
            return this.imGroups;
        }

        /**
         * @return methods
         */
        public java.util.List<Methods> getMethods() {
            return this.methods;
        }

        public static final class Builder {
            private String channelName; 
            private String channelType; 
            private java.util.List<ImGroups> imGroups; 
            private java.util.List<Methods> methods; 

            private Builder() {
            } 

            private Builder(Channels model) {
                this.channelName = model.channelName;
                this.channelType = model.channelType;
                this.imGroups = model.imGroups;
                this.methods = model.methods;
            } 

            /**
             * <p>The channel name.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DingTalk</p>
             */
            public Builder channelName(String channelName) {
                this.channelName = channelName;
                return this;
            }

            /**
             * <p>The notification method. Valid values:</p>
             * <ul>
             * <li><strong>hdm_alarm_sms</strong>: SMS.</li>
             * <li><strong>dingtalk</strong>: DingTalk chatbot.</li>
             * <li><strong>hdm_alarm_sms_and_email</strong>: SMS and email.</li>
             * <li><strong>hdm_alarm_sms,dingtalk</strong>: SMS and DingTalk chatbot.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DINGTALK</p>
             */
            public Builder channelType(String channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * <p>The optional IM groups bound to this channel for the collaboration group. This value is empty when querying personal tasks.</p>
             */
            public Builder imGroups(java.util.List<ImGroups> imGroups) {
                this.imGroups = imGroups;
                return this;
            }

            /**
             * <p>The supported methods: HEAD, GET, POST, PUT, DELETE, PATCH, OPTIONS.</p>
             */
            public Builder methods(java.util.List<Methods> methods) {
                this.methods = methods;
                return this;
            }

            public Channels build() {
                return new Channels(this);
            } 

        } 

    }
}
