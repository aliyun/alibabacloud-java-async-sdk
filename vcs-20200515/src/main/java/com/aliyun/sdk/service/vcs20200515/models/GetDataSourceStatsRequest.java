// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataSourceStatsRequest} extends {@link RequestModel}
 *
 * <p>GetDataSourceStatsRequest</p>
 */
public class GetDataSourceStatsRequest extends Request {
    @Body
    @NameInMap("CorpIdList")
    private String corpIdList;

    @Body
    @NameInMap("DataSourceType")
    private String dataSourceType;

    private GetDataSourceStatsRequest(Builder builder) {
        super(builder);
        this.corpIdList = builder.corpIdList;
        this.dataSourceType = builder.dataSourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataSourceStatsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpIdList
     */
    public String getCorpIdList() {
        return this.corpIdList;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public static final class Builder extends Request.Builder<GetDataSourceStatsRequest, Builder> {
        private String corpIdList; 
        private String dataSourceType; 

        private Builder() {
            super();
        } 

        private Builder(GetDataSourceStatsRequest response) {
            super(response);
            this.corpIdList = response.corpIdList;
            this.dataSourceType = response.dataSourceType;
        } 

        /**
         * CorpIdList.
         */
        public Builder corpIdList(String corpIdList) {
            this.putBodyParameter("CorpIdList", corpIdList);
            this.corpIdList = corpIdList;
            return this;
        }

        /**
         * DataSourceType.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putBodyParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        @Override
        public GetDataSourceStatsRequest build() {
            return new GetDataSourceStatsRequest(this);
        } 

    } 

}
