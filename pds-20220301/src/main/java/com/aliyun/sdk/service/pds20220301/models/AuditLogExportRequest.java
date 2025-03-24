// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link AuditLogExportRequest} extends {@link RequestModel}
 *
 * <p>AuditLogExportRequest</p>
 */
public class AuditLogExportRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("file_name")
    private String fileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("language")
    private String language;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order_by")
    private String orderBy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    private AuditLogExportRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.fileName = builder.fileName;
        this.language = builder.language;
        this.orderBy = builder.orderBy;
        this.query = builder.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuditLogExportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    public static final class Builder extends Request.Builder<AuditLogExportRequest, Builder> {
        private String domainId; 
        private String fileName; 
        private String language; 
        private String orderBy; 
        private String query; 

        private Builder() {
            super();
        } 

        private Builder(AuditLogExportRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.fileName = request.fileName;
            this.language = request.language;
            this.orderBy = request.orderBy;
            this.query = request.query;
        } 

        /**
         * <p>A short description of struct</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * file_name.
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("file_name", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * language.
         */
        public Builder language(String language) {
            this.putBodyParameter("language", language);
            this.language = language;
            return this;
        }

        /**
         * order_by.
         */
        public Builder orderBy(String orderBy) {
            this.putBodyParameter("order_by", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * query.
         */
        public Builder query(String query) {
            this.putBodyParameter("query", query);
            this.query = query;
            return this;
        }

        @Override
        public AuditLogExportRequest build() {
            return new AuditLogExportRequest(this);
        } 

    } 

}
