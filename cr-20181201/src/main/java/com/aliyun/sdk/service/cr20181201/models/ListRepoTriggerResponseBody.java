// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRepoTriggerResponseBody} extends {@link TeaModel}
 *
 * <p>ListRepoTriggerResponseBody</p>
 */
public class ListRepoTriggerResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Triggers")
    private java.util.List < Triggers> triggers;

    private ListRepoTriggerResponseBody(Builder builder) {
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
        this.triggers = builder.triggers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRepoTriggerResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return triggers
     */
    public java.util.List < Triggers> getTriggers() {
        return this.triggers;
    }

    public static final class Builder {
        private String code; 
        private Boolean isSuccess; 
        private String requestId; 
        private java.util.List < Triggers> triggers; 

        /**
         * The return value.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   `true`: The request is successful.
         * *   `false`: The request fails.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The triggers of the repository.
         */
        public Builder triggers(java.util.List < Triggers> triggers) {
            this.triggers = triggers;
            return this;
        }

        public ListRepoTriggerResponseBody build() {
            return new ListRepoTriggerResponseBody(this);
        } 

    } 

    public static class Triggers extends TeaModel {
        @NameInMap("RepoEvent")
        private String repoEvent;

        @NameInMap("TriggerId")
        private String triggerId;

        @NameInMap("TriggerName")
        private String triggerName;

        @NameInMap("TriggerTag")
        private String triggerTag;

        @NameInMap("TriggerType")
        private String triggerType;

        @NameInMap("TriggerUrl")
        private String triggerUrl;

        private Triggers(Builder builder) {
            this.repoEvent = builder.repoEvent;
            this.triggerId = builder.triggerId;
            this.triggerName = builder.triggerName;
            this.triggerTag = builder.triggerTag;
            this.triggerType = builder.triggerType;
            this.triggerUrl = builder.triggerUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Triggers create() {
            return builder().build();
        }

        /**
         * @return repoEvent
         */
        public String getRepoEvent() {
            return this.repoEvent;
        }

        /**
         * @return triggerId
         */
        public String getTriggerId() {
            return this.triggerId;
        }

        /**
         * @return triggerName
         */
        public String getTriggerName() {
            return this.triggerName;
        }

        /**
         * @return triggerTag
         */
        public String getTriggerTag() {
            return this.triggerTag;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        /**
         * @return triggerUrl
         */
        public String getTriggerUrl() {
            return this.triggerUrl;
        }

        public static final class Builder {
            private String repoEvent; 
            private String triggerId; 
            private String triggerName; 
            private String triggerTag; 
            private String triggerType; 
            private String triggerUrl; 

            /**
             * The type of the event that activates the trigger. Valid values:
             * <p>
             * 
             * *   `BUILD_SUCCESS`: The trigger is activated when an image building task is successful.
             * *   `BUILD_Fail`: The trigger is activated when an image building task fails.
             */
            public Builder repoEvent(String repoEvent) {
                this.repoEvent = repoEvent;
                return this;
            }

            /**
             * The ID of the trigger.
             */
            public Builder triggerId(String triggerId) {
                this.triggerId = triggerId;
                return this;
            }

            /**
             * The name of the trigger.
             */
            public Builder triggerName(String triggerName) {
                this.triggerName = triggerName;
                return this;
            }

            /**
             * The image tag based on which the trigger is set.
             */
            public Builder triggerTag(String triggerTag) {
                this.triggerTag = triggerTag;
                return this;
            }

            /**
             * The type of the trigger. Valid values:
             * <p>
             * 
             * *   `ALL`: a trigger that supports both tags and regular expressions.
             * *   `TAG_LISTTAG`: a tag-based trigger.
             * *   `TAG_REG_EXP`: a regular expression-based trigger.
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * The URL of the trigger.
             */
            public Builder triggerUrl(String triggerUrl) {
                this.triggerUrl = triggerUrl;
                return this;
            }

            public Triggers build() {
                return new Triggers(this);
            } 

        } 

    }
}
