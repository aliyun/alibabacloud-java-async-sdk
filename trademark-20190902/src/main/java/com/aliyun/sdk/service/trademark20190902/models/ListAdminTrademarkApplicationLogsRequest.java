// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAdminTrademarkApplicationLogsRequest} extends {@link RequestModel}
 *
 * <p>ListAdminTrademarkApplicationLogsRequest</p>
 */
public class ListAdminTrademarkApplicationLogsRequest extends Request {
    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    private ListAdminTrademarkApplicationLogsRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAdminTrademarkApplicationLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    public static final class Builder extends Request.Builder<ListAdminTrademarkApplicationLogsRequest, Builder> {
        private String bizId; 

        private Builder() {
            super();
        } 

        private Builder(ListAdminTrademarkApplicationLogsRequest request) {
            super(request);
            this.bizId = request.bizId;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        @Override
        public ListAdminTrademarkApplicationLogsRequest build() {
            return new ListAdminTrademarkApplicationLogsRequest(this);
        } 

    } 

}
