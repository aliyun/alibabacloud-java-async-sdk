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
 * {@link DataInstancesValueListenersValue} extends {@link TeaModel}
 *
 * <p>DataInstancesValueListenersValue</p>
 */
public class DataInstancesValueListenersValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TargetPort")
    private Integer targetPort;

    @com.aliyun.core.annotation.NameInMap("CertIds")
    private String certIds;

    private DataInstancesValueListenersValue(Builder builder) {
        this.protocol = builder.protocol;
        this.port = builder.port;
        this.status = builder.status;
        this.targetPort = builder.targetPort;
        this.certIds = builder.certIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataInstancesValueListenersValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return targetPort
     */
    public Integer getTargetPort() {
        return this.targetPort;
    }

    /**
     * @return certIds
     */
    public String getCertIds() {
        return this.certIds;
    }

    public static final class Builder {
        private String protocol; 
        private Integer port; 
        private String status; 
        private Integer targetPort; 
        private String certIds; 

        private Builder() {
        } 

        private Builder(DataInstancesValueListenersValue model) {
            this.protocol = model.protocol;
            this.port = model.port;
            this.status = model.status;
            this.targetPort = model.targetPort;
            this.certIds = model.certIds;
        } 

        /**
         * <p>The listener protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>TCPSSL</p>
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The listener port of the NLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        /**
         * <p>The status of the NLB listener.</p>
         * <ul>
         * <li><strong>Creating</strong>: The listener is being created.</li>
         * <li><strong>Configuring</strong>: The listener is being configured.</li>
         * <li><strong>Bounded</strong>: The listener runs as expected.</li>
         * <li><strong>Unbinding</strong>: The listener is being deleted.</li>
         * <li><strong>Failed</strong>: The listener is unavailable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Bounded</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The open ports of the NLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        public Builder targetPort(Integer targetPort) {
            this.targetPort = targetPort;
            return this;
        }

        /**
         * <p>The server certificates.</p>
         * 
         * <strong>example:</strong>
         * <p>123157******</p>
         */
        public Builder certIds(String certIds) {
            this.certIds = certIds;
            return this;
        }

        public DataInstancesValueListenersValue build() {
            return new DataInstancesValueListenersValue(this);
        } 

    } 

}
