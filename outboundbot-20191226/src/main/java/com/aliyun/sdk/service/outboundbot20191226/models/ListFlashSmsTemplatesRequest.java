// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ListFlashSmsTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListFlashSmsTemplatesRequest</p>
 */
public class ListFlashSmsTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProviderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String providerId;

    private ListFlashSmsTemplatesRequest(Builder builder) {
        super(builder);
        this.configId = builder.configId;
        this.instanceId = builder.instanceId;
        this.providerId = builder.providerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlashSmsTemplatesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return providerId
     */
    public String getProviderId() {
        return this.providerId;
    }

    public static final class Builder extends Request.Builder<ListFlashSmsTemplatesRequest, Builder> {
        private String configId; 
        private String instanceId; 
        private String providerId; 

        private Builder() {
            super();
        } 

        private Builder(ListFlashSmsTemplatesRequest request) {
            super(request);
            this.configId = request.configId;
            this.instanceId = request.instanceId;
            this.providerId = request.providerId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fe542524-9585-4cc7-be54-c8782ed7f60e</p>
         */
        public Builder configId(String configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>361c8a53-0e29-42f3-8aa7-c7752d010399</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Uincall</p>
         */
        public Builder providerId(String providerId) {
            this.putQueryParameter("ProviderId", providerId);
            this.providerId = providerId;
            return this;
        }

        @Override
        public ListFlashSmsTemplatesRequest build() {
            return new ListFlashSmsTemplatesRequest(this);
        } 

    } 

}
