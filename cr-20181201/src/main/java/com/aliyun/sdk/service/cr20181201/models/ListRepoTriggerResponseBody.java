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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
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
         * Triggers.
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
             * RepoEvent.
             */
            public Builder repoEvent(String repoEvent) {
                this.repoEvent = repoEvent;
                return this;
            }

            /**
             * TriggerId.
             */
            public Builder triggerId(String triggerId) {
                this.triggerId = triggerId;
                return this;
            }

            /**
             * TriggerName.
             */
            public Builder triggerName(String triggerName) {
                this.triggerName = triggerName;
                return this;
            }

            /**
             * TriggerTag.
             */
            public Builder triggerTag(String triggerTag) {
                this.triggerTag = triggerTag;
                return this;
            }

            /**
             * TriggerType.
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * TriggerUrl.
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
