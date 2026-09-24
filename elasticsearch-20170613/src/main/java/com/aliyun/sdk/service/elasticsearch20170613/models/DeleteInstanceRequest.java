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
 * {@link DeleteInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeleteInstanceRequest</p>
 */
public class DeleteInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("deleteType")
    private String deleteType;

    private DeleteInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.clientToken = builder.clientToken;
        this.deleteType = builder.deleteType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInstanceRequest create() {
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
     * @return deleteType
     */
    public String getDeleteType() {
        return this.deleteType;
    }

    public static final class Builder extends Request.Builder<DeleteInstanceRequest, Builder> {
        private String instanceId; 
        private String clientToken; 
        private String deleteType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.clientToken = request.clientToken;
            this.deleteType = request.deleteType;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-t57p81n7ai89v****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The release type. Valid values:</p>
         * <ul>
         * <li>immediate: The instance is immediately deleted. After deletion, the system permanently clears all data, and the instance no longer appears in the instance list.</li>
         * <li>protective: The instance is frozen for 24 hours before the data is permanently cleared. During this period, the instance still appears in the instance list, and you can choose to <a href="https://help.aliyun.com/document_detail/202195.html">restore the instance</a> or <a href="https://help.aliyun.com/document_detail/202195.html">immediately release it</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>protective</p>
         */
        public Builder deleteType(String deleteType) {
            this.putQueryParameter("deleteType", deleteType);
            this.deleteType = deleteType;
            return this;
        }

        @Override
        public DeleteInstanceRequest build() {
            return new DeleteInstanceRequest(this);
        } 

    } 

}
