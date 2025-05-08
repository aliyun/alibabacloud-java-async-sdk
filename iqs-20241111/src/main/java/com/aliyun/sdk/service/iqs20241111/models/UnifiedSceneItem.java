// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link UnifiedSceneItem} extends {@link TeaModel}
 *
 * <p>UnifiedSceneItem</p>
 */
public class UnifiedSceneItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("detail")
    private String detail;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private UnifiedSceneItem(Builder builder) {
        this.detail = builder.detail;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnifiedSceneItem create() {
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

        private Builder(UnifiedSceneItem model) {
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

        public UnifiedSceneItem build() {
            return new UnifiedSceneItem(this);
        } 

    } 

}
