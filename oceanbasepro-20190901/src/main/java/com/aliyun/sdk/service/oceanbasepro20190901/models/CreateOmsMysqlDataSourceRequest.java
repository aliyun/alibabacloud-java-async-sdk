// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link CreateOmsMysqlDataSourceRequest} extends {@link RequestModel}
 *
 * <p>CreateOmsMysqlDataSourceRequest</p>
 */
public class CreateOmsMysqlDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DgDatabaseId")
    private String dgDatabaseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Port")
    private String port;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Schema")
    private String schema;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Username")
    @com.aliyun.core.annotation.Validation(required = true)
    private String username;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private CreateOmsMysqlDataSourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.dgDatabaseId = builder.dgDatabaseId;
        this.instanceId = builder.instanceId;
        this.ip = builder.ip;
        this.name = builder.name;
        this.password = builder.password;
        this.port = builder.port;
        this.schema = builder.schema;
        this.type = builder.type;
        this.username = builder.username;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOmsMysqlDataSourceRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dgDatabaseId
     */
    public String getDgDatabaseId() {
        return this.dgDatabaseId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return schema
     */
    public String getSchema() {
        return this.schema;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<CreateOmsMysqlDataSourceRequest, Builder> {
        private String regionId; 
        private String description; 
        private String dgDatabaseId; 
        private String instanceId; 
        private String ip; 
        private String name; 
        private String password; 
        private String port; 
        private String schema; 
        private String type; 
        private String username; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreateOmsMysqlDataSourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.dgDatabaseId = request.dgDatabaseId;
            this.instanceId = request.instanceId;
            this.ip = request.ip;
            this.name = request.name;
            this.password = request.password;
            this.port = request.port;
            this.schema = request.schema;
            this.type = request.type;
            this.username = request.username;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The description of the data source.   </p>
         * <p>It must be 2 to 256 characters in length. The default value is null.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL data source for OMS testing</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the database gateway instance.   </p>
         * <blockquote>
         * <p><br>If Type is set to DG, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dg-yhss6sdlaff****</p>
         */
        public Builder dgDatabaseId(String dgDatabaseId) {
            this.putBodyParameter("DgDatabaseId", dgDatabaseId);
            this.dgDatabaseId = dgDatabaseId;
            return this;
        }

        /**
         * <p>The ID of the ECS instance of the data source.   </p>
         * <blockquote>
         * <p><br>If Type is set to RDS, PolarDB, or DG, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pc-12ab34cd56******</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The IP address of the data source.   </p>
         * <blockquote>
         * <p><br>If Type is set to INTERNET or VPC, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10.0.****</p>
         */
        public Builder ip(String ip) {
            this.putBodyParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * <p>The name of the data source.<br>It must be 2 to 128 characters in length and can contain letters, digits, underscores (_), periods (.), and hyphens (-).   </p>
         * <blockquote>
         * <p><br>Invalid characters, such as slashes (/), are not allowed.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oms-mysql</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The password of the username that is used to access the database. It must be Base64 encoded.<br>For example, for the password abcd123@!, the Base64-encoded value is YWJjZDEyM0Ah.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>YWJjZDEyM0Ah</p>
         */
        public Builder password(String password) {
            this.putBodyParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The port number of the data source.   </p>
         * <blockquote>
         * <p><br>If Type is set to INTERNET or VPC, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        public Builder port(String port) {
            this.putBodyParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The name of the database.   </p>
         * <blockquote>
         * <p><br>If you specify this parameter, subsequent migration or synchronization operations will take effect on this database only.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder schema(String schema) {
            this.putBodyParameter("Schema", schema);
            this.schema = schema;
            return this;
        }

        /**
         * <p>The type of the MySQL data source.<br>Valid values: INTERNET, VPC, RDS, PolarDB, and DG.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>INTERNET</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The username that is used to access the database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>omsTestUser</p>
         */
        public Builder username(String username) {
            this.putBodyParameter("Username", username);
            this.username = username;
            return this;
        }

        /**
         * <p>The ID of the VPC to which the data source belongs.   </p>
         * <blockquote>
         * <p><br>If Type is set to VPC, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-12345abcde*******</p>
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public CreateOmsMysqlDataSourceRequest build() {
            return new CreateOmsMysqlDataSourceRequest(this);
        } 

    } 

}
