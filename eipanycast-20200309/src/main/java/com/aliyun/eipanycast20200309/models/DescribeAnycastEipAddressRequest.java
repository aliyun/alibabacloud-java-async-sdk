// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeAnycastEipAddressRequest} extends {@link RequestModel}
 *
 * <p>DescribeAnycastEipAddressRequest</p>
 */
public class DescribeAnycastEipAddressRequest extends Request {
    @Query
    @NameInMap("AnycastId")
    private String anycastId;

    @Query
    @NameInMap("BindInstanceId")
    private String bindInstanceId;

    @Query
    @NameInMap("Ip")
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

    public static final class Builder extends Request.Builder<Builder> {
        private String anycastId; 
        private String bindInstanceId; 
        private String ip; 

        /**
         * <p>AnycastId.</p>
         */
        public Builder anycastId(String anycastId) {
            this.putQueryParameter("AnycastId", anycastId);
            this.anycastId = anycastId;
            return this;
        }

        /**
         * <p>BindInstanceId.</p>
         */
        public Builder bindInstanceId(String bindInstanceId) {
            this.putQueryParameter("BindInstanceId", bindInstanceId);
            this.bindInstanceId = bindInstanceId;
            return this;
        }

        /**
         * <p>Ip.</p>
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        public DescribeAnycastEipAddressRequest build() {
            return new DescribeAnycastEipAddressRequest(this);
        } 

    } 

}
