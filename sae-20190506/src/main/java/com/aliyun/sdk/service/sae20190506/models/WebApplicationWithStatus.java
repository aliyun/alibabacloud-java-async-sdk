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
 * {@link WebApplicationWithStatus} extends {@link TeaModel}
 *
 * <p>WebApplicationWithStatus</p>
 */
public class WebApplicationWithStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Status")
    private WebApplicationStatus status;

    @com.aliyun.core.annotation.NameInMap("WebApplication")
    private WebApplication webApplication;

    private WebApplicationWithStatus(Builder builder) {
        this.status = builder.status;
        this.webApplication = builder.webApplication;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebApplicationWithStatus create() {
        return builder().build();
    }

    /**
     * @return status
     */
    public WebApplicationStatus getStatus() {
        return this.status;
    }

    /**
     * @return webApplication
     */
    public WebApplication getWebApplication() {
        return this.webApplication;
    }

    public static final class Builder {
        private WebApplicationStatus status; 
        private WebApplication webApplication; 

        /**
         * Status.
         */
        public Builder status(WebApplicationStatus status) {
            this.status = status;
            return this;
        }

        /**
         * WebApplication.
         */
        public Builder webApplication(WebApplication webApplication) {
            this.webApplication = webApplication;
            return this;
        }

        public WebApplicationWithStatus build() {
            return new WebApplicationWithStatus(this);
        } 

    } 

}
