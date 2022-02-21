// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteCameraShootingCommandResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteCameraShootingCommandResponseBody</p>
 */
public class ExecuteCameraShootingCommandResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ShootingRecord")
    private ShootingRecord shootingRecord;

    private ExecuteCameraShootingCommandResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.shootingRecord = builder.shootingRecord;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteCameraShootingCommandResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return shootingRecord
     */
    public ShootingRecord getShootingRecord() {
        return this.shootingRecord;
    }

    public static final class Builder {
        private String requestId; 
        private ShootingRecord shootingRecord; 

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ShootingRecord.
         */
        public Builder shootingRecord(ShootingRecord shootingRecord) {
            this.shootingRecord = shootingRecord;
            return this;
        }

        public ExecuteCameraShootingCommandResponseBody build() {
            return new ExecuteCameraShootingCommandResponseBody(this);
        } 

    } 

    public static class ShootingRecord extends TeaModel {
        @NameInMap("Id")
        private Long id;

        @NameInMap("Number")
        private Long number;

        @NameInMap("RecordTime")
        private Long recordTime;

        @NameInMap("ShootingType")
        private Long shootingType;

        @NameInMap("Status")
        private Long status;

        @NameInMap("Time")
        private Long time;

        private ShootingRecord(Builder builder) {
            this.id = builder.id;
            this.number = builder.number;
            this.recordTime = builder.recordTime;
            this.shootingType = builder.shootingType;
            this.status = builder.status;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShootingRecord create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return number
         */
        public Long getNumber() {
            return this.number;
        }

        /**
         * @return recordTime
         */
        public Long getRecordTime() {
            return this.recordTime;
        }

        /**
         * @return shootingType
         */
        public Long getShootingType() {
            return this.shootingType;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        public static final class Builder {
            private Long id; 
            private Long number; 
            private Long recordTime; 
            private Long shootingType; 
            private Long status; 
            private Long time; 

            /**
             * 主键ID
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 拍摄数量
             */
            public Builder number(Long number) {
                this.number = number;
                return this;
            }

            /**
             * 记录时间
             */
            public Builder recordTime(Long recordTime) {
                this.recordTime = recordTime;
                return this;
            }

            /**
             * 拍摄类型，0-图片，1-视频
             */
            public Builder shootingType(Long shootingType) {
                this.shootingType = shootingType;
                return this;
            }

            /**
             * 状态：0-未完成，1-已完成
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * 拍照间隔/视频时长，单位为s
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            public ShootingRecord build() {
                return new ShootingRecord(this);
            } 

        } 

    }
}
