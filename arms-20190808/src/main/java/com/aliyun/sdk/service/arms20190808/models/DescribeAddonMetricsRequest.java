// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAddonMetricsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAddonMetricsRequest</p>
 */
public class DescribeAddonMetricsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddonVersion")
    private String addonVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunLang")
    private String aliyunLang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvironmentType")
    private String environmentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DescribeAddonMetricsRequest(Builder builder) {
        super(builder);
        this.addonVersion = builder.addonVersion;
        this.aliyunLang = builder.aliyunLang;
        this.environmentType = builder.environmentType;
        this.name = builder.name;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAddonMetricsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addonVersion
     */
    public String getAddonVersion() {
        return this.addonVersion;
    }

    /**
     * @return aliyunLang
     */
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    /**
     * @return environmentType
     */
    public String getEnvironmentType() {
        return this.environmentType;
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

    public static final class Builder extends Request.Builder<DescribeAddonMetricsRequest, Builder> {
        private String addonVersion; 
        private String aliyunLang; 
        private String environmentType; 
        private String name; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAddonMetricsRequest request) {
            super(request);
            this.addonVersion = request.addonVersion;
            this.aliyunLang = request.aliyunLang;
            this.environmentType = request.environmentType;
            this.name = request.name;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The version of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.1</p>
         */
        public Builder addonVersion(String addonVersion) {
            this.putQueryParameter("AddonVersion", addonVersion);
            this.addonVersion = addonVersion;
            return this;
        }

        /**
         * <p>The language. Valid values: zh and en. Default value: zh.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder aliyunLang(String aliyunLang) {
            this.putQueryParameter("AliyunLang", aliyunLang);
            this.aliyunLang = aliyunLang;
            return this;
        }

        /**
         * <p>The environment.</p>
         * 
         * <strong>example:</strong>
         * <p>CS</p>
         */
        public Builder environmentType(String environmentType) {
            this.putQueryParameter("EnvironmentType", environmentType);
            this.environmentType = environmentType;
            return this;
        }

        /**
         * <p>The name of the component.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeAddonMetricsRequest build() {
            return new DescribeAddonMetricsRequest(this);
        } 

    } 

}
