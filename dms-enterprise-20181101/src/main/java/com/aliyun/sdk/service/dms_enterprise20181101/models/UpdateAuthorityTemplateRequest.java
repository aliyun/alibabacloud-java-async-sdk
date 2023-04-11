// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAuthorityTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateAuthorityTemplateRequest</p>
 */
public class UpdateAuthorityTemplateRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private Long templateId;

    @Query
    @NameInMap("Tid")
    private Long tid;

    private UpdateAuthorityTemplateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.name = builder.name;
        this.templateId = builder.templateId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAuthorityTemplateRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<UpdateAuthorityTemplateRequest, Builder> {
        private String regionId; 
        private String description; 
        private String name; 
        private Long templateId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAuthorityTemplateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.name = request.name;
            this.templateId = request.templateId;
            this.tid = request.tid;
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
         * The description of the permission template.
         * <p>
         * 
         * >  You must specify the Name or Description parameter. Otherwise, the API call fails.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the permission template.
         * <p>
         * 
         * >  You must specify the Name or Description parameter. Otherwise, the API call fails.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the permission template.
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to query the tenant ID.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public UpdateAuthorityTemplateRequest build() {
            return new UpdateAuthorityTemplateRequest(this);
        } 

    } 

}
