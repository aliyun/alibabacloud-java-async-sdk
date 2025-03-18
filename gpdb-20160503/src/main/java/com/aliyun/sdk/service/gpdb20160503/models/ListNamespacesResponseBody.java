// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ListNamespacesResponseBody} extends {@link TeaModel}
 *
 * <p>ListNamespacesResponseBody</p>
 */
public class ListNamespacesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Namespaces")
    private Namespaces namespaces;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListNamespacesResponseBody(Builder builder) {
        this.count = builder.count;
        this.DBInstanceId = builder.DBInstanceId;
        this.message = builder.message;
        this.namespaces = builder.namespaces;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNamespacesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return namespaces
     */
    public Namespaces getNamespaces() {
        return this.namespaces;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Integer count; 
        private String DBInstanceId; 
        private String message; 
        private Namespaces namespaces; 
        private String regionId; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(ListNamespacesResponseBody model) {
            this.count = model.count;
            this.DBInstanceId = model.DBInstanceId;
            this.message = model.message;
            this.namespaces = model.namespaces;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The queried namespaces.</p>
         */
        public Builder namespaces(Namespaces namespaces) {
            this.namespaces = namespaces;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>success</strong></li>
         * <li><strong>fail</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public ListNamespacesResponseBody build() {
            return new ListNamespacesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNamespacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNamespacesResponseBody</p>
     */
    public static class Namespaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Namespace")
        private java.util.List<String> namespace;

        private Namespaces(Builder builder) {
            this.namespace = builder.namespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Namespaces create() {
            return builder().build();
        }

        /**
         * @return namespace
         */
        public java.util.List<String> getNamespace() {
            return this.namespace;
        }

        public static final class Builder {
            private java.util.List<String> namespace; 

            private Builder() {
            } 

            private Builder(Namespaces model) {
                this.namespace = model.namespace;
            } 

            /**
             * Namespace.
             */
            public Builder namespace(java.util.List<String> namespace) {
                this.namespace = namespace;
                return this;
            }

            public Namespaces build() {
                return new Namespaces(this);
            } 

        } 

    }
}
