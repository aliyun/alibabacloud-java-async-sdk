// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link ApplyAgOneKeyDeleteTaskRequest} extends {@link RequestModel}
 *
 * <p>ApplyAgOneKeyDeleteTaskRequest</p>
 */
public class ApplyAgOneKeyDeleteTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AbandonedDependency")
    private String abandonedDependency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgAccountType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agAccountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mpk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mpk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pk;

    private ApplyAgOneKeyDeleteTaskRequest(Builder builder) {
        super(builder);
        this.abandonedDependency = builder.abandonedDependency;
        this.agAccountType = builder.agAccountType;
        this.appName = builder.appName;
        this.mpk = builder.mpk;
        this.pk = builder.pk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyAgOneKeyDeleteTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return abandonedDependency
     */
    public String getAbandonedDependency() {
        return this.abandonedDependency;
    }

    /**
     * @return agAccountType
     */
    public String getAgAccountType() {
        return this.agAccountType;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return mpk
     */
    public String getMpk() {
        return this.mpk;
    }

    /**
     * @return pk
     */
    public String getPk() {
        return this.pk;
    }

    public static final class Builder extends Request.Builder<ApplyAgOneKeyDeleteTaskRequest, Builder> {
        private String abandonedDependency; 
        private String agAccountType; 
        private String appName; 
        private String mpk; 
        private String pk; 

        private Builder() {
            super();
        } 

        private Builder(ApplyAgOneKeyDeleteTaskRequest request) {
            super(request);
            this.abandonedDependency = request.abandonedDependency;
            this.agAccountType = request.agAccountType;
            this.appName = request.appName;
            this.mpk = request.mpk;
            this.pk = request.pk;
        } 

        /**
         * AbandonedDependency.
         */
        public Builder abandonedDependency(String abandonedDependency) {
            this.putQueryParameter("AbandonedDependency", abandonedDependency);
            this.abandonedDependency = abandonedDependency;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder agAccountType(String agAccountType) {
            this.putQueryParameter("AgAccountType", agAccountType);
            this.agAccountType = agAccountType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder mpk(String mpk) {
            this.putQueryParameter("Mpk", mpk);
            this.mpk = mpk;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pk(String pk) {
            this.putQueryParameter("Pk", pk);
            this.pk = pk;
            return this;
        }

        @Override
        public ApplyAgOneKeyDeleteTaskRequest build() {
            return new ApplyAgOneKeyDeleteTaskRequest(this);
        } 

    } 

}
