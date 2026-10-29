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
    @com.aliyun.core.annotation.NameInMap("Locale")
    private String locale;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SeatType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String seatType;

    private BatchAssignSeatsRequest(Builder builder) {
        super(builder);
        this.accountIds = builder.accountIds;
        this.locale = builder.locale;
        this.seatType = builder.seatType;
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
     * @return locale
     */
    public String getLocale() {
        return this.locale;
    }

    /**
     * @return seatType
     */
    public String getSeatType() {
        return this.seatType;
    }

    public static final class Builder extends Request.Builder<BatchAssignSeatsRequest, Builder> {
        private java.util.List<String> accountIds; 
        private String locale; 
        private String seatType; 

        private Builder() {
            super();
        } 

        private Builder(BatchAssignSeatsRequest request) {
            super(request);
            this.accountIds = request.accountIds;
            this.locale = request.locale;
            this.seatType = request.seatType;
        } 

        /**
         * <p>The list of target member IDs.</p>
         */
        public Builder accountIds(java.util.List<String> accountIds) {
            this.putQueryParameter("AccountIds", accountIds);
            this.accountIds = accountIds;
            return this;
        }

        /**
         * <p>The locale. Valid values: zh-CN and en-US.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder locale(String locale) {
            this.putQueryParameter("Locale", locale);
            this.locale = locale;
            return this;
        }

        /**
         * <p>The seat type. Valid values:</p>
         * <ul>
         * <li>standard: Standard seat.</li>
         * <li>pro: Pro seat.</li>
         * <li>max: Max seat.</li>
         * </ul>
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

        @Override
        public BatchAssignSeatsRequest build() {
            return new BatchAssignSeatsRequest(this);
        } 

    } 

}
