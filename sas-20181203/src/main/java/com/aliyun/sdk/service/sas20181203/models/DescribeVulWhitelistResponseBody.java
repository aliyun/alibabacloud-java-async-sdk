// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulWhitelistResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVulWhitelistResponseBody</p>
 */
public class DescribeVulWhitelistResponseBody extends TeaModel {
    @NameInMap("Count")
    private Integer count;

    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("VulWhitelists")
    private java.util.List < VulWhitelists> vulWhitelists;

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
    public java.util.List < VulWhitelists> getVulWhitelists() {
        return this.vulWhitelists;
    }

    public static final class Builder {
        private Integer count; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < VulWhitelists> vulWhitelists; 

        /**
         * The number of entries returned on the current page.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * An array that consists of information about the whitelist of vulnerabilities.
         */
        public Builder vulWhitelists(java.util.List < VulWhitelists> vulWhitelists) {
            this.vulWhitelists = vulWhitelists;
            return this;
        }

        public DescribeVulWhitelistResponseBody build() {
            return new DescribeVulWhitelistResponseBody(this);
        } 

    } 

    public static class VulWhitelists extends TeaModel {
        @NameInMap("AliasName")
        private String aliasName;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("TargetInfo")
        private String targetInfo;

        @NameInMap("Type")
        private String type;

        @NameInMap("Whitelist")
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
             * The alias of the vulnerability.
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * The ID of the rule.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the vulnerability.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The reason why the vulnerability is added to the whitelist.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The application scope of the rule. The value is a JSON string that contains the following fields:
             * <p>
             * 
             * *   **type**: the type of the assets to which the rule is applied. Valid values:
             * 
             *     *   **Uuid**: server
             *     *   **GroupId**: server group
             * 
             * *   **groupIds**: the ID of the server group
             * 
             * *   **uuids**: the UUID of the server
             * 
             * > If this field is empty, the rule is applied to all assets.
             */
            public Builder targetInfo(String targetInfo) {
                this.targetInfo = targetInfo;
                return this;
            }

            /**
             * The type of the vulnerability.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The information about the vulnerability. The value of this parameter is in the JSON format. Valid values:
             * <p>
             * 
             * *   **name**: the name of the vulnerability
             * *   **type**: the type of the vulnerability.
             * *   **aliasName**: the alias of the vulnerability
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
