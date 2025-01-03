// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link DeleteUserHdfsInfoRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserHdfsInfoRequest</p>
 */
public class DeleteUserHdfsInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NameService")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nameService;

    private DeleteUserHdfsInfoRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nameService = builder.nameService;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserHdfsInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return nameService
     */
    public String getNameService() {
        return this.nameService;
    }

    public static final class Builder extends Request.Builder<DeleteUserHdfsInfoRequest, Builder> {
        private String clusterId; 
        private String nameService; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserHdfsInfoRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.nameService = request.nameService;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hb-bp16o0pd52e3y****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hdfs_test</p>
         */
        public Builder nameService(String nameService) {
            this.putQueryParameter("NameService", nameService);
            this.nameService = nameService;
            return this;
        }

        @Override
        public DeleteUserHdfsInfoRequest build() {
            return new DeleteUserHdfsInfoRequest(this);
        } 

    } 

}
