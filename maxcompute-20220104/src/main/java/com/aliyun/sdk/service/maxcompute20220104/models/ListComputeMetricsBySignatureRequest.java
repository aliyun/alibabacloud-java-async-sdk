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
 * {@link ListComputeMetricsBySignatureRequest} extends {@link RequestModel}
 *
 * <p>ListComputeMetricsBySignatureRequest</p>
 */
public class ListComputeMetricsBySignatureRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("signature")
    private String signature;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("startDate")
    private Long startDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("types")
    private java.util.List<String> types;

    private ListComputeMetricsBySignatureRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.instanceId = builder.instanceId;
        this.jobOwner = builder.jobOwner;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectNames = builder.projectNames;
        this.signature = builder.signature;
        this.startDate = builder.startDate;
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListComputeMetricsBySignatureRequest create() {
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
     * @return signature
     */
    public String getSignature() {
        return this.signature;
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

    public static final class Builder extends Request.Builder<ListComputeMetricsBySignatureRequest, Builder> {
        private Long endDate; 
        private String instanceId; 
        private String jobOwner; 
        private Long pageNumber; 
        private Long pageSize; 
        private java.util.List<String> projectNames; 
        private String signature; 
        private Long startDate; 
        private java.util.List<String> types; 

        private Builder() {
            super();
        } 

        private Builder(ListComputeMetricsBySignatureRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.instanceId = request.instanceId;
            this.jobOwner = request.jobOwner;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectNames = request.projectNames;
            this.signature = request.signature;
            this.startDate = request.startDate;
            this.types = request.types;
        } 

        /**
         * endDate.
         */
        public Builder endDate(Long endDate) {
            this.putBodyParameter("endDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * jobOwner.
         */
        public Builder jobOwner(String jobOwner) {
            this.putBodyParameter("jobOwner", jobOwner);
            this.jobOwner = jobOwner;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putBodyParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * projectNames.
         */
        public Builder projectNames(java.util.List<String> projectNames) {
            this.putBodyParameter("projectNames", projectNames);
            this.projectNames = projectNames;
            return this;
        }

        /**
         * signature.
         */
        public Builder signature(String signature) {
            this.putBodyParameter("signature", signature);
            this.signature = signature;
            return this;
        }

        /**
         * startDate.
         */
        public Builder startDate(Long startDate) {
            this.putBodyParameter("startDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * types.
         */
        public Builder types(java.util.List<String> types) {
            this.putBodyParameter("types", types);
            this.types = types;
            return this;
        }

        @Override
        public ListComputeMetricsBySignatureRequest build() {
            return new ListComputeMetricsBySignatureRequest(this);
        } 

    } 

}
