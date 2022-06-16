// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeApplicationInfoRequest} extends {@link RequestModel}
 *
 * <p>ChangeApplicationInfoRequest</p>
 */
public class ChangeApplicationInfoRequest extends Request {
    @Body
    @NameInMap("AliUid")
    private Long aliUid;

    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("AppName")
    private String appName;

    @Body
    @NameInMap("AppTypeList")
    private String appTypeList;

    @Body
    @NameInMap("AppingList")
    private String appingList;

    @Body
    @NameInMap("ItemCode")
    private String itemCode;

    private ChangeApplicationInfoRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.appTypeList = builder.appTypeList;
        this.appingList = builder.appingList;
        this.itemCode = builder.itemCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeApplicationInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appTypeList
     */
    public String getAppTypeList() {
        return this.appTypeList;
    }

    /**
     * @return appingList
     */
    public String getAppingList() {
        return this.appingList;
    }

    /**
     * @return itemCode
     */
    public String getItemCode() {
        return this.itemCode;
    }

    public static final class Builder extends Request.Builder<ChangeApplicationInfoRequest, Builder> {
        private Long aliUid; 
        private String appId; 
        private String appName; 
        private String appTypeList; 
        private String appingList; 
        private String itemCode; 

        private Builder() {
            super();
        } 

        private Builder(ChangeApplicationInfoRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.appId = request.appId;
            this.appName = request.appName;
            this.appTypeList = request.appTypeList;
            this.appingList = request.appingList;
            this.itemCode = request.itemCode;
        } 

        /**
         * 阿里UID
         */
        public Builder aliUid(Long aliUid) {
            this.putBodyParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * 应用名称
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * dynamic|static
         */
        public Builder appTypeList(String appTypeList) {
            this.putBodyParameter("AppTypeList", appTypeList);
            this.appTypeList = appTypeList;
            return this;
        }

        /**
         * [
         */
        public Builder appingList(String appingList) {
            this.putBodyParameter("AppingList", appingList);
            this.appingList = appingList;
            return this;
        }

        /**
         * 商品code
         */
        public Builder itemCode(String itemCode) {
            this.putBodyParameter("ItemCode", itemCode);
            this.itemCode = itemCode;
            return this;
        }

        @Override
        public ChangeApplicationInfoRequest build() {
            return new ChangeApplicationInfoRequest(this);
        } 

    } 

}
