// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDataSourceConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataSourceConfigRequest</p>
 */
public class UpdateDataSourceConfigRequest extends Request {
    @Query
    @NameInMap("DataSourceDescribe")
    private String dataSourceDescribe;

    @Query
    @NameInMap("DataSourceName")
    private String dataSourceName;

    @Query
    @NameInMap("DataSourceParams")
    private String dataSourceParams;

    @Query
    @NameInMap("DataSourceParamsMapping")
    private String dataSourceParamsMapping;

    @Query
    @NameInMap("DataSourceType")
    private Integer dataSourceType;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private UpdateDataSourceConfigRequest(Builder builder) {
        super(builder);
        this.dataSourceDescribe = builder.dataSourceDescribe;
        this.dataSourceName = builder.dataSourceName;
        this.dataSourceParams = builder.dataSourceParams;
        this.dataSourceParamsMapping = builder.dataSourceParamsMapping;
        this.dataSourceType = builder.dataSourceType;
        this.id = builder.id;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataSourceConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSourceDescribe
     */
    public String getDataSourceDescribe() {
        return this.dataSourceDescribe;
    }

    /**
     * @return dataSourceName
     */
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * @return dataSourceParams
     */
    public String getDataSourceParams() {
        return this.dataSourceParams;
    }

    /**
     * @return dataSourceParamsMapping
     */
    public String getDataSourceParamsMapping() {
        return this.dataSourceParamsMapping;
    }

    /**
     * @return dataSourceType
     */
    public Integer getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<UpdateDataSourceConfigRequest, Builder> {
        private String dataSourceDescribe; 
        private String dataSourceName; 
        private String dataSourceParams; 
        private String dataSourceParamsMapping; 
        private Integer dataSourceType; 
        private Long id; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataSourceConfigRequest request) {
            super(request);
            this.dataSourceDescribe = request.dataSourceDescribe;
            this.dataSourceName = request.dataSourceName;
            this.dataSourceParams = request.dataSourceParams;
            this.dataSourceParamsMapping = request.dataSourceParamsMapping;
            this.dataSourceType = request.dataSourceType;
            this.id = request.id;
            this.operaUid = request.operaUid;
        } 

        /**
         * DataSourceDescribe.
         */
        public Builder dataSourceDescribe(String dataSourceDescribe) {
            this.putQueryParameter("DataSourceDescribe", dataSourceDescribe);
            this.dataSourceDescribe = dataSourceDescribe;
            return this;
        }

        /**
         * DataSourceName.
         */
        public Builder dataSourceName(String dataSourceName) {
            this.putQueryParameter("DataSourceName", dataSourceName);
            this.dataSourceName = dataSourceName;
            return this;
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
         * DataSourceParamsMapping.
         */
        public Builder dataSourceParamsMapping(String dataSourceParamsMapping) {
            this.putQueryParameter("DataSourceParamsMapping", dataSourceParamsMapping);
            this.dataSourceParamsMapping = dataSourceParamsMapping;
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
         * Id.
         */
        public Builder id(Long id) {
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
        public UpdateDataSourceConfigRequest build() {
            return new UpdateDataSourceConfigRequest(this);
        } 

    } 

}
