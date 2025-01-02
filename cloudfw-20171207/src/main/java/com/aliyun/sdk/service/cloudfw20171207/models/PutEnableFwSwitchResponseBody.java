// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link PutEnableFwSwitchResponseBody} extends {@link TeaModel}
 *
 * <p>PutEnableFwSwitchResponseBody</p>
 */
public class PutEnableFwSwitchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AbnormalResourceStatusList")
    private java.util.List<AbnormalResourceStatusList> abnormalResourceStatusList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
    public java.util.List<AbnormalResourceStatusList> getAbnormalResourceStatusList() {
        return this.abnormalResourceStatusList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AbnormalResourceStatusList> abnormalResourceStatusList; 
        private String requestId; 

        /**
         * <p>The status information of the asset when it is not synchronized to Cloud Firewall.</p>
         */
        public Builder abnormalResourceStatusList(java.util.List<AbnormalResourceStatusList> abnormalResourceStatusList) {
            this.abnormalResourceStatusList = abnormalResourceStatusList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B2841452-CB8D-4F7D-B247-38E1CF7334F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PutEnableFwSwitchResponseBody build() {
            return new PutEnableFwSwitchResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PutEnableFwSwitchResponseBody} extends {@link TeaModel}
     *
     * <p>PutEnableFwSwitchResponseBody</p>
     */
    public static class AbnormalResourceStatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private String resource;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The message displayed when the asset is not synchronized to Cloud Firewall. Valid values:</p>
             * <ul>
             * <li>cloudfirewall do not sync this ip address: This IP address is not synchronized to Cloud Firewall.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloudfirewall do not sync this ip address</p>
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * <p>The IP address of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>203.0.113.0</p>
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>The status of the asset when it is not synchronized to Cloud Firewall. Valid values:</p>
             * <ul>
             * <li>ip_not_sync: The asset is not synchronized.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ip_not_sync</p>
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
