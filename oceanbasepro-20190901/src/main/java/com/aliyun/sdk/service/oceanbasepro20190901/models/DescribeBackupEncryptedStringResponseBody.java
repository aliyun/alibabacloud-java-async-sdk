// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeBackupEncryptedStringResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupEncryptedStringResponseBody</p>
 */
public class DescribeBackupEncryptedStringResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeBackupEncryptedStringResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupEncryptedStringResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupEncryptedStringResponseBody build() {
            return new DescribeBackupEncryptedStringResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackupEncryptedStringResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupEncryptedStringResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupInfoJson")
        private String backupInfoJson;

        private Data(Builder builder) {
            this.backupInfoJson = builder.backupInfoJson;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return backupInfoJson
         */
        public String getBackupInfoJson() {
            return this.backupInfoJson;
        }

        public static final class Builder {
            private String backupInfoJson; 

            /**
             * BackupInfoJson.
             */
            public Builder backupInfoJson(String backupInfoJson) {
                this.backupInfoJson = backupInfoJson;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
