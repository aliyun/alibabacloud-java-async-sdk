// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link GetIncidentInvestigationResponseBody} extends {@link TeaModel}
 *
 * <p>GetIncidentInvestigationResponseBody</p>
 */
public class GetIncidentInvestigationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IncidentInvestigation")
    private IncidentInvestigation incidentInvestigation;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetIncidentInvestigationResponseBody(Builder builder) {
        this.incidentInvestigation = builder.incidentInvestigation;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIncidentInvestigationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return incidentInvestigation
     */
    public IncidentInvestigation getIncidentInvestigation() {
        return this.incidentInvestigation;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private IncidentInvestigation incidentInvestigation; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetIncidentInvestigationResponseBody model) {
            this.incidentInvestigation = model.incidentInvestigation;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The AI investigation details of the incident. This field is empty if no matching investigation record is found.</p>
         */
        public Builder incidentInvestigation(IncidentInvestigation incidentInvestigation) {
            this.incidentInvestigation = incidentInvestigation;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot this call.</p>
         * 
         * <strong>example:</strong>
         * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetIncidentInvestigationResponseBody build() {
            return new GetIncidentInvestigationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetIncidentInvestigationResponseBody} extends {@link TeaModel}
     *
     * <p>GetIncidentInvestigationResponseBody</p>
     */
    public static class IncidentInvestigation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IncidentInvestigationAlertName")
        private String incidentInvestigationAlertName;

        @com.aliyun.core.annotation.NameInMap("IncidentInvestigationConclusion")
        private String incidentInvestigationConclusion;

        @com.aliyun.core.annotation.NameInMap("IncidentInvestigationDisplayId")
        private String incidentInvestigationDisplayId;

        @com.aliyun.core.annotation.NameInMap("IncidentInvestigationEndTime")
        private Long incidentInvestigationEndTime;

        @com.aliyun.core.annotation.NameInMap("IncidentInvestigationId")
        private String incidentInvestigationId;

        @com.aliyun.core.annotation.NameInMap("IncidentInvestigationOutput")
        private String incidentInvestigationOutput;

        @com.aliyun.core.annotation.NameInMap("IncidentInvestigationReport")
        private String incidentInvestigationReport;

        @com.aliyun.core.annotation.NameInMap("IncidentInvestigationStartTime")
        private Long incidentInvestigationStartTime;

        @com.aliyun.core.annotation.NameInMap("IncidentInvestigationStatus")
        private String incidentInvestigationStatus;

        @com.aliyun.core.annotation.NameInMap("IncidentInvestigationSummary")
        private String incidentInvestigationSummary;

        @com.aliyun.core.annotation.NameInMap("IncidentUuid")
        private String incidentUuid;

        private IncidentInvestigation(Builder builder) {
            this.incidentInvestigationAlertName = builder.incidentInvestigationAlertName;
            this.incidentInvestigationConclusion = builder.incidentInvestigationConclusion;
            this.incidentInvestigationDisplayId = builder.incidentInvestigationDisplayId;
            this.incidentInvestigationEndTime = builder.incidentInvestigationEndTime;
            this.incidentInvestigationId = builder.incidentInvestigationId;
            this.incidentInvestigationOutput = builder.incidentInvestigationOutput;
            this.incidentInvestigationReport = builder.incidentInvestigationReport;
            this.incidentInvestigationStartTime = builder.incidentInvestigationStartTime;
            this.incidentInvestigationStatus = builder.incidentInvestigationStatus;
            this.incidentInvestigationSummary = builder.incidentInvestigationSummary;
            this.incidentUuid = builder.incidentUuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IncidentInvestigation create() {
            return builder().build();
        }

        /**
         * @return incidentInvestigationAlertName
         */
        public String getIncidentInvestigationAlertName() {
            return this.incidentInvestigationAlertName;
        }

        /**
         * @return incidentInvestigationConclusion
         */
        public String getIncidentInvestigationConclusion() {
            return this.incidentInvestigationConclusion;
        }

        /**
         * @return incidentInvestigationDisplayId
         */
        public String getIncidentInvestigationDisplayId() {
            return this.incidentInvestigationDisplayId;
        }

        /**
         * @return incidentInvestigationEndTime
         */
        public Long getIncidentInvestigationEndTime() {
            return this.incidentInvestigationEndTime;
        }

        /**
         * @return incidentInvestigationId
         */
        public String getIncidentInvestigationId() {
            return this.incidentInvestigationId;
        }

        /**
         * @return incidentInvestigationOutput
         */
        public String getIncidentInvestigationOutput() {
            return this.incidentInvestigationOutput;
        }

        /**
         * @return incidentInvestigationReport
         */
        public String getIncidentInvestigationReport() {
            return this.incidentInvestigationReport;
        }

        /**
         * @return incidentInvestigationStartTime
         */
        public Long getIncidentInvestigationStartTime() {
            return this.incidentInvestigationStartTime;
        }

        /**
         * @return incidentInvestigationStatus
         */
        public String getIncidentInvestigationStatus() {
            return this.incidentInvestigationStatus;
        }

        /**
         * @return incidentInvestigationSummary
         */
        public String getIncidentInvestigationSummary() {
            return this.incidentInvestigationSummary;
        }

        /**
         * @return incidentUuid
         */
        public String getIncidentUuid() {
            return this.incidentUuid;
        }

        public static final class Builder {
            private String incidentInvestigationAlertName; 
            private String incidentInvestigationConclusion; 
            private String incidentInvestigationDisplayId; 
            private Long incidentInvestigationEndTime; 
            private String incidentInvestigationId; 
            private String incidentInvestigationOutput; 
            private String incidentInvestigationReport; 
            private Long incidentInvestigationStartTime; 
            private String incidentInvestigationStatus; 
            private String incidentInvestigationSummary; 
            private String incidentUuid; 

            private Builder() {
            } 

            private Builder(IncidentInvestigation model) {
                this.incidentInvestigationAlertName = model.incidentInvestigationAlertName;
                this.incidentInvestigationConclusion = model.incidentInvestigationConclusion;
                this.incidentInvestigationDisplayId = model.incidentInvestigationDisplayId;
                this.incidentInvestigationEndTime = model.incidentInvestigationEndTime;
                this.incidentInvestigationId = model.incidentInvestigationId;
                this.incidentInvestigationOutput = model.incidentInvestigationOutput;
                this.incidentInvestigationReport = model.incidentInvestigationReport;
                this.incidentInvestigationStartTime = model.incidentInvestigationStartTime;
                this.incidentInvestigationStatus = model.incidentInvestigationStatus;
                this.incidentInvestigationSummary = model.incidentInvestigationSummary;
                this.incidentUuid = model.incidentUuid;
            } 

            /**
             * <p>The name of the alert that triggered this AI investigation.</p>
             * 
             * <strong>example:</strong>
             * <p>Webshell Alert</p>
             */
            public Builder incidentInvestigationAlertName(String incidentInvestigationAlertName) {
                this.incidentInvestigationAlertName = incidentInvestigationAlertName;
                return this;
            }

            /**
             * <p>The judgment conclusion of the AI investigation, corresponding to ai_judgement_conclusion in the report.</p>
             * 
             * <strong>example:</strong>
             * <p>Insufficient evidence to confirm whether the attack chain is complete. Supplement correlated logs for further analysis</p>
             */
            public Builder incidentInvestigationConclusion(String incidentInvestigationConclusion) {
                this.incidentInvestigationConclusion = incidentInvestigationConclusion;
                return this;
            }

            /**
             * <p>The display ID of the AI investigation report. You can use this value as the IncidentInvestigationDisplayId parameter of this operation to query the report.</p>
             * 
             * <strong>example:</strong>
             * <p>755616bb5d63046c1e4f62ea872a****</p>
             */
            public Builder incidentInvestigationDisplayId(String incidentInvestigationDisplayId) {
                this.incidentInvestigationDisplayId = incidentInvestigationDisplayId;
                return this;
            }

            /**
             * <p>The end time of the AI investigation, in seconds (UNIX timestamp). If the execution end time is not recorded, the last update time of the investigation record is used. This field is empty if neither time exists.</p>
             * 
             * <strong>example:</strong>
             * <p>1786195753</p>
             */
            public Builder incidentInvestigationEndTime(Long incidentInvestigationEndTime) {
                this.incidentInvestigationEndTime = incidentInvestigationEndTime;
                return this;
            }

            /**
             * <p>The unique ID of the AI investigation report. You can use this value as the IncidentInvestigationId parameter of this operation to query the report.</p>
             * 
             * <strong>example:</strong>
             * <p>951a6a0b-14c7-4332-ace6-bff21c******</p>
             */
            public Builder incidentInvestigationId(String incidentInvestigationId) {
                this.incidentInvestigationId = incidentInvestigationId;
                return this;
            }

            /**
             * <p>The output content of the AI investigation, in JSON-formatted string. This field can contain fields such as investigation_report (the investigation process and evidence body, which may use Markdown format). This field is empty if the corresponding output is not generated. Internal fields may change across report versions.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;investigation_report&quot;:&quot;### Investigation Results\nSuspicious file detected, but execution evidence is missing.&quot;}</p>
             */
            public Builder incidentInvestigationOutput(String incidentInvestigationOutput) {
                this.incidentInvestigationOutput = incidentInvestigationOutput;
                return this;
            }

            /**
             * <p>The AI investigation report content, in JSON-formatted string. This field can contain fields such as judgement_category (judgment category), ai_judgement_conclusion (judgment conclusion), ai_summary (summary), attack process, and attack graph. The specific content may change across report versions.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;judgement_category&quot;:&quot;insufficient_information_to_evaluate&quot;,&quot;ai_judgement_conclusion&quot;:&quot;Insufficient evidence to confirm whether the attack chain is complete. Supplement correlated logs for further analysis.&quot;,&quot;ai_summary&quot;:&quot;Suspicious file detected. Insufficient evidence to confirm whether the attack was successful.&quot;}</p>
             */
            public Builder incidentInvestigationReport(String incidentInvestigationReport) {
                this.incidentInvestigationReport = incidentInvestigationReport;
                return this;
            }

            /**
             * <p>The start time of the AI investigation, in seconds (UNIX timestamp). If the execution start time is not recorded, the creation time of the investigation record is used. This field is empty if neither time exists.</p>
             * 
             * <strong>example:</strong>
             * <p>1786195533</p>
             */
            public Builder incidentInvestigationStartTime(Long incidentInvestigationStartTime) {
                this.incidentInvestigationStartTime = incidentInvestigationStartTime;
                return this;
            }

            /**
             * <p>The judgment category of the AI investigation report, corresponding to judgement_category in the report. This field does not indicate the execution status of the asynchronous task. Valid values:</p>
             * <ul>
             * <li>real_attack: Real attack.</li>
             * <li>blocked: Risk blocked.</li>
             * <li>false_positive: Suspected false positive.</li>
             * <li>insufficient_information_to_evaluate: Unable to determine.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>insufficient_information_to_evaluate</p>
             */
            public Builder incidentInvestigationStatus(String incidentInvestigationStatus) {
                this.incidentInvestigationStatus = incidentInvestigationStatus;
                return this;
            }

            /**
             * <p>The summary of the AI investigation report, corresponding to ai_summary in the investigation results.</p>
             * 
             * <strong>example:</strong>
             * <p>Suspicious file detected. Insufficient evidence to confirm whether the attack was successful</p>
             */
            public Builder incidentInvestigationSummary(String incidentInvestigationSummary) {
                this.incidentInvestigationSummary = incidentInvestigationSummary;
                return this;
            }

            /**
             * <p>The globally unique UUID of the incident.</p>
             * 
             * <strong>example:</strong>
             * <p>9f00c254391400f6898c4d4fea******</p>
             */
            public Builder incidentUuid(String incidentUuid) {
                this.incidentUuid = incidentUuid;
                return this;
            }

            public IncidentInvestigation build() {
                return new IncidentInvestigation(this);
            } 

        } 

    }
}
