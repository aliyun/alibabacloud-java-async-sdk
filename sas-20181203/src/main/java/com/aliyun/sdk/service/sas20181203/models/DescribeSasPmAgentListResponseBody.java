// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeSasPmAgentListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSasPmAgentListResponseBody</p>
 */
public class DescribeSasPmAgentListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SasPmAgentList")
    private java.util.List<SasPmAgentList> sasPmAgentList;

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
    public java.util.List<SasPmAgentList> getSasPmAgentList() {
        return this.sasPmAgentList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SasPmAgentList> sasPmAgentList; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8EF3ACC2-9400-5B64-B72D-4A1D35113750</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of the information about servers.</p>
         */
        public Builder sasPmAgentList(java.util.List<SasPmAgentList> sasPmAgentList) {
            this.sasPmAgentList = sasPmAgentList;
            return this;
        }

        public DescribeSasPmAgentListResponseBody build() {
            return new DescribeSasPmAgentListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSasPmAgentListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSasPmAgentListResponseBody</p>
     */
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
             * <p>The ID of Cloud Assistant.</p>
             * 
             * <strong>example:</strong>
             * <p>mi-hz034jn***yxhc0</p>
             */
            public Builder aliyunAssistId(String aliyunAssistId) {
                this.aliyunAssistId = aliyunAssistId;
                return this;
            }

            /**
             * <p>The ID of the CloudMonitor agent.</p>
             * 
             * <strong>example:</strong>
             * <p>5d5ef6be-54ff-11ed-82cf-8f01475e****</p>
             */
            public Builder aliyunMonitorId(String aliyunMonitorId) {
                this.aliyunMonitorId = aliyunMonitorId;
                return this;
            }

            /**
             * <p>The installation result of Cloud Assistant. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: SUCCESS</li>
             * <li><strong>1</strong>: MISSING_PARAM</li>
             * <li><strong>2</strong>: UNKNOWN_SYSTEM</li>
             * <li><strong>3</strong>: DOWNLOAD_FAILED</li>
             * <li><strong>4</strong>: INSTALL_FAILED</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder assistInstallResult(Integer assistInstallResult) {
                this.assistInstallResult = assistInstallResult;
                return this;
            }

            /**
             * <p>The status of Cloud Assistant. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: installing</li>
             * <li><strong>1</strong>: installed</li>
             * <li><strong>2</strong>: installation failed</li>
             * <li><strong>3</strong>: installation timed out</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder assistInstallStatus(Integer assistInstallStatus) {
                this.assistInstallStatus = assistInstallStatus;
                return this;
            }

            /**
             * <p>The installation result of the CloudMonitor agent. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: failed</li>
             * <li><strong>1</strong>: successful</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder monitorInstallResult(Integer monitorInstallResult) {
                this.monitorInstallResult = monitorInstallResult;
                return this;
            }

            /**
             * <p>The status of the CloudMonitor agent. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: installation failed</li>
             * <li><strong>1</strong>: installed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder monitorInstallStatus(Integer monitorInstallStatus) {
                this.monitorInstallStatus = monitorInstallStatus;
                return this;
            }

            /**
             * <p>The UUID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>87f1724d-075e-48d3-95fd-78c2dd36****</p>
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
