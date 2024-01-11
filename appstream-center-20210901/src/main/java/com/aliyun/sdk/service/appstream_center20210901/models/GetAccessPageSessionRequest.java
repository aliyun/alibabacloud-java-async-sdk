// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccessPageSessionRequest} extends {@link RequestModel}
 *
 * <p>GetAccessPageSessionRequest</p>
 */
public class GetAccessPageSessionRequest extends Request {
    @Query
    @NameInMap("AccessPageId")
    @Validation(required = true)
    private String accessPageId;

    @Query
    @NameInMap("AccessPageToken")
    @Validation(required = true)
    private String accessPageToken;

    @Query
    @NameInMap("ExternalUserId")
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
         * AccessPageId.
         */
        public Builder accessPageId(String accessPageId) {
            this.putQueryParameter("AccessPageId", accessPageId);
            this.accessPageId = accessPageId;
            return this;
        }

        /**
         * AccessPageToken.
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
