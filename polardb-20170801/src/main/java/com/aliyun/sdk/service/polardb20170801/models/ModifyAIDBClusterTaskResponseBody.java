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
 * {@link ModifyAIDBClusterTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyAIDBClusterTaskResponseBody</p>
 */
public class ModifyAIDBClusterTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("RelativeDBClusterId")
    private String relativeDBClusterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyAIDBClusterTaskResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.relativeDBClusterId = builder.relativeDBClusterId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAIDBClusterTaskResponseBody create() {
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
     * @return relativeDBClusterId
     */
    public String getRelativeDBClusterId() {
        return this.relativeDBClusterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBClusterId; 
        private String relativeDBClusterId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyAIDBClusterTaskResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.relativeDBClusterId = model.relativeDBClusterId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pm-2ze9***</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The instance ID of the PolarDB database for the AI model service.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp10ze***</p>
         */
        public Builder relativeDBClusterId(String relativeDBClusterId) {
            this.relativeDBClusterId = relativeDBClusterId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6BD9CDE4-5E7B-4BF3-9BB8-83C73E******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyAIDBClusterTaskResponseBody build() {
            return new ModifyAIDBClusterTaskResponseBody(this);
        } 

    } 

}
