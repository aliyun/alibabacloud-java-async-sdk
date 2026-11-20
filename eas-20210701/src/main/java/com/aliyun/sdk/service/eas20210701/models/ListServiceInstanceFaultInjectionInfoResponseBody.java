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
         * <p>The list of injected faults.</p>
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
             * <p>The fault status. Valid values:</p>
             * <ul>
             * <li>FaultNotInjected: The task is created but the fault is not injected.</li>
             * <li>FaultInjectedSuccess: The fault is successfully injected.</li>
             * <li>FaultInjectedFailure: The fault injection failed, which may be caused by parameter errors or system issues.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FaultInjectedSuccess</p>
             */
            public Builder faultStatus(String faultStatus) {
                this.faultStatus = faultStatus;
                return this;
            }

            /**
             * <p>The description of the fault injection.</p>
             * 
             * <strong>example:</strong>
             * <p>Network interface not found</p>
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
             * <p>Detailed parameters for each fault type:</p>
             * <ol>
             * <li>CpuFullloadTask (CPU full load fault)
             * <code>{   &quot;FaultType&quot;: &quot;CpuFullloadTask&quot;,   &quot;FaultArgs&quot;: {  &quot;FaultAction&quot;: &quot;fullload&quot;,  &quot;CpuPercent&quot;: 50   } }</code></li>
             * <li>MemLoadTask (memory load fault)
             * <code>{   &quot;FaultType&quot;: &quot;MemLoadTask&quot;,   &quot;FaultArgs&quot;: {  &quot;FaultAction&quot;: &quot;load&quot;,  &quot;MemPercent&quot;: 80   } }</code></li>
             * <li>NetworkTask (network fault)
             * 3.a. NetworkDelayAction (network delay)
             * <code>{   &quot;FaultType&quot;: &quot;NetworkTask&quot;,   &quot;FaultArgs&quot;: {  &quot;FaultAction&quot;: &quot;delay&quot;,  &quot;Time&quot;: 3000,  &quot;Offset&quot;: 100   } }</code>
             * 3.b. NetworkCorruptAction (network packet corruption)
             * <code>{   &quot;FaultType&quot;: &quot;NetworkTask&quot;,   &quot;FaultArgs&quot;: {  &quot;FaultAction&quot;: &quot;corrupt&quot;,  &quot;Percent&quot;: 50   } }</code>
             * 3.c. NetworkLossAction (network packet loss)
             * <code>{   &quot;FaultType&quot;: &quot;NetworkTask&quot;,   &quot;FaultArgs&quot;: {  &quot;FaultAction&quot;: &quot;loss&quot;,  &quot;Percent&quot;: 30   } }</code></li>
             * <li>DiskBurnTask (disk read/write fault)
             * <code>{   &quot;FaultType&quot;: &quot;DiskBurnTask&quot;,   &quot;FaultArgs&quot;: {  &quot;FaultAction&quot;: &quot;burn&quot;,  &quot;Read&quot;: true,  &quot;Write&quot;: true,  &quot;Size&quot;: 100   } }</code></li>
             * <li>DiskFillTask (disk fill fault)
             * <code>{   &quot;FaultType&quot;: &quot;DiskFillTask&quot;,   &quot;FaultArgs&quot;: {  &quot;FaultAction&quot;: &quot;fill&quot;,  &quot;Percent&quot;: 80   } }</code></li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;FaultType&quot;: &quot;DiskBurnTask&quot;,
             *   &quot;FaultArgs&quot;: {
             *     &quot;FaultAction&quot;: &quot;burn&quot;,
             *     &quot;Read&quot;: true,
             *     &quot;Write&quot;: true,
             *     &quot;Size&quot;: 100
             *   }
             * }</p>
             */
            public Builder faultArgs(Object faultArgs) {
                this.faultArgs = faultArgs;
                return this;
            }

            /**
             * <p>The fault status.</p>
             */
            public Builder faultStatus(FaultStatus faultStatus) {
                this.faultStatus = faultStatus;
                return this;
            }

            /**
             * <p>The fault type. Valid values:</p>
             * <ul>
             * <li>CpuFullloadTask: CPU full load fault.</li>
             * <li>MemLoadTask: memory load fault.</li>
             * <li>NetworkTask: network fault.</li>
             * <li>DiskBurnTask: disk read/write fault.</li>
             * <li>DiskFillTask: disk fill fault.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DiskFillTask</p>
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
