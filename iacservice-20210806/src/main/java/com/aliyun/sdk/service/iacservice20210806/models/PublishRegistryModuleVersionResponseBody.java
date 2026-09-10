// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link PublishRegistryModuleVersionResponseBody} extends {@link TeaModel}
 *
 * <p>PublishRegistryModuleVersionResponseBody</p>
 */
public class PublishRegistryModuleVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private PublishRegistryModuleVersionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishRegistryModuleVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String requestId; 
        private String version; 

        private Builder() {
        } 

        private Builder(PublishRegistryModuleVersionResponseBody model) {
            this.requestId = model.requestId;
            this.version = model.version;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36E1679B-4D91-5AF6-B505-B5D4ACDF75BD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public PublishRegistryModuleVersionResponseBody build() {
            return new PublishRegistryModuleVersionResponseBody(this);
        } 

    } 

}
