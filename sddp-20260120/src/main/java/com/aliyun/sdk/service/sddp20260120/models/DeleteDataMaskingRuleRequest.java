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
         * EngineType.
         */
        public Builder engineType(String engineType) {
            this.putQueryParameter("EngineType", engineType);
            this.engineType = engineType;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * ProductId.
         */
        public Builder productId(Long productId) {
            this.putQueryParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * SubRuleList.
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
             * Columns.
             */
            public Builder columns(String columns) {
                this.columns = columns;
                return this;
            }

            /**
             * DbName.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * TableName.
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
