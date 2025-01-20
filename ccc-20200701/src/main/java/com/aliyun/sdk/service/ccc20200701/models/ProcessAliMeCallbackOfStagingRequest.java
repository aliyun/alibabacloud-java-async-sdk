// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ProcessAliMeCallbackOfStagingRequest} extends {@link RequestModel}
 *
 * <p>ProcessAliMeCallbackOfStagingRequest</p>
 */
public class ProcessAliMeCallbackOfStagingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private ProcessAliMeCallbackOfStagingRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProcessAliMeCallbackOfStagingRequest create() {
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
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<ProcessAliMeCallbackOfStagingRequest, Builder> {
        private String data; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(ProcessAliMeCallbackOfStagingRequest request) {
            super(request);
            this.data = request.data;
            this.token = request.token;
        } 

        /**
         * Data.
         */
        public Builder data(String data) {
            this.putQueryParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public ProcessAliMeCallbackOfStagingRequest build() {
            return new ProcessAliMeCallbackOfStagingRequest(this);
        } 

    } 

}
