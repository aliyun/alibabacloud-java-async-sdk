// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.beian20160810.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ManageAccessorIpRequest} extends {@link RequestModel}
 *
 * <p>ManageAccessorIpRequest</p>
 */
public class ManageAccessorIpRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Caller")
    @com.aliyun.core.annotation.Validation(required = true)
    private String caller;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer ipVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    private ManageAccessorIpRequest(Builder builder) {
        super(builder);
        this.caller = builder.caller;
        this.ip = builder.ip;
        this.ipVersion = builder.ipVersion;
        this.operation = builder.operation;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ManageAccessorIpRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caller
     */
    public String getCaller() {
        return this.caller;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return ipVersion
     */
    public Integer getIpVersion() {
        return this.ipVersion;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<ManageAccessorIpRequest, Builder> {
        private String caller; 
        private String ip; 
        private Integer ipVersion; 
        private String operation; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(ManageAccessorIpRequest request) {
            super(request);
            this.caller = request.caller;
            this.ip = request.ip;
            this.ipVersion = request.ipVersion;
            this.operation = request.operation;
            this.remark = request.remark;
        } 

        /**
         * Caller.
         */
        public Builder caller(String caller) {
            this.putQueryParameter("Caller", caller);
            this.caller = caller;
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
         * IpVersion.
         */
        public Builder ipVersion(Integer ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * Operation.
         */
        public Builder operation(String operation) {
            this.putQueryParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public ManageAccessorIpRequest build() {
            return new ManageAccessorIpRequest(this);
        } 

    } 

}
