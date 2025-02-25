// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_apm20220214.models;

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
 * {@link DeleteSymRecordsRequest} extends {@link RequestModel}
 *
 * <p>DeleteSymRecordsRequest</p>
 */
public class DeleteSymRecordsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("appVersions")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> appVersions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileType")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 4, minimum = 1)
    private Integer fileType;

    private DeleteSymRecordsRequest(Builder builder) {
        super(builder);
        this.appVersions = builder.appVersions;
        this.dataSourceId = builder.dataSourceId;
        this.fileType = builder.fileType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSymRecordsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appVersions
     */
    public java.util.List<String> getAppVersions() {
        return this.appVersions;
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return fileType
     */
    public Integer getFileType() {
        return this.fileType;
    }

    public static final class Builder extends Request.Builder<DeleteSymRecordsRequest, Builder> {
        private java.util.List<String> appVersions; 
        private String dataSourceId; 
        private Integer fileType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSymRecordsRequest request) {
            super(request);
            this.appVersions = request.appVersions;
            this.dataSourceId = request.dataSourceId;
            this.fileType = request.fileType;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appVersions(java.util.List<String> appVersions) {
            String appVersionsShrink = shrink(appVersions, "appVersions", "simple");
            this.putBodyParameter("appVersions", appVersionsShrink);
            this.appVersions = appVersions;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5fb6001a73749c24fd9cb356</p>
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putBodyParameter("dataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder fileType(Integer fileType) {
            this.putBodyParameter("fileType", fileType);
            this.fileType = fileType;
            return this;
        }

        @Override
        public DeleteSymRecordsRequest build() {
            return new DeleteSymRecordsRequest(this);
        } 

    } 

}
