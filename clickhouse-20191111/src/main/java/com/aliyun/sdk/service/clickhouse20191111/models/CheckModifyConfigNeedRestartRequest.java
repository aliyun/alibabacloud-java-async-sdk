// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckModifyConfigNeedRestartRequest} extends {@link RequestModel}
 *
 * <p>CheckModifyConfigNeedRestartRequest</p>
 */
public class CheckModifyConfigNeedRestartRequest extends Request {
    @Query
    @NameInMap("Config")
    @Validation(required = true)
    private String config;

    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    private CheckModifyConfigNeedRestartRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.DBClusterId = builder.DBClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckModifyConfigNeedRestartRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public static final class Builder extends Request.Builder<CheckModifyConfigNeedRestartRequest, Builder> {
        private String config; 
        private String DBClusterId; 

        private Builder() {
            super();
        } 

        private Builder(CheckModifyConfigNeedRestartRequest request) {
            super(request);
            this.config = request.config;
            this.DBClusterId = request.DBClusterId;
        } 

        /**
         * Config.
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        @Override
        public CheckModifyConfigNeedRestartRequest build() {
            return new CheckModifyConfigNeedRestartRequest(this);
        } 

    } 

}
