// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link GrayPublishRequest} extends {@link RequestModel}
 *
 * <p>GrayPublishRequest</p>
 */
public class GrayPublishRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("X-Request-ChangeId")
    private String xRequestChangeId;

    private GrayPublishRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.xRequestChangeId = builder.xRequestChangeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrayPublishRequest create() {
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
     * @return xRequestChangeId
     */
    public String getXRequestChangeId() {
        return this.xRequestChangeId;
    }

    public static final class Builder extends Request.Builder<GrayPublishRequest, Builder> {
        private String instanceId; 
        private String xRequestChangeId; 

        private Builder() {
            super();
        } 

        private Builder(GrayPublishRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.xRequestChangeId = request.xRequestChangeId;
        } 

        /**
         * <p>The ID of the Elasticsearch instance. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-0pp1jxvcl000z****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The change ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ea8d33aa4371c3499d0***</p>
         */
        public Builder xRequestChangeId(String xRequestChangeId) {
            this.putQueryParameter("X-Request-ChangeId", xRequestChangeId);
            this.xRequestChangeId = xRequestChangeId;
            return this;
        }

        @Override
        public GrayPublishRequest build() {
            return new GrayPublishRequest(this);
        } 

    } 

}
