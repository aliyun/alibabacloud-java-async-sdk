// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutoShowListTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoShowListTasksResponseBody</p>
 */
public class DescribeAutoShowListTasksResponseBody extends TeaModel {
    @NameInMap("AutoShowListTasks")
    private String autoShowListTasks;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAutoShowListTasksResponseBody(Builder builder) {
        this.autoShowListTasks = builder.autoShowListTasks;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutoShowListTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoShowListTasks
     */
    public String getAutoShowListTasks() {
        return this.autoShowListTasks;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String autoShowListTasks; 
        private String requestId; 

        /**
         * AutoShowListTasks.
         */
        public Builder autoShowListTasks(String autoShowListTasks) {
            this.autoShowListTasks = autoShowListTasks;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAutoShowListTasksResponseBody build() {
            return new DescribeAutoShowListTasksResponseBody(this);
        } 

    } 

}
