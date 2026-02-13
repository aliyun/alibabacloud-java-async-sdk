// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link AISearchStreamResponseBody} extends {@link TeaModel}
 *
 * <p>AISearchStreamResponseBody</p>
 */
public class AISearchStreamResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private AISearchStreamItem data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private AISearchStreamResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AISearchStreamResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public AISearchStreamItem getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AISearchStreamItem data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AISearchStreamResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * data.
         */
        public Builder data(AISearchStreamItem data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>3F21E33A-42F8-50BC-89DE-DC0B96B967DD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AISearchStreamResponseBody build() {
            return new AISearchStreamResponseBody(this);
        } 

    } 

}
