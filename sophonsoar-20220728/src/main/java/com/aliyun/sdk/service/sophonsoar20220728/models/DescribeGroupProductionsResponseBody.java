// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
 * {@link DescribeGroupProductionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGroupProductionsResponseBody</p>
 */
public class DescribeGroupProductionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Page")
    private Page page;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeGroupProductionsResponseBody(Builder builder) {
        this.data = builder.data;
        this.page = builder.page;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupProductionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return page
     */
    public Page getPage() {
        return this.page;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Page page; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeGroupProductionsResponseBody model) {
            this.data = model.data;
            this.page = model.page;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Page page) {
            this.page = page;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGroupProductionsResponseBody build() {
            return new DescribeGroupProductionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGroupProductionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGroupProductionsResponseBody</p>
     */
    public static class PolicyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private PolicyList(Builder builder) {
            this.policyName = builder.policyName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyList create() {
            return builder().build();
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String policyName; 
            private String type; 

            private Builder() {
            } 

            private Builder(PolicyList model) {
                this.policyName = model.policyName;
                this.type = model.type;
            } 

            /**
             * PolicyName.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public PolicyList build() {
                return new PolicyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGroupProductionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGroupProductionsResponseBody</p>
     */
    public static class Productions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("DefaultDomain")
        private String defaultDomain;

        @com.aliyun.core.annotation.NameInMap("DefaultVersion")
        private String defaultVersion;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FullDomains")
        private java.util.List<String> fullDomains;

        @com.aliyun.core.annotation.NameInMap("Group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PolicyList")
        private java.util.List<PolicyList> policyList;

        @com.aliyun.core.annotation.NameInMap("RamCode")
        private String ramCode;

        @com.aliyun.core.annotation.NameInMap("ShortName")
        private String shortName;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Versions")
        private java.util.List<String> versions;

        private Productions(Builder builder) {
            this.code = builder.code;
            this.defaultDomain = builder.defaultDomain;
            this.defaultVersion = builder.defaultVersion;
            this.description = builder.description;
            this.fullDomains = builder.fullDomains;
            this.group = builder.group;
            this.name = builder.name;
            this.policyList = builder.policyList;
            this.ramCode = builder.ramCode;
            this.shortName = builder.shortName;
            this.source = builder.source;
            this.versions = builder.versions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Productions create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return defaultDomain
         */
        public String getDefaultDomain() {
            return this.defaultDomain;
        }

        /**
         * @return defaultVersion
         */
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fullDomains
         */
        public java.util.List<String> getFullDomains() {
            return this.fullDomains;
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return policyList
         */
        public java.util.List<PolicyList> getPolicyList() {
            return this.policyList;
        }

        /**
         * @return ramCode
         */
        public String getRamCode() {
            return this.ramCode;
        }

        /**
         * @return shortName
         */
        public String getShortName() {
            return this.shortName;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return versions
         */
        public java.util.List<String> getVersions() {
            return this.versions;
        }

        public static final class Builder {
            private String code; 
            private String defaultDomain; 
            private String defaultVersion; 
            private String description; 
            private java.util.List<String> fullDomains; 
            private String group; 
            private String name; 
            private java.util.List<PolicyList> policyList; 
            private String ramCode; 
            private String shortName; 
            private String source; 
            private java.util.List<String> versions; 

            private Builder() {
            } 

            private Builder(Productions model) {
                this.code = model.code;
                this.defaultDomain = model.defaultDomain;
                this.defaultVersion = model.defaultVersion;
                this.description = model.description;
                this.fullDomains = model.fullDomains;
                this.group = model.group;
                this.name = model.name;
                this.policyList = model.policyList;
                this.ramCode = model.ramCode;
                this.shortName = model.shortName;
                this.source = model.source;
                this.versions = model.versions;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * DefaultDomain.
             */
            public Builder defaultDomain(String defaultDomain) {
                this.defaultDomain = defaultDomain;
                return this;
            }

            /**
             * DefaultVersion.
             */
            public Builder defaultVersion(String defaultVersion) {
                this.defaultVersion = defaultVersion;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * FullDomains.
             */
            public Builder fullDomains(java.util.List<String> fullDomains) {
                this.fullDomains = fullDomains;
                return this;
            }

            /**
             * Group.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PolicyList.
             */
            public Builder policyList(java.util.List<PolicyList> policyList) {
                this.policyList = policyList;
                return this;
            }

            /**
             * RamCode.
             */
            public Builder ramCode(String ramCode) {
                this.ramCode = ramCode;
                return this;
            }

            /**
             * ShortName.
             */
            public Builder shortName(String shortName) {
                this.shortName = shortName;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * Versions.
             */
            public Builder versions(java.util.List<String> versions) {
                this.versions = versions;
                return this;
            }

            public Productions build() {
                return new Productions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGroupProductionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGroupProductionsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("Productions")
        private java.util.List<Productions> productions;

        private Data(Builder builder) {
            this.groupName = builder.groupName;
            this.productions = builder.productions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return productions
         */
        public java.util.List<Productions> getProductions() {
            return this.productions;
        }

        public static final class Builder {
            private String groupName; 
            private java.util.List<Productions> productions; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.groupName = model.groupName;
                this.productions = model.productions;
            } 

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * Productions.
             */
            public Builder productions(java.util.List<Productions> productions) {
                this.productions = productions;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGroupProductionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGroupProductionsResponseBody</p>
     */
    public static class Page extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Page(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Page create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Page model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
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
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Page build() {
                return new Page(this);
            } 

        } 

    }
}
