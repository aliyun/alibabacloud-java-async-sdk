// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutEnableFwSwitchResponseBody} extends {@link TeaModel}
 *
 * <p>PutEnableFwSwitchResponseBody</p>
 */
public class PutEnableFwSwitchResponseBody extends TeaModel {
    @NameInMap("AbnormalResourceStatusList")
    private java.util.List < AbnormalResourceStatusList> abnormalResourceStatusList;

    @NameInMap("RequestId")
    private String requestId;

    private PutEnableFwSwitchResponseBody(Builder builder) {
        this.abnormalResourceStatusList = builder.abnormalResourceStatusList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutEnableFwSwitchResponseBody create() {
        return builder().build();
    }

    /**
     * @return abnormalResourceStatusList
     */
    public java.util.List < AbnormalResourceStatusList> getAbnormalResourceStatusList() {
        return this.abnormalResourceStatusList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AbnormalResourceStatusList> abnormalResourceStatusList; 
        private String requestId; 

        /**
         * The status information of the asset when it is not synchronized to Cloud Firewall.
         */
        public Builder abnormalResourceStatusList(java.util.List < AbnormalResourceStatusList> abnormalResourceStatusList) {
            this.abnormalResourceStatusList = abnormalResourceStatusList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PutEnableFwSwitchResponseBody build() {
            return new PutEnableFwSwitchResponseBody(this);
        } 

    } 

    public static class AbnormalResourceStatusList extends TeaModel {
        @NameInMap("Msg")
        private String msg;

        @NameInMap("Resource")
        private String resource;

        @NameInMap("Status")
        private String status;

        private AbnormalResourceStatusList(Builder builder) {
            this.msg = builder.msg;
            this.resource = builder.resource;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AbnormalResourceStatusList create() {
            return builder().build();
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String msg; 
            private String resource; 
            private String status; 

            /**
             * The message displayed when the asset is not synchronized to Cloud Firewall. Valid values:
             * <p>
             * 
             * *   cloudfirewall do not sync this ip address: This IP address is not synchronized to Cloud Firewall.
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * The IP address of the asset.
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * The status of the asset when it is not synchronized to Cloud Firewall. Valid values:
             * <p>
             * 
             * *   ip_not_sync: The asset is not synchronized.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AbnormalResourceStatusList build() {
                return new AbnormalResourceStatusList(this);
            } 

        } 

    }
}
