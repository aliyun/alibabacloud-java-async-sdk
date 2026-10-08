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
 * {@link UpdateDomainToDomainGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateDomainToDomainGroupRequest</p>
 */
public class UpdateDomainToDomainGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSource")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer dataSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long domainGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private java.util.List<String> domainName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileToUpload")
    private String fileToUpload;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Replace")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean replace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private UpdateDomainToDomainGroupRequest(Builder builder) {
        super(builder);
        this.dataSource = builder.dataSource;
        this.domainGroupId = builder.domainGroupId;
        this.domainName = builder.domainName;
        this.fileToUpload = builder.fileToUpload;
        this.lang = builder.lang;
        this.replace = builder.replace;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDomainToDomainGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSource
     */
    public Integer getDataSource() {
        return this.dataSource;
    }

    /**
     * @return domainGroupId
     */
    public Long getDomainGroupId() {
        return this.domainGroupId;
    }

    /**
     * @return domainName
     */
    public java.util.List<String> getDomainName() {
        return this.domainName;
    }

    /**
     * @return fileToUpload
     */
    public String getFileToUpload() {
        return this.fileToUpload;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return replace
     */
    public Boolean getReplace() {
        return this.replace;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<UpdateDomainToDomainGroupRequest, Builder> {
        private Integer dataSource; 
        private Long domainGroupId; 
        private java.util.List<String> domainName; 
        private String fileToUpload; 
        private String lang; 
        private Boolean replace; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDomainToDomainGroupRequest request) {
            super(request);
            this.dataSource = request.dataSource;
            this.domainGroupId = request.domainGroupId;
            this.domainName = request.domainName;
            this.fileToUpload = request.fileToUpload;
            this.lang = request.lang;
            this.replace = request.replace;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * <p>The data source for the domain names. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: custom input.</p>
         * </li>
         * <li><p><strong>2</strong>: file upload.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder dataSource(Integer dataSource) {
            this.putQueryParameter("DataSource", dataSource);
            this.dataSource = dataSource;
            return this;
        }

        /**
         * <p>The ID of the domain name group. Call the <a href="https://help.aliyun.com/document_detail/69362.html">QueryDomainGroupList</a> API to get this ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder domainGroupId(Long domainGroupId) {
            this.putQueryParameter("DomainGroupId", domainGroupId);
            this.domainGroupId = domainGroupId;
            return this;
        }

        /**
         * <p>An array of domain names. This parameter is required when DataSource is set to 1 (custom input).</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(java.util.List<String> domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The Base64-encoded content of a file. This parameter is required if you set DataSource to 2. The file must be in <strong>.xls</strong> or <strong>.xlsx</strong> format, contain one domain name per line, and not exceed 2 MB.</p>
         * 
         * <strong>example:</strong>
         * <p>dGVzdA==</p>
         */
        public Builder fileToUpload(String fileToUpload) {
            this.putBodyParameter("FileToUpload", fileToUpload);
            this.fileToUpload = fileToUpload;
            return this;
        }

        /**
         * <p>The language of API error messages. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong>: Chinese</p>
         * </li>
         * <li><p><strong>en</strong>: English</p>
         * </li>
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
         * <p>Specifies whether to replace the existing domain names in the group. Valid values:</p>
         * <ul>
         * <li><p><strong>false</strong>: Adds the new domain names to the group.</p>
         * </li>
         * <li><p><strong>true</strong>: Replaces all existing domain names in the group with the new ones.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder replace(Boolean replace) {
            this.putQueryParameter("Replace", replace);
            this.replace = replace;
            return this;
        }

        /**
         * <p>The user IP address. You can set this parameter to <strong>127.0.0.1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public UpdateDomainToDomainGroupRequest build() {
            return new UpdateDomainToDomainGroupRequest(this);
        } 

    } 

}
