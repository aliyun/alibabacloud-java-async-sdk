// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs_workbench20220220.models;

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
 * {@link ViewInstanceRecordsRequest} extends {@link RequestModel}
 *
 * <p>ViewInstanceRecordsRequest</p>
 */
public class ViewInstanceRecordsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TerminalSessionToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String terminalSessionToken;

    private ViewInstanceRecordsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.terminalSessionToken = builder.terminalSessionToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ViewInstanceRecordsRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return terminalSessionToken
     */
    public String getTerminalSessionToken() {
        return this.terminalSessionToken;
    }

    public static final class Builder extends Request.Builder<ViewInstanceRecordsRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String terminalSessionToken; 

        private Builder() {
            super();
        } 

        private Builder(ViewInstanceRecordsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.terminalSessionToken = request.terminalSessionToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-123</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder terminalSessionToken(String terminalSessionToken) {
            this.putBodyParameter("TerminalSessionToken", terminalSessionToken);
            this.terminalSessionToken = terminalSessionToken;
            return this;
        }

        @Override
        public ViewInstanceRecordsRequest build() {
            return new ViewInstanceRecordsRequest(this);
        } 

    } 

}
