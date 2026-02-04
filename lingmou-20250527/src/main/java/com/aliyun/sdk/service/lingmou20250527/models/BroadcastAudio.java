// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lingmou20250527.models;

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
 * {@link BroadcastAudio} extends {@link TeaModel}
 *
 * <p>BroadcastAudio</p>
 */
public class BroadcastAudio extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("audioLength")
    private Integer audioLength;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("modifiedTime")
    private String modifiedTime;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private BroadcastAudio(Builder builder) {
        this.audioLength = builder.audioLength;
        this.createTime = builder.createTime;
        this.id = builder.id;
        this.modifiedTime = builder.modifiedTime;
        this.name = builder.name;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BroadcastAudio create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audioLength
     */
    public Integer getAudioLength() {
        return this.audioLength;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Integer audioLength; 
        private String createTime; 
        private String id; 
        private String modifiedTime; 
        private String name; 
        private String status; 

        private Builder() {
        } 

        private Builder(BroadcastAudio model) {
            this.audioLength = model.audioLength;
            this.createTime = model.createTime;
            this.id = model.id;
            this.modifiedTime = model.modifiedTime;
            this.name = model.name;
            this.status = model.status;
        } 

        /**
         * audioLength.
         */
        public Builder audioLength(Integer audioLength) {
            this.audioLength = audioLength;
            return this;
        }

        /**
         * createTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * modifiedTime.
         */
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public BroadcastAudio build() {
            return new BroadcastAudio(this);
        } 

    } 

}
