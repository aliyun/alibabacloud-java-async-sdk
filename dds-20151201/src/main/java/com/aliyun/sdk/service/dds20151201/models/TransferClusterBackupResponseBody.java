// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransferClusterBackupResponseBody} extends {@link TeaModel}
 *
 * <p>TransferClusterBackupResponseBody</p>
 */
public class TransferClusterBackupResponseBody extends TeaModel {
    @NameInMap("AlreadyDone")
    private String alreadyDone;

    @NameInMap("RequestId")
    private String requestId;

    private TransferClusterBackupResponseBody(Builder builder) {
        this.alreadyDone = builder.alreadyDone;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferClusterBackupResponseBody create() {
        return builder().build();
    }

    /**
     * @return alreadyDone
     */
    public String getAlreadyDone() {
        return this.alreadyDone;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String alreadyDone; 
        private String requestId; 

        /**
         * Indicates whether the instance is switched to the cluster backup mode. If the value of this parameter is **1**, the instance is switched to the cluster backup mode.
         */
        public Builder alreadyDone(String alreadyDone) {
            this.alreadyDone = alreadyDone;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public TransferClusterBackupResponseBody build() {
            return new TransferClusterBackupResponseBody(this);
        } 

    } 

}
