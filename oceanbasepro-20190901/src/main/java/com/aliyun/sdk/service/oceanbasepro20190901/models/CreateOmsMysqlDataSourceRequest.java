// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOmsMysqlDataSourceRequest} extends {@link RequestModel}
 *
 * <p>CreateOmsMysqlDataSourceRequest</p>
 */
public class CreateOmsMysqlDataSourceRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("DgDatabaseId")
    private String dgDatabaseId;

    @Body
    @NameInMap("InstanceId")
    private String instanceId;

    @Body
    @NameInMap("Ip")
    private String ip;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("Password")
    @Validation(required = true)
    private String password;

    @Body
    @NameInMap("Port")
    private String port;

    @Body
    @NameInMap("Schema")
    private String schema;

    @Body
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    @Body
    @NameInMap("Username")
    @Validation(required = true)
    private String username;

    @Body
    @NameInMap("VpcId")
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
         * 实例所属的地域ID。您可以调用DescribeRegions查看最新的阿里云地域列表。
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The description of the data source.   
         * <p>
         * It must be 2 to 256 characters in length. The default value is null.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the database gateway instance.   
         * <p>
         * 
         * > <br>If Type is set to DG, this parameter is required.
         */
        public Builder dgDatabaseId(String dgDatabaseId) {
            this.putBodyParameter("DgDatabaseId", dgDatabaseId);
            this.dgDatabaseId = dgDatabaseId;
            return this;
        }

        /**
         * The ID of the ECS instance of the data source.   
         * <p>
         * 
         * > <br>If Type is set to RDS, POLARDB, or DG, this parameter is required.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The IP address of the data source.   
         * <p>
         * 
         * > <br>If Type is set to INTERNET or VPC, this parameter is required.
         */
        public Builder ip(String ip) {
            this.putBodyParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * The name of the data source.   
         * <p>
         * It must be 2 to 128 characters in length and can contain letters, digits, underscores (_), periods (.), and hyphens (-).   
         * 
         * > <br>Invalid characters, such as slashes (/), are not allowed.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The password of the username that is used to access the database. It must be Base64 encoded.   
         * <p>
         * For example, for the password abcd123@!, the Base64-encoded value is YWJjZDEyM0Ah.
         */
        public Builder password(String password) {
            this.putBodyParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * The port number of the data source.   
         * <p>
         * 
         * > <br>If Type is set to INTERNET or VPC, this parameter is required.
         */
        public Builder port(String port) {
            this.putBodyParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * The name of the database.   
         * <p>
         * 
         * > <br>If you specify this parameter, subsequent migration or synchronization operations will take effect on this database only.
         */
        public Builder schema(String schema) {
            this.putBodyParameter("Schema", schema);
            this.schema = schema;
            return this;
        }

        /**
         * The type of the MySQL data source.   
         * <p>
         * Valid values: INTERNET, VPC, RDS, POLARDB, and DG.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The username that is used to access the database.
         */
        public Builder username(String username) {
            this.putBodyParameter("Username", username);
            this.username = username;
            return this;
        }

        /**
         * The ID of the VPC to which the data source belongs.   
         * <p>
         * 
         * > <br>If Type is set to VPC, this parameter is required.
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
