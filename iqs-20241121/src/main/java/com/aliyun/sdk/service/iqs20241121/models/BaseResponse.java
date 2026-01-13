// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121.models;

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
 * {@link BaseResponse} extends {@link TeaModel}
 *
 * <p>BaseResponse</p>
 */
public class BaseResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.Map<String, ?> data;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    private BaseResponse(BuilderImpl builder) {
        super(builder);
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
    }

    public static BaseResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return data
     */
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public interface Builder extends Response.Builder<BaseResponse, Builder> {

        Builder data(java.util.Map<String, ?> data);

        Builder errorCode(String errorCode);

        Builder errorMessage(String errorMessage);

        @Override
        BaseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BaseResponse, Builder>
            implements Builder {
        private java.util.Map<String, ?> data; 
        private String errorCode; 
        private String errorMessage; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BaseResponse response) {
            super(response);
            this.data = response.data;
            this.errorCode = response.errorCode;
            this.errorMessage = response.errorMessage;
        } 

        /**
         * data.
         */
        @Override
        public Builder data(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }

        /**
         * errorCode.
         */
        @Override
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        @Override
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        @Override
        public BaseResponse build() {
            return new BaseResponse(this);
        } 

    } 

}
