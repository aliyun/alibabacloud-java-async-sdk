// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link SendSdkMessageRequest} extends {@link RequestModel}
 *
 * <p>SendSdkMessageRequest</p>
 */
public class SendSdkMessageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("data")
    private String data;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("header")
    private String header;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("moduleName")
    private String moduleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operationName")
    private String operationName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    private SendSdkMessageRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
        this.header = builder.header;
        this.moduleName = builder.moduleName;
        this.operationName = builder.operationName;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendSdkMessageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return header
     */
    public String getHeader() {
        return this.header;
    }

    /**
     * @return moduleName
     */
    public String getModuleName() {
        return this.moduleName;
    }

    /**
     * @return operationName
     */
    public String getOperationName() {
        return this.operationName;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<SendSdkMessageRequest, Builder> {
        private String data; 
        private String header; 
        private String moduleName; 
        private String operationName; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(SendSdkMessageRequest request) {
            super(request);
            this.data = request.data;
            this.header = request.header;
            this.moduleName = request.moduleName;
            this.operationName = request.operationName;
            this.userId = request.userId;
        } 

        /**
         * data.
         */
        public Builder data(String data) {
            this.putBodyParameter("data", data);
            this.data = data;
            return this;
        }

        /**
         * header.
         */
        public Builder header(String header) {
            this.putBodyParameter("header", header);
            this.header = header;
            return this;
        }

        /**
         * moduleName.
         */
        public Builder moduleName(String moduleName) {
            this.putBodyParameter("moduleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        /**
         * operationName.
         */
        public Builder operationName(String operationName) {
            this.putBodyParameter("operationName", operationName);
            this.operationName = operationName;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public SendSdkMessageRequest build() {
            return new SendSdkMessageRequest(this);
        } 

    } 

}
