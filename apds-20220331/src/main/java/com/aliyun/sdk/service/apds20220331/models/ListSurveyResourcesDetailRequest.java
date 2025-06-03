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
 * {@link ListSurveyResourcesDetailRequest} extends {@link RequestModel}
 *
 * <p>ListSurveyResourcesDetailRequest</p>
 */
public class ListSurveyResourcesDetailRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ip")
    private String ip;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("jobId")
    private Long jobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("projectId")
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("subProjectId")
    private Long subProjectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private ListSurveyResourcesDetailRequest(Builder builder) {
        super(builder);
        this.ip = builder.ip;
        this.jobId = builder.jobId;
        this.projectId = builder.projectId;
        this.resourceType = builder.resourceType;
        this.subProjectId = builder.subProjectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSurveyResourcesDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return jobId
     */
    public Long getJobId() {
        return this.jobId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return subProjectId
     */
    public Long getSubProjectId() {
        return this.subProjectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListSurveyResourcesDetailRequest, Builder> {
        private String ip; 
        private Long jobId; 
        private Long projectId; 
        private String resourceType; 
        private Long subProjectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListSurveyResourcesDetailRequest request) {
            super(request);
            this.ip = request.ip;
            this.jobId = request.jobId;
            this.projectId = request.projectId;
            this.resourceType = request.resourceType;
            this.subProjectId = request.subProjectId;
            this.regionId = request.regionId;
        } 

        /**
         * ip.
         */
        public Builder ip(String ip) {
            this.putBodyParameter("ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * jobId.
         */
        public Builder jobId(Long jobId) {
            this.putBodyParameter("jobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * projectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * resourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("resourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * subProjectId.
         */
        public Builder subProjectId(Long subProjectId) {
            this.putBodyParameter("subProjectId", subProjectId);
            this.subProjectId = subProjectId;
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
        public ListSurveyResourcesDetailRequest build() {
            return new ListSurveyResourcesDetailRequest(this);
        } 

    } 

}
