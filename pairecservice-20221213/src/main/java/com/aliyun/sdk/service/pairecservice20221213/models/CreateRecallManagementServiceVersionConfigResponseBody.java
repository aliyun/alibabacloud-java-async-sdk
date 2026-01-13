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
 * {@link CreateRecallManagementServiceVersionConfigResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRecallManagementServiceVersionConfigResponseBody</p>
 */
public class CreateRecallManagementServiceVersionConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RecallManagementServiceVersionConfigId")
    private String recallManagementServiceVersionConfigId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateRecallManagementServiceVersionConfigResponseBody(Builder builder) {
        this.recallManagementServiceVersionConfigId = builder.recallManagementServiceVersionConfigId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRecallManagementServiceVersionConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recallManagementServiceVersionConfigId
     */
    public String getRecallManagementServiceVersionConfigId() {
        return this.recallManagementServiceVersionConfigId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String recallManagementServiceVersionConfigId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateRecallManagementServiceVersionConfigResponseBody model) {
            this.recallManagementServiceVersionConfigId = model.recallManagementServiceVersionConfigId;
            this.requestId = model.requestId;
        } 

        /**
         * RecallManagementServiceVersionConfigId.
         */
        public Builder recallManagementServiceVersionConfigId(String recallManagementServiceVersionConfigId) {
            this.recallManagementServiceVersionConfigId = recallManagementServiceVersionConfigId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateRecallManagementServiceVersionConfigResponseBody build() {
            return new CreateRecallManagementServiceVersionConfigResponseBody(this);
        } 

    } 

}
