// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link CreatePerspectiveResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePerspectiveResponseBody</p>
 */
public class CreatePerspectiveResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PerspectiveId")
    private String perspectiveId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreatePerspectiveResponseBody model) {
            this.perspectiveId = model.perspectiveId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The perspective ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3001</p>
         */
        public Builder perspectiveId(String perspectiveId) {
            this.perspectiveId = perspectiveId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F285D735-D580-18A8-B97F-B2E72B00F101</p>
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
