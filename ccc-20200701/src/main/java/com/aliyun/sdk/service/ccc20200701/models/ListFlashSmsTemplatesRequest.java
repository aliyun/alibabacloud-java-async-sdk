// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProviderId")
    private String providerId;

    private ListFlashSmsTemplatesRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
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
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
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
        private String applicationId; 
        private String instanceId; 
        private String providerId; 

        private Builder() {
            super();
        } 

        private Builder(ListFlashSmsTemplatesRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.instanceId = request.instanceId;
            this.providerId = request.providerId;
        } 

        /**
         * <p>Flash SMS configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>71b396fa-1*********-70b7c0</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>Instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Flash SMS provider ID.</p>
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
