// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateOrderRequest</p>
 */
public class CreateOrderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("auto_pay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("auto_renew")
    private Boolean autoRenew;

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

    private CreateOrderRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
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

    public static CreateOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
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

    public static final class Builder extends Request.Builder<CreateOrderRequest, Builder> {
        private Boolean autoPay; 
        private Boolean autoRenew; 
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

        private Builder(CreateOrderRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
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
         * auto_pay.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putBodyParameter("auto_pay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * auto_renew.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putBodyParameter("auto_renew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * code.
         */
        public Builder code(String code) {
            this.putBodyParameter("code", code);
            this.code = code;
            return this;
        }

        /**
         * instance_id.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("instance_id", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * order_type.
         */
        public Builder orderType(String orderType) {
            this.putBodyParameter("order_type", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * package.
         */
        public Builder _package(String _package) {
            this.putBodyParameter("package", _package);
            this._package = _package;
            return this;
        }

        /**
         * period.
         */
        public Builder period(Long period) {
            this.putBodyParameter("period", period);
            this.period = period;
            return this;
        }

        /**
         * period_unit.
         */
        public Builder periodUnit(String periodUnit) {
            this.putBodyParameter("period_unit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * total_size.
         */
        public Builder totalSize(Long totalSize) {
            this.putBodyParameter("total_size", totalSize);
            this.totalSize = totalSize;
            return this;
        }

        /**
         * user_count.
         */
        public Builder userCount(Long userCount) {
            this.putBodyParameter("user_count", userCount);
            this.userCount = userCount;
            return this;
        }

        @Override
        public CreateOrderRequest build() {
            return new CreateOrderRequest(this);
        } 

    } 

}
