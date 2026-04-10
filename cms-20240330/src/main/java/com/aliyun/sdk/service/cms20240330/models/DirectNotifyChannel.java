// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link DirectNotifyChannel} extends {@link TeaModel}
 *
 * <p>DirectNotifyChannel</p>
 */
public class DirectNotifyChannel extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("identifiers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> identifiers;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private DirectNotifyChannel(Builder builder) {
        this.identifiers = builder.identifiers;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DirectNotifyChannel create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identifiers
     */
    public java.util.List<String> getIdentifiers() {
        return this.identifiers;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.List<String> identifiers; 
        private String type; 

        private Builder() {
        } 

        private Builder(DirectNotifyChannel model) {
            this.identifiers = model.identifiers;
            this.type = model.type;
        } 

        /**
         * <p>通知对象标识列表</p>
         * <p>This parameter is required.</p>
         */
        public Builder identifiers(java.util.List<String> identifiers) {
            this.identifiers = identifiers;
            return this;
        }

        /**
         * <p>通知渠道类型</p>
         * <p>This parameter is required.</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DirectNotifyChannel build() {
            return new DirectNotifyChannel(this);
        } 

    } 

}
