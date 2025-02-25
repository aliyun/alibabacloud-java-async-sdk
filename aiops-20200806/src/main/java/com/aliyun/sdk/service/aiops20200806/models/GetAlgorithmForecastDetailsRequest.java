// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAlgorithmForecastDetailsRequest} extends {@link RequestModel}
 *
 * <p>GetAlgorithmForecastDetailsRequest</p>
 */
public class GetAlgorithmForecastDetailsRequest extends Request {
    @Query
    @NameInMap("AliUid")
    private String aliUid;

    @Query
    @NameInMap("Id")
    private Integer id;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private GetAlgorithmForecastDetailsRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.id = builder.id;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlgorithmForecastDetailsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public String getAliUid() {
        return this.aliUid;
    }

    /**
     * @return id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<GetAlgorithmForecastDetailsRequest, Builder> {
        private String aliUid; 
        private Integer id; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(GetAlgorithmForecastDetailsRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.id = request.id;
            this.operaUid = request.operaUid;
        } 

        /**
         * AliUid.
         */
        public Builder aliUid(String aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Integer id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        @Override
        public GetAlgorithmForecastDetailsRequest build() {
            return new GetAlgorithmForecastDetailsRequest(this);
        } 

    } 

}
