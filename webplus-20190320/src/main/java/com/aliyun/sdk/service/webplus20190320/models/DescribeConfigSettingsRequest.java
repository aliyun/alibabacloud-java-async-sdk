// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigSettingsRequest} extends {@link RequestModel}
 *
 * <p>DescribeConfigSettingsRequest</p>
 */
public class DescribeConfigSettingsRequest extends Request {
    @Query
    @NameInMap("EnvId")
    private String envId;

    @Query
    @NameInMap("OptionName")
    private String optionName;

    @Query
    @NameInMap("PathName")
    private String pathName;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TemplateId")
    private String templateId;

    private DescribeConfigSettingsRequest(Builder builder) {
        super(builder);
        this.envId = builder.envId;
        this.optionName = builder.optionName;
        this.pathName = builder.pathName;
        this.regionId = builder.regionId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConfigSettingsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return envId
     */
    public String getEnvId() {
        return this.envId;
    }

    /**
     * @return optionName
     */
    public String getOptionName() {
        return this.optionName;
    }

    /**
     * @return pathName
     */
    public String getPathName() {
        return this.pathName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<DescribeConfigSettingsRequest, Builder> {
        private String envId; 
        private String optionName; 
        private String pathName; 
        private String regionId; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeConfigSettingsRequest response) {
            super(response);
            this.envId = response.envId;
            this.optionName = response.optionName;
            this.pathName = response.pathName;
            this.regionId = response.regionId;
            this.templateId = response.templateId;
        } 

        /**
         * EnvId.
         */
        public Builder envId(String envId) {
            this.putQueryParameter("EnvId", envId);
            this.envId = envId;
            return this;
        }

        /**
         * OptionName.
         */
        public Builder optionName(String optionName) {
            this.putQueryParameter("OptionName", optionName);
            this.optionName = optionName;
            return this;
        }

        /**
         * PathName.
         */
        public Builder pathName(String pathName) {
            this.putQueryParameter("PathName", pathName);
            this.pathName = pathName;
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
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public DescribeConfigSettingsRequest build() {
            return new DescribeConfigSettingsRequest(this);
        } 

    } 

}
