// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TriggerLogDTOStructBody} extends {@link TeaModel}
 *
 * <p>TriggerLogDTOStructBody</p>
 */
public class TriggerLogDTOStructBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private String modifyTime;

    @com.aliyun.core.annotation.NameInMap("Position")
    private PositionStructBody position;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private TriggerLogDTOStructBody(Builder builder) {
        this.createTime = builder.createTime;
        this.modifyTime = builder.modifyTime;
        this.position = builder.position;
        this.status = builder.status;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TriggerLogDTOStructBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return modifyTime
     */
    public String getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return position
     */
    public PositionStructBody getPosition() {
        return this.position;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder {
        private String createTime; 
        private String modifyTime; 
        private PositionStructBody position; 
        private String status; 
        private String uuid; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * ModifyTime.
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * Position.
         */
        public Builder position(PositionStructBody position) {
            this.position = position;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        public TriggerLogDTOStructBody build() {
            return new TriggerLogDTOStructBody(this);
        } 

    } 

}
