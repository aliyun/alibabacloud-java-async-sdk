// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitTraceExtractJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitTraceExtractJobRequest</p>
 */
public class SubmitTraceExtractJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallBack")
    private String callBack;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Input")
    private String input;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Params")
    private String params;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitTraceExtractJobRequest(Builder builder) {
        super(builder);
        this.callBack = builder.callBack;
        this.input = builder.input;
        this.params = builder.params;
        this.url = builder.url;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitTraceExtractJobRequest create() {
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
     * @return input
     */
    public String getInput() {
        return this.input;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
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

    public static final class Builder extends Request.Builder<SubmitTraceExtractJobRequest, Builder> {
        private String callBack; 
        private String input; 
        private String params; 
        private String url; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitTraceExtractJobRequest request) {
            super(request);
            this.callBack = request.callBack;
            this.input = request.input;
            this.params = request.params;
            this.url = request.url;
            this.userData = request.userData;
        } 

        /**
         * CallBack.
         */
        public Builder callBack(String callBack) {
            this.putQueryParameter("CallBack", callBack);
            this.callBack = callBack;
            return this;
        }

        /**
         * Input.
         */
        public Builder input(String input) {
            this.putQueryParameter("Input", input);
            this.input = input;
            return this;
        }

        /**
         * Params.
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitTraceExtractJobRequest build() {
            return new SubmitTraceExtractJobRequest(this);
        } 

    } 

}
