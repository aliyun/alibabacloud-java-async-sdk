// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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
         * <p>Return value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether the API is called. Valid values:

-"true": The API is called.

-"false": failed to call the API.</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>Request ID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Trigger list</p>
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
        @NameInMap("TriggerName")
        private String triggerName;

        @NameInMap("RepoEvent")
        private String repoEvent;

        @NameInMap("TriggerId")
        private String triggerId;

        @NameInMap("TriggerUrl")
        private String triggerUrl;

        @NameInMap("TriggerType")
        private String triggerType;

        @NameInMap("TriggerTag")
        private String triggerTag;


        private Triggers(Builder builder) {
            this.triggerName = builder.triggerName;
            this.repoEvent = builder.repoEvent;
            this.triggerId = builder.triggerId;
            this.triggerUrl = builder.triggerUrl;
            this.triggerType = builder.triggerType;
            this.triggerTag = builder.triggerTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Triggers create() {
            return builder().build();
        }

        /**
         * @return triggerName
         */
        public String getTriggerName() {
            return this.triggerName;
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
         * @return triggerUrl
         */
        public String getTriggerUrl() {
            return this.triggerUrl;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        /**
         * @return triggerTag
         */
        public String getTriggerTag() {
            return this.triggerTag;
        }

        public static final class Builder {
            private String triggerName; 
            private String repoEvent; 
            private String triggerId; 
            private String triggerUrl; 
            private String triggerType; 
            private String triggerTag; 

            /**
             * <p>Trigger name</p>
             */
            public Builder triggerName(String triggerName) {
                this.triggerName = triggerName;
                return this;
            }

            /**
             * <p>The type of the trigger event. Valid values:

-"Build_success ": triggered successfully.

-"Build_fail ": Trigger failed</p>
             */
            public Builder repoEvent(String repoEvent) {
                this.repoEvent = repoEvent;
                return this;
            }

            /**
             * <p>Trigger ID</p>
             */
            public Builder triggerId(String triggerId) {
                this.triggerId = triggerId;
                return this;
            }

            /**
             * <p>Trigger URL</p>
             */
            public Builder triggerUrl(String triggerUrl) {
                this.triggerUrl = triggerUrl;
                return this;
            }

            /**
             * <p>The trigger type. Valid values:

-"ALL": trigger all

-"Tag_listtag": Trigger

-"Tag_reg_exp ": expression trigger</p>
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * <p>The version of the image that triggers the trigger.</p>
             */
            public Builder triggerTag(String triggerTag) {
                this.triggerTag = triggerTag;
                return this;
            }

            public Triggers build() {
                return new Triggers(this);
            } 

        } 

    }
}
