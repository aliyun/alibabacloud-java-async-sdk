// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOpenApiUsageRequest} extends {@link RequestModel}
 *
 * <p>DescribeOpenApiUsageRequest</p>
 */
public class DescribeOpenApiUsageRequest extends Request {
    @Query
    @NameInMap("EndDate")
    @Validation(required = true)
    private String endDate;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("StartDate")
    @Validation(required = true)
    private String startDate;

    private DescribeOpenApiUsageRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.resourceType = builder.resourceType;
        this.sourceIp = builder.sourceIp;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOpenApiUsageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<DescribeOpenApiUsageRequest, Builder> {
        private String endDate; 
        private String resourceType; 
        private String sourceIp; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOpenApiUsageRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.resourceType = request.resourceType;
            this.sourceIp = request.sourceIp;
            this.startDate = request.startDate;
        } 

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
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

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public DescribeOpenApiUsageRequest build() {
            return new DescribeOpenApiUsageRequest(this);
        } 

    } 

}
