// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sasti20200512.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpReportRequest} extends {@link RequestModel}
 *
 * <p>DescribeIpReportRequest</p>
 */
public class DescribeIpReportRequest extends Request {
    @Query
    @NameInMap("Field")
    private String field;

    @Query
    @NameInMap("Ip")
    @Validation(required = true)
    private String ip;

    @Query
    @NameInMap("ServiceLang")
    private String serviceLang;

    private DescribeIpReportRequest(Builder builder) {
        super(builder);
        this.field = builder.field;
        this.ip = builder.ip;
        this.serviceLang = builder.serviceLang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return serviceLang
     */
    public String getServiceLang() {
        return this.serviceLang;
    }

    public static final class Builder extends Request.Builder<DescribeIpReportRequest, Builder> {
        private String field; 
        private String ip; 
        private String serviceLang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIpReportRequest request) {
            super(request);
            this.field = request.field;
            this.ip = request.ip;
            this.serviceLang = request.serviceLang;
        } 

        /**
         * Field.
         */
        public Builder field(String field) {
            this.putQueryParameter("Field", field);
            this.field = field;
            return this;
        }

        /**
         * Ip.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * ServiceLang.
         */
        public Builder serviceLang(String serviceLang) {
            this.putQueryParameter("ServiceLang", serviceLang);
            this.serviceLang = serviceLang;
            return this;
        }

        @Override
        public DescribeIpReportRequest build() {
            return new DescribeIpReportRequest(this);
        } 

    } 

}
