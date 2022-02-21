// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDialogResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDialogResponseBody</p>
 */
public class CreateDialogResponseBody extends TeaModel {
    @NameInMap("DialogId")
    private Long dialogId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDialogResponseBody(Builder builder) {
        this.dialogId = builder.dialogId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDialogResponseBody create() {
        return builder().build();
    }

    /**
     * @return dialogId
     */
    public Long getDialogId() {
        return this.dialogId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long dialogId; 
        private String requestId; 

        /**
         * DialogId.
         */
        public Builder dialogId(Long dialogId) {
            this.dialogId = dialogId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDialogResponseBody build() {
            return new CreateDialogResponseBody(this);
        } 

    } 

}
