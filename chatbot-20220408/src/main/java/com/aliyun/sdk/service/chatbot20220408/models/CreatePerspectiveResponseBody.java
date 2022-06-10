// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePerspectiveResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePerspectiveResponseBody</p>
 */
public class CreatePerspectiveResponseBody extends TeaModel {
    @NameInMap("PerspectiveId")
    private String perspectiveId;

    @NameInMap("RequestId")
    private String requestId;

    private CreatePerspectiveResponseBody(Builder builder) {
        this.perspectiveId = builder.perspectiveId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePerspectiveResponseBody create() {
        return builder().build();
    }

    /**
     * @return perspectiveId
     */
    public String getPerspectiveId() {
        return this.perspectiveId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String perspectiveId; 
        private String requestId; 

        /**
         * 视角主键（code_id）
         */
        public Builder perspectiveId(String perspectiveId) {
            this.perspectiveId = perspectiveId;
            return this;
        }

        /**
         * 请求Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePerspectiveResponseBody build() {
            return new CreatePerspectiveResponseBody(this);
        } 

    } 

}
