// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link CreateJobGroupExportTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateJobGroupExportTaskRequest</p>
 */
public class CreateJobGroupExportTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobGroupId")
    private String jobGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Option")
    private java.util.List<String> option;

    private CreateJobGroupExportTaskRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.jobGroupId = builder.jobGroupId;
        this.option = builder.option;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateJobGroupExportTaskRequest create() {
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
     * @return jobGroupId
     */
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    /**
     * @return option
     */
    public java.util.List<String> getOption() {
        return this.option;
    }

    public static final class Builder extends Request.Builder<CreateJobGroupExportTaskRequest, Builder> {
        private String instanceId; 
        private String jobGroupId; 
        private java.util.List<String> option; 

        private Builder() {
            super();
        } 

        private Builder(CreateJobGroupExportTaskRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.jobGroupId = request.jobGroupId;
            this.option = request.option;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a4274627-265f-4e14-b2d6-4ee7d4f8593e</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * JobGroupId.
         */
        public Builder jobGroupId(String jobGroupId) {
            this.putQueryParameter("JobGroupId", jobGroupId);
            this.jobGroupId = jobGroupId;
            return this;
        }

        /**
         * Option.
         */
        public Builder option(java.util.List<String> option) {
            this.putQueryParameter("Option", option);
            this.option = option;
            return this;
        }

        @Override
        public CreateJobGroupExportTaskRequest build() {
            return new CreateJobGroupExportTaskRequest(this);
        } 

    } 

}
