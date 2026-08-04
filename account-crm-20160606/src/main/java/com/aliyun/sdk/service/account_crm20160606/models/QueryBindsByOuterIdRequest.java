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
 * {@link QueryBindsByOuterIdRequest} extends {@link RequestModel}
 *
 * <p>QueryBindsByOuterIdRequest</p>
 */
public class QueryBindsByOuterIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinorOuterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String minorOuterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OuterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    private QueryBindsByOuterIdRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.minorOuterId = builder.minorOuterId;
        this.outerId = builder.outerId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBindsByOuterIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return minorOuterId
     */
    public String getMinorOuterId() {
        return this.minorOuterId;
    }

    /**
     * @return outerId
     */
    public String getOuterId() {
        return this.outerId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<QueryBindsByOuterIdRequest, Builder> {
        private String appName; 
        private String minorOuterId; 
        private String outerId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(QueryBindsByOuterIdRequest request) {
            super(request);
            this.appName = request.appName;
            this.minorOuterId = request.minorOuterId;
            this.outerId = request.outerId;
            this.tenantId = request.tenantId;
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
        public Builder minorOuterId(String minorOuterId) {
            this.putQueryParameter("MinorOuterId", minorOuterId);
            this.minorOuterId = minorOuterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder outerId(String outerId) {
            this.putQueryParameter("OuterId", outerId);
            this.outerId = outerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public QueryBindsByOuterIdRequest build() {
            return new QueryBindsByOuterIdRequest(this);
        } 

    } 

}
