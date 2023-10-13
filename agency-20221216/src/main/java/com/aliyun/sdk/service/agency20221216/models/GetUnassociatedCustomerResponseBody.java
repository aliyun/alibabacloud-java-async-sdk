// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUnassociatedCustomerResponseBody} extends {@link TeaModel}
 *
 * <p>GetUnassociatedCustomerResponseBody</p>
 */
public class GetUnassociatedCustomerResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("InviteInfoList")
    private InviteInfoList inviteInfoList;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetUnassociatedCustomerResponseBody(Builder builder) {
        this.code = builder.code;
        this.inviteInfoList = builder.inviteInfoList;
        this.message = builder.message;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUnassociatedCustomerResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return inviteInfoList
     */
    public InviteInfoList getInviteInfoList() {
        return this.inviteInfoList;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
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
        private InviteInfoList inviteInfoList; 
        private String message; 
        private PageInfo pageInfo; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * InviteInfoList.
         */
        public Builder inviteInfoList(InviteInfoList inviteInfoList) {
            this.inviteInfoList = inviteInfoList;
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
         * PageInfo.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
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

        public GetUnassociatedCustomerResponseBody build() {
            return new GetUnassociatedCustomerResponseBody(this);
        } 

    } 

    public static class InviteInfo extends TeaModel {
        @NameInMap("AccountNickname")
        private String accountNickname;

        @NameInMap("Email")
        private String email;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("InviteId")
        private Long inviteId;

        @NameInMap("Status")
        private Integer status;

        private InviteInfo(Builder builder) {
            this.accountNickname = builder.accountNickname;
            this.email = builder.email;
            this.gmtCreate = builder.gmtCreate;
            this.inviteId = builder.inviteId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InviteInfo create() {
            return builder().build();
        }

        /**
         * @return accountNickname
         */
        public String getAccountNickname() {
            return this.accountNickname;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return inviteId
         */
        public Long getInviteId() {
            return this.inviteId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String accountNickname; 
            private String email; 
            private String gmtCreate; 
            private Long inviteId; 
            private Integer status; 

            /**
             * AccountNickname.
             */
            public Builder accountNickname(String accountNickname) {
                this.accountNickname = accountNickname;
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
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * InviteId.
             */
            public Builder inviteId(Long inviteId) {
                this.inviteId = inviteId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public InviteInfo build() {
                return new InviteInfo(this);
            } 

        } 

    }
    public static class InviteInfoList extends TeaModel {
        @NameInMap("InviteInfo")
        private java.util.List < InviteInfo> inviteInfo;

        private InviteInfoList(Builder builder) {
            this.inviteInfo = builder.inviteInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InviteInfoList create() {
            return builder().build();
        }

        /**
         * @return inviteInfo
         */
        public java.util.List < InviteInfo> getInviteInfo() {
            return this.inviteInfo;
        }

        public static final class Builder {
            private java.util.List < InviteInfo> inviteInfo; 

            /**
             * InviteInfo.
             */
            public Builder inviteInfo(java.util.List < InviteInfo> inviteInfo) {
                this.inviteInfo = inviteInfo;
                return this;
            }

            public InviteInfoList build() {
                return new InviteInfoList(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("Page")
        private Integer page;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Total")
        private Integer total;

        private PageInfo(Builder builder) {
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer page; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * Page.
             */
            public Builder page(Integer page) {
                this.page = page;
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
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
