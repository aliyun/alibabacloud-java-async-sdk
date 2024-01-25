// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecoverableOtsInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRecoverableOtsInstancesResponseBody</p>
 */
public class DescribeRecoverableOtsInstancesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("OtsInstances")
    private java.util.List < OtsInstances> otsInstances;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * The HTTP status code. The status code 200 indicates that the call is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The message that is returned. If the call is successful, "successful" is returned. If the call fails, an error message is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The list of Tablestore instances that can be restored and the tables in the instances.
         */
        public Builder otsInstances(java.util.List < OtsInstances> otsInstances) {
            this.otsInstances = otsInstances;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call is successful.
         * <p>
         * 
         * *   true: The call is successful.
         * *   false: The call fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeRecoverableOtsInstancesResponseBody build() {
            return new DescribeRecoverableOtsInstancesResponseBody(this);
        } 

    } 

    public static class OtsInstances extends TeaModel {
        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("TableNames")
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
             * The name of the Tablestore instance that can be restored.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The names of the tables in the Tablestore instance.
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
