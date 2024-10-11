// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListPhoneNumbersResponseBody} extends {@link TeaModel}
 *
 * <p>ListPhoneNumbersResponseBody</p>
 */
public class ListPhoneNumbersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPhoneNumbersResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPhoneNumbersResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPhoneNumbersResponseBody build() {
            return new ListPhoneNumbersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPhoneNumbersResponseBody} extends {@link TeaModel}
     *
     * <p>ListPhoneNumbersResponseBody</p>
     */
    public static class SkillGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SkillGroupId")
        private String skillGroupId;

        private SkillGroups(Builder builder) {
            this.displayName = builder.displayName;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.skillGroupId = builder.skillGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillGroups create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return skillGroupId
         */
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public static final class Builder {
            private String displayName; 
            private String instanceId; 
            private String name; 
            private String skillGroupId; 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * SkillGroupId.
             */
            public Builder skillGroupId(String skillGroupId) {
                this.skillGroupId = skillGroupId;
                return this;
            }

            public SkillGroups build() {
                return new SkillGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPhoneNumbersResponseBody} extends {@link TeaModel}
     *
     * <p>ListPhoneNumbersResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Active")
        private Boolean active;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("ContactFlowId")
        private String contactFlowId;

        @com.aliyun.core.annotation.NameInMap("ContactFlowName")
        private String contactFlowName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Number")
        private String number;

        @com.aliyun.core.annotation.NameInMap("Provider")
        private String provider;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        @com.aliyun.core.annotation.NameInMap("SkillGroups")
        private java.util.List < SkillGroups> skillGroups;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private String usage;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private List(Builder builder) {
            this.active = builder.active;
            this.city = builder.city;
            this.contactFlowId = builder.contactFlowId;
            this.contactFlowName = builder.contactFlowName;
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.number = builder.number;
            this.provider = builder.provider;
            this.province = builder.province;
            this.skillGroups = builder.skillGroups;
            this.tags = builder.tags;
            this.usage = builder.usage;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Boolean getActive() {
            return this.active;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return contactFlowId
         */
        public String getContactFlowId() {
            return this.contactFlowId;
        }

        /**
         * @return contactFlowName
         */
        public String getContactFlowName() {
            return this.contactFlowName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        /**
         * @return provider
         */
        public String getProvider() {
            return this.provider;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return skillGroups
         */
        public java.util.List < SkillGroups> getSkillGroups() {
            return this.skillGroups;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return usage
         */
        public String getUsage() {
            return this.usage;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Boolean active; 
            private String city; 
            private String contactFlowId; 
            private String contactFlowName; 
            private String createTime; 
            private String instanceId; 
            private String number; 
            private String provider; 
            private String province; 
            private java.util.List < SkillGroups> skillGroups; 
            private String tags; 
            private String usage; 
            private String userId; 

            /**
             * Active.
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * ContactFlowId.
             */
            public Builder contactFlowId(String contactFlowId) {
                this.contactFlowId = contactFlowId;
                return this;
            }

            /**
             * ContactFlowName.
             */
            public Builder contactFlowName(String contactFlowName) {
                this.contactFlowName = contactFlowName;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Number.
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * Provider.
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            /**
             * Province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * SkillGroups.
             */
            public Builder skillGroups(java.util.List < SkillGroups> skillGroups) {
                this.skillGroups = skillGroups;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Usage.
             */
            public Builder usage(String usage) {
                this.usage = usage;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPhoneNumbersResponseBody} extends {@link TeaModel}
     *
     * <p>ListPhoneNumbersResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List < List> list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
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
            private java.util.List < List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
