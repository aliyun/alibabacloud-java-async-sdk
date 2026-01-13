// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link CreateRecallManagementTableResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRecallManagementTableResponseBody</p>
 */
public class CreateRecallManagementTableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RecallManagementTableId")
    private String recallManagementTableId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateRecallManagementTableResponseBody(Builder builder) {
        this.recallManagementTableId = builder.recallManagementTableId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRecallManagementTableResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recallManagementTableId
     */
    public String getRecallManagementTableId() {
        return this.recallManagementTableId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String recallManagementTableId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateRecallManagementTableResponseBody model) {
            this.recallManagementTableId = model.recallManagementTableId;
            this.requestId = model.requestId;
        } 

        /**
         * RecallManagementTableId.
         */
        public Builder recallManagementTableId(String recallManagementTableId) {
            this.recallManagementTableId = recallManagementTableId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateRecallManagementTableResponseBody build() {
            return new CreateRecallManagementTableResponseBody(this);
        } 

    } 

}
