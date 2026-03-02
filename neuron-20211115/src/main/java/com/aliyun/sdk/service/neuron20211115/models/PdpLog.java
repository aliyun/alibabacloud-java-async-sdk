// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link PdpLog} extends {@link TeaModel}
 *
 * <p>PdpLog</p>
 */
public class PdpLog extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("ip")
    private String ip;

    private PdpLog(Builder builder) {
        this.content = builder.content;
        this.ip = builder.ip;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PdpLog create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    public static final class Builder {
        private String content; 
        private String ip; 

        private Builder() {
        } 

        private Builder(PdpLog model) {
            this.content = model.content;
            this.ip = model.ip;
        } 

        /**
         * content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * ip.
         */
        public Builder ip(String ip) {
            this.ip = ip;
            return this;
        }

        public PdpLog build() {
            return new PdpLog(this);
        } 

    } 

}
