// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gwlb20240415.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateListenerAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateListenerAttributeRequest</p>
 */
public class UpdateListenerAttributeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListenerDescription")
    private String listenerDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListenerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String listenerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServerGroupId")
    private String serverGroupId;

    private UpdateListenerAttributeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.listenerDescription = builder.listenerDescription;
        this.listenerId = builder.listenerId;
        this.serverGroupId = builder.serverGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateListenerAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return listenerDescription
     */
    public String getListenerDescription() {
        return this.listenerDescription;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
    }

    /**
     * @return serverGroupId
     */
    public String getServerGroupId() {
        return this.serverGroupId;
    }

    public static final class Builder extends Request.Builder<UpdateListenerAttributeRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String listenerDescription; 
        private String listenerId; 
        private String serverGroupId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateListenerAttributeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.listenerDescription = request.listenerDescription;
            this.listenerId = request.listenerId;
            this.serverGroupId = request.serverGroupId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * ListenerDescription.
         */
        public Builder listenerDescription(String listenerDescription) {
            this.putBodyParameter("ListenerDescription", listenerDescription);
            this.listenerDescription = listenerDescription;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lsn-lxce8iqbof2vl0****</p>
         */
        public Builder listenerId(String listenerId) {
            this.putBodyParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        /**
         * ServerGroupId.
         */
        public Builder serverGroupId(String serverGroupId) {
            this.putBodyParameter("ServerGroupId", serverGroupId);
            this.serverGroupId = serverGroupId;
            return this;
        }

        @Override
        public UpdateListenerAttributeRequest build() {
            return new UpdateListenerAttributeRequest(this);
        } 

    } 

}
