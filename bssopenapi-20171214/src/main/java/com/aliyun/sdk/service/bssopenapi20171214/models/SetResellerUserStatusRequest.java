// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetResellerUserStatusRequest} extends {@link RequestModel}
 *
 * <p>SetResellerUserStatusRequest</p>
 */
public class SetResellerUserStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String businessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StopMode")
    private String stopMode;

    private SetResellerUserStatusRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
        this.ownerId = builder.ownerId;
        this.status = builder.status;
        this.stopMode = builder.stopMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetResellerUserStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return stopMode
     */
    public String getStopMode() {
        return this.stopMode;
    }

    public static final class Builder extends Request.Builder<SetResellerUserStatusRequest, Builder> {
        private String businessType; 
        private String ownerId; 
        private String status; 
        private String stopMode; 

        private Builder() {
            super();
        } 

        private Builder(SetResellerUserStatusRequest request) {
            super(request);
            this.businessType = request.businessType;
            this.ownerId = request.ownerId;
            this.status = request.status;
            this.stopMode = request.stopMode;
        } 

        /**
         * <p>The type of the business. Valid values: FREEZE: the frozen business of the account. TRUSTEESHIP: the hosted business of the account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FREEZE</p>
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The account status that you want to set. Valid values: Freeze: The account is frozen. Thaw: The account is unfrozen. Trusteeship: The account is hosted. TrusteeshipCancel: The account is not hosted.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Freeze</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>停机模式
         * 取值：
         *     0：普通停机
         *     1：立即停机</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder stopMode(String stopMode) {
            this.putQueryParameter("StopMode", stopMode);
            this.stopMode = stopMode;
            return this;
        }

        @Override
        public SetResellerUserStatusRequest build() {
            return new SetResellerUserStatusRequest(this);
        } 

    } 

}
