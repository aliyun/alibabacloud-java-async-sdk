// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLiveStreamWatermarkRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteLiveStreamWatermarkRuleRequest</p>
 */
public class DeleteLiveStreamWatermarkRuleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("App")
    private String app;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RuleId")
    private String ruleId;

    @Query
    @NameInMap("Stream")
    private String stream;

    private DeleteLiveStreamWatermarkRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.app = builder.app;
        this.domain = builder.domain;
        this.ownerId = builder.ownerId;
        this.ruleId = builder.ruleId;
        this.stream = builder.stream;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLiveStreamWatermarkRuleRequest create() {
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
     * @return app
     */
    public String getApp() {
        return this.app;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return stream
     */
    public String getStream() {
        return this.stream;
    }

    public static final class Builder extends Request.Builder<DeleteLiveStreamWatermarkRuleRequest, Builder> {
        private String regionId; 
        private String app; 
        private String domain; 
        private Long ownerId; 
        private String ruleId; 
        private String stream; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLiveStreamWatermarkRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.app = request.app;
            this.domain = request.domain;
            this.ownerId = request.ownerId;
            this.ruleId = request.ruleId;
            this.stream = request.stream;
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
         * App.
         */
        public Builder app(String app) {
            this.putQueryParameter("App", app);
            this.app = app;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
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
         * RuleId.
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * Stream.
         */
        public Builder stream(String stream) {
            this.putQueryParameter("Stream", stream);
            this.stream = stream;
            return this;
        }

        @Override
        public DeleteLiveStreamWatermarkRuleRequest build() {
            return new DeleteLiveStreamWatermarkRuleRequest(this);
        } 

    } 

}
