// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ModifyAIServiceSecurityIpsRequest} extends {@link RequestModel}
 *
 * <p>ModifyAIServiceSecurityIpsRequest</p>
 */
public class ModifyAIServiceSecurityIpsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityIPList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityIPList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private ModifyAIServiceSecurityIpsRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.securityIPList = builder.securityIPList;
        this.serviceId = builder.serviceId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAIServiceSecurityIpsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ModifyAIServiceSecurityIpsRequest, Builder> {
        private String DBInstanceId; 
        private String securityIPList; 
        private String serviceId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAIServiceSecurityIpsRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.securityIPList = request.securityIPList;
            this.serviceId = request.serviceId;
            this.type = request.type;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        public Builder securityIPList(String securityIPList) {
            this.putQueryParameter("SecurityIPList", securityIPList);
            this.securityIPList = securityIPList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>drama-123456</p>
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>drama</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ModifyAIServiceSecurityIpsRequest build() {
            return new ModifyAIServiceSecurityIpsRequest(this);
        } 

    } 

}
