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
 * {@link WebApplicationWithInstanceCount} extends {@link TeaModel}
 *
 * <p>WebApplicationWithInstanceCount</p>
 */
public class WebApplicationWithInstanceCount extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceCount")
    private Long instanceCount;

    @com.aliyun.core.annotation.NameInMap("WebApplication")
    private WebApplication webApplication;

    private WebApplicationWithInstanceCount(Builder builder) {
        this.instanceCount = builder.instanceCount;
        this.webApplication = builder.webApplication;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebApplicationWithInstanceCount create() {
        return builder().build();
    }

    /**
     * @return instanceCount
     */
    public Long getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * @return webApplication
     */
    public WebApplication getWebApplication() {
        return this.webApplication;
    }

    public static final class Builder {
        private Long instanceCount; 
        private WebApplication webApplication; 

        /**
         * InstanceCount.
         */
        public Builder instanceCount(Long instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }

        /**
         * WebApplication.
         */
        public Builder webApplication(WebApplication webApplication) {
            this.webApplication = webApplication;
            return this;
        }

        public WebApplicationWithInstanceCount build() {
            return new WebApplicationWithInstanceCount(this);
        } 

    } 

}
