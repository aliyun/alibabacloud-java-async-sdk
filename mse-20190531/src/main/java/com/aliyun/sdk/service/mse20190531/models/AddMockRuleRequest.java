// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMockRuleRequest} extends {@link RequestModel}
 *
 * <p>AddMockRuleRequest</p>
 */
public class AddMockRuleRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("ConsumerAppIds")
    @Validation(required = true)
    private String consumerAppIds;

    @Query
    @NameInMap("DubboMockItems")
    @Validation(required = true)
    private String dubboMockItems;

    @Query
    @NameInMap("Enable")
    private Boolean enable;

    @Query
    @NameInMap("ExtraJson")
    @Validation(required = true)
    private String extraJson;

    @Query
    @NameInMap("MockType")
    private Long mockType;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("ProviderAppId")
    private String providerAppId;

    @Query
    @NameInMap("ProviderAppName")
    private String providerAppName;

    @Query
    @NameInMap("Region")
    @Validation(required = true)
    private String region;

    @Query
    @NameInMap("ScMockItems")
    @Validation(required = true)
    private String scMockItems;

    @Query
    @NameInMap("Source")
    @Validation(required = true)
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
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * ConsumerAppIds.
         */
        public Builder consumerAppIds(String consumerAppIds) {
            this.putQueryParameter("ConsumerAppIds", consumerAppIds);
            this.consumerAppIds = consumerAppIds;
            return this;
        }

        /**
         * DubboMockItems.
         */
        public Builder dubboMockItems(String dubboMockItems) {
            this.putQueryParameter("DubboMockItems", dubboMockItems);
            this.dubboMockItems = dubboMockItems;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * ExtraJson.
         */
        public Builder extraJson(String extraJson) {
            this.putQueryParameter("ExtraJson", extraJson);
            this.extraJson = extraJson;
            return this;
        }

        /**
         * MockType.
         */
        public Builder mockType(Long mockType) {
            this.putQueryParameter("MockType", mockType);
            this.mockType = mockType;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ProviderAppId.
         */
        public Builder providerAppId(String providerAppId) {
            this.putQueryParameter("ProviderAppId", providerAppId);
            this.providerAppId = providerAppId;
            return this;
        }

        /**
         * ProviderAppName.
         */
        public Builder providerAppName(String providerAppName) {
            this.putQueryParameter("ProviderAppName", providerAppName);
            this.providerAppName = providerAppName;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * ScMockItems.
         */
        public Builder scMockItems(String scMockItems) {
            this.putQueryParameter("ScMockItems", scMockItems);
            this.scMockItems = scMockItems;
            return this;
        }

        /**
         * Source.
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
