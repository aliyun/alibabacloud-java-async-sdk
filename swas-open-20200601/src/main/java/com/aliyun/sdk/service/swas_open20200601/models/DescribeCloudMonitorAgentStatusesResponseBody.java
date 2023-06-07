// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudMonitorAgentStatusesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudMonitorAgentStatusesResponseBody</p>
 */
public class DescribeCloudMonitorAgentStatusesResponseBody extends TeaModel {
    @NameInMap("InstanceStatusList")
    private java.util.List < InstanceStatusList> instanceStatusList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCloudMonitorAgentStatusesResponseBody(Builder builder) {
        this.instanceStatusList = builder.instanceStatusList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudMonitorAgentStatusesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceStatusList
     */
    public java.util.List < InstanceStatusList> getInstanceStatusList() {
        return this.instanceStatusList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < InstanceStatusList> instanceStatusList; 
        private String requestId; 

        /**
         * InstanceStatusList.
         */
        public Builder instanceStatusList(java.util.List < InstanceStatusList> instanceStatusList) {
            this.instanceStatusList = instanceStatusList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCloudMonitorAgentStatusesResponseBody build() {
            return new DescribeCloudMonitorAgentStatusesResponseBody(this);
        } 

    } 

    public static class InstanceStatusList extends TeaModel {
        @NameInMap("AutoInstall")
        private Boolean autoInstall;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Status")
        private String status;

        private InstanceStatusList(Builder builder) {
            this.autoInstall = builder.autoInstall;
            this.instanceId = builder.instanceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceStatusList create() {
            return builder().build();
        }

        /**
         * @return autoInstall
         */
        public Boolean getAutoInstall() {
            return this.autoInstall;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean autoInstall; 
            private String instanceId; 
            private String status; 

            /**
             * AutoInstall.
             */
            public Builder autoInstall(Boolean autoInstall) {
                this.autoInstall = autoInstall;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public InstanceStatusList build() {
                return new InstanceStatusList(this);
            } 

        } 

    }
}
