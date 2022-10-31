// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMultiRateConfigRequest} extends {@link RequestModel}
 *
 * <p>AddMultiRateConfigRequest</p>
 */
public class AddMultiRateConfigRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("App")
    @Validation(required = true)
    private String app;

    @Query
    @NameInMap("AvFormat")
    @Validation(required = true)
    private String avFormat;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("IsLazy")
    private String isLazy;

    @Query
    @NameInMap("IsTimeAlign")
    private String isTimeAlign;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Templates")
    @Validation(required = true)
    private String templates;

    private AddMultiRateConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.app = builder.app;
        this.avFormat = builder.avFormat;
        this.domainName = builder.domainName;
        this.groupId = builder.groupId;
        this.isLazy = builder.isLazy;
        this.isTimeAlign = builder.isTimeAlign;
        this.ownerId = builder.ownerId;
        this.templates = builder.templates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMultiRateConfigRequest create() {
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
     * @return avFormat
     */
    public String getAvFormat() {
        return this.avFormat;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return isLazy
     */
    public String getIsLazy() {
        return this.isLazy;
    }

    /**
     * @return isTimeAlign
     */
    public String getIsTimeAlign() {
        return this.isTimeAlign;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return templates
     */
    public String getTemplates() {
        return this.templates;
    }

    public static final class Builder extends Request.Builder<AddMultiRateConfigRequest, Builder> {
        private String regionId; 
        private String app; 
        private String avFormat; 
        private String domainName; 
        private String groupId; 
        private String isLazy; 
        private String isTimeAlign; 
        private Long ownerId; 
        private String templates; 

        private Builder() {
            super();
        } 

        private Builder(AddMultiRateConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.app = request.app;
            this.avFormat = request.avFormat;
            this.domainName = request.domainName;
            this.groupId = request.groupId;
            this.isLazy = request.isLazy;
            this.isTimeAlign = request.isTimeAlign;
            this.ownerId = request.ownerId;
            this.templates = request.templates;
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
         * AvFormat.
         */
        public Builder avFormat(String avFormat) {
            this.putQueryParameter("AvFormat", avFormat);
            this.avFormat = avFormat;
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
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * IsLazy.
         */
        public Builder isLazy(String isLazy) {
            this.putQueryParameter("IsLazy", isLazy);
            this.isLazy = isLazy;
            return this;
        }

        /**
         * IsTimeAlign.
         */
        public Builder isTimeAlign(String isTimeAlign) {
            this.putQueryParameter("IsTimeAlign", isTimeAlign);
            this.isTimeAlign = isTimeAlign;
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
         * Templates.
         */
        public Builder templates(String templates) {
            this.putQueryParameter("Templates", templates);
            this.templates = templates;
            return this;
        }

        @Override
        public AddMultiRateConfigRequest build() {
            return new AddMultiRateConfigRequest(this);
        } 

    } 

}
