// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApplicationRequest} extends {@link RequestModel}
 *
 * <p>CreateApplicationRequest</p>
 */
public class CreateApplicationRequest extends Request {
    @Body
    @NameInMap("AppDescription")
    private String appDescription;

    @Body
    @NameInMap("AppName")
    private String appName;

    @Body
    @NameInMap("CategoryName")
    private String categoryName;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("UsingSharedStorage")
    private Boolean usingSharedStorage;

    private CreateApplicationRequest(Builder builder) {
        super(builder);
        this.appDescription = builder.appDescription;
        this.appName = builder.appName;
        this.categoryName = builder.categoryName;
        this.regionId = builder.regionId;
        this.usingSharedStorage = builder.usingSharedStorage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appDescription
     */
    public String getAppDescription() {
        return this.appDescription;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return categoryName
     */
    public String getCategoryName() {
        return this.categoryName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return usingSharedStorage
     */
    public Boolean getUsingSharedStorage() {
        return this.usingSharedStorage;
    }

    public static final class Builder extends Request.Builder<CreateApplicationRequest, Builder> {
        private String appDescription; 
        private String appName; 
        private String categoryName; 
        private String regionId; 
        private Boolean usingSharedStorage; 

        private Builder() {
            super();
        } 

        private Builder(CreateApplicationRequest response) {
            super(response);
            this.appDescription = response.appDescription;
            this.appName = response.appName;
            this.categoryName = response.categoryName;
            this.regionId = response.regionId;
            this.usingSharedStorage = response.usingSharedStorage;
        } 

        /**
         * AppDescription.
         */
        public Builder appDescription(String appDescription) {
            this.putBodyParameter("AppDescription", appDescription);
            this.appDescription = appDescription;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * CategoryName.
         */
        public Builder categoryName(String categoryName) {
            this.putBodyParameter("CategoryName", categoryName);
            this.categoryName = categoryName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * UsingSharedStorage.
         */
        public Builder usingSharedStorage(Boolean usingSharedStorage) {
            this.putBodyParameter("UsingSharedStorage", usingSharedStorage);
            this.usingSharedStorage = usingSharedStorage;
            return this;
        }

        @Override
        public CreateApplicationRequest build() {
            return new CreateApplicationRequest(this);
        } 

    } 

}
