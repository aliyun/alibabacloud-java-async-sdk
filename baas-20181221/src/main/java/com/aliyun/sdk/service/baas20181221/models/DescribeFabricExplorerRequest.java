// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricExplorerRequest} extends {@link RequestModel}
 *
 * <p>DescribeFabricExplorerRequest</p>
 */
public class DescribeFabricExplorerRequest extends Request {
    @Query
    @NameInMap("ExBody")
    private String exBody;

    @Query
    @NameInMap("ExMethod")
    @Validation(required = true)
    private String exMethod;

    @Query
    @NameInMap("ExUrl")
    @Validation(required = true)
    private String exUrl;

    @Body
    @NameInMap("OrganizationId")
    @Validation(required = true)
    private String organizationId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeFabricExplorerRequest(Builder builder) {
        super(builder);
        this.exBody = builder.exBody;
        this.exMethod = builder.exMethod;
        this.exUrl = builder.exUrl;
        this.organizationId = builder.organizationId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFabricExplorerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exBody
     */
    public String getExBody() {
        return this.exBody;
    }

    /**
     * @return exMethod
     */
    public String getExMethod() {
        return this.exMethod;
    }

    /**
     * @return exUrl
     */
    public String getExUrl() {
        return this.exUrl;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeFabricExplorerRequest, Builder> {
        private String exBody; 
        private String exMethod; 
        private String exUrl; 
        private String organizationId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFabricExplorerRequest response) {
            super(response);
            this.exBody = response.exBody;
            this.exMethod = response.exMethod;
            this.exUrl = response.exUrl;
            this.organizationId = response.organizationId;
            this.regionId = response.regionId;
        } 

        /**
         * ExBody.
         */
        public Builder exBody(String exBody) {
            this.putQueryParameter("ExBody", exBody);
            this.exBody = exBody;
            return this;
        }

        /**
         * ExMethod.
         */
        public Builder exMethod(String exMethod) {
            this.putQueryParameter("ExMethod", exMethod);
            this.exMethod = exMethod;
            return this;
        }

        /**
         * ExUrl.
         */
        public Builder exUrl(String exUrl) {
            this.putQueryParameter("ExUrl", exUrl);
            this.exUrl = exUrl;
            return this;
        }

        /**
         * OrganizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putBodyParameter("OrganizationId", organizationId);
            this.organizationId = organizationId;
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
        public DescribeFabricExplorerRequest build() {
            return new DescribeFabricExplorerRequest(this);
        } 

    } 

}
