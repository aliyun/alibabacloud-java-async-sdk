// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link GetSchedulerInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetSchedulerInfoResponseBody</p>
 */
public class GetSchedulerInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SchedInfo")
    private java.util.List<SchedInfo> schedInfo;

    private GetSchedulerInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.schedInfo = builder.schedInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSchedulerInfoResponseBody create() {
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
     * @return schedInfo
     */
    public java.util.List<SchedInfo> getSchedInfo() {
        return this.schedInfo;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SchedInfo> schedInfo; 

        private Builder() {
        } 

        private Builder(GetSchedulerInfoResponseBody model) {
            this.requestId = model.requestId;
            this.schedInfo = model.schedInfo;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BBC2F93D-003A-49C4-850C-B826EECF****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The settings of the scheduler.</p>
         */
        public Builder schedInfo(java.util.List<SchedInfo> schedInfo) {
            this.schedInfo = schedInfo;
            return this;
        }

        public GetSchedulerInfoResponseBody build() {
            return new GetSchedulerInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSchedulerInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetSchedulerInfoResponseBody</p>
     */
    public static class SchedInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Configuration")
        private String configuration;

        @com.aliyun.core.annotation.NameInMap("SchedName")
        private String schedName;

        private SchedInfo(Builder builder) {
            this.configuration = builder.configuration;
            this.schedName = builder.schedName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchedInfo create() {
            return builder().build();
        }

        /**
         * @return configuration
         */
        public String getConfiguration() {
            return this.configuration;
        }

        /**
         * @return schedName
         */
        public String getSchedName() {
            return this.schedName;
        }

        public static final class Builder {
            private String configuration; 
            private String schedName; 

            private Builder() {
            } 

            private Builder(SchedInfo model) {
                this.configuration = model.configuration;
                this.schedName = model.schedName;
            } 

            /**
             * <p>The detailed settings of the scheduler.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;AclInfo&quot;:[{&quot;AclEnable&quot;: false,&quot;UntrackUser&quot;: [],&quot;User&quot;: [],&quot;QueueName&quot;: &quot;workq&quot;}],&quot;JobHistory&quot;: &quot;&quot;,&quot;SchedIteration&quot;: &quot;60&quot;,&quot;QueueResource&quot;: [{&quot;UntrackUser&quot;: [],&quot;User&quot;: [],&quot;QueueName&quot;: &quot;workq&quot;}]}</p>
             */
            public Builder configuration(String configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * <p>The type of the scheduler.</p>
             * 
             * <strong>example:</strong>
             * <p>pbs</p>
             */
            public Builder schedName(String schedName) {
                this.schedName = schedName;
                return this;
            }

            public SchedInfo build() {
                return new SchedInfo(this);
            } 

        } 

    }
}
