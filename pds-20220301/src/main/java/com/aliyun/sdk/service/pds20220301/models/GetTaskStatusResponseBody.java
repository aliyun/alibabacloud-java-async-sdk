// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTaskStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskStatusResponseBody</p>
 */
public class GetTaskStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private GetTaskStatusResponseBody(Builder builder) {
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String status; 

        /**
         * The state of the task.
         * <p>
         * 
         * Valid values:
         * 
         * *   running
         * 
         *     <!-- -->
         * 
         *     : The task is
         * 
         *     <!-- -->
         * 
         *     running
         * 
         *     <!-- -->
         * 
         *     .
         * 
         * *   failed
         * 
         *     <!-- -->
         * 
         *     : The task
         * 
         *     <!-- -->
         * 
         *     fails
         * 
         *     <!-- -->
         * 
         *     .
         * 
         * *   succeeded
         * 
         *     <!-- -->
         * 
         *     : The task is
         * 
         *     <!-- -->
         * 
         *     successful
         * 
         *     <!-- -->
         * 
         *     .
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetTaskStatusResponseBody build() {
            return new GetTaskStatusResponseBody(this);
        } 

    } 

}
