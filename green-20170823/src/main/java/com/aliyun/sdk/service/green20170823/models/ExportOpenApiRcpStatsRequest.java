// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportOpenApiRcpStatsRequest} extends {@link RequestModel}
 *
 * <p>ExportOpenApiRcpStatsRequest</p>
 */
public class ExportOpenApiRcpStatsRequest extends Request {
    @Query
    @NameInMap("BizType")
    private String bizType;

    @Query
    @NameInMap("EndDate")
    @Validation(required = true)
    private String endDate;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("StartDate")
    @Validation(required = true)
    private String startDate;

    private ExportOpenApiRcpStatsRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.endDate = builder.endDate;
        this.resourceType = builder.resourceType;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportOpenApiRcpStatsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
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
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<ExportOpenApiRcpStatsRequest, Builder> {
        private String bizType; 
        private String endDate; 
        private String resourceType; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(ExportOpenApiRcpStatsRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.endDate = request.endDate;
            this.resourceType = request.resourceType;
            this.startDate = request.startDate;
        } 

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
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
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public ExportOpenApiRcpStatsRequest build() {
            return new ExportOpenApiRcpStatsRequest(this);
        } 

    } 

}
