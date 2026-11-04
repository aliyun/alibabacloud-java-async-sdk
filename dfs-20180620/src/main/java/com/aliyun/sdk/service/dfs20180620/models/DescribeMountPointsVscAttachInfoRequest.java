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
         * <p>The region where the file system resides.</p>
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
         * <p>The maximum number of entries to return per page during paging in a paged query. Maximum value: 100. Default value: 10. If you do not specify a value in the Settings or the value in the Settings is less than 10, the default value 10 is used. If the value in the Settings is greater than 100, the default value 100 is used.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. If a query does not return all results, a non-empty NextToken is returned. You can use the returned NextToken in a subsequent query to retrieve the remaining results.</p>
         * 
         * <strong>example:</strong>
         * <p>MYR6sz6qkmauspAy8oxjHP-tOLtD4KSv3DzI7G6iywTx1ZCExO50GtSuiTB9z0JppvYQ2iUa8s4HbcFanMQfDIlds4da87_Ax4UJMva****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The list of query information.</p>
         */
        public Builder queryInfos(java.util.List<QueryInfos> queryInfos) {
            String queryInfosShrink = shrink(queryInfos, "QueryInfos", "json");
            this.putQueryParameter("QueryInfos", queryInfosShrink);
            this.queryInfos = queryInfos;
            return this;
        }

        /**
         * <p>Specifies whether to use the assumed role to check the permissions of the compute node. Valid values:</p>
         * <ul>
         * <li>true: Yes.</li>
         * <li>false (default): No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
             * <p>The instance ID of the ECS instance on which the HDFS file system is mounted.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2zehyz70ednszl6rrfj6</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the mount point.</p>
             * 
             * <strong>example:</strong>
             * <p>f-9dd3c6bajmy110.cn-zhangjiakou.dfs.aliyuncs.com</p>
             */
            public Builder mountPointId(String mountPointId) {
                this.mountPointId = mountPointId;
                return this;
            }

            /**
             * <p>The ID of the VSC on which the HDFS file system is mounted. You must specify either InstanceId or VscId, but not both.</p>
             * 
             * <strong>example:</strong>
             * <p>vsc-bp19yqmujug2r18z0h9qal</p>
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
