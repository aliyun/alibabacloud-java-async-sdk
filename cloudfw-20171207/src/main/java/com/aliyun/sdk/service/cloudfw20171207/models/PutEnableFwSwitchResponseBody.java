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

    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private PutEnableFwSwitchResponseBody(Builder builder) {
        this.abnormalResourceStatusList = builder.abnormalResourceStatusList;
        this.dryRun = builder.dryRun;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutEnableFwSwitchResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return abnormalResourceStatusList
     */
    public java.util.List<AbnormalResourceStatusList> getAbnormalResourceStatusList() {
        return this.abnormalResourceStatusList;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AbnormalResourceStatusList> abnormalResourceStatusList; 
        private Boolean dryRun; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(PutEnableFwSwitchResponseBody model) {
            this.abnormalResourceStatusList = model.abnormalResourceStatusList;
            this.dryRun = model.dryRun;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status information list for assets that are not synchronized.</p>
         */
        public Builder abnormalResourceStatusList(java.util.List<AbnormalResourceStatusList> abnormalResourceStatusList) {
            this.abnormalResourceStatusList = abnormalResourceStatusList;
            return this;
        }

        /**
         * <p>Indicates whether this response is a dry run success response. A value of true indicates that only the dry run was completed and no actual changes were made. This field is not returned or is set to false for actual calls.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The request ID.</p>
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

            private Builder() {
            } 

            private Builder(AbnormalResourceStatusList model) {
                this.msg = model.msg;
                this.resource = model.resource;
                this.status = model.status;
            } 

            /**
             * <p>The message when the asset is not synchronized. Valid values:</p>
             * <ul>
             * <li>cloudfirewall do not sync this ip address: Cloud Firewall did not synchronize this asset IP address.</li>
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
             * <p>The asset IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>203.0.113.0</p>
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>The status when the asset is not synchronized. Valid values:</p>
             * <ul>
             * <li>ip_not_sync: the asset is not synchronized.</li>
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
