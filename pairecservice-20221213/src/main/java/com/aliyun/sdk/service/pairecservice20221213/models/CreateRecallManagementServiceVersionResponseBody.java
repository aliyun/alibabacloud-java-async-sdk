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
 * {@link CreateRecallManagementServiceVersionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRecallManagementServiceVersionResponseBody</p>
 */
public class CreateRecallManagementServiceVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RecallManagementServiceVersionId")
    private String recallManagementServiceVersionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateRecallManagementServiceVersionResponseBody(Builder builder) {
        this.recallManagementServiceVersionId = builder.recallManagementServiceVersionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRecallManagementServiceVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recallManagementServiceVersionId
     */
    public String getRecallManagementServiceVersionId() {
        return this.recallManagementServiceVersionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String recallManagementServiceVersionId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateRecallManagementServiceVersionResponseBody model) {
            this.recallManagementServiceVersionId = model.recallManagementServiceVersionId;
            this.requestId = model.requestId;
        } 

        /**
         * RecallManagementServiceVersionId.
         */
        public Builder recallManagementServiceVersionId(String recallManagementServiceVersionId) {
            this.recallManagementServiceVersionId = recallManagementServiceVersionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateRecallManagementServiceVersionResponseBody build() {
            return new CreateRecallManagementServiceVersionResponseBody(this);
        } 

    } 

}
