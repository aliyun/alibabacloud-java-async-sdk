// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListTagsForPrivateAccessPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ListTagsForPrivateAccessPolicyResponseBody</p>
 */
public class ListTagsForPrivateAccessPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Polices")
    private java.util.List<Polices> polices;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListTagsForPrivateAccessPolicyResponseBody(Builder builder) {
        this.polices = builder.polices;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagsForPrivateAccessPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return polices
     */
    public java.util.List<Polices> getPolices() {
        return this.polices;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Polices> polices; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListTagsForPrivateAccessPolicyResponseBody model) {
            this.polices = model.polices;
            this.requestId = model.requestId;
        } 

        /**
         * Polices.
         */
        public Builder polices(java.util.List<Polices> polices) {
            this.polices = polices;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListTagsForPrivateAccessPolicyResponseBody build() {
            return new ListTagsForPrivateAccessPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTagsForPrivateAccessPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListTagsForPrivateAccessPolicyResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("TagId")
        private String tagId;

        @com.aliyun.core.annotation.NameInMap("TagType")
        private String tagType;

        private Tags(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.name = builder.name;
            this.tagId = builder.tagId;
            this.tagType = builder.tagType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return tagId
         */
        public String getTagId() {
            return this.tagId;
        }

        /**
         * @return tagType
         */
        public String getTagType() {
            return this.tagType;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String name; 
            private String tagId; 
            private String tagType; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.name = model.name;
                this.tagId = model.tagId;
                this.tagType = model.tagType;
            } 

            /**
             * <p>内网访问标签创建时间。</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-21 14:10:16</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * TagId.
             */
            public Builder tagId(String tagId) {
                this.tagId = tagId;
                return this;
            }

            /**
             * TagType.
             */
            public Builder tagType(String tagType) {
                this.tagType = tagType;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTagsForPrivateAccessPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListTagsForPrivateAccessPolicyResponseBody</p>
     */
    public static class Polices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private Polices(Builder builder) {
            this.policyId = builder.policyId;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Polices create() {
            return builder().build();
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String policyId; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(Polices model) {
                this.policyId = model.policyId;
                this.tags = model.tags;
            } 

            /**
             * PolicyId.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Polices build() {
                return new Polices(this);
            } 

        } 

    }
}
