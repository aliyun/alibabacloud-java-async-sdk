// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link TripCCInfoQueryRequest} extends {@link RequestModel}
 *
 * <p>TripCCInfoQueryRequest</p>
 */
public class TripCCInfoQueryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("business_instance_id")
    private String businessInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("node_id")
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("third_business_id")
    private String thirdBusinessId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private TripCCInfoQueryRequest(Builder builder) {
        super(builder);
        this.businessInstanceId = builder.businessInstanceId;
        this.nodeId = builder.nodeId;
        this.thirdBusinessId = builder.thirdBusinessId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TripCCInfoQueryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessInstanceId
     */
    public String getBusinessInstanceId() {
        return this.businessInstanceId;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return thirdBusinessId
     */
    public String getThirdBusinessId() {
        return this.thirdBusinessId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<TripCCInfoQueryRequest, Builder> {
        private String businessInstanceId; 
        private String nodeId; 
        private String thirdBusinessId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(TripCCInfoQueryRequest request) {
            super(request);
            this.businessInstanceId = request.businessInstanceId;
            this.nodeId = request.nodeId;
            this.thirdBusinessId = request.thirdBusinessId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * business_instance_id.
         */
        public Builder businessInstanceId(String businessInstanceId) {
            this.putQueryParameter("business_instance_id", businessInstanceId);
            this.businessInstanceId = businessInstanceId;
            return this;
        }

        /**
         * node_id.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("node_id", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * third_business_id.
         */
        public Builder thirdBusinessId(String thirdBusinessId) {
            this.putQueryParameter("third_business_id", thirdBusinessId);
            this.thirdBusinessId = thirdBusinessId;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public TripCCInfoQueryRequest build() {
            return new TripCCInfoQueryRequest(this);
        } 

    } 

}
