// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link SubmitOperationCredentialsRequest} extends {@link RequestModel}
 *
 * <p>SubmitOperationCredentialsRequest</p>
 */
public class SubmitOperationCredentialsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditRecordId")
    private Long auditRecordId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditType")
    private Integer auditType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Credentials")
    private String credentials;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegType")
    private Integer regType;

    private SubmitOperationCredentialsRequest(Builder builder) {
        super(builder);
        this.auditRecordId = builder.auditRecordId;
        this.auditType = builder.auditType;
        this.credentials = builder.credentials;
        this.lang = builder.lang;
        this.regType = builder.regType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitOperationCredentialsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auditRecordId
     */
    public Long getAuditRecordId() {
        return this.auditRecordId;
    }

    /**
     * @return auditType
     */
    public Integer getAuditType() {
        return this.auditType;
    }

    /**
     * @return credentials
     */
    public String getCredentials() {
        return this.credentials;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regType
     */
    public Integer getRegType() {
        return this.regType;
    }

    public static final class Builder extends Request.Builder<SubmitOperationCredentialsRequest, Builder> {
        private Long auditRecordId; 
        private Integer auditType; 
        private String credentials; 
        private String lang; 
        private Integer regType; 

        private Builder() {
            super();
        } 

        private Builder(SubmitOperationCredentialsRequest request) {
            super(request);
            this.auditRecordId = request.auditRecordId;
            this.auditType = request.auditType;
            this.credentials = request.credentials;
            this.lang = request.lang;
            this.regType = request.regType;
        } 

        /**
         * <p>Review record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder auditRecordId(Long auditRecordId) {
            this.putQueryParameter("AuditRecordId", auditRecordId);
            this.auditRecordId = auditRecordId;
            return this;
        }

        /**
         * <p>Review type. Valid value:<br><strong>1</strong>: Offline domain name transfer.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder auditType(Integer auditType) {
            this.putQueryParameter("AuditType", auditType);
            this.auditType = auditType;
            return this;
        }

        /**
         * <p>Certificate materials pending review.</p>
         */
        public Builder credentials(String credentials) {
            this.putQueryParameter("Credentials", credentials);
            this.credentials = credentials;
            return this;
        }

        /**
         * <p>Language of the error message returned by the API. Valid values:  </p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.  </li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * <p>Default value: <strong>en</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Registrant type. Valid values:  </p>
         * <ul>
         * <li><strong>1</strong>: Individual.  </li>
         * <li><strong>2</strong>: Enterprise.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder regType(Integer regType) {
            this.putQueryParameter("RegType", regType);
            this.regType = regType;
            return this;
        }

        @Override
        public SubmitOperationCredentialsRequest build() {
            return new SubmitOperationCredentialsRequest(this);
        } 

    } 

}
