// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvoiceDeleteRequest} extends {@link RequestModel}
 *
 * <p>InvoiceDeleteRequest</p>
 */
public class InvoiceDeleteRequest extends Request {
    @Query
    @NameInMap("third_part_id")
    @Validation(required = true)
    private String thirdPartId;

    @Body
    @NameInMap("user_id")
    private String userId;

    private InvoiceDeleteRequest(Builder builder) {
        super(builder);
        this.thirdPartId = builder.thirdPartId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvoiceDeleteRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return thirdPartId
     */
    public String getThirdPartId() {
        return this.thirdPartId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<InvoiceDeleteRequest, Builder> {
        private String thirdPartId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(InvoiceDeleteRequest request) {
            super(request);
            this.thirdPartId = request.thirdPartId;
            this.userId = request.userId;
        } 

        /**
         * 第三方发票id
         */
        public Builder thirdPartId(String thirdPartId) {
            this.putQueryParameter("third_part_id", thirdPartId);
            this.thirdPartId = thirdPartId;
            return this;
        }

        /**
         * 无userId时传缺省值superAdmin
         */
        public Builder userId(String userId) {
            this.putBodyParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public InvoiceDeleteRequest build() {
            return new InvoiceDeleteRequest(this);
        } 

    } 

}
