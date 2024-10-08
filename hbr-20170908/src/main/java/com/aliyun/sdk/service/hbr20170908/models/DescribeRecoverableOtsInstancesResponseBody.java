// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRecoverableOtsInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRecoverableOtsInstancesResponseBody</p>
 */
public class DescribeRecoverableOtsInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OtsInstances")
    private java.util.List < OtsInstances> otsInstances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeRecoverableOtsInstancesResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.otsInstances = builder.otsInstances;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecoverableOtsInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return otsInstances
     */
    public java.util.List < OtsInstances> getOtsInstances() {
        return this.otsInstances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private java.util.List < OtsInstances> otsInstances; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The response code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message. If the request was successful, &quot;successful&quot; is returned. If the request failed, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The list of Tablestore instances that can be restored and the tables in the instances.</p>
         */
        public Builder otsInstances(java.util.List < OtsInstances> otsInstances) {
            this.otsInstances = otsInstances;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>14DC089E-5DD3-5028-AEDB-93D78E11DB2A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeRecoverableOtsInstancesResponseBody build() {
            return new DescribeRecoverableOtsInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRecoverableOtsInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRecoverableOtsInstancesResponseBody</p>
     */
    public static class OtsInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("TableNames")
        private java.util.List < String > tableNames;

        private OtsInstances(Builder builder) {
            this.instanceName = builder.instanceName;
            this.tableNames = builder.tableNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OtsInstances create() {
            return builder().build();
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return tableNames
         */
        public java.util.List < String > getTableNames() {
            return this.tableNames;
        }

        public static final class Builder {
            private String instanceName; 
            private java.util.List < String > tableNames; 

            /**
             * <p>The name of the Tablestore instance that can be restored.</p>
             * 
             * <strong>example:</strong>
             * <p>instancename</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The names of the tables in the Tablestore instance.</p>
             */
            public Builder tableNames(java.util.List < String > tableNames) {
                this.tableNames = tableNames;
                return this;
            }

            public OtsInstances build() {
                return new OtsInstances(this);
            } 

        } 

    }
}
