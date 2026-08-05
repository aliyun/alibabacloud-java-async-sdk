// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240401.models;

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
 * {@link GetTableFieldsRequest} extends {@link RequestModel}
 *
 * <p>GetTableFieldsRequest</p>
 */
public class GetTableFieldsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("dataSourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("params")
    @com.aliyun.core.annotation.Validation(required = true)
    private String params;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("rawType")
    private Boolean rawType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private GetTableFieldsRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.dataSourceType = builder.dataSourceType;
        this.params = builder.params;
        this.rawType = builder.rawType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableFieldsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return rawType
     */
    public Boolean getRawType() {
        return this.rawType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetTableFieldsRequest, Builder> {
        private String workspaceName; 
        private String dataSourceType; 
        private String params; 
        private Boolean rawType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetTableFieldsRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.dataSourceType = request.dataSourceType;
            this.params = request.params;
            this.rawType = request.rawType;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>odps</p>
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putPathParameter("dataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         * &quot;accessKeySecret&quot;: &quot;sk&quot;,
         * &quot;accessKey&quot;: &quot;ak&quot;,
         * &quot;projectName&quot;: &quot;test_name&quot;,
         * &quot;tableName&quot;: &quot;test_table&quot;,
         * &quot;partition&quot;: &quot;20240904&quot;
         * }</p>
         */
        public Builder params(String params) {
            this.putQueryParameter("params", params);
            this.params = params;
            return this;
        }

        /**
         * rawType.
         */
        public Builder rawType(Boolean rawType) {
            this.putQueryParameter("rawType", rawType);
            this.rawType = rawType;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetTableFieldsRequest build() {
            return new GetTableFieldsRequest(this);
        } 

    } 

}
