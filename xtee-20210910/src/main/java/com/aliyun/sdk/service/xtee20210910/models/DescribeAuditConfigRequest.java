// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
         * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Audit type</p>
         * 
         * <strong>example:</strong>
         * <p>RULE</p>
         */
        public Builder auditRelationType(String auditRelationType) {
            this.putQueryParameter("auditRelationType", auditRelationType);
            this.auditRelationType = auditRelationType;
            return this;
        }

        /**
         * <p>Region code</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
