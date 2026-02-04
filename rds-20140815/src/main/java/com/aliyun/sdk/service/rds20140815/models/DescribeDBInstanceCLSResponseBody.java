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
 * {@link DescribeDBInstanceCLSResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceCLSResponseBody</p>
 */
public class DescribeDBInstanceCLSResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    private String algorithm;

    @com.aliyun.core.annotation.NameInMap("EncryptionKey")
    private String encryptionKey;

    @com.aliyun.core.annotation.NameInMap("EncryptionKeyMode")
    private String encryptionKeyMode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WhiteListMode")
    private Boolean whiteListMode;

    private DescribeDBInstanceCLSResponseBody(Builder builder) {
        this.algorithm = builder.algorithm;
        this.encryptionKey = builder.encryptionKey;
        this.encryptionKeyMode = builder.encryptionKeyMode;
        this.requestId = builder.requestId;
        this.whiteListMode = builder.whiteListMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceCLSResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithm
     */
    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * @return encryptionKey
     */
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * @return encryptionKeyMode
     */
    public String getEncryptionKeyMode() {
        return this.encryptionKeyMode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return whiteListMode
     */
    public Boolean getWhiteListMode() {
        return this.whiteListMode;
    }

    public static final class Builder {
        private String algorithm; 
        private String encryptionKey; 
        private String encryptionKeyMode; 
        private String requestId; 
        private Boolean whiteListMode; 

        private Builder() {
        } 

        private Builder(DescribeDBInstanceCLSResponseBody model) {
            this.algorithm = model.algorithm;
            this.encryptionKey = model.encryptionKey;
            this.encryptionKeyMode = model.encryptionKeyMode;
            this.requestId = model.requestId;
            this.whiteListMode = model.whiteListMode;
        } 

        /**
         * Algorithm.
         */
        public Builder algorithm(String algorithm) {
            this.algorithm = algorithm;
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
         * EncryptionKeyMode.
         */
        public Builder encryptionKeyMode(String encryptionKeyMode) {
            this.encryptionKeyMode = encryptionKeyMode;
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
         * WhiteListMode.
         */
        public Builder whiteListMode(Boolean whiteListMode) {
            this.whiteListMode = whiteListMode;
            return this;
        }

        public DescribeDBInstanceCLSResponseBody build() {
            return new DescribeDBInstanceCLSResponseBody(this);
        } 

    } 

}
