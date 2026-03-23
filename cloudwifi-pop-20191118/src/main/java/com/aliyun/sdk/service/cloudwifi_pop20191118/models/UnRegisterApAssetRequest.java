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
 * {@link UnRegisterApAssetRequest} extends {@link RequestModel}
 *
 * <p>UnRegisterApAssetRequest</p>
 */
public class UnRegisterApAssetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetApgroupId")
    private Long assetApgroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private Integer category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mac")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mac;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SerialNo")
    private String serialNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseFor")
    private Integer useFor;

    private UnRegisterApAssetRequest(Builder builder) {
        super(builder);
        this.appCode = builder.appCode;
        this.appName = builder.appName;
        this.assetApgroupId = builder.assetApgroupId;
        this.category = builder.category;
        this.id = builder.id;
        this.mac = builder.mac;
        this.serialNo = builder.serialNo;
        this.useFor = builder.useFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnRegisterApAssetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return assetApgroupId
     */
    public Long getAssetApgroupId() {
        return this.assetApgroupId;
    }

    /**
     * @return category
     */
    public Integer getCategory() {
        return this.category;
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

    /**
     * @return useFor
     */
    public Integer getUseFor() {
        return this.useFor;
    }

    public static final class Builder extends Request.Builder<UnRegisterApAssetRequest, Builder> {
        private String appCode; 
        private String appName; 
        private Long assetApgroupId; 
        private Integer category; 
        private Long id; 
        private String mac; 
        private String serialNo; 
        private Integer useFor; 

        private Builder() {
            super();
        } 

        private Builder(UnRegisterApAssetRequest request) {
            super(request);
            this.appCode = request.appCode;
            this.appName = request.appName;
            this.assetApgroupId = request.assetApgroupId;
            this.category = request.category;
            this.id = request.id;
            this.mac = request.mac;
            this.serialNo = request.serialNo;
            this.useFor = request.useFor;
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
         * AssetApgroupId.
         */
        public Builder assetApgroupId(Long assetApgroupId) {
            this.putQueryParameter("AssetApgroupId", assetApgroupId);
            this.assetApgroupId = assetApgroupId;
            return this;
        }

        /**
         * Category.
         */
        public Builder category(Integer category) {
            this.putQueryParameter("Category", category);
            this.category = category;
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
         * SerialNo.
         */
        public Builder serialNo(String serialNo) {
            this.putQueryParameter("SerialNo", serialNo);
            this.serialNo = serialNo;
            return this;
        }

        /**
         * UseFor.
         */
        public Builder useFor(Integer useFor) {
            this.putQueryParameter("UseFor", useFor);
            this.useFor = useFor;
            return this;
        }

        @Override
        public UnRegisterApAssetRequest build() {
            return new UnRegisterApAssetRequest(this);
        } 

    } 

}
