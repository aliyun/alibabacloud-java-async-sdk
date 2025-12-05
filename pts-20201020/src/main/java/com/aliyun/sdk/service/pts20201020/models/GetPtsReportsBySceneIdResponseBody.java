// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

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
 * {@link GetPtsReportsBySceneIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetPtsReportsBySceneIdResponseBody</p>
 */
public class GetPtsReportsBySceneIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("ReportOverViewList")
    private java.util.List<ReportOverViewList> reportOverViewList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetPtsReportsBySceneIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.reportOverViewList = builder.reportOverViewList;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPtsReportsBySceneIdResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return reportOverViewList
     */
    public java.util.List<ReportOverViewList> getReportOverViewList() {
        return this.reportOverViewList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private java.util.List<ReportOverViewList> reportOverViewList; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetPtsReportsBySceneIdResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.reportOverViewList = model.reportOverViewList;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The system status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The returned message. If the request was successful, this parameter is left empty.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The reports.</p>
         */
        public Builder reportOverViewList(java.util.List<ReportOverViewList> reportOverViewList) {
            this.reportOverViewList = reportOverViewList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DC4E3177-6745-4925-B423-4E89VV34221A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetPtsReportsBySceneIdResponseBody build() {
            return new GetPtsReportsBySceneIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPtsReportsBySceneIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetPtsReportsBySceneIdResponseBody</p>
     */
    public static class ReportOverViewList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentCount")
        private Integer agentCount;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ReportId")
        private String reportId;

        @com.aliyun.core.annotation.NameInMap("ReportName")
        private String reportName;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Vum")
        private Long vum;

        private ReportOverViewList(Builder builder) {
            this.agentCount = builder.agentCount;
            this.endTime = builder.endTime;
            this.reportId = builder.reportId;
            this.reportName = builder.reportName;
            this.startTime = builder.startTime;
            this.vum = builder.vum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReportOverViewList create() {
            return builder().build();
        }

        /**
         * @return agentCount
         */
        public Integer getAgentCount() {
            return this.agentCount;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return reportId
         */
        public String getReportId() {
            return this.reportId;
        }

        /**
         * @return reportName
         */
        public String getReportName() {
            return this.reportName;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return vum
         */
        public Long getVum() {
            return this.vum;
        }

        public static final class Builder {
            private Integer agentCount; 
            private String endTime; 
            private String reportId; 
            private String reportName; 
            private String startTime; 
            private Long vum; 

            private Builder() {
            } 

            private Builder(ReportOverViewList model) {
                this.agentCount = model.agentCount;
                this.endTime = model.endTime;
                this.reportId = model.reportId;
                this.reportName = model.reportName;
                this.startTime = model.startTime;
                this.vum = model.vum;
            } 

            /**
             * <p>The number of stress testers.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder agentCount(Integer agentCount) {
                this.agentCount = agentCount;
                return this;
            }

            /**
             * <p>The end time of the stress testing.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-02-26 16:38:30</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The report ID.</p>
             * 
             * <strong>example:</strong>
             * <p>NGGB5FV</p>
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * <p>The title of the report.</p>
             * 
             * <strong>example:</strong>
             * <p>PTS-test-20240920094710</p>
             */
            public Builder reportName(String reportName) {
                this.reportName = reportName;
                return this;
            }

            /**
             * <p>The start time of the stress testing.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-02-26 16:28:30</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The consumed Virtual User Minutes (VUM).</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder vum(Long vum) {
                this.vum = vum;
                return this;
            }

            public ReportOverViewList build() {
                return new ReportOverViewList(this);
            } 

        } 

    }
}
