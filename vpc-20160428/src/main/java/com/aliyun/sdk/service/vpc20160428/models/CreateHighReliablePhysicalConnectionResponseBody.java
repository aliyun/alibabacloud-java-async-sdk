// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link CreateHighReliablePhysicalConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateHighReliablePhysicalConnectionResponseBody</p>
 */
public class CreateHighReliablePhysicalConnectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorInfoList")
    private ErrorInfoList errorInfoList;

    @com.aliyun.core.annotation.NameInMap("PhysicalConnectionList")
    private PhysicalConnectionList physicalConnectionList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateHighReliablePhysicalConnectionResponseBody(Builder builder) {
        this.errorInfoList = builder.errorInfoList;
        this.physicalConnectionList = builder.physicalConnectionList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHighReliablePhysicalConnectionResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorInfoList
     */
    public ErrorInfoList getErrorInfoList() {
        return this.errorInfoList;
    }

    /**
     * @return physicalConnectionList
     */
    public PhysicalConnectionList getPhysicalConnectionList() {
        return this.physicalConnectionList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ErrorInfoList errorInfoList; 
        private PhysicalConnectionList physicalConnectionList; 
        private String requestId; 

        /**
         * <p>If the request fails the dry run, the following error codes and error messages may be returned:</p>
         * <ul>
         * <li>pconn.high.reliable.dryrun.error.disable.outbound.data.transfer.billing. Billing for outbound data transfer is not enabled.</li>
         * <li>pconn.high.reliable.dryrun.error.incompatable.device.capacity. No device in the access point supports advanced features.</li>
         * <li>pconn.high.reliable.dryrun.error.quota.exceeded. The quota is insufficient.</li>
         * <li>pconn.high.reliable.dryrun.error.not.enough.resource. The access point resources are insufficient.</li>
         * </ul>
         */
        public Builder errorInfoList(ErrorInfoList errorInfoList) {
            this.errorInfoList = errorInfoList;
            return this;
        }

        /**
         * <p>The Express Connect circuits.</p>
         */
        public Builder physicalConnectionList(PhysicalConnectionList physicalConnectionList) {
            this.physicalConnectionList = physicalConnectionList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateHighReliablePhysicalConnectionResponseBody build() {
            return new CreateHighReliablePhysicalConnectionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateHighReliablePhysicalConnectionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateHighReliablePhysicalConnectionResponseBody</p>
     */
    public static class ErrorInfoListErrorInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private ErrorInfoListErrorInfoList(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorInfoListErrorInfoList create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private String instanceId; 

            /**
             * <p>Error codes.</p>
             * 
             * <strong>example:</strong>
             * <p>pconn.high.reliable.dryrun.error.disable.outbound.data.transfer.billing</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The returned error message.</p>
             * 
             * <strong>example:</strong>
             * <p>pconn.high.reliable.dryrun.error.disable.outbound.data.transfer.billing</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The ID of the Express Connect circuit.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-j5e5qqo616p81ncspbll1</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public ErrorInfoListErrorInfoList build() {
                return new ErrorInfoListErrorInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateHighReliablePhysicalConnectionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateHighReliablePhysicalConnectionResponseBody</p>
     */
    public static class ErrorInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("errorInfoList")
        private java.util.List<ErrorInfoListErrorInfoList> errorInfoList;

        private ErrorInfoList(Builder builder) {
            this.errorInfoList = builder.errorInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorInfoList create() {
            return builder().build();
        }

        /**
         * @return errorInfoList
         */
        public java.util.List<ErrorInfoListErrorInfoList> getErrorInfoList() {
            return this.errorInfoList;
        }

        public static final class Builder {
            private java.util.List<ErrorInfoListErrorInfoList> errorInfoList; 

            /**
             * errorInfoList.
             */
            public Builder errorInfoList(java.util.List<ErrorInfoListErrorInfoList> errorInfoList) {
                this.errorInfoList = errorInfoList;
                return this;
            }

            public ErrorInfoList build() {
                return new ErrorInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateHighReliablePhysicalConnectionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateHighReliablePhysicalConnectionResponseBody</p>
     */
    public static class PhysicalConnectionListPhysicalConnectionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        private PhysicalConnectionListPhysicalConnectionList(Builder builder) {
            this.instanceId = builder.instanceId;
            this.regionNo = builder.regionNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PhysicalConnectionListPhysicalConnectionList create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        public static final class Builder {
            private String instanceId; 
            private String regionNo; 

            /**
             * <p>The ID of the Express Connect circuit.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-j5e5qqo616p81ncspbll1</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The region ID of the Express Connect circuit.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            public PhysicalConnectionListPhysicalConnectionList build() {
                return new PhysicalConnectionListPhysicalConnectionList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateHighReliablePhysicalConnectionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateHighReliablePhysicalConnectionResponseBody</p>
     */
    public static class PhysicalConnectionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("physicalConnectionList")
        private java.util.List<PhysicalConnectionListPhysicalConnectionList> physicalConnectionList;

        private PhysicalConnectionList(Builder builder) {
            this.physicalConnectionList = builder.physicalConnectionList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PhysicalConnectionList create() {
            return builder().build();
        }

        /**
         * @return physicalConnectionList
         */
        public java.util.List<PhysicalConnectionListPhysicalConnectionList> getPhysicalConnectionList() {
            return this.physicalConnectionList;
        }

        public static final class Builder {
            private java.util.List<PhysicalConnectionListPhysicalConnectionList> physicalConnectionList; 

            /**
             * physicalConnectionList.
             */
            public Builder physicalConnectionList(java.util.List<PhysicalConnectionListPhysicalConnectionList> physicalConnectionList) {
                this.physicalConnectionList = physicalConnectionList;
                return this;
            }

            public PhysicalConnectionList build() {
                return new PhysicalConnectionList(this);
            } 

        } 

    }
}
