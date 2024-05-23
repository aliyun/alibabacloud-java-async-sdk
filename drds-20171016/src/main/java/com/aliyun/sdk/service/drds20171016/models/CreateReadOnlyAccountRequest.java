// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20171016.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateReadOnlyAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateReadOnlyAccountRequest</p>
 */
public class CreateReadOnlyAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

    private CreateReadOnlyAccountRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.password = builder.password;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReadOnlyAccountRequest create() {
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
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    public static final class Builder extends Request.Builder<CreateReadOnlyAccountRequest, Builder> {
        private String dbName; 
        private String drdsInstanceId; 
        private String password; 

        private Builder() {
            super();
        } 

        private Builder(CreateReadOnlyAccountRequest request) {
            super(request);
            this.dbName = request.dbName;
            this.drdsInstanceId = request.drdsInstanceId;
            this.password = request.password;
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
         * password.
         */
        public Builder password(String password) {
            this.putQueryParameter("password", password);
            this.password = password;
            return this;
        }

        @Override
        public CreateReadOnlyAccountRequest build() {
            return new CreateReadOnlyAccountRequest(this);
        } 

    } 

}
