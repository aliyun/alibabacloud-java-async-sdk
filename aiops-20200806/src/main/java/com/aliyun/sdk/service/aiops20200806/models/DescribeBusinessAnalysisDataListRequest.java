// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBusinessAnalysisDataListRequest} extends {@link RequestModel}
 *
 * <p>DescribeBusinessAnalysisDataListRequest</p>
 */
public class DescribeBusinessAnalysisDataListRequest extends Request {
    @Query
    @NameInMap("ApiPath")
    @Validation(required = true)
    private String apiPath;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("Resource")
    @Validation(required = true)
    private String resource;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    private DescribeBusinessAnalysisDataListRequest(Builder builder) {
        super(builder);
        this.apiPath = builder.apiPath;
        this.endTime = builder.endTime;
        this.resource = builder.resource;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBusinessAnalysisDataListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiPath
     */
    public String getApiPath() {
        return this.apiPath;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return resource
     */
    public String getResource() {
        return this.resource;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeBusinessAnalysisDataListRequest, Builder> {
        private String apiPath; 
        private Long endTime; 
        private String resource; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBusinessAnalysisDataListRequest request) {
            super(request);
            this.apiPath = request.apiPath;
            this.endTime = request.endTime;
            this.resource = request.resource;
            this.startTime = request.startTime;
        } 

        /**
         * ApiPath.
         */
        public Builder apiPath(String apiPath) {
            this.putQueryParameter("ApiPath", apiPath);
            this.apiPath = apiPath;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Resource.
         */
        public Builder resource(String resource) {
            this.putQueryParameter("Resource", resource);
            this.resource = resource;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeBusinessAnalysisDataListRequest build() {
            return new DescribeBusinessAnalysisDataListRequest(this);
        } 

    } 

}
