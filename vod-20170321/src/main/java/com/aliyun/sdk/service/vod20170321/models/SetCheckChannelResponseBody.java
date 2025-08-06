// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link SetCheckChannelResponseBody} extends {@link TeaModel}
 *
 * <p>SetCheckChannelResponseBody</p>
 */
public class SetCheckChannelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Audit")
    private Audit audit;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SetCheckChannelResponseBody(Builder builder) {
        this.audit = builder.audit;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetCheckChannelResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audit
     */
    public Audit getAudit() {
        return this.audit;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Audit audit; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SetCheckChannelResponseBody model) {
            this.audit = model.audit;
            this.requestId = model.requestId;
        } 

        /**
         * Audit.
         */
        public Builder audit(Audit audit) {
            this.audit = audit;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetCheckChannelResponseBody build() {
            return new SetCheckChannelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SetCheckChannelResponseBody} extends {@link TeaModel}
     *
     * <p>SetCheckChannelResponseBody</p>
     */
    public static class Audit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channel")
        private String channel;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CustomerId")
        private String customerId;

        @com.aliyun.core.annotation.NameInMap("LegalSwitch")
        private String legalSwitch;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Audit(Builder builder) {
            this.channel = builder.channel;
            this.createTime = builder.createTime;
            this.customerId = builder.customerId;
            this.legalSwitch = builder.legalSwitch;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Audit create() {
            return builder().build();
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return customerId
         */
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return legalSwitch
         */
        public String getLegalSwitch() {
            return this.legalSwitch;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String channel; 
            private String createTime; 
            private String customerId; 
            private String legalSwitch; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(Audit model) {
                this.channel = model.channel;
                this.createTime = model.createTime;
                this.customerId = model.customerId;
                this.legalSwitch = model.legalSwitch;
                this.updateTime = model.updateTime;
            } 

            /**
             * Channel.
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CustomerId.
             */
            public Builder customerId(String customerId) {
                this.customerId = customerId;
                return this;
            }

            /**
             * LegalSwitch.
             */
            public Builder legalSwitch(String legalSwitch) {
                this.legalSwitch = legalSwitch;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Audit build() {
                return new Audit(this);
            } 

        } 

    }
}
