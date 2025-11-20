// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link ValidateEmailRequest} extends {@link RequestModel}
 *
 * <p>ValidateEmailRequest</p>
 */
public class ValidateEmailRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckGraylist")
    private Boolean checkGraylist;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    @com.aliyun.core.annotation.Validation(required = true)
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Long timeout;

    private ValidateEmailRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.checkGraylist = builder.checkGraylist;
        this.email = builder.email;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateEmailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return checkGraylist
     */
    public Boolean getCheckGraylist() {
        return this.checkGraylist;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return timeout
     */
    public Long getTimeout() {
        return this.timeout;
    }

    public static final class Builder extends Request.Builder<ValidateEmailRequest, Builder> {
        private String regionId; 
        private Boolean checkGraylist; 
        private String email; 
        private Long timeout; 

        private Builder() {
            super();
        } 

        private Builder(ValidateEmailRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.checkGraylist = request.checkGraylist;
            this.email = request.email;
            this.timeout = request.timeout;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * CheckGraylist.
         */
        public Builder checkGraylist(Boolean checkGraylist) {
            this.putQueryParameter("CheckGraylist", checkGraylist);
            this.checkGraylist = checkGraylist;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:xxx@yyy.com">xxx@yyy.com</a></p>
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * Timeout.
         */
        public Builder timeout(Long timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public ValidateEmailRequest build() {
            return new ValidateEmailRequest(this);
        } 

    } 

}
