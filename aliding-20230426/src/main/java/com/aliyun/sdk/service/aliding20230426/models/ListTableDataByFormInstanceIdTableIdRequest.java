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
 * {@link ListTableDataByFormInstanceIdTableIdRequest} extends {@link RequestModel}
 *
 * <p>ListTableDataByFormInstanceIdTableIdRequest</p>
 */
public class ListTableDataByFormInstanceIdTableIdRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FormInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String formInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FormUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String formUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String systemToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TableFieldId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableFieldId;

    private ListTableDataByFormInstanceIdTableIdRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.appType = builder.appType;
        this.formInstanceId = builder.formInstanceId;
        this.formUuid = builder.formUuid;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.systemToken = builder.systemToken;
        this.tableFieldId = builder.tableFieldId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTableDataByFormInstanceIdTableIdRequest create() {
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
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return formInstanceId
     */
    public String getFormInstanceId() {
        return this.formInstanceId;
    }

    /**
     * @return formUuid
     */
    public String getFormUuid() {
        return this.formUuid;
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
     * @return systemToken
     */
    public String getSystemToken() {
        return this.systemToken;
    }

    /**
     * @return tableFieldId
     */
    public String getTableFieldId() {
        return this.tableFieldId;
    }

    public static final class Builder extends Request.Builder<ListTableDataByFormInstanceIdTableIdRequest, Builder> {
        private AccountContext accountContext; 
        private String appType; 
        private String formInstanceId; 
        private String formUuid; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String systemToken; 
        private String tableFieldId; 

        private Builder() {
            super();
        } 

        private Builder(ListTableDataByFormInstanceIdTableIdRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.appType = request.appType;
            this.formInstanceId = request.formInstanceId;
            this.formUuid = request.formUuid;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.systemToken = request.systemToken;
            this.tableFieldId = request.tableFieldId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>APP_PBKT0xxx</p>
         */
        public Builder appType(String appType) {
            this.putBodyParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FORM_PBKT0xxx</p>
         */
        public Builder formInstanceId(String formInstanceId) {
            this.putBodyParameter("FormInstanceId", formInstanceId);
            this.formInstanceId = formInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FORM-xxxxx</p>
         */
        public Builder formUuid(String formUuid) {
            this.putBodyParameter("FormUuid", formUuid);
            this.formUuid = formUuid;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hexxxx</p>
         */
        public Builder systemToken(String systemToken) {
            this.putBodyParameter("SystemToken", systemToken);
            this.systemToken = systemToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        public Builder tableFieldId(String tableFieldId) {
            this.putBodyParameter("TableFieldId", tableFieldId);
            this.tableFieldId = tableFieldId;
            return this;
        }

        @Override
        public ListTableDataByFormInstanceIdTableIdRequest build() {
            return new ListTableDataByFormInstanceIdTableIdRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListTableDataByFormInstanceIdTableIdRequest} extends {@link TeaModel}
     *
     * <p>ListTableDataByFormInstanceIdTableIdRequest</p>
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
}
