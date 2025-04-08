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
 * {@link GlobalSceneItem} extends {@link TeaModel}
 *
 * <p>GlobalSceneItem</p>
 */
public class GlobalSceneItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("detail")
    private String detail;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private GlobalSceneItem(Builder builder) {
        this.detail = builder.detail;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GlobalSceneItem create() {
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

        private Builder(GlobalSceneItem model) {
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

        public GlobalSceneItem build() {
            return new GlobalSceneItem(this);
        } 

    } 

}
