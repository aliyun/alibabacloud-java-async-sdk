// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReceiveDBInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ReceiveDBInstanceResponseBody</p>
 */
public class ReceiveDBInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GuardDBInstanceId")
    private String guardDBInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ReceiveDBInstanceResponseBody(Builder builder) {
        this.guardDBInstanceId = builder.guardDBInstanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReceiveDBInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return guardDBInstanceId
     */
    public String getGuardDBInstanceId() {
        return this.guardDBInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String guardDBInstanceId; 
        private String requestId; 

        /**
         * The ID of the disaster recovery instance after the switchover.
         */
        public Builder guardDBInstanceId(String guardDBInstanceId) {
            this.guardDBInstanceId = guardDBInstanceId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ReceiveDBInstanceResponseBody build() {
            return new ReceiveDBInstanceResponseBody(this);
        } 

    } 

}
