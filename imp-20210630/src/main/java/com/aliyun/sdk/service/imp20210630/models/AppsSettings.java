// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AppsSettings} extends {@link TeaModel}
 *
 * <p>AppsSettings</p>
 */
public class AppsSettings extends TeaModel {
    @NameInMap("AppId")
    private String appId;

    @NameInMap("CloudUid")
    private String cloudUid;

    @NameInMap("Customer")
    private CommonCustomer customer;

    @NameInMap("InteractiveVideoSettings")
    private AppsInteractiveVideoSettings interactiveVideoSettings;

    private AppsSettings(Builder builder) {
        this.appId = builder.appId;
        this.cloudUid = builder.cloudUid;
        this.customer = builder.customer;
        this.interactiveVideoSettings = builder.interactiveVideoSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppsSettings create() {
        return builder().build();
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return cloudUid
     */
    public String getCloudUid() {
        return this.cloudUid;
    }

    /**
     * @return customer
     */
    public CommonCustomer getCustomer() {
        return this.customer;
    }

    /**
     * @return interactiveVideoSettings
     */
    public AppsInteractiveVideoSettings getInteractiveVideoSettings() {
        return this.interactiveVideoSettings;
    }

    public static final class Builder {
        private String appId; 
        private String cloudUid; 
        private CommonCustomer customer; 
        private AppsInteractiveVideoSettings interactiveVideoSettings; 

        /**
         * AppId
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * 云帐号Id
         */
        public Builder cloudUid(String cloudUid) {
            this.cloudUid = cloudUid;
            return this;
        }

        /**
         * 客户非敏感信息
         */
        public Builder customer(CommonCustomer customer) {
            this.customer = customer;
            return this;
        }

        /**
         * 互动视频配置
         */
        public Builder interactiveVideoSettings(AppsInteractiveVideoSettings interactiveVideoSettings) {
            this.interactiveVideoSettings = interactiveVideoSettings;
            return this;
        }

        public AppsSettings build() {
            return new AppsSettings(this);
        } 

    } 

}
