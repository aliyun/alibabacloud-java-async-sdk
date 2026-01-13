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
 * {@link CreateRecallManagementServiceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRecallManagementServiceResponseBody</p>
 */
public class CreateRecallManagementServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RecallManagementServiceId")
    private String recallManagementServiceId;

    @com.aliyun.core.annotation.NameInMap("RecallManagementServiceVersionId")
    private String recallManagementServiceVersionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateRecallManagementServiceResponseBody(Builder builder) {
        this.recallManagementServiceId = builder.recallManagementServiceId;
        this.recallManagementServiceVersionId = builder.recallManagementServiceVersionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRecallManagementServiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recallManagementServiceId
     */
    public String getRecallManagementServiceId() {
        return this.recallManagementServiceId;
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
        private String recallManagementServiceId; 
        private String recallManagementServiceVersionId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateRecallManagementServiceResponseBody model) {
            this.recallManagementServiceId = model.recallManagementServiceId;
            this.recallManagementServiceVersionId = model.recallManagementServiceVersionId;
            this.requestId = model.requestId;
        } 

        /**
         * RecallManagementServiceId.
         */
        public Builder recallManagementServiceId(String recallManagementServiceId) {
            this.recallManagementServiceId = recallManagementServiceId;
            return this;
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

        public CreateRecallManagementServiceResponseBody build() {
            return new CreateRecallManagementServiceResponseBody(this);
        } 

    } 

}
