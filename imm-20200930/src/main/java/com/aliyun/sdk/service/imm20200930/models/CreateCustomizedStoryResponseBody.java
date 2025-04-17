// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link CreateCustomizedStoryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCustomizedStoryResponseBody</p>
 */
public class CreateCustomizedStoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ObjectId")
    private String objectId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCustomizedStoryResponseBody(Builder builder) {
        this.objectId = builder.objectId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomizedStoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return objectId
     */
    public String getObjectId() {
        return this.objectId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String objectId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateCustomizedStoryResponseBody model) {
            this.objectId = model.objectId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the story.</p>
         * 
         * <strong>example:</strong>
         * <p>563062c0b085733f34ab****</p>
         */
        public Builder objectId(String objectId) {
            this.objectId = objectId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BC91D091-D49F-0ACD-95D5-F0621045****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCustomizedStoryResponseBody build() {
            return new CreateCustomizedStoryResponseBody(this);
        } 

    } 

}
