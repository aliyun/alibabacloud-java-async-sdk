// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TestDescribeRegionsRequest} extends {@link RequestModel}
 *
 * <p>TestDescribeRegionsRequest</p>
 */
public class TestDescribeRegionsRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    private TestDescribeRegionsRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.regionId = builder.regionId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TestDescribeRegionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<TestDescribeRegionsRequest, Builder> {
        private String acceptLanguage; 
        private String regionId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(TestDescribeRegionsRequest response) {
            super(response);
            this.acceptLanguage = response.acceptLanguage;
            this.regionId = response.regionId;
            this.resourceType = response.resourceType;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
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
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public TestDescribeRegionsRequest build() {
            return new TestDescribeRegionsRequest(this);
        } 

    } 

}
