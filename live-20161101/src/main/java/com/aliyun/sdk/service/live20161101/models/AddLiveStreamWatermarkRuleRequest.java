// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddLiveStreamWatermarkRuleRequest} extends {@link RequestModel}
 *
 * <p>AddLiveStreamWatermarkRuleRequest</p>
 */
public class AddLiveStreamWatermarkRuleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("App")
    @Validation(required = true)
    private String app;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Stream")
    @Validation(required = true)
    private String stream;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private String templateId;

    private AddLiveStreamWatermarkRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.app = builder.app;
        this.description = builder.description;
        this.domain = builder.domain;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.stream = builder.stream;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddLiveStreamWatermarkRuleRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return stream
     */
    public String getStream() {
        return this.stream;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<AddLiveStreamWatermarkRuleRequest, Builder> {
        private String regionId; 
        private String app; 
        private String description; 
        private String domain; 
        private String name; 
        private Long ownerId; 
        private String stream; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(AddLiveStreamWatermarkRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.app = request.app;
            this.description = request.description;
            this.domain = request.domain;
            this.name = request.name;
            this.ownerId = request.ownerId;
            this.stream = request.stream;
            this.templateId = request.templateId;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * Stream.
         */
        public Builder stream(String stream) {
            this.putQueryParameter("Stream", stream);
            this.stream = stream;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public AddLiveStreamWatermarkRuleRequest build() {
            return new AddLiveStreamWatermarkRuleRequest(this);
        } 

    } 

}
