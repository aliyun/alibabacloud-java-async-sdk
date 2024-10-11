// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/612397.html">DescribeDBClusters</a> operation to query the information about all AnalyticDB for MySQL Data Lakehouse Edition clusters within a region, including cluster IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp149vz49b36t****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The OSS path where you want to create a subdirectory.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://testBucketName/das_lakehouse</p>
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
