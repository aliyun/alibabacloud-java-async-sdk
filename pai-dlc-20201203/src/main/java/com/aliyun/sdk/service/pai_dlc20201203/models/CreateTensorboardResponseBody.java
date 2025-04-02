// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link CreateTensorboardResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTensorboardResponseBody</p>
 */
public class CreateTensorboardResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    private String dataSourceId;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TensorboardId")
    private String tensorboardId;

    private CreateTensorboardResponseBody(Builder builder) {
        this.dataSourceId = builder.dataSourceId;
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
        this.tensorboardId = builder.tensorboardId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTensorboardResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tensorboardId
     */
    public String getTensorboardId() {
        return this.tensorboardId;
    }

    public static final class Builder {
        private String dataSourceId; 
        private String jobId; 
        private String requestId; 
        private String tensorboardId; 

        private Builder() {
        } 

        private Builder(CreateTensorboardResponseBody model) {
            this.dataSourceId = model.dataSourceId;
            this.jobId = model.jobId;
            this.requestId = model.requestId;
            this.tensorboardId = model.tensorboardId;
        } 

        /**
         * <p>The dataset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-20210126170216-xxxxxxxx</p>
         */
        public Builder dataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc-20210126170216-xxxxxxxx</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>TensorBoard ID</p>
         * 
         * <strong>example:</strong>
         * <p>tbxxxxxxxx</p>
         */
        public Builder tensorboardId(String tensorboardId) {
            this.tensorboardId = tensorboardId;
            return this;
        }

        public CreateTensorboardResponseBody build() {
            return new CreateTensorboardResponseBody(this);
        } 

    } 

}
