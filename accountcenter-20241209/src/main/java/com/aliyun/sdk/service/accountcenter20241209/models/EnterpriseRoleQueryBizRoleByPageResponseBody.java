// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.accountcenter20241209.models;

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
 * {@link EnterpriseRoleQueryBizRoleByPageResponseBody} extends {@link TeaModel}
 *
 * <p>EnterpriseRoleQueryBizRoleByPageResponseBody</p>
 */
public class EnterpriseRoleQueryBizRoleByPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BizRoles")
    private java.util.List<BizRoles> bizRoles;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private EnterpriseRoleQueryBizRoleByPageResponseBody(Builder builder) {
        this.bizRoles = builder.bizRoles;
        this.code = builder.code;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnterpriseRoleQueryBizRoleByPageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizRoles
     */
    public java.util.List<BizRoles> getBizRoles() {
        return this.bizRoles;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private java.util.List<BizRoles> bizRoles; 
        private String code; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(EnterpriseRoleQueryBizRoleByPageResponseBody model) {
            this.bizRoles = model.bizRoles;
            this.code = model.code;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
            this.totalPage = model.totalPage;
        } 

        /**
         * BizRoles.
         */
        public Builder bizRoles(java.util.List<BizRoles> bizRoles) {
            this.bizRoles = bizRoles;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TotalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public EnterpriseRoleQueryBizRoleByPageResponseBody build() {
            return new EnterpriseRoleQueryBizRoleByPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link EnterpriseRoleQueryBizRoleByPageResponseBody} extends {@link TeaModel}
     *
     * <p>EnterpriseRoleQueryBizRoleByPageResponseBody</p>
     */
    public static class BizRoles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizPermissionCount")
        private Integer bizPermissionCount;

        @com.aliyun.core.annotation.NameInMap("BizPermissionNameList")
        private java.util.List<String> bizPermissionNameList;

        @com.aliyun.core.annotation.NameInMap("BizRoleCode")
        private String bizRoleCode;

        @com.aliyun.core.annotation.NameInMap("BizRoleDesc")
        private String bizRoleDesc;

        @com.aliyun.core.annotation.NameInMap("BizRoleName")
        private String bizRoleName;

        @com.aliyun.core.annotation.NameInMap("GrantedPkCount")
        private Integer grantedPkCount;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("SrcType")
        private String srcType;

        private BizRoles(Builder builder) {
            this.bizPermissionCount = builder.bizPermissionCount;
            this.bizPermissionNameList = builder.bizPermissionNameList;
            this.bizRoleCode = builder.bizRoleCode;
            this.bizRoleDesc = builder.bizRoleDesc;
            this.bizRoleName = builder.bizRoleName;
            this.grantedPkCount = builder.grantedPkCount;
            this.resourceType = builder.resourceType;
            this.srcType = builder.srcType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizRoles create() {
            return builder().build();
        }

        /**
         * @return bizPermissionCount
         */
        public Integer getBizPermissionCount() {
            return this.bizPermissionCount;
        }

        /**
         * @return bizPermissionNameList
         */
        public java.util.List<String> getBizPermissionNameList() {
            return this.bizPermissionNameList;
        }

        /**
         * @return bizRoleCode
         */
        public String getBizRoleCode() {
            return this.bizRoleCode;
        }

        /**
         * @return bizRoleDesc
         */
        public String getBizRoleDesc() {
            return this.bizRoleDesc;
        }

        /**
         * @return bizRoleName
         */
        public String getBizRoleName() {
            return this.bizRoleName;
        }

        /**
         * @return grantedPkCount
         */
        public Integer getGrantedPkCount() {
            return this.grantedPkCount;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return srcType
         */
        public String getSrcType() {
            return this.srcType;
        }

        public static final class Builder {
            private Integer bizPermissionCount; 
            private java.util.List<String> bizPermissionNameList; 
            private String bizRoleCode; 
            private String bizRoleDesc; 
            private String bizRoleName; 
            private Integer grantedPkCount; 
            private String resourceType; 
            private String srcType; 

            private Builder() {
            } 

            private Builder(BizRoles model) {
                this.bizPermissionCount = model.bizPermissionCount;
                this.bizPermissionNameList = model.bizPermissionNameList;
                this.bizRoleCode = model.bizRoleCode;
                this.bizRoleDesc = model.bizRoleDesc;
                this.bizRoleName = model.bizRoleName;
                this.grantedPkCount = model.grantedPkCount;
                this.resourceType = model.resourceType;
                this.srcType = model.srcType;
            } 

            /**
             * BizPermissionCount.
             */
            public Builder bizPermissionCount(Integer bizPermissionCount) {
                this.bizPermissionCount = bizPermissionCount;
                return this;
            }

            /**
             * BizPermissionNameList.
             */
            public Builder bizPermissionNameList(java.util.List<String> bizPermissionNameList) {
                this.bizPermissionNameList = bizPermissionNameList;
                return this;
            }

            /**
             * BizRoleCode.
             */
            public Builder bizRoleCode(String bizRoleCode) {
                this.bizRoleCode = bizRoleCode;
                return this;
            }

            /**
             * BizRoleDesc.
             */
            public Builder bizRoleDesc(String bizRoleDesc) {
                this.bizRoleDesc = bizRoleDesc;
                return this;
            }

            /**
             * BizRoleName.
             */
            public Builder bizRoleName(String bizRoleName) {
                this.bizRoleName = bizRoleName;
                return this;
            }

            /**
             * GrantedPkCount.
             */
            public Builder grantedPkCount(Integer grantedPkCount) {
                this.grantedPkCount = grantedPkCount;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * SrcType.
             */
            public Builder srcType(String srcType) {
                this.srcType = srcType;
                return this;
            }

            public BizRoles build() {
                return new BizRoles(this);
            } 

        } 

    }
}
