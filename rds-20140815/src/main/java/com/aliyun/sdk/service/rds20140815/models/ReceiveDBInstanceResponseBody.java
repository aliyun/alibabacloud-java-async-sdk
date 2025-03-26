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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ReceiveDBInstanceResponseBody model) {
            this.guardDBInstanceId = model.guardDBInstanceId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the disaster recovery instance after the switchover.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-tr2whku*****</p>
         */
        public Builder guardDBInstanceId(String guardDBInstanceId) {
            this.guardDBInstanceId = guardDBInstanceId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EFB6083A-7699-489B-8278-C0CB4793A96E</p>
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
