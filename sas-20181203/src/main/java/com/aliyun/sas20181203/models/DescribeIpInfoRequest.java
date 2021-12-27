// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeIpInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeIpInfoRequest</p>
 */
public class DescribeIpInfoRequest extends Request {
    @Query
    @NameInMap("Field")
    private String field;

    @Query
    @NameInMap("Ip")
    private String ip;


    private DescribeIpInfoRequest(Builder builder) {
        super(builder);
        this.field = builder.field;
        this.ip = builder.ip;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpInfoRequest create() {
        return builder().build();
    }

    /**
     * @return field
     */
    public String getField() {
        return this.field;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String field; 
        private String ip; 

        /**
         * <p>Field.</p>
         */
        public Builder field(String field) {
            this.putQueryParameter("Field", field);
            this.field = field;
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

        public DescribeIpInfoRequest build() {
            return new DescribeIpInfoRequest(this);
        } 

    } 

}
