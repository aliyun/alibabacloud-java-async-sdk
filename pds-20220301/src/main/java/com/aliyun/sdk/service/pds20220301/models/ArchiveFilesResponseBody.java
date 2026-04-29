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
 * {@link ArchiveFilesResponseBody} extends {@link TeaModel}
 *
 * <p>ArchiveFilesResponseBody</p>
 */
public class ArchiveFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("async_task_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String asyncTaskId;

    private ArchiveFilesResponseBody(Builder builder) {
        this.asyncTaskId = builder.asyncTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ArchiveFilesResponseBody create() {
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

        private Builder(ArchiveFilesResponseBody model) {
            this.asyncTaskId = model.asyncTaskId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>000e89fb-cf8f-11e9-8ab4-b6e980803a3b</p>
         */
        public Builder asyncTaskId(String asyncTaskId) {
            this.asyncTaskId = asyncTaskId;
            return this;
        }

        public ArchiveFilesResponseBody build() {
            return new ArchiveFilesResponseBody(this);
        } 

    } 

}
