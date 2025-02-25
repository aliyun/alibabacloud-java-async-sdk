// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20171016.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDrdsDBPasswdRequest} extends {@link RequestModel}
 *
 * <p>ModifyDrdsDBPasswdRequest</p>
 */
public class ModifyDrdsDBPasswdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewPasswd")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newPasswd;

    private ModifyDrdsDBPasswdRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.newPasswd = builder.newPasswd;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDrdsDBPasswdRequest create() {
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
     * @return newPasswd
     */
    public String getNewPasswd() {
        return this.newPasswd;
    }

    public static final class Builder extends Request.Builder<ModifyDrdsDBPasswdRequest, Builder> {
        private String dbName; 
        private String drdsInstanceId; 
        private String newPasswd; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDrdsDBPasswdRequest request) {
            super(request);
            this.dbName = request.dbName;
            this.drdsInstanceId = request.drdsInstanceId;
            this.newPasswd = request.newPasswd;
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
         * NewPasswd.
         */
        public Builder newPasswd(String newPasswd) {
            this.putQueryParameter("NewPasswd", newPasswd);
            this.newPasswd = newPasswd;
            return this;
        }

        @Override
        public ModifyDrdsDBPasswdRequest build() {
            return new ModifyDrdsDBPasswdRequest(this);
        } 

    } 

}
