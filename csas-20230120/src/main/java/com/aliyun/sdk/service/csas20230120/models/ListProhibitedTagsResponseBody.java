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
 * {@link ListProhibitedTagsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProhibitedTagsResponseBody</p>
 */
public class ListProhibitedTagsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Long totalNum;

    private ListProhibitedTagsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tags = builder.tags;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProhibitedTagsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return totalNum
     */
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Tags> tags; 
        private Long totalNum; 

        private Builder() {
        } 

        private Builder(ListProhibitedTagsResponseBody model) {
            this.requestId = model.requestId;
            this.tags = model.tags;
            this.totalNum = model.totalNum;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>287434FF-344F-565A-8623-439005BA9287</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * TotalNum.
         */
        public Builder totalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public ListProhibitedTagsResponseBody build() {
            return new ListProhibitedTagsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProhibitedTagsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProhibitedTagsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PolicyIds")
        private java.util.List<String> policyIds;

        @com.aliyun.core.annotation.NameInMap("SoftwareIds")
        private java.util.List<String> softwareIds;

        @com.aliyun.core.annotation.NameInMap("TagId")
        private String tagId;

        private Tags(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.isDefault = builder.isDefault;
            this.name = builder.name;
            this.policyIds = builder.policyIds;
            this.softwareIds = builder.softwareIds;
            this.tagId = builder.tagId;
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
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return policyIds
         */
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        /**
         * @return softwareIds
         */
        public java.util.List<String> getSoftwareIds() {
            return this.softwareIds;
        }

        /**
         * @return tagId
         */
        public String getTagId() {
            return this.tagId;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private Boolean isDefault; 
            private String name; 
            private java.util.List<String> policyIds; 
            private java.util.List<String> softwareIds; 
            private String tagId; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.isDefault = model.isDefault;
                this.name = model.name;
                this.policyIds = model.policyIds;
                this.softwareIds = model.softwareIds;
                this.tagId = model.tagId;
            } 

            /**
             * CreateTime.
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
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
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
             * PolicyIds.
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * SoftwareIds.
             */
            public Builder softwareIds(java.util.List<String> softwareIds) {
                this.softwareIds = softwareIds;
                return this;
            }

            /**
             * TagId.
             */
            public Builder tagId(String tagId) {
                this.tagId = tagId;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
