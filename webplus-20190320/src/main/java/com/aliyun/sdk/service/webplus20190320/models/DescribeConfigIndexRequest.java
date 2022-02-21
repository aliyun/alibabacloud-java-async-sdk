// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigIndexRequest} extends {@link RequestModel}
 *
 * <p>DescribeConfigIndexRequest</p>
 */
public class DescribeConfigIndexRequest extends Request {
    @Query
    @NameInMap("EnvId")
    private String envId;

    @Query
    @NameInMap("ProfileName")
    private String profileName;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StackId")
    private String stackId;

    @Query
    @NameInMap("TemplateId")
    private String templateId;

    private DescribeConfigIndexRequest(Builder builder) {
        super(builder);
        this.envId = builder.envId;
        this.profileName = builder.profileName;
        this.regionId = builder.regionId;
        this.stackId = builder.stackId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConfigIndexRequest create() {
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
     * @return profileName
     */
    public String getProfileName() {
        return this.profileName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<DescribeConfigIndexRequest, Builder> {
        private String envId; 
        private String profileName; 
        private String regionId; 
        private String stackId; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeConfigIndexRequest response) {
            super(response);
            this.envId = response.envId;
            this.profileName = response.profileName;
            this.regionId = response.regionId;
            this.stackId = response.stackId;
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
         * ProfileName.
         */
        public Builder profileName(String profileName) {
            this.putQueryParameter("ProfileName", profileName);
            this.profileName = profileName;
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
         * StackId.
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
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
        public DescribeConfigIndexRequest build() {
            return new DescribeConfigIndexRequest(this);
        } 

    } 

}
