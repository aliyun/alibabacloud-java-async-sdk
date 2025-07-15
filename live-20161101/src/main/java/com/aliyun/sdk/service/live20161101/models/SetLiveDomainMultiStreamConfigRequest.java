// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link SetLiveDomainMultiStreamConfigRequest} extends {@link RequestModel}
 *
 * <p>SetLiveDomainMultiStreamConfigRequest</p>
 */
public class SetLiveDomainMultiStreamConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Switch")
    @com.aliyun.core.annotation.Validation(required = true)
    private String _switch;

    private SetLiveDomainMultiStreamConfigRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.ownerId = builder.ownerId;
        this._switch = builder._switch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetLiveDomainMultiStreamConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return _switch
     */
    public String get_switch() {
        return this._switch;
    }

    public static final class Builder extends Request.Builder<SetLiveDomainMultiStreamConfigRequest, Builder> {
        private String domain; 
        private Long ownerId; 
        private String _switch; 

        private Builder() {
            super();
        } 

        private Builder(SetLiveDomainMultiStreamConfigRequest request) {
            super(request);
            this.domain = request.domain;
            this.ownerId = request.ownerId;
            this._switch = request._switch;
        } 

        /**
         * <p>The main streaming domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the dual-stream disaster recovery feature. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enables the feature.</li>
         * <li><strong>off</strong>: disables the feature.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder _switch(String _switch) {
            this.putQueryParameter("Switch", _switch);
            this._switch = _switch;
            return this;
        }

        @Override
        public SetLiveDomainMultiStreamConfigRequest build() {
            return new SetLiveDomainMultiStreamConfigRequest(this);
        } 

    } 

}
