// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMySqlDataSourceRequest} extends {@link RequestModel}
 *
 * <p>CreateMySqlDataSourceRequest</p>
 */
public class CreateMySqlDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DgInstanceId")
    private String dgInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Schema")
    private String schema;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UseSsl")
    private Boolean useSsl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private CreateMySqlDataSourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.dgInstanceId = builder.dgInstanceId;
        this.instanceId = builder.instanceId;
        this.ip = builder.ip;
        this.name = builder.name;
        this.password = builder.password;
        this.port = builder.port;
        this.schema = builder.schema;
        this.type = builder.type;
        this.useSsl = builder.useSsl;
        this.userName = builder.userName;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMySqlDataSourceRequest create() {
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
     * @return dgInstanceId
     */
    public String getDgInstanceId() {
        return this.dgInstanceId;
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
    public Integer getPort() {
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
     * @return useSsl
     */
    public Boolean getUseSsl() {
        return this.useSsl;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<CreateMySqlDataSourceRequest, Builder> {
        private String regionId; 
        private String description; 
        private String dgInstanceId; 
        private String instanceId; 
        private String ip; 
        private String name; 
        private String password; 
        private Integer port; 
        private String schema; 
        private String type; 
        private Boolean useSsl; 
        private String userName; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMySqlDataSourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.dgInstanceId = request.dgInstanceId;
            this.instanceId = request.instanceId;
            this.ip = request.ip;
            this.name = request.name;
            this.password = request.password;
            this.port = request.port;
            this.schema = request.schema;
            this.type = request.type;
            this.useSsl = request.useSsl;
            this.userName = request.userName;
            this.vpcId = request.vpcId;
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
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DgInstanceId.
         */
        public Builder dgInstanceId(String dgInstanceId) {
            this.putBodyParameter("DgInstanceId", dgInstanceId);
            this.dgInstanceId = dgInstanceId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Ip.
         */
        public Builder ip(String ip) {
            this.putBodyParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putBodyParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(Integer port) {
            this.putBodyParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * Schema.
         */
        public Builder schema(String schema) {
            this.putBodyParameter("Schema", schema);
            this.schema = schema;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * UseSsl.
         */
        public Builder useSsl(Boolean useSsl) {
            this.putBodyParameter("UseSsl", useSsl);
            this.useSsl = useSsl;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public CreateMySqlDataSourceRequest build() {
            return new CreateMySqlDataSourceRequest(this);
        } 

    } 

}
