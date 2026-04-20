// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20251111.models;

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
 * {@link BeginSessionRequest} extends {@link RequestModel}
 *
 * <p>BeginSessionRequest</p>
 */
public class BeginSessionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DraftVersion")
    private Boolean draftVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    private String scriptId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VendorParams")
    private String vendorParams;

    private BeginSessionRequest(Builder builder) {
        super(builder);
        this.draftVersion = builder.draftVersion;
        this.instanceId = builder.instanceId;
        this.scriptId = builder.scriptId;
        this.vendorParams = builder.vendorParams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BeginSessionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return draftVersion
     */
    public Boolean getDraftVersion() {
        return this.draftVersion;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * @return vendorParams
     */
    public String getVendorParams() {
        return this.vendorParams;
    }

    public static final class Builder extends Request.Builder<BeginSessionRequest, Builder> {
        private Boolean draftVersion; 
        private String instanceId; 
        private String scriptId; 
        private String vendorParams; 

        private Builder() {
            super();
        } 

        private Builder(BeginSessionRequest request) {
            super(request);
            this.draftVersion = request.draftVersion;
            this.instanceId = request.instanceId;
            this.scriptId = request.scriptId;
            this.vendorParams = request.vendorParams;
        } 

        /**
         * DraftVersion.
         */
        public Builder draftVersion(Boolean draftVersion) {
            this.putQueryParameter("DraftVersion", draftVersion);
            this.draftVersion = draftVersion;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ScriptId.
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * VendorParams.
         */
        public Builder vendorParams(String vendorParams) {
            this.putQueryParameter("VendorParams", vendorParams);
            this.vendorParams = vendorParams;
            return this;
        }

        @Override
        public BeginSessionRequest build() {
            return new BeginSessionRequest(this);
        } 

    } 

}
