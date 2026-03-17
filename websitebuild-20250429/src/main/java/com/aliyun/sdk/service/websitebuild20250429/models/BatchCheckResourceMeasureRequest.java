// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link BatchCheckResourceMeasureRequest} extends {@link RequestModel}
 *
 * <p>BatchCheckResourceMeasureRequest</p>
 */
public class BatchCheckResourceMeasureRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BelongId")
    private String belongId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BelongIdType")
    private String belongIdType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EspBizId")
    private String espBizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderComponentParams")
    private String orderComponentParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceCheckItems")
    private String resourceCheckItems;

    private BatchCheckResourceMeasureRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.belongId = builder.belongId;
        this.belongIdType = builder.belongIdType;
        this.bizType = builder.bizType;
        this.espBizId = builder.espBizId;
        this.orderComponentParams = builder.orderComponentParams;
        this.resourceCheckItems = builder.resourceCheckItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCheckResourceMeasureRequest create() {
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
     * @return belongId
     */
    public String getBelongId() {
        return this.belongId;
    }

    /**
     * @return belongIdType
     */
    public String getBelongIdType() {
        return this.belongIdType;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return espBizId
     */
    public String getEspBizId() {
        return this.espBizId;
    }

    /**
     * @return orderComponentParams
     */
    public String getOrderComponentParams() {
        return this.orderComponentParams;
    }

    /**
     * @return resourceCheckItems
     */
    public String getResourceCheckItems() {
        return this.resourceCheckItems;
    }

    public static final class Builder extends Request.Builder<BatchCheckResourceMeasureRequest, Builder> {
        private String regionId; 
        private String belongId; 
        private String belongIdType; 
        private String bizType; 
        private String espBizId; 
        private String orderComponentParams; 
        private String resourceCheckItems; 

        private Builder() {
            super();
        } 

        private Builder(BatchCheckResourceMeasureRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.belongId = request.belongId;
            this.belongIdType = request.belongIdType;
            this.bizType = request.bizType;
            this.espBizId = request.espBizId;
            this.orderComponentParams = request.orderComponentParams;
            this.resourceCheckItems = request.resourceCheckItems;
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
         * BelongId.
         */
        public Builder belongId(String belongId) {
            this.putQueryParameter("BelongId", belongId);
            this.belongId = belongId;
            return this;
        }

        /**
         * BelongIdType.
         */
        public Builder belongIdType(String belongIdType) {
            this.putQueryParameter("BelongIdType", belongIdType);
            this.belongIdType = belongIdType;
            return this;
        }

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * EspBizId.
         */
        public Builder espBizId(String espBizId) {
            this.putQueryParameter("EspBizId", espBizId);
            this.espBizId = espBizId;
            return this;
        }

        /**
         * OrderComponentParams.
         */
        public Builder orderComponentParams(String orderComponentParams) {
            this.putQueryParameter("OrderComponentParams", orderComponentParams);
            this.orderComponentParams = orderComponentParams;
            return this;
        }

        /**
         * ResourceCheckItems.
         */
        public Builder resourceCheckItems(String resourceCheckItems) {
            this.putQueryParameter("ResourceCheckItems", resourceCheckItems);
            this.resourceCheckItems = resourceCheckItems;
            return this;
        }

        @Override
        public BatchCheckResourceMeasureRequest build() {
            return new BatchCheckResourceMeasureRequest(this);
        } 

    } 

}
