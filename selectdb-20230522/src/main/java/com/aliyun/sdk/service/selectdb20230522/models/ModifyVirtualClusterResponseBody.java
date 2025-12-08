// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

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
 * {@link ModifyVirtualClusterResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyVirtualClusterResponseBody</p>
 */
public class ModifyVirtualClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyVirtualClusterResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVirtualClusterResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyVirtualClusterResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>06758CAB-1204-5852-A471-29C87D5C1D0F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyVirtualClusterResponseBody build() {
            return new ModifyVirtualClusterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyVirtualClusterResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyVirtualClusterResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbClusterId")
        private String dbClusterId;

        @com.aliyun.core.annotation.NameInMap("DbInstanceId")
        private String dbInstanceId;

        private Data(Builder builder) {
            this.dbClusterId = builder.dbClusterId;
            this.dbInstanceId = builder.dbInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dbClusterId
         */
        public String getDbClusterId() {
            return this.dbClusterId;
        }

        /**
         * @return dbInstanceId
         */
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        public static final class Builder {
            private String dbClusterId; 
            private String dbInstanceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dbClusterId = model.dbClusterId;
                this.dbInstanceId = model.dbInstanceId;
            } 

            /**
             * DbClusterId.
             */
            public Builder dbClusterId(String dbClusterId) {
                this.dbClusterId = dbClusterId;
                return this;
            }

            /**
             * DbInstanceId.
             */
            public Builder dbInstanceId(String dbInstanceId) {
                this.dbInstanceId = dbInstanceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
