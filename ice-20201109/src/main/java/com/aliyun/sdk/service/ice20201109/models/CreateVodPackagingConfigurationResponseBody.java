// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link CreateVodPackagingConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVodPackagingConfigurationResponseBody</p>
 */
public class CreateVodPackagingConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PackagingConfiguration")
    private VodPackagingConfiguration packagingConfiguration;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateVodPackagingConfigurationResponseBody(Builder builder) {
        this.packagingConfiguration = builder.packagingConfiguration;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVodPackagingConfigurationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return packagingConfiguration
     */
    public VodPackagingConfiguration getPackagingConfiguration() {
        return this.packagingConfiguration;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private VodPackagingConfiguration packagingConfiguration; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateVodPackagingConfigurationResponseBody model) {
            this.packagingConfiguration = model.packagingConfiguration;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The packaging configuration.</p>
         */
        public Builder packagingConfiguration(VodPackagingConfiguration packagingConfiguration) {
            this.packagingConfiguration = packagingConfiguration;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateVodPackagingConfigurationResponseBody build() {
            return new CreateVodPackagingConfigurationResponseBody(this);
        } 

    } 

}
