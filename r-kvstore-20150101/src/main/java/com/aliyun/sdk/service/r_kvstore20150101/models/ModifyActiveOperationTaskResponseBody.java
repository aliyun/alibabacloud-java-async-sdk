// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyActiveOperationTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyActiveOperationTaskResponseBody</p>
 */
public class ModifyActiveOperationTaskResponseBody extends TeaModel {
    @NameInMap("Ids")
    private String ids;

    @NameInMap("RequestId")
    private String requestId;

    private ModifyActiveOperationTaskResponseBody(Builder builder) {
        this.ids = builder.ids;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyActiveOperationTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ids; 
        private String requestId; 

        /**
         * The scheduled switchover time to be specified. Specify the time in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
         * <p>
         * 
         * >  The time cannot be later than the latest operation time. You can call the [DescribeActiveOperationTask](~~197387~~) operation. The **Deadline** parameter in the response indicates the latest operation time.
         */
        public Builder ids(String ids) {
            this.ids = ids;
            return this;
        }

        /**
         * Modifies the scheduled switchover time of an operations and maintenance (O&M) task.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyActiveOperationTaskResponseBody build() {
            return new ModifyActiveOperationTaskResponseBody(this);
        } 

    } 

}
