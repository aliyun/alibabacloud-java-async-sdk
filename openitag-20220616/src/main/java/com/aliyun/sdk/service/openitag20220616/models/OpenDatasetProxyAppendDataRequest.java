// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenDatasetProxyAppendDataRequest} extends {@link RequestModel}
 *
 * <p>OpenDatasetProxyAppendDataRequest</p>
 */
public class OpenDatasetProxyAppendDataRequest extends Request {
    @com.aliyun.core.annotation.NameInMap("DataMeta")
    private java.util.List < java.util.Map<String, String>> dataMeta;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    @com.aliyun.core.annotation.NameInMap("UUID")
    private String UUID;

    private OpenDatasetProxyAppendDataRequest(Builder builder) {
        super(builder);
        this.dataMeta = builder.dataMeta;
        this.taskId = builder.taskId;
        this.traceId = builder.traceId;
        this.UUID = builder.UUID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenDatasetProxyAppendDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataMeta
     */
    public java.util.List < java.util.Map<String, String>> getDataMeta() {
        return this.dataMeta;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    /**
     * @return UUID
     */
    public String getUUID() {
        return this.UUID;
    }

    public static final class Builder extends Request.Builder<OpenDatasetProxyAppendDataRequest, Builder> {
        private java.util.List < java.util.Map<String, String>> dataMeta; 
        private String taskId; 
        private String traceId; 
        private String UUID; 

        private Builder() {
            super();
        } 

        private Builder(OpenDatasetProxyAppendDataRequest request) {
            super(request);
            this.dataMeta = request.dataMeta;
            this.taskId = request.taskId;
            this.traceId = request.traceId;
            this.UUID = request.UUID;
        } 

        /**
         * DataMeta.
         */
        public Builder dataMeta(java.util.List < java.util.Map<String, String>> dataMeta) {
            this.dataMeta = dataMeta;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * TraceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        /**
         * UUID.
         */
        public Builder UUID(String UUID) {
            this.UUID = UUID;
            return this;
        }

        @Override
        public OpenDatasetProxyAppendDataRequest build() {
            return new OpenDatasetProxyAppendDataRequest(this);
        } 

    } 

}
