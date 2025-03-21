// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeVulWhitelistResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVulWhitelistResponseBody</p>
 */
public class DescribeVulWhitelistResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VulWhitelists")
    private java.util.List<VulWhitelists> vulWhitelists;

    private DescribeVulWhitelistResponseBody(Builder builder) {
        this.count = builder.count;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vulWhitelists = builder.vulWhitelists;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulWhitelistResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return vulWhitelists
     */
    public java.util.List<VulWhitelists> getVulWhitelists() {
        return this.vulWhitelists;
    }

    public static final class Builder {
        private Integer count; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<VulWhitelists> vulWhitelists; 

        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>74F97EF7-B543-43FD-A4E9-18456731F9C5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>An array that consists of information about the whitelist of vulnerabilities.</p>
         */
        public Builder vulWhitelists(java.util.List<VulWhitelists> vulWhitelists) {
            this.vulWhitelists = vulWhitelists;
            return this;
        }

        public DescribeVulWhitelistResponseBody build() {
            return new DescribeVulWhitelistResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVulWhitelistResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVulWhitelistResponseBody</p>
     */
    public static class VulWhitelists extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliasName")
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("TargetInfo")
        private String targetInfo;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Whitelist")
        private String whitelist;

        private VulWhitelists(Builder builder) {
            this.aliasName = builder.aliasName;
            this.id = builder.id;
            this.name = builder.name;
            this.reason = builder.reason;
            this.targetInfo = builder.targetInfo;
            this.type = builder.type;
            this.whitelist = builder.whitelist;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VulWhitelists create() {
            return builder().build();
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return targetInfo
         */
        public String getTargetInfo() {
            return this.targetInfo;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return whitelist
         */
        public String getWhitelist() {
            return this.whitelist;
        }

        public static final class Builder {
            private String aliasName; 
            private String id; 
            private String name; 
            private String reason; 
            private String targetInfo; 
            private String type; 
            private String whitelist; 

            /**
             * <p>The alias of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>RHSA-2017:3263: curl security update</p>
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * <p>The ID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1275</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>oval:com.redhat.rhsa:def:20173263</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The reason why the vulnerability is added to the whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>ignore</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The application scope of the rule. The value is a JSON string that contains the following fields:</p>
             * <ul>
             * <li><p><strong>type</strong>: the type of the assets to which the rule is applied. Valid values:</p>
             * <ul>
             * <li><strong>Uuid</strong>: server</li>
             * <li><strong>GroupId</strong>: server group</li>
             * </ul>
             * </li>
             * <li><p><strong>groupIds</strong>: the ID of the server group</p>
             * </li>
             * <li><p><strong>uuids</strong>: the UUID of the server</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>If this field is empty, the rule is applied to all assets.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;GroupId&quot;,&quot;groupIds&quot;:[916****],&quot;uuids&quot;:[]}</p>
             */
            public Builder targetInfo(String targetInfo) {
                this.targetInfo = targetInfo;
                return this;
            }

            /**
             * <p>The type of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>cve</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The information about the vulnerability. The value of this parameter is in the JSON format. Valid values:</p>
             * <ul>
             * <li><strong>name</strong>: the name of the vulnerability</li>
             * <li><strong>type</strong>: the type of the vulnerability.</li>
             * <li><strong>aliasName</strong>: the alias of the vulnerability</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[{
             * &quot;name&quot;:&quot;oval:com.redhat.rhsa:def:20173263&quot;,
             * &quot;type&quot;:&quot;cve&quot;,
             * &quot;aliasName&quot;:&quot;RHSA-2017:3263: curl security update&quot;
             * }]</p>
             */
            public Builder whitelist(String whitelist) {
                this.whitelist = whitelist;
                return this;
            }

            public VulWhitelists build() {
                return new VulWhitelists(this);
            } 

        } 

    }
}
