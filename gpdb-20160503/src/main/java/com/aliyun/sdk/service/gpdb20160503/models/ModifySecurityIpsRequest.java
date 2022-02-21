// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySecurityIpsRequest} extends {@link RequestModel}
 *
 * <p>ModifySecurityIpsRequest</p>
 */
public class ModifySecurityIpsRequest extends Request {
    @Query
    @NameInMap("DBInstanceIPArrayAttribute")
    private String DBInstanceIPArrayAttribute;

    @Query
    @NameInMap("DBInstanceIPArrayName")
    private String DBInstanceIPArrayName;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("SecurityIPList")
    @Validation(required = true)
    private String securityIPList;

    private ModifySecurityIpsRequest(Builder builder) {
        super(builder);
        this.DBInstanceIPArrayAttribute = builder.DBInstanceIPArrayAttribute;
        this.DBInstanceIPArrayName = builder.DBInstanceIPArrayName;
        this.DBInstanceId = builder.DBInstanceId;
        this.securityIPList = builder.securityIPList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySecurityIpsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceIPArrayAttribute
     */
    public String getDBInstanceIPArrayAttribute() {
        return this.DBInstanceIPArrayAttribute;
    }

    /**
     * @return DBInstanceIPArrayName
     */
    public String getDBInstanceIPArrayName() {
        return this.DBInstanceIPArrayName;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return securityIPList
     */
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public static final class Builder extends Request.Builder<ModifySecurityIpsRequest, Builder> {
        private String DBInstanceIPArrayAttribute; 
        private String DBInstanceIPArrayName; 
        private String DBInstanceId; 
        private String securityIPList; 

        private Builder() {
            super();
        } 

        private Builder(ModifySecurityIpsRequest response) {
            super(response);
            this.DBInstanceIPArrayAttribute = response.DBInstanceIPArrayAttribute;
            this.DBInstanceIPArrayName = response.DBInstanceIPArrayName;
            this.DBInstanceId = response.DBInstanceId;
            this.securityIPList = response.securityIPList;
        } 

        /**
         * DBInstanceIPArrayAttribute.
         */
        public Builder DBInstanceIPArrayAttribute(String DBInstanceIPArrayAttribute) {
            this.putQueryParameter("DBInstanceIPArrayAttribute", DBInstanceIPArrayAttribute);
            this.DBInstanceIPArrayAttribute = DBInstanceIPArrayAttribute;
            return this;
        }

        /**
         * DBInstanceIPArrayName.
         */
        public Builder DBInstanceIPArrayName(String DBInstanceIPArrayName) {
            this.putQueryParameter("DBInstanceIPArrayName", DBInstanceIPArrayName);
            this.DBInstanceIPArrayName = DBInstanceIPArrayName;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * SecurityIPList.
         */
        public Builder securityIPList(String securityIPList) {
            this.putQueryParameter("SecurityIPList", securityIPList);
            this.securityIPList = securityIPList;
            return this;
        }

        @Override
        public ModifySecurityIpsRequest build() {
            return new ModifySecurityIpsRequest(this);
        } 

    } 

}
