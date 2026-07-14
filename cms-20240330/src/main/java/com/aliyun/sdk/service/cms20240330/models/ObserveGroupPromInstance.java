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
 * {@link ObserveGroupPromInstance} extends {@link TeaModel}
 *
 * <p>ObserveGroupPromInstance</p>
 */
public class ObserveGroupPromInstance extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("kind")
    private String kind;

    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.NameInMap("time")
    private String time;

    private ObserveGroupPromInstance(Builder builder) {
        this.id = builder.id;
        this.kind = builder.kind;
        this.region = builder.region;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ObserveGroupPromInstance create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return kind
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    public static final class Builder {
        private String id; 
        private String kind; 
        private String region; 
        private String time; 

        private Builder() {
        } 

        private Builder(ObserveGroupPromInstance model) {
            this.id = model.id;
            this.kind = model.kind;
            this.region = model.region;
            this.time = model.time;
        } 

        /**
         * <p>Prometheus 实例 ID，如 rw-xxxxxxxxxx。</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>实例来源：system 表示系统根据 workspace/UModel 自动识别，custom 表示用户在控制台手动选择。</p>
         */
        public Builder kind(String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * <p>Prometheus 实例所在地域。为空时后端按观测分组所属 workspace 地域补齐。</p>
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * <p>记录写入或选择时间，格式 yyyy-MM-dd HH:mm:ss。</p>
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        public ObserveGroupPromInstance build() {
            return new ObserveGroupPromInstance(this);
        } 

    } 

}
