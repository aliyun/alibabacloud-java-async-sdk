// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOutlineBindingRequest} extends {@link RequestModel}
 *
 * <p>DescribeOutlineBindingRequest</p>
 */
public class DescribeOutlineBindingRequest extends Request {
    @Body
    @NameInMap("DatabaseName")
    @Validation(required = true)
    private String databaseName;

    @Body
    @NameInMap("InstanceId")
    private String instanceId;

    @Body
    @NameInMap("IsConcurrentLimit")
    private Boolean isConcurrentLimit;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("SQLId")
    @Validation(required = true)
    private String SQLId;

    @Body
    @NameInMap("TableName")
    @Validation(required = true)
    private String tableName;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    private DescribeOutlineBindingRequest(Builder builder) {
        super(builder);
        this.databaseName = builder.databaseName;
        this.instanceId = builder.instanceId;
        this.isConcurrentLimit = builder.isConcurrentLimit;
        this.regionId = builder.regionId;
        this.SQLId = builder.SQLId;
        this.tableName = builder.tableName;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOutlineBindingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isConcurrentLimit
     */
    public Boolean getIsConcurrentLimit() {
        return this.isConcurrentLimit;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return SQLId
     */
    public String getSQLId() {
        return this.SQLId;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<DescribeOutlineBindingRequest, Builder> {
        private String databaseName; 
        private String instanceId; 
        private Boolean isConcurrentLimit; 
        private String regionId; 
        private String SQLId; 
        private String tableName; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOutlineBindingRequest response) {
            super(response);
            this.databaseName = response.databaseName;
            this.instanceId = response.instanceId;
            this.isConcurrentLimit = response.isConcurrentLimit;
            this.regionId = response.regionId;
            this.SQLId = response.SQLId;
            this.tableName = response.tableName;
            this.tenantId = response.tenantId;
        } 

        /**
         * ???????????????
         */
        public Builder databaseName(String databaseName) {
            this.putBodyParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * Oceanbase??????ID???
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ?????????True????????????SQLID??????????????????????????????
         */
        public Builder isConcurrentLimit(Boolean isConcurrentLimit) {
            this.putBodyParameter("IsConcurrentLimit", isConcurrentLimit);
            this.isConcurrentLimit = isConcurrentLimit;
            return this;
        }

        /**
         * ??????ID
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SQLID
         */
        public Builder SQLId(String SQLId) {
            this.putBodyParameter("SQLId", SQLId);
            this.SQLId = SQLId;
            return this;
        }

        /**
         * ??????????????? ?????????2~20 ???????????????????????????????????????????????????????????????????????????????????????????????????????????? ??????????????? sys???
         */
        public Builder tableName(String tableName) {
            this.putBodyParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * ??????ID???
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public DescribeOutlineBindingRequest build() {
            return new DescribeOutlineBindingRequest(this);
        } 

    } 

}
