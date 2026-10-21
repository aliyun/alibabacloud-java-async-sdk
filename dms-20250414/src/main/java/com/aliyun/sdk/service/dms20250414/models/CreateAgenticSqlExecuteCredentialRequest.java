// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link CreateAgenticSqlExecuteCredentialRequest} extends {@link RequestModel}
 *
 * <p>CreateAgenticSqlExecuteCredentialRequest</p>
 */
public class CreateAgenticSqlExecuteCredentialRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CatalogName")
    private String catalogName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CatalogUuid")
    private String catalogUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseUuid")
    private String databaseUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QualifiedName")
    private String qualifiedName;

    private CreateAgenticSqlExecuteCredentialRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogName = builder.catalogName;
        this.catalogUuid = builder.catalogUuid;
        this.databaseUuid = builder.databaseUuid;
        this.qualifiedName = builder.qualifiedName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgenticSqlExecuteCredentialRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return catalogName
     */
    public String getCatalogName() {
        return this.catalogName;
    }

    /**
     * @return catalogUuid
     */
    public String getCatalogUuid() {
        return this.catalogUuid;
    }

    /**
     * @return databaseUuid
     */
    public String getDatabaseUuid() {
        return this.databaseUuid;
    }

    /**
     * @return qualifiedName
     */
    public String getQualifiedName() {
        return this.qualifiedName;
    }

    public static final class Builder extends Request.Builder<CreateAgenticSqlExecuteCredentialRequest, Builder> {
        private String regionId; 
        private String catalogName; 
        private String catalogUuid; 
        private String databaseUuid; 
        private String qualifiedName; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgenticSqlExecuteCredentialRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogName = request.catalogName;
            this.catalogUuid = request.catalogUuid;
            this.databaseUuid = request.databaseUuid;
            this.qualifiedName = request.qualifiedName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1xxxxxxxx</p>
         */
        public Builder catalogName(String catalogName) {
            this.putQueryParameter("CatalogName", catalogName);
            this.catalogName = catalogName;
            return this;
        }

        /**
         * <p>The UUID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>9f8e7d6c-xxxx-xxxx-xxxx-1a2b3c4d5e6f</p>
         */
        public Builder catalogUuid(String catalogUuid) {
            this.putQueryParameter("CatalogUuid", catalogUuid);
            this.catalogUuid = catalogUuid;
            return this;
        }

        /**
         * <p>The UUID of the database. If you specify this parameter, the credential is restricted to this database. You can call the ListDatabases operation to obtain the UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>6c4e8a2b-xxxx-xxxx-xxxx-0f1d2e3c4b5a</p>
         */
        public Builder databaseUuid(String databaseUuid) {
            this.putQueryParameter("DatabaseUuid", databaseUuid);
            this.databaseUuid = databaseUuid;
            return this;
        }

        /**
         * <p>The fully qualified name of the database. This parameter must be used together with CatalogUuid or CatalogName.</p>
         * <ul>
         * <li>MySQL database: The value is the same as the database name.</li>
         * <li>PostgreSQL database or other databases with schemas: The value is in the database.schema format.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test_db</p>
         */
        public Builder qualifiedName(String qualifiedName) {
            this.putQueryParameter("QualifiedName", qualifiedName);
            this.qualifiedName = qualifiedName;
            return this;
        }

        @Override
        public CreateAgenticSqlExecuteCredentialRequest build() {
            return new CreateAgenticSqlExecuteCredentialRequest(this);
        } 

    } 

}
