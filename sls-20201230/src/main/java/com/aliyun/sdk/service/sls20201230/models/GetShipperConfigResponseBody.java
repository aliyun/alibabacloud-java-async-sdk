// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetShipperConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetShipperConfigResponseBody</p>
 */
public class GetShipperConfigResponseBody extends TeaModel {
    @NameInMap("createTime")
    private Long createTime;

    @NameInMap("lastModifyTime")
    private Long lastModifyTime;

    @NameInMap("shipperName")
    private String shipperName;

    @NameInMap("targetConfiguration")
    private java.util.Map < String, ? > targetConfiguration;

    @NameInMap("targetType")
    private String targetType;

    private GetShipperConfigResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.lastModifyTime = builder.lastModifyTime;
        this.shipperName = builder.shipperName;
        this.targetConfiguration = builder.targetConfiguration;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetShipperConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return lastModifyTime
     */
    public Long getLastModifyTime() {
        return this.lastModifyTime;
    }

    /**
     * @return shipperName
     */
    public String getShipperName() {
        return this.shipperName;
    }

    /**
     * @return targetConfiguration
     */
    public java.util.Map < String, ? > getTargetConfiguration() {
        return this.targetConfiguration;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder {
        private Long createTime; 
        private Long lastModifyTime; 
        private String shipperName; 
        private java.util.Map < String, ? > targetConfiguration; 
        private String targetType; 

        /**
         * 投递任务创建时间。Unix时间戳格式，表示从1970-1-1 00:00:00 UTC计算起的秒数。
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * 投递任务最后修改时间。Unix时间戳格式，表示从1970-1-1 00:00:00 UTC计算起的秒数。
         */
        public Builder lastModifyTime(Long lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }

        /**
         * 日志投递名称。
         */
        public Builder shipperName(String shipperName) {
            this.shipperName = shipperName;
            return this;
        }

        /**
         * 投递任务具体配置。
         */
        public Builder targetConfiguration(java.util.Map < String, ? > targetConfiguration) {
            this.targetConfiguration = targetConfiguration;
            return this;
        }

        /**
         * 投递任务类型，支持 oss、odps。
         */
        public Builder targetType(String targetType) {
            this.targetType = targetType;
            return this;
        }

        public GetShipperConfigResponseBody build() {
            return new GetShipperConfigResponseBody(this);
        } 

    } 

}
