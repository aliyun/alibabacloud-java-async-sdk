// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyLoginSwitchConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyLoginSwitchConfigRequest</p>
 */
public class ModifyLoginSwitchConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Item")
    @com.aliyun.core.annotation.Validation(required = true)
    private String item;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer status;

    private ModifyLoginSwitchConfigRequest(Builder builder) {
        super(builder);
        this.item = builder.item;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLoginSwitchConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return item
     */
    public String getItem() {
        return this.item;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ModifyLoginSwitchConfigRequest, Builder> {
        private String item; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(ModifyLoginSwitchConfigRequest request) {
            super(request);
            this.item = request.item;
            this.status = request.status;
        } 

        /**
         * <p>The type of the logon security settings that you want to enable or disable. Valid values:</p>
         * <ul>
         * <li><strong>login_common_ip</strong>: unapproved logon IP addresses</li>
         * <li><strong>login_common_time</strong>: unapproved logon time ranges</li>
         * <li><strong>login_common_account</strong>: unapproved logon accounts</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>login_common_account</p>
         */
        public Builder item(String item) {
            this.putQueryParameter("Item", item);
            this.item = item;
            return this;
        }

        /**
         * <p>Specifies whether to enable the logon security settings. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ModifyLoginSwitchConfigRequest build() {
            return new ModifyLoginSwitchConfigRequest(this);
        } 

    } 

}
