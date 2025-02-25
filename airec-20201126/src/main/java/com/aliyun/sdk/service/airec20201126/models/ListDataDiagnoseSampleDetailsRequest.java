// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDataDiagnoseSampleDetailsRequest} extends {@link RequestModel}
 *
 * <p>ListDataDiagnoseSampleDetailsRequest</p>
 */
public class ListDataDiagnoseSampleDetailsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String key;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskCreateTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskCreateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskSource")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskSource;

    private ListDataDiagnoseSampleDetailsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.endTime = builder.endTime;
        this.key = builder.key;
        this.startTime = builder.startTime;
        this.taskCreateTime = builder.taskCreateTime;
        this.taskSource = builder.taskSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataDiagnoseSampleDetailsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return taskCreateTime
     */
    public Long getTaskCreateTime() {
        return this.taskCreateTime;
    }

    /**
     * @return taskSource
     */
    public String getTaskSource() {
        return this.taskSource;
    }

    public static final class Builder extends Request.Builder<ListDataDiagnoseSampleDetailsRequest, Builder> {
        private String instanceId; 
        private Long endTime; 
        private String key; 
        private Long startTime; 
        private Long taskCreateTime; 
        private String taskSource; 

        private Builder() {
            super();
        } 

        private Builder(ListDataDiagnoseSampleDetailsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.endTime = request.endTime;
            this.key = request.key;
            this.startTime = request.startTime;
            this.taskCreateTime = request.taskCreateTime;
            this.taskSource = request.taskSource;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-cn-shdjkgkeog</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1682179200</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder key(String key) {
            this.putQueryParameter("key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1665158400</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1665936000000</p>
         */
        public Builder taskCreateTime(Long taskCreateTime) {
            this.putQueryParameter("taskCreateTime", taskCreateTime);
            this.taskCreateTime = taskCreateTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cycle</p>
         */
        public Builder taskSource(String taskSource) {
            this.putQueryParameter("taskSource", taskSource);
            this.taskSource = taskSource;
            return this;
        }

        @Override
        public ListDataDiagnoseSampleDetailsRequest build() {
            return new ListDataDiagnoseSampleDetailsRequest(this);
        } 

    } 

}
