// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

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
 * {@link DescribeWorkgroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWorkgroupsResponseBody</p>
 */
public class DescribeWorkgroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("Workgroups")
    private Workgroups workgroups;

    private DescribeWorkgroupsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.workgroups = builder.workgroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWorkgroupsResponseBody create() {
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
     * @return workgroups
     */
    public Workgroups getWorkgroups() {
        return this.workgroups;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Workgroups workgroups; 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 50. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2D69A58F-345C-4FDE-88E4-BF518948****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of workgroups.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The queried workgroups.</p>
         */
        public Builder workgroups(Workgroups workgroups) {
            this.workgroups = workgroups;
            return this;
        }

        public DescribeWorkgroupsResponseBody build() {
            return new DescribeWorkgroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWorkgroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWorkgroupsResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The tag key of the workgroup.</p>
             * <p>You can specify an empty string as a tag key. The tag key can be up to 64 characters in length and cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the workgroup. Valid values of N: 1 to 20.</p>
             * <p>You can specify an empty string as a tag value. The tag value can be up to 64 characters in length and cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWorkgroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWorkgroupsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWorkgroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWorkgroupsResponseBody</p>
     */
    public static class SourceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceId")
        private java.util.List<String> sourceId;

        private SourceIds(Builder builder) {
            this.sourceId = builder.sourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceIds create() {
            return builder().build();
        }

        /**
         * @return sourceId
         */
        public java.util.List<String> getSourceId() {
            return this.sourceId;
        }

        public static final class Builder {
            private java.util.List<String> sourceId; 

            /**
             * SourceId.
             */
            public Builder sourceId(java.util.List<String> sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            public SourceIds build() {
                return new SourceIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWorkgroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWorkgroupsResponseBody</p>
     */
    public static class Warning extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceIds")
        private SourceIds sourceIds;

        @com.aliyun.core.annotation.NameInMap("WarningType")
        private String warningType;

        private Warning(Builder builder) {
            this.sourceIds = builder.sourceIds;
            this.warningType = builder.warningType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Warning create() {
            return builder().build();
        }

        /**
         * @return sourceIds
         */
        public SourceIds getSourceIds() {
            return this.sourceIds;
        }

        /**
         * @return warningType
         */
        public String getWarningType() {
            return this.warningType;
        }

        public static final class Builder {
            private SourceIds sourceIds; 
            private String warningType; 

            /**
             * <p>The migration sources for which alerts are generated.</p>
             */
            public Builder sourceIds(SourceIds sourceIds) {
                this.sourceIds = sourceIds;
                return this;
            }

            /**
             * <p>The type of the alert. Valid values:</p>
             * <ul>
             * <li>InError: A migration job failed.</li>
             * <li>UnRelated: No migration job is created for a migration source.</li>
             * <li>NotPassed: A migration job failed to pass the migration test.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>InError</p>
             */
            public Builder warningType(String warningType) {
                this.warningType = warningType;
                return this;
            }

            public Warning build() {
                return new Warning(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWorkgroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWorkgroupsResponseBody</p>
     */
    public static class Warnings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Warning")
        private java.util.List<Warning> warning;

        private Warnings(Builder builder) {
            this.warning = builder.warning;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Warnings create() {
            return builder().build();
        }

        /**
         * @return warning
         */
        public java.util.List<Warning> getWarning() {
            return this.warning;
        }

        public static final class Builder {
            private java.util.List<Warning> warning; 

            /**
             * Warning.
             */
            public Builder warning(java.util.List<Warning> warning) {
                this.warning = warning;
                return this;
            }

            public Warnings build() {
                return new Warnings(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWorkgroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWorkgroupsResponseBody</p>
     */
    public static class Workgroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("Warnings")
        private Warnings warnings;

        @com.aliyun.core.annotation.NameInMap("WorkgroupId")
        private String workgroupId;

        private Workgroup(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.status = builder.status;
            this.tags = builder.tags;
            this.warnings = builder.warnings;
            this.workgroupId = builder.workgroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Workgroup create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return warnings
         */
        public Warnings getWarnings() {
            return this.warnings;
        }

        /**
         * @return workgroupId
         */
        public String getWorkgroupId() {
            return this.workgroupId;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String status; 
            private Tags tags; 
            private Warnings warnings; 
            private String workgroupId; 

            /**
             * <p>The description of the workgroup.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the workgroup.</p>
             * 
             * <strong>example:</strong>
             * <p>testWorkgroupName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The state of the workgroup. Valid values:</p>
             * <ul>
             * <li>NotStarted</li>
             * <li>InProgress</li>
             * <li>Cutover</li>
             * <li>Completed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>InProgress</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tag information of the workgroup.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The alert information of the workgroup, which can contain multiple types of alerts.</p>
             */
            public Builder warnings(Warnings warnings) {
                this.warnings = warnings;
                return this;
            }

            /**
             * <p>The workgroup ID.</p>
             * 
             * <strong>example:</strong>
             * <p>w-***</p>
             */
            public Builder workgroupId(String workgroupId) {
                this.workgroupId = workgroupId;
                return this;
            }

            public Workgroup build() {
                return new Workgroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWorkgroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWorkgroupsResponseBody</p>
     */
    public static class Workgroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Workgroup")
        private java.util.List<Workgroup> workgroup;

        private Workgroups(Builder builder) {
            this.workgroup = builder.workgroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Workgroups create() {
            return builder().build();
        }

        /**
         * @return workgroup
         */
        public java.util.List<Workgroup> getWorkgroup() {
            return this.workgroup;
        }

        public static final class Builder {
            private java.util.List<Workgroup> workgroup; 

            /**
             * Workgroup.
             */
            public Builder workgroup(java.util.List<Workgroup> workgroup) {
                this.workgroup = workgroup;
                return this;
            }

            public Workgroups build() {
                return new Workgroups(this);
            } 

        } 

    }
}
