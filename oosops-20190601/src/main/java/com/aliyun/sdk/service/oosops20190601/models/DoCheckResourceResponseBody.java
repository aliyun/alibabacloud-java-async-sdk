// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

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
 * {@link DoCheckResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DoCheckResourceResponseBody</p>
 */
public class DoCheckResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("bid")
    private String bid;

    @com.aliyun.core.annotation.NameInMap("country")
    private String country;

    @com.aliyun.core.annotation.NameInMap("gmtWakeup")
    private String gmtWakeup;

    @com.aliyun.core.annotation.NameInMap("hid")
    private Integer hid;

    @com.aliyun.core.annotation.NameInMap("interrupt")
    private Boolean interrupt;

    @com.aliyun.core.annotation.NameInMap("invoker")
    private String invoker;

    @com.aliyun.core.annotation.NameInMap("level")
    private Integer level;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("pk")
    private String pk;

    @com.aliyun.core.annotation.NameInMap("prompt")
    private String prompt;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("taskExtraData")
    private String taskExtraData;

    @com.aliyun.core.annotation.NameInMap("taskIdentifier")
    private String taskIdentifier;

    @com.aliyun.core.annotation.NameInMap("url")
    private String url;

    private DoCheckResourceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
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

    public static DoCheckResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
    public Integer getHid() {
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
    public Integer getLevel() {
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
        private String requestId; 
        private String bid; 
        private String country; 
        private String gmtWakeup; 
        private Integer hid; 
        private Boolean interrupt; 
        private String invoker; 
        private Integer level; 
        private String message; 
        private String pk; 
        private String prompt; 
        private Boolean success; 
        private String taskExtraData; 
        private String taskIdentifier; 
        private String url; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * bid.
         */
        public Builder bid(String bid) {
            this.bid = bid;
            return this;
        }

        /**
         * country.
         */
        public Builder country(String country) {
            this.country = country;
            return this;
        }

        /**
         * gmtWakeup.
         */
        public Builder gmtWakeup(String gmtWakeup) {
            this.gmtWakeup = gmtWakeup;
            return this;
        }

        /**
         * hid.
         */
        public Builder hid(Integer hid) {
            this.hid = hid;
            return this;
        }

        /**
         * interrupt.
         */
        public Builder interrupt(Boolean interrupt) {
            this.interrupt = interrupt;
            return this;
        }

        /**
         * invoker.
         */
        public Builder invoker(String invoker) {
            this.invoker = invoker;
            return this;
        }

        /**
         * level.
         */
        public Builder level(Integer level) {
            this.level = level;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * pk.
         */
        public Builder pk(String pk) {
            this.pk = pk;
            return this;
        }

        /**
         * prompt.
         */
        public Builder prompt(String prompt) {
            this.prompt = prompt;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * taskExtraData.
         */
        public Builder taskExtraData(String taskExtraData) {
            this.taskExtraData = taskExtraData;
            return this;
        }

        /**
         * taskIdentifier.
         */
        public Builder taskIdentifier(String taskIdentifier) {
            this.taskIdentifier = taskIdentifier;
            return this;
        }

        /**
         * url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public DoCheckResourceResponseBody build() {
            return new DoCheckResourceResponseBody(this);
        } 

    } 

}
