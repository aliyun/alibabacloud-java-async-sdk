// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LogicalDeleteResourceRequest} extends {@link RequestModel}
 *
 * <p>LogicalDeleteResourceRequest</p>
 */
public class LogicalDeleteResourceRequest extends Request {
    @Query
    @NameInMap("Bid")
    @Validation(required = true)
    private String bid;

    @Query
    @NameInMap("Country")
    @Validation(required = true)
    private String country;

    @Query
    @NameInMap("GmtWakeup")
    @Validation(required = true)
    private String gmtWakeup;

    @Query
    @NameInMap("Hid")
    @Validation(required = true)
    private Long hid;

    @Query
    @NameInMap("Interrupt")
    private Boolean interrupt;

    @Query
    @NameInMap("Invoker")
    @Validation(required = true)
    private String invoker;

    @Query
    @NameInMap("Message")
    private String message;

    @Query
    @NameInMap("Pk")
    @Validation(required = true)
    private String pk;

    @Query
    @NameInMap("Success")
    private Boolean success;

    @Query
    @NameInMap("TaskExtraData")
    @Validation(required = true)
    private String taskExtraData;

    @Query
    @NameInMap("TaskIdentifier")
    @Validation(required = true)
    private String taskIdentifier;

    private LogicalDeleteResourceRequest(Builder builder) {
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

    public static LogicalDeleteResourceRequest create() {
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

    public static final class Builder extends Request.Builder<LogicalDeleteResourceRequest, Builder> {
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

        private Builder(LogicalDeleteResourceRequest response) {
            super(response);
            this.bid = response.bid;
            this.country = response.country;
            this.gmtWakeup = response.gmtWakeup;
            this.hid = response.hid;
            this.interrupt = response.interrupt;
            this.invoker = response.invoker;
            this.message = response.message;
            this.pk = response.pk;
            this.success = response.success;
            this.taskExtraData = response.taskExtraData;
            this.taskIdentifier = response.taskIdentifier;
        } 

        /**
         * Bid.
         */
        public Builder bid(String bid) {
            this.putQueryParameter("Bid", bid);
            this.bid = bid;
            return this;
        }

        /**
         * Country.
         */
        public Builder country(String country) {
            this.putQueryParameter("Country", country);
            this.country = country;
            return this;
        }

        /**
         * GmtWakeup.
         */
        public Builder gmtWakeup(String gmtWakeup) {
            this.putQueryParameter("GmtWakeup", gmtWakeup);
            this.gmtWakeup = gmtWakeup;
            return this;
        }

        /**
         * Hid.
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
         * Invoker.
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
         * Pk.
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
         * TaskExtraData.
         */
        public Builder taskExtraData(String taskExtraData) {
            this.putQueryParameter("TaskExtraData", taskExtraData);
            this.taskExtraData = taskExtraData;
            return this;
        }

        /**
         * TaskIdentifier.
         */
        public Builder taskIdentifier(String taskIdentifier) {
            this.putQueryParameter("TaskIdentifier", taskIdentifier);
            this.taskIdentifier = taskIdentifier;
            return this;
        }

        @Override
        public LogicalDeleteResourceRequest build() {
            return new LogicalDeleteResourceRequest(this);
        } 

    } 

}
