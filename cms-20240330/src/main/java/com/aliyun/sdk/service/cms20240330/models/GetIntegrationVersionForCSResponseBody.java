// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetIntegrationVersionForCSResponseBody} extends {@link TeaModel}
 *
 * <p>GetIntegrationVersionForCSResponseBody</p>
 */
public class GetIntegrationVersionForCSResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("integrationVersion")
    private String integrationVersion;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetIntegrationVersionForCSResponseBody(Builder builder) {
        this.integrationVersion = builder.integrationVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIntegrationVersionForCSResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return integrationVersion
     */
    public String getIntegrationVersion() {
        return this.integrationVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String integrationVersion; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetIntegrationVersionForCSResponseBody model) {
            this.integrationVersion = model.integrationVersion;
            this.requestId = model.requestId;
        } 

        /**
         * integrationVersion.
         */
        public Builder integrationVersion(String integrationVersion) {
            this.integrationVersion = integrationVersion;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CD9BCF34-EA09-5643-BC11-AF41C8DFAE5A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetIntegrationVersionForCSResponseBody build() {
            return new GetIntegrationVersionForCSResponseBody(this);
        } 

    } 

}
