// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CancelActiveOperationTasksResponseBody} extends {@link TeaModel}
 *
 * <p>CancelActiveOperationTasksResponseBody</p>
 */
public class CancelActiveOperationTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ids")
    private String ids;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CancelActiveOperationTasksResponseBody(Builder builder) {
        this.ids = builder.ids;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelActiveOperationTasksResponseBody create() {
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
         * <p>The IDs of the tasks that are canceled. Multiple task IDs are separated with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>188****,188****,188****</p>
         */
        public Builder ids(String ids) {
            this.ids = ids;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A807C95D-410C-5BB5-96C0-C6E09F2C3D36</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CancelActiveOperationTasksResponseBody build() {
            return new CancelActiveOperationTasksResponseBody(this);
        } 

    } 

}
