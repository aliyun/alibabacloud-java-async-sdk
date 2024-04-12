// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDatabaseAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateDatabaseAccountRequest</p>
 */
public class CreateDatabaseAccountRequest extends Request {
    @Query
    @NameInMap("DatabaseAccountName")
    @Validation(required = true)
    private String databaseAccountName;

    @Query
    @NameInMap("DatabaseId")
    @Validation(required = true)
    private String databaseId;

    @Query
    @NameInMap("DatabaseSchema")
    private String databaseSchema;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("LoginAttribute")
    private String loginAttribute;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private CreateDatabaseAccountRequest(Builder builder) {
        super(builder);
        this.databaseAccountName = builder.databaseAccountName;
        this.databaseId = builder.databaseId;
        this.databaseSchema = builder.databaseSchema;
        this.instanceId = builder.instanceId;
        this.loginAttribute = builder.loginAttribute;
        this.password = builder.password;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatabaseAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databaseAccountName
     */
    public String getDatabaseAccountName() {
        return this.databaseAccountName;
    }

    /**
     * @return databaseId
     */
    public String getDatabaseId() {
        return this.databaseId;
    }

    /**
     * @return databaseSchema
     */
    public String getDatabaseSchema() {
        return this.databaseSchema;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return loginAttribute
     */
    public String getLoginAttribute() {
        return this.loginAttribute;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateDatabaseAccountRequest, Builder> {
        private String databaseAccountName; 
        private String databaseId; 
        private String databaseSchema; 
        private String instanceId; 
        private String loginAttribute; 
        private String password; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDatabaseAccountRequest request) {
            super(request);
            this.databaseAccountName = request.databaseAccountName;
            this.databaseId = request.databaseId;
            this.databaseSchema = request.databaseSchema;
            this.instanceId = request.instanceId;
            this.loginAttribute = request.loginAttribute;
            this.password = request.password;
            this.regionId = request.regionId;
        } 

        /**
         * DatabaseAccountName.
         */
        public Builder databaseAccountName(String databaseAccountName) {
            this.putQueryParameter("DatabaseAccountName", databaseAccountName);
            this.databaseAccountName = databaseAccountName;
            return this;
        }

        /**
         * DatabaseId.
         */
        public Builder databaseId(String databaseId) {
            this.putQueryParameter("DatabaseId", databaseId);
            this.databaseId = databaseId;
            return this;
        }

        /**
         * DatabaseSchema.
         */
        public Builder databaseSchema(String databaseSchema) {
            this.putQueryParameter("DatabaseSchema", databaseSchema);
            this.databaseSchema = databaseSchema;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * LoginAttribute.
         */
        public Builder loginAttribute(String loginAttribute) {
            this.putQueryParameter("LoginAttribute", loginAttribute);
            this.loginAttribute = loginAttribute;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateDatabaseAccountRequest build() {
            return new CreateDatabaseAccountRequest(this);
        } 

    } 

}
