// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link GetConnectionRequest} extends {@link RequestModel}
 *
 * <p>GetConnectionRequest</p>
 */
public class GetConnectionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ConnectionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptOption")
    private String encryptOption;

    private GetConnectionRequest(Builder builder) {
        super(builder);
        this.connectionId = builder.connectionId;
        this.encryptOption = builder.encryptOption;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConnectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectionId
     */
    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * @return encryptOption
     */
    public String getEncryptOption() {
        return this.encryptOption;
    }

    public static final class Builder extends Request.Builder<GetConnectionRequest, Builder> {
        private String connectionId; 
        private String encryptOption; 

        private Builder() {
            super();
        } 

        private Builder(GetConnectionRequest request) {
            super(request);
            this.connectionId = request.connectionId;
            this.encryptOption = request.encryptOption;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>conn-pai9m***mi47</p>
         */
        public Builder connectionId(String connectionId) {
            this.putPathParameter("ConnectionId", connectionId);
            this.connectionId = connectionId;
            return this;
        }

        /**
         * EncryptOption.
         */
        public Builder encryptOption(String encryptOption) {
            this.putQueryParameter("EncryptOption", encryptOption);
            this.encryptOption = encryptOption;
            return this;
        }

        @Override
        public GetConnectionRequest build() {
            return new GetConnectionRequest(this);
        } 

    } 

}
