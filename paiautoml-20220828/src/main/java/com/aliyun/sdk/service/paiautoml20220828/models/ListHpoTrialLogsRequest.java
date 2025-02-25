// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHpoTrialLogsRequest} extends {@link RequestModel}
 *
 * <p>ListHpoTrialLogsRequest</p>
 */
public class ListHpoTrialLogsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    private String experimentId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TrialId")
    private String trialId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogName")
    private String logName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private ListHpoTrialLogsRequest(Builder builder) {
        super(builder);
        this.experimentId = builder.experimentId;
        this.trialId = builder.trialId;
        this.logName = builder.logName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHpoTrialLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return experimentId
     */
    public String getExperimentId() {
        return this.experimentId;
    }

    /**
     * @return trialId
     */
    public String getTrialId() {
        return this.trialId;
    }

    /**
     * @return logName
     */
    public String getLogName() {
        return this.logName;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListHpoTrialLogsRequest, Builder> {
        private String experimentId; 
        private String trialId; 
        private String logName; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListHpoTrialLogsRequest request) {
            super(request);
            this.experimentId = request.experimentId;
            this.trialId = request.trialId;
            this.logName = request.logName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * Experiment ID
         */
        public Builder experimentId(String experimentId) {
            this.putPathParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
            return this;
        }

        /**
         * Trial ID
         */
        public Builder trialId(String trialId) {
            this.putPathParameter("TrialId", trialId);
            this.trialId = trialId;
            return this;
        }

        /**
         * Log file name.
         */
        public Builder logName(String logName) {
            this.putQueryParameter("LogName", logName);
            this.logName = logName;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListHpoTrialLogsRequest build() {
            return new ListHpoTrialLogsRequest(this);
        } 

    } 

}
