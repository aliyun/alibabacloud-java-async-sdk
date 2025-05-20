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
 * {@link ChatRefDocPageNum} extends {@link TeaModel}
 *
 * <p>ChatRefDocPageNum</p>
 */
public class ChatRefDocPageNum extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("num")
    private Integer num;

    @com.aliyun.core.annotation.NameInMap("pos")
    private java.util.List<java.util.List<ChatRefDocPostion>> pos;

    private ChatRefDocPageNum(Builder builder) {
        this.num = builder.num;
        this.pos = builder.pos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatRefDocPageNum create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return num
     */
    public Integer getNum() {
        return this.num;
    }

    /**
     * @return pos
     */
    public java.util.List<java.util.List<ChatRefDocPostion>> getPos() {
        return this.pos;
    }

    public static final class Builder {
        private Integer num; 
        private java.util.List<java.util.List<ChatRefDocPostion>> pos; 

        private Builder() {
        } 

        private Builder(ChatRefDocPageNum model) {
            this.num = model.num;
            this.pos = model.pos;
        } 

        /**
         * num.
         */
        public Builder num(Integer num) {
            this.num = num;
            return this;
        }

        /**
         * pos.
         */
        public Builder pos(java.util.List<java.util.List<ChatRefDocPostion>> pos) {
            this.pos = pos;
            return this;
        }

        public ChatRefDocPageNum build() {
            return new ChatRefDocPageNum(this);
        } 

    } 

}
