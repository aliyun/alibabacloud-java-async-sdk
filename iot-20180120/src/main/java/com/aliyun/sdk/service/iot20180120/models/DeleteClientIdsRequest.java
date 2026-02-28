// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link DeleteClientIdsRequest} extends {@link RequestModel}
 *
 * <p>DeleteClientIdsRequest</p>
 */
public class DeleteClientIdsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String iotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    private DeleteClientIdsRequest(Builder builder) {
        super(builder);
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteClientIdsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotId
     */
    public String getIotId() {
        return this.iotId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<DeleteClientIdsRequest, Builder> {
        private String iotId; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteClientIdsRequest request) {
            super(request);
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * <p>The ID of the device.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BXPV9Ks3bxwM9fD****0000101</p>
         */
        public Builder iotId(String iotId) {
            this.putQueryParameter("IotId", iotId);
            this.iotId = iotId;
            return this;
        }

        /**
         * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
         * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-12****78</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        @Override
        public DeleteClientIdsRequest build() {
            return new DeleteClientIdsRequest(this);
        } 

    } 

}
