// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yunjian20211217.models;

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
 * {@link GetUrgentDemandItemListRequest} extends {@link RequestModel}
 *
 * <p>GetUrgentDemandItemListRequest</p>
 */
public class GetUrgentDemandItemListRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("Yun-User-Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String yunUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("commodityCode")
    private String commodityCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("commodityTypeCode")
    private String commodityTypeCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("current")
    private Long current;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("planId")
    private Long planId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("size")
    private Long size;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("zone")
    private String zone;

    private GetUrgentDemandItemListRequest(Builder builder) {
        super(builder);
        this.yunUserId = builder.yunUserId;
        this.commodityCode = builder.commodityCode;
        this.commodityTypeCode = builder.commodityTypeCode;
        this.current = builder.current;
        this.planId = builder.planId;
        this.region = builder.region;
        this.size = builder.size;
        this.zone = builder.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUrgentDemandItemListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return yunUserId
     */
    public String getYunUserId() {
        return this.yunUserId;
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return commodityTypeCode
     */
    public String getCommodityTypeCode() {
        return this.commodityTypeCode;
    }

    /**
     * @return current
     */
    public Long getCurrent() {
        return this.current;
    }

    /**
     * @return planId
     */
    public Long getPlanId() {
        return this.planId;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * @return zone
     */
    public String getZone() {
        return this.zone;
    }

    public static final class Builder extends Request.Builder<GetUrgentDemandItemListRequest, Builder> {
        private String yunUserId; 
        private String commodityCode; 
        private String commodityTypeCode; 
        private Long current; 
        private Long planId; 
        private String region; 
        private Long size; 
        private String zone; 

        private Builder() {
            super();
        } 

        private Builder(GetUrgentDemandItemListRequest request) {
            super(request);
            this.yunUserId = request.yunUserId;
            this.commodityCode = request.commodityCode;
            this.commodityTypeCode = request.commodityTypeCode;
            this.current = request.current;
            this.planId = request.planId;
            this.region = request.region;
            this.size = request.size;
            this.zone = request.zone;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>111222</p>
         */
        public Builder yunUserId(String yunUserId) {
            this.putHeaderParameter("Yun-User-Id", yunUserId);
            this.yunUserId = yunUserId;
            return this;
        }

        /**
         * commodityCode.
         */
        public Builder commodityCode(String commodityCode) {
            this.putBodyParameter("commodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * commodityTypeCode.
         */
        public Builder commodityTypeCode(String commodityTypeCode) {
            this.putBodyParameter("commodityTypeCode", commodityTypeCode);
            this.commodityTypeCode = commodityTypeCode;
            return this;
        }

        /**
         * current.
         */
        public Builder current(Long current) {
            this.putBodyParameter("current", current);
            this.current = current;
            return this;
        }

        /**
         * planId.
         */
        public Builder planId(Long planId) {
            this.putBodyParameter("planId", planId);
            this.planId = planId;
            return this;
        }

        /**
         * region.
         */
        public Builder region(String region) {
            this.putBodyParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Long size) {
            this.putBodyParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * zone.
         */
        public Builder zone(String zone) {
            this.putBodyParameter("zone", zone);
            this.zone = zone;
            return this;
        }

        @Override
        public GetUrgentDemandItemListRequest build() {
            return new GetUrgentDemandItemListRequest(this);
        } 

    } 

}
