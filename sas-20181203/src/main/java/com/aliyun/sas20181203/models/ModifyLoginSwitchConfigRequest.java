// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyLoginSwitchConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyLoginSwitchConfigRequest</p>
 */
public class ModifyLoginSwitchConfigRequest extends Request {
    @Query
    @NameInMap("Item")
    private String item;

    @Query
    @NameInMap("Status")
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

    public static final class Builder extends Request.Builder<Builder> {
        private String item; 
        private Integer status; 

        /**
         * <p>Item.</p>
         */
        public Builder item(String item) {
            this.putQueryParameter("Item", item);
            this.item = item;
            return this;
        }

        /**
         * <p>Status.</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        public ModifyLoginSwitchConfigRequest build() {
            return new ModifyLoginSwitchConfigRequest(this);
        } 

    } 

}
