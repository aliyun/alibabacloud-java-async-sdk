// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDatabaseRequest} extends {@link RequestModel}
 *
 * <p>CreateDatabaseRequest</p>
 */
public class CreateDatabaseRequest extends Request {
    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("DatabaseName")
    @Validation(required = true)
    private String databaseName;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("Encoding")
    @Validation(required = true)
    private String encoding;

    @Body
    @NameInMap("InstanceId")
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    private CreateDatabaseRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.databaseName = builder.databaseName;
        this.description = builder.description;
        this.encoding = builder.encoding;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatabaseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return encoding
     */
    public String getEncoding() {
        return this.encoding;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<CreateDatabaseRequest, Builder> {
        private String clientToken; 
        private String databaseName; 
        private String description; 
        private String encoding; 
        private String instanceId; 
        private String regionId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDatabaseRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.databaseName = response.databaseName;
            this.description = response.description;
            this.encoding = response.encoding;
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
            this.tenantId = response.tenantId;
        } 

        /**
         * 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 数据库名称。 不能使用某些预留关键字，如 test、mysql。
         */
        public Builder databaseName(String databaseName) {
            this.putBodyParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * 数据库描述信息。
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * 数据库编码方式。 详细参见DescribeCharset返回的Charset字段。
         */
        public Builder encoding(String encoding) {
            this.putBodyParameter("Encoding", encoding);
            this.encoding = encoding;
            return this;
        }

        /**
         * Oceanbase集群ID。
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 地域ID。
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 租户ID。
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public CreateDatabaseRequest build() {
            return new CreateDatabaseRequest(this);
        } 

    } 

}
