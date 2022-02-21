// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceIpWhiteListResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceIpWhiteListResponseBody</p>
 */
public class GetInstanceIpWhiteListResponseBody extends TeaModel {
    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("IpList")
    private java.util.List < String > ipList;

    @NameInMap("RequestId")
    private String requestId;

    private GetInstanceIpWhiteListResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.ipList = builder.ipList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceIpWhiteListResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ipList
     */
    public java.util.List < String > getIpList() {
        return this.ipList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String instanceId; 
        private java.util.List < String > ipList; 
        private String requestId; 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IpList.
         */
        public Builder ipList(java.util.List < String > ipList) {
            this.ipList = ipList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceIpWhiteListResponseBody build() {
            return new GetInstanceIpWhiteListResponseBody(this);
        } 

    } 

}
