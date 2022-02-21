// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TestDialogFlowRequest} extends {@link RequestModel}
 *
 * <p>TestDialogFlowRequest</p>
 */
public class TestDialogFlowRequest extends Request {
    @Query
    @NameInMap("DialogId")
    @Validation(required = true)
    private Long dialogId;

    private TestDialogFlowRequest(Builder builder) {
        super(builder);
        this.dialogId = builder.dialogId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TestDialogFlowRequest create() {
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

    public static final class Builder extends Request.Builder<TestDialogFlowRequest, Builder> {
        private Long dialogId; 

        private Builder() {
            super();
        } 

        private Builder(TestDialogFlowRequest response) {
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
        public TestDialogFlowRequest build() {
            return new TestDialogFlowRequest(this);
        } 

    } 

}
