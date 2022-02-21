// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddTrancodeSEIRequest} extends {@link RequestModel}
 *
 * <p>AddTrancodeSEIRequest</p>
 */
public class AddTrancodeSEIRequest extends Request {
    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("Delay")
    @Validation(required = true)
    private Integer delay;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Pattern")
    @Validation(required = true)
    private String pattern;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Repeat")
    @Validation(required = true)
    private Integer repeat;

    @Query
    @NameInMap("StreamName")
    @Validation(required = true)
    private String streamName;

    @Query
    @NameInMap("Text")
    @Validation(required = true)
    private String text;

    private AddTrancodeSEIRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.delay = builder.delay;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.pattern = builder.pattern;
        this.regionId = builder.regionId;
        this.repeat = builder.repeat;
        this.streamName = builder.streamName;
        this.text = builder.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddTrancodeSEIRequest create() {
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
     * @return delay
     */
    public Integer getDelay() {
        return this.delay;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pattern
     */
    public String getPattern() {
        return this.pattern;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return repeat
     */
    public Integer getRepeat() {
        return this.repeat;
    }

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    public static final class Builder extends Request.Builder<AddTrancodeSEIRequest, Builder> {
        private String appName; 
        private Integer delay; 
        private String domainName; 
        private Long ownerId; 
        private String pattern; 
        private String regionId; 
        private Integer repeat; 
        private String streamName; 
        private String text; 

        private Builder() {
            super();
        } 

        private Builder(AddTrancodeSEIRequest response) {
            super(response);
            this.appName = response.appName;
            this.delay = response.delay;
            this.domainName = response.domainName;
            this.ownerId = response.ownerId;
            this.pattern = response.pattern;
            this.regionId = response.regionId;
            this.repeat = response.repeat;
            this.streamName = response.streamName;
            this.text = response.text;
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
         * Delay.
         */
        public Builder delay(Integer delay) {
            this.putQueryParameter("Delay", delay);
            this.delay = delay;
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Pattern.
         */
        public Builder pattern(String pattern) {
            this.putQueryParameter("Pattern", pattern);
            this.pattern = pattern;
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
         * Repeat.
         */
        public Builder repeat(Integer repeat) {
            this.putQueryParameter("Repeat", repeat);
            this.repeat = repeat;
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

        /**
         * Text.
         */
        public Builder text(String text) {
            this.putQueryParameter("Text", text);
            this.text = text;
            return this;
        }

        @Override
        public AddTrancodeSEIRequest build() {
            return new AddTrancodeSEIRequest(this);
        } 

    } 

}
