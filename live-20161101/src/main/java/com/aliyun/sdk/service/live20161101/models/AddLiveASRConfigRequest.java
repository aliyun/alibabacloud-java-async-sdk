// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddLiveASRConfigRequest} extends {@link RequestModel}
 *
 * <p>AddLiveASRConfigRequest</p>
 */
public class AddLiveASRConfigRequest extends Request {
    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("HttpCallbackURL")
    private String httpCallbackURL;

    @Query
    @NameInMap("MnsRegion")
    private String mnsRegion;

    @Query
    @NameInMap("MnsTopic")
    private String mnsTopic;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StreamName")
    @Validation(required = true)
    private String streamName;

    private AddLiveASRConfigRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.domainName = builder.domainName;
        this.httpCallbackURL = builder.httpCallbackURL;
        this.mnsRegion = builder.mnsRegion;
        this.mnsTopic = builder.mnsTopic;
        this.ownerId = builder.ownerId;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.streamName = builder.streamName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddLiveASRConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return httpCallbackURL
     */
    public String getHttpCallbackURL() {
        return this.httpCallbackURL;
    }

    /**
     * @return mnsRegion
     */
    public String getMnsRegion() {
        return this.mnsRegion;
    }

    /**
     * @return mnsTopic
     */
    public String getMnsTopic() {
        return this.mnsTopic;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    public static final class Builder extends Request.Builder<AddLiveASRConfigRequest, Builder> {
        private String appName; 
        private String domainName; 
        private String httpCallbackURL; 
        private String mnsRegion; 
        private String mnsTopic; 
        private Long ownerId; 
        private Integer period; 
        private String regionId; 
        private String streamName; 

        private Builder() {
            super();
        } 

        private Builder(AddLiveASRConfigRequest response) {
            super(response);
            this.appName = response.appName;
            this.domainName = response.domainName;
            this.httpCallbackURL = response.httpCallbackURL;
            this.mnsRegion = response.mnsRegion;
            this.mnsTopic = response.mnsTopic;
            this.ownerId = response.ownerId;
            this.period = response.period;
            this.regionId = response.regionId;
            this.streamName = response.streamName;
        } 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * HttpCallbackURL.
         */
        public Builder httpCallbackURL(String httpCallbackURL) {
            this.putQueryParameter("HttpCallbackURL", httpCallbackURL);
            this.httpCallbackURL = httpCallbackURL;
            return this;
        }

        /**
         * MnsRegion.
         */
        public Builder mnsRegion(String mnsRegion) {
            this.putQueryParameter("MnsRegion", mnsRegion);
            this.mnsRegion = mnsRegion;
            return this;
        }

        /**
         * MnsTopic.
         */
        public Builder mnsTopic(String mnsTopic) {
            this.putQueryParameter("MnsTopic", mnsTopic);
            this.mnsTopic = mnsTopic;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
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
         * StreamName.
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        @Override
        public AddLiveASRConfigRequest build() {
            return new AddLiveASRConfigRequest(this);
        } 

    } 

}
