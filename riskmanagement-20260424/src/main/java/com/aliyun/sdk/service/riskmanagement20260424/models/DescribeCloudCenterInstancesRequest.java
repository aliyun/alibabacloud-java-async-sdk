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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SdkRequest.
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
             * Criteria.
             */
            public Builder criteria(String criteria) {
                this.criteria = criteria;
                return this;
            }

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * Flags.
             */
            public Builder flags(String flags) {
                this.flags = flags;
                return this;
            }

            /**
             * Importance.
             */
            public Builder importance(Integer importance) {
                this.importance = importance;
                return this;
            }

            /**
             * Lang.
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * LogicalExp.
             */
            public Builder logicalExp(String logicalExp) {
                this.logicalExp = logicalExp;
                return this;
            }

            /**
             * MachineTypes.
             */
            public Builder machineTypes(String machineTypes) {
                this.machineTypes = machineTypes;
                return this;
            }

            /**
             * NextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * NoGroupTrace.
             */
            public Builder noGroupTrace(Boolean noGroupTrace) {
                this.noGroupTrace = noGroupTrace;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * ResourceDirectoryAccountId.
             */
            public Builder resourceDirectoryAccountId(String resourceDirectoryAccountId) {
                this.resourceDirectoryAccountId = resourceDirectoryAccountId;
                return this;
            }

            /**
             * UseNextToken.
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
