// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDynamicTagRuleListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDynamicTagRuleListResponseBody</p>
 */
public class DescribeDynamicTagRuleListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private String pageNumber;

    @NameInMap("PageSize")
    private String pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TagGroupList")
    private TagGroupList tagGroupList;

    @NameInMap("Total")
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

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   true: The call was successful.
         * *   false: The call failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The tag rules of application groups.
         */
        public Builder tagGroupList(TagGroupList tagGroupList) {
            this.tagGroupList = tagGroupList;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeDynamicTagRuleListResponseBody build() {
            return new DescribeDynamicTagRuleListResponseBody(this);
        } 

    } 

    public static class ContactGroupList extends TeaModel {
        @NameInMap("ContactGroupList")
        private java.util.List < String > contactGroupList;

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
        public java.util.List < String > getContactGroupList() {
            return this.contactGroupList;
        }

        public static final class Builder {
            private java.util.List < String > contactGroupList; 

            /**
             * ContactGroupList.
             */
            public Builder contactGroupList(java.util.List < String > contactGroupList) {
                this.contactGroupList = contactGroupList;
                return this;
            }

            public ContactGroupList build() {
                return new ContactGroupList(this);
            } 

        } 

    }
    public static class MatchExpress extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        @NameInMap("TagValueMatchFunction")
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

            /**
             * The tag key.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The tag value.
             * <p>
             * 
             * The `TagValue` and `TagValueMatchFunction` parameters must be used in pairs.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            /**
             * The method that is used to match tag values. Valid values:
             * <p>
             * 
             * *   all: includes all
             * *   startWith: starts with a prefix
             * *   endWith: ends with a suffix
             * *   contains: contains
             * *   notContains: does not contain
             * *   equals: equals
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
    public static class TagGroupMatchExpress extends TeaModel {
        @NameInMap("MatchExpress")
        private java.util.List < MatchExpress> matchExpress;

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
        public java.util.List < MatchExpress> getMatchExpress() {
            return this.matchExpress;
        }

        public static final class Builder {
            private java.util.List < MatchExpress> matchExpress; 

            /**
             * MatchExpress.
             */
            public Builder matchExpress(java.util.List < MatchExpress> matchExpress) {
                this.matchExpress = matchExpress;
                return this;
            }

            public TagGroupMatchExpress build() {
                return new TagGroupMatchExpress(this);
            } 

        } 

    }
    public static class TemplateIdList extends TeaModel {
        @NameInMap("TemplateIdList")
        private java.util.List < String > templateIdList;

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
        public java.util.List < String > getTemplateIdList() {
            return this.templateIdList;
        }

        public static final class Builder {
            private java.util.List < String > templateIdList; 

            /**
             * TemplateIdList.
             */
            public Builder templateIdList(java.util.List < String > templateIdList) {
                this.templateIdList = templateIdList;
                return this;
            }

            public TemplateIdList build() {
                return new TemplateIdList(this);
            } 

        } 

    }
    public static class TagGroup extends TeaModel {
        @NameInMap("ContactGroupList")
        private ContactGroupList contactGroupList;

        @NameInMap("DynamicTagRuleId")
        private String dynamicTagRuleId;

        @NameInMap("MatchExpress")
        private TagGroupMatchExpress matchExpress;

        @NameInMap("MatchExpressFilterRelation")
        private String matchExpressFilterRelation;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TemplateIdList")
        private TemplateIdList templateIdList;

        private TagGroup(Builder builder) {
            this.contactGroupList = builder.contactGroupList;
            this.dynamicTagRuleId = builder.dynamicTagRuleId;
            this.matchExpress = builder.matchExpress;
            this.matchExpressFilterRelation = builder.matchExpressFilterRelation;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.tagKey = builder.tagKey;
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
            private TemplateIdList templateIdList; 

            /**
             * The alert contact group.
             */
            public Builder contactGroupList(ContactGroupList contactGroupList) {
                this.contactGroupList = contactGroupList;
                return this;
            }

            /**
             * The ID of the tag rule.
             */
            public Builder dynamicTagRuleId(String dynamicTagRuleId) {
                this.dynamicTagRuleId = dynamicTagRuleId;
                return this;
            }

            /**
             * The conditional expressions used to create an application group based on the tag.
             */
            public Builder matchExpress(TagGroupMatchExpress matchExpress) {
                this.matchExpress = matchExpress;
                return this;
            }

            /**
             * The logical operator that is used between conditional expressions. Valid values:
             * <p>
             * 
             * *   `and`
             * *   `or`
             * 
             * >  Only one logical operator can be used in a request.
             */
            public Builder matchExpressFilterRelation(String matchExpressFilterRelation) {
                this.matchExpressFilterRelation = matchExpressFilterRelation;
                return this;
            }

            /**
             * The ID of the region to which the tags belong.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The status of adding instances that meet the tag rule to the application group. Valid values:
             * <p>
             * 
             * *   `RUNNING`
             * *   `FINISH`
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tag key.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The IDs of the alert templates.
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
    public static class TagGroupList extends TeaModel {
        @NameInMap("TagGroup")
        private java.util.List < TagGroup> tagGroup;

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
        public java.util.List < TagGroup> getTagGroup() {
            return this.tagGroup;
        }

        public static final class Builder {
            private java.util.List < TagGroup> tagGroup; 

            /**
             * TagGroup.
             */
            public Builder tagGroup(java.util.List < TagGroup> tagGroup) {
                this.tagGroup = tagGroup;
                return this;
            }

            public TagGroupList build() {
                return new TagGroupList(this);
            } 

        } 

    }
}
