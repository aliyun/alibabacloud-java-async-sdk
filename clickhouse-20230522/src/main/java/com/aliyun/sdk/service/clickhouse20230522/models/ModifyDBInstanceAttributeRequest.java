// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceAttributeRequest</p>
 */
public class ModifyDBInstanceAttributeRequest extends Request {
    @Query
    @NameInMap("AttributeType")
    @Validation(required = true)
    private String attributeType;

    @Query
    @NameInMap("AttributeValue")
    @Validation(required = true)
    private String attributeValue;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("Product")
    private String product;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ModifyDBInstanceAttributeRequest(Builder builder) {
        super(builder);
        this.attributeType = builder.attributeType;
        this.attributeValue = builder.attributeValue;
        this.DBInstanceId = builder.DBInstanceId;
        this.product = builder.product;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attributeType
     */
    public String getAttributeType() {
        return this.attributeType;
    }

    /**
     * @return attributeValue
     */
    public String getAttributeValue() {
        return this.attributeValue;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceAttributeRequest, Builder> {
        private String attributeType; 
        private String attributeValue; 
        private String DBInstanceId; 
        private String product; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceAttributeRequest request) {
            super(request);
            this.attributeType = request.attributeType;
            this.attributeValue = request.attributeValue;
            this.DBInstanceId = request.DBInstanceId;
            this.product = request.product;
            this.regionId = request.regionId;
        } 

        /**
         * AttributeType.
         */
        public Builder attributeType(String attributeType) {
            this.putQueryParameter("AttributeType", attributeType);
            this.attributeType = attributeType;
            return this;
        }

        /**
         * AttributeValue.
         */
        public Builder attributeValue(String attributeValue) {
            this.putQueryParameter("AttributeValue", attributeValue);
            this.attributeValue = attributeValue;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * Product.
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyDBInstanceAttributeRequest build() {
            return new ModifyDBInstanceAttributeRequest(this);
        } 

    } 

}
