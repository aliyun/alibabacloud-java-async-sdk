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

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Templates")
    @Validation(required = true)
    private String templates;

    private AddMultiRateConfigRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.avFormat = builder.avFormat;
        this.domainName = builder.domainName;
        this.groupId = builder.groupId;
        this.isLazy = builder.isLazy;
        this.isTimeAlign = builder.isTimeAlign;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return templates
     */
    public String getTemplates() {
        return this.templates;
    }

    public static final class Builder extends Request.Builder<AddMultiRateConfigRequest, Builder> {
        private String app; 
        private String avFormat; 
        private String domainName; 
        private String groupId; 
        private String isLazy; 
        private String isTimeAlign; 
        private Long ownerId; 
        private String regionId; 
        private String templates; 

        private Builder() {
            super();
        } 

        private Builder(AddMultiRateConfigRequest response) {
            super(response);
            this.app = response.app;
            this.avFormat = response.avFormat;
            this.domainName = response.domainName;
            this.groupId = response.groupId;
            this.isLazy = response.isLazy;
            this.isTimeAlign = response.isTimeAlign;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.templates = response.templates;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
