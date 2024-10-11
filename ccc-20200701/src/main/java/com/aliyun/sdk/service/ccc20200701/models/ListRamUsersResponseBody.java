// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListRamUsersResponseBody} extends {@link TeaModel}
 *
 * <p>ListRamUsersResponseBody</p>
 */
public class ListRamUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List < String > params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListRamUsersResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.params = builder.params;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRamUsersResponseBody create() {
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
     * @return params
     */
    public java.util.List < String > getParams() {
        return this.params;
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
        private java.util.List < String > params; 
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
         * Params.
         */
        public Builder params(java.util.List < String > params) {
            this.params = params;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListRamUsersResponseBody build() {
            return new ListRamUsersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRamUsersResponseBody} extends {@link TeaModel}
     *
     * <p>ListRamUsersResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunUid")
        private Long aliyunUid;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("LoginName")
        private String loginName;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("Primary")
        private Boolean primary;

        @com.aliyun.core.annotation.NameInMap("RamId")
        private String ramId;

        private List(Builder builder) {
            this.aliyunUid = builder.aliyunUid;
            this.displayName = builder.displayName;
            this.email = builder.email;
            this.loginName = builder.loginName;
            this.mobile = builder.mobile;
            this.primary = builder.primary;
            this.ramId = builder.ramId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return aliyunUid
         */
        public Long getAliyunUid() {
            return this.aliyunUid;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return loginName
         */
        public String getLoginName() {
            return this.loginName;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return primary
         */
        public Boolean getPrimary() {
            return this.primary;
        }

        /**
         * @return ramId
         */
        public String getRamId() {
            return this.ramId;
        }

        public static final class Builder {
            private Long aliyunUid; 
            private String displayName; 
            private String email; 
            private String loginName; 
            private String mobile; 
            private Boolean primary; 
            private String ramId; 

            /**
             * AliyunUid.
             */
            public Builder aliyunUid(Long aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * LoginName.
             */
            public Builder loginName(String loginName) {
                this.loginName = loginName;
                return this;
            }

            /**
             * Mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * Primary.
             */
            public Builder primary(Boolean primary) {
                this.primary = primary;
                return this;
            }

            /**
             * RamId.
             */
            public Builder ramId(String ramId) {
                this.ramId = ramId;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRamUsersResponseBody} extends {@link TeaModel}
     *
     * <p>ListRamUsersResponseBody</p>
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
