// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link AuditLogExportResponseBody} extends {@link TeaModel}
 *
 * <p>AuditLogExportResponseBody</p>
 */
public class AuditLogExportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("async_task_id")
    private String asyncTaskId;

    private AuditLogExportResponseBody(Builder builder) {
        this.asyncTaskId = builder.asyncTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuditLogExportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asyncTaskId
     */
    public String getAsyncTaskId() {
        return this.asyncTaskId;
    }

    public static final class Builder {
        private String asyncTaskId; 

        private Builder() {
        } 

        private Builder(AuditLogExportResponseBody model) {
            this.asyncTaskId = model.asyncTaskId;
        } 

        /**
         * <p>The ID of the asynchronous task used to export audit logs.</p>
         * 
         * <strong>example:</strong>
         * <p>4221bf6e6ab43c255edc4463bf3a6f5f5d31****</p>
         */
        public Builder asyncTaskId(String asyncTaskId) {
            this.asyncTaskId = asyncTaskId;
            return this;
        }

        public AuditLogExportResponseBody build() {
            return new AuditLogExportResponseBody(this);
        } 

    } 

}
