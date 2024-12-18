// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp11q28kvl688****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The directory ID of the template files that you want to delete.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/456205.html">GetSparkTemplateFullTree</a> operation to query the directory ID of template files.</p>
         * </li>
         * <li><p>When you specify a directory ID, the directory and all template files that are included in the directory are deleted.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>725204</p>
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
