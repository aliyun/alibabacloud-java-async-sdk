// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link DoLogicalDeleteResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DoLogicalDeleteResourceResponseBody</p>
 */
public class DoLogicalDeleteResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Bid")
    private String bid;

    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.NameInMap("GmtWakeup")
    private String gmtWakeup;

    @com.aliyun.core.annotation.NameInMap("Hid")
    private Long hid;

    @com.aliyun.core.annotation.NameInMap("Interrupt")
    private Boolean interrupt;

    @com.aliyun.core.annotation.NameInMap("Invoker")
    private String invoker;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Pk")
    private String pk;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TaskExtraData")
    private String taskExtraData;

    @com.aliyun.core.annotation.NameInMap("TaskIdentifier")
    private String taskIdentifier;

    private DoLogicalDeleteResourceResponseBody(Builder builder) {
        this.bid = builder.bid;
        this.country = builder.country;
        this.gmtWakeup = builder.gmtWakeup;
        this.hid = builder.hid;
        this.interrupt = builder.interrupt;
        this.invoker = builder.invoker;
        this.message = builder.message;
        this.pk = builder.pk;
        this.success = builder.success;
        this.taskExtraData = builder.taskExtraData;
        this.taskIdentifier = builder.taskIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DoLogicalDeleteResourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bid
     */
    public String getBid() {
        return this.bid;
    }

    /**
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @return gmtWakeup
     */
    public String getGmtWakeup() {
        return this.gmtWakeup;
    }

    /**
     * @return hid
     */
    public Long getHid() {
        return this.hid;
    }

    /**
     * @return interrupt
     */
    public Boolean getInterrupt() {
        return this.interrupt;
    }

    /**
     * @return invoker
     */
    public String getInvoker() {
        return this.invoker;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pk
     */
    public String getPk() {
        return this.pk;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return taskExtraData
     */
    public String getTaskExtraData() {
        return this.taskExtraData;
    }

    /**
     * @return taskIdentifier
     */
    public String getTaskIdentifier() {
        return this.taskIdentifier;
    }

    public static final class Builder {
        private String bid; 
        private String country; 
        private String gmtWakeup; 
        private Long hid; 
        private Boolean interrupt; 
        private String invoker; 
        private String message; 
        private String pk; 
        private Boolean success; 
        private String taskExtraData; 
        private String taskIdentifier; 

        private Builder() {
        } 

        private Builder(DoLogicalDeleteResourceResponseBody model) {
            this.bid = model.bid;
            this.country = model.country;
            this.gmtWakeup = model.gmtWakeup;
            this.hid = model.hid;
            this.interrupt = model.interrupt;
            this.invoker = model.invoker;
            this.message = model.message;
            this.pk = model.pk;
            this.success = model.success;
            this.taskExtraData = model.taskExtraData;
            this.taskIdentifier = model.taskIdentifier;
        } 

        /**
         * Bid.
         */
        public Builder bid(String bid) {
            this.bid = bid;
            return this;
        }

        /**
         * Country.
         */
        public Builder country(String country) {
            this.country = country;
            return this;
        }

        /**
         * GmtWakeup.
         */
        public Builder gmtWakeup(String gmtWakeup) {
            this.gmtWakeup = gmtWakeup;
            return this;
        }

        /**
         * Hid.
         */
        public Builder hid(Long hid) {
            this.hid = hid;
            return this;
        }

        /**
         * Interrupt.
         */
        public Builder interrupt(Boolean interrupt) {
            this.interrupt = interrupt;
            return this;
        }

        /**
         * Invoker.
         */
        public Builder invoker(String invoker) {
            this.invoker = invoker;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Pk.
         */
        public Builder pk(String pk) {
            this.pk = pk;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TaskExtraData.
         */
        public Builder taskExtraData(String taskExtraData) {
            this.taskExtraData = taskExtraData;
            return this;
        }

        /**
         * TaskIdentifier.
         */
        public Builder taskIdentifier(String taskIdentifier) {
            this.taskIdentifier = taskIdentifier;
            return this;
        }

        public DoLogicalDeleteResourceResponseBody build() {
            return new DoLogicalDeleteResourceResponseBody(this);
        } 

    } 

}
