// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link WebVersionStatus} extends {@link TeaModel}
 *
 * <p>WebVersionStatus</p>
 */
public class WebVersionStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private WebVersionStatus(Builder builder) {
        this.errorMessage = builder.errorMessage;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebVersionStatus create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String errorMessage; 
        private String status; 

        private Builder() {
        } 

        private Builder(WebVersionStatus model) {
            this.errorMessage = model.errorMessage;
            this.status = model.status;
        } 

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public WebVersionStatus build() {
            return new WebVersionStatus(this);
        } 

    } 

}
