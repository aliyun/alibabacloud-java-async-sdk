// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20210728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitCopyrightJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitCopyrightJobRequest</p>
 */
public class SubmitCopyrightJobRequest extends Request {
    @Body
    @NameInMap("CallBack")
    private String callBack;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("Input")
    private String input;

    @Body
    @NameInMap("Level")
    private Long level;

    @Body
    @NameInMap("Message")
    @Validation(required = true)
    private String message;

    @Body
    @NameInMap("Output")
    @Validation(required = true)
    private String output;

    @Body
    @NameInMap("Params")
    private String params;

    @Body
    @NameInMap("StartTime")
    private Long startTime;

    @Body
    @NameInMap("TotalTime")
    private Long totalTime;

    @Body
    @NameInMap("Url")
    private String url;

    @Body
    @NameInMap("UserData")
    private String userData;

    @Body
    @NameInMap("VisibleMessage")
    private String visibleMessage;

    private SubmitCopyrightJobRequest(Builder builder) {
        super(builder);
        this.callBack = builder.callBack;
        this.description = builder.description;
        this.input = builder.input;
        this.level = builder.level;
        this.message = builder.message;
        this.output = builder.output;
        this.params = builder.params;
        this.startTime = builder.startTime;
        this.totalTime = builder.totalTime;
        this.url = builder.url;
        this.userData = builder.userData;
        this.visibleMessage = builder.visibleMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitCopyrightJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callBack
     */
    public String getCallBack() {
        return this.callBack;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return input
     */
    public String getInput() {
        return this.input;
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
     * @return output
     */
    public String getOutput() {
        return this.output;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return totalTime
     */
    public Long getTotalTime() {
        return this.totalTime;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return visibleMessage
     */
    public String getVisibleMessage() {
        return this.visibleMessage;
    }

    public static final class Builder extends Request.Builder<SubmitCopyrightJobRequest, Builder> {
        private String callBack; 
        private String description; 
        private String input; 
        private Long level; 
        private String message; 
        private String output; 
        private String params; 
        private Long startTime; 
        private Long totalTime; 
        private String url; 
        private String userData; 
        private String visibleMessage; 

        private Builder() {
            super();
        } 

        private Builder(SubmitCopyrightJobRequest request) {
            super(request);
            this.callBack = request.callBack;
            this.description = request.description;
            this.input = request.input;
            this.level = request.level;
            this.message = request.message;
            this.output = request.output;
            this.params = request.params;
            this.startTime = request.startTime;
            this.totalTime = request.totalTime;
            this.url = request.url;
            this.userData = request.userData;
            this.visibleMessage = request.visibleMessage;
        } 

        /**
         * CallBack.
         */
        public Builder callBack(String callBack) {
            this.putBodyParameter("CallBack", callBack);
            this.callBack = callBack;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Input.
         */
        public Builder input(String input) {
            this.putBodyParameter("Input", input);
            this.input = input;
            return this;
        }

        /**
         * Level.
         */
        public Builder level(Long level) {
            this.putBodyParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.putBodyParameter("Message", message);
            this.message = message;
            return this;
        }

        /**
         * Output.
         */
        public Builder output(String output) {
            this.putBodyParameter("Output", output);
            this.output = output;
            return this;
        }

        /**
         * Params.
         */
        public Builder params(String params) {
            this.putBodyParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TotalTime.
         */
        public Builder totalTime(Long totalTime) {
            this.putBodyParameter("TotalTime", totalTime);
            this.totalTime = totalTime;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.putBodyParameter("Url", url);
            this.url = url;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putBodyParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * VisibleMessage.
         */
        public Builder visibleMessage(String visibleMessage) {
            this.putBodyParameter("VisibleMessage", visibleMessage);
            this.visibleMessage = visibleMessage;
            return this;
        }

        @Override
        public SubmitCopyrightJobRequest build() {
            return new SubmitCopyrightJobRequest(this);
        } 

    } 

}
