// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link RefreshAppInstanceTicketRequest} extends {@link RequestModel}
 *
 * <p>RefreshAppInstanceTicketRequest</p>
 */
public class RefreshAppInstanceTicketRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private RefreshAppInstanceTicketRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.token = builder.token;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshAppInstanceTicketRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<RefreshAppInstanceTicketRequest, Builder> {
        private String bizId; 
        private String token; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(RefreshAppInstanceTicketRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.token = request.token;
            this.uuid = request.uuid;
        } 

        /**
         * <p>Business ID of the application instance</p>
         * 
         * <strong>example:</strong>
         * <p>WD20250703155602000001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>Updated token information</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>c5c354d7-5e68-443a-b7fc-767e6ede9deb</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public RefreshAppInstanceTicketRequest build() {
            return new RefreshAppInstanceTicketRequest(this);
        } 

    } 

}
