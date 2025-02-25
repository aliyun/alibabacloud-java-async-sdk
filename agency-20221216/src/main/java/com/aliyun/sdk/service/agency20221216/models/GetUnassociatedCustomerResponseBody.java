// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

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
 * {@link GetUnassociatedCustomerResponseBody} extends {@link TeaModel}
 *
 * <p>GetUnassociatedCustomerResponseBody</p>
 */
public class GetUnassociatedCustomerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("InviteInfoList")
    private InviteInfoList inviteInfoList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>Error Code, Candidate Value：</p>
         * <ul>
         * <li>200: OK</li>
         * <li>1109: System error</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>List of Invitation Information</p>
         */
        public Builder inviteInfoList(InviteInfoList inviteInfoList) {
            this.inviteInfoList = inviteInfoList;
            return this;
        }

        /**
         * <p>Message information</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Pagination Information</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>Request ID, Alibaba Cloud will track errors with this.</p>
         * 
         * <strong>example:</strong>
         * <p>23309219-4A34-589D-A3E0-9B2A3BFFD24F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Candidate Value: True/False, which indicates whether the current API call itself is successful. It does not guarantee the success of subsequent business operations.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetUnassociatedCustomerResponseBody build() {
            return new GetUnassociatedCustomerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUnassociatedCustomerResponseBody} extends {@link TeaModel}
     *
     * <p>GetUnassociatedCustomerResponseBody</p>
     */
    public static class InviteInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountNickname")
        private String accountNickname;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("InviteId")
        private Long inviteId;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The name of Customer who are to be invited.</p>
             * 
             * <strong>example:</strong>
             * <p>My Client</p>
             */
            public Builder accountNickname(String accountNickname) {
                this.accountNickname = accountNickname;
                return this;
            }

            /**
             * <p>The Email of Customer who are to be invited.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:12345@qq.com">12345@qq.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>The time of email been sent out.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-10</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Invitation ID</p>
             * 
             * <strong>example:</strong>
             * <p>190</p>
             */
            public Builder inviteId(Long inviteId) {
                this.inviteId = inviteId;
                return this;
            }

            /**
             * <p>Invitation Status:</p>
             * <ul>
             * <li>0 No visit on registration URL</li>
             * <li>1 Successful Registration</li>
             * <li>2 Unsuccessful Registration</li>
             * <li>3 Registration URL have been visited, but no submitted sheet/ticket.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link GetUnassociatedCustomerResponseBody} extends {@link TeaModel}
     *
     * <p>GetUnassociatedCustomerResponseBody</p>
     */
    public static class InviteInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InviteInfo")
        private java.util.List<InviteInfo> inviteInfo;

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
        public java.util.List<InviteInfo> getInviteInfo() {
            return this.inviteInfo;
        }

        public static final class Builder {
            private java.util.List<InviteInfo> inviteInfo; 

            /**
             * InviteInfo.
             */
            public Builder inviteInfo(java.util.List<InviteInfo> inviteInfo) {
                this.inviteInfo = inviteInfo;
                return this;
            }

            public InviteInfoList build() {
                return new InviteInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetUnassociatedCustomerResponseBody} extends {@link TeaModel}
     *
     * <p>GetUnassociatedCustomerResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
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
             * <p>Pagination, current page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * <p>Pagination, record number on each page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Pagination, page volume in total.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
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
