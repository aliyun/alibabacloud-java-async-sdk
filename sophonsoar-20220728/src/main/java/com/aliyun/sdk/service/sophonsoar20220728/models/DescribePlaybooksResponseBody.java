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
 * {@link DescribePlaybooksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePlaybooksResponseBody</p>
 */
public class DescribePlaybooksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Page")
    private Page page;

    @com.aliyun.core.annotation.NameInMap("Playbooks")
    private java.util.List<Playbooks> playbooks;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Playbooks> getPlaybooks() {
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
        private java.util.List<Playbooks> playbooks; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePlaybooksResponseBody model) {
            this.page = model.page;
            this.playbooks = model.playbooks;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Pagination query information.</p>
         */
        public Builder page(Page page) {
            this.page = page;
            return this;
        }

        /**
         * <p>List of playbooks.</p>
         */
        public Builder playbooks(java.util.List<Playbooks> playbooks) {
            this.playbooks = playbooks;
            return this;
        }

        /**
         * <p>The ID of the current request, generated by Alibaba Cloud as a unique identifier for troubleshooting and problem localization.</p>
         * 
         * <strong>example:</strong>
         * <p>138B5AB7-<strong><strong>-5814-87A3-E3E</strong></strong>F207E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePlaybooksResponseBody build() {
            return new DescribePlaybooksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePlaybooksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePlaybooksResponseBody</p>
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
             * <p>The page number in pagination queries.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of items per page in pagination queries.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of items found.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link DescribePlaybooksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePlaybooksResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("ParamType")
        private String paramType;

        @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
        private String playbookUuid;

        private Playbooks(Builder builder) {
            this.active = builder.active;
            this.displayName = builder.displayName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.lastRuntime = builder.lastRuntime;
            this.ownType = builder.ownType;
            this.paramType = builder.paramType;
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
         * @return paramType
         */
        public String getParamType() {
            return this.paramType;
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
            private String paramType; 
            private String playbookUuid; 

            private Builder() {
            } 

            private Builder(Playbooks model) {
                this.active = model.active;
                this.displayName = model.displayName;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.lastRuntime = model.lastRuntime;
                this.ownType = model.ownType;
                this.paramType = model.paramType;
                this.playbookUuid = model.playbookUuid;
            } 

            /**
             * <p>The status indicator of the playbook. Values:</p>
             * <ul>
             * <li><strong>1</strong>: Indicates the playbook is activated.</li>
             * <li><strong>0</strong>: Indicates the playbook is deactivated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder active(Integer active) {
                this.active = active;
                return this;
            }

            /**
             * <p>The display name of the playbook.</p>
             * 
             * <strong>example:</strong>
             * <p>demo_playbook</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The creation time of the playbook, in 13-digit timestamp format.</p>
             * 
             * <strong>example:</strong>
             * <p>1683526277415</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The modification time of the playbook.</p>
             * 
             * <strong>example:</strong>
             * <p>1681396398000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The last execution time of the playbook, in 13-digit timestamp format.</p>
             * 
             * <strong>example:</strong>
             * <p>1683526277415</p>
             */
            public Builder lastRuntime(Long lastRuntime) {
                this.lastRuntime = lastRuntime;
                return this;
            }

            /**
             * <p>The type of the playbook. Values:</p>
             * <ul>
             * <li><strong>preset</strong>: Predefined playbook.</li>
             * <li><strong>user</strong>: Custom playbook.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder ownType(String ownType) {
                this.ownType = ownType;
                return this;
            }

            /**
             * <p>The trigger method for the playbook, with a default value of <strong>query all</strong>. Possible values are:</p>
             * <ul>
             * <li><strong>template-incident</strong>: Security incident.</li>
             * <li><strong>template-ip</strong>: IP entity.</li>
             * <li><strong>template-file</strong>: File entity.</li>
             * <li><strong>template-process</strong>: Process entity.</li>
             * <li><strong>template-alert</strong>: Security alert.</li>
             * <li><strong>template-domain</strong>: Domain entity.</li>
             * <li><strong>template-container</strong>: Container entity.</li>
             * <li><strong>template-host</strong>: Host entity.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>template-alert</p>
             */
            public Builder paramType(String paramType) {
                this.paramType = paramType;
                return this;
            }

            /**
             * <p>The UUID of the playbook.</p>
             * 
             * <strong>example:</strong>
             * <p>bb5a8640-a14f-44ef-8376-cxxxxx</p>
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
