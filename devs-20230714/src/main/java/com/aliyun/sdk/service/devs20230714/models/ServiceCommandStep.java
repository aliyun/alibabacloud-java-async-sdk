// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link ServiceCommandStep} extends {@link TeaModel}
 *
 * <p>ServiceCommandStep</p>
 */
public class ServiceCommandStep extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("run")
    private String run;

    private ServiceCommandStep(Builder builder) {
        this.path = builder.path;
        this.run = builder.run;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ServiceCommandStep create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return run
     */
    public String getRun() {
        return this.run;
    }

    public static final class Builder {
        private String path; 
        private String run; 

        private Builder() {
        } 

        private Builder(ServiceCommandStep model) {
            this.path = model.path;
            this.run = model.run;
        } 

        /**
         * path.
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * run.
         */
        public Builder run(String run) {
            this.run = run;
            return this;
        }

        public ServiceCommandStep build() {
            return new ServiceCommandStep(this);
        } 

    } 

}
