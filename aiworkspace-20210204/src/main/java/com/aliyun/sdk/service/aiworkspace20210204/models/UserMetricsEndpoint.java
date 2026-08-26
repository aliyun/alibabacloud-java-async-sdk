// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link UserMetricsEndpoint} extends {@link TeaModel}
 *
 * <p>UserMetricsEndpoint</p>
 */
public class UserMetricsEndpoint extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    private UserMetricsEndpoint(Builder builder) {
        this.path = builder.path;
        this.port = builder.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UserMetricsEndpoint create() {
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
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    public static final class Builder {
        private String path; 
        private Integer port; 

        private Builder() {
        } 

        private Builder(UserMetricsEndpoint model) {
            this.path = model.path;
            this.port = model.port;
        } 

        /**
         * Path.
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        public UserMetricsEndpoint build() {
            return new UserMetricsEndpoint(this);
        } 

    } 

}
