// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link CreateRestoreTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRestoreTaskResponseBody</p>
 */
public class CreateRestoreTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RestoreTaskId")
    private String restoreTaskId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private CreateRestoreTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.restoreTaskId = builder.restoreTaskId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRestoreTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return restoreTaskId
     */
    public String getRestoreTaskId() {
        return this.restoreTaskId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String requestId; 
        private String restoreTaskId; 
        private String status; 

        private Builder() {
        } 

        private Builder(CreateRestoreTaskResponseBody model) {
            this.requestId = model.requestId;
            this.restoreTaskId = model.restoreTaskId;
            this.status = model.status;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>13FE89A5-C036-56BF-A0FF-A31C59819FD7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the restore task.</p>
         * 
         * <strong>example:</strong>
         * <p>restore-fdsafda</p>
         */
        public Builder restoreTaskId(String restoreTaskId) {
            this.restoreTaskId = restoreTaskId;
            return this;
        }

        /**
         * <p>The status of the service instance. Valid values:</p>
         * <ul>
         * <li>Restoring</li>
         * <li>Restored</li>
         * <li>RestoreFailed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Restoring</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CreateRestoreTaskResponseBody build() {
            return new CreateRestoreTaskResponseBody(this);
        } 

    } 

}
