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
 * {@link DeleteAIDBClusterTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteAIDBClusterTaskResponseBody</p>
 */
public class DeleteAIDBClusterTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("RelativeDBClusterId")
    private String relativeDBClusterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteAIDBClusterTaskResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.relativeDBClusterId = builder.relativeDBClusterId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAIDBClusterTaskResponseBody create() {
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

        private Builder(DeleteAIDBClusterTaskResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.relativeDBClusterId = model.relativeDBClusterId;
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
         * RelativeDBClusterId.
         */
        public Builder relativeDBClusterId(String relativeDBClusterId) {
            this.relativeDBClusterId = relativeDBClusterId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E56531A4-E552-40BA-9C58-137B80******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteAIDBClusterTaskResponseBody build() {
            return new DeleteAIDBClusterTaskResponseBody(this);
        } 

    } 

}
