// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

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
 * {@link TicketQueryScenicRequest} extends {@link RequestModel}
 *
 * <p>TicketQueryScenicRequest</p>
 */
public class TicketQueryScenicRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long accountNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScenicId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long scenicId;

    private TicketQueryScenicRequest(Builder builder) {
        super(builder);
        this.accountNo = builder.accountNo;
        this.scenicId = builder.scenicId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TicketQueryScenicRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountNo
     */
    public Long getAccountNo() {
        return this.accountNo;
    }

    /**
     * @return scenicId
     */
    public Long getScenicId() {
        return this.scenicId;
    }

    public static final class Builder extends Request.Builder<TicketQueryScenicRequest, Builder> {
        private Long accountNo; 
        private Long scenicId; 

        private Builder() {
            super();
        } 

        private Builder(TicketQueryScenicRequest request) {
            super(request);
            this.accountNo = request.accountNo;
            this.scenicId = request.scenicId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder accountNo(Long accountNo) {
            this.putBodyParameter("AccountNo", accountNo);
            this.accountNo = accountNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder scenicId(Long scenicId) {
            this.putBodyParameter("ScenicId", scenicId);
            this.scenicId = scenicId;
            return this;
        }

        @Override
        public TicketQueryScenicRequest build() {
            return new TicketQueryScenicRequest(this);
        } 

    } 

}
