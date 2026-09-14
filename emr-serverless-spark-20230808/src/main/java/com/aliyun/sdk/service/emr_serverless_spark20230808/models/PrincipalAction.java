// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link PrincipalAction} extends {@link TeaModel}
 *
 * <p>PrincipalAction</p>
 */
public class PrincipalAction extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("actionArn")
    private String actionArn;

    @com.aliyun.core.annotation.NameInMap("principalArn")
    private String principalArn;

    private PrincipalAction(Builder builder) {
        this.actionArn = builder.actionArn;
        this.principalArn = builder.principalArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrincipalAction create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionArn
     */
    public String getActionArn() {
        return this.actionArn;
    }

    /**
     * @return principalArn
     */
    public String getPrincipalArn() {
        return this.principalArn;
    }

    public static final class Builder {
        private String actionArn; 
        private String principalArn; 

        private Builder() {
        } 

        private Builder(PrincipalAction model) {
            this.actionArn = model.actionArn;
            this.principalArn = model.principalArn;
        } 

        /**
         * <p>The ARN of the behavior.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:emr::workspaceId:action/create_queue</p>
         */
        public Builder actionArn(String actionArn) {
            this.actionArn = actionArn;
            return this;
        }

        /**
         * <p>The ARN of the principal.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:emr::workspaceId:user/23759369154162****</p>
         */
        public Builder principalArn(String principalArn) {
            this.principalArn = principalArn;
            return this;
        }

        public PrincipalAction build() {
            return new PrincipalAction(this);
        } 

    } 

}
