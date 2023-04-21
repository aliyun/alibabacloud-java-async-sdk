// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulDetailsRequest} extends {@link RequestModel}
 *
 * <p>DescribeVulDetailsRequest</p>
 */
public class DescribeVulDetailsRequest extends Request {
    @Query
    @NameInMap("AliasName")
    private String aliasName;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private DescribeVulDetailsRequest(Builder builder) {
        super(builder);
        this.aliasName = builder.aliasName;
        this.lang = builder.lang;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulDetailsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliasName
     */
    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeVulDetailsRequest, Builder> {
        private String aliasName; 
        private String lang; 
        private String name; 
        private String regionId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVulDetailsRequest request) {
            super(request);
            this.aliasName = request.aliasName;
            this.lang = request.lang;
            this.name = request.name;
            this.regionId = request.regionId;
            this.type = request.type;
        } 

        /**
         * The alias of the vulnerability.
         */
        public Builder aliasName(String aliasName) {
            this.putQueryParameter("AliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        /**
         * The natural language of the request and response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The name of the Redhat Package Manager (RPM) package.
         * <p>
         * 
         * You can call the [DescribeVulList](~~223907~~) operation to obtain the names of RPM packages.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The type of the vulnerability. Valid values:
         * <p>
         * 
         * *   cve: Linux software vulnerability
         * *   sys: Windows system vulnerability
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeVulDetailsRequest build() {
            return new DescribeVulDetailsRequest(this);
        } 

    } 

}
