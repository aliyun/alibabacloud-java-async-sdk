// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuditConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeAuditConfigRequest</p>
 */
public class DescribeAuditConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("auditRelationType")
    private String auditRelationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private DescribeAuditConfigRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.auditRelationType = builder.auditRelationType;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAuditConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return auditRelationType
     */
    public String getAuditRelationType() {
        return this.auditRelationType;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DescribeAuditConfigRequest, Builder> {
        private String lang; 
        private String auditRelationType; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAuditConfigRequest request) {
            super(request);
            this.lang = request.lang;
            this.auditRelationType = request.auditRelationType;
            this.regId = request.regId;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * auditRelationType.
         */
        public Builder auditRelationType(String auditRelationType) {
            this.putQueryParameter("auditRelationType", auditRelationType);
            this.auditRelationType = auditRelationType;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public DescribeAuditConfigRequest build() {
            return new DescribeAuditConfigRequest(this);
        } 

    } 

}
