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
 * {@link UnbindNlbRequest} extends {@link RequestModel}
 *
 * <p>UnbindNlbRequest</p>
 */
public class UnbindNlbRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NlbId")
    private String nlbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    private UnbindNlbRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.nlbId = builder.nlbId;
        this.port = builder.port;
        this.protocol = builder.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindNlbRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return nlbId
     */
    public String getNlbId() {
        return this.nlbId;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    public static final class Builder extends Request.Builder<UnbindNlbRequest, Builder> {
        private String appId; 
        private String nlbId; 
        private Integer port; 
        private String protocol; 

        private Builder() {
            super();
        } 

        private Builder(UnbindNlbRequest request) {
            super(request);
            this.appId = request.appId;
            this.nlbId = request.nlbId;
            this.port = request.port;
            this.protocol = request.protocol;
        } 

        /**
         * <p>A short description of struct</p>
         * 
         * <strong>example:</strong>
         * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The ID of NLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>nlb-7z7jjbzz44d82c9***</p>
         */
        public Builder nlbId(String nlbId) {
            this.putQueryParameter("NlbId", nlbId);
            this.nlbId = nlbId;
            return this;
        }

        /**
         * <p>The listener port of the instance. Valid values: 0 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The type of the protocol. Valid values:</p>
         * <ul>
         * <li><strong>TCP</strong>.</li>
         * <li><strong>UDP</strong>.</li>
         * <li><strong>TCPSSL</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        @Override
        public UnbindNlbRequest build() {
            return new UnbindNlbRequest(this);
        } 

    } 

}
