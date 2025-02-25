// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link CreateCloudGtmInstanceConfigResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCloudGtmInstanceConfigResponseBody</p>
 */
public class CreateCloudGtmInstanceConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    private Boolean configId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateCloudGtmInstanceConfigResponseBody(Builder builder) {
        this.configId = builder.configId;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudGtmInstanceConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return configId
     */
    public Boolean getConfigId() {
        return this.configId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Boolean configId; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The configuration ID of the access domain name. Two configuration IDs exist when the access domain name is bound to the same GTM instance but an A record and an AAAA record are configured for the access domain name. The configuration ID uniquely identifies a configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>config-000**1</p>
         */
        public Builder configId(Boolean configId) {
            this.configId = configId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateCloudGtmInstanceConfigResponseBody build() {
            return new CreateCloudGtmInstanceConfigResponseBody(this);
        } 

    } 

}
