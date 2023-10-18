// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHighReliablePhysicalConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateHighReliablePhysicalConnectionResponseBody</p>
 */
public class CreateHighReliablePhysicalConnectionResponseBody extends TeaModel {
    @NameInMap("ErrorInfoList")
    private ErrorInfoList errorInfoList;

    @NameInMap("PhysicalConnectionList")
    private PhysicalConnectionList physicalConnectionList;

    @NameInMap("RequestId")
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
         * ErrorInfoList.
         */
        public Builder errorInfoList(ErrorInfoList errorInfoList) {
            this.errorInfoList = errorInfoList;
            return this;
        }

        /**
         * PhysicalConnectionList.
         */
        public Builder physicalConnectionList(PhysicalConnectionList physicalConnectionList) {
            this.physicalConnectionList = physicalConnectionList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateHighReliablePhysicalConnectionResponseBody build() {
            return new CreateHighReliablePhysicalConnectionResponseBody(this);
        } 

    } 

    public static class ErrorInfoListErrorInfoList extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("InstanceId")
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
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * InstanceId.
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
    public static class ErrorInfoList extends TeaModel {
        @NameInMap("errorInfoList")
        private java.util.List < ErrorInfoListErrorInfoList> errorInfoList;

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
        public java.util.List < ErrorInfoListErrorInfoList> getErrorInfoList() {
            return this.errorInfoList;
        }

        public static final class Builder {
            private java.util.List < ErrorInfoListErrorInfoList> errorInfoList; 

            /**
             * errorInfoList.
             */
            public Builder errorInfoList(java.util.List < ErrorInfoListErrorInfoList> errorInfoList) {
                this.errorInfoList = errorInfoList;
                return this;
            }

            public ErrorInfoList build() {
                return new ErrorInfoList(this);
            } 

        } 

    }
    public static class PhysicalConnectionListPhysicalConnectionList extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("RegionNo")
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
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * RegionNo.
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
    public static class PhysicalConnectionList extends TeaModel {
        @NameInMap("physicalConnectionList")
        private java.util.List < PhysicalConnectionListPhysicalConnectionList> physicalConnectionList;

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
        public java.util.List < PhysicalConnectionListPhysicalConnectionList> getPhysicalConnectionList() {
            return this.physicalConnectionList;
        }

        public static final class Builder {
            private java.util.List < PhysicalConnectionListPhysicalConnectionList> physicalConnectionList; 

            /**
             * physicalConnectionList.
             */
            public Builder physicalConnectionList(java.util.List < PhysicalConnectionListPhysicalConnectionList> physicalConnectionList) {
                this.physicalConnectionList = physicalConnectionList;
                return this;
            }

            public PhysicalConnectionList build() {
                return new PhysicalConnectionList(this);
            } 

        } 

    }
}
