// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribesDoubleVerificationGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribesDoubleVerificationGroupsResponseBody</p>
 */
public class DescribesDoubleVerificationGroupsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DoubleVerificationGroups")
    private DoubleVerificationGroups doubleVerificationGroups;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private DescribesDoubleVerificationGroupsResponseBody(Builder builder) {
        this.code = builder.code;
        this.doubleVerificationGroups = builder.doubleVerificationGroups;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribesDoubleVerificationGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return doubleVerificationGroups
     */
    public DoubleVerificationGroups getDoubleVerificationGroups() {
        return this.doubleVerificationGroups;
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
        private DoubleVerificationGroups doubleVerificationGroups; 
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
         * DoubleVerificationGroups.
         */
        public Builder doubleVerificationGroups(DoubleVerificationGroups doubleVerificationGroups) {
            this.doubleVerificationGroups = doubleVerificationGroups;
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribesDoubleVerificationGroupsResponseBody build() {
            return new DescribesDoubleVerificationGroupsResponseBody(this);
        } 

    } 

    public static class PersonIdList extends TeaModel {
        @NameInMap("PersonId")
        private String personId;

        @NameInMap("PersonTableId")
        private String personTableId;

        private PersonIdList(Builder builder) {
            this.personId = builder.personId;
            this.personTableId = builder.personTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PersonIdList create() {
            return builder().build();
        }

        /**
         * @return personId
         */
        public String getPersonId() {
            return this.personId;
        }

        /**
         * @return personTableId
         */
        public String getPersonTableId() {
            return this.personTableId;
        }

        public static final class Builder {
            private String personId; 
            private String personTableId; 

            /**
             * PersonId.
             */
            public Builder personId(String personId) {
                this.personId = personId;
                return this;
            }

            /**
             * PersonTableId.
             */
            public Builder personTableId(String personTableId) {
                this.personTableId = personTableId;
                return this;
            }

            public PersonIdList build() {
                return new PersonIdList(this);
            } 

        } 

    }
    public static class DoubleVerificationGroupList extends TeaModel {
        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("Enabled")
        private String enabled;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("Interval")
        private Long interval;

        @NameInMap("LastChange")
        private String lastChange;

        @NameInMap("MemberNumber")
        private Long memberNumber;

        @NameInMap("PersonIdList")
        private java.util.List < PersonIdList> personIdList;

        private DoubleVerificationGroupList(Builder builder) {
            this.deviceId = builder.deviceId;
            this.enabled = builder.enabled;
            this.groupId = builder.groupId;
            this.interval = builder.interval;
            this.lastChange = builder.lastChange;
            this.memberNumber = builder.memberNumber;
            this.personIdList = builder.personIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DoubleVerificationGroupList create() {
            return builder().build();
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return enabled
         */
        public String getEnabled() {
            return this.enabled;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return interval
         */
        public Long getInterval() {
            return this.interval;
        }

        /**
         * @return lastChange
         */
        public String getLastChange() {
            return this.lastChange;
        }

        /**
         * @return memberNumber
         */
        public Long getMemberNumber() {
            return this.memberNumber;
        }

        /**
         * @return personIdList
         */
        public java.util.List < PersonIdList> getPersonIdList() {
            return this.personIdList;
        }

        public static final class Builder {
            private String deviceId; 
            private String enabled; 
            private String groupId; 
            private Long interval; 
            private String lastChange; 
            private Long memberNumber; 
            private java.util.List < PersonIdList> personIdList; 

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(String enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * Interval.
             */
            public Builder interval(Long interval) {
                this.interval = interval;
                return this;
            }

            /**
             * LastChange.
             */
            public Builder lastChange(String lastChange) {
                this.lastChange = lastChange;
                return this;
            }

            /**
             * MemberNumber.
             */
            public Builder memberNumber(Long memberNumber) {
                this.memberNumber = memberNumber;
                return this;
            }

            /**
             * PersonIdList.
             */
            public Builder personIdList(java.util.List < PersonIdList> personIdList) {
                this.personIdList = personIdList;
                return this;
            }

            public DoubleVerificationGroupList build() {
                return new DoubleVerificationGroupList(this);
            } 

        } 

    }
    public static class DoubleVerificationGroups extends TeaModel {
        @NameInMap("DoubleVerificationGroupList")
        private java.util.List < DoubleVerificationGroupList> doubleVerificationGroupList;

        @NameInMap("PageNum")
        private Long pageNum;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("TotalNum")
        private Long totalNum;

        private DoubleVerificationGroups(Builder builder) {
            this.doubleVerificationGroupList = builder.doubleVerificationGroupList;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.totalNum = builder.totalNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DoubleVerificationGroups create() {
            return builder().build();
        }

        /**
         * @return doubleVerificationGroupList
         */
        public java.util.List < DoubleVerificationGroupList> getDoubleVerificationGroupList() {
            return this.doubleVerificationGroupList;
        }

        /**
         * @return pageNum
         */
        public Long getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalNum
         */
        public Long getTotalNum() {
            return this.totalNum;
        }

        public static final class Builder {
            private java.util.List < DoubleVerificationGroupList> doubleVerificationGroupList; 
            private Long pageNum; 
            private Long pageSize; 
            private Long totalNum; 

            /**
             * DoubleVerificationGroupList.
             */
            public Builder doubleVerificationGroupList(java.util.List < DoubleVerificationGroupList> doubleVerificationGroupList) {
                this.doubleVerificationGroupList = doubleVerificationGroupList;
                return this;
            }

            /**
             * PageNum.
             */
            public Builder pageNum(Long pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalNum.
             */
            public Builder totalNum(Long totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            public DoubleVerificationGroups build() {
                return new DoubleVerificationGroups(this);
            } 

        } 

    }
}
