// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAScriptsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAScriptsResponseBody</p>
 */
public class CreateAScriptsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AScriptIds")
    private java.util.List < AScriptIds> aScriptIds;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAScriptsResponseBody(Builder builder) {
        this.aScriptIds = builder.aScriptIds;
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAScriptsResponseBody create() {
        return builder().build();
    }

    /**
     * @return aScriptIds
     */
    public java.util.List < AScriptIds> getAScriptIds() {
        return this.aScriptIds;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AScriptIds> aScriptIds; 
        private String jobId; 
        private String requestId; 

        /**
         * The AScript rule IDs.
         */
        public Builder aScriptIds(java.util.List < AScriptIds> aScriptIds) {
            this.aScriptIds = aScriptIds;
            return this;
        }

        /**
         * The asynchronous task ID.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAScriptsResponseBody build() {
            return new CreateAScriptsResponseBody(this);
        } 

    } 

    public static class AScriptIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AScriptId")
        private String aScriptId;

        private AScriptIds(Builder builder) {
            this.aScriptId = builder.aScriptId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AScriptIds create() {
            return builder().build();
        }

        /**
         * @return aScriptId
         */
        public String getAScriptId() {
            return this.aScriptId;
        }

        public static final class Builder {
            private String aScriptId; 

            /**
             * The AScript rule ID.
             */
            public Builder aScriptId(String aScriptId) {
                this.aScriptId = aScriptId;
                return this;
            }

            public AScriptIds build() {
                return new AScriptIds(this);
            } 

        } 

    }
}
