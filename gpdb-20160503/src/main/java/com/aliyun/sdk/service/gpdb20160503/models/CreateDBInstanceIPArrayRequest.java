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
 * {@link CreateDBInstanceIPArrayRequest} extends {@link RequestModel}
 *
 * <p>CreateDBInstanceIPArrayRequest</p>
 */
public class CreateDBInstanceIPArrayRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IPArrayAttribute")
    private String IPArrayAttribute;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IPArrayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String IPArrayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityIPList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> securityIPList;

    private CreateDBInstanceIPArrayRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.IPArrayAttribute = builder.IPArrayAttribute;
        this.IPArrayName = builder.IPArrayName;
        this.securityIPList = builder.securityIPList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBInstanceIPArrayRequest create() {
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
     * @return IPArrayAttribute
     */
    public String getIPArrayAttribute() {
        return this.IPArrayAttribute;
    }

    /**
     * @return IPArrayName
     */
    public String getIPArrayName() {
        return this.IPArrayName;
    }

    /**
     * @return securityIPList
     */
    public java.util.List<String> getSecurityIPList() {
        return this.securityIPList;
    }

    public static final class Builder extends Request.Builder<CreateDBInstanceIPArrayRequest, Builder> {
        private String DBInstanceId; 
        private String IPArrayAttribute; 
        private String IPArrayName; 
        private java.util.List<String> securityIPList; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBInstanceIPArrayRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.IPArrayAttribute = request.IPArrayAttribute;
            this.IPArrayName = request.IPArrayName;
            this.securityIPList = request.securityIPList;
        } 

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
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
         * <p>The attribute of the IP whitelist group.</p>
         * 
         * <strong>example:</strong>
         * <p>taffyFish</p>
         */
        public Builder IPArrayAttribute(String IPArrayAttribute) {
            this.putQueryParameter("IPArrayAttribute", IPArrayAttribute);
            this.IPArrayAttribute = IPArrayAttribute;
            return this;
        }

        /**
         * <p>The name of the IP whitelist group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testarray</p>
         */
        public Builder IPArrayName(String IPArrayName) {
            this.putQueryParameter("IPArrayName", IPArrayName);
            this.IPArrayName = IPArrayName;
            return this;
        }

        /**
         * <p>The IP addresses in the IP whitelist group. A maximum of 1,000 IP addresses or CIDR blocks are allowed.</p>
         * <p>This parameter is required.</p>
         */
        public Builder securityIPList(java.util.List<String> securityIPList) {
            String securityIPListShrink = shrink(securityIPList, "SecurityIPList", "simple");
            this.putQueryParameter("SecurityIPList", securityIPListShrink);
            this.securityIPList = securityIPList;
            return this;
        }

        @Override
        public CreateDBInstanceIPArrayRequest build() {
            return new CreateDBInstanceIPArrayRequest(this);
        } 

    } 

}
