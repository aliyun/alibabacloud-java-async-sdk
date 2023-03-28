// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPtsReportsBySceneIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetPtsReportsBySceneIdResponseBody</p>
 */
public class GetPtsReportsBySceneIdResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("ReportOverViewList")
    private java.util.List < ReportOverViewList> reportOverViewList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
    public java.util.List < ReportOverViewList> getReportOverViewList() {
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
        private java.util.List < ReportOverViewList> reportOverViewList; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * ReportOverViewList.
         */
        public Builder reportOverViewList(java.util.List < ReportOverViewList> reportOverViewList) {
            this.reportOverViewList = reportOverViewList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetPtsReportsBySceneIdResponseBody build() {
            return new GetPtsReportsBySceneIdResponseBody(this);
        } 

    } 

    public static class ReportOverViewList extends TeaModel {
        @NameInMap("AgentCount")
        private Integer agentCount;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("ReportId")
        private String reportId;

        @NameInMap("ReportName")
        private String reportName;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Vum")
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

            /**
             * AgentCount.
             */
            public Builder agentCount(Integer agentCount) {
                this.agentCount = agentCount;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ReportId.
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * ReportName.
             */
            public Builder reportName(String reportName) {
                this.reportName = reportName;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Vum.
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
