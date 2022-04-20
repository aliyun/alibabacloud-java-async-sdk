// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppTemplateConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateAppTemplateConfigRequest</p>
 */
public class UpdateAppTemplateConfigRequest extends Request {
    @Body
    @NameInMap("AppTemplateId")
    @Validation(required = true)
    private String appTemplateId;

    @Body
    @NameInMap("ConfigList")
    private java.util.List < ConfigList> configList;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private UpdateAppTemplateConfigRequest(Builder builder) {
        super(builder);
        this.appTemplateId = builder.appTemplateId;
        this.configList = builder.configList;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAppTemplateConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appTemplateId
     */
    public String getAppTemplateId() {
        return this.appTemplateId;
    }

    /**
     * @return configList
     */
    public java.util.List < ConfigList> getConfigList() {
        return this.configList;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateAppTemplateConfigRequest, Builder> {
        private String appTemplateId; 
        private java.util.List < ConfigList> configList; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAppTemplateConfigRequest request) {
            super(request);
            this.appTemplateId = request.appTemplateId;
            this.configList = request.configList;
            this.regionId = request.regionId;
        } 

        /**
         * 应用模板唯一标识
         */
        public Builder appTemplateId(String appTemplateId) {
            this.putBodyParameter("AppTemplateId", appTemplateId);
            this.appTemplateId = appTemplateId;
            return this;
        }

        /**
         * 更新配置
         */
        public Builder configList(java.util.List < ConfigList> configList) {
            String configListShrink = shrink(configList, "ConfigList", "json");
            this.putBodyParameter("ConfigList", configListShrink);
            this.configList = configList;
            return this;
        }

        /**
         * 地域
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateAppTemplateConfigRequest build() {
            return new UpdateAppTemplateConfigRequest(this);
        } 

    } 

    public static class ConfigList extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private ConfigList(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigList create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ConfigList build() {
                return new ConfigList(this);
            } 

        } 

    }
}
