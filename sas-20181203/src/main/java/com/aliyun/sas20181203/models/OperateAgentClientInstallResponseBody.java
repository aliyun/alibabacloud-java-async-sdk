// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link OperateAgentClientInstallResponseBody} extends {@link TeaModel}
 *
 * <p>OperateAgentClientInstallResponseBody</p>
 */
public class OperateAgentClientInstallResponseBody extends TeaModel {
    @NameInMap("AegisCelintInstallResposeList")
    private java.util.List < AegisCelintInstallResposeList> aegisCelintInstallResposeList;

    @NameInMap("RequestId")
    private String requestId;


    private OperateAgentClientInstallResponseBody(Builder builder) {
        this.aegisCelintInstallResposeList = builder.aegisCelintInstallResposeList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateAgentClientInstallResponseBody create() {
        return builder().build();
    }

    /**
     * @return aegisCelintInstallResposeList
     */
    public java.util.List < AegisCelintInstallResposeList> getAegisCelintInstallResposeList() {
        return this.aegisCelintInstallResposeList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AegisCelintInstallResposeList> aegisCelintInstallResposeList; 
        private String requestId; 

        /**
         * <p>AegisCelintInstallResposeList.</p>
         */
        public Builder aegisCelintInstallResposeList(java.util.List < AegisCelintInstallResposeList> aegisCelintInstallResposeList) {
            this.aegisCelintInstallResposeList = aegisCelintInstallResposeList;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OperateAgentClientInstallResponseBody build() {
            return new OperateAgentClientInstallResponseBody(this);
        } 

    } 

    public static class AegisCelintInstallResposeList extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("RecordId")
        private Long recordId;

        @NameInMap("Uuid")
        private String uuid;


        private AegisCelintInstallResposeList(Builder builder) {
            this.instanceId = builder.instanceId;
            this.recordId = builder.recordId;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AegisCelintInstallResposeList create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return recordId
         */
        public Long getRecordId() {
            return this.recordId;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String instanceId; 
            private Long recordId; 
            private String uuid; 

            /**
             * <p>InstanceId.</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>RecordId.</p>
             */
            public Builder recordId(Long recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * <p>Uuid.</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public AegisCelintInstallResposeList build() {
                return new AegisCelintInstallResposeList(this);
            } 

        } 

    }
}
