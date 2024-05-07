// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMockRuleRequest} extends {@link RequestModel}
 *
 * <p>AddMockRuleRequest</p>
 */
public class AddMockRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumerAppIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumerAppIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DubboMockItems")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dubboMockItems;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtraJson")
    @com.aliyun.core.annotation.Validation(required = true)
    private String extraJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MockType")
    private Long mockType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProviderAppId")
    private String providerAppId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProviderAppName")
    private String providerAppName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScMockItems")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scMockItems;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    @com.aliyun.core.annotation.Validation(required = true)
    private String source;

    private AddMockRuleRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.consumerAppIds = builder.consumerAppIds;
        this.dubboMockItems = builder.dubboMockItems;
        this.enable = builder.enable;
        this.extraJson = builder.extraJson;
        this.mockType = builder.mockType;
        this.name = builder.name;
        this.providerAppId = builder.providerAppId;
        this.providerAppName = builder.providerAppName;
        this.region = builder.region;
        this.scMockItems = builder.scMockItems;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMockRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return consumerAppIds
     */
    public String getConsumerAppIds() {
        return this.consumerAppIds;
    }

    /**
     * @return dubboMockItems
     */
    public String getDubboMockItems() {
        return this.dubboMockItems;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return extraJson
     */
    public String getExtraJson() {
        return this.extraJson;
    }

    /**
     * @return mockType
     */
    public Long getMockType() {
        return this.mockType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return providerAppId
     */
    public String getProviderAppId() {
        return this.providerAppId;
    }

    /**
     * @return providerAppName
     */
    public String getProviderAppName() {
        return this.providerAppName;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return scMockItems
     */
    public String getScMockItems() {
        return this.scMockItems;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<AddMockRuleRequest, Builder> {
        private String acceptLanguage; 
        private String consumerAppIds; 
        private String dubboMockItems; 
        private Boolean enable; 
        private String extraJson; 
        private Long mockType; 
        private String name; 
        private String providerAppId; 
        private String providerAppName; 
        private String region; 
        private String scMockItems; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(AddMockRuleRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.consumerAppIds = request.consumerAppIds;
            this.dubboMockItems = request.dubboMockItems;
            this.enable = request.enable;
            this.extraJson = request.extraJson;
            this.mockType = request.mockType;
            this.name = request.name;
            this.providerAppId = request.providerAppId;
            this.providerAppName = request.providerAppName;
            this.region = request.region;
            this.scMockItems = request.scMockItems;
            this.source = request.source;
        } 

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * The ID of the custom application.
         */
        public Builder consumerAppIds(String consumerAppIds) {
            this.putQueryParameter("ConsumerAppIds", consumerAppIds);
            this.consumerAppIds = consumerAppIds;
            return this;
        }

        /**
         * The items in the recycle bin.
         */
        public Builder dubboMockItems(String dubboMockItems) {
            this.putQueryParameter("DubboMockItems", dubboMockItems);
            this.dubboMockItems = dubboMockItems;
            return this;
        }

        /**
         * Specifies whether to enable the alert rule. Valid values:
         * <p>
         * 
         * *   `true`: enables the alert rule.
         * *   `false`: disables the alert rule.
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * The description.
         */
        public Builder extraJson(String extraJson) {
            this.putQueryParameter("ExtraJson", extraJson);
            this.extraJson = extraJson;
            return this;
        }

        /**
         * The response time (RT) threshold of slow calls. Valid values:
         * <p>
         * 
         * *   \- 15: 15 ms
         * *   \- 30: 30 ms
         * *   \- 60: 60 ms
         * *   \- 120: 120 ms
         */
        public Builder mockType(Long mockType) {
            this.putQueryParameter("MockType", mockType);
            this.mockType = mockType;
            return this;
        }

        /**
         * The name of the rule.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the service provider application.
         */
        public Builder providerAppId(String providerAppId) {
            this.putQueryParameter("ProviderAppId", providerAppId);
            this.providerAppId = providerAppId;
            return this;
        }

        /**
         * The name of the service provider application.
         */
        public Builder providerAppName(String providerAppName) {
            this.putQueryParameter("ProviderAppName", providerAppName);
            this.providerAppName = providerAppName;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * The input parameters. The JSON format is supported.
         */
        public Builder scMockItems(String scMockItems) {
            this.putQueryParameter("ScMockItems", scMockItems);
            this.scMockItems = scMockItems;
            return this;
        }

        /**
         * The rule source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public AddMockRuleRequest build() {
            return new AddMockRuleRequest(this);
        } 

    } 

}
