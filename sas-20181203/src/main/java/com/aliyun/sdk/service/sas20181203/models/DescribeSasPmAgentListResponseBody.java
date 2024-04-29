// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSasPmAgentListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSasPmAgentListResponseBody</p>
 */
public class DescribeSasPmAgentListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SasPmAgentList")
    private java.util.List < SasPmAgentList> sasPmAgentList;

    private DescribeSasPmAgentListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sasPmAgentList = builder.sasPmAgentList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSasPmAgentListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sasPmAgentList
     */
    public java.util.List < SasPmAgentList> getSasPmAgentList() {
        return this.sasPmAgentList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SasPmAgentList> sasPmAgentList; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array that consists of the information about servers.
         */
        public Builder sasPmAgentList(java.util.List < SasPmAgentList> sasPmAgentList) {
            this.sasPmAgentList = sasPmAgentList;
            return this;
        }

        public DescribeSasPmAgentListResponseBody build() {
            return new DescribeSasPmAgentListResponseBody(this);
        } 

    } 

    public static class SasPmAgentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunAssistId")
        private String aliyunAssistId;

        @com.aliyun.core.annotation.NameInMap("AliyunMonitorId")
        private String aliyunMonitorId;

        @com.aliyun.core.annotation.NameInMap("AssistInstallResult")
        private Integer assistInstallResult;

        @com.aliyun.core.annotation.NameInMap("AssistInstallStatus")
        private Integer assistInstallStatus;

        @com.aliyun.core.annotation.NameInMap("MonitorInstallResult")
        private Integer monitorInstallResult;

        @com.aliyun.core.annotation.NameInMap("MonitorInstallStatus")
        private Integer monitorInstallStatus;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private SasPmAgentList(Builder builder) {
            this.aliyunAssistId = builder.aliyunAssistId;
            this.aliyunMonitorId = builder.aliyunMonitorId;
            this.assistInstallResult = builder.assistInstallResult;
            this.assistInstallStatus = builder.assistInstallStatus;
            this.monitorInstallResult = builder.monitorInstallResult;
            this.monitorInstallStatus = builder.monitorInstallStatus;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SasPmAgentList create() {
            return builder().build();
        }

        /**
         * @return aliyunAssistId
         */
        public String getAliyunAssistId() {
            return this.aliyunAssistId;
        }

        /**
         * @return aliyunMonitorId
         */
        public String getAliyunMonitorId() {
            return this.aliyunMonitorId;
        }

        /**
         * @return assistInstallResult
         */
        public Integer getAssistInstallResult() {
            return this.assistInstallResult;
        }

        /**
         * @return assistInstallStatus
         */
        public Integer getAssistInstallStatus() {
            return this.assistInstallStatus;
        }

        /**
         * @return monitorInstallResult
         */
        public Integer getMonitorInstallResult() {
            return this.monitorInstallResult;
        }

        /**
         * @return monitorInstallStatus
         */
        public Integer getMonitorInstallStatus() {
            return this.monitorInstallStatus;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String aliyunAssistId; 
            private String aliyunMonitorId; 
            private Integer assistInstallResult; 
            private Integer assistInstallStatus; 
            private Integer monitorInstallResult; 
            private Integer monitorInstallStatus; 
            private String uuid; 

            /**
             * The ID of Cloud Assistant.
             */
            public Builder aliyunAssistId(String aliyunAssistId) {
                this.aliyunAssistId = aliyunAssistId;
                return this;
            }

            /**
             * The ID of the CloudMonitor agent.
             */
            public Builder aliyunMonitorId(String aliyunMonitorId) {
                this.aliyunMonitorId = aliyunMonitorId;
                return this;
            }

            /**
             * The installation result of Cloud Assistant. Valid values:
             * <p>
             * 
             * *   **0**: SUCCESS
             * *   **1**: MISSING_PARAM
             * *   **2**: UNKNOWN_SYSTEM
             * *   **3**: DOWNLOAD_FAILED
             * *   **4**: INSTALL_FAILED
             */
            public Builder assistInstallResult(Integer assistInstallResult) {
                this.assistInstallResult = assistInstallResult;
                return this;
            }

            /**
             * The status of Cloud Assistant. Valid values:
             * <p>
             * 
             * *   **0**: installing
             * *   **1**: installed
             * *   **2**: installation failed
             * *   **3**: installation timed out
             */
            public Builder assistInstallStatus(Integer assistInstallStatus) {
                this.assistInstallStatus = assistInstallStatus;
                return this;
            }

            /**
             * The installation result of the CloudMonitor agent. Valid values:
             * <p>
             * 
             * *   **0**: failed
             * *   **1**: successful
             */
            public Builder monitorInstallResult(Integer monitorInstallResult) {
                this.monitorInstallResult = monitorInstallResult;
                return this;
            }

            /**
             * The status of the CloudMonitor agent. Valid values:
             * <p>
             * 
             * *   **0**: installation failed
             * *   **1**: installed
             */
            public Builder monitorInstallStatus(Integer monitorInstallStatus) {
                this.monitorInstallStatus = monitorInstallStatus;
                return this;
            }

            /**
             * The UUID of the server.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public SasPmAgentList build() {
                return new SasPmAgentList(this);
            } 

        } 

    }
}
