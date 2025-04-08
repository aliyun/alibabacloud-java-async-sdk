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
 * {@link CreateChatMediaUrlRequest} extends {@link RequestModel}
 *
 * <p>CreateChatMediaUrlRequest</p>
 */
public class CreateChatMediaUrlRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MimeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mimeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateChatMediaUrlRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.mimeType = builder.mimeType;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateChatMediaUrlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return mimeType
     */
    public String getMimeType() {
        return this.mimeType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder extends Request.Builder<CreateChatMediaUrlRequest, Builder> {
        private String instanceId; 
        private String mimeType; 
        private String requestId; 

        private Builder() {
            super();
        } 

        private Builder(CreateChatMediaUrlRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.mimeType = request.mimeType;
            this.requestId = request.requestId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9cfad875-6260-4a53-ab6e-b13e3fb31f7d</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>media id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>jpg</p>
         */
        public Builder mimeType(String mimeType) {
            this.putBodyParameter("MimeType", mimeType);
            this.mimeType = mimeType;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        @Override
        public CreateChatMediaUrlRequest build() {
            return new CreateChatMediaUrlRequest(this);
        } 

    } 

}
