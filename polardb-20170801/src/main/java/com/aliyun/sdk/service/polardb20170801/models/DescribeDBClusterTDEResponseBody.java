// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeDBClusterTDEResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterTDEResponseBody</p>
 */
public class DescribeDBClusterTDEResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutomaticRotation")
    private String automaticRotation;

    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("EncryptNewTables")
    private String encryptNewTables;

    @com.aliyun.core.annotation.NameInMap("EncryptionKey")
    private String encryptionKey;

    @com.aliyun.core.annotation.NameInMap("EncryptionKeyStatus")
    private String encryptionKeyStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RotationInterval")
    private String rotationInterval;

    @com.aliyun.core.annotation.NameInMap("TDERegion")
    private String TDERegion;

    @com.aliyun.core.annotation.NameInMap("TDEStatus")
    private String TDEStatus;

    private DescribeDBClusterTDEResponseBody(Builder builder) {
        this.automaticRotation = builder.automaticRotation;
        this.DBClusterId = builder.DBClusterId;
        this.encryptNewTables = builder.encryptNewTables;
        this.encryptionKey = builder.encryptionKey;
        this.encryptionKeyStatus = builder.encryptionKeyStatus;
        this.requestId = builder.requestId;
        this.rotationInterval = builder.rotationInterval;
        this.TDERegion = builder.TDERegion;
        this.TDEStatus = builder.TDEStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterTDEResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return automaticRotation
     */
    public String getAutomaticRotation() {
        return this.automaticRotation;
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
     * @return encryptionKeyStatus
     */
    public String getEncryptionKeyStatus() {
        return this.encryptionKeyStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rotationInterval
     */
    public String getRotationInterval() {
        return this.rotationInterval;
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
        private String automaticRotation; 
        private String DBClusterId; 
        private String encryptNewTables; 
        private String encryptionKey; 
        private String encryptionKeyStatus; 
        private String requestId; 
        private String rotationInterval; 
        private String TDERegion; 
        private String TDEStatus; 

        private Builder() {
        } 

        private Builder(DescribeDBClusterTDEResponseBody model) {
            this.automaticRotation = model.automaticRotation;
            this.DBClusterId = model.DBClusterId;
            this.encryptNewTables = model.encryptNewTables;
            this.encryptionKey = model.encryptionKey;
            this.encryptionKeyStatus = model.encryptionKeyStatus;
            this.requestId = model.requestId;
            this.rotationInterval = model.rotationInterval;
            this.TDERegion = model.TDERegion;
            this.TDEStatus = model.TDEStatus;
        } 

        /**
         * <p>Indicates whether automatic key rotation is allowed. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Automatic key rotation is allowed.</li>
         * <li><strong>Disabled</strong>: Automatic key rotation is not allowed.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned only for a PolarDB for PostgreSQL or PolarDB for PostgreSQL (Compatible with Oracle) cluster.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder automaticRotation(String automaticRotation) {
            this.automaticRotation = automaticRotation;
            return this;
        }

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-***************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>Indicates whether automatic encryption is enabled for new tables. Valid values:</p>
         * <ul>
         * <li><strong>ON</strong></li>
         * <li><strong>OFF</strong></li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned only for a PolarDB for MySQL cluster.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        public Builder encryptNewTables(String encryptNewTables) {
            this.encryptNewTables = encryptNewTables;
            return this;
        }

        /**
         * <p>The ID of the custom key.</p>
         * 
         * <strong>example:</strong>
         * <p>2a4f4ac2-<strong><strong>-</strong></strong>-<strong><strong>-</strong></strong>********</p>
         */
        public Builder encryptionKey(String encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * EncryptionKeyStatus.
         */
        public Builder encryptionKeyStatus(String encryptionKeyStatus) {
            this.encryptionKeyStatus = encryptionKeyStatus;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E37D1508-EC3B-4E06-A24A-C7AC31******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The automatic key rotation period configured in Key Management Service (KMS). If no automatic key rotation period is configured, 0s is returned. Unit: seconds.</p>
         * <p>For example, if the rotation period is set to 7 days, 604800s is returned.</p>
         * <blockquote>
         * <p> This parameter is returned only for a PolarDB for PostgreSQL or PolarDB for PostgreSQL (Compatible with Oracle) cluster whose AutomaticRotation parameter is set to Enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>604800s</p>
         */
        public Builder rotationInterval(String rotationInterval) {
            this.rotationInterval = rotationInterval;
            return this;
        }

        /**
         * <p>The region where the TDE key resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder TDERegion(String TDERegion) {
            this.TDERegion = TDERegion;
            return this;
        }

        /**
         * <p>Indicates whether TDE encryption is enabled. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong></li>
         * <li><strong>Disabled</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
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
