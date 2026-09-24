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
 * {@link UpdateSnapshotSettingRequest} extends {@link RequestModel}
 *
 * <p>UpdateSnapshotSettingRequest</p>
 */
public class UpdateSnapshotSettingRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    private UpdateSnapshotSettingRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSnapshotSettingRequest create() {
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
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateSnapshotSettingRequest, Builder> {
        private String instanceId; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSnapshotSettingRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.body = request.body;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-oew1rgiev0009****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The data backup configuration, including the automatic backup start time and the scheduled backup switch.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;quartzRegex&quot;:&quot;0 0 01 ? * * <em>&quot;,
         *     &quot;enable&quot;:true,
         *     &quot;indices&quot;: [
         *         &quot;orders-</em>&quot;
         *     ]
         * }</p>
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateSnapshotSettingRequest build() {
            return new UpdateSnapshotSettingRequest(this);
        } 

    } 

}
