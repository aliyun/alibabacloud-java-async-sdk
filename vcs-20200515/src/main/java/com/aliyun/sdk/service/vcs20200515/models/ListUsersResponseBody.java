// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUsersResponseBody} extends {@link TeaModel}
 *
 * <p>ListUsersResponseBody</p>
 */
public class ListUsersResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListUsersResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUsersResponseBody create() {
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

        public ListUsersResponseBody build() {
            return new ListUsersResponseBody(this);
        } 

    } 

    public static class Records extends TeaModel {
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

        @NameInMap("MatchingRate")
        private String matchingRate;

        @NameInMap("PersonId")
        private String personId;

        @NameInMap("UserGroupId")
        private Integer userGroupId;

        @NameInMap("UserId")
        private Integer userId;

        @NameInMap("UserName")
        private String userName;

        private Records(Builder builder) {
            this.age = builder.age;
            this.attachment = builder.attachment;
            this.bizId = builder.bizId;
            this.faceImageUrl = builder.faceImageUrl;
            this.gender = builder.gender;
            this.idNumber = builder.idNumber;
            this.isvSubId = builder.isvSubId;
            this.matchingRate = builder.matchingRate;
            this.personId = builder.personId;
            this.userGroupId = builder.userGroupId;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
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
         * @return matchingRate
         */
        public String getMatchingRate() {
            return this.matchingRate;
        }

        /**
         * @return personId
         */
        public String getPersonId() {
            return this.personId;
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
            private String age; 
            private String attachment; 
            private String bizId; 
            private String faceImageUrl; 
            private String gender; 
            private String idNumber; 
            private String isvSubId; 
            private String matchingRate; 
            private String personId; 
            private Integer userGroupId; 
            private Integer userId; 
            private String userName; 

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
             * MatchingRate.
             */
            public Builder matchingRate(String matchingRate) {
                this.matchingRate = matchingRate;
                return this;
            }

            /**
             * PersonId.
             */
            public Builder personId(String personId) {
                this.personId = personId;
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

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNumber")
        private Long pageNumber;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("Records")
        private java.util.List < Records> records;

        @NameInMap("Success")
        private Long success;

        @NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.records = builder.records;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return records
         */
        public java.util.List < Records> getRecords() {
            return this.records;
        }

        /**
         * @return success
         */
        public Long getSuccess() {
            return this.success;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long pageNumber; 
            private Long pageSize; 
            private java.util.List < Records> records; 
            private Long success; 
            private Long total; 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
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
             * Records.
             */
            public Builder records(java.util.List < Records> records) {
                this.records = records;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
