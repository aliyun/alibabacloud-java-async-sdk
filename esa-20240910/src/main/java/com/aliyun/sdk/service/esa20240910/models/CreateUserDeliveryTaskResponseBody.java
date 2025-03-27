// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CreateUserDeliveryTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateUserDeliveryTaskResponseBody</p>
 */
public class CreateUserDeliveryTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataCenter")
    private String dataCenter;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private CreateUserDeliveryTaskResponseBody(Builder builder) {
        this.dataCenter = builder.dataCenter;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserDeliveryTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataCenter
     */
    public String getDataCenter() {
        return this.dataCenter;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder {
        private String dataCenter; 
        private String requestId; 
        private String status; 
        private String taskName; 

        private Builder() {
        } 

        private Builder(CreateUserDeliveryTaskResponseBody model) {
            this.dataCenter = model.dataCenter;
            this.requestId = model.requestId;
            this.status = model.status;
            this.taskName = model.taskName;
        } 

        /**
         * <p>The data center. Valid values:</p>
         * <ul>
         * <li>cn: the Chinese mainland.</li>
         * <li>sg: outside the Chinese mainland.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        public Builder dataCenter(String dataCenter) {
            this.dataCenter = dataCenter;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2CCD40B1-3F20-5FF0-8A67-E3F34B87744F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the delivery task.</p>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The name of the delivery task.</p>
         * 
         * <strong>example:</strong>
         * <p>er-http</p>
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        public CreateUserDeliveryTaskResponseBody build() {
            return new CreateUserDeliveryTaskResponseBody(this);
        } 

    } 

}
