// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20260120.models;

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
 * {@link DeleteDataMaskingRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteDataMaskingRuleRequest</p>
 */
public class DeleteDataMaskingRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineType")
    private String engineType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductId")
    private Long productId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubRuleList")
    private java.util.List<SubRuleList> subRuleList;

    private DeleteDataMaskingRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.engineType = builder.engineType;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.productCode = builder.productCode;
        this.productId = builder.productId;
        this.subRuleList = builder.subRuleList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDataMaskingRuleRequest create() {
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
     * @return engineType
     */
    public String getEngineType() {
        return this.engineType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return productId
     */
    public Long getProductId() {
        return this.productId;
    }

    /**
     * @return subRuleList
     */
    public java.util.List<SubRuleList> getSubRuleList() {
        return this.subRuleList;
    }

    public static final class Builder extends Request.Builder<DeleteDataMaskingRuleRequest, Builder> {
        private String regionId; 
        private String engineType; 
        private String instanceId; 
        private String lang; 
        private String productCode; 
        private Long productId; 
        private java.util.List<SubRuleList> subRuleList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDataMaskingRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.engineType = request.engineType;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.productCode = request.productCode;
            this.productId = request.productId;
            this.subRuleList = request.subRuleList;
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
         * <p>The database engine type. The value must be the same as the EngineType of the target instance, such as MySQL or PostgreSQL.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder engineType(String engineType) {
            this.putQueryParameter("EngineType", engineType);
            this.engineType = engineType;
            return this;
        }

        /**
         * <p>The database instance identifier. You can obtain this value from the Items[].InstanceId field in the response of the ListDataMaskingInstances operation.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze1abcdefgh****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The language of the response message. Valid values: zh: Chinese. en: English.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The cloud service code. Column encryption supports RDS, POLARDB, and PolarDBX2. If ProductId is also specified, the two parameters must match.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The cloud service type identifier. Valid values: 5: RDS. 8: POLARDB. 27: PolarDBX2. If this parameter is specified together with ProductCode, the values must match.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder productId(Long productId) {
            this.putQueryParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * <p>The list of column encryption targets grouped by database and table.</p>
         */
        public Builder subRuleList(java.util.List<SubRuleList> subRuleList) {
            String subRuleListShrink = shrink(subRuleList, "SubRuleList", "json");
            this.putQueryParameter("SubRuleList", subRuleListShrink);
            this.subRuleList = subRuleList;
            return this;
        }

        @Override
        public DeleteDataMaskingRuleRequest build() {
            return new DeleteDataMaskingRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeleteDataMaskingRuleRequest} extends {@link TeaModel}
     *
     * <p>DeleteDataMaskingRuleRequest</p>
     */
    public static class SubRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Columns")
        private String columns;

        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private SubRuleList(Builder builder) {
            this.columns = builder.columns;
            this.dbName = builder.dbName;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubRuleList create() {
            return builder().build();
        }

        /**
         * @return columns
         */
        public String getColumns() {
            return this.columns;
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String columns; 
            private String dbName; 
            private String tableName; 

            private Builder() {
            } 

            private Builder(SubRuleList model) {
                this.columns = model.columns;
                this.dbName = model.dbName;
                this.tableName = model.tableName;
            } 

            /**
             * <p>The list of target column names. Separate multiple column names with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>phone,email</p>
             */
            public Builder columns(String columns) {
                this.columns = columns;
                return this;
            }

            /**
             * <p>The name of the target database.</p>
             * 
             * <strong>example:</strong>
             * <p>business_db</p>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>The name of the target table.</p>
             * 
             * <strong>example:</strong>
             * <p>customer</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public SubRuleList build() {
                return new SubRuleList(this);
            } 

        } 

    }
}
