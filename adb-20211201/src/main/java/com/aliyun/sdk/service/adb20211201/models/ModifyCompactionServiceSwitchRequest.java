// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyCompactionServiceSwitchRequest} extends {@link RequestModel}
 *
 * <p>ModifyCompactionServiceSwitchRequest</p>
 */
public class ModifyCompactionServiceSwitchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableCompactionService")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enableCompactionService;

    private ModifyCompactionServiceSwitchRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.enableCompactionService = builder.enableCompactionService;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCompactionServiceSwitchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return enableCompactionService
     */
    public Boolean getEnableCompactionService() {
        return this.enableCompactionService;
    }

    public static final class Builder extends Request.Builder<ModifyCompactionServiceSwitchRequest, Builder> {
        private String DBClusterId; 
        private Boolean enableCompactionService; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCompactionServiceSwitchRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.enableCompactionService = request.enableCompactionService;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp14t95lun0w****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableCompactionService(Boolean enableCompactionService) {
            this.putQueryParameter("EnableCompactionService", enableCompactionService);
            this.enableCompactionService = enableCompactionService;
            return this;
        }

        @Override
        public ModifyCompactionServiceSwitchRequest build() {
            return new ModifyCompactionServiceSwitchRequest(this);
        } 

    } 

}
