// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adbai20250812.models;

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
 * {@link CreateMultiModelKnowledgeBaseResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMultiModelKnowledgeBaseResponseBody</p>
 */
public class CreateMultiModelKnowledgeBaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DbClusterId")
    private String dbClusterId;

    @com.aliyun.core.annotation.NameInMap("MmkbName")
    private String mmkbName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateMultiModelKnowledgeBaseResponseBody(Builder builder) {
        this.dbClusterId = builder.dbClusterId;
        this.mmkbName = builder.mmkbName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMultiModelKnowledgeBaseResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbClusterId
     */
    public String getDbClusterId() {
        return this.dbClusterId;
    }

    /**
     * @return mmkbName
     */
    public String getMmkbName() {
        return this.mmkbName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String dbClusterId; 
        private String mmkbName; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateMultiModelKnowledgeBaseResponseBody model) {
            this.dbClusterId = model.dbClusterId;
            this.mmkbName = model.mmkbName;
            this.requestId = model.requestId;
        } 

        /**
         * DbClusterId.
         */
        public Builder dbClusterId(String dbClusterId) {
            this.dbClusterId = dbClusterId;
            return this;
        }

        /**
         * MmkbName.
         */
        public Builder mmkbName(String mmkbName) {
            this.mmkbName = mmkbName;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>B47EED99-BFA5-529D-8D85-A6642421D390</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMultiModelKnowledgeBaseResponseBody build() {
            return new CreateMultiModelKnowledgeBaseResponseBody(this);
        } 

    } 

}
