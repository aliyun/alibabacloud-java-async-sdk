// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CreateCustomHostnameResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCustomHostnameResponseBody</p>
 */
public class CreateCustomHostnameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Hostname")
    private String hostname;

    @com.aliyun.core.annotation.NameInMap("HostnameId")
    private Long hostnameId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCustomHostnameResponseBody(Builder builder) {
        this.hostname = builder.hostname;
        this.hostnameId = builder.hostnameId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomHostnameResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostname
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     * @return hostnameId
     */
    public Long getHostnameId() {
        return this.hostnameId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String hostname; 
        private Long hostnameId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateCustomHostnameResponseBody model) {
            this.hostname = model.hostname;
            this.hostnameId = model.hostnameId;
            this.requestId = model.requestId;
        } 

        /**
         * Hostname.
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            return this;
        }

        /**
         * HostnameId.
         */
        public Builder hostnameId(Long hostnameId) {
            this.hostnameId = hostnameId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCustomHostnameResponseBody build() {
            return new CreateCustomHostnameResponseBody(this);
        } 

    } 

}
