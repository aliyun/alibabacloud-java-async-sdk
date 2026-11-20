// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ModelGroupClientDTO} extends {@link TeaModel}
 *
 * <p>ModelGroupClientDTO</p>
 */
public class ModelGroupClientDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiKeys")
    private java.util.List<ModelGroupClientKeyItemDTO> apiKeys;

    @com.aliyun.core.annotation.NameInMap("clientId")
    private Long clientId;

    @com.aliyun.core.annotation.NameInMap("clientName")
    private String clientName;

    private ModelGroupClientDTO(Builder builder) {
        this.apiKeys = builder.apiKeys;
        this.clientId = builder.clientId;
        this.clientName = builder.clientName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelGroupClientDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKeys
     */
    public java.util.List<ModelGroupClientKeyItemDTO> getApiKeys() {
        return this.apiKeys;
    }

    /**
     * @return clientId
     */
    public Long getClientId() {
        return this.clientId;
    }

    /**
     * @return clientName
     */
    public String getClientName() {
        return this.clientName;
    }

    public static final class Builder {
        private java.util.List<ModelGroupClientKeyItemDTO> apiKeys; 
        private Long clientId; 
        private String clientName; 

        private Builder() {
        } 

        private Builder(ModelGroupClientDTO model) {
            this.apiKeys = model.apiKeys;
            this.clientId = model.clientId;
            this.clientName = model.clientName;
        } 

        /**
         * <p>The list of API key summaries for the department.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder apiKeys(java.util.List<ModelGroupClientKeyItemDTO> apiKeys) {
            this.apiKeys = apiKeys;
            return this;
        }

        /**
         * <p>The department ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder clientId(Long clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The department name.</p>
         * 
         * <strong>example:</strong>
         * <p>User A-Professional Edition</p>
         */
        public Builder clientName(String clientName) {
            this.clientName = clientName;
            return this;
        }

        public ModelGroupClientDTO build() {
            return new ModelGroupClientDTO(this);
        } 

    } 

}
