// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateChaincodeRequest} extends {@link RequestModel}
 *
 * <p>CreateChaincodeRequest</p>
 */
public class CreateChaincodeRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ChannelId")
    @Validation(required = true)
    private String channelId;

    @Body
    @NameInMap("ConsortiumId")
    private String consortiumId;

    @Body
    @NameInMap("EndorsePolicy")
    private String endorsePolicy;

    @Body
    @NameInMap("Location")
    private String location;

    @Body
    @NameInMap("OrganizationId")
    @Validation(required = true)
    private String organizationId;

    @Body
    @NameInMap("OssBucket")
    @Validation(required = true)
    private String ossBucket;

    @Body
    @NameInMap("OssUrl")
    @Validation(required = true)
    private String ossUrl;

    private CreateChaincodeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.channelId = builder.channelId;
        this.consortiumId = builder.consortiumId;
        this.endorsePolicy = builder.endorsePolicy;
        this.location = builder.location;
        this.organizationId = builder.organizationId;
        this.ossBucket = builder.ossBucket;
        this.ossUrl = builder.ossUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateChaincodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return consortiumId
     */
    public String getConsortiumId() {
        return this.consortiumId;
    }

    /**
     * @return endorsePolicy
     */
    public String getEndorsePolicy() {
        return this.endorsePolicy;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return ossBucket
     */
    public String getOssBucket() {
        return this.ossBucket;
    }

    /**
     * @return ossUrl
     */
    public String getOssUrl() {
        return this.ossUrl;
    }

    public static final class Builder extends Request.Builder<CreateChaincodeRequest, Builder> {
        private String regionId; 
        private String channelId; 
        private String consortiumId; 
        private String endorsePolicy; 
        private String location; 
        private String organizationId; 
        private String ossBucket; 
        private String ossUrl; 

        private Builder() {
            super();
        } 

        private Builder(CreateChaincodeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.channelId = request.channelId;
            this.consortiumId = request.consortiumId;
            this.endorsePolicy = request.endorsePolicy;
            this.location = request.location;
            this.organizationId = request.organizationId;
            this.ossBucket = request.ossBucket;
            this.ossUrl = request.ossUrl;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ChannelId.
         */
        public Builder channelId(String channelId) {
            this.putBodyParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * ConsortiumId.
         */
        public Builder consortiumId(String consortiumId) {
            this.putBodyParameter("ConsortiumId", consortiumId);
            this.consortiumId = consortiumId;
            return this;
        }

        /**
         * EndorsePolicy.
         */
        public Builder endorsePolicy(String endorsePolicy) {
            this.putBodyParameter("EndorsePolicy", endorsePolicy);
            this.endorsePolicy = endorsePolicy;
            return this;
        }

        /**
         * Location.
         */
        public Builder location(String location) {
            this.putBodyParameter("Location", location);
            this.location = location;
            return this;
        }

        /**
         * OrganizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putBodyParameter("OrganizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * OssBucket.
         */
        public Builder ossBucket(String ossBucket) {
            this.putBodyParameter("OssBucket", ossBucket);
            this.ossBucket = ossBucket;
            return this;
        }

        /**
         * OssUrl.
         */
        public Builder ossUrl(String ossUrl) {
            this.putBodyParameter("OssUrl", ossUrl);
            this.ossUrl = ossUrl;
            return this;
        }

        @Override
        public CreateChaincodeRequest build() {
            return new CreateChaincodeRequest(this);
        } 

    } 

}
