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
 * {@link UninstallMonitorAgentRequest} extends {@link RequestModel}
 *
 * <p>UninstallMonitorAgentRequest</p>
 */
public class UninstallMonitorAgentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AndroidInstanceIds")
    private java.util.List<String> androidInstanceIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SaleMode")
    private String saleMode;

    private UninstallMonitorAgentRequest(Builder builder) {
        super(builder);
        this.androidInstanceIds = builder.androidInstanceIds;
        this.saleMode = builder.saleMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UninstallMonitorAgentRequest create() {
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
     * @return saleMode
     */
    public String getSaleMode() {
        return this.saleMode;
    }

    public static final class Builder extends Request.Builder<UninstallMonitorAgentRequest, Builder> {
        private java.util.List<String> androidInstanceIds; 
        private String saleMode; 

        private Builder() {
            super();
        } 

        private Builder(UninstallMonitorAgentRequest request) {
            super(request);
            this.androidInstanceIds = request.androidInstanceIds;
            this.saleMode = request.saleMode;
        } 

        /**
         * AndroidInstanceIds.
         */
        public Builder androidInstanceIds(java.util.List<String> androidInstanceIds) {
            this.putBodyParameter("AndroidInstanceIds", androidInstanceIds);
            this.androidInstanceIds = androidInstanceIds;
            return this;
        }

        /**
         * SaleMode.
         */
        public Builder saleMode(String saleMode) {
            this.putBodyParameter("SaleMode", saleMode);
            this.saleMode = saleMode;
            return this;
        }

        @Override
        public UninstallMonitorAgentRequest build() {
            return new UninstallMonitorAgentRequest(this);
        } 

    } 

}
