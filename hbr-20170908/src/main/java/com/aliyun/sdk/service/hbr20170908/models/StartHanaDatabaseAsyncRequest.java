// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StartHanaDatabaseAsyncRequest} extends {@link RequestModel}
 *
 * <p>StartHanaDatabaseAsyncRequest</p>
 */
public class StartHanaDatabaseAsyncRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VaultId")
    private String vaultId;

    private StartHanaDatabaseAsyncRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.databaseName = builder.databaseName;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartHanaDatabaseAsyncRequest create() {
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

    public static final class Builder extends Request.Builder<StartHanaDatabaseAsyncRequest, Builder> {
        private String clusterId; 
        private String databaseName; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(StartHanaDatabaseAsyncRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.databaseName = request.databaseName;
            this.vaultId = request.vaultId;
        } 

        /**
         * <p>The ID of the SAP HANA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cl-000a9ipe******sme</p>
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
         * <p>HXE</p>
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * <p>The ID of the backup vault.</p>
         * 
         * <strong>example:</strong>
         * <p>v-0000hrh******vhr3i</p>
         */
        public Builder vaultId(String vaultId) {
            this.putQueryParameter("VaultId", vaultId);
            this.vaultId = vaultId;
            return this;
        }

        @Override
        public StartHanaDatabaseAsyncRequest build() {
            return new StartHanaDatabaseAsyncRequest(this);
        } 

    } 

}
