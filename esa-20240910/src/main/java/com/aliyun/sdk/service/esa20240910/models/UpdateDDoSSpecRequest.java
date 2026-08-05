// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link UpdateDDoSSpecRequest} extends {@link RequestModel}
 *
 * <p>UpdateDDoSSpecRequest</p>
 */
public class UpdateDDoSSpecRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DDoSBillingMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dDoSBillingMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DDoSBurstableDomesticProtection")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dDoSBurstableDomesticProtection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DDoSBurstableOverseasProtection")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dDoSBurstableOverseasProtection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private UpdateDDoSSpecRequest(Builder builder) {
        super(builder);
        this.dDoSBillingMode = builder.dDoSBillingMode;
        this.dDoSBurstableDomesticProtection = builder.dDoSBurstableDomesticProtection;
        this.dDoSBurstableOverseasProtection = builder.dDoSBurstableOverseasProtection;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDDoSSpecRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dDoSBillingMode
     */
    public String getDDoSBillingMode() {
        return this.dDoSBillingMode;
    }

    /**
     * @return dDoSBurstableDomesticProtection
     */
    public String getDDoSBurstableDomesticProtection() {
        return this.dDoSBurstableDomesticProtection;
    }

    /**
     * @return dDoSBurstableOverseasProtection
     */
    public String getDDoSBurstableOverseasProtection() {
        return this.dDoSBurstableOverseasProtection;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<UpdateDDoSSpecRequest, Builder> {
        private String dDoSBillingMode; 
        private String dDoSBurstableDomesticProtection; 
        private String dDoSBurstableOverseasProtection; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDDoSSpecRequest request) {
            super(request);
            this.dDoSBillingMode = request.dDoSBillingMode;
            this.dDoSBurstableDomesticProtection = request.dDoSBurstableDomesticProtection;
            this.dDoSBurstableOverseasProtection = request.dDoSBurstableOverseasProtection;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CleanTraffic</p>
         */
        public Builder dDoSBillingMode(String dDoSBillingMode) {
            this.putQueryParameter("DDoSBillingMode", dDoSBillingMode);
            this.dDoSBillingMode = dDoSBillingMode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn_300</p>
         */
        public Builder dDoSBurstableDomesticProtection(String dDoSBurstableDomesticProtection) {
            this.putQueryParameter("DDoSBurstableDomesticProtection", dDoSBurstableDomesticProtection);
            this.dDoSBurstableDomesticProtection = dDoSBurstableDomesticProtection;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>overseas_300</p>
         */
        public Builder dDoSBurstableOverseasProtection(String dDoSBurstableOverseasProtection) {
            this.putQueryParameter("DDoSBurstableOverseasProtection", dDoSBurstableOverseasProtection);
            this.dDoSBurstableOverseasProtection = dDoSBurstableOverseasProtection;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>esa-ddos-9tuv*********</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public UpdateDDoSSpecRequest build() {
            return new UpdateDDoSSpecRequest(this);
        } 

    } 

}
