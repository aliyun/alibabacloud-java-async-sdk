// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link ListRepoTriggerResponseBody} extends {@link TeaModel}
 *
 * <p>ListRepoTriggerResponseBody</p>
 */
public class ListRepoTriggerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Triggers")
    private java.util.List<Triggers> triggers;

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
    public java.util.List<Triggers> getTriggers() {
        return this.triggers;
    }

    public static final class Builder {
        private String code; 
        private Boolean isSuccess; 
        private String requestId; 
        private java.util.List<Triggers> triggers; 

        private Builder() {
        } 

        private Builder(ListRepoTriggerResponseBody model) {
            this.code = model.code;
            this.isSuccess = model.isSuccess;
            this.requestId = model.requestId;
            this.triggers = model.triggers;
        } 

        /**
         * <p>The return value.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request is successful.</li>
         * <li><code>false</code>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2CA76D52-A8F0-4D0B-854E-FBD9F6C99049</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The triggers of the repository.</p>
         */
        public Builder triggers(java.util.List<Triggers> triggers) {
            this.triggers = triggers;
            return this;
        }

        public ListRepoTriggerResponseBody build() {
            return new ListRepoTriggerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRepoTriggerResponseBody} extends {@link TeaModel}
     *
     * <p>ListRepoTriggerResponseBody</p>
     */
    public static class Triggers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RepoEvent")
        private String repoEvent;

        @com.aliyun.core.annotation.NameInMap("TriggerId")
        private String triggerId;

        @com.aliyun.core.annotation.NameInMap("TriggerName")
        private String triggerName;

        @com.aliyun.core.annotation.NameInMap("TriggerTag")
        private String triggerTag;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private String triggerType;

        @com.aliyun.core.annotation.NameInMap("TriggerUrl")
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

            private Builder() {
            } 

            private Builder(Triggers model) {
                this.repoEvent = model.repoEvent;
                this.triggerId = model.triggerId;
                this.triggerName = model.triggerName;
                this.triggerTag = model.triggerTag;
                this.triggerType = model.triggerType;
                this.triggerUrl = model.triggerUrl;
            } 

            /**
             * <p>The type of the event that activates the trigger. Valid values:</p>
             * <ul>
             * <li><code>BUILD_SUCCESS</code>: The trigger is activated when an image building task is successful.</li>
             * <li><code>BUILD_Fail</code>: The trigger is activated when an image building task fails.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BUILD_SUCCESS</p>
             */
            public Builder repoEvent(String repoEvent) {
                this.repoEvent = repoEvent;
                return this;
            }

            /**
             * <p>The ID of the trigger.</p>
             * 
             * <strong>example:</strong>
             * <p>crw-vriyql9eq7ep****</p>
             */
            public Builder triggerId(String triggerId) {
                this.triggerId = triggerId;
                return this;
            }

            /**
             * <p>The name of the trigger.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder triggerName(String triggerName) {
                this.triggerName = triggerName;
                return this;
            }

            /**
             * <p>The image tag based on which the trigger is set.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder triggerTag(String triggerTag) {
                this.triggerTag = triggerTag;
                return this;
            }

            /**
             * <p>The type of the trigger. Valid values:</p>
             * <ul>
             * <li><code>ALL</code>: a trigger that supports both tags and regular expressions.</li>
             * <li><code>TAG_LISTTAG</code>: a tag-based trigger.</li>
             * <li><code>TAG_REG_EXP</code>: a regular expression-based trigger.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALL</p>
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * <p>The URL of the trigger.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.test.com">https://www.test.com</a></p>
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
