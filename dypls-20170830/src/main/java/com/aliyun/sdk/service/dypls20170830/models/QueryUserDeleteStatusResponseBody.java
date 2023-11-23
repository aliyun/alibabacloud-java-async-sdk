// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUserDeleteStatusResponseBody} extends {@link TeaModel}
 *
 * <p>QueryUserDeleteStatusResponseBody</p>
 */
public class QueryUserDeleteStatusResponseBody extends TeaModel {
    @NameInMap("Bid")
    private String bid;

    @NameInMap("Country")
    private String country;

    @NameInMap("GmtWakeup")
    private String gmtWakeup;

    @NameInMap("Hid")
    private Long hid;

    @NameInMap("Interrupt")
    private Boolean interrupt;

    @NameInMap("Invoker")
    private String invoker;

    @NameInMap("Level")
    private Long level;

    @NameInMap("Message")
    private String message;

    @NameInMap("Pk")
    private String pk;

    @NameInMap("Prompt")
    private String prompt;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TaskExtraData")
    private String taskExtraData;

    @NameInMap("TaskIdentifier")
    private String taskIdentifier;

    @NameInMap("Url")
    private String url;

    private QueryUserDeleteStatusResponseBody(Builder builder) {
        this.bid = builder.bid;
        this.country = builder.country;
        this.gmtWakeup = builder.gmtWakeup;
        this.hid = builder.hid;
        this.interrupt = builder.interrupt;
        this.invoker = builder.invoker;
        this.level = builder.level;
        this.message = builder.message;
        this.pk = builder.pk;
        this.prompt = builder.prompt;
        this.success = builder.success;
        this.taskExtraData = builder.taskExtraData;
        this.taskIdentifier = builder.taskIdentifier;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserDeleteStatusResponseBody create() {
        return builder().build();
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
     * @return level
     */
    public Long getLevel() {
        return this.level;
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
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
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

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String bid; 
        private String country; 
        private String gmtWakeup; 
        private Long hid; 
        private Boolean interrupt; 
        private String invoker; 
        private Long level; 
        private String message; 
        private String pk; 
        private String prompt; 
        private Boolean success; 
        private String taskExtraData; 
        private String taskIdentifier; 
        private String url; 

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
         * Level.
         */
        public Builder level(Long level) {
            this.level = level;
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
         * Prompt.
         */
        public Builder prompt(String prompt) {
            this.prompt = prompt;
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

        /**
         * Url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public QueryUserDeleteStatusResponseBody build() {
            return new QueryUserDeleteStatusResponseBody(this);
        } 

    } 

}
