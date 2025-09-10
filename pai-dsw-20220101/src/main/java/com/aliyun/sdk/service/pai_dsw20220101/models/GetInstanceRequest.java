// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link GetInstanceRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceRequest</p>
 */
public class GetInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Fields")
    private String fields;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private GetInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.fields = builder.fields;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceRequest create() {
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
     * @return fields
     */
    public String getFields() {
        return this.fields;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<GetInstanceRequest, Builder> {
        private String instanceId; 
        private String fields; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.fields = request.fields;
            this.token = request.token;
        } 

        /**
         * <p>The instance ID. You can call <a href="https://help.aliyun.com/document_detail/470439.html">ListInstances</a> to obtain the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dsw-730xxxxxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Fields.
         */
        public Builder fields(String fields) {
            this.putQueryParameter("Fields", fields);
            this.fields = fields;
            return this;
        }

        /**
         * <p>The sharing token information.</p>
         * 
         * <strong>example:</strong>
         * <p>WUzWCMr325LV0bH2JH4C4HoDaKIU6C4S</p>
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public GetInstanceRequest build() {
            return new GetInstanceRequest(this);
        } 

    } 

}
