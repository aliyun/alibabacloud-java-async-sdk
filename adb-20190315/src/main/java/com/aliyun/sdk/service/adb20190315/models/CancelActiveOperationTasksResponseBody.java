// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CancelActiveOperationTasksResponseBody model) {
            this.ids = model.ids;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>am-xxxxxxxx</p>
         */
        public Builder ids(String ids) {
            this.ids = ids;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>642F3512-C628-5D0C-8815-F6670CEA00D4</p>
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
