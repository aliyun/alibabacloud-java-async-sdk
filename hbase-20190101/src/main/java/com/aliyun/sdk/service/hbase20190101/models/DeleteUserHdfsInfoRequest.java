// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUserHdfsInfoRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserHdfsInfoRequest</p>
 */
public class DeleteUserHdfsInfoRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("NameService")
    @Validation(required = true)
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
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * NameService.
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
