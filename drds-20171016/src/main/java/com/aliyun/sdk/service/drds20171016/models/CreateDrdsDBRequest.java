// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20171016.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDrdsDBRequest} extends {@link RequestModel}
 *
 * <p>CreateDrdsDBRequest</p>
 */
public class CreateDrdsDBRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Encode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String encode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RdsInstances")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rdsInstances;

    private CreateDrdsDBRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.encode = builder.encode;
        this.password = builder.password;
        this.rdsInstances = builder.rdsInstances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDrdsDBRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return encode
     */
    public String getEncode() {
        return this.encode;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return rdsInstances
     */
    public String getRdsInstances() {
        return this.rdsInstances;
    }

    public static final class Builder extends Request.Builder<CreateDrdsDBRequest, Builder> {
        private String dbName; 
        private String drdsInstanceId; 
        private String encode; 
        private String password; 
        private String rdsInstances; 

        private Builder() {
            super();
        } 

        private Builder(CreateDrdsDBRequest request) {
            super(request);
            this.dbName = request.dbName;
            this.drdsInstanceId = request.drdsInstanceId;
            this.encode = request.encode;
            this.password = request.password;
            this.rdsInstances = request.rdsInstances;
        } 

        /**
         * DbName.
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * DrdsInstanceId.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * Encode.
         */
        public Builder encode(String encode) {
            this.putQueryParameter("Encode", encode);
            this.encode = encode;
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
         * RdsInstances.
         */
        public Builder rdsInstances(String rdsInstances) {
            this.putQueryParameter("RdsInstances", rdsInstances);
            this.rdsInstances = rdsInstances;
            return this;
        }

        @Override
        public CreateDrdsDBRequest build() {
            return new CreateDrdsDBRequest(this);
        } 

    } 

}
