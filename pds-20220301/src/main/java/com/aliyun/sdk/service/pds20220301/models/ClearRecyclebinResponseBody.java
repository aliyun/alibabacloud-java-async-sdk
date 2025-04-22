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
 * {@link ClearRecyclebinResponseBody} extends {@link TeaModel}
 *
 * <p>ClearRecyclebinResponseBody</p>
 */
public class ClearRecyclebinResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("async_task_id")
    private String asyncTaskId;

    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    private ClearRecyclebinResponseBody(Builder builder) {
        this.asyncTaskId = builder.asyncTaskId;
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClearRecyclebinResponseBody create() {
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

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    public static final class Builder {
        private String asyncTaskId; 
        private String domainId; 
        private String driveId; 

        private Builder() {
        } 

        private Builder(ClearRecyclebinResponseBody model) {
            this.asyncTaskId = model.asyncTaskId;
            this.domainId = model.domainId;
            this.driveId = model.driveId;
        } 

        /**
         * <p>The ID of the asynchronous task.</p>
         * <p>You can call the GetAsyncTask operation to query the information about the asynchronous task based on the task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>13ebd3a24dba4166b1527add676ef2866051b4d5dele16</p>
         */
        public Builder asyncTaskId(String asyncTaskId) {
            this.asyncTaskId = asyncTaskId;
            return this;
        }

        /**
         * <p>The domain ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bj1</p>
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The drive ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder driveId(String driveId) {
            this.driveId = driveId;
            return this;
        }

        public ClearRecyclebinResponseBody build() {
            return new ClearRecyclebinResponseBody(this);
        } 

    } 

}
