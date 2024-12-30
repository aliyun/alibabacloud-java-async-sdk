// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link QueryOrderPriceRequest} extends {@link RequestModel}
 *
 * <p>QueryOrderPriceRequest</p>
 */
public class QueryOrderPriceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String code;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instance_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("package")
    @com.aliyun.core.annotation.Validation(required = true)
    private String _package;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("period")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long period;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("period_unit")
    @com.aliyun.core.annotation.Validation(required = true)
    private String periodUnit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("total_size")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long totalSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_count")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long userCount;

    private QueryOrderPriceRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.instanceId = builder.instanceId;
        this.orderType = builder.orderType;
        this._package = builder._package;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.totalSize = builder.totalSize;
        this.userCount = builder.userCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOrderPriceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return _package
     */
    public String get_package() {
        return this._package;
    }

    /**
     * @return period
     */
    public Long getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return totalSize
     */
    public Long getTotalSize() {
        return this.totalSize;
    }

    /**
     * @return userCount
     */
    public Long getUserCount() {
        return this.userCount;
    }

    public static final class Builder extends Request.Builder<QueryOrderPriceRequest, Builder> {
        private String code; 
        private String instanceId; 
        private String orderType; 
        private String _package; 
        private Long period; 
        private String periodUnit; 
        private Long totalSize; 
        private Long userCount; 

        private Builder() {
            super();
        } 

        private Builder(QueryOrderPriceRequest request) {
            super(request);
            this.code = request.code;
            this.instanceId = request.instanceId;
            this.orderType = request.orderType;
            this._package = request._package;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.totalSize = request.totalSize;
            this.userCount = request.userCount;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder code(String code) {
            this.putBodyParameter("code", code);
            this.code = code;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("instance_id", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder orderType(String orderType) {
            this.putBodyParameter("order_type", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder _package(String _package) {
            this.putBodyParameter("package", _package);
            this._package = _package;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder period(Long period) {
            this.putBodyParameter("period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putBodyParameter("period_unit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder totalSize(Long totalSize) {
            this.putBodyParameter("total_size", totalSize);
            this.totalSize = totalSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder userCount(Long userCount) {
            this.putBodyParameter("user_count", userCount);
            this.userCount = userCount;
            return this;
        }

        @Override
        public QueryOrderPriceRequest build() {
            return new QueryOrderPriceRequest(this);
        } 

    } 

}
