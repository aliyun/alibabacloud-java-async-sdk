// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

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
 * {@link DescribeMountPointsVscAttachInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeMountPointsVscAttachInfoRequest</p>
 */
public class DescribeMountPointsVscAttachInfoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryInfos")
    private java.util.List<QueryInfos> queryInfos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseAssumeRoleChkServerPerm")
    private Boolean useAssumeRoleChkServerPerm;

    private DescribeMountPointsVscAttachInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.inputRegionId = builder.inputRegionId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.queryInfos = builder.queryInfos;
        this.useAssumeRoleChkServerPerm = builder.useAssumeRoleChkServerPerm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMountPointsVscAttachInfoRequest create() {
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
     * @return inputRegionId
     */
    public String getInputRegionId() {
        return this.inputRegionId;
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
     * @return queryInfos
     */
    public java.util.List<QueryInfos> getQueryInfos() {
        return this.queryInfos;
    }

    /**
     * @return useAssumeRoleChkServerPerm
     */
    public Boolean getUseAssumeRoleChkServerPerm() {
        return this.useAssumeRoleChkServerPerm;
    }

    public static final class Builder extends Request.Builder<DescribeMountPointsVscAttachInfoRequest, Builder> {
        private String regionId; 
        private String inputRegionId; 
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<QueryInfos> queryInfos; 
        private Boolean useAssumeRoleChkServerPerm; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMountPointsVscAttachInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.inputRegionId = request.inputRegionId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.queryInfos = request.queryInfos;
            this.useAssumeRoleChkServerPerm = request.useAssumeRoleChkServerPerm;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder inputRegionId(String inputRegionId) {
            this.putQueryParameter("InputRegionId", inputRegionId);
            this.inputRegionId = inputRegionId;
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
         * QueryInfos.
         */
        public Builder queryInfos(java.util.List<QueryInfos> queryInfos) {
            String queryInfosShrink = shrink(queryInfos, "QueryInfos", "json");
            this.putQueryParameter("QueryInfos", queryInfosShrink);
            this.queryInfos = queryInfos;
            return this;
        }

        /**
         * UseAssumeRoleChkServerPerm.
         */
        public Builder useAssumeRoleChkServerPerm(Boolean useAssumeRoleChkServerPerm) {
            this.putQueryParameter("UseAssumeRoleChkServerPerm", useAssumeRoleChkServerPerm);
            this.useAssumeRoleChkServerPerm = useAssumeRoleChkServerPerm;
            return this;
        }

        @Override
        public DescribeMountPointsVscAttachInfoRequest build() {
            return new DescribeMountPointsVscAttachInfoRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMountPointsVscAttachInfoRequest} extends {@link TeaModel}
     *
     * <p>DescribeMountPointsVscAttachInfoRequest</p>
     */
    public static class QueryInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MountPointId")
        private String mountPointId;

        @com.aliyun.core.annotation.NameInMap("VscId")
        private String vscId;

        private QueryInfos(Builder builder) {
            this.instanceId = builder.instanceId;
            this.mountPointId = builder.mountPointId;
            this.vscId = builder.vscId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryInfos create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return mountPointId
         */
        public String getMountPointId() {
            return this.mountPointId;
        }

        /**
         * @return vscId
         */
        public String getVscId() {
            return this.vscId;
        }

        public static final class Builder {
            private String instanceId; 
            private String mountPointId; 
            private String vscId; 

            private Builder() {
            } 

            private Builder(QueryInfos model) {
                this.instanceId = model.instanceId;
                this.mountPointId = model.mountPointId;
                this.vscId = model.vscId;
            } 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * MountPointId.
             */
            public Builder mountPointId(String mountPointId) {
                this.mountPointId = mountPointId;
                return this;
            }

            /**
             * VscId.
             */
            public Builder vscId(String vscId) {
                this.vscId = vscId;
                return this;
            }

            public QueryInfos build() {
                return new QueryInfos(this);
            } 

        } 

    }
}
