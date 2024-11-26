// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qianzhou20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetClusterWarningRequest} extends {@link RequestModel}
 *
 * <p>GetClusterWarningRequest</p>
 */
public class GetClusterWarningRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clusterID")
    private String clusterID;

    private GetClusterWarningRequest(Builder builder) {
        super(builder);
        this.clusterID = builder.clusterID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterWarningRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterID
     */
    public String getClusterID() {
        return this.clusterID;
    }

    public static final class Builder extends Request.Builder<GetClusterWarningRequest, Builder> {
        private String clusterID; 

        private Builder() {
            super();
        } 

        private Builder(GetClusterWarningRequest request) {
            super(request);
            this.clusterID = request.clusterID;
        } 

        /**
         * clusterID.
         */
        public Builder clusterID(String clusterID) {
            this.putQueryParameter("clusterID", clusterID);
            this.clusterID = clusterID;
            return this;
        }

        @Override
        public GetClusterWarningRequest build() {
            return new GetClusterWarningRequest(this);
        } 

    } 

}
