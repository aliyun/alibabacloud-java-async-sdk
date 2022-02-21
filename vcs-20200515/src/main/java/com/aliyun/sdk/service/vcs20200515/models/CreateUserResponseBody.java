// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserResponseBody} extends {@link TeaModel}
 *
 * <p>CreateUserResponseBody</p>
 */
public class CreateUserResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private CreateUserResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserResponseBody create() {
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

        public CreateUserResponseBody build() {
            return new CreateUserResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("Age")
        private String age;

        @NameInMap("Attachment")
        private String attachment;

        @NameInMap("BizId")
        private String bizId;

        @NameInMap("FaceImageUrl")
        private String faceImageUrl;

        @NameInMap("Gender")
        private String gender;

        @NameInMap("IdNumber")
        private String idNumber;

        @NameInMap("IsvSubId")
        private String isvSubId;

        @NameInMap("PhoneNo")
        private String phoneNo;

        @NameInMap("PlateNo")
        private String plateNo;

        @NameInMap("UserGroupId")
        private Integer userGroupId;

        @NameInMap("UserId")
        private Integer userId;

        @NameInMap("UserName")
        private String userName;

        private Data(Builder builder) {
            this.address = builder.address;
            this.age = builder.age;
            this.attachment = builder.attachment;
            this.bizId = builder.bizId;
            this.faceImageUrl = builder.faceImageUrl;
            this.gender = builder.gender;
            this.idNumber = builder.idNumber;
            this.isvSubId = builder.isvSubId;
            this.phoneNo = builder.phoneNo;
            this.plateNo = builder.plateNo;
            this.userGroupId = builder.userGroupId;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return age
         */
        public String getAge() {
            return this.age;
        }

        /**
         * @return attachment
         */
        public String getAttachment() {
            return this.attachment;
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return faceImageUrl
         */
        public String getFaceImageUrl() {
            return this.faceImageUrl;
        }

        /**
         * @return gender
         */
        public String getGender() {
            return this.gender;
        }

        /**
         * @return idNumber
         */
        public String getIdNumber() {
            return this.idNumber;
        }

        /**
         * @return isvSubId
         */
        public String getIsvSubId() {
            return this.isvSubId;
        }

        /**
         * @return phoneNo
         */
        public String getPhoneNo() {
            return this.phoneNo;
        }

        /**
         * @return plateNo
         */
        public String getPlateNo() {
            return this.plateNo;
        }

        /**
         * @return userGroupId
         */
        public Integer getUserGroupId() {
            return this.userGroupId;
        }

        /**
         * @return userId
         */
        public Integer getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String address; 
            private String age; 
            private String attachment; 
            private String bizId; 
            private String faceImageUrl; 
            private String gender; 
            private String idNumber; 
            private String isvSubId; 
            private String phoneNo; 
            private String plateNo; 
            private Integer userGroupId; 
            private Integer userId; 
            private String userName; 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * Age.
             */
            public Builder age(String age) {
                this.age = age;
                return this;
            }

            /**
             * Attachment.
             */
            public Builder attachment(String attachment) {
                this.attachment = attachment;
                return this;
            }

            /**
             * BizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * FaceImageUrl.
             */
            public Builder faceImageUrl(String faceImageUrl) {
                this.faceImageUrl = faceImageUrl;
                return this;
            }

            /**
             * Gender.
             */
            public Builder gender(String gender) {
                this.gender = gender;
                return this;
            }

            /**
             * IdNumber.
             */
            public Builder idNumber(String idNumber) {
                this.idNumber = idNumber;
                return this;
            }

            /**
             * IsvSubId.
             */
            public Builder isvSubId(String isvSubId) {
                this.isvSubId = isvSubId;
                return this;
            }

            /**
             * PhoneNo.
             */
            public Builder phoneNo(String phoneNo) {
                this.phoneNo = phoneNo;
                return this;
            }

            /**
             * PlateNo.
             */
            public Builder plateNo(String plateNo) {
                this.plateNo = plateNo;
                return this;
            }

            /**
             * UserGroupId.
             */
            public Builder userGroupId(Integer userGroupId) {
                this.userGroupId = userGroupId;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(Integer userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
