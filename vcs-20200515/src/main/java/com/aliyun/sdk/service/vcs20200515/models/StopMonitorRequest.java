// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopMonitorRequest} extends {@link RequestModel}
 *
 * <p>StopMonitorRequest</p>
 */
public class StopMonitorRequest extends Request {
    @Body
    @NameInMap("AlgorithmVendor")
    @Validation(required = true)
    private String algorithmVendor;

    @Body
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    private StopMonitorRequest(Builder builder) {
        super(builder);
        this.algorithmVendor = builder.algorithmVendor;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopMonitorRequest create() {
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
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<StopMonitorRequest, Builder> {
        private String algorithmVendor; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(StopMonitorRequest response) {
            super(response);
            this.algorithmVendor = response.algorithmVendor;
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
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public StopMonitorRequest build() {
            return new StopMonitorRequest(this);
        } 

    } 

}
