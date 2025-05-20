// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link ChatRefDocPostion} extends {@link TeaModel}
 *
 * <p>ChatRefDocPostion</p>
 */
public class ChatRefDocPostion extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("x")
    private Integer x;

    @com.aliyun.core.annotation.NameInMap("y")
    private Integer y;

    private ChatRefDocPostion(Builder builder) {
        this.x = builder.x;
        this.y = builder.y;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatRefDocPostion create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return x
     */
    public Integer getX() {
        return this.x;
    }

    /**
     * @return y
     */
    public Integer getY() {
        return this.y;
    }

    public static final class Builder {
        private Integer x; 
        private Integer y; 

        private Builder() {
        } 

        private Builder(ChatRefDocPostion model) {
            this.x = model.x;
            this.y = model.y;
        } 

        /**
         * x.
         */
        public Builder x(Integer x) {
            this.x = x;
            return this;
        }

        /**
         * y.
         */
        public Builder y(Integer y) {
            this.y = y;
            return this;
        }

        public ChatRefDocPostion build() {
            return new ChatRefDocPostion(this);
        } 

    } 

}
