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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(Notification model) {
            this.extendedMessageURI = model.extendedMessageURI;
            this.MNS = model.MNS;
            this.rocketMQ = model.rocketMQ;
        } 

        /**
         * <p>Use an Object Storage Service (OSS) file to receive task notifications. If you provide the URI of this file, detailed task execution information is written to the file in a JSON structure. Normally, you receive notifications through <a href="https://help.aliyun.com/document_detail/161886.html">EventBridge</a>, <a href="https://help.aliyun.com/document_detail/27412.html">MNS</a>, or <a href="https://help.aliyun.com/document_detail/29530.html">RocketMQ</a>. However, some tasks generate large amounts of information, such as archive previews or decompression tasks. For these tasks, provide this file to get the complete execution results.</p>
         * <p>The OSS URI format is oss\://${Bucket}/${Object}. <code>${Bucket}</code> is the name of an OSS bucket in the same region as the current project. <code>${Object}</code> is the full path of the file, including the file name extension.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>This file is not a notification method. It only serves as a medium to receive detailed task execution information. Task status is sent through standard message notifications. This file contains only the detailed execution information.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object.json</p>
         */
        public Builder extendedMessageURI(String extendedMessageURI) {
            this.extendedMessageURI = extendedMessageURI;
            return this;
        }

        /**
         * <p>The MNS notification parameter object.</p>
         */
        public Builder MNS(MNS MNS) {
            this.MNS = MNS;
            return this;
        }

        /**
         * <p>The RocketMQ notification parameter object.</p>
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
