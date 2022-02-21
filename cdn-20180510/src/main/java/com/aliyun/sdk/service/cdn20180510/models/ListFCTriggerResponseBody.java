// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFCTriggerResponseBody} extends {@link TeaModel}
 *
 * <p>ListFCTriggerResponseBody</p>
 */
public class ListFCTriggerResponseBody extends TeaModel {
    @NameInMap("FCTriggers")
    private java.util.List < FCTriggers> FCTriggers;

    @NameInMap("RequestId")
    private String requestId;

    private ListFCTriggerResponseBody(Builder builder) {
        this.FCTriggers = builder.FCTriggers;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFCTriggerResponseBody create() {
        return builder().build();
    }

    /**
     * @return FCTriggers
     */
    public java.util.List < FCTriggers> getFCTriggers() {
        return this.FCTriggers;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < FCTriggers> FCTriggers; 
        private String requestId; 

        /**
         * FCTriggers.
         */
        public Builder FCTriggers(java.util.List < FCTriggers> FCTriggers) {
            this.FCTriggers = FCTriggers;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFCTriggerResponseBody build() {
            return new ListFCTriggerResponseBody(this);
        } 

    } 

    public static class FCTriggers extends TeaModel {
        @NameInMap("EventMetaName")
        private String eventMetaName;

        @NameInMap("EventMetaVersion")
        private String eventMetaVersion;

        @NameInMap("Notes")
        private String notes;

        @NameInMap("RoleARN")
        private String roleARN;

        @NameInMap("SourceArn")
        private String sourceArn;

        @NameInMap("TriggerARN")
        private String triggerARN;

        private FCTriggers(Builder builder) {
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

        public static FCTriggers create() {
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
             * EventMetaName.
             */
            public Builder eventMetaName(String eventMetaName) {
                this.eventMetaName = eventMetaName;
                return this;
            }

            /**
             * EventMetaVersion.
             */
            public Builder eventMetaVersion(String eventMetaVersion) {
                this.eventMetaVersion = eventMetaVersion;
                return this;
            }

            /**
             * Notes.
             */
            public Builder notes(String notes) {
                this.notes = notes;
                return this;
            }

            /**
             * RoleARN.
             */
            public Builder roleARN(String roleARN) {
                this.roleARN = roleARN;
                return this;
            }

            /**
             * SourceArn.
             */
            public Builder sourceArn(String sourceArn) {
                this.sourceArn = sourceArn;
                return this;
            }

            /**
             * TriggerARN.
             */
            public Builder triggerARN(String triggerARN) {
                this.triggerARN = triggerARN;
                return this;
            }

            public FCTriggers build() {
                return new FCTriggers(this);
            } 

        } 

    }
}
