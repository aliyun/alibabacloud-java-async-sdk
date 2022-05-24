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
    @NameInMap("Url")
    private String url;

    @Body
    @NameInMap("UserData")
    private String userData;

    private SubmitCopyrightExtractRequest(Builder builder) {
        super(builder);
        this.callBack = builder.callBack;
        this.input = builder.input;
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
        private String url; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitCopyrightExtractRequest request) {
            super(request);
            this.callBack = request.callBack;
            this.input = request.input;
            this.url = request.url;
            this.userData = request.userData;
        } 

        /**
         * 任务完成回调
         */
        public Builder callBack(String callBack) {
            this.putBodyParameter("CallBack", callBack);
            this.callBack = callBack;
            return this;
        }

        /**
         * 输入文件oss地址
         */
        public Builder input(String input) {
            this.putBodyParameter("Input", input);
            this.input = input;
            return this;
        }

        /**
         * url链接
         */
        public Builder url(String url) {
            this.putBodyParameter("Url", url);
            this.url = url;
            return this;
        }

        /**
         * 用户数据
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
