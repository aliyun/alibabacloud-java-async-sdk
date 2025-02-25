// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataSourceTargetParamListRequest} extends {@link RequestModel}
 *
 * <p>GetDataSourceTargetParamListRequest</p>
 */
public class GetDataSourceTargetParamListRequest extends Request {
    @Query
    @NameInMap("DataSourceType")
    @Validation(required = true)
    private Integer dataSourceType;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private GetDataSourceTargetParamListRequest(Builder builder) {
        super(builder);
        this.dataSourceType = builder.dataSourceType;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataSourceTargetParamListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSourceType
     */
    public Integer getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<GetDataSourceTargetParamListRequest, Builder> {
        private Integer dataSourceType; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(GetDataSourceTargetParamListRequest request) {
            super(request);
            this.dataSourceType = request.dataSourceType;
            this.operaUid = request.operaUid;
        } 

        /**
         * DataSourceType.
         */
        public Builder dataSourceType(Integer dataSourceType) {
            this.putQueryParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
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
        public GetDataSourceTargetParamListRequest build() {
            return new GetDataSourceTargetParamListRequest(this);
        } 

    } 

}
