// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link ListServiceInstanceFaultInjectionInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceInstanceFaultInjectionInfoResponseBody</p>
 */
public class ListServiceInstanceFaultInjectionInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FaultInfoList")
    private java.util.List<FaultInfoList> faultInfoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListServiceInstanceFaultInjectionInfoResponseBody(Builder builder) {
        this.faultInfoList = builder.faultInfoList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceInstanceFaultInjectionInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return faultInfoList
     */
    public java.util.List<FaultInfoList> getFaultInfoList() {
        return this.faultInfoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<FaultInfoList> faultInfoList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListServiceInstanceFaultInjectionInfoResponseBody model) {
            this.faultInfoList = model.faultInfoList;
            this.requestId = model.requestId;
        } 

        /**
         * FaultInfoList.
         */
        public Builder faultInfoList(java.util.List<FaultInfoList> faultInfoList) {
            this.faultInfoList = faultInfoList;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListServiceInstanceFaultInjectionInfoResponseBody build() {
            return new ListServiceInstanceFaultInjectionInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListServiceInstanceFaultInjectionInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceInstanceFaultInjectionInfoResponseBody</p>
     */
    public static class FaultStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FaultStatus")
        private String faultStatus;

        @com.aliyun.core.annotation.NameInMap("FaultStatusMessage")
        private String faultStatusMessage;

        private FaultStatus(Builder builder) {
            this.faultStatus = builder.faultStatus;
            this.faultStatusMessage = builder.faultStatusMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FaultStatus create() {
            return builder().build();
        }

        /**
         * @return faultStatus
         */
        public String getFaultStatus() {
            return this.faultStatus;
        }

        /**
         * @return faultStatusMessage
         */
        public String getFaultStatusMessage() {
            return this.faultStatusMessage;
        }

        public static final class Builder {
            private String faultStatus; 
            private String faultStatusMessage; 

            private Builder() {
            } 

            private Builder(FaultStatus model) {
                this.faultStatus = model.faultStatus;
                this.faultStatusMessage = model.faultStatusMessage;
            } 

            /**
             * FaultStatus.
             */
            public Builder faultStatus(String faultStatus) {
                this.faultStatus = faultStatus;
                return this;
            }

            /**
             * FaultStatusMessage.
             */
            public Builder faultStatusMessage(String faultStatusMessage) {
                this.faultStatusMessage = faultStatusMessage;
                return this;
            }

            public FaultStatus build() {
                return new FaultStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceInstanceFaultInjectionInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceInstanceFaultInjectionInfoResponseBody</p>
     */
    public static class FaultInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FaultArgs")
        private Object faultArgs;

        @com.aliyun.core.annotation.NameInMap("FaultStatus")
        private FaultStatus faultStatus;

        @com.aliyun.core.annotation.NameInMap("FaultType")
        private String faultType;

        private FaultInfoList(Builder builder) {
            this.faultArgs = builder.faultArgs;
            this.faultStatus = builder.faultStatus;
            this.faultType = builder.faultType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FaultInfoList create() {
            return builder().build();
        }

        /**
         * @return faultArgs
         */
        public Object getFaultArgs() {
            return this.faultArgs;
        }

        /**
         * @return faultStatus
         */
        public FaultStatus getFaultStatus() {
            return this.faultStatus;
        }

        /**
         * @return faultType
         */
        public String getFaultType() {
            return this.faultType;
        }

        public static final class Builder {
            private Object faultArgs; 
            private FaultStatus faultStatus; 
            private String faultType; 

            private Builder() {
            } 

            private Builder(FaultInfoList model) {
                this.faultArgs = model.faultArgs;
                this.faultStatus = model.faultStatus;
                this.faultType = model.faultType;
            } 

            /**
             * FaultArgs.
             */
            public Builder faultArgs(Object faultArgs) {
                this.faultArgs = faultArgs;
                return this;
            }

            /**
             * FaultStatus.
             */
            public Builder faultStatus(FaultStatus faultStatus) {
                this.faultStatus = faultStatus;
                return this;
            }

            /**
             * FaultType.
             */
            public Builder faultType(String faultType) {
                this.faultType = faultType;
                return this;
            }

            public FaultInfoList build() {
                return new FaultInfoList(this);
            } 

        } 

    }
}
