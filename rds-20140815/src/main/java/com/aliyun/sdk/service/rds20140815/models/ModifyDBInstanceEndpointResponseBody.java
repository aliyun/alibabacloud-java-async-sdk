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
 * {@link ModifyDBInstanceEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDBInstanceEndpointResponseBody</p>
 */
public class ModifyDBInstanceEndpointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyDBInstanceEndpointResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceEndpointResponseBody create() {
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

        private Builder(ModifyDBInstanceEndpointResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F2911788-25E8-42E5-A3A3-1B38D263F01E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyDBInstanceEndpointResponseBody build() {
            return new ModifyDBInstanceEndpointResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyDBInstanceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyDBInstanceEndpointResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.DBInstanceEndpointId = model.DBInstanceEndpointId;
                this.DBInstanceName = model.DBInstanceName;
            } 

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
