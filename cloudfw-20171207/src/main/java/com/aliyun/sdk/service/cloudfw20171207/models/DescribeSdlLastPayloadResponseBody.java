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
 * {@link DescribeSdlLastPayloadResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSdlLastPayloadResponseBody</p>
 */
public class DescribeSdlLastPayloadResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DstPortList")
    private String dstPortList;

    @com.aliyun.core.annotation.NameInMap("Payload")
    private String payload;

    @com.aliyun.core.annotation.NameInMap("ProtoList")
    private String protoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SrcPortList")
    private String srcPortList;

    private DescribeSdlLastPayloadResponseBody(Builder builder) {
        this.dstPortList = builder.dstPortList;
        this.payload = builder.payload;
        this.protoList = builder.protoList;
        this.requestId = builder.requestId;
        this.srcPortList = builder.srcPortList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSdlLastPayloadResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dstPortList
     */
    public String getDstPortList() {
        return this.dstPortList;
    }

    /**
     * @return payload
     */
    public String getPayload() {
        return this.payload;
    }

    /**
     * @return protoList
     */
    public String getProtoList() {
        return this.protoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return srcPortList
     */
    public String getSrcPortList() {
        return this.srcPortList;
    }

    public static final class Builder {
        private String dstPortList; 
        private String payload; 
        private String protoList; 
        private String requestId; 
        private String srcPortList; 

        private Builder() {
        } 

        private Builder(DescribeSdlLastPayloadResponseBody model) {
            this.dstPortList = model.dstPortList;
            this.payload = model.payload;
            this.protoList = model.protoList;
            this.requestId = model.requestId;
            this.srcPortList = model.srcPortList;
        } 

        /**
         * DstPortList.
         */
        public Builder dstPortList(String dstPortList) {
            this.dstPortList = dstPortList;
            return this;
        }

        /**
         * Payload.
         */
        public Builder payload(String payload) {
            this.payload = payload;
            return this;
        }

        /**
         * ProtoList.
         */
        public Builder protoList(String protoList) {
            this.protoList = protoList;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SrcPortList.
         */
        public Builder srcPortList(String srcPortList) {
            this.srcPortList = srcPortList;
            return this;
        }

        public DescribeSdlLastPayloadResponseBody build() {
            return new DescribeSdlLastPayloadResponseBody(this);
        } 

    } 

}
