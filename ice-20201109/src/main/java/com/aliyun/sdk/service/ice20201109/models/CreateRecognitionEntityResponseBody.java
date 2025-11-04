// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link CreateRecognitionEntityResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRecognitionEntityResponseBody</p>
 */
public class CreateRecognitionEntityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EntityId")
    private String entityId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateRecognitionEntityResponseBody(Builder builder) {
        this.entityId = builder.entityId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRecognitionEntityResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entityId
     */
    public String getEntityId() {
        return this.entityId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String entityId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateRecognitionEntityResponseBody model) {
            this.entityId = model.entityId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the created entity.</p>
         * 
         * <strong>example:</strong>
         * <p>**<strong><strong><strong><strong><strong><strong>544cb84754</strong></strong></strong></strong></strong></strong></p>
         */
        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateRecognitionEntityResponseBody build() {
            return new CreateRecognitionEntityResponseBody(this);
        } 

    } 

}
