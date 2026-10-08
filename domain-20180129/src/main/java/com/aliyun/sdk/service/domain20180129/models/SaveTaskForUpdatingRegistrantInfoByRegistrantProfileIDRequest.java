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
 * {@link SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest} extends {@link RequestModel}
 *
 * <p>SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest</p>
 */
public class SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistrantProfileId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long registrantProfileId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransferOutProhibited")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean transferOutProhibited;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.lang = builder.lang;
        this.registrantProfileId = builder.registrantProfileId;
        this.transferOutProhibited = builder.transferOutProhibited;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public java.util.List<String> getDomainName() {
        return this.domainName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return registrantProfileId
     */
    public Long getRegistrantProfileId() {
        return this.registrantProfileId;
    }

    /**
     * @return transferOutProhibited
     */
    public Boolean getTransferOutProhibited() {
        return this.transferOutProhibited;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest, Builder> {
        private java.util.List<String> domainName; 
        private String lang; 
        private Long registrantProfileId; 
        private Boolean transferOutProhibited; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.lang = request.lang;
            this.registrantProfileId = request.registrantProfileId;
            this.transferOutProhibited = request.transferOutProhibited;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * <p>A list of domain names. If you specify multiple domain names, pass them as a <strong>list</strong>. Call the <a href="https://help.aliyun.com/document_detail/69362.htm?spm=a2c4g.11186623.0.0.33f4253cSJy3m8">QueryDomainList</a> API to obtain a list of your domain names.</p>
         * <p>This parameter is required.</p>
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
         * <p>The language of error messages returned by the API. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong>: Chinese.</p>
         * </li>
         * <li><p><strong>en</strong>: English.</p>
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
         * <p>The registrant profile ID. Call the <a href="https://help.aliyun.com/document_detail/67701.htm?spm=a2c4g.11186623.0.0.33f420daTwRQaO">QueryRegistrantProfiles</a> API to query the registrant profile ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder registrantProfileId(Long registrantProfileId) {
            this.putQueryParameter("RegistrantProfileId", registrantProfileId);
            this.registrantProfileId = registrantProfileId;
            return this;
        }

        /**
         * <p>Specifies whether to enable a 60-day transfer lock on the domain name after its registrant information is updated. Valid values:</p>
         * <ul>
         * <li><p><strong>false</strong>: Do not apply the lock.</p>
         * </li>
         * <li><p><strong>true</strong>: Apply the lock.</p>
         * </li>
         * </ul>
         * <p>Default value: <strong>false</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder transferOutProhibited(Boolean transferOutProhibited) {
            this.putQueryParameter("TransferOutProhibited", transferOutProhibited);
            this.transferOutProhibited = transferOutProhibited;
            return this;
        }

        /**
         * <p>The IP address of the user. You can set this parameter to <strong>127.0.0.1</strong>.</p>
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
        public SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest build() {
            return new SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest(this);
        } 

    } 

}
