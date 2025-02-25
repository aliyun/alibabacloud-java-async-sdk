// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20210728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitCopyrightExtractRequest} extends {@link RequestModel}
 *
 * <p>SubmitCopyrightExtractRequest</p>
 */
public class SubmitCopyrightExtractRequest extends Request {
    @Body
    @NameInMap("CallBack")
    private String callBack;

    @Body
    @NameInMap("Input")
    private String input;

    @Body
    @NameInMap("Params")
    private String params;

    @Body
    @NameInMap("Url")
    private String url;

    @Body
    @NameInMap("UserData")
    private String userData;

    private SubmitCopyrightExtractRequest(Builder builder) {
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

    public static SubmitCopyrightExtractRequest create() {
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

    public static final class Builder extends Request.Builder<SubmitCopyrightExtractRequest, Builder> {
        private String callBack; 
        private String input; 
        private String params; 
        private String url; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitCopyrightExtractRequest request) {
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
            this.putBodyParameter("CallBack", callBack);
            this.callBack = callBack;
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
         * Params.
         */
        public Builder params(String params) {
            this.putBodyParameter("Params", params);
            this.params = params;
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

        @Override
        public SubmitCopyrightExtractRequest build() {
            return new SubmitCopyrightExtractRequest(this);
        } 

    } 

}
