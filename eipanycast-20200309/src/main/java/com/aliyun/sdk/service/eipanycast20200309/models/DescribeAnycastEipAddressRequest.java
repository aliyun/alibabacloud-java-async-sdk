// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

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
 * {@link DescribeAnycastEipAddressRequest} extends {@link RequestModel}
 *
 * <p>DescribeAnycastEipAddressRequest</p>
 */
public class DescribeAnycastEipAddressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnycastId")
    private String anycastId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindInstanceId")
    private String bindInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    private DescribeAnycastEipAddressRequest(Builder builder) {
        super(builder);
        this.anycastId = builder.anycastId;
        this.bindInstanceId = builder.bindInstanceId;
        this.ip = builder.ip;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAnycastEipAddressRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return anycastId
     */
    public String getAnycastId() {
        return this.anycastId;
    }

    /**
     * @return bindInstanceId
     */
    public String getBindInstanceId() {
        return this.bindInstanceId;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    public static final class Builder extends Request.Builder<DescribeAnycastEipAddressRequest, Builder> {
        private String anycastId; 
        private String bindInstanceId; 
        private String ip; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAnycastEipAddressRequest request) {
            super(request);
            this.anycastId = request.anycastId;
            this.bindInstanceId = request.bindInstanceId;
            this.ip = request.ip;
        } 

        /**
         * <p>The ID of the Anycast EIP.</p>
         * <blockquote>
         * <p>You must specify <strong>Ip</strong> or <strong>AnycastId</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aeip-bp1ix34fralt4ykf3****</p>
         */
        public Builder anycastId(String anycastId) {
            this.putQueryParameter("AnycastId", anycastId);
            this.anycastId = anycastId;
            return this;
        }

        /**
         * <p>The ID of the endpoint with which the Anycast EIP is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-2zebb08phyczzawe****</p>
         */
        public Builder bindInstanceId(String bindInstanceId) {
            this.putQueryParameter("BindInstanceId", bindInstanceId);
            this.bindInstanceId = bindInstanceId;
            return this;
        }

        /**
         * <p>The IP address of the Anycast EIP.</p>
         * <blockquote>
         * <p>You must specify <strong>Ip</strong> or <strong>AnycastId</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>139.95.XX.XX</p>
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        @Override
        public DescribeAnycastEipAddressRequest build() {
            return new DescribeAnycastEipAddressRequest(this);
        } 

    } 

}
