// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateCommonSwitchConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateCommonSwitchConfigRequest</p>
 */
public class UpdateCommonSwitchConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetDefault")
    private String targetDefault;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private UpdateCommonSwitchConfigRequest(Builder builder) {
        super(builder);
        this.targetDefault = builder.targetDefault;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCommonSwitchConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return targetDefault
     */
    public String getTargetDefault() {
        return this.targetDefault;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<UpdateCommonSwitchConfigRequest, Builder> {
        private String targetDefault; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCommonSwitchConfigRequest request) {
            super(request);
            this.targetDefault = request.targetDefault;
            this.type = request.type;
        } 

        /**
         * <p>Specifies whether to turn on the switch for newly added servers. Valid values:</p>
         * <ul>
         * <li><strong>add</strong>: yes</li>
         * <li><strong>del</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        public Builder targetDefault(String targetDefault) {
            this.putQueryParameter("TargetDefault", targetDefault);
            this.targetDefault = targetDefault;
            return this;
        }

        /**
         * <p>The type of the switch.</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListClientUserDefineRules~~">ListClientUserDefineRules</a> or <a href="~~ListSystemClientRules~~">ListSystemClientRules</a> operation to obtain the type from the response parameter SwitchId.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>USER-DEFINE-RULE-SWITCH-TYPE_190****</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UpdateCommonSwitchConfigRequest build() {
            return new UpdateCommonSwitchConfigRequest(this);
        } 

    } 

}
