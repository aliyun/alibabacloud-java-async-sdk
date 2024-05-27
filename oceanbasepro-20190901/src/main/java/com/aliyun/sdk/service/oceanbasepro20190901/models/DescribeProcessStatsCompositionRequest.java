// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProcessStatsCompositionRequest} extends {@link RequestModel}
 *
 * <p>DescribeProcessStatsCompositionRequest</p>
 */
public class DescribeProcessStatsCompositionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientIp")
    private String clientIp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServerIp")
    private String serverIp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SqlText")
    private String sqlText;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UId")
    private String uId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Users")
    private String users;

    private DescribeProcessStatsCompositionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientIp = builder.clientIp;
        this.instanceId = builder.instanceId;
        this.serverIp = builder.serverIp;
        this.sqlText = builder.sqlText;
        this.status = builder.status;
        this.tenantId = builder.tenantId;
        this.uId = builder.uId;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProcessStatsCompositionRequest create() {
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
     * @return clientIp
     */
    public String getClientIp() {
        return this.clientIp;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return serverIp
     */
    public String getServerIp() {
        return this.serverIp;
    }

    /**
     * @return sqlText
     */
    public String getSqlText() {
        return this.sqlText;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return uId
     */
    public String getUId() {
        return this.uId;
    }

    /**
     * @return users
     */
    public String getUsers() {
        return this.users;
    }

    public static final class Builder extends Request.Builder<DescribeProcessStatsCompositionRequest, Builder> {
        private String regionId; 
        private String clientIp; 
        private String instanceId; 
        private String serverIp; 
        private String sqlText; 
        private String status; 
        private String tenantId; 
        private String uId; 
        private String users; 

        private Builder() {
            super();
        } 

        private Builder(DescribeProcessStatsCompositionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientIp = request.clientIp;
            this.instanceId = request.instanceId;
            this.serverIp = request.serverIp;
            this.sqlText = request.sqlText;
            this.status = request.status;
            this.tenantId = request.tenantId;
            this.uId = request.uId;
            this.users = request.users;
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
         * The IP address of the client.
         */
        public Builder clientIp(String clientIp) {
            this.putBodyParameter("ClientIp", clientIp);
            this.clientIp = clientIp;
            return this;
        }

        /**
         * The ID of the OceanBase cluster.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The IP address of the server.
         */
        public Builder serverIp(String serverIp) {
            this.putBodyParameter("ServerIp", serverIp);
            this.serverIp = serverIp;
            return this;
        }

        /**
         * The SQL statement. It supports LIKE clauses, and you may specify only part of the clauses in the SQL statement.
         */
        public Builder sqlText(String sqlText) {
            this.putBodyParameter("SqlText", sqlText);
            this.sqlText = sqlText;
            return this;
        }

        /**
         * The state of the session.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The ID of the tenant.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * The user identifier (UID) of OceanBase Database.
         */
        public Builder uId(String uId) {
            this.putBodyParameter("UId", uId);
            this.uId = uId;
            return this;
        }

        /**
         * The username that you use to log in to the database.
         */
        public Builder users(String users) {
            this.putBodyParameter("Users", users);
            this.users = users;
            return this;
        }

        @Override
        public DescribeProcessStatsCompositionRequest build() {
            return new DescribeProcessStatsCompositionRequest(this);
        } 

    } 

}
