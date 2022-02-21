// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDiagnosticReportResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDiagnosticReportResponseBody</p>
 */
public class CreateDiagnosticReportResponseBody extends TeaModel {
    @NameInMap("CommandInvokeResults")
    private CommandInvokeResults commandInvokeResults;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("ReportId")
    private String reportId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private CreateDiagnosticReportResponseBody(Builder builder) {
        this.commandInvokeResults = builder.commandInvokeResults;
        this.createTime = builder.createTime;
        this.reportId = builder.reportId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDiagnosticReportResponseBody create() {
        return builder().build();
    }

    /**
     * @return commandInvokeResults
     */
    public CommandInvokeResults getCommandInvokeResults() {
        return this.commandInvokeResults;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return reportId
     */
    public String getReportId() {
        return this.reportId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private CommandInvokeResults commandInvokeResults; 
        private String createTime; 
        private String reportId; 
        private String requestId; 
        private String status; 

        /**
         * CommandInvokeResults.
         */
        public Builder commandInvokeResults(CommandInvokeResults commandInvokeResults) {
            this.commandInvokeResults = commandInvokeResults;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CreateDiagnosticReportResponseBody build() {
            return new CreateDiagnosticReportResponseBody(this);
        } 

    } 

    public static class InvokeResult extends TeaModel {
        @NameInMap("CommandName")
        private String commandName;

        @NameInMap("DataFileDir")
        private String dataFileDir;

        @NameInMap("InvokeResult")
        private String invokeResult;

        private InvokeResult(Builder builder) {
            this.commandName = builder.commandName;
            this.dataFileDir = builder.dataFileDir;
            this.invokeResult = builder.invokeResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvokeResult create() {
            return builder().build();
        }

        /**
         * @return commandName
         */
        public String getCommandName() {
            return this.commandName;
        }

        /**
         * @return dataFileDir
         */
        public String getDataFileDir() {
            return this.dataFileDir;
        }

        /**
         * @return invokeResult
         */
        public String getInvokeResult() {
            return this.invokeResult;
        }

        public static final class Builder {
            private String commandName; 
            private String dataFileDir; 
            private String invokeResult; 

            /**
             * CommandName.
             */
            public Builder commandName(String commandName) {
                this.commandName = commandName;
                return this;
            }

            /**
             * DataFileDir.
             */
            public Builder dataFileDir(String dataFileDir) {
                this.dataFileDir = dataFileDir;
                return this;
            }

            /**
             * InvokeResult.
             */
            public Builder invokeResult(String invokeResult) {
                this.invokeResult = invokeResult;
                return this;
            }

            public InvokeResult build() {
                return new InvokeResult(this);
            } 

        } 

    }
    public static class CommandInvokeResults extends TeaModel {
        @NameInMap("InvokeResult")
        private java.util.List < InvokeResult> invokeResult;

        private CommandInvokeResults(Builder builder) {
            this.invokeResult = builder.invokeResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommandInvokeResults create() {
            return builder().build();
        }

        /**
         * @return invokeResult
         */
        public java.util.List < InvokeResult> getInvokeResult() {
            return this.invokeResult;
        }

        public static final class Builder {
            private java.util.List < InvokeResult> invokeResult; 

            /**
             * InvokeResult.
             */
            public Builder invokeResult(java.util.List < InvokeResult> invokeResult) {
                this.invokeResult = invokeResult;
                return this;
            }

            public CommandInvokeResults build() {
                return new CommandInvokeResults(this);
            } 

        } 

    }
}
