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
 * {@link EnableBackupEncryptionResponseBody} extends {@link TeaModel}
 *
 * <p>EnableBackupEncryptionResponseBody</p>
 */
public class EnableBackupEncryptionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private EnableBackupEncryptionResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableBackupEncryptionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(EnableBackupEncryptionResponseBody model) {
            this.DBInstanceId = model.DBInstanceId;
            this.requestId = model.requestId;
        } 

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EnableBackupEncryptionResponseBody build() {
            return new EnableBackupEncryptionResponseBody(this);
        } 

    } 

}
