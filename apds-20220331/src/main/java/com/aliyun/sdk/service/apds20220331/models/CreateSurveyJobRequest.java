// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apds20220331.models;

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
 * {@link CreateSurveyJobRequest} extends {@link RequestModel}
 *
 * <p>CreateSurveyJobRequest</p>
 */
public class CreateSurveyJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ak")
    private String ak;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoConfirm")
    private Boolean autoConfirm;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("channel")
    private String channel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cloudType")
    private String cloudType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ossObjectName")
    private String ossObjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("projectId")
    private String projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("region")
    private java.util.List<String> region;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceTypeList")
    private java.util.List<String> resourceTypeList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sk")
    private String sk;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("zone")
    private java.util.List<String> zone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private CreateSurveyJobRequest(Builder builder) {
        super(builder);
        this.ak = builder.ak;
        this.autoConfirm = builder.autoConfirm;
        this.channel = builder.channel;
        this.cloudType = builder.cloudType;
        this.name = builder.name;
        this.ossObjectName = builder.ossObjectName;
        this.projectId = builder.projectId;
        this.region = builder.region;
        this.resourceTypeList = builder.resourceTypeList;
        this.sk = builder.sk;
        this.tenantId = builder.tenantId;
        this.zone = builder.zone;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSurveyJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ak
     */
    public String getAk() {
        return this.ak;
    }

    /**
     * @return autoConfirm
     */
    public Boolean getAutoConfirm() {
        return this.autoConfirm;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return cloudType
     */
    public String getCloudType() {
        return this.cloudType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ossObjectName
     */
    public String getOssObjectName() {
        return this.ossObjectName;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return region
     */
    public java.util.List<String> getRegion() {
        return this.region;
    }

    /**
     * @return resourceTypeList
     */
    public java.util.List<String> getResourceTypeList() {
        return this.resourceTypeList;
    }

    /**
     * @return sk
     */
    public String getSk() {
        return this.sk;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return zone
     */
    public java.util.List<String> getZone() {
        return this.zone;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateSurveyJobRequest, Builder> {
        private String ak; 
        private Boolean autoConfirm; 
        private String channel; 
        private String cloudType; 
        private String name; 
        private String ossObjectName; 
        private String projectId; 
        private java.util.List<String> region; 
        private java.util.List<String> resourceTypeList; 
        private String sk; 
        private String tenantId; 
        private java.util.List<String> zone; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSurveyJobRequest request) {
            super(request);
            this.ak = request.ak;
            this.autoConfirm = request.autoConfirm;
            this.channel = request.channel;
            this.cloudType = request.cloudType;
            this.name = request.name;
            this.ossObjectName = request.ossObjectName;
            this.projectId = request.projectId;
            this.region = request.region;
            this.resourceTypeList = request.resourceTypeList;
            this.sk = request.sk;
            this.tenantId = request.tenantId;
            this.zone = request.zone;
            this.regionId = request.regionId;
        } 

        /**
         * ak.
         */
        public Builder ak(String ak) {
            this.putBodyParameter("ak", ak);
            this.ak = ak;
            return this;
        }

        /**
         * autoConfirm.
         */
        public Builder autoConfirm(Boolean autoConfirm) {
            this.putBodyParameter("autoConfirm", autoConfirm);
            this.autoConfirm = autoConfirm;
            return this;
        }

        /**
         * channel.
         */
        public Builder channel(String channel) {
            this.putBodyParameter("channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * cloudType.
         */
        public Builder cloudType(String cloudType) {
            this.putBodyParameter("cloudType", cloudType);
            this.cloudType = cloudType;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * ossObjectName.
         */
        public Builder ossObjectName(String ossObjectName) {
            this.putBodyParameter("ossObjectName", ossObjectName);
            this.ossObjectName = ossObjectName;
            return this;
        }

        /**
         * projectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * region.
         */
        public Builder region(java.util.List<String> region) {
            this.putBodyParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * resourceTypeList.
         */
        public Builder resourceTypeList(java.util.List<String> resourceTypeList) {
            this.putBodyParameter("resourceTypeList", resourceTypeList);
            this.resourceTypeList = resourceTypeList;
            return this;
        }

        /**
         * sk.
         */
        public Builder sk(String sk) {
            this.putBodyParameter("sk", sk);
            this.sk = sk;
            return this;
        }

        /**
         * tenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * zone.
         */
        public Builder zone(java.util.List<String> zone) {
            this.putBodyParameter("zone", zone);
            this.zone = zone;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateSurveyJobRequest build() {
            return new CreateSurveyJobRequest(this);
        } 

    } 

}
