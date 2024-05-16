// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFCTriggerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFCTriggerResponseBody</p>
 */
public class DescribeFCTriggerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FCTrigger")
    private FCTrigger FCTrigger;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeFCTriggerResponseBody(Builder builder) {
        this.FCTrigger = builder.FCTrigger;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFCTriggerResponseBody create() {
        return builder().build();
    }

    /**
     * @return FCTrigger
     */
    public FCTrigger getFCTrigger() {
        return this.FCTrigger;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private FCTrigger FCTrigger; 
        private String requestId; 

        /**
         * The Function Compute trigger that you want to query.
         */
        public Builder FCTrigger(FCTrigger FCTrigger) {
            this.FCTrigger = FCTrigger;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFCTriggerResponseBody build() {
            return new DescribeFCTriggerResponseBody(this);
        } 

    } 

    public static class FCTrigger extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventMetaName")
        private String eventMetaName;

        @com.aliyun.core.annotation.NameInMap("EventMetaVersion")
        private String eventMetaVersion;

        @com.aliyun.core.annotation.NameInMap("Notes")
        private String notes;

        @com.aliyun.core.annotation.NameInMap("RoleARN")
        private String roleARN;

        @com.aliyun.core.annotation.NameInMap("SourceArn")
        private String sourceArn;

        @com.aliyun.core.annotation.NameInMap("TriggerARN")
        private String triggerARN;

        private FCTrigger(Builder builder) {
            this.eventMetaName = builder.eventMetaName;
            this.eventMetaVersion = builder.eventMetaVersion;
            this.notes = builder.notes;
            this.roleARN = builder.roleARN;
            this.sourceArn = builder.sourceArn;
            this.triggerARN = builder.triggerARN;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FCTrigger create() {
            return builder().build();
        }

        /**
         * @return eventMetaName
         */
        public String getEventMetaName() {
            return this.eventMetaName;
        }

        /**
         * @return eventMetaVersion
         */
        public String getEventMetaVersion() {
            return this.eventMetaVersion;
        }

        /**
         * @return notes
         */
        public String getNotes() {
            return this.notes;
        }

        /**
         * @return roleARN
         */
        public String getRoleARN() {
            return this.roleARN;
        }

        /**
         * @return sourceArn
         */
        public String getSourceArn() {
            return this.sourceArn;
        }

        /**
         * @return triggerARN
         */
        public String getTriggerARN() {
            return this.triggerARN;
        }

        public static final class Builder {
            private String eventMetaName; 
            private String eventMetaVersion; 
            private String notes; 
            private String roleARN; 
            private String sourceArn; 
            private String triggerARN; 

            /**
             * The name of the event.
             */
            public Builder eventMetaName(String eventMetaName) {
                this.eventMetaName = eventMetaName;
                return this;
            }

            /**
             * The version of the event.
             */
            public Builder eventMetaVersion(String eventMetaVersion) {
                this.eventMetaVersion = eventMetaVersion;
                return this;
            }

            /**
             * The remarks of the Function Compute trigger.
             */
            public Builder notes(String notes) {
                this.notes = notes;
                return this;
            }

            /**
             * The assigned Resource Access Management (RAM) role.
             */
            public Builder roleARN(String roleARN) {
                this.roleARN = roleARN;
                return this;
            }

            /**
             * The resources and filters for event listening.
             */
            public Builder sourceArn(String sourceArn) {
                this.sourceArn = sourceArn;
                return this;
            }

            /**
             * The trigger that corresponds to the Function Compute service.
             */
            public Builder triggerARN(String triggerARN) {
                this.triggerARN = triggerARN;
                return this;
            }

            public FCTrigger build() {
                return new FCTrigger(this);
            } 

        } 

    }
}
