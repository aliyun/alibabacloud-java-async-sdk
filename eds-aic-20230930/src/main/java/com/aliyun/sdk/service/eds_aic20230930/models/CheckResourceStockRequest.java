// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckResourceStockRequest} extends {@link RequestModel}
 *
 * <p>CheckResourceStockRequest</p>
 */
public class CheckResourceStockRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcpSpecId")
    private String acpSpecId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CheckResourceStockRequest(Builder builder) {
        super(builder);
        this.acpSpecId = builder.acpSpecId;
        this.bizRegionId = builder.bizRegionId;
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
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CheckResourceStockRequest, Builder> {
        private String acpSpecId; 
        private String bizRegionId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CheckResourceStockRequest request) {
            super(request);
            this.acpSpecId = request.acpSpecId;
            this.bizRegionId = request.bizRegionId;
            this.zoneId = request.zoneId;
        } 

        /**
         * AcpSpecId.
         */
        public Builder acpSpecId(String acpSpecId) {
            this.putQueryParameter("AcpSpecId", acpSpecId);
            this.acpSpecId = acpSpecId;
            return this;
        }

        /**
         * BizRegionId.
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * ZoneId.
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
