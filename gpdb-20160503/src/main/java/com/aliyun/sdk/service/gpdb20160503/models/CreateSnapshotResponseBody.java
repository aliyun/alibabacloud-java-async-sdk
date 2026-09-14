// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link CreateSnapshotResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSnapshotResponseBody</p>
 */
public class CreateSnapshotResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BranchId")
    private String branchId;

    @com.aliyun.core.annotation.NameInMap("Lsn")
    private String lsn;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private String timestamp;

    private CreateSnapshotResponseBody(Builder builder) {
        this.branchId = builder.branchId;
        this.lsn = builder.lsn;
        this.requestId = builder.requestId;
        this.timestamp = builder.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSnapshotResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return branchId
     */
    public String getBranchId() {
        return this.branchId;
    }

    /**
     * @return lsn
     */
    public String getLsn() {
        return this.lsn;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return timestamp
     */
    public String getTimestamp() {
        return this.timestamp;
    }

    public static final class Builder {
        private String branchId; 
        private String lsn; 
        private String requestId; 
        private String timestamp; 

        private Builder() {
        } 

        private Builder(CreateSnapshotResponseBody model) {
            this.branchId = model.branchId;
            this.lsn = model.lsn;
            this.requestId = model.requestId;
            this.timestamp = model.timestamp;
        } 

        /**
         * <p>The branch ID to which the snapshot belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>br-xxxx</p>
         */
        public Builder branchId(String branchId) {
            this.branchId = branchId;
            return this;
        }

        /**
         * <p>The LSN for the snapshot. You must specify either this parameter or SnapshotTimestamp. If this parameter is specified, the snapshot is created based on the specified LSN.</p>
         * 
         * <strong>example:</strong>
         * <p>0/3522648</p>
         */
        public Builder lsn(String lsn) {
            this.lsn = lsn;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The actual point in time corresponding to the created snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-08T09:11:12Z</p>
         */
        public Builder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public CreateSnapshotResponseBody build() {
            return new CreateSnapshotResponseBody(this);
        } 

    } 

}
