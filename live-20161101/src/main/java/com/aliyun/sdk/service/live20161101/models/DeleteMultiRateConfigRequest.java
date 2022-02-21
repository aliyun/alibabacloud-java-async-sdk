// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMultiRateConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteMultiRateConfigRequest</p>
 */
public class DeleteMultiRateConfigRequest extends Request {
    @Query
    @NameInMap("App")
    @Validation(required = true)
    private String app;

    @Query
    @NameInMap("DeleteAll")
    private String deleteAll;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Templates")
    private String templates;

    private DeleteMultiRateConfigRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.deleteAll = builder.deleteAll;
        this.domainName = builder.domainName;
        this.groupId = builder.groupId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.templates = builder.templates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMultiRateConfigRequest create() {
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
     * @return deleteAll
     */
    public String getDeleteAll() {
        return this.deleteAll;
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

    public static final class Builder extends Request.Builder<DeleteMultiRateConfigRequest, Builder> {
        private String app; 
        private String deleteAll; 
        private String domainName; 
        private String groupId; 
        private Long ownerId; 
        private String regionId; 
        private String templates; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMultiRateConfigRequest response) {
            super(response);
            this.app = response.app;
            this.deleteAll = response.deleteAll;
            this.domainName = response.domainName;
            this.groupId = response.groupId;
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
         * DeleteAll.
         */
        public Builder deleteAll(String deleteAll) {
            this.putQueryParameter("DeleteAll", deleteAll);
            this.deleteAll = deleteAll;
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
        public DeleteMultiRateConfigRequest build() {
            return new DeleteMultiRateConfigRequest(this);
        } 

    } 

}
