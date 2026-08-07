// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20251111.models;

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
 * {@link ListScriptProfileTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListScriptProfileTemplatesRequest</p>
 */
public class ListScriptProfileTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NluEngine")
    private String nluEngine;

    private ListScriptProfileTemplatesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.nluEngine = builder.nluEngine;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScriptProfileTemplatesRequest create() {
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
     * @return nluEngine
     */
    public String getNluEngine() {
        return this.nluEngine;
    }

    public static final class Builder extends Request.Builder<ListScriptProfileTemplatesRequest, Builder> {
        private String instanceId; 
        private String nluEngine; 

        private Builder() {
            super();
        } 

        private Builder(ListScriptProfileTemplatesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.nluEngine = request.nluEngine;
        } 

        /**
         * <p>实例ID</p>
         * 
         * <strong>example:</strong>
         * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>NLU引擎类型</p>
         * 
         * <strong>example:</strong>
         * <p>BEEBOT</p>
         */
        public Builder nluEngine(String nluEngine) {
            this.putBodyParameter("NluEngine", nluEngine);
            this.nluEngine = nluEngine;
            return this;
        }

        @Override
        public ListScriptProfileTemplatesRequest build() {
            return new ListScriptProfileTemplatesRequest(this);
        } 

    } 

}
