// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.beian20160810.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ManageAccessorDomainWhiteListRequest} extends {@link RequestModel}
 *
 * <p>ManageAccessorDomainWhiteListRequest</p>
 */
public class ManageAccessorDomainWhiteListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Caller")
    @com.aliyun.core.annotation.Validation(required = true)
    private String caller;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domains")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > domains;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private ManageAccessorDomainWhiteListRequest(Builder builder) {
        super(builder);
        this.caller = builder.caller;
        this.domains = builder.domains;
        this.endTime = builder.endTime;
        this.operation = builder.operation;
        this.remark = builder.remark;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ManageAccessorDomainWhiteListRequest create() {
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
     * @return domains
     */
    public java.util.List < String > getDomains() {
        return this.domains;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
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

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ManageAccessorDomainWhiteListRequest, Builder> {
        private String caller; 
        private java.util.List < String > domains; 
        private String endTime; 
        private String operation; 
        private String remark; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(ManageAccessorDomainWhiteListRequest request) {
            super(request);
            this.caller = request.caller;
            this.domains = request.domains;
            this.endTime = request.endTime;
            this.operation = request.operation;
            this.remark = request.remark;
            this.startTime = request.startTime;
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
         * Domains.
         */
        public Builder domains(java.util.List < String > domains) {
            this.putQueryParameter("Domains", domains);
            this.domains = domains;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ManageAccessorDomainWhiteListRequest build() {
            return new ManageAccessorDomainWhiteListRequest(this);
        } 

    } 

}
