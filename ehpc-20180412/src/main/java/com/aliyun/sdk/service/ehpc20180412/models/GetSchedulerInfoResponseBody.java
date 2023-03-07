// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSchedulerInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetSchedulerInfoResponseBody</p>
 */
public class GetSchedulerInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SchedInfo")
    private java.util.List < SchedInfo> schedInfo;

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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return schedInfo
     */
    public java.util.List < SchedInfo> getSchedInfo() {
        return this.schedInfo;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SchedInfo> schedInfo; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The settings of the scheduler.
         */
        public Builder schedInfo(java.util.List < SchedInfo> schedInfo) {
            this.schedInfo = schedInfo;
            return this;
        }

        public GetSchedulerInfoResponseBody build() {
            return new GetSchedulerInfoResponseBody(this);
        } 

    } 

    public static class SchedInfo extends TeaModel {
        @NameInMap("Configuration")
        private String configuration;

        @NameInMap("SchedName")
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

            /**
             * The detailed settings of the scheduler.
             */
            public Builder configuration(String configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * The type of the scheduler.
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
