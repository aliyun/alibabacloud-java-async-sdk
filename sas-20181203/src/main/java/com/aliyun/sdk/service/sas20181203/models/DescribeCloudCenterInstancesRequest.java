// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudCenterInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudCenterInstancesRequest</p>
 */
public class DescribeCloudCenterInstancesRequest extends Request {
    @Query
    @NameInMap("Criteria")
    private String criteria;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("Importance")
    private Integer importance;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("LogicalExp")
    private String logicalExp;

    @Query
    @NameInMap("MachineTypes")
    private String machineTypes;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("NoGroupTrace")
    private Boolean noGroupTrace;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("UseNextToken")
    private Boolean useNextToken;

    private DescribeCloudCenterInstancesRequest(Builder builder) {
        super(builder);
        this.criteria = builder.criteria;
        this.currentPage = builder.currentPage;
        this.importance = builder.importance;
        this.lang = builder.lang;
        this.logicalExp = builder.logicalExp;
        this.machineTypes = builder.machineTypes;
        this.nextToken = builder.nextToken;
        this.noGroupTrace = builder.noGroupTrace;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.useNextToken = builder.useNextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudCenterInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return criteria
     */
    public String getCriteria() {
        return this.criteria;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return importance
     */
    public Integer getImportance() {
        return this.importance;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return logicalExp
     */
    public String getLogicalExp() {
        return this.logicalExp;
    }

    /**
     * @return machineTypes
     */
    public String getMachineTypes() {
        return this.machineTypes;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return noGroupTrace
     */
    public Boolean getNoGroupTrace() {
        return this.noGroupTrace;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return useNextToken
     */
    public Boolean getUseNextToken() {
        return this.useNextToken;
    }

    public static final class Builder extends Request.Builder<DescribeCloudCenterInstancesRequest, Builder> {
        private String criteria; 
        private Integer currentPage; 
        private Integer importance; 
        private String lang; 
        private String logicalExp; 
        private String machineTypes; 
        private String nextToken; 
        private Boolean noGroupTrace; 
        private Integer pageSize; 
        private String regionId; 
        private Boolean useNextToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudCenterInstancesRequest request) {
            super(request);
            this.criteria = request.criteria;
            this.currentPage = request.currentPage;
            this.importance = request.importance;
            this.lang = request.lang;
            this.logicalExp = request.logicalExp;
            this.machineTypes = request.machineTypes;
            this.nextToken = request.nextToken;
            this.noGroupTrace = request.noGroupTrace;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.useNextToken = request.useNextToken;
        } 

        /**
         * The search conditions that are used to filter assets. The value of this parameter is in the JSON format and is case-sensitive.
         * <p>
         * 
         * > A search condition can be an instance ID, instance name, VPC ID, region, or public IP address. You can call the [DescribeCriteria](~~DescribeCriteria~~) operation to query the supported search conditions.
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
            return this;
        }

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The importance level of the asset. Valid values:
         * <p>
         * 
         * *   **2**: an important asset
         * *   **1**: a common asset
         * *   **0**: a test asset
         */
        public Builder importance(Integer importance) {
            this.putQueryParameter("Importance", importance);
            this.importance = importance;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The logical operator that you want to use to evaluate multiple search conditions. Default value: **OR**. Valid values:
         * <p>
         * 
         * *   **OR**: The search conditions are evaluated by using a logical **OR**.
         * *   **AND**: The search conditions are evaluated by using a logical **AND**.
         */
        public Builder logicalExp(String logicalExp) {
            this.putQueryParameter("LogicalExp", logicalExp);
            this.logicalExp = logicalExp;
            return this;
        }

        /**
         * The type of the assets that you want to query. Valid values:
         * <p>
         * 
         * *   **ecs**: servers
         * *   **cloud_product**: Alibaba Cloud services
         */
        public Builder machineTypes(String machineTypes) {
            this.putQueryParameter("MachineTypes", machineTypes);
            this.machineTypes = machineTypes;
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
         * Specifies whether to internationalize the name of the **default** group. Default value: **false**. Valid values:
         * <p>
         * 
         * *   **true**: The system returns the Chinese name of the default group for the **GroupTrace** response parameter.********
         * *   **false**: The system returns default for the **GroupTrace** response parameter.
         */
        public Builder noGroupTrace(Boolean noGroupTrace) {
            this.putQueryParameter("NoGroupTrace", noGroupTrace);
            this.noGroupTrace = noGroupTrace;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **20**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the region in which the asset resides.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * UseNextToken.
         */
        public Builder useNextToken(Boolean useNextToken) {
            this.putQueryParameter("UseNextToken", useNextToken);
            this.useNextToken = useNextToken;
            return this;
        }

        @Override
        public DescribeCloudCenterInstancesRequest build() {
            return new DescribeCloudCenterInstancesRequest(this);
        } 

    } 

}
