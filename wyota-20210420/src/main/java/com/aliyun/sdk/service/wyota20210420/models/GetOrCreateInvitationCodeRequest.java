// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

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
 * {@link GetOrCreateInvitationCodeRequest} extends {@link RequestModel}
 *
 * <p>GetOrCreateInvitationCodeRequest</p>
 */
public class GetOrCreateInvitationCodeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExpireDays")
    private Integer expireDays;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExpireMinutes")
    private Integer expireMinutes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TerminalGroupId")
    private String terminalGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    private Integer type;

    private GetOrCreateInvitationCodeRequest(Builder builder) {
        super(builder);
        this.expireDays = builder.expireDays;
        this.expireMinutes = builder.expireMinutes;
        this.terminalGroupId = builder.terminalGroupId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrCreateInvitationCodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expireDays
     */
    public Integer getExpireDays() {
        return this.expireDays;
    }

    /**
     * @return expireMinutes
     */
    public Integer getExpireMinutes() {
        return this.expireMinutes;
    }

    /**
     * @return terminalGroupId
     */
    public String getTerminalGroupId() {
        return this.terminalGroupId;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetOrCreateInvitationCodeRequest, Builder> {
        private Integer expireDays; 
        private Integer expireMinutes; 
        private String terminalGroupId; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(GetOrCreateInvitationCodeRequest request) {
            super(request);
            this.expireDays = request.expireDays;
            this.expireMinutes = request.expireMinutes;
            this.terminalGroupId = request.terminalGroupId;
            this.type = request.type;
        } 

        /**
         * <p>The validity period in days, calculated from the current time. Set to -1 for permanent validity.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder expireDays(Integer expireDays) {
            this.putBodyParameter("ExpireDays", expireDays);
            this.expireDays = expireDays;
            return this;
        }

        /**
         * <p>The validity period in minutes, calculated from the current time. Set to -1 for permanent validity.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder expireMinutes(Integer expireMinutes) {
            this.putBodyParameter("ExpireMinutes", expireMinutes);
            this.expireMinutes = expireMinutes;
            return this;
        }

        /**
         * <p>The terminal group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tg-XXX</p>
         */
        public Builder terminalGroupId(String terminalGroupId) {
            this.putBodyParameter("TerminalGroupId", terminalGroupId);
            this.terminalGroupId = terminalGroupId;
            return this;
        }

        /**
         * <p>The validity period type. Valid values:</p>
         * <ul>
         * <li>1: The response returns the expiration in days. This is the default value if Type is not specified.</li>
         * <li>2: The response returns the expiration in minutes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cron</p>
         */
        public Builder type(Integer type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetOrCreateInvitationCodeRequest build() {
            return new GetOrCreateInvitationCodeRequest(this);
        } 

    } 

}
