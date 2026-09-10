// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link DescribeCloudCenterInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudCenterInstancesRequest</p>
 */
public class DescribeCloudCenterInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SdkRequest")
    private SdkRequest sdkRequest;

    private DescribeCloudCenterInstancesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.sdkRequest = builder.sdkRequest;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sdkRequest
     */
    public SdkRequest getSdkRequest() {
        return this.sdkRequest;
    }

    public static final class Builder extends Request.Builder<DescribeCloudCenterInstancesRequest, Builder> {
        private String regionId; 
        private SdkRequest sdkRequest; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudCenterInstancesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.sdkRequest = request.sdkRequest;
        } 

        /**
         * <p>The ID of the region in which the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The Security Center SDK request.</p>
         */
        public Builder sdkRequest(SdkRequest sdkRequest) {
            String sdkRequestShrink = shrink(sdkRequest, "SdkRequest", "json");
            this.putQueryParameter("SdkRequest", sdkRequestShrink);
            this.sdkRequest = sdkRequest;
            return this;
        }

        @Override
        public DescribeCloudCenterInstancesRequest build() {
            return new DescribeCloudCenterInstancesRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCloudCenterInstancesRequest} extends {@link TeaModel}
     *
     * <p>DescribeCloudCenterInstancesRequest</p>
     */
    public static class SdkRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Criteria")
        private String criteria;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("Flags")
        private String flags;

        @com.aliyun.core.annotation.NameInMap("Importance")
        private Integer importance;

        @com.aliyun.core.annotation.NameInMap("Lang")
        private String lang;

        @com.aliyun.core.annotation.NameInMap("LogicalExp")
        private String logicalExp;

        @com.aliyun.core.annotation.NameInMap("MachineTypes")
        private String machineTypes;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("NoGroupTrace")
        private Boolean noGroupTrace;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private String pageSize;

        @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
        private String resourceDirectoryAccountId;

        @com.aliyun.core.annotation.NameInMap("UseNextToken")
        private Boolean useNextToken;

        private SdkRequest(Builder builder) {
            this.criteria = builder.criteria;
            this.currentPage = builder.currentPage;
            this.flags = builder.flags;
            this.importance = builder.importance;
            this.lang = builder.lang;
            this.logicalExp = builder.logicalExp;
            this.machineTypes = builder.machineTypes;
            this.nextToken = builder.nextToken;
            this.noGroupTrace = builder.noGroupTrace;
            this.pageSize = builder.pageSize;
            this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
            this.useNextToken = builder.useNextToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SdkRequest create() {
            return builder().build();
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
         * @return flags
         */
        public String getFlags() {
            return this.flags;
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
        public String getPageSize() {
            return this.pageSize;
        }

        /**
         * @return resourceDirectoryAccountId
         */
        public String getResourceDirectoryAccountId() {
            return this.resourceDirectoryAccountId;
        }

        /**
         * @return useNextToken
         */
        public Boolean getUseNextToken() {
            return this.useNextToken;
        }

        public static final class Builder {
            private String criteria; 
            private Integer currentPage; 
            private String flags; 
            private Integer importance; 
            private String lang; 
            private String logicalExp; 
            private String machineTypes; 
            private String nextToken; 
            private Boolean noGroupTrace; 
            private String pageSize; 
            private String resourceDirectoryAccountId; 
            private Boolean useNextToken; 

            private Builder() {
            } 

            private Builder(SdkRequest model) {
                this.criteria = model.criteria;
                this.currentPage = model.currentPage;
                this.flags = model.flags;
                this.importance = model.importance;
                this.lang = model.lang;
                this.logicalExp = model.logicalExp;
                this.machineTypes = model.machineTypes;
                this.nextToken = model.nextToken;
                this.noGroupTrace = model.noGroupTrace;
                this.pageSize = model.pageSize;
                this.resourceDirectoryAccountId = model.resourceDirectoryAccountId;
                this.useNextToken = model.useNextToken;
            } 

            /**
             * <p>The search conditions for assets. This parameter is in JSON format. Note that the parameter names are case-sensitive.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;contactIds\&quot;:[\&quot;job-658854766790086656\&quot;,\&quot;job-658854801112113152\&quot;]}</p>
             */
            public Builder criteria(String criteria) {
                this.criteria = criteria;
                return this;
            }

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The asset vendor. Separate multiple asset vendors with commas (,). Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>0,10,13</p>
             */
            public Builder flags(String flags) {
                this.flags = flags;
                return this;
            }

            /**
             * <p>The importance level of the asset. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder importance(Integer importance) {
                this.importance = importance;
                return this;
            }

            /**
             * <p>The language of the response. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>zh</p>
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * <p>The logical relationship between multiple search conditions. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>AND</p>
             */
            public Builder logicalExp(String logicalExp) {
                this.logicalExp = logicalExp;
                return this;
            }

            /**
             * <p>The type of asset to query. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder machineTypes(String machineTypes) {
                this.machineTypes = machineTypes;
                return this;
            }

            /**
             * <p>The pagination token used to retrieve the next page of results. If no more results are available, this field is not returned.</p>
             * 
             * <strong>example:</strong>
             * <p>AAAAAZak7VOTMl2OSt/xmc4J6gbg4Z5eXuWnrvKgOsGARL76TVbKERXHXKNFurqjtfDdRw==</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>Specifies whether to internationalize the default group name <strong>Ungrouped</strong>. Default value: <strong>false</strong>. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder noGroupTrace(Boolean noGroupTrace) {
                this.noGroupTrace = noGroupTrace;
                return this;
            }

            /**
             * <p>The number of assets to display per page in a paged query. Default value: 20, which indicates that 20 asset records are displayed per page.</p>
             * 
             * <strong>example:</strong>
             * <p>99</p>
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The ID of the member accounts in the resource folder.</p>
             * 
             * <strong>example:</strong>
             * <p>1587359978118481</p>
             */
            public Builder resourceDirectoryAccountId(String resourceDirectoryAccountId) {
                this.resourceDirectoryAccountId = resourceDirectoryAccountId;
                return this;
            }

            /**
             * <p>Specifies whether to use the NextToken method to retrieve the vulnerability list data. If this parameter is used, TotalCount is no longer returned. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder useNextToken(Boolean useNextToken) {
                this.useNextToken = useNextToken;
                return this;
            }

            public SdkRequest build() {
                return new SdkRequest(this);
            } 

        } 

    }
}
