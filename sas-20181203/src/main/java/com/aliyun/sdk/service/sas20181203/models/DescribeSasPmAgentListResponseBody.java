// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSasPmAgentListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSasPmAgentListResponseBody</p>
 */
public class DescribeSasPmAgentListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SasPmAgentList")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SasPmAgentList.
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
        @NameInMap("AliyunAssistId")
        private String aliyunAssistId;

        @NameInMap("AliyunMonitorId")
        private String aliyunMonitorId;

        @NameInMap("AssistInstallResult")
        private Integer assistInstallResult;

        @NameInMap("AssistInstallStatus")
        private Integer assistInstallStatus;

        @NameInMap("MonitorInstallResult")
        private Integer monitorInstallResult;

        @NameInMap("MonitorInstallStatus")
        private Integer monitorInstallStatus;

        @NameInMap("Uuid")
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
             * 云助手全局唯一Id
             */
            public Builder aliyunAssistId(String aliyunAssistId) {
                this.aliyunAssistId = aliyunAssistId;
                return this;
            }

            /**
             * 云监控全局唯一Id
             */
            public Builder aliyunMonitorId(String aliyunMonitorId) {
                this.aliyunMonitorId = aliyunMonitorId;
                return this;
            }

            /**
             * AssistInstallResult.
             */
            public Builder assistInstallResult(Integer assistInstallResult) {
                this.assistInstallResult = assistInstallResult;
                return this;
            }

            /**
             * AssistInstallStatus.
             */
            public Builder assistInstallStatus(Integer assistInstallStatus) {
                this.assistInstallStatus = assistInstallStatus;
                return this;
            }

            /**
             * MonitorInstallResult.
             */
            public Builder monitorInstallResult(Integer monitorInstallResult) {
                this.monitorInstallResult = monitorInstallResult;
                return this;
            }

            /**
             * MonitorInstallStatus.
             */
            public Builder monitorInstallStatus(Integer monitorInstallStatus) {
                this.monitorInstallStatus = monitorInstallStatus;
                return this;
            }

            /**
             * 机器uuid
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
