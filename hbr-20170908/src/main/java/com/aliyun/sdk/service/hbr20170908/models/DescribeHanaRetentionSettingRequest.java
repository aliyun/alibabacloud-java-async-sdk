// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link DescribeHanaRetentionSettingRequest} extends {@link RequestModel}
 *
 * <p>DescribeHanaRetentionSettingRequest</p>
 */
public class DescribeHanaRetentionSettingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseName")
    private String databaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VaultId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vaultId;

    private DescribeHanaRetentionSettingRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.databaseName = builder.databaseName;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHanaRetentionSettingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return vaultId
     */
    public String getVaultId() {
        return this.vaultId;
    }

    public static final class Builder extends Request.Builder<DescribeHanaRetentionSettingRequest, Builder> {
        private String clusterId; 
        private String databaseName; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHanaRetentionSettingRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.databaseName = request.databaseName;
            this.vaultId = request.vaultId;
        } 

        /**
         * <p>The ID of the SAP HANA instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cl-0002ys1i******wwtf</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>C4P</p>
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * <p>The ID of the backup vault.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v-000ii8t******ntrt2</p>
         */
        public Builder vaultId(String vaultId) {
            this.putQueryParameter("VaultId", vaultId);
            this.vaultId = vaultId;
            return this;
        }

        @Override
        public DescribeHanaRetentionSettingRequest build() {
            return new DescribeHanaRetentionSettingRequest(this);
        } 

    } 

}
