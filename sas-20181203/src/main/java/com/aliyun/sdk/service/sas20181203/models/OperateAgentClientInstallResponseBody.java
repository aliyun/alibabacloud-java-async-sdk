// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link OperateAgentClientInstallResponseBody} extends {@link TeaModel}
 *
 * <p>OperateAgentClientInstallResponseBody</p>
 */
public class OperateAgentClientInstallResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AegisCelintInstallResposeList")
    private java.util.List<AegisCelintInstallResposeList> aegisCelintInstallResposeList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aegisCelintInstallResposeList
     */
    public java.util.List<AegisCelintInstallResposeList> getAegisCelintInstallResposeList() {
        return this.aegisCelintInstallResposeList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AegisCelintInstallResposeList> aegisCelintInstallResposeList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(OperateAgentClientInstallResponseBody model) {
            this.aegisCelintInstallResposeList = model.aegisCelintInstallResposeList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>An array that consists of the returned results.</p>
         */
        public Builder aegisCelintInstallResposeList(java.util.List<AegisCelintInstallResposeList> aegisCelintInstallResposeList) {
            this.aegisCelintInstallResposeList = aegisCelintInstallResposeList;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>AE79B457-877C-51C6-AD72-0D34A025D***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OperateAgentClientInstallResponseBody build() {
            return new OperateAgentClientInstallResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link OperateAgentClientInstallResponseBody} extends {@link TeaModel}
     *
     * <p>OperateAgentClientInstallResponseBody</p>
     */
    public static class AegisCelintInstallResposeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RecordId")
        private Long recordId;

        @com.aliyun.core.annotation.NameInMap("Uuid")
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

            private Builder() {
            } 

            private Builder(AegisCelintInstallResposeList model) {
                this.instanceId = model.instanceId;
                this.recordId = model.recordId;
                this.uuid = model.uuid;
            } 

            /**
             * <p>The ID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>i-uf6j8vq9l4r5ntht****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the installation task.</p>
             * 
             * <strong>example:</strong>
             * <p>2856</p>
             */
            public Builder recordId(Long recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * <p>The UUID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>1587bedb-fdb4-48c4-9330-****</p>
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
