// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link GetAccessPageSessionRequest} extends {@link RequestModel}
 *
 * <p>GetAccessPageSessionRequest</p>
 */
public class GetAccessPageSessionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessPageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessPageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessPageToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessPageToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExternalUserId")
    private String externalUserId;

    private GetAccessPageSessionRequest(Builder builder) {
        super(builder);
        this.accessPageId = builder.accessPageId;
        this.accessPageToken = builder.accessPageToken;
        this.externalUserId = builder.externalUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccessPageSessionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessPageId
     */
    public String getAccessPageId() {
        return this.accessPageId;
    }

    /**
     * @return accessPageToken
     */
    public String getAccessPageToken() {
        return this.accessPageToken;
    }

    /**
     * @return externalUserId
     */
    public String getExternalUserId() {
        return this.externalUserId;
    }

    public static final class Builder extends Request.Builder<GetAccessPageSessionRequest, Builder> {
        private String accessPageId; 
        private String accessPageToken; 
        private String externalUserId; 

        private Builder() {
            super();
        } 

        private Builder(GetAccessPageSessionRequest request) {
            super(request);
            this.accessPageId = request.accessPageId;
            this.accessPageToken = request.accessPageToken;
            this.externalUserId = request.externalUserId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a-062wec3cwmayw****</p>
         */
        public Builder accessPageId(String accessPageId) {
            this.putQueryParameter("AccessPageId", accessPageId);
            this.accessPageId = accessPageId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8141B1A674D48ACB8E5D2D6CE53FDB2F3CF8710A5F8F78578D5254BC6F******</p>
         */
        public Builder accessPageToken(String accessPageToken) {
            this.putQueryParameter("AccessPageToken", accessPageToken);
            this.accessPageToken = accessPageToken;
            return this;
        }

        /**
         * ExternalUserId.
         */
        public Builder externalUserId(String externalUserId) {
            this.putQueryParameter("ExternalUserId", externalUserId);
            this.externalUserId = externalUserId;
            return this;
        }

        @Override
        public GetAccessPageSessionRequest build() {
            return new GetAccessPageSessionRequest(this);
        } 

    } 

}
