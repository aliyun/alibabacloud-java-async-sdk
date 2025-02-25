// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

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
 * {@link ListControlPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListControlPoliciesResponseBody</p>
 */
public class ListControlPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ControlPolicies")
    private ControlPolicies controlPolicies;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListControlPoliciesResponseBody(Builder builder) {
        this.controlPolicies = builder.controlPolicies;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListControlPoliciesResponseBody create() {
        return builder().build();
    }

    /**
     * @return controlPolicies
     */
    public ControlPolicies getControlPolicies() {
        return this.controlPolicies;
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

    public static final class Builder {
        private ControlPolicies controlPolicies; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The information of the access control policies.</p>
         */
        public Builder controlPolicies(ControlPolicies controlPolicies) {
            this.controlPolicies = controlPolicies;
            return this;
        }

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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9424A34C-3471-45AD-B6AB-924BBDFE42F9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of access control policies.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListControlPoliciesResponseBody build() {
            return new ListControlPoliciesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListControlPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListControlPoliciesResponseBody</p>
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
     * {@link ListControlPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListControlPoliciesResponseBody</p>
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
     * {@link ListControlPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListControlPoliciesResponseBody</p>
     */
    public static class ControlPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachmentCount")
        private String attachmentCount;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EffectScope")
        private String effectScope;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("UpdateDate")
        private String updateDate;

        private ControlPolicy(Builder builder) {
            this.attachmentCount = builder.attachmentCount;
            this.createDate = builder.createDate;
            this.description = builder.description;
            this.effectScope = builder.effectScope;
            this.policyId = builder.policyId;
            this.policyName = builder.policyName;
            this.policyType = builder.policyType;
            this.tags = builder.tags;
            this.updateDate = builder.updateDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ControlPolicy create() {
            return builder().build();
        }

        /**
         * @return attachmentCount
         */
        public String getAttachmentCount() {
            return this.attachmentCount;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return effectScope
         */
        public String getEffectScope() {
            return this.effectScope;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return updateDate
         */
        public String getUpdateDate() {
            return this.updateDate;
        }

        public static final class Builder {
            private String attachmentCount; 
            private String createDate; 
            private String description; 
            private String effectScope; 
            private String policyId; 
            private String policyName; 
            private String policyType; 
            private Tags tags; 
            private String updateDate; 

            /**
             * <p>The number of times that the access control policy is referenced.</p>
             * 
             * <strong>example:</strong>
             * <p>44</p>
             */
            public Builder attachmentCount(String attachmentCount) {
                this.attachmentCount = attachmentCount;
                return this;
            }

            /**
             * <p>The time when the access control policy was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-08-05T06:32:24Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The description of the access control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>System access control policy available for all operations on the cloud</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The effective scope of the access control policy. Valid values:</p>
             * <ul>
             * <li>All: The access control policy is in effect for Alibaba Cloud accounts, RAM users, and RAM roles.</li>
             * <li>RAM: The access control policy is in effect only for RAM users and RAM roles.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>All</p>
             */
            public Builder effectScope(String effectScope) {
                this.effectScope = effectScope;
                return this;
            }

            /**
             * <p>The ID of the access control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>cp-FullAliyunAccess</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The name of the access control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>FullAliyunAccess</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * <p>The type of the access control policy. Valid values:</p>
             * <ul>
             * <li>System: system access control policy</li>
             * <li>Custom: custom access control policy</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>System</p>
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The time when the access control policy was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-08-05T06:32:24Z</p>
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            public ControlPolicy build() {
                return new ControlPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListControlPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListControlPoliciesResponseBody</p>
     */
    public static class ControlPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ControlPolicy")
        private java.util.List<ControlPolicy> controlPolicy;

        private ControlPolicies(Builder builder) {
            this.controlPolicy = builder.controlPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ControlPolicies create() {
            return builder().build();
        }

        /**
         * @return controlPolicy
         */
        public java.util.List<ControlPolicy> getControlPolicy() {
            return this.controlPolicy;
        }

        public static final class Builder {
            private java.util.List<ControlPolicy> controlPolicy; 

            /**
             * ControlPolicy.
             */
            public Builder controlPolicy(java.util.List<ControlPolicy> controlPolicy) {
                this.controlPolicy = controlPolicy;
                return this;
            }

            public ControlPolicies build() {
                return new ControlPolicies(this);
            } 

        } 

    }
}
