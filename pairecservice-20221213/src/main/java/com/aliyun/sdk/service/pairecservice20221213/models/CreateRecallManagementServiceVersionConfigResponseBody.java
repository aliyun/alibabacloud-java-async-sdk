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
         * <p>The ID of the recall management service version configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder recallManagementServiceVersionConfigId(String recallManagementServiceVersionConfigId) {
            this.recallManagementServiceVersionConfigId = recallManagementServiceVersionConfigId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F8F613A9-DF1C-551A-88E1-397A3981A785</p>
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
