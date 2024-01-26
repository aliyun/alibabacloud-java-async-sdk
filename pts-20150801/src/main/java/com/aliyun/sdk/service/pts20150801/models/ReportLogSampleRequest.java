// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20150801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReportLogSampleRequest} extends {@link RequestModel}
 *
 * <p>ReportLogSampleRequest</p>
 */
public class ReportLogSampleRequest extends Request {
    @Query
    @NameInMap("LogSample")
    @Validation(required = true)
    private String logSample;

    @Query
    @NameInMap("ScenarioId")
    @Validation(required = true)
    private Integer scenarioId;

    @Query
    @NameInMap("Wskey")
    @Validation(required = true)
    private String wskey;

    private ReportLogSampleRequest(Builder builder) {
        super(builder);
        this.logSample = builder.logSample;
        this.scenarioId = builder.scenarioId;
        this.wskey = builder.wskey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportLogSampleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logSample
     */
    public String getLogSample() {
        return this.logSample;
    }

    /**
     * @return scenarioId
     */
    public Integer getScenarioId() {
        return this.scenarioId;
    }

    /**
     * @return wskey
     */
    public String getWskey() {
        return this.wskey;
    }

    public static final class Builder extends Request.Builder<ReportLogSampleRequest, Builder> {
        private String logSample; 
        private Integer scenarioId; 
        private String wskey; 

        private Builder() {
            super();
        } 

        private Builder(ReportLogSampleRequest request) {
            super(request);
            this.logSample = request.logSample;
            this.scenarioId = request.scenarioId;
            this.wskey = request.wskey;
        } 

        /**
         * LogSample.
         */
        public Builder logSample(String logSample) {
            this.putQueryParameter("LogSample", logSample);
            this.logSample = logSample;
            return this;
        }

        /**
         * ScenarioId.
         */
        public Builder scenarioId(Integer scenarioId) {
            this.putQueryParameter("ScenarioId", scenarioId);
            this.scenarioId = scenarioId;
            return this;
        }

        /**
         * Wskey.
         */
        public Builder wskey(String wskey) {
            this.putQueryParameter("Wskey", wskey);
            this.wskey = wskey;
            return this;
        }

        @Override
        public ReportLogSampleRequest build() {
            return new ReportLogSampleRequest(this);
        } 

    } 

}
