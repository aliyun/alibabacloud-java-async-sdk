// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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

        private Builder() {
        } 

        private Builder(ListPhoneNumbersResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BA03159C-E808-4FF1-B27E-A61B6E888D7F</p>
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

            private Builder() {
            } 

            private Builder(SkillGroups model) {
                this.displayName = model.displayName;
                this.instanceId = model.instanceId;
                this.name = model.name;
                this.skillGroupId = model.skillGroupId;
            } 

            /**
             * <p>The display name of the skill group.</p>
             * 
             * <strong>example:</strong>
             * <p>测试技能组</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ccc-test</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the skill group.</p>
             * 
             * <strong>example:</strong>
             * <p>skillgroup</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The skill group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>skillgroup@ccc-test</p>
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
        private java.util.List<SkillGroups> skillGroups;

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
        public java.util.List<SkillGroups> getSkillGroups() {
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
            private java.util.List<SkillGroups> skillGroups; 
            private String tags; 
            private String usage; 
            private String userId; 

            private Builder() {
            } 

            private Builder(List model) {
                this.active = model.active;
                this.city = model.city;
                this.contactFlowId = model.contactFlowId;
                this.contactFlowName = model.contactFlowName;
                this.createTime = model.createTime;
                this.instanceId = model.instanceId;
                this.number = model.number;
                this.provider = model.provider;
                this.province = model.province;
                this.skillGroups = model.skillGroups;
                this.tags = model.tags;
                this.usage = model.usage;
                this.userId = model.userId;
            } 

            /**
             * <p>Indicates whether the number is active.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * <p>The city where the number is registered.</p>
             * 
             * <strong>example:</strong>
             * <p>乐山</p>
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * <p>The IVR contact flow ID associated with the phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>a3fb6c62-9b49-4942-ae5b-cf2abd4123ek</p>
             */
            public Builder contactFlowId(String contactFlowId) {
                this.contactFlowId = contactFlowId;
                return this;
            }

            /**
             * <p>Name of the IVR contact flow associated with the number.</p>
             * 
             * <strong>example:</strong>
             * <p>默认联系流</p>
             */
            public Builder contactFlowName(String contactFlowName) {
                this.contactFlowName = contactFlowName;
                return this;
            }

            /**
             * <p>The number creation time, which is the time when the number was associated with the instance, in Unix timestamp format with millisecond precision.</p>
             * 
             * <strong>example:</strong>
             * <p>1617958538000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ccc-test</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Number.</p>
             * 
             * <strong>example:</strong>
             * <p>08330011****</p>
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * <p>Number provider name.</p>
             * 
             * <strong>example:</strong>
             * <p>alicom</p>
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            /**
             * <p>The province where the number is registered.</p>
             * 
             * <strong>example:</strong>
             * <p>四川</p>
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * <p>The list of skill groups associated with the number.</p>
             */
            public Builder skillGroups(java.util.List<SkillGroups> skillGroups) {
                this.skillGroups = skillGroups;
                return this;
            }

            /**
             * <p>Business tags for the number, primarily used for labeling and extended business purposes. Ordinary customers do not need to concern themselves with this.</p>
             * 
             * <strong>example:</strong>
             * <p>M1</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The usage of the phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>Bidirection</p>
             */
            public Builder usage(String usage) {
                this.usage = usage;
                return this;
            }

            /**
             * <p>Agent ID. If this parameter is not empty, the number is dedicated to the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>agent@ccc-test</p>
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
        private java.util.List<List> list;

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

            private Builder(Data model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The phone number list.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The page number, ranging from 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The page size, ranging from 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total count.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
