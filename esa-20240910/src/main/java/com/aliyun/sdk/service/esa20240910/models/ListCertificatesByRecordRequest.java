// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListCertificatesByRecordRequest} extends {@link RequestModel}
 *
 * <p>ListCertificatesByRecordRequest</p>
 */
public class ListCertificatesByRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Detail")
    private Boolean detail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String recordName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidOnly")
    private Boolean validOnly;

    private ListCertificatesByRecordRequest(Builder builder) {
        super(builder);
        this.detail = builder.detail;
        this.recordName = builder.recordName;
        this.siteId = builder.siteId;
        this.validOnly = builder.validOnly;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCertificatesByRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detail
     */
    public Boolean getDetail() {
        return this.detail;
    }

    /**
     * @return recordName
     */
    public String getRecordName() {
        return this.recordName;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return validOnly
     */
    public Boolean getValidOnly() {
        return this.validOnly;
    }

    public static final class Builder extends Request.Builder<ListCertificatesByRecordRequest, Builder> {
        private Boolean detail; 
        private String recordName; 
        private Long siteId; 
        private Boolean validOnly; 

        private Builder() {
            super();
        } 

        private Builder(ListCertificatesByRecordRequest request) {
            super(request);
            this.detail = request.detail;
            this.recordName = request.recordName;
            this.siteId = request.siteId;
            this.validOnly = request.validOnly;
        } 

        /**
         * Detail.
         */
        public Builder detail(Boolean detail) {
            this.putQueryParameter("Detail", detail);
            this.detail = detail;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder recordName(String recordName) {
            this.putQueryParameter("RecordName", recordName);
            this.recordName = recordName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * ValidOnly.
         */
        public Builder validOnly(Boolean validOnly) {
            this.putQueryParameter("ValidOnly", validOnly);
            this.validOnly = validOnly;
            return this;
        }

        @Override
        public ListCertificatesByRecordRequest build() {
            return new ListCertificatesByRecordRequest(this);
        } 

    } 

}
