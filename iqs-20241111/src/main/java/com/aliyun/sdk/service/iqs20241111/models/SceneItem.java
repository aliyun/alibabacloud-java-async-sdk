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
 * {@link SceneItem} extends {@link TeaModel}
 *
 * <p>SceneItem</p>
 */
public class SceneItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("detail")
    private String detail;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private SceneItem(Builder builder) {
        this.detail = builder.detail;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SceneItem create() {
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

        private Builder(SceneItem model) {
            this.detail = model.detail;
            this.type = model.type;
        } 

        /**
         * <p>The result details for vertical scenarios. Different scenarios return different JSON string structures.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;title&quot;:&quot;London time&quot;,&quot;targetTimeZone&quot;:&quot;Europe/London&quot;}</p>
         */
        public Builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        /**
         * <p>The result type for vertical scenarios, such as weather or time.</p>
         * 
         * <strong>example:</strong>
         * <p>time</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public SceneItem build() {
            return new SceneItem(this);
        } 

    } 

}
