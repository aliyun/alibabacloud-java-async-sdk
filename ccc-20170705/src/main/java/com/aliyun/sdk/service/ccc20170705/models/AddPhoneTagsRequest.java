// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddPhoneTagsRequest} extends {@link RequestModel}
 *
 * <p>AddPhoneTagsRequest</p>
 */
public class AddPhoneTagsRequest extends Request {
    @Query
    @NameInMap("Concurrency")
    private Integer concurrency;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PhoneNumberList")
    @Validation(required = true)
    private java.util.List < String > phoneNumberList;

    @Query
    @NameInMap("Provider")
    private String provider;

    @Query
    @NameInMap("RegionNameCity")
    private String regionNameCity;

    @Query
    @NameInMap("RegionNameProvince")
    private String regionNameProvince;

    @Query
    @NameInMap("ServiceTag")
    @Validation(required = true)
    private String serviceTag;

    @Query
    @NameInMap("SipTag")
    private String sipTag;

    @Query
    @NameInMap("Type")
    private Integer type;

    private AddPhoneTagsRequest(Builder builder) {
        super(builder);
        this.concurrency = builder.concurrency;
        this.instanceId = builder.instanceId;
        this.phoneNumberList = builder.phoneNumberList;
        this.provider = builder.provider;
        this.regionNameCity = builder.regionNameCity;
        this.regionNameProvince = builder.regionNameProvince;
        this.serviceTag = builder.serviceTag;
        this.sipTag = builder.sipTag;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddPhoneTagsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return concurrency
     */
    public Integer getConcurrency() {
        return this.concurrency;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return phoneNumberList
     */
    public java.util.List < String > getPhoneNumberList() {
        return this.phoneNumberList;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return regionNameCity
     */
    public String getRegionNameCity() {
        return this.regionNameCity;
    }

    /**
     * @return regionNameProvince
     */
    public String getRegionNameProvince() {
        return this.regionNameProvince;
    }

    /**
     * @return serviceTag
     */
    public String getServiceTag() {
        return this.serviceTag;
    }

    /**
     * @return sipTag
     */
    public String getSipTag() {
        return this.sipTag;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<AddPhoneTagsRequest, Builder> {
        private Integer concurrency; 
        private String instanceId; 
        private java.util.List < String > phoneNumberList; 
        private String provider; 
        private String regionNameCity; 
        private String regionNameProvince; 
        private String serviceTag; 
        private String sipTag; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(AddPhoneTagsRequest response) {
            super(response);
            this.concurrency = response.concurrency;
            this.instanceId = response.instanceId;
            this.phoneNumberList = response.phoneNumberList;
            this.provider = response.provider;
            this.regionNameCity = response.regionNameCity;
            this.regionNameProvince = response.regionNameProvince;
            this.serviceTag = response.serviceTag;
            this.sipTag = response.sipTag;
            this.type = response.type;
        } 

        /**
         * Concurrency.
         */
        public Builder concurrency(Integer concurrency) {
            this.putQueryParameter("Concurrency", concurrency);
            this.concurrency = concurrency;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PhoneNumberList.
         */
        public Builder phoneNumberList(java.util.List < String > phoneNumberList) {
            this.putQueryParameter("PhoneNumberList", phoneNumberList);
            this.phoneNumberList = phoneNumberList;
            return this;
        }

        /**
         * Provider.
         */
        public Builder provider(String provider) {
            this.putQueryParameter("Provider", provider);
            this.provider = provider;
            return this;
        }

        /**
         * RegionNameCity.
         */
        public Builder regionNameCity(String regionNameCity) {
            this.putQueryParameter("RegionNameCity", regionNameCity);
            this.regionNameCity = regionNameCity;
            return this;
        }

        /**
         * RegionNameProvince.
         */
        public Builder regionNameProvince(String regionNameProvince) {
            this.putQueryParameter("RegionNameProvince", regionNameProvince);
            this.regionNameProvince = regionNameProvince;
            return this;
        }

        /**
         * ServiceTag.
         */
        public Builder serviceTag(String serviceTag) {
            this.putQueryParameter("ServiceTag", serviceTag);
            this.serviceTag = serviceTag;
            return this;
        }

        /**
         * SipTag.
         */
        public Builder sipTag(String sipTag) {
            this.putQueryParameter("SipTag", sipTag);
            this.sipTag = sipTag;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public AddPhoneTagsRequest build() {
            return new AddPhoneTagsRequest(this);
        } 

    } 

}
