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
 * {@link SaveApThirdAppRequest} extends {@link RequestModel}
 *
 * <p>SaveApThirdAppRequest</p>
 */
public class SaveApThirdAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddStyle")
    private Integer addStyle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApAssetId")
    private Long apAssetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppData")
    private String appData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

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
    @com.aliyun.core.annotation.NameInMap("ThirdAppName")
    private String thirdAppName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private SaveApThirdAppRequest(Builder builder) {
        super(builder);
        this.addStyle = builder.addStyle;
        this.apAssetId = builder.apAssetId;
        this.appCode = builder.appCode;
        this.appData = builder.appData;
        this.appName = builder.appName;
        this.category = builder.category;
        this.id = builder.id;
        this.mac = builder.mac;
        this.thirdAppName = builder.thirdAppName;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveApThirdAppRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addStyle
     */
    public Integer getAddStyle() {
        return this.addStyle;
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
     * @return appData
     */
    public String getAppData() {
        return this.appData;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
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
     * @return thirdAppName
     */
    public String getThirdAppName() {
        return this.thirdAppName;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<SaveApThirdAppRequest, Builder> {
        private Integer addStyle; 
        private Long apAssetId; 
        private String appCode; 
        private String appData; 
        private String appName; 
        private Integer category; 
        private Long id; 
        private String mac; 
        private String thirdAppName; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(SaveApThirdAppRequest request) {
            super(request);
            this.addStyle = request.addStyle;
            this.apAssetId = request.apAssetId;
            this.appCode = request.appCode;
            this.appData = request.appData;
            this.appName = request.appName;
            this.category = request.category;
            this.id = request.id;
            this.mac = request.mac;
            this.thirdAppName = request.thirdAppName;
            this.version = request.version;
        } 

        /**
         * AddStyle.
         */
        public Builder addStyle(Integer addStyle) {
            this.putQueryParameter("AddStyle", addStyle);
            this.addStyle = addStyle;
            return this;
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
         * AppData.
         */
        public Builder appData(String appData) {
            this.putQueryParameter("AppData", appData);
            this.appData = appData;
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
         * ThirdAppName.
         */
        public Builder thirdAppName(String thirdAppName) {
            this.putQueryParameter("ThirdAppName", thirdAppName);
            this.thirdAppName = thirdAppName;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public SaveApThirdAppRequest build() {
            return new SaveApThirdAppRequest(this);
        } 

    } 

}
