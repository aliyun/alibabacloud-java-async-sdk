// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link ToolsetSchema} extends {@link TeaModel}
 *
 * <p>ToolsetSchema</p>
 */
public class ToolsetSchema extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("detail")
    private String detail;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ToolsetSchema(Builder builder) {
        this.detail = builder.detail;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ToolsetSchema create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return this.detail;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String detail; 
        private String type; 

        private Builder() {
        } 

        private Builder(ToolsetSchema model) {
            this.detail = model.detail;
            this.type = model.type;
        } 

        /**
         * detail.
         */
        public Builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public ToolsetSchema build() {
            return new ToolsetSchema(this);
        } 

    } 

}
