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
         * <p>The name of the exported file. The name can be up to 1,024 characters in length. The default name suffix is log.csv.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-log.csv</p>
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("file_name", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The export language. Default value: zh-CN. Valid values:</p>
         * <ul>
         * <li>zh-CN: Chinese</li>
         * <li>en_US: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh_CN</p>
         */
        public Builder language(String language) {
            this.putBodyParameter("language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The sort order based on the operation time. If you leave this parameter empty, the value acted_at DESC is used. Valid values:</p>
         * <ul>
         * <li>acted_at DESC: sorts the entries by operation time in descending order</li>
         * <li>acted_at ASC: sorts the entries by operation time in ascending order</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acted_at DESC</p>
         */
        public Builder orderBy(String orderBy) {
            this.putBodyParameter("order_by", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The fields used for query. You can specify one or more of the following fields:</p>
         * <ul>
         * <li>drive_id (space ID, in the form of a string)</li>
         * <li>actor_id (operator ID, in the form of a string)</li>
         * <li>acted_at (operation time, in the yyyy-MM-ddTHH:mm:ssZ format in UTC, for example, 2006-01-02T00:00:00)</li>
         * <li>action_type (operation type, in the form of a string)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acted_at &gt; &quot;2025-03-10T16:00:00&quot; and acted_at &lt; &quot;2025-03-17T15:59:59&quot;</p>
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
