// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link ListComputeMetricsByInstanceRequest} extends {@link RequestModel}
 *
 * <p>ListComputeMetricsByInstanceRequest</p>
 */
public class ListComputeMetricsByInstanceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endDate")
    private Long endDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("jobOwner")
    private String jobOwner;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("projectNames")
    private java.util.List<String> projectNames;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("signature")
    private String signature;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("specCodes")
    private java.util.List<String> specCodes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("startDate")
    private Long startDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("types")
    private java.util.List<String> types;

    private ListComputeMetricsByInstanceRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.instanceId = builder.instanceId;
        this.jobOwner = builder.jobOwner;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectNames = builder.projectNames;
        this.region = builder.region;
        this.signature = builder.signature;
        this.specCodes = builder.specCodes;
        this.startDate = builder.startDate;
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListComputeMetricsByInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endDate
     */
    public Long getEndDate() {
        return this.endDate;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobOwner
     */
    public String getJobOwner() {
        return this.jobOwner;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return projectNames
     */
    public java.util.List<String> getProjectNames() {
        return this.projectNames;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return signature
     */
    public String getSignature() {
        return this.signature;
    }

    /**
     * @return specCodes
     */
    public java.util.List<String> getSpecCodes() {
        return this.specCodes;
    }

    /**
     * @return startDate
     */
    public Long getStartDate() {
        return this.startDate;
    }

    /**
     * @return types
     */
    public java.util.List<String> getTypes() {
        return this.types;
    }

    public static final class Builder extends Request.Builder<ListComputeMetricsByInstanceRequest, Builder> {
        private Long endDate; 
        private String instanceId; 
        private String jobOwner; 
        private Long pageNumber; 
        private Long pageSize; 
        private java.util.List<String> projectNames; 
        private String region; 
        private String signature; 
        private java.util.List<String> specCodes; 
        private Long startDate; 
        private java.util.List<String> types; 

        private Builder() {
            super();
        } 

        private Builder(ListComputeMetricsByInstanceRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.instanceId = request.instanceId;
            this.jobOwner = request.jobOwner;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectNames = request.projectNames;
            this.region = request.region;
            this.signature = request.signature;
            this.specCodes = request.specCodes;
            this.startDate = request.startDate;
            this.types = request.types;
        } 

        /**
         * <p>The end time for the period.</p>
         * 
         * <strong>example:</strong>
         * <p>1718590596556</p>
         */
        public Builder endDate(Long endDate) {
            this.putBodyParameter("endDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The job(instance) ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20240730****ddlr</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account that is used to run the MaxCompute job.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN$7632***@aliyun.com</p>
         */
        public Builder jobOwner(String jobOwner) {
            this.putBodyParameter("jobOwner", jobOwner);
            this.jobOwner = jobOwner;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putBodyParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The name of MaxCompute project.</p>
         */
        public Builder projectNames(java.util.List<String> projectNames) {
            this.putBodyParameter("projectNames", projectNames);
            this.projectNames = projectNames;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putBodyParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The signature of the SQL job.</p>
         * 
         * <strong>example:</strong>
         * <p>ghijkl789012</p>
         */
        public Builder signature(String signature) {
            this.putBodyParameter("signature", signature);
            this.signature = signature;
            return this;
        }

        /**
         * <p>Specification types.</p>
         */
        public Builder specCodes(java.util.List<String> specCodes) {
            this.putBodyParameter("specCodes", specCodes);
            this.specCodes = specCodes;
            return this;
        }

        /**
         * <p>The start time for the period.</p>
         * 
         * <strong>example:</strong>
         * <p>1715393576201</p>
         */
        public Builder startDate(Long startDate) {
            this.putBodyParameter("startDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>Metering types.</p>
         */
        public Builder types(java.util.List<String> types) {
            this.putBodyParameter("types", types);
            this.types = types;
            return this;
        }

        @Override
        public ListComputeMetricsByInstanceRequest build() {
            return new ListComputeMetricsByInstanceRequest(this);
        } 

    } 

}
