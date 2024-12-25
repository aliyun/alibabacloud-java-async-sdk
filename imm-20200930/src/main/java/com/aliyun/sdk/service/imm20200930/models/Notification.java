// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link Notification} extends {@link TeaModel}
 *
 * <p>Notification</p>
 */
public class Notification extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExtendedMessageURI")
    private String extendedMessageURI;

    @com.aliyun.core.annotation.NameInMap("MNS")
    private MNS MNS;

    @com.aliyun.core.annotation.NameInMap("RocketMQ")
    private RocketMQ rocketMQ;

    private Notification(Builder builder) {
        this.extendedMessageURI = builder.extendedMessageURI;
        this.MNS = builder.MNS;
        this.rocketMQ = builder.rocketMQ;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Notification create() {
        return builder().build();
    }

    /**
     * @return extendedMessageURI
     */
    public String getExtendedMessageURI() {
        return this.extendedMessageURI;
    }

    /**
     * @return MNS
     */
    public MNS getMNS() {
        return this.MNS;
    }

    /**
     * @return rocketMQ
     */
    public RocketMQ getRocketMQ() {
        return this.rocketMQ;
    }

    public static final class Builder {
        private String extendedMessageURI; 
        private MNS MNS; 
        private RocketMQ rocketMQ; 

        /**
         * ExtendedMessageURI.
         */
        public Builder extendedMessageURI(String extendedMessageURI) {
            this.extendedMessageURI = extendedMessageURI;
            return this;
        }

        /**
         * MNS.
         */
        public Builder MNS(MNS MNS) {
            this.MNS = MNS;
            return this;
        }

        /**
         * RocketMQ.
         */
        public Builder rocketMQ(RocketMQ rocketMQ) {
            this.rocketMQ = rocketMQ;
            return this;
        }

        public Notification build() {
            return new Notification(this);
        } 

    } 

}
