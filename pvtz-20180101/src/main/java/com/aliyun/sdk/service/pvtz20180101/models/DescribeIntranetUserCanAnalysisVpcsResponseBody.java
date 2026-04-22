// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

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
 * {@link DescribeIntranetUserCanAnalysisVpcsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIntranetUserCanAnalysisVpcsResponseBody</p>
 */
public class DescribeIntranetUserCanAnalysisVpcsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurPage")
    private Integer curPage;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    @com.aliyun.core.annotation.NameInMap("TotalSize")
    private Integer totalSize;

    @com.aliyun.core.annotation.NameInMap("UserCanAnalysisVpcsPopResults")
    private UserCanAnalysisVpcsPopResults userCanAnalysisVpcsPopResults;

    private DescribeIntranetUserCanAnalysisVpcsResponseBody(Builder builder) {
        this.curPage = builder.curPage;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalPage = builder.totalPage;
        this.totalSize = builder.totalSize;
        this.userCanAnalysisVpcsPopResults = builder.userCanAnalysisVpcsPopResults;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIntranetUserCanAnalysisVpcsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return curPage
     */
    public Integer getCurPage() {
        return this.curPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    /**
     * @return totalSize
     */
    public Integer getTotalSize() {
        return this.totalSize;
    }

    /**
     * @return userCanAnalysisVpcsPopResults
     */
    public UserCanAnalysisVpcsPopResults getUserCanAnalysisVpcsPopResults() {
        return this.userCanAnalysisVpcsPopResults;
    }

    public static final class Builder {
        private Integer curPage; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalPage; 
        private Integer totalSize; 
        private UserCanAnalysisVpcsPopResults userCanAnalysisVpcsPopResults; 

        private Builder() {
        } 

        private Builder(DescribeIntranetUserCanAnalysisVpcsResponseBody model) {
            this.curPage = model.curPage;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalPage = model.totalPage;
            this.totalSize = model.totalSize;
            this.userCanAnalysisVpcsPopResults = model.userCanAnalysisVpcsPopResults;
        } 

        /**
         * CurPage.
         */
        public Builder curPage(Integer curPage) {
            this.curPage = curPage;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        /**
         * TotalSize.
         */
        public Builder totalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }

        /**
         * UserCanAnalysisVpcsPopResults.
         */
        public Builder userCanAnalysisVpcsPopResults(UserCanAnalysisVpcsPopResults userCanAnalysisVpcsPopResults) {
            this.userCanAnalysisVpcsPopResults = userCanAnalysisVpcsPopResults;
            return this;
        }

        public DescribeIntranetUserCanAnalysisVpcsResponseBody build() {
            return new DescribeIntranetUserCanAnalysisVpcsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeIntranetUserCanAnalysisVpcsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIntranetUserCanAnalysisVpcsResponseBody</p>
     */
    public static class UserCanAnalysisVpcsPopResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthType")
        private String authType;

        @com.aliyun.core.annotation.NameInMap("AuthorizedUserId")
        private Long authorizedUserId;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("TreeLevel")
        private Integer treeLevel;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcType")
        private String vpcType;

        private UserCanAnalysisVpcsPopResult(Builder builder) {
            this.authType = builder.authType;
            this.authorizedUserId = builder.authorizedUserId;
            this.networkType = builder.networkType;
            this.regionId = builder.regionId;
            this.treeLevel = builder.treeLevel;
            this.vpcId = builder.vpcId;
            this.vpcType = builder.vpcType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserCanAnalysisVpcsPopResult create() {
            return builder().build();
        }

        /**
         * @return authType
         */
        public String getAuthType() {
            return this.authType;
        }

        /**
         * @return authorizedUserId
         */
        public Long getAuthorizedUserId() {
            return this.authorizedUserId;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return treeLevel
         */
        public Integer getTreeLevel() {
            return this.treeLevel;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcType
         */
        public String getVpcType() {
            return this.vpcType;
        }

        public static final class Builder {
            private String authType; 
            private Long authorizedUserId; 
            private String networkType; 
            private String regionId; 
            private Integer treeLevel; 
            private String vpcId; 
            private String vpcType; 

            private Builder() {
            } 

            private Builder(UserCanAnalysisVpcsPopResult model) {
                this.authType = model.authType;
                this.authorizedUserId = model.authorizedUserId;
                this.networkType = model.networkType;
                this.regionId = model.regionId;
                this.treeLevel = model.treeLevel;
                this.vpcId = model.vpcId;
                this.vpcType = model.vpcType;
            } 

            /**
             * AuthType.
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * AuthorizedUserId.
             */
            public Builder authorizedUserId(Long authorizedUserId) {
                this.authorizedUserId = authorizedUserId;
                return this;
            }

            /**
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * TreeLevel.
             */
            public Builder treeLevel(Integer treeLevel) {
                this.treeLevel = treeLevel;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VpcType.
             */
            public Builder vpcType(String vpcType) {
                this.vpcType = vpcType;
                return this;
            }

            public UserCanAnalysisVpcsPopResult build() {
                return new UserCanAnalysisVpcsPopResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeIntranetUserCanAnalysisVpcsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIntranetUserCanAnalysisVpcsResponseBody</p>
     */
    public static class UserCanAnalysisVpcsPopResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserCanAnalysisVpcsPopResult")
        private java.util.List<UserCanAnalysisVpcsPopResult> userCanAnalysisVpcsPopResult;

        private UserCanAnalysisVpcsPopResults(Builder builder) {
            this.userCanAnalysisVpcsPopResult = builder.userCanAnalysisVpcsPopResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserCanAnalysisVpcsPopResults create() {
            return builder().build();
        }

        /**
         * @return userCanAnalysisVpcsPopResult
         */
        public java.util.List<UserCanAnalysisVpcsPopResult> getUserCanAnalysisVpcsPopResult() {
            return this.userCanAnalysisVpcsPopResult;
        }

        public static final class Builder {
            private java.util.List<UserCanAnalysisVpcsPopResult> userCanAnalysisVpcsPopResult; 

            private Builder() {
            } 

            private Builder(UserCanAnalysisVpcsPopResults model) {
                this.userCanAnalysisVpcsPopResult = model.userCanAnalysisVpcsPopResult;
            } 

            /**
             * UserCanAnalysisVpcsPopResult.
             */
            public Builder userCanAnalysisVpcsPopResult(java.util.List<UserCanAnalysisVpcsPopResult> userCanAnalysisVpcsPopResult) {
                this.userCanAnalysisVpcsPopResult = userCanAnalysisVpcsPopResult;
                return this;
            }

            public UserCanAnalysisVpcsPopResults build() {
                return new UserCanAnalysisVpcsPopResults(this);
            } 

        } 

    }
}
