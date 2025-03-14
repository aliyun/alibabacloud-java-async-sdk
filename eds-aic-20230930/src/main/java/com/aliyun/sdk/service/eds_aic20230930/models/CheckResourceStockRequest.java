// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link CheckResourceStockRequest} extends {@link RequestModel}
 *
 * <p>CheckResourceStockRequest</p>
 */
public class CheckResourceStockRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcpSpecId")
    private String acpSpecId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Amount")
    private Integer amount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GpuAcceleration")
    private Boolean gpuAcceleration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CheckResourceStockRequest(Builder builder) {
        super(builder);
        this.acpSpecId = builder.acpSpecId;
        this.amount = builder.amount;
        this.bizRegionId = builder.bizRegionId;
        this.gpuAcceleration = builder.gpuAcceleration;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckResourceStockRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acpSpecId
     */
    public String getAcpSpecId() {
        return this.acpSpecId;
    }

    /**
     * @return amount
     */
    public Integer getAmount() {
        return this.amount;
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return gpuAcceleration
     */
    public Boolean getGpuAcceleration() {
        return this.gpuAcceleration;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CheckResourceStockRequest, Builder> {
        private String acpSpecId; 
        private Integer amount; 
        private String bizRegionId; 
        private Boolean gpuAcceleration; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CheckResourceStockRequest request) {
            super(request);
            this.acpSpecId = request.acpSpecId;
            this.amount = request.amount;
            this.bizRegionId = request.bizRegionId;
            this.gpuAcceleration = request.gpuAcceleration;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>Specification ID.</p>
         * 
         * <strong>example:</strong>
         * <p>acp.basic.small</p>
         */
        public Builder acpSpecId(String acpSpecId) {
            this.putQueryParameter("AcpSpecId", acpSpecId);
            this.acpSpecId = acpSpecId;
            return this;
        }

        /**
         * Amount.
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * <p>Region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * GpuAcceleration.
         */
        public Builder gpuAcceleration(Boolean gpuAcceleration) {
            this.putQueryParameter("GpuAcceleration", gpuAcceleration);
            this.gpuAcceleration = gpuAcceleration;
            return this;
        }

        /**
         * <p>The availability zone of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CheckResourceStockRequest build() {
            return new CheckResourceStockRequest(this);
        } 

    } 

}
