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
 * {@link CheckUserResourceMeasureRequest} extends {@link RequestModel}
 *
 * <p>CheckUserResourceMeasureRequest</p>
 */
public class CheckUserResourceMeasureRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ResourceCode")
    private String resourceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceValue")
    private Long resourceValue;

    private CheckUserResourceMeasureRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.belongId = builder.belongId;
        this.belongIdType = builder.belongIdType;
        this.bizType = builder.bizType;
        this.espBizId = builder.espBizId;
        this.orderComponentParams = builder.orderComponentParams;
        this.resourceCode = builder.resourceCode;
        this.resourceValue = builder.resourceValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckUserResourceMeasureRequest create() {
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
     * @return resourceCode
     */
    public String getResourceCode() {
        return this.resourceCode;
    }

    /**
     * @return resourceValue
     */
    public Long getResourceValue() {
        return this.resourceValue;
    }

    public static final class Builder extends Request.Builder<CheckUserResourceMeasureRequest, Builder> {
        private String regionId; 
        private String belongId; 
        private String belongIdType; 
        private String bizType; 
        private String espBizId; 
        private String orderComponentParams; 
        private String resourceCode; 
        private Long resourceValue; 

        private Builder() {
            super();
        } 

        private Builder(CheckUserResourceMeasureRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.belongId = request.belongId;
            this.belongIdType = request.belongIdType;
            this.bizType = request.bizType;
            this.espBizId = request.espBizId;
            this.orderComponentParams = request.orderComponentParams;
            this.resourceCode = request.resourceCode;
            this.resourceValue = request.resourceValue;
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
         * <p>The owner ID, which can be a website ID or an Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder belongId(String belongId) {
            this.putQueryParameter("BelongId", belongId);
            this.belongId = belongId;
            return this;
        }

        /**
         * <p>The type of the owner ID. Valid values:</p>
         * <ul>
         * <li>siteId</li>
         * <li>uid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        public Builder belongIdType(String belongIdType) {
            this.putQueryParameter("BelongIdType", belongIdType);
            this.belongIdType = belongIdType;
            return this;
        }

        /**
         * <p>The ESP business type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>The ESP business ID.</p>
         * 
         * <strong>example:</strong>
         * <p>p20202933455</p>
         */
        public Builder espBizId(String espBizId) {
            this.putQueryParameter("EspBizId", espBizId);
            this.espBizId = espBizId;
            return this;
        }

        /**
         * <p>The order module information. If this parameter is empty, espBizId and bizType cannot be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;siteversion&quot;:&quot;test&quot;}</p>
         */
        public Builder orderComponentParams(String orderComponentParams) {
            this.putQueryParameter("OrderComponentParams", orderComponentParams);
            this.orderComponentParams = orderComponentParams;
            return this;
        }

        /**
         * <p>The resource identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>InspirationTokens</p>
         */
        public Builder resourceCode(String resourceCode) {
            this.putQueryParameter("ResourceCode", resourceCode);
            this.resourceCode = resourceCode;
            return this;
        }

        /**
         * <p>The resource value. This parameter is empty by default and is required only for feature-type resources. Valid values:</p>
         * <ul>
         * <li>0: Not supported.</li>
         * <li>1: Supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder resourceValue(Long resourceValue) {
            this.putQueryParameter("ResourceValue", resourceValue);
            this.resourceValue = resourceValue;
            return this;
        }

        @Override
        public CheckUserResourceMeasureRequest build() {
            return new CheckUserResourceMeasureRequest(this);
        } 

    } 

}
