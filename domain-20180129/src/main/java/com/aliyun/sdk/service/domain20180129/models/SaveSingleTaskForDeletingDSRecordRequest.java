// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SaveSingleTaskForDeletingDSRecordRequest} extends {@link RequestModel}
 *
 * <p>SaveSingleTaskForDeletingDSRecordRequest</p>
 */
public class SaveSingleTaskForDeletingDSRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyTag")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer keyTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private SaveSingleTaskForDeletingDSRecordRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.keyTag = builder.keyTag;
        this.lang = builder.lang;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveSingleTaskForDeletingDSRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return keyTag
     */
    public Integer getKeyTag() {
        return this.keyTag;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<SaveSingleTaskForDeletingDSRecordRequest, Builder> {
        private String domainName; 
        private Integer keyTag; 
        private String lang; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveSingleTaskForDeletingDSRecordRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.keyTag = request.keyTag;
            this.lang = request.lang;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder keyTag(Integer keyTag) {
            this.putQueryParameter("KeyTag", keyTag);
            this.keyTag = keyTag;
            return this;
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
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public SaveSingleTaskForDeletingDSRecordRequest build() {
            return new SaveSingleTaskForDeletingDSRecordRequest(this);
        } 

    } 

}
