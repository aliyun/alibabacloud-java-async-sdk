// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link ListPhoneTagsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPhoneTagsResponseBody</p>
 */
public class ListPhoneTagsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PhoneNumbers")
    private PhoneNumbers phoneNumbers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListPhoneTagsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.phoneNumbers = builder.phoneNumbers;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPhoneTagsResponseBody create() {
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
     * @return phoneNumbers
     */
    public PhoneNumbers getPhoneNumbers() {
        return this.phoneNumbers;
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

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private PhoneNumbers phoneNumbers; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListPhoneTagsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.phoneNumbers = model.phoneNumbers;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * PhoneNumbers.
         */
        public Builder phoneNumbers(PhoneNumbers phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListPhoneTagsResponseBody build() {
            return new ListPhoneTagsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPhoneTagsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPhoneTagsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("Concurrency")
        private Integer concurrency;

        @com.aliyun.core.annotation.NameInMap("ContactFlowId")
        private String contactFlowId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Number")
        private String number;

        @com.aliyun.core.annotation.NameInMap("PhoneNumberDescription")
        private String phoneNumberDescription;

        @com.aliyun.core.annotation.NameInMap("PhoneNumberId")
        private String phoneNumberId;

        @com.aliyun.core.annotation.NameInMap("Provider")
        private String provider;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        @com.aliyun.core.annotation.NameInMap("ServiceTag")
        private String serviceTag;

        @com.aliyun.core.annotation.NameInMap("SkillGroupIdList")
        private java.util.List<String> skillGroupIdList;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private String usage;

        private List(Builder builder) {
            this.city = builder.city;
            this.concurrency = builder.concurrency;
            this.contactFlowId = builder.contactFlowId;
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.number = builder.number;
            this.phoneNumberDescription = builder.phoneNumberDescription;
            this.phoneNumberId = builder.phoneNumberId;
            this.provider = builder.provider;
            this.province = builder.province;
            this.serviceTag = builder.serviceTag;
            this.skillGroupIdList = builder.skillGroupIdList;
            this.type = builder.type;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return concurrency
         */
        public Integer getConcurrency() {
            return this.concurrency;
        }

        /**
         * @return contactFlowId
         */
        public String getContactFlowId() {
            return this.contactFlowId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
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
         * @return phoneNumberDescription
         */
        public String getPhoneNumberDescription() {
            return this.phoneNumberDescription;
        }

        /**
         * @return phoneNumberId
         */
        public String getPhoneNumberId() {
            return this.phoneNumberId;
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
         * @return serviceTag
         */
        public String getServiceTag() {
            return this.serviceTag;
        }

        /**
         * @return skillGroupIdList
         */
        public java.util.List<String> getSkillGroupIdList() {
            return this.skillGroupIdList;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return usage
         */
        public String getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private String city; 
            private Integer concurrency; 
            private String contactFlowId; 
            private Long createTime; 
            private String instanceId; 
            private String number; 
            private String phoneNumberDescription; 
            private String phoneNumberId; 
            private String provider; 
            private String province; 
            private String serviceTag; 
            private java.util.List<String> skillGroupIdList; 
            private Integer type; 
            private String usage; 

            private Builder() {
            } 

            private Builder(List model) {
                this.city = model.city;
                this.concurrency = model.concurrency;
                this.contactFlowId = model.contactFlowId;
                this.createTime = model.createTime;
                this.instanceId = model.instanceId;
                this.number = model.number;
                this.phoneNumberDescription = model.phoneNumberDescription;
                this.phoneNumberId = model.phoneNumberId;
                this.provider = model.provider;
                this.province = model.province;
                this.serviceTag = model.serviceTag;
                this.skillGroupIdList = model.skillGroupIdList;
                this.type = model.type;
                this.usage = model.usage;
            } 

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * Concurrency.
             */
            public Builder concurrency(Integer concurrency) {
                this.concurrency = concurrency;
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
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
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
             * PhoneNumberDescription.
             */
            public Builder phoneNumberDescription(String phoneNumberDescription) {
                this.phoneNumberDescription = phoneNumberDescription;
                return this;
            }

            /**
             * PhoneNumberId.
             */
            public Builder phoneNumberId(String phoneNumberId) {
                this.phoneNumberId = phoneNumberId;
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
             * ServiceTag.
             */
            public Builder serviceTag(String serviceTag) {
                this.serviceTag = serviceTag;
                return this;
            }

            /**
             * SkillGroupIdList.
             */
            public Builder skillGroupIdList(java.util.List<String> skillGroupIdList) {
                this.skillGroupIdList = skillGroupIdList;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * Usage.
             */
            public Builder usage(String usage) {
                this.usage = usage;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPhoneTagsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPhoneTagsResponseBody</p>
     */
    public static class PhoneNumbers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PhoneNumbers(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PhoneNumbers create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
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
            private java.util.List<List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PhoneNumbers model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * List.
             */
            public Builder list(java.util.List<List> list) {
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

            public PhoneNumbers build() {
                return new PhoneNumbers(this);
            } 

        } 

    }
}
