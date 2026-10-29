// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link DescribeDynamicTagRuleListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDynamicTagRuleListResponseBody</p>
 */
public class DescribeDynamicTagRuleListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TagGroupList")
    private TagGroupList tagGroupList;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private DescribeDynamicTagRuleListResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tagGroupList = builder.tagGroupList;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDynamicTagRuleListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return tagGroupList
     */
    public TagGroupList getTagGroupList() {
        return this.tagGroupList;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private Boolean success; 
        private TagGroupList tagGroupList; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(DescribeDynamicTagRuleListResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.tagGroupList = model.tagGroupList;
            this.total = model.total;
        } 

        /**
         * <p>The status code.</p>
         * <blockquote>
         * <p>A status code of 200 indicates that the operation was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified resource is not found.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0D50523D-8D59-4A61-B58E-E2286ECFB3A9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful. Valid values:</p>
         * <ul>
         * <li><p>true: The operation was successful.</p>
         * </li>
         * <li><p>false: The operation failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TagGroupList.
         */
        public Builder tagGroupList(TagGroupList tagGroupList) {
            this.tagGroupList = tagGroupList;
            return this;
        }

        /**
         * <p>The total number of entries in the tag list.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeDynamicTagRuleListResponseBody build() {
            return new DescribeDynamicTagRuleListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDynamicTagRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDynamicTagRuleListResponseBody</p>
     */
    public static class ContactGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactGroupList")
        private java.util.List<String> contactGroupList;

        private ContactGroupList(Builder builder) {
            this.contactGroupList = builder.contactGroupList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactGroupList create() {
            return builder().build();
        }

        /**
         * @return contactGroupList
         */
        public java.util.List<String> getContactGroupList() {
            return this.contactGroupList;
        }

        public static final class Builder {
            private java.util.List<String> contactGroupList; 

            private Builder() {
            } 

            private Builder(ContactGroupList model) {
                this.contactGroupList = model.contactGroupList;
            } 

            /**
             * ContactGroupList.
             */
            public Builder contactGroupList(java.util.List<String> contactGroupList) {
                this.contactGroupList = contactGroupList;
                return this;
            }

            public ContactGroupList build() {
                return new ContactGroupList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDynamicTagRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDynamicTagRuleListResponseBody</p>
     */
    public static class MatchExpress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        @com.aliyun.core.annotation.NameInMap("TagValueMatchFunction")
        private String tagValueMatchFunction;

        private MatchExpress(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
            this.tagValueMatchFunction = builder.tagValueMatchFunction;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchExpress create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        /**
         * @return tagValueMatchFunction
         */
        public String getTagValueMatchFunction() {
            return this.tagValueMatchFunction;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 
            private String tagValueMatchFunction; 

            private Builder() {
            } 

            private Builder(MatchExpress model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
                this.tagValueMatchFunction = model.tagValueMatchFunction;
            } 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            /**
             * TagValueMatchFunction.
             */
            public Builder tagValueMatchFunction(String tagValueMatchFunction) {
                this.tagValueMatchFunction = tagValueMatchFunction;
                return this;
            }

            public MatchExpress build() {
                return new MatchExpress(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDynamicTagRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDynamicTagRuleListResponseBody</p>
     */
    public static class TagGroupMatchExpress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MatchExpress")
        private java.util.List<MatchExpress> matchExpress;

        private TagGroupMatchExpress(Builder builder) {
            this.matchExpress = builder.matchExpress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagGroupMatchExpress create() {
            return builder().build();
        }

        /**
         * @return matchExpress
         */
        public java.util.List<MatchExpress> getMatchExpress() {
            return this.matchExpress;
        }

        public static final class Builder {
            private java.util.List<MatchExpress> matchExpress; 

            private Builder() {
            } 

            private Builder(TagGroupMatchExpress model) {
                this.matchExpress = model.matchExpress;
            } 

            /**
             * MatchExpress.
             */
            public Builder matchExpress(java.util.List<MatchExpress> matchExpress) {
                this.matchExpress = matchExpress;
                return this;
            }

            public TagGroupMatchExpress build() {
                return new TagGroupMatchExpress(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDynamicTagRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDynamicTagRuleListResponseBody</p>
     */
    public static class TagValueBlacklist extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagValueBlacklist")
        private java.util.List<String> tagValueBlacklist;

        private TagValueBlacklist(Builder builder) {
            this.tagValueBlacklist = builder.tagValueBlacklist;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagValueBlacklist create() {
            return builder().build();
        }

        /**
         * @return tagValueBlacklist
         */
        public java.util.List<String> getTagValueBlacklist() {
            return this.tagValueBlacklist;
        }

        public static final class Builder {
            private java.util.List<String> tagValueBlacklist; 

            private Builder() {
            } 

            private Builder(TagValueBlacklist model) {
                this.tagValueBlacklist = model.tagValueBlacklist;
            } 

            /**
             * TagValueBlacklist.
             */
            public Builder tagValueBlacklist(java.util.List<String> tagValueBlacklist) {
                this.tagValueBlacklist = tagValueBlacklist;
                return this;
            }

            public TagValueBlacklist build() {
                return new TagValueBlacklist(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDynamicTagRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDynamicTagRuleListResponseBody</p>
     */
    public static class TemplateIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TemplateIdList")
        private java.util.List<String> templateIdList;

        private TemplateIdList(Builder builder) {
            this.templateIdList = builder.templateIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateIdList create() {
            return builder().build();
        }

        /**
         * @return templateIdList
         */
        public java.util.List<String> getTemplateIdList() {
            return this.templateIdList;
        }

        public static final class Builder {
            private java.util.List<String> templateIdList; 

            private Builder() {
            } 

            private Builder(TemplateIdList model) {
                this.templateIdList = model.templateIdList;
            } 

            /**
             * TemplateIdList.
             */
            public Builder templateIdList(java.util.List<String> templateIdList) {
                this.templateIdList = templateIdList;
                return this;
            }

            public TemplateIdList build() {
                return new TemplateIdList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDynamicTagRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDynamicTagRuleListResponseBody</p>
     */
    public static class TagGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactGroupList")
        private ContactGroupList contactGroupList;

        @com.aliyun.core.annotation.NameInMap("DynamicTagRuleId")
        private String dynamicTagRuleId;

        @com.aliyun.core.annotation.NameInMap("MatchExpress")
        private TagGroupMatchExpress matchExpress;

        @com.aliyun.core.annotation.NameInMap("MatchExpressFilterRelation")
        private String matchExpressFilterRelation;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValueBlacklist")
        private TagValueBlacklist tagValueBlacklist;

        @com.aliyun.core.annotation.NameInMap("TemplateIdList")
        private TemplateIdList templateIdList;

        private TagGroup(Builder builder) {
            this.contactGroupList = builder.contactGroupList;
            this.dynamicTagRuleId = builder.dynamicTagRuleId;
            this.matchExpress = builder.matchExpress;
            this.matchExpressFilterRelation = builder.matchExpressFilterRelation;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.tagKey = builder.tagKey;
            this.tagValueBlacklist = builder.tagValueBlacklist;
            this.templateIdList = builder.templateIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagGroup create() {
            return builder().build();
        }

        /**
         * @return contactGroupList
         */
        public ContactGroupList getContactGroupList() {
            return this.contactGroupList;
        }

        /**
         * @return dynamicTagRuleId
         */
        public String getDynamicTagRuleId() {
            return this.dynamicTagRuleId;
        }

        /**
         * @return matchExpress
         */
        public TagGroupMatchExpress getMatchExpress() {
            return this.matchExpress;
        }

        /**
         * @return matchExpressFilterRelation
         */
        public String getMatchExpressFilterRelation() {
            return this.matchExpressFilterRelation;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValueBlacklist
         */
        public TagValueBlacklist getTagValueBlacklist() {
            return this.tagValueBlacklist;
        }

        /**
         * @return templateIdList
         */
        public TemplateIdList getTemplateIdList() {
            return this.templateIdList;
        }

        public static final class Builder {
            private ContactGroupList contactGroupList; 
            private String dynamicTagRuleId; 
            private TagGroupMatchExpress matchExpress; 
            private String matchExpressFilterRelation; 
            private String regionId; 
            private String status; 
            private String tagKey; 
            private TagValueBlacklist tagValueBlacklist; 
            private TemplateIdList templateIdList; 

            private Builder() {
            } 

            private Builder(TagGroup model) {
                this.contactGroupList = model.contactGroupList;
                this.dynamicTagRuleId = model.dynamicTagRuleId;
                this.matchExpress = model.matchExpress;
                this.matchExpressFilterRelation = model.matchExpressFilterRelation;
                this.regionId = model.regionId;
                this.status = model.status;
                this.tagKey = model.tagKey;
                this.tagValueBlacklist = model.tagValueBlacklist;
                this.templateIdList = model.templateIdList;
            } 

            /**
             * ContactGroupList.
             */
            public Builder contactGroupList(ContactGroupList contactGroupList) {
                this.contactGroupList = contactGroupList;
                return this;
            }

            /**
             * DynamicTagRuleId.
             */
            public Builder dynamicTagRuleId(String dynamicTagRuleId) {
                this.dynamicTagRuleId = dynamicTagRuleId;
                return this;
            }

            /**
             * MatchExpress.
             */
            public Builder matchExpress(TagGroupMatchExpress matchExpress) {
                this.matchExpress = matchExpress;
                return this;
            }

            /**
             * MatchExpressFilterRelation.
             */
            public Builder matchExpressFilterRelation(String matchExpressFilterRelation) {
                this.matchExpressFilterRelation = matchExpressFilterRelation;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValueBlacklist.
             */
            public Builder tagValueBlacklist(TagValueBlacklist tagValueBlacklist) {
                this.tagValueBlacklist = tagValueBlacklist;
                return this;
            }

            /**
             * TemplateIdList.
             */
            public Builder templateIdList(TemplateIdList templateIdList) {
                this.templateIdList = templateIdList;
                return this;
            }

            public TagGroup build() {
                return new TagGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDynamicTagRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDynamicTagRuleListResponseBody</p>
     */
    public static class TagGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagGroup")
        private java.util.List<TagGroup> tagGroup;

        private TagGroupList(Builder builder) {
            this.tagGroup = builder.tagGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagGroupList create() {
            return builder().build();
        }

        /**
         * @return tagGroup
         */
        public java.util.List<TagGroup> getTagGroup() {
            return this.tagGroup;
        }

        public static final class Builder {
            private java.util.List<TagGroup> tagGroup; 

            private Builder() {
            } 

            private Builder(TagGroupList model) {
                this.tagGroup = model.tagGroup;
            } 

            /**
             * TagGroup.
             */
            public Builder tagGroup(java.util.List<TagGroup> tagGroup) {
                this.tagGroup = tagGroup;
                return this;
            }

            public TagGroupList build() {
                return new TagGroupList(this);
            } 

        } 

    }
}
