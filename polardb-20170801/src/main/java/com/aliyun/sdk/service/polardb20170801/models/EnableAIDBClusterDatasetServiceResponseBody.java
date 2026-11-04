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
 * {@link EnableAIDBClusterDatasetServiceResponseBody} extends {@link TeaModel}
 *
 * <p>EnableAIDBClusterDatasetServiceResponseBody</p>
 */
public class EnableAIDBClusterDatasetServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private EnableAIDBClusterDatasetServiceResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableAIDBClusterDatasetServiceResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBClusterId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(EnableAIDBClusterDatasetServiceResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The instance ID of the dataset management service.</p>
         * 
         * <strong>example:</strong>
         * <p>pcs-2ze26***</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>C890995A-CF06-4F4D-8DB8-DD26C2******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EnableAIDBClusterDatasetServiceResponseBody build() {
            return new EnableAIDBClusterDatasetServiceResponseBody(this);
        } 

    } 

}
