// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20220913.models;

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
 * {@link BuildStsAK2Request} extends {@link RequestModel}
 *
 * <p>BuildStsAK2Request</p>
 */
public class BuildStsAK2Request extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientId")
    private Long clientId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataSetId")
    private Long dataSetId;

    private BuildStsAK2Request(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.dataSetId = builder.dataSetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BuildStsAK2Request create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public Long getClientId() {
        return this.clientId;
    }

    /**
     * @return dataSetId
     */
    public Long getDataSetId() {
        return this.dataSetId;
    }

    public static final class Builder extends Request.Builder<BuildStsAK2Request, Builder> {
        private Long clientId; 
        private Long dataSetId; 

        private Builder() {
            super();
        } 

        private Builder(BuildStsAK2Request request) {
            super(request);
            this.clientId = request.clientId;
            this.dataSetId = request.dataSetId;
        } 

        /**
         * clientId.
         */
        public Builder clientId(Long clientId) {
            this.putBodyParameter("clientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * dataSetId.
         */
        public Builder dataSetId(Long dataSetId) {
            this.putBodyParameter("dataSetId", dataSetId);
            this.dataSetId = dataSetId;
            return this;
        }

        @Override
        public BuildStsAK2Request build() {
            return new BuildStsAK2Request(this);
        } 

    } 

}
