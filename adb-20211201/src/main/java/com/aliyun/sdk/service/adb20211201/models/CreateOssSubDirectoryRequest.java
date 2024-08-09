// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOssSubDirectoryRequest} extends {@link RequestModel}
 *
 * <p>CreateOssSubDirectoryRequest</p>
 */
public class CreateOssSubDirectoryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Path")
    @com.aliyun.core.annotation.Validation(required = true)
    private String path;

    private CreateOssSubDirectoryRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.path = builder.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOssSubDirectoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    public static final class Builder extends Request.Builder<CreateOssSubDirectoryRequest, Builder> {
        private String DBClusterId; 
        private String path; 

        private Builder() {
            super();
        } 

        private Builder(CreateOssSubDirectoryRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.path = request.path;
        } 

        /**
         * The ID of the AnalyticDB for MySQL Data Lakehouse Edition cluster.
         * <p>
         * 
         * >  You can call the [DescribeDBClusters](~~612397~~) operation to query the information about all AnalyticDB for MySQL Data Lakehouse Edition clusters within a region, including cluster IDs.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The OSS path where you want to create a subdirectory.
         */
        public Builder path(String path) {
            this.putBodyParameter("Path", path);
            this.path = path;
            return this;
        }

        @Override
        public CreateOssSubDirectoryRequest build() {
            return new CreateOssSubDirectoryRequest(this);
        } 

    } 

}
