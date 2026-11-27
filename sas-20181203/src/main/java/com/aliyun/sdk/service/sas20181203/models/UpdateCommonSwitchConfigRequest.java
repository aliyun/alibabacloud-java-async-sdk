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
 * {@link UpdateCommonSwitchConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateCommonSwitchConfigRequest</p>
 */
public class UpdateCommonSwitchConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetDefault")
    private String targetDefault;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private UpdateCommonSwitchConfigRequest(Builder builder) {
        super(builder);
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
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
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
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
        private Long resourceDirectoryAccountId; 
        private String targetDefault; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCommonSwitchConfigRequest request) {
            super(request);
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.targetDefault = request.targetDefault;
            this.type = request.type;
        } 

        /**
         * ResourceDirectoryAccountId.
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>Specifies whether the switch takes effect by default. Valid values:</p>
         * <ul>
         * <li><strong>add</strong>: Takes effect by default for newly added servers.</li>
         * <li><strong>del</strong>: Does not take effect by default for newly added servers.</li>
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
         * <p>The general switch type.</p>
         * <blockquote>
         * <p>You can obtain this parameter from the SwitchId response parameter of the <a href="~~ListClientUserDefineRules~~">ListClientUserDefineRules</a> and <a href="~~ListSystemClientRules~~">ListSystemClientRules</a> operations.</p>
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
