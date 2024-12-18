// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link CreateRCSnapshotResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRCSnapshotResponseBody</p>
 */
public class CreateRCSnapshotResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnapshotId")
    private String snapshotId;

    private CreateRCSnapshotResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.snapshotId = builder.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRCSnapshotResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public static final class Builder {
        private String requestId; 
        private String snapshotId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CE93CC0D-B65D-5723-AAB1-08CB8BBABAB9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The snapshot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rcds-7mbefjzkqccvdev****</p>
         */
        public Builder snapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }

        public CreateRCSnapshotResponseBody build() {
            return new CreateRCSnapshotResponseBody(this);
        } 

    } 

}
