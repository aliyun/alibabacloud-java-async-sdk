// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTrafficControlsRequest} extends {@link RequestModel}
 *
 * <p>DescribeTrafficControlsRequest</p>
 */
public class DescribeTrafficControlsRequest extends Request {
    @Query
    @NameInMap("ApiId")
    private String apiId;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("StageName")
    private String stageName;

    @Query
    @NameInMap("TrafficControlId")
    private String trafficControlId;

    @Query
    @NameInMap("TrafficControlName")
    private String trafficControlName;

    private DescribeTrafficControlsRequest(Builder builder) {
        super(builder);
        this.apiId = builder.apiId;
        this.groupId = builder.groupId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.securityToken = builder.securityToken;
        this.stageName = builder.stageName;
        this.trafficControlId = builder.trafficControlId;
        this.trafficControlName = builder.trafficControlName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTrafficControlsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiId
     */
    public String getApiId() {
        return this.apiId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return stageName
     */
    public String getStageName() {
        return this.stageName;
    }

    /**
     * @return trafficControlId
     */
    public String getTrafficControlId() {
        return this.trafficControlId;
    }

    /**
     * @return trafficControlName
     */
    public String getTrafficControlName() {
        return this.trafficControlName;
    }

    public static final class Builder extends Request.Builder<DescribeTrafficControlsRequest, Builder> {
        private String apiId; 
        private String groupId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String securityToken; 
        private String stageName; 
        private String trafficControlId; 
        private String trafficControlName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTrafficControlsRequest request) {
            super(request);
            this.apiId = request.apiId;
            this.groupId = request.groupId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.securityToken = request.securityToken;
            this.stageName = request.stageName;
            this.trafficControlId = request.trafficControlId;
            this.trafficControlName = request.trafficControlName;
        } 

        /**
         * The name of the throttling policy.
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * The environment name. This parameter must be specified together with GroupId and ApiId. Valid values:********
         * <p>
         * 
         * *   **RELEASE**
         * *   **TEST**
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * ThrottlingTest
         */
        public Builder stageName(String stageName) {
            this.putQueryParameter("StageName", stageName);
            this.stageName = stageName;
            return this;
        }

        /**
         * The specified API ID. This parameter must be specified together with GroupId and StageName.
         */
        public Builder trafficControlId(String trafficControlId) {
            this.putQueryParameter("TrafficControlId", trafficControlId);
            this.trafficControlId = trafficControlId;
            return this;
        }

        /**
         * The number of the page to return. Pages start from page 1. Default value: 1.
         */
        public Builder trafficControlName(String trafficControlName) {
            this.putQueryParameter("TrafficControlName", trafficControlName);
            this.trafficControlName = trafficControlName;
            return this;
        }

        @Override
        public DescribeTrafficControlsRequest build() {
            return new DescribeTrafficControlsRequest(this);
        } 

    } 

}
