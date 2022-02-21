// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateProjectRequest</p>
 */
public class CreateProjectRequest extends Request {
    @Query
    @NameInMap("BuilderUserIdList")
    private String builderUserIdList;

    @Query
    @NameInMap("BusinessId")
    private String businessId;

    @Query
    @NameInMap("BusinessUserIdList")
    private String businessUserIdList;

    @Query
    @NameInMap("GatherUserIdList")
    private String gatherUserIdList;

    @Query
    @NameInMap("Name")
    private String name;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CreateProjectRequest(Builder builder) {
        super(builder);
        this.builderUserIdList = builder.builderUserIdList;
        this.businessId = builder.businessId;
        this.businessUserIdList = builder.businessUserIdList;
        this.gatherUserIdList = builder.gatherUserIdList;
        this.name = builder.name;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return builderUserIdList
     */
    public String getBuilderUserIdList() {
        return this.builderUserIdList;
    }

    /**
     * @return businessId
     */
    public String getBusinessId() {
        return this.businessId;
    }

    /**
     * @return businessUserIdList
     */
    public String getBusinessUserIdList() {
        return this.businessUserIdList;
    }

    /**
     * @return gatherUserIdList
     */
    public String getGatherUserIdList() {
        return this.gatherUserIdList;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateProjectRequest, Builder> {
        private String builderUserIdList; 
        private String businessId; 
        private String businessUserIdList; 
        private String gatherUserIdList; 
        private String name; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateProjectRequest response) {
            super(response);
            this.builderUserIdList = response.builderUserIdList;
            this.businessId = response.businessId;
            this.businessUserIdList = response.businessUserIdList;
            this.gatherUserIdList = response.gatherUserIdList;
            this.name = response.name;
            this.regionId = response.regionId;
        } 

        /**
         * BuilderUserIdList.
         */
        public Builder builderUserIdList(String builderUserIdList) {
            this.putQueryParameter("BuilderUserIdList", builderUserIdList);
            this.builderUserIdList = builderUserIdList;
            return this;
        }

        /**
         * BusinessId.
         */
        public Builder businessId(String businessId) {
            this.putQueryParameter("BusinessId", businessId);
            this.businessId = businessId;
            return this;
        }

        /**
         * BusinessUserIdList.
         */
        public Builder businessUserIdList(String businessUserIdList) {
            this.putQueryParameter("BusinessUserIdList", businessUserIdList);
            this.businessUserIdList = businessUserIdList;
            return this;
        }

        /**
         * GatherUserIdList.
         */
        public Builder gatherUserIdList(String gatherUserIdList) {
            this.putQueryParameter("GatherUserIdList", gatherUserIdList);
            this.gatherUserIdList = gatherUserIdList;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateProjectRequest build() {
            return new CreateProjectRequest(this);
        } 

    } 

}
