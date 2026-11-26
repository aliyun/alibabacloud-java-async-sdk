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
 * {@link CreateAIServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateAIServiceRequest</p>
 */
public class CreateAIServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityIPList")
    private String securityIPList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceAccount")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceAccountPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceAccountPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateAIServiceRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.description = builder.description;
        this.securityIPList = builder.securityIPList;
        this.serviceAccount = builder.serviceAccount;
        this.serviceAccountPassword = builder.serviceAccountPassword;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAIServiceRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return securityIPList
     */
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    /**
     * @return serviceAccount
     */
    public String getServiceAccount() {
        return this.serviceAccount;
    }

    /**
     * @return serviceAccountPassword
     */
    public String getServiceAccountPassword() {
        return this.serviceAccountPassword;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateAIServiceRequest, Builder> {
        private String DBInstanceId; 
        private String description; 
        private String securityIPList; 
        private String serviceAccount; 
        private String serviceAccountPassword; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateAIServiceRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.description = request.description;
            this.securityIPList = request.securityIPList;
            this.serviceAccount = request.serviceAccount;
            this.serviceAccountPassword = request.serviceAccountPassword;
            this.type = request.type;
        } 

        /**
         * <p>The instance ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the details of all AnalyticDB for PostgreSQL instances in the specified region, including instance IDs.</p>
         * </blockquote>
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
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>dramatest</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The IP addresses in the IP address whitelist. You can add up to 1,000 IP addresses, separated by commas (,). 127.0.0.1 indicates that no external IP addresses are allowed to access the service. The IP addresses must be in one of the following formats:</p>
         * <ul>
         * <li>10.23.12.24 (IP address)</li>
         * <li>10.23.12.24/24 (CIDR block. /24 indicates the prefix length of the IP address, which ranges from 1 to 32.)</li>
         * </ul>
         * <blockquote>
         * <p>You can call the ModifyAIServiceSecurityIps operation to modify the IP address whitelist after the service is created.</p>
         * </blockquote>
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
         * <p>The service account. The account must meet the following requirements:</p>
         * <ul>
         * <li>Contains only lowercase letters, digits, and underscores (_).</li>
         * <li>Starts with a lowercase letter and ends with a lowercase letter or a digit.</li>
         * <li>Does not start with gp.</li>
         * <li>Is 2 to 16 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dramauser</p>
         */
        public Builder serviceAccount(String serviceAccount) {
            this.putQueryParameter("ServiceAccount", serviceAccount);
            this.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * <p>The password of the service account. The password must meet the following requirements:</p>
         * <ul>
         * <li>Contains at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</li>
         * <li>Supported special characters: !@#$%^&amp;*()_+-=</li>
         * <li>Is 8 to 32 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456Aa!</p>
         */
        public Builder serviceAccountPassword(String serviceAccountPassword) {
            this.putQueryParameter("ServiceAccountPassword", serviceAccountPassword);
            this.serviceAccountPassword = serviceAccountPassword;
            return this;
        }

        /**
         * <p>The service type. Currently, only drama is supported.</p>
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
        public CreateAIServiceRequest build() {
            return new CreateAIServiceRequest(this);
        } 

    } 

}
