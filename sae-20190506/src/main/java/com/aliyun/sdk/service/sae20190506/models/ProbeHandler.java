// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ProbeHandler} extends {@link TeaModel}
 *
 * <p>ProbeHandler</p>
 */
public class ProbeHandler extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HttpGet")
    private HTTPGetAction httpGet;

    @com.aliyun.core.annotation.NameInMap("TcpSocket")
    private TCPSocketAction tcpSocket;

    private ProbeHandler(Builder builder) {
        this.httpGet = builder.httpGet;
        this.tcpSocket = builder.tcpSocket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProbeHandler create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return httpGet
     */
    public HTTPGetAction getHttpGet() {
        return this.httpGet;
    }

    /**
     * @return tcpSocket
     */
    public TCPSocketAction getTcpSocket() {
        return this.tcpSocket;
    }

    public static final class Builder {
        private HTTPGetAction httpGet; 
        private TCPSocketAction tcpSocket; 

        private Builder() {
        } 

        private Builder(ProbeHandler model) {
            this.httpGet = model.httpGet;
            this.tcpSocket = model.tcpSocket;
        } 

        /**
         * HttpGet.
         */
        public Builder httpGet(HTTPGetAction httpGet) {
            this.httpGet = httpGet;
            return this;
        }

        /**
         * TcpSocket.
         */
        public Builder tcpSocket(TCPSocketAction tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }

        public ProbeHandler build() {
            return new ProbeHandler(this);
        } 

    } 

}
