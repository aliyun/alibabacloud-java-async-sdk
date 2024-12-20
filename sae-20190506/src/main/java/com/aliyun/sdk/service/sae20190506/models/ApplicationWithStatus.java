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
 * {@link ApplicationWithStatus} extends {@link TeaModel}
 *
 * <p>ApplicationWithStatus</p>
 */
public class ApplicationWithStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("application")
    private Application application;

    @com.aliyun.core.annotation.NameInMap("status")
    private ApplicationStatus status;

    private ApplicationWithStatus(Builder builder) {
        this.application = builder.application;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplicationWithStatus create() {
        return builder().build();
    }

    /**
     * @return application
     */
    public Application getApplication() {
        return this.application;
    }

    /**
     * @return status
     */
    public ApplicationStatus getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Application application; 
        private ApplicationStatus status; 

        /**
         * application.
         */
        public Builder application(Application application) {
            this.application = application;
            return this;
        }

        /**
         * status.
         */
        public Builder status(ApplicationStatus status) {
            this.status = status;
            return this;
        }

        public ApplicationWithStatus build() {
            return new ApplicationWithStatus(this);
        } 

    } 

}
