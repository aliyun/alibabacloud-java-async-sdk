// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetShareLinkTokenRequest} extends {@link RequestModel}
 *
 * <p>GetShareLinkTokenRequest</p>
 */
public class GetShareLinkTokenRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expire_sec")
    private Integer expireSec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("share_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shareId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("share_pwd")
    private String sharePwd;

    private GetShareLinkTokenRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.expireSec = builder.expireSec;
        this.shareId = builder.shareId;
        this.sharePwd = builder.sharePwd;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetShareLinkTokenRequest create() {
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
     * @return expireSec
     */
    public Integer getExpireSec() {
        return this.expireSec;
    }

    /**
     * @return shareId
     */
    public String getShareId() {
        return this.shareId;
    }

    /**
     * @return sharePwd
     */
    public String getSharePwd() {
        return this.sharePwd;
    }

    public static final class Builder extends Request.Builder<GetShareLinkTokenRequest, Builder> {
        private String domainId; 
        private Integer expireSec; 
        private String shareId; 
        private String sharePwd; 

        private Builder() {
            super();
        } 

        private Builder(GetShareLinkTokenRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.expireSec = request.expireSec;
            this.shareId = request.shareId;
            this.sharePwd = request.sharePwd;
        } 

        /**
         * domain_id.
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * The validity period of the token. Valid values: (0,7200]. Default value: 7200. Unit: seconds.
         */
        public Builder expireSec(Integer expireSec) {
            this.putBodyParameter("expire_sec", expireSec);
            this.expireSec = expireSec;
            return this;
        }

        /**
         * The share ID.
         */
        public Builder shareId(String shareId) {
            this.putBodyParameter("share_id", shareId);
            this.shareId = shareId;
            return this;
        }

        /**
         * The access code.
         */
        public Builder sharePwd(String sharePwd) {
            this.putBodyParameter("share_pwd", sharePwd);
            this.sharePwd = sharePwd;
            return this;
        }

        @Override
        public GetShareLinkTokenRequest build() {
            return new GetShareLinkTokenRequest(this);
        } 

    } 

}
