// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qianzhou20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetUserClusterWarningRequest} extends {@link RequestModel}
 *
 * <p>GetUserClusterWarningRequest</p>
 */
public class GetUserClusterWarningRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("userID")
    private String userID;

    private GetUserClusterWarningRequest(Builder builder) {
        super(builder);
        this.userID = builder.userID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserClusterWarningRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userID
     */
    public String getUserID() {
        return this.userID;
    }

    public static final class Builder extends Request.Builder<GetUserClusterWarningRequest, Builder> {
        private String userID; 

        private Builder() {
            super();
        } 

        private Builder(GetUserClusterWarningRequest request) {
            super(request);
            this.userID = request.userID;
        } 

        /**
         * userID.
         */
        public Builder userID(String userID) {
            this.putQueryParameter("userID", userID);
            this.userID = userID;
            return this;
        }

        @Override
        public GetUserClusterWarningRequest build() {
            return new GetUserClusterWarningRequest(this);
        } 

    } 

}
