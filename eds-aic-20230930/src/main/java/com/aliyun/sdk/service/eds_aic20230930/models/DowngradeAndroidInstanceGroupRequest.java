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
 * {@link DowngradeAndroidInstanceGroupRequest} extends {@link RequestModel}
 *
 * <p>DowngradeAndroidInstanceGroupRequest</p>
 */
public class DowngradeAndroidInstanceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidInstanceIds")
    private java.util.List<String> androidInstanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceGroupId;

    private DowngradeAndroidInstanceGroupRequest(Builder builder) {
        super(builder);
        this.androidInstanceIds = builder.androidInstanceIds;
        this.autoPay = builder.autoPay;
        this.instanceGroupId = builder.instanceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DowngradeAndroidInstanceGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return androidInstanceIds
     */
    public java.util.List<String> getAndroidInstanceIds() {
        return this.androidInstanceIds;
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return instanceGroupId
     */
    public String getInstanceGroupId() {
        return this.instanceGroupId;
    }

    public static final class Builder extends Request.Builder<DowngradeAndroidInstanceGroupRequest, Builder> {
        private java.util.List<String> androidInstanceIds; 
        private Boolean autoPay; 
        private String instanceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DowngradeAndroidInstanceGroupRequest request) {
            super(request);
            this.androidInstanceIds = request.androidInstanceIds;
            this.autoPay = request.autoPay;
            this.instanceGroupId = request.instanceGroupId;
        } 

        /**
         * <p>The IDs of the cloud phone instances that you want to delete.</p>
         */
        public Builder androidInstanceIds(java.util.List<String> androidInstanceIds) {
            this.putQueryParameter("AndroidInstanceIds", androidInstanceIds);
            this.androidInstanceIds = androidInstanceIds;
            return this;
        }

        /**
         * <p>Specifies whether to enable the auto-payment feature. Default value: false.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: enables the auto-payment feature. Ensure your account has sufficient balance to use this feature.</li>
         * <li>false: disables the auto-payment feature. This requires manual payment each time you place an order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>The ID of the instance group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ag-cuv4scs4obxhs****</p>
         */
        public Builder instanceGroupId(String instanceGroupId) {
            this.putQueryParameter("InstanceGroupId", instanceGroupId);
            this.instanceGroupId = instanceGroupId;
            return this;
        }

        @Override
        public DowngradeAndroidInstanceGroupRequest build() {
            return new DowngradeAndroidInstanceGroupRequest(this);
        } 

    } 

}
