// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCertUrlByApplyIdRequest} extends {@link RequestModel}
 *
 * <p>QueryCertUrlByApplyIdRequest</p>
 */
public class QueryCertUrlByApplyIdRequest extends Request {
    @Query
    @NameInMap("ApplyId")
    @Validation(required = true)
    private Long applyId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    private QueryCertUrlByApplyIdRequest(Builder builder) {
        super(builder);
        this.applyId = builder.applyId;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCertUrlByApplyIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyId
     */
    public Long getApplyId() {
        return this.applyId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<QueryCertUrlByApplyIdRequest, Builder> {
        private Long applyId; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryCertUrlByApplyIdRequest response) {
            super(response);
            this.applyId = response.applyId;
            this.iotInstanceId = response.iotInstanceId;
        } 

        /**
         * ApplyId.
         */
        public Builder applyId(Long applyId) {
            this.putQueryParameter("ApplyId", applyId);
            this.applyId = applyId;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        @Override
        public QueryCertUrlByApplyIdRequest build() {
            return new QueryCertUrlByApplyIdRequest(this);
        } 

    } 

}
