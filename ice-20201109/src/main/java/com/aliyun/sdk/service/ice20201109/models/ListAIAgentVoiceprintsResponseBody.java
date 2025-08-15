// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListAIAgentVoiceprintsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAIAgentVoiceprintsResponseBody</p>
 */
public class ListAIAgentVoiceprintsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("Voiceprints")
    private java.util.List<Voiceprints> voiceprints;

    private ListAIAgentVoiceprintsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.voiceprints = builder.voiceprints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAIAgentVoiceprintsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return voiceprints
     */
    public java.util.List<Voiceprints> getVoiceprints() {
        return this.voiceprints;
    }

    public static final class Builder {
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<Voiceprints> voiceprints; 

        private Builder() {
        } 

        private Builder(ListAIAgentVoiceprintsResponseBody model) {
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.voiceprints = model.voiceprints;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Voiceprints.
         */
        public Builder voiceprints(java.util.List<Voiceprints> voiceprints) {
            this.voiceprints = voiceprints;
            return this;
        }

        public ListAIAgentVoiceprintsResponseBody build() {
            return new ListAIAgentVoiceprintsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAIAgentVoiceprintsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIAgentVoiceprintsResponseBody</p>
     */
    public static class Voiceprints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("VoiceprintId")
        private String voiceprintId;

        private Voiceprints(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.voiceprintId = builder.voiceprintId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Voiceprints create() {
            return builder().build();
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return voiceprintId
         */
        public String getVoiceprintId() {
            return this.voiceprintId;
        }

        public static final class Builder {
            private String gmtCreate; 
            private String gmtModified; 
            private String voiceprintId; 

            private Builder() {
            } 

            private Builder(Voiceprints model) {
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.voiceprintId = model.voiceprintId;
            } 

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * VoiceprintId.
             */
            public Builder voiceprintId(String voiceprintId) {
                this.voiceprintId = voiceprintId;
                return this;
            }

            public Voiceprints build() {
                return new Voiceprints(this);
            } 

        } 

    }
}
