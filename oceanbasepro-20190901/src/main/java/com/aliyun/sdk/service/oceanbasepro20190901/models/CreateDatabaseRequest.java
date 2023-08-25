// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDatabaseRequest} extends {@link RequestModel}
 *
 * <p>CreateDatabaseRequest</p>
 */
public class CreateDatabaseRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("Collation")
    private String collation;

    @Body
    @NameInMap("DatabaseName")
    @Validation(required = true)
    private String databaseName;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("Encoding")
    @Validation(required = true)
    private String encoding;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    private CreateDatabaseRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.collation = builder.collation;
        this.databaseName = builder.databaseName;
        this.description = builder.description;
        this.encoding = builder.encoding;
        this.instanceId = builder.instanceId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatabaseRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return collation
     */
    public String getCollation() {
        return this.collation;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return encoding
     */
    public String getEncoding() {
        return this.encoding;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<CreateDatabaseRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private String collation; 
        private String databaseName; 
        private String description; 
        private String encoding; 
        private String instanceId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDatabaseRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.collation = request.collation;
            this.databaseName = request.databaseName;
            this.description = request.description;
            this.encoding = request.encoding;
            this.instanceId = request.instanceId;
            this.tenantId = request.tenantId;
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
         * The name of the database.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The encoding standard of the database.
         * <p>
         * For more information, see the Charset field returned by the DescribeCharset operation.
         */
        public Builder collation(String collation) {
            this.putBodyParameter("Collation", collation);
            this.collation = collation;
            return this;
        }

        /**
         * Alibaba Cloud CLI
         */
        public Builder databaseName(String databaseName) {
            this.putBodyParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * The operation that you want to perform.   
         * <p>
         * Set the value to **CreateDatabase**.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the tenant.
         */
        public Builder encoding(String encoding) {
            this.putBodyParameter("Encoding", encoding);
            this.encoding = encoding;
            return this;
        }

        /**
         * The collation.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the database.   
         * <p>
         * You cannot use reserved keywords, such as test and mysql.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public CreateDatabaseRequest build() {
            return new CreateDatabaseRequest(this);
        } 

    } 

}
