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
 * {@link SubmitOperationAuditInfoRequest} extends {@link RequestModel}
 *
 * <p>SubmitOperationAuditInfoRequest</p>
 */
public class SubmitOperationAuditInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditInfo")
    private String auditInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer auditType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private SubmitOperationAuditInfoRequest(Builder builder) {
        super(builder);
        this.auditInfo = builder.auditInfo;
        this.auditType = builder.auditType;
        this.domainName = builder.domainName;
        this.id = builder.id;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitOperationAuditInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auditInfo
     */
    public String getAuditInfo() {
        return this.auditInfo;
    }

    /**
     * @return auditType
     */
    public Integer getAuditType() {
        return this.auditType;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<SubmitOperationAuditInfoRequest, Builder> {
        private String auditInfo; 
        private Integer auditType; 
        private String domainName; 
        private Long id; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(SubmitOperationAuditInfoRequest request) {
            super(request);
            this.auditInfo = request.auditInfo;
            this.auditType = request.auditType;
            this.domainName = request.domainName;
            this.id = request.id;
            this.lang = request.lang;
        } 

        /**
         * <p>The information to be reviewed. The displayed information varies by business type.</p>
         * 
         * <strong>example:</strong>
         * <p>个人 {&quot;regType&quot;:1,&quot;registrantName&quot;:&quot;张三&quot;,&quot;registrantNo&quot;:&quot;2201919190**&quot;,&quot;telephone&quot;:&quot;1390123****&quot;,&quot;account&quot;:&quot;<a href="mailto:zhangsan@alimail.com">zhangsan@alimail.com</a>&quot;,&quot;reason&quot;:1,&quot;remark&quot;:&quot;账号丢失&quot;} 企业 {&quot;regType&quot;:2,&quot;registrantName&quot;:&quot;华大信通&quot;,&quot;operatorName&quot;:&quot;王武&quot;,&quot;operatorNo&quot;:&quot;2201811987101901**&quot;,      &quot;operatorPhone&quot;:&quot;1390123****&quot;,&quot;account&quot;:&quot;<a href="mailto:wangwu@alimail.com">wangwu@alimail.com</a>&quot;,&quot;companyNo&quot;:&quot;91361100MA35N6****&quot;,&quot;reason&quot;:2,&quot;remark&quot;:&quot;账号丢失&quot;}</p>
         */
        public Builder auditInfo(String auditInfo) {
            this.putQueryParameter("AuditInfo", auditInfo);
            this.auditInfo = auditInfo;
            return this;
        }

        /**
         * <p>The business type. Valid values:</p>
         * <p><strong>1</strong>: Transfer a domain name offline, that is, transfer the domain name from the current Alibaba Cloud account to another Alibaba Cloud account.</p>
         * <p>This parameter is required.</p>
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
         * <p>The domain name. You can specify one or more domain names, separated by commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx.com,yyyy.cn</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The review ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The language of the error message returned by the API. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
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

        @Override
        public SubmitOperationAuditInfoRequest build() {
            return new SubmitOperationAuditInfoRequest(this);
        } 

    } 

}
