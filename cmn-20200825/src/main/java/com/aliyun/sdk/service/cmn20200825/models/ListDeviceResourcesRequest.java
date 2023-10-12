// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeviceResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListDeviceResourcesRequest</p>
 */
public class ListDeviceResourcesRequest extends Request {
    @Query
    @NameInMap("BusinessType")
    private String businessType;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("ListType")
    private String listType;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("SetupProjectId")
    private String setupProjectId;

    private ListDeviceResourcesRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
        this.instanceId = builder.instanceId;
        this.listType = builder.listType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.setupProjectId = builder.setupProjectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return listType
     */
    public String getListType() {
        return this.listType;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return setupProjectId
     */
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

    public static final class Builder extends Request.Builder<ListDeviceResourcesRequest, Builder> {
        private String businessType; 
        private String instanceId; 
        private String listType; 
        private Integer maxResults; 
        private String nextToken; 
        private String setupProjectId; 

        private Builder() {
            super();
        } 

        private Builder(ListDeviceResourcesRequest request) {
            super(request);
            this.businessType = request.businessType;
            this.instanceId = request.instanceId;
            this.listType = request.listType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.setupProjectId = request.setupProjectId;
        } 

        /**
         * BusinessType.
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ListType.
         */
        public Builder listType(String listType) {
            this.putQueryParameter("ListType", listType);
            this.listType = listType;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * SetupProjectId.
         */
        public Builder setupProjectId(String setupProjectId) {
            this.putQueryParameter("SetupProjectId", setupProjectId);
            this.setupProjectId = setupProjectId;
            return this;
        }

        @Override
        public ListDeviceResourcesRequest build() {
            return new ListDeviceResourcesRequest(this);
        } 

    } 

}
