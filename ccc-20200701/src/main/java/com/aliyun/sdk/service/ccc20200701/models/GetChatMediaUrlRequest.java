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
 * {@link GetChatMediaUrlRequest} extends {@link RequestModel}
 *
 * <p>GetChatMediaUrlRequest</p>
 */
public class GetChatMediaUrlRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MediaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mediaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetChatMediaUrlRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.mediaId = builder.mediaId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChatMediaUrlRequest create() {
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
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder extends Request.Builder<GetChatMediaUrlRequest, Builder> {
        private String instanceId; 
        private String mediaId; 
        private String requestId; 

        private Builder() {
            super();
        } 

        private Builder(GetChatMediaUrlRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.mediaId = request.mediaId;
            this.requestId = request.requestId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
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
         * <p>$iAHNCNQCo3dhdgMGBAAFAAbaACOEAaQhIEeoAqpjjBl42N6o_kg7A88AAAGRIRRuBgTOACrxHgcACM8AAAGRIYJLBQ</p>
         */
        public Builder mediaId(String mediaId) {
            this.putBodyParameter("MediaId", mediaId);
            this.mediaId = mediaId;
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
        public GetChatMediaUrlRequest build() {
            return new GetChatMediaUrlRequest(this);
        } 

    } 

}
