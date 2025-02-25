// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDataDiagnoseReportsRequest} extends {@link RequestModel}
 *
 * <p>ListDataDiagnoseReportsRequest</p>
 */
public class ListDataDiagnoseReportsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskCreateTime")
    private Long taskCreateTime;

    private ListDataDiagnoseReportsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.taskCreateTime = builder.taskCreateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataDiagnoseReportsRequest create() {
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
     * @return taskCreateTime
     */
    public Long getTaskCreateTime() {
        return this.taskCreateTime;
    }

    public static final class Builder extends Request.Builder<ListDataDiagnoseReportsRequest, Builder> {
        private String instanceId; 
        private Long taskCreateTime; 

        private Builder() {
            super();
        } 

        private Builder(ListDataDiagnoseReportsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.taskCreateTime = request.taskCreateTime;
        } 

        /**
         * <p>A short description of struct</p>
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
         * taskCreateTime.
         */
        public Builder taskCreateTime(Long taskCreateTime) {
            this.putQueryParameter("taskCreateTime", taskCreateTime);
            this.taskCreateTime = taskCreateTime;
            return this;
        }

        @Override
        public ListDataDiagnoseReportsRequest build() {
            return new ListDataDiagnoseReportsRequest(this);
        } 

    } 

}
