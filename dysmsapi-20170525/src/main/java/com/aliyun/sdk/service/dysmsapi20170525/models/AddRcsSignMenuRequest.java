// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link AddRcsSignMenuRequest} extends {@link RequestModel}
 *
 * <p>AddRcsSignMenuRequest</p>
 */
public class AddRcsSignMenuRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MenuContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String menuContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String signName;

    private AddRcsSignMenuRequest(Builder builder) {
        super(builder);
        this.menuContent = builder.menuContent;
        this.signName = builder.signName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddRcsSignMenuRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return menuContent
     */
    public String getMenuContent() {
        return this.menuContent;
    }

    /**
     * @return signName
     */
    public String getSignName() {
        return this.signName;
    }

    public static final class Builder extends Request.Builder<AddRcsSignMenuRequest, Builder> {
        private String menuContent; 
        private String signName; 

        private Builder() {
            super();
        } 

        private Builder(AddRcsSignMenuRequest request) {
            super(request);
            this.menuContent = request.menuContent;
            this.signName = request.signName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder menuContent(String menuContent) {
            this.putQueryParameter("MenuContent", menuContent);
            this.menuContent = menuContent;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder signName(String signName) {
            this.putQueryParameter("SignName", signName);
            this.signName = signName;
            return this;
        }

        @Override
        public AddRcsSignMenuRequest build() {
            return new AddRcsSignMenuRequest(this);
        } 

    } 

}
