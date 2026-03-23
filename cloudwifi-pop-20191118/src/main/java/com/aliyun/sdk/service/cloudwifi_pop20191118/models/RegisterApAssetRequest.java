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
 * {@link RegisterApAssetRequest} extends {@link RequestModel}
 *
 * <p>RegisterApAssetRequest</p>
 */
public class RegisterApAssetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApGroupUUId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apGroupUUId;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SerialNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serialNo;

    private RegisterApAssetRequest(Builder builder) {
        super(builder);
        this.apGroupUUId = builder.apGroupUUId;
        this.appCode = builder.appCode;
        this.appName = builder.appName;
        this.id = builder.id;
        this.mac = builder.mac;
        this.serialNo = builder.serialNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterApAssetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apGroupUUId
     */
    public String getApGroupUUId() {
        return this.apGroupUUId;
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

    /**
     * @return serialNo
     */
    public String getSerialNo() {
        return this.serialNo;
    }

    public static final class Builder extends Request.Builder<RegisterApAssetRequest, Builder> {
        private String apGroupUUId; 
        private String appCode; 
        private String appName; 
        private Long id; 
        private String mac; 
        private String serialNo; 

        private Builder() {
            super();
        } 

        private Builder(RegisterApAssetRequest request) {
            super(request);
            this.apGroupUUId = request.apGroupUUId;
            this.appCode = request.appCode;
            this.appName = request.appName;
            this.id = request.id;
            this.mac = request.mac;
            this.serialNo = request.serialNo;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder apGroupUUId(String apGroupUUId) {
            this.putQueryParameter("ApGroupUUId", apGroupUUId);
            this.apGroupUUId = apGroupUUId;
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

        /**
         * <p>This parameter is required.</p>
         */
        public Builder serialNo(String serialNo) {
            this.putQueryParameter("SerialNo", serialNo);
            this.serialNo = serialNo;
            return this;
        }

        @Override
        public RegisterApAssetRequest build() {
            return new RegisterApAssetRequest(this);
        } 

    } 

}
