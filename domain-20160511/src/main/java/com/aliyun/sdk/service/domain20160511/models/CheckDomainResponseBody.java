// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20160511.models;

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
 * {@link CheckDomainResponseBody} extends {@link TeaModel}
 *
 * <p>CheckDomainResponseBody</p>
 */
public class CheckDomainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Avail")
    private Integer avail;

    @com.aliyun.core.annotation.NameInMap("FeeCommand")
    private String feeCommand;

    @com.aliyun.core.annotation.NameInMap("FeeCurrency")
    private String feeCurrency;

    @com.aliyun.core.annotation.NameInMap("FeeFee")
    private String feeFee;

    @com.aliyun.core.annotation.NameInMap("FeePeriod")
    private Integer feePeriod;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RmbFee")
    private String rmbFee;

    private CheckDomainResponseBody(Builder builder) {
        this.avail = builder.avail;
        this.feeCommand = builder.feeCommand;
        this.feeCurrency = builder.feeCurrency;
        this.feeFee = builder.feeFee;
        this.feePeriod = builder.feePeriod;
        this.name = builder.name;
        this.reason = builder.reason;
        this.requestId = builder.requestId;
        this.rmbFee = builder.rmbFee;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDomainResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return avail
     */
    public Integer getAvail() {
        return this.avail;
    }

    /**
     * @return feeCommand
     */
    public String getFeeCommand() {
        return this.feeCommand;
    }

    /**
     * @return feeCurrency
     */
    public String getFeeCurrency() {
        return this.feeCurrency;
    }

    /**
     * @return feeFee
     */
    public String getFeeFee() {
        return this.feeFee;
    }

    /**
     * @return feePeriod
     */
    public Integer getFeePeriod() {
        return this.feePeriod;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rmbFee
     */
    public String getRmbFee() {
        return this.rmbFee;
    }

    public static final class Builder {
        private Integer avail; 
        private String feeCommand; 
        private String feeCurrency; 
        private String feeFee; 
        private Integer feePeriod; 
        private String name; 
        private String reason; 
        private String requestId; 
        private String rmbFee; 

        private Builder() {
        } 

        private Builder(CheckDomainResponseBody model) {
            this.avail = model.avail;
            this.feeCommand = model.feeCommand;
            this.feeCurrency = model.feeCurrency;
            this.feeFee = model.feeFee;
            this.feePeriod = model.feePeriod;
            this.name = model.name;
            this.reason = model.reason;
            this.requestId = model.requestId;
            this.rmbFee = model.rmbFee;
        } 

        /**
         * Avail.
         */
        public Builder avail(Integer avail) {
            this.avail = avail;
            return this;
        }

        /**
         * FeeCommand.
         */
        public Builder feeCommand(String feeCommand) {
            this.feeCommand = feeCommand;
            return this;
        }

        /**
         * FeeCurrency.
         */
        public Builder feeCurrency(String feeCurrency) {
            this.feeCurrency = feeCurrency;
            return this;
        }

        /**
         * FeeFee.
         */
        public Builder feeFee(String feeFee) {
            this.feeFee = feeFee;
            return this;
        }

        /**
         * FeePeriod.
         */
        public Builder feePeriod(Integer feePeriod) {
            this.feePeriod = feePeriod;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Reason.
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RmbFee.
         */
        public Builder rmbFee(String rmbFee) {
            this.rmbFee = rmbFee;
            return this;
        }

        public CheckDomainResponseBody build() {
            return new CheckDomainResponseBody(this);
        } 

    } 

}
