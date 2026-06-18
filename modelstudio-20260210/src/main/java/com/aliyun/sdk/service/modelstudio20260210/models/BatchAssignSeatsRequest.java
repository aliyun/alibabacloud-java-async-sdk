// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link BatchAssignSeatsRequest} extends {@link RequestModel}
 *
 * <p>BatchAssignSeatsRequest</p>
 */
public class BatchAssignSeatsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountIds")
    private java.util.List<String> accountIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountIdsStr")
    private String accountIdsStr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallerUacAccountId")
    private String callerUacAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Locale")
    private String locale;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SeatType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String seatType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private BatchAssignSeatsRequest(Builder builder) {
        super(builder);
        this.accountIds = builder.accountIds;
        this.accountIdsStr = builder.accountIdsStr;
        this.callerUacAccountId = builder.callerUacAccountId;
        this.locale = builder.locale;
        this.namespaceId = builder.namespaceId;
        this.seatType = builder.seatType;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchAssignSeatsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountIds
     */
    public java.util.List<String> getAccountIds() {
        return this.accountIds;
    }

    /**
     * @return accountIdsStr
     */
    public String getAccountIdsStr() {
        return this.accountIdsStr;
    }

    /**
     * @return callerUacAccountId
     */
    public String getCallerUacAccountId() {
        return this.callerUacAccountId;
    }

    /**
     * @return locale
     */
    public String getLocale() {
        return this.locale;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return seatType
     */
    public String getSeatType() {
        return this.seatType;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<BatchAssignSeatsRequest, Builder> {
        private java.util.List<String> accountIds; 
        private String accountIdsStr; 
        private String callerUacAccountId; 
        private String locale; 
        private String namespaceId; 
        private String seatType; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(BatchAssignSeatsRequest request) {
            super(request);
            this.accountIds = request.accountIds;
            this.accountIdsStr = request.accountIdsStr;
            this.callerUacAccountId = request.callerUacAccountId;
            this.locale = request.locale;
            this.namespaceId = request.namespaceId;
            this.seatType = request.seatType;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * AccountIds.
         */
        public Builder accountIds(java.util.List<String> accountIds) {
            this.putQueryParameter("AccountIds", accountIds);
            this.accountIds = accountIds;
            return this;
        }

        /**
         * AccountIdsStr.
         */
        public Builder accountIdsStr(String accountIdsStr) {
            this.putQueryParameter("AccountIdsStr", accountIdsStr);
            this.accountIdsStr = accountIdsStr;
            return this;
        }

        /**
         * CallerUacAccountId.
         */
        public Builder callerUacAccountId(String callerUacAccountId) {
            this.putQueryParameter("CallerUacAccountId", callerUacAccountId);
            this.callerUacAccountId = callerUacAccountId;
            return this;
        }

        /**
         * Locale.
         */
        public Builder locale(String locale) {
            this.putQueryParameter("Locale", locale);
            this.locale = locale;
            return this;
        }

        /**
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        public Builder seatType(String seatType) {
            this.putQueryParameter("SeatType", seatType);
            this.seatType = seatType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws_123456789</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public BatchAssignSeatsRequest build() {
            return new BatchAssignSeatsRequest(this);
        } 

    } 

}
