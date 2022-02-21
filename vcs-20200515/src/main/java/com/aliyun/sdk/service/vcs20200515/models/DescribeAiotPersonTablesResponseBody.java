// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAiotPersonTablesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAiotPersonTablesResponseBody</p>
 */
public class DescribeAiotPersonTablesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PersonTableList")
    private java.util.List < PersonTableList> personTableList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAiotPersonTablesResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.personTableList = builder.personTableList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAiotPersonTablesResponseBody create() {
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
     * @return personTableList
     */
    public java.util.List < PersonTableList> getPersonTableList() {
        return this.personTableList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private java.util.List < PersonTableList> personTableList; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * PersonTableList.
         */
        public Builder personTableList(java.util.List < PersonTableList> personTableList) {
            this.personTableList = personTableList;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAiotPersonTablesResponseBody build() {
            return new DescribeAiotPersonTablesResponseBody(this);
        } 

    } 

    public static class PersonTableList extends TeaModel {
        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("FaceNum")
        private Long faceNum;

        @NameInMap("LastChange")
        private String lastChange;

        @NameInMap("Name")
        private String name;

        @NameInMap("PersonNum")
        private Long personNum;

        @NameInMap("PersonTableId")
        private String personTableId;

        @NameInMap("TotalPersonNum")
        private Long totalPersonNum;

        @NameInMap("Type")
        private Long type;

        @NameInMap("VerificationModelList")
        private java.util.List < Long > verificationModelList;

        private PersonTableList(Builder builder) {
            this.deviceId = builder.deviceId;
            this.faceNum = builder.faceNum;
            this.lastChange = builder.lastChange;
            this.name = builder.name;
            this.personNum = builder.personNum;
            this.personTableId = builder.personTableId;
            this.totalPersonNum = builder.totalPersonNum;
            this.type = builder.type;
            this.verificationModelList = builder.verificationModelList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PersonTableList create() {
            return builder().build();
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return faceNum
         */
        public Long getFaceNum() {
            return this.faceNum;
        }

        /**
         * @return lastChange
         */
        public String getLastChange() {
            return this.lastChange;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return personNum
         */
        public Long getPersonNum() {
            return this.personNum;
        }

        /**
         * @return personTableId
         */
        public String getPersonTableId() {
            return this.personTableId;
        }

        /**
         * @return totalPersonNum
         */
        public Long getTotalPersonNum() {
            return this.totalPersonNum;
        }

        /**
         * @return type
         */
        public Long getType() {
            return this.type;
        }

        /**
         * @return verificationModelList
         */
        public java.util.List < Long > getVerificationModelList() {
            return this.verificationModelList;
        }

        public static final class Builder {
            private String deviceId; 
            private Long faceNum; 
            private String lastChange; 
            private String name; 
            private Long personNum; 
            private String personTableId; 
            private Long totalPersonNum; 
            private Long type; 
            private java.util.List < Long > verificationModelList; 

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * FaceNum.
             */
            public Builder faceNum(Long faceNum) {
                this.faceNum = faceNum;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PersonNum.
             */
            public Builder personNum(Long personNum) {
                this.personNum = personNum;
                return this;
            }

            /**
             * PersonTableId.
             */
            public Builder personTableId(String personTableId) {
                this.personTableId = personTableId;
                return this;
            }

            /**
             * TotalPersonNum.
             */
            public Builder totalPersonNum(Long totalPersonNum) {
                this.totalPersonNum = totalPersonNum;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Long type) {
                this.type = type;
                return this;
            }

            /**
             * VerificationModelList.
             */
            public Builder verificationModelList(java.util.List < Long > verificationModelList) {
                this.verificationModelList = verificationModelList;
                return this;
            }

            public PersonTableList build() {
                return new PersonTableList(this);
            } 

        } 

    }
}
