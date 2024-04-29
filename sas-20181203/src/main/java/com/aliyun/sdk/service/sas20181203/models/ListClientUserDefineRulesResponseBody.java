// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClientUserDefineRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListClientUserDefineRulesResponseBody</p>
 */
public class ListClientUserDefineRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserDefineRuleList")
    private java.util.List < UserDefineRuleList> userDefineRuleList;

    private ListClientUserDefineRulesResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.userDefineRuleList = builder.userDefineRuleList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClientUserDefineRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userDefineRuleList
     */
    public java.util.List < UserDefineRuleList> getUserDefineRuleList() {
        return this.userDefineRuleList;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private String requestId; 
        private java.util.List < UserDefineRuleList> userDefineRuleList; 

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array that consists of the rules.
         */
        public Builder userDefineRuleList(java.util.List < UserDefineRuleList> userDefineRuleList) {
            this.userDefineRuleList = userDefineRuleList;
            return this;
        }

        public ListClientUserDefineRulesResponseBody build() {
            return new ListClientUserDefineRulesResponseBody(this);
        } 

    } 

    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

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
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    public static class UserDefineRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionType")
        private Integer actionType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("SwitchId")
        private String switchId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private UserDefineRuleList(Builder builder) {
            this.actionType = builder.actionType;
            this.id = builder.id;
            this.name = builder.name;
            this.platform = builder.platform;
            this.switchId = builder.switchId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserDefineRuleList create() {
            return builder().build();
        }

        /**
         * @return actionType
         */
        public Integer getActionType() {
            return this.actionType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return switchId
         */
        public String getSwitchId() {
            return this.switchId;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer actionType; 
            private Long id; 
            private String name; 
            private String platform; 
            private String switchId; 
            private Integer type; 

            /**
             * The action of the rule. Valid values:
             * <p>
             * 
             * *   **0**: allow
             * *   **1**: block
             */
            public Builder actionType(Integer actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * The ID of the rule.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the rule.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the operating system. Valid values:
             * <p>
             * 
             * *   **windows**: Windows
             * *   **linux**: Linux
             * *   **all**: all types
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * The switch ID of the rule.
             */
            public Builder switchId(String switchId) {
                this.switchId = switchId;
                return this;
            }

            /**
             * The type of the rule. Valid values:
             * <p>
             * 
             * *   **1**: Process hash
             * *   **2**: Command line
             * *   **3**: Process Network
             * *   **4**: File Read and Write
             * *   **5**: Operation on Registry
             * *   **6**: Dynamic-link Library Loading
             * *   **7**: File Renaming
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public UserDefineRuleList build() {
                return new UserDefineRuleList(this);
            } 

        } 

    }
}
