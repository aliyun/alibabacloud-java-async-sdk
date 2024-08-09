// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSparkTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteSparkTemplateRequest</p>
 */
public class DeleteSparkTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String DBClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    private DeleteSparkTemplateRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSparkTemplateRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteSparkTemplateRequest, Builder> {
        private String DBClusterId; 
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSparkTemplateRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.id = request.id;
        } 

        /**
         * The ID of the AnalyticDB for MySQL Data Lakehouse Edition cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The directory ID of the template files that you want to delete.
         * <p>
         * 
         * > 
         * 
         * *   You can call the [GetSparkTemplateFullTree](~~456205~~) operation to query the directory ID of template files.
         * 
         * *   When you specify a directory ID, the directory and all template files that are included in the directory are deleted.
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteSparkTemplateRequest build() {
            return new DeleteSparkTemplateRequest(this);
        } 

    } 

}
