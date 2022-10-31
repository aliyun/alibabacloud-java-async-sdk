// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DynamicUpdateWaterMarkStreamRuleRequest} extends {@link RequestModel}
 *
 * <p>DynamicUpdateWaterMarkStreamRuleRequest</p>
 */
public class DynamicUpdateWaterMarkStreamRuleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("App")
    @Validation(required = true)
    private String app;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

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

    private DynamicUpdateWaterMarkStreamRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.app = builder.app;
        this.domain = builder.domain;
        this.ownerId = builder.ownerId;
        this.stream = builder.stream;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DynamicUpdateWaterMarkStreamRuleRequest create() {
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

    public static final class Builder extends Request.Builder<DynamicUpdateWaterMarkStreamRuleRequest, Builder> {
        private String regionId; 
        private String app; 
        private String domain; 
        private Long ownerId; 
        private String stream; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(DynamicUpdateWaterMarkStreamRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.app = request.app;
            this.domain = request.domain;
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
        public DynamicUpdateWaterMarkStreamRuleRequest build() {
            return new DynamicUpdateWaterMarkStreamRuleRequest(this);
        } 

    } 

}
