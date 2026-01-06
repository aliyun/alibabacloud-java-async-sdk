// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link GetDingtalkMeetingListRequest} extends {@link RequestModel}
 *
 * <p>GetDingtalkMeetingListRequest</p>
 */
public class GetDingtalkMeetingListRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endTime")
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("orgId")
    private String orgId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("roomCode")
    private String roomCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("roomName")
    private String roomName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("startTime")
    private Long startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workNo")
    private String workNo;

    private GetDingtalkMeetingListRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.tenantContext = builder.tenantContext;
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.orgId = builder.orgId;
        this.pageSize = builder.pageSize;
        this.roomCode = builder.roomCode;
        this.roomName = builder.roomName;
        this.startTime = builder.startTime;
        this.workNo = builder.workNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDingtalkMeetingListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountContext
     */
    public AccountContext getAccountContext() {
        return this.accountContext;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return roomCode
     */
    public String getRoomCode() {
        return this.roomCode;
    }

    /**
     * @return roomName
     */
    public String getRoomName() {
        return this.roomName;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return workNo
     */
    public String getWorkNo() {
        return this.workNo;
    }

    public static final class Builder extends Request.Builder<GetDingtalkMeetingListRequest, Builder> {
        private AccountContext accountContext; 
        private TenantContext tenantContext; 
        private Integer currentPage; 
        private Long endTime; 
        private String orgId; 
        private Integer pageSize; 
        private String roomCode; 
        private String roomName; 
        private Long startTime; 
        private String workNo; 

        private Builder() {
            super();
        } 

        private Builder(GetDingtalkMeetingListRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.tenantContext = request.tenantContext;
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.orgId = request.orgId;
            this.pageSize = request.pageSize;
            this.roomCode = request.roomCode;
            this.roomName = request.roomName;
            this.startTime = request.startTime;
            this.workNo = request.workNo;
        } 

        /**
         * AccountContext.
         */
        public Builder accountContext(AccountContext accountContext) {
            String accountContextShrink = shrink(accountContext, "AccountContext", "json");
            this.putHeaderParameter("AccountContext", accountContextShrink);
            this.accountContext = accountContext;
            return this;
        }

        /**
         * TenantContext.
         */
        public Builder tenantContext(TenantContext tenantContext) {
            String tenantContextShrink = shrink(tenantContext, "TenantContext", "json");
            this.putBodyParameter("TenantContext", tenantContextShrink);
            this.tenantContext = tenantContext;
            return this;
        }

        /**
         * currentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("currentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * orgId.
         */
        public Builder orgId(String orgId) {
            this.putBodyParameter("orgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * roomCode.
         */
        public Builder roomCode(String roomCode) {
            this.putBodyParameter("roomCode", roomCode);
            this.roomCode = roomCode;
            return this;
        }

        /**
         * roomName.
         */
        public Builder roomName(String roomName) {
            this.putBodyParameter("roomName", roomName);
            this.roomName = roomName;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * workNo.
         */
        public Builder workNo(String workNo) {
            this.putBodyParameter("workNo", workNo);
            this.workNo = workNo;
            return this;
        }

        @Override
        public GetDingtalkMeetingListRequest build() {
            return new GetDingtalkMeetingListRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetDingtalkMeetingListRequest} extends {@link TeaModel}
     *
     * <p>GetDingtalkMeetingListRequest</p>
     */
    public static class AccountContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String accountId;

        private AccountContext(Builder builder) {
            this.accountId = builder.accountId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountContext create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        public static final class Builder {
            private String accountId; 

            private Builder() {
            } 

            private Builder(AccountContext model) {
                this.accountId = model.accountId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>012345</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            public AccountContext build() {
                return new AccountContext(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDingtalkMeetingListRequest} extends {@link TeaModel}
     *
     * <p>GetDingtalkMeetingListRequest</p>
     */
    public static class TenantContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tenantId")
        private String tenantId;

        private TenantContext(Builder builder) {
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantContext create() {
            return builder().build();
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String tenantId; 

            private Builder() {
            } 

            private Builder(TenantContext model) {
                this.tenantId = model.tenantId;
            } 

            /**
             * tenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public TenantContext build() {
                return new TenantContext(this);
            } 

        } 

    }
}
