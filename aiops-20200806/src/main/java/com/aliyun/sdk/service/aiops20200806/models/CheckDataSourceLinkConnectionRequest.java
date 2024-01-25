// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDataSourceLinkConnectionRequest} extends {@link RequestModel}
 *
 * <p>CheckDataSourceLinkConnectionRequest</p>
 */
public class CheckDataSourceLinkConnectionRequest extends Request {
    @Query
    @NameInMap("DataSourceParams")
    @Validation(required = true)
    private String dataSourceParams;

    @Query
    @NameInMap("DataSourceType")
    @Validation(required = true)
    private Integer dataSourceType;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private CheckDataSourceLinkConnectionRequest(Builder builder) {
        super(builder);
        this.dataSourceParams = builder.dataSourceParams;
        this.dataSourceType = builder.dataSourceType;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDataSourceLinkConnectionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSourceParams
     */
    public String getDataSourceParams() {
        return this.dataSourceParams;
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

    public static final class Builder extends Request.Builder<CheckDataSourceLinkConnectionRequest, Builder> {
        private String dataSourceParams; 
        private Integer dataSourceType; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(CheckDataSourceLinkConnectionRequest request) {
            super(request);
            this.dataSourceParams = request.dataSourceParams;
            this.dataSourceType = request.dataSourceType;
            this.operaUid = request.operaUid;
        } 

        /**
         * DataSourceParams.
         */
        public Builder dataSourceParams(String dataSourceParams) {
            this.putQueryParameter("DataSourceParams", dataSourceParams);
            this.dataSourceParams = dataSourceParams;
            return this;
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
        public CheckDataSourceLinkConnectionRequest build() {
            return new CheckDataSourceLinkConnectionRequest(this);
        } 

    } 

}
