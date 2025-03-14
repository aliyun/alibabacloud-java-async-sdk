// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetVirusScanConfigRequest} extends {@link RequestModel}
 *
 * <p>GetVirusScanConfigRequest</p>
 */
public class GetVirusScanConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    private GetVirusScanConfigRequest(Builder builder) {
        super(builder);
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVirusScanConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<GetVirusScanConfigRequest, Builder> {
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(GetVirusScanConfigRequest request) {
            super(request);
            this.taskType = request.taskType;
        } 

        /**
         * <p>The type of the task. Valid values:</p>
         * <ul>
         * <li><strong>VIRUS_VUL_SCHEDULE_SCAN</strong>: a virus scan task.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VIRUS_VUL_SCHEDULE_SCAN</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public GetVirusScanConfigRequest build() {
            return new GetVirusScanConfigRequest(this);
        } 

    } 

}
