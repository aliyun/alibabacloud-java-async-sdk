// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportPort} extends {@link TeaModel}
 *
 * <p>ExportPort</p>
 */
public class ExportPort extends TeaModel {
    @NameInMap("cidrIP")
    private String cidrIP;

    @NameInMap("portRange")
    private String portRange;

    @NameInMap("protocol")
    private String protocol;

    @NameInMap("unallowed")
    private Boolean unallowed;

    private ExportPort(Builder builder) {
        this.cidrIP = builder.cidrIP;
        this.portRange = builder.portRange;
        this.protocol = builder.protocol;
        this.unallowed = builder.unallowed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportPort create() {
        return builder().build();
    }

    /**
     * @return cidrIP
     */
    public String getCidrIP() {
        return this.cidrIP;
    }

    /**
     * @return portRange
     */
    public String getPortRange() {
        return this.portRange;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return unallowed
     */
    public Boolean getUnallowed() {
        return this.unallowed;
    }

    public static final class Builder {
        private String cidrIP; 
        private String portRange; 
        private String protocol; 
        private Boolean unallowed; 

        /**
         * cidrIP.
         */
        public Builder cidrIP(String cidrIP) {
            this.cidrIP = cidrIP;
            return this;
        }

        /**
         * portRange.
         */
        public Builder portRange(String portRange) {
            this.portRange = portRange;
            return this;
        }

        /**
         * protocol.
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * unallowed.
         */
        public Builder unallowed(Boolean unallowed) {
            this.unallowed = unallowed;
            return this;
        }

        public ExportPort build() {
            return new ExportPort(this);
        } 

    } 

}
