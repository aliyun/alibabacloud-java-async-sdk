// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DoCheckResourceRequest} extends {@link RequestModel}
 *
 * <p>DoCheckResourceRequest</p>
 */
public class DoCheckResourceRequest extends Request {
    @Query
    @NameInMap("bid")
    private String bid;

    @Query
    @NameInMap("country")
    private String country;

    @Query
    @NameInMap("gmtWakeup")
    private String gmtWakeup;

    @Query
    @NameInMap("hid")
    private Integer hid;

    @Query
    @NameInMap("interrupt")
    private Boolean interrupt;

    @Query
    @NameInMap("invoker")
    private String invoker;

    @Query
    @NameInMap("level")
    private Integer level;

    @Query
    @NameInMap("message")
    private String message;

    @Query
    @NameInMap("pk")
    private String pk;

    @Query
    @NameInMap("prompt")
    private String prompt;

    @Query
    @NameInMap("success")
    private Boolean success;

    @Query
    @NameInMap("taskExtraData")
    private String taskExtraData;

    @Query
    @NameInMap("taskIdentifier")
    private String taskIdentifier;

    @Query
    @NameInMap("url")
    private String url;

    private DoCheckResourceRequest(Builder builder) {
        super(builder);
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

    public static DoCheckResourceRequest create() {
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

    public static final class Builder extends Request.Builder<DoCheckResourceRequest, Builder> {
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

        private Builder() {
            super();
        } 

        private Builder(DoCheckResourceRequest request) {
            super(request);
            this.bid = request.bid;
            this.country = request.country;
            this.gmtWakeup = request.gmtWakeup;
            this.hid = request.hid;
            this.interrupt = request.interrupt;
            this.invoker = request.invoker;
            this.level = request.level;
            this.message = request.message;
            this.pk = request.pk;
            this.prompt = request.prompt;
            this.success = request.success;
            this.taskExtraData = request.taskExtraData;
            this.taskIdentifier = request.taskIdentifier;
            this.url = request.url;
        } 

        /**
         * bid.
         */
        public Builder bid(String bid) {
            this.putQueryParameter("bid", bid);
            this.bid = bid;
            return this;
        }

        /**
         * country.
         */
        public Builder country(String country) {
            this.putQueryParameter("country", country);
            this.country = country;
            return this;
        }

        /**
         * gmtWakeup.
         */
        public Builder gmtWakeup(String gmtWakeup) {
            this.putQueryParameter("gmtWakeup", gmtWakeup);
            this.gmtWakeup = gmtWakeup;
            return this;
        }

        /**
         * hid.
         */
        public Builder hid(Integer hid) {
            this.putQueryParameter("hid", hid);
            this.hid = hid;
            return this;
        }

        /**
         * interrupt.
         */
        public Builder interrupt(Boolean interrupt) {
            this.putQueryParameter("interrupt", interrupt);
            this.interrupt = interrupt;
            return this;
        }

        /**
         * invoker.
         */
        public Builder invoker(String invoker) {
            this.putQueryParameter("invoker", invoker);
            this.invoker = invoker;
            return this;
        }

        /**
         * level.
         */
        public Builder level(Integer level) {
            this.putQueryParameter("level", level);
            this.level = level;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.putQueryParameter("message", message);
            this.message = message;
            return this;
        }

        /**
         * pk.
         */
        public Builder pk(String pk) {
            this.putQueryParameter("pk", pk);
            this.pk = pk;
            return this;
        }

        /**
         * prompt.
         */
        public Builder prompt(String prompt) {
            this.putQueryParameter("prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.putQueryParameter("success", success);
            this.success = success;
            return this;
        }

        /**
         * taskExtraData.
         */
        public Builder taskExtraData(String taskExtraData) {
            this.putQueryParameter("taskExtraData", taskExtraData);
            this.taskExtraData = taskExtraData;
            return this;
        }

        /**
         * taskIdentifier.
         */
        public Builder taskIdentifier(String taskIdentifier) {
            this.putQueryParameter("taskIdentifier", taskIdentifier);
            this.taskIdentifier = taskIdentifier;
            return this;
        }

        /**
         * url.
         */
        public Builder url(String url) {
            this.putQueryParameter("url", url);
            this.url = url;
            return this;
        }

        @Override
        public DoCheckResourceRequest build() {
            return new DoCheckResourceRequest(this);
        } 

    } 

}
