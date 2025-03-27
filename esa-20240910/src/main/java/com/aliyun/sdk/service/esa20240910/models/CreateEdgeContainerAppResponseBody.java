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
 * {@link CreateEdgeContainerAppResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEdgeContainerAppResponseBody</p>
 */
public class CreateEdgeContainerAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateEdgeContainerAppResponseBody(Builder builder) {
        this.appId = builder.appId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEdgeContainerAppResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String appId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateEdgeContainerAppResponseBody model) {
            this.appId = model.appId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the application that is created.</p>
         * 
         * <strong>example:</strong>
         * <p>app-880688675783794688</p>
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateEdgeContainerAppResponseBody build() {
            return new CreateEdgeContainerAppResponseBody(this);
        } 

    } 

}
