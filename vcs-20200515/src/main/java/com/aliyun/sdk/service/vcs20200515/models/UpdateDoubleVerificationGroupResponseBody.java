// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDoubleVerificationGroupResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateDoubleVerificationGroupResponseBody</p>
 */
public class UpdateDoubleVerificationGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DoubleVerificationGroup")
    private DoubleVerificationGroup doubleVerificationGroup;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateDoubleVerificationGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.doubleVerificationGroup = builder.doubleVerificationGroup;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDoubleVerificationGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return doubleVerificationGroup
     */
    public DoubleVerificationGroup getDoubleVerificationGroup() {
        return this.doubleVerificationGroup;
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
        private DoubleVerificationGroup doubleVerificationGroup; 
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
         * DoubleVerificationGroup.
         */
        public Builder doubleVerificationGroup(DoubleVerificationGroup doubleVerificationGroup) {
            this.doubleVerificationGroup = doubleVerificationGroup;
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

        public UpdateDoubleVerificationGroupResponseBody build() {
            return new UpdateDoubleVerificationGroupResponseBody(this);
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
    public static class DoubleVerificationGroup extends TeaModel {
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

        private DoubleVerificationGroup(Builder builder) {
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

        public static DoubleVerificationGroup create() {
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

            public DoubleVerificationGroup build() {
                return new DoubleVerificationGroup(this);
            } 

        } 

    }
}
