// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDialogFlowRequest} extends {@link RequestModel}
 *
 * <p>DescribeDialogFlowRequest</p>
 */
public class DescribeDialogFlowRequest extends Request {
    @Query
    @NameInMap("DialogId")
    @Validation(required = true)
    private Long dialogId;

    private DescribeDialogFlowRequest(Builder builder) {
        super(builder);
        this.dialogId = builder.dialogId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDialogFlowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dialogId
     */
    public Long getDialogId() {
        return this.dialogId;
    }

    public static final class Builder extends Request.Builder<DescribeDialogFlowRequest, Builder> {
        private Long dialogId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDialogFlowRequest response) {
            super(response);
            this.dialogId = response.dialogId;
        } 

        /**
         * DialogId.
         */
        public Builder dialogId(Long dialogId) {
            this.putQueryParameter("DialogId", dialogId);
            this.dialogId = dialogId;
            return this;
        }

        @Override
        public DescribeDialogFlowRequest build() {
            return new DescribeDialogFlowRequest(this);
        } 

    } 

}
