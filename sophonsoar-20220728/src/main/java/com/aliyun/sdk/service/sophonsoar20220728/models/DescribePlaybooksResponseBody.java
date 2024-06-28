// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePlaybooksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePlaybooksResponseBody</p>
 */
public class DescribePlaybooksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Page")
    private Page page;

    @com.aliyun.core.annotation.NameInMap("Playbooks")
    private java.util.List < Playbooks> playbooks;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePlaybooksResponseBody(Builder builder) {
        this.page = builder.page;
        this.playbooks = builder.playbooks;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlaybooksResponseBody create() {
        return builder().build();
    }

    /**
     * @return page
     */
    public Page getPage() {
        return this.page;
    }

    /**
     * @return playbooks
     */
    public java.util.List < Playbooks> getPlaybooks() {
        return this.playbooks;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Page page; 
        private java.util.List < Playbooks> playbooks; 
        private String requestId; 

        /**
         * The pagination information.
         */
        public Builder page(Page page) {
            this.page = page;
            return this;
        }

        /**
         * The list of playbooks.
         */
        public Builder playbooks(java.util.List < Playbooks> playbooks) {
            this.playbooks = playbooks;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePlaybooksResponseBody build() {
            return new DescribePlaybooksResponseBody(this);
        } 

    } 

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

            /**
             * The page number of the returned page.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
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

            public Page build() {
                return new Page(this);
            } 

        } 

    }
    public static class Playbooks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Active")
        private Integer active;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("LastRuntime")
        private Long lastRuntime;

        @com.aliyun.core.annotation.NameInMap("OwnType")
        private String ownType;

        @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
        private String playbookUuid;

        private Playbooks(Builder builder) {
            this.active = builder.active;
            this.displayName = builder.displayName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.lastRuntime = builder.lastRuntime;
            this.ownType = builder.ownType;
            this.playbookUuid = builder.playbookUuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Playbooks create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Integer getActive() {
            return this.active;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return lastRuntime
         */
        public Long getLastRuntime() {
            return this.lastRuntime;
        }

        /**
         * @return ownType
         */
        public String getOwnType() {
            return this.ownType;
        }

        /**
         * @return playbookUuid
         */
        public String getPlaybookUuid() {
            return this.playbookUuid;
        }

        public static final class Builder {
            private Integer active; 
            private String displayName; 
            private Long gmtCreate; 
            private String gmtModified; 
            private Long lastRuntime; 
            private String ownType; 
            private String playbookUuid; 

            /**
             * The playbook status. Valid values:
             * <p>
             * 
             * *   **1**: The playbook is started.
             * *   **0**: The playbook is stopped.
             */
            public Builder active(Integer active) {
                this.active = active;
                return this;
            }

            /**
             * The display name of the playbook.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * The time when the playbook was created. The value is a 13-digit timestamp.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The time when the playbook was last run. The value is a 13-digit timestamp.
             */
            public Builder lastRuntime(Long lastRuntime) {
                this.lastRuntime = lastRuntime;
                return this;
            }

            /**
             * The type of the playbook. Valid values:
             * <p>
             * 
             * *   **preset**: predefined playbook
             * *   **user**: custom playbook
             */
            public Builder ownType(String ownType) {
                this.ownType = ownType;
                return this;
            }

            /**
             * The UUID of the playbook.
             */
            public Builder playbookUuid(String playbookUuid) {
                this.playbookUuid = playbookUuid;
                return this;
            }

            public Playbooks build() {
                return new Playbooks(this);
            } 

        } 

    }
}
