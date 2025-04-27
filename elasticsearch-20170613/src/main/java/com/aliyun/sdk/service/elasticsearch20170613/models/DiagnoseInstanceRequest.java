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
 * {@link DiagnoseInstanceRequest} extends {@link RequestModel}
 *
 * <p>DiagnoseInstanceRequest</p>
 */
public class DiagnoseInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("diagnoseItems")
    private java.util.List<String> diagnoseItems;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("indices")
    private java.util.List<String> indices;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("lang")
    private String lang;

    private DiagnoseInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.clientToken = builder.clientToken;
        this.diagnoseItems = builder.diagnoseItems;
        this.indices = builder.indices;
        this.type = builder.type;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DiagnoseInstanceRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return diagnoseItems
     */
    public java.util.List<String> getDiagnoseItems() {
        return this.diagnoseItems;
    }

    /**
     * @return indices
     */
    public java.util.List<String> getIndices() {
        return this.indices;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DiagnoseInstanceRequest, Builder> {
        private String instanceId; 
        private String clientToken; 
        private java.util.List<String> diagnoseItems; 
        private java.util.List<String> indices; 
        private String type; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DiagnoseInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.clientToken = request.clientToken;
            this.diagnoseItems = request.diagnoseItems;
            this.indices = request.indices;
            this.type = request.type;
            this.lang = request.lang;
        } 

        /**
         * <p>The ID of the request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-n6w1o1x0w001c****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The timestamp when the diagnostic report was generated.</p>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * diagnoseItems.
         */
        public Builder diagnoseItems(java.util.List<String> diagnoseItems) {
            this.putBodyParameter("diagnoseItems", diagnoseItems);
            this.diagnoseItems = diagnoseItems;
            return this;
        }

        /**
         * indices.
         */
        public Builder indices(java.util.List<String> indices) {
            this.putBodyParameter("indices", indices);
            this.indices = indices;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public DiagnoseInstanceRequest build() {
            return new DiagnoseInstanceRequest(this);
        } 

    } 

}
