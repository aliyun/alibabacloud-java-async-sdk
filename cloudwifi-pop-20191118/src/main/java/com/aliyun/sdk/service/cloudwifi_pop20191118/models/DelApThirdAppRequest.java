// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudwifi_pop20191118.models;

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
 * {@link DelApThirdAppRequest} extends {@link RequestModel}
 *
 * <p>DelApThirdAppRequest</p>
 */
public class DelApThirdAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApAssetId")
    private Long apAssetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mac")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mac;

    private DelApThirdAppRequest(Builder builder) {
        super(builder);
        this.apAssetId = builder.apAssetId;
        this.appCode = builder.appCode;
        this.appName = builder.appName;
        this.id = builder.id;
        this.mac = builder.mac;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DelApThirdAppRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apAssetId
     */
    public Long getApAssetId() {
        return this.apAssetId;
    }

    /**
     * @return appCode
     */
    public String getAppCode() {
        return this.appCode;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return mac
     */
    public String getMac() {
        return this.mac;
    }

    public static final class Builder extends Request.Builder<DelApThirdAppRequest, Builder> {
        private Long apAssetId; 
        private String appCode; 
        private String appName; 
        private Long id; 
        private String mac; 

        private Builder() {
            super();
        } 

        private Builder(DelApThirdAppRequest request) {
            super(request);
            this.apAssetId = request.apAssetId;
            this.appCode = request.appCode;
            this.appName = request.appName;
            this.id = request.id;
            this.mac = request.mac;
        } 

        /**
         * ApAssetId.
         */
        public Builder apAssetId(Long apAssetId) {
            this.putQueryParameter("ApAssetId", apAssetId);
            this.apAssetId = apAssetId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appCode(String appCode) {
            this.putQueryParameter("AppCode", appCode);
            this.appCode = appCode;
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
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder mac(String mac) {
            this.putQueryParameter("Mac", mac);
            this.mac = mac;
            return this;
        }

        @Override
        public DelApThirdAppRequest build() {
            return new DelApThirdAppRequest(this);
        } 

    } 

}
