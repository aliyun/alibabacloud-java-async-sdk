// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMonitorResultRequest} extends {@link RequestModel}
 *
 * <p>GetMonitorResultRequest</p>
 */
public class GetMonitorResultRequest extends Request {
    @Body
    @NameInMap("AlgorithmVendor")
    private String algorithmVendor;

    @Body
    @NameInMap("CorpId")
    @Validation(required = true)
    private String corpId;

    @Body
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Body
    @NameInMap("MinRecordId")
    private String minRecordId;

    @Body
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    @Body
    @NameInMap("TaskId")
    private String taskId;

    private GetMonitorResultRequest(Builder builder) {
        super(builder);
        this.algorithmVendor = builder.algorithmVendor;
        this.corpId = builder.corpId;
        this.endTime = builder.endTime;
        this.minRecordId = builder.minRecordId;
        this.startTime = builder.startTime;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMonitorResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmVendor
     */
    public String getAlgorithmVendor() {
        return this.algorithmVendor;
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return minRecordId
     */
    public String getMinRecordId() {
        return this.minRecordId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetMonitorResultRequest, Builder> {
        private String algorithmVendor; 
        private String corpId; 
        private Long endTime; 
        private String minRecordId; 
        private Long startTime; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetMonitorResultRequest response) {
            super(response);
            this.algorithmVendor = response.algorithmVendor;
            this.corpId = response.corpId;
            this.endTime = response.endTime;
            this.minRecordId = response.minRecordId;
            this.startTime = response.startTime;
            this.taskId = response.taskId;
        } 

        /**
         * AlgorithmVendor.
         */
        public Builder algorithmVendor(String algorithmVendor) {
            this.putBodyParameter("AlgorithmVendor", algorithmVendor);
            this.algorithmVendor = algorithmVendor;
            return this;
        }

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * MinRecordId.
         */
        public Builder minRecordId(String minRecordId) {
            this.putBodyParameter("MinRecordId", minRecordId);
            this.minRecordId = minRecordId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
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
        public GetMonitorResultRequest build() {
            return new GetMonitorResultRequest(this);
        } 

    } 

}
