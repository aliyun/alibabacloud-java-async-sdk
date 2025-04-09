// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link TransferClusterBackupResponseBody} extends {@link TeaModel}
 *
 * <p>TransferClusterBackupResponseBody</p>
 */
public class TransferClusterBackupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlreadyDone")
    private String alreadyDone;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(TransferClusterBackupResponseBody model) {
            this.alreadyDone = model.alreadyDone;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether the instance is switched to the cluster backup mode. If the value of this parameter is <strong>1</strong>, the instance is switched to the cluster backup mode.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder alreadyDone(String alreadyDone) {
            this.alreadyDone = alreadyDone;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3C4A2494-85C4-45C5-93CF-548DB3375193</p>
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
