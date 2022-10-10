// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterTDEResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterTDEResponseBody</p>
 */
public class DescribeDBClusterTDEResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    private String DBClusterId;

    @NameInMap("EncryptNewTables")
    private String encryptNewTables;

    @NameInMap("EncryptionKey")
    private String encryptionKey;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TDERegion")
    private String TDERegion;

    @NameInMap("TDEStatus")
    private String TDEStatus;

    private DescribeDBClusterTDEResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.encryptNewTables = builder.encryptNewTables;
        this.encryptionKey = builder.encryptionKey;
        this.requestId = builder.requestId;
        this.TDERegion = builder.TDERegion;
        this.TDEStatus = builder.TDEStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterTDEResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return encryptNewTables
     */
    public String getEncryptNewTables() {
        return this.encryptNewTables;
    }

    /**
     * @return encryptionKey
     */
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return TDERegion
     */
    public String getTDERegion() {
        return this.TDERegion;
    }

    /**
     * @return TDEStatus
     */
    public String getTDEStatus() {
        return this.TDEStatus;
    }

    public static final class Builder {
        private String DBClusterId; 
        private String encryptNewTables; 
        private String encryptionKey; 
        private String requestId; 
        private String TDERegion; 
        private String TDEStatus; 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * EncryptNewTables.
         */
        public Builder encryptNewTables(String encryptNewTables) {
            this.encryptNewTables = encryptNewTables;
            return this;
        }

        /**
         * EncryptionKey.
         */
        public Builder encryptionKey(String encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TDERegion.
         */
        public Builder TDERegion(String TDERegion) {
            this.TDERegion = TDERegion;
            return this;
        }

        /**
         * TDEStatus.
         */
        public Builder TDEStatus(String TDEStatus) {
            this.TDEStatus = TDEStatus;
            return this;
        }

        public DescribeDBClusterTDEResponseBody build() {
            return new DescribeDBClusterTDEResponseBody(this);
        } 

    } 

}
