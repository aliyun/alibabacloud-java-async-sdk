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
 * {@link DoLogicalDeleteResourceRequest} extends {@link RequestModel}
 *
 * <p>DoLogicalDeleteResourceRequest</p>
 */
public class DoLogicalDeleteResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Country")
    @com.aliyun.core.annotation.Validation(required = true)
    private String country;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GmtWakeup")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gmtWakeup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Hid")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long hid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interrupt")
    private Boolean interrupt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Invoker")
    @com.aliyun.core.annotation.Validation(required = true)
    private String invoker;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskExtraData")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskExtraData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskIdentifier;

    private DoLogicalDeleteResourceRequest(Builder builder) {
        super(builder);
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

    public static DoLogicalDeleteResourceRequest create() {
        return builder().build();
    }

@Override
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

    public static final class Builder extends Request.Builder<DoLogicalDeleteResourceRequest, Builder> {
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
            super();
        } 

        private Builder(DoLogicalDeleteResourceRequest request) {
            super(request);
            this.bid = request.bid;
            this.country = request.country;
            this.gmtWakeup = request.gmtWakeup;
            this.hid = request.hid;
            this.interrupt = request.interrupt;
            this.invoker = request.invoker;
            this.message = request.message;
            this.pk = request.pk;
            this.success = request.success;
            this.taskExtraData = request.taskExtraData;
            this.taskIdentifier = request.taskIdentifier;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder bid(String bid) {
            this.putQueryParameter("Bid", bid);
            this.bid = bid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder country(String country) {
            this.putQueryParameter("Country", country);
            this.country = country;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder gmtWakeup(String gmtWakeup) {
            this.putQueryParameter("GmtWakeup", gmtWakeup);
            this.gmtWakeup = gmtWakeup;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder hid(Long hid) {
            this.putQueryParameter("Hid", hid);
            this.hid = hid;
            return this;
        }

        /**
         * Interrupt.
         */
        public Builder interrupt(Boolean interrupt) {
            this.putQueryParameter("Interrupt", interrupt);
            this.interrupt = interrupt;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder invoker(String invoker) {
            this.putQueryParameter("Invoker", invoker);
            this.invoker = invoker;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.putQueryParameter("Message", message);
            this.message = message;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pk(String pk) {
            this.putQueryParameter("Pk", pk);
            this.pk = pk;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.putQueryParameter("Success", success);
            this.success = success;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder taskExtraData(String taskExtraData) {
            this.putQueryParameter("TaskExtraData", taskExtraData);
            this.taskExtraData = taskExtraData;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder taskIdentifier(String taskIdentifier) {
            this.putQueryParameter("TaskIdentifier", taskIdentifier);
            this.taskIdentifier = taskIdentifier;
            return this;
        }

        @Override
        public DoLogicalDeleteResourceRequest build() {
            return new DoLogicalDeleteResourceRequest(this);
        } 

    } 

}
