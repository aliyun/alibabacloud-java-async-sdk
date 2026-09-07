// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link PAL7ConfigRewriteOp} extends {@link TeaModel}
 *
 * <p>PAL7ConfigRewriteOp</p>
 */
public class PAL7ConfigRewriteOp extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("OldValue")
    private String oldValue;

    @com.aliyun.core.annotation.NameInMap("Op")
    private String op;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    @com.aliyun.core.annotation.NameInMap("ValueVariable")
    private String valueVariable;

    private PAL7ConfigRewriteOp(Builder builder) {
        this.key = builder.key;
        this.oldValue = builder.oldValue;
        this.op = builder.op;
        this.value = builder.value;
        this.valueVariable = builder.valueVariable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PAL7ConfigRewriteOp create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return oldValue
     */
    public String getOldValue() {
        return this.oldValue;
    }

    /**
     * @return op
     */
    public String getOp() {
        return this.op;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    /**
     * @return valueVariable
     */
    public String getValueVariable() {
        return this.valueVariable;
    }

    public static final class Builder {
        private String key; 
        private String oldValue; 
        private String op; 
        private String value; 
        private String valueVariable; 

        private Builder() {
        } 

        private Builder(PAL7ConfigRewriteOp model) {
            this.key = model.key;
            this.oldValue = model.oldValue;
            this.op = model.op;
            this.value = model.value;
            this.valueVariable = model.valueVariable;
        } 

        /**
         * <p>HTTP header or query parameter name. Required.</p>
         * 
         * <strong>example:</strong>
         * <p>X-Test-Param</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>Value to find and replace. Used only for the replace operation.</p>
         * 
         * <strong>example:</strong>
         * <p>old_value</p>
         */
        public Builder oldValue(String oldValue) {
            this.oldValue = oldValue;
            return this;
        }

        /**
         * <p>Operation type. Required.</p>
         * <ul>
         * <li><p><strong>add</strong>: Add an item.</p>
         * </li>
         * <li><p><strong>set</strong>: Set a value.</p>
         * </li>
         * <li><p><strong>delete</strong>: Delete an item.</p>
         * </li>
         * <li><p><strong>replace</strong>: Replace a value.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        public Builder op(String op) {
            this.op = op;
            return this;
        }

        /**
         * <p>Target value as a string.</p>
         * 
         * <strong>example:</strong>
         * <p>new_value</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * <p>Target value as a string. Valid values:</p>
         * <ul>
         * <li><p><strong>sase_app_name</strong>: Application name.</p>
         * </li>
         * <li><p><strong>sase_app_id</strong>: Application ID.</p>
         * </li>
         * <li><p><strong>sase_policy_name</strong>: Zero Trust policy name.</p>
         * </li>
         * <li><p><strong>sase_user_username</strong>: Username.</p>
         * </li>
         * <li><p><strong>sase_user_department</strong>: User department.</p>
         * </li>
         * <li><p><strong>sase_user_group_infos</strong>: User organizational structure information.</p>
         * </li>
         * <li><p><strong>sase_user_matched_user_groups</strong>: User group information.</p>
         * </li>
         * <li><p><strong>sase_client_addr</strong>: Client address.</p>
         * </li>
         * <li><p><strong>sase_client_ip</strong>: Client IP address.</p>
         * </li>
         * <li><p><strong>sase_client_port</strong>: Client port.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sase_app_name</p>
         */
        public Builder valueVariable(String valueVariable) {
            this.valueVariable = valueVariable;
            return this;
        }

        public PAL7ConfigRewriteOp build() {
            return new PAL7ConfigRewriteOp(this);
        } 

    } 

}
