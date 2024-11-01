// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
         * <p>The pagination information.</p>
         */
        public Builder page(Page page) {
            this.page = page;
            return this;
        }

        /**
         * <p>The playbooks.</p>
         */
        public Builder playbooks(java.util.List < Playbooks> playbooks) {
            this.playbooks = playbooks;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>138B5AB7-7F2B-5814-87A3-E3ECFE1F207E</p>
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

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
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
             * <p>The total number of entries returned.</p>
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

            /**
             * <p>The playbook status. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The playbook is started.</li>
             * <li><strong>0</strong>: The playbook is stopped.</li>
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
             * <p>The time when the playbook was created. The value is a 13-digit timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1683526277415</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the playbook was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1681396398000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The time when the playbook was last run. The value is a 13-digit timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1683526277415</p>
             */
            public Builder lastRuntime(Long lastRuntime) {
                this.lastRuntime = lastRuntime;
                return this;
            }

            /**
             * <p>The type of the playbook. Valid values:</p>
             * <ul>
             * <li><strong>preset</strong>: predefined playbook</li>
             * <li><strong>user</strong>: custom playbook</li>
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
             * ParamType.
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
