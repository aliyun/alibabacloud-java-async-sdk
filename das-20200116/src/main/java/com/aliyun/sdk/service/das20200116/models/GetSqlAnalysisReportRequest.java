// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSqlAnalysisReportRequest} extends {@link RequestModel}
 *
 * <p>GetSqlAnalysisReportRequest</p>
 */
public class GetSqlAnalysisReportRequest extends Request {
    @Query
    @NameInMap("ConsoleContext")
    private String consoleContext;

    @Query
    @NameInMap("ModuleNameList")
    private String moduleNameList;

    @Body
    @NameInMap("TaskId")
    private String taskId;

    private GetSqlAnalysisReportRequest(Builder builder) {
        super(builder);
        this.consoleContext = builder.consoleContext;
        this.moduleNameList = builder.moduleNameList;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSqlAnalysisReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consoleContext
     */
    public String getConsoleContext() {
        return this.consoleContext;
    }

    /**
     * @return moduleNameList
     */
    public String getModuleNameList() {
        return this.moduleNameList;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetSqlAnalysisReportRequest, Builder> {
        private String consoleContext; 
        private String moduleNameList; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetSqlAnalysisReportRequest response) {
            super(response);
            this.consoleContext = response.consoleContext;
            this.moduleNameList = response.moduleNameList;
            this.taskId = response.taskId;
        } 

        /**
         * ConsoleContext.
         */
        public Builder consoleContext(String consoleContext) {
            this.putQueryParameter("ConsoleContext", consoleContext);
            this.consoleContext = consoleContext;
            return this;
        }

        /**
         * ModuleNameList.
         */
        public Builder moduleNameList(String moduleNameList) {
            this.putQueryParameter("ModuleNameList", moduleNameList);
            this.moduleNameList = moduleNameList;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetSqlAnalysisReportRequest build() {
            return new GetSqlAnalysisReportRequest(this);
        } 

    } 

}
