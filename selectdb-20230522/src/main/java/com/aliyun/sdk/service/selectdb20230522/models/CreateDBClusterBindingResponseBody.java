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
 * {@link CreateDBClusterBindingResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDBClusterBindingResponseBody</p>
 */
public class CreateDBClusterBindingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDBClusterBindingResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBClusterBindingResponseBody create() {
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

        private Builder(CreateDBClusterBindingResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>4773E4EC-025D-509F-AEA9-D53123FDFB0F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDBClusterBindingResponseBody build() {
            return new CreateDBClusterBindingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateDBClusterBindingResponseBody} extends {@link TeaModel}
     *
     * <p>CreateDBClusterBindingResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbClusterId")
        private String dbClusterId;

        @com.aliyun.core.annotation.NameInMap("DbInstanceId")
        private String dbInstanceId;

        @com.aliyun.core.annotation.NameInMap("DbInstanceName")
        private String dbInstanceName;

        private Data(Builder builder) {
            this.dbClusterId = builder.dbClusterId;
            this.dbInstanceId = builder.dbInstanceId;
            this.dbInstanceName = builder.dbInstanceName;
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

        /**
         * @return dbInstanceName
         */
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

        public static final class Builder {
            private String dbClusterId; 
            private String dbInstanceId; 
            private String dbInstanceName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dbClusterId = model.dbClusterId;
                this.dbInstanceId = model.dbInstanceId;
                this.dbInstanceName = model.dbInstanceName;
            } 

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>selectdb-cn-7213cjv2ez-be</p>
             */
            public Builder dbClusterId(String dbClusterId) {
                this.dbClusterId = dbClusterId;
                return this;
            }

            /**
             * <p>The numeric ID.</p>
             * 
             * <strong>example:</strong>
             * <p>6585</p>
             */
            public Builder dbInstanceId(String dbInstanceId) {
                this.dbInstanceId = dbInstanceId;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>selectdb-cn-7213cjv2ez</p>
             */
            public Builder dbInstanceName(String dbInstanceName) {
                this.dbInstanceName = dbInstanceName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
