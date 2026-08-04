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
 * {@link ExistBindsByOuterIdRequest} extends {@link RequestModel}
 *
 * <p>ExistBindsByOuterIdRequest</p>
 */
public class ExistBindsByOuterIdRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinorOuterId")
    private String minorOuterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OuterId")
    private String outerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    private ExistBindsByOuterIdRequest(Builder builder) {
        super(builder);
        this.sourceIp = builder.sourceIp;
        this.appName = builder.appName;
        this.minorOuterId = builder.minorOuterId;
        this.outerId = builder.outerId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExistBindsByOuterIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
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

    public static final class Builder extends Request.Builder<ExistBindsByOuterIdRequest, Builder> {
        private String sourceIp; 
        private String appName; 
        private String minorOuterId; 
        private String outerId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ExistBindsByOuterIdRequest request) {
            super(request);
            this.sourceIp = request.sourceIp;
            this.appName = request.appName;
            this.minorOuterId = request.minorOuterId;
            this.outerId = request.outerId;
            this.tenantId = request.tenantId;
        } 

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putHostParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * MinorOuterId.
         */
        public Builder minorOuterId(String minorOuterId) {
            this.putQueryParameter("MinorOuterId", minorOuterId);
            this.minorOuterId = minorOuterId;
            return this;
        }

        /**
         * OuterId.
         */
        public Builder outerId(String outerId) {
            this.putQueryParameter("OuterId", outerId);
            this.outerId = outerId;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public ExistBindsByOuterIdRequest build() {
            return new ExistBindsByOuterIdRequest(this);
        } 

    } 

}
