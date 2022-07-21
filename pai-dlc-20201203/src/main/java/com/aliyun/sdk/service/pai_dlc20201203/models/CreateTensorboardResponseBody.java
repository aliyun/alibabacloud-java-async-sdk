// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTensorboardResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTensorboardResponseBody</p>
 */
public class CreateTensorboardResponseBody extends TeaModel {
    @NameInMap("DataSourceId")
    private String dataSourceId;

    @NameInMap("JobId")
    private String jobId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TensorboardId")
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

        /**
         * DataSourceId
         */
        public Builder dataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * 任务Id
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * 请求Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Tensorboard id
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
