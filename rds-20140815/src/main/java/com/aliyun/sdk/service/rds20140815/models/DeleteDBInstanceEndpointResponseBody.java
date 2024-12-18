// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DeleteDBInstanceEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteDBInstanceEndpointResponseBody</p>
 */
public class DeleteDBInstanceEndpointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteDBInstanceEndpointResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDBInstanceEndpointResponseBody create() {
        return builder().build();
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

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>224DB9F7-3100-4899-AB9C-C938BCCB43E7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteDBInstanceEndpointResponseBody build() {
            return new DeleteDBInstanceEndpointResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteDBInstanceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteDBInstanceEndpointResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceEndpointId")
        private String DBInstanceEndpointId;

        @com.aliyun.core.annotation.NameInMap("DBInstanceName")
        private String DBInstanceName;

        private Data(Builder builder) {
            this.DBInstanceEndpointId = builder.DBInstanceEndpointId;
            this.DBInstanceName = builder.DBInstanceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return DBInstanceEndpointId
         */
        public String getDBInstanceEndpointId() {
            return this.DBInstanceEndpointId;
        }

        /**
         * @return DBInstanceName
         */
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public static final class Builder {
            private String DBInstanceEndpointId; 
            private String DBInstanceName; 

            /**
             * <p>The endpoint ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ep-****</p>
             */
            public Builder DBInstanceEndpointId(String DBInstanceEndpointId) {
                this.DBInstanceEndpointId = DBInstanceEndpointId;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-****</p>
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
