// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetCommonSwitchConfigRequest} extends {@link RequestModel}
 *
 * <p>GetCommonSwitchConfigRequest</p>
 */
public class GetCommonSwitchConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private GetCommonSwitchConfigRequest(Builder builder) {
        super(builder);
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCommonSwitchConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetCommonSwitchConfigRequest, Builder> {
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetCommonSwitchConfigRequest request) {
            super(request);
            this.type = request.type;
        } 

        /**
         * <p>The type of the common switch.</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListClientUserDefineRules~~">ListClientUserDefineRules</a> or <a href="~~ListSystemClientRules~~">ListSystemClientRules</a> operation to obtain the switch type from the response parameter SwitchId.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>USER-DEFINE-RULE-SWITCH-TYPE_180****</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetCommonSwitchConfigRequest build() {
            return new GetCommonSwitchConfigRequest(this);
        } 

    } 

}
