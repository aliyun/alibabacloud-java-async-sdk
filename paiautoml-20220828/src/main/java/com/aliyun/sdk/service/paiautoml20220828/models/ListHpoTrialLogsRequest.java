// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHpoTrialLogsRequest} extends {@link RequestModel}
 *
 * <p>ListHpoTrialLogsRequest</p>
 */
public class ListHpoTrialLogsRequest extends Request {
    @Path
    @NameInMap("ExperimentId")
    private String experimentId;

    @Path
    @NameInMap("TrialId")
    private String trialId;

    @Query
    @NameInMap("LogName")
    private String logName;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
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
         * ExperimentId.
         */
        public Builder experimentId(String experimentId) {
            this.putPathParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
            return this;
        }

        /**
         * TrialId.
         */
        public Builder trialId(String trialId) {
            this.putPathParameter("TrialId", trialId);
            this.trialId = trialId;
            return this;
        }

        /**
         * LogName.
         */
        public Builder logName(String logName) {
            this.putQueryParameter("LogName", logName);
            this.logName = logName;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
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
