// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSparkTemplateFileRequest} extends {@link RequestModel}
 *
 * <p>DeleteSparkTemplateFileRequest</p>
 */
public class DeleteSparkTemplateFileRequest extends Request {
    @Body
    @NameInMap("DBClusterId")
    @Validation(required = true, maxLength = 64)
    private String DBClusterId;

    @Body
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    private DeleteSparkTemplateFileRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSparkTemplateFileRequest create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeleteSparkTemplateFileRequest, Builder> {
        private String DBClusterId; 
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSparkTemplateFileRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.id = request.id;
        } 

        /**
         * The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The ID of the template file to be deleted.
         * <p>
         * 
         * >  You can call the [GetSparkTemplateFullTree](~~456205#doc-api-adb-GetSparkTemplateFullTree~~) operation to query the IDs of all existing template files.
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteSparkTemplateFileRequest build() {
            return new DeleteSparkTemplateFileRequest(this);
        } 

    } 

}
