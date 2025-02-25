// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.beian20160810.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertUnbeianIpCheckTypeRequest} extends {@link RequestModel}
 *
 * <p>InsertUnbeianIpCheckTypeRequest</p>
 */
public class InsertUnbeianIpCheckTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Caller")
    @com.aliyun.core.annotation.Validation(required = true)
    private String caller;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer checkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    private InsertUnbeianIpCheckTypeRequest(Builder builder) {
        super(builder);
        this.caller = builder.caller;
        this.checkType = builder.checkType;
        this.ip = builder.ip;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertUnbeianIpCheckTypeRequest create() {
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
     * @return checkType
     */
    public Integer getCheckType() {
        return this.checkType;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<InsertUnbeianIpCheckTypeRequest, Builder> {
        private String caller; 
        private Integer checkType; 
        private String ip; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(InsertUnbeianIpCheckTypeRequest request) {
            super(request);
            this.caller = request.caller;
            this.checkType = request.checkType;
            this.ip = request.ip;
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
         * CheckType.
         */
        public Builder checkType(Integer checkType) {
            this.putQueryParameter("CheckType", checkType);
            this.checkType = checkType;
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
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public InsertUnbeianIpCheckTypeRequest build() {
            return new InsertUnbeianIpCheckTypeRequest(this);
        } 

    } 

}
