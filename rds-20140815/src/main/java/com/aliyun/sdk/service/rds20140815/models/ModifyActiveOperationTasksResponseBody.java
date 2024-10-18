// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyActiveOperationTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyActiveOperationTasksResponseBody</p>
 */
public class ModifyActiveOperationTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ids")
    private String ids;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyActiveOperationTasksResponseBody(Builder builder) {
        this.ids = builder.ids;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyActiveOperationTasksResponseBody create() {
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
         * <p>The ID of the O&amp;M task. IDs are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>11111,22222</p>
         */
        public Builder ids(String ids) {
            this.ids = ids;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>E9ADB6BE-1598-57FC-B86D-D7F4C69B****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyActiveOperationTasksResponseBody build() {
            return new ModifyActiveOperationTasksResponseBody(this);
        } 

    } 

}
