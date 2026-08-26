// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateKnowledgeSpaceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateKnowledgeSpaceResponseBody</p>
 */
public class CreateKnowledgeSpaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("KnowledgeSpaceId")
    private String knowledgeSpaceId;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateKnowledgeSpaceResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.knowledgeSpaceId = builder.knowledgeSpaceId;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKnowledgeSpaceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return knowledgeSpaceId
     */
    public String getKnowledgeSpaceId() {
        return this.knowledgeSpaceId;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBClusterId; 
        private String knowledgeSpaceId; 
        private String orderId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateKnowledgeSpaceResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.knowledgeSpaceId = model.knowledgeSpaceId;
            this.orderId = model.orderId;
            this.requestId = model.requestId;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * KnowledgeSpaceId.
         */
        public Builder knowledgeSpaceId(String knowledgeSpaceId) {
            this.knowledgeSpaceId = knowledgeSpaceId;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2F029645-FED9-4FE8-A6D3-488954******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateKnowledgeSpaceResponseBody build() {
            return new CreateKnowledgeSpaceResponseBody(this);
        } 

    } 

}
