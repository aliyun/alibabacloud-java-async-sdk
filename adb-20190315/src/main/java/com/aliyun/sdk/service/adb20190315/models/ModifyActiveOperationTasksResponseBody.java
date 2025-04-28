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

        private Builder(ModifyActiveOperationTasksResponseBody model) {
            this.ids = model.ids;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The O&amp;M event IDs that are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ids(String ids) {
            this.ids = ids;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8B709A33-5E8D-511F-A225-AFC0B6AAAD76</p>
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
