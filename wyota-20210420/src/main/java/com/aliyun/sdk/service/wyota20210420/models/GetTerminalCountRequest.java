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
 * {@link GetTerminalCountRequest} extends {@link RequestModel}
 *
 * <p>GetTerminalCountRequest</p>
 */
public class GetTerminalCountRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientType")
    private Integer clientType;

    private GetTerminalCountRequest(Builder builder) {
        super(builder);
        this.clientType = builder.clientType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTerminalCountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientType
     */
    public Integer getClientType() {
        return this.clientType;
    }

    public static final class Builder extends Request.Builder<GetTerminalCountRequest, Builder> {
        private Integer clientType; 

        private Builder() {
            super();
        } 

        private Builder(GetTerminalCountRequest request) {
            super(request);
            this.clientType = request.clientType;
        } 

        /**
         * <p>The terminal type. Valid values:</p>
         * <ul>
         * <li>1: hardware terminal.</li>
         * <li>2: software terminal.</li>
         * <li>3: secure browser plug-in.</li>
         * <li>4: GuestOS application.</li>
         * <li>5: DingTalk Wuying plug-in.</li>
         * <li>6: cloud application component.</li>
         * <li>7: Cloud Hub.</li>
         * <li>8: H5.</li>
         * </ul>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder clientType(Integer clientType) {
            this.putBodyParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        @Override
        public GetTerminalCountRequest build() {
            return new GetTerminalCountRequest(this);
        } 

    } 

}
