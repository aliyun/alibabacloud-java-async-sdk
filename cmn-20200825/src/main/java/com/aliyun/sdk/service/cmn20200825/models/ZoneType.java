// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ZoneType} extends {@link TeaModel}
 *
 * <p>ZoneType</p>
 */
public class ZoneType extends TeaModel {
    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Name")
    private String name;

    @NameInMap("ZoneTypeId")
    private String zoneTypeId;

    @NameInMap("ZoneTypeLayer")
    private java.util.List < ZoneTypeLayer> zoneTypeLayer;

    @NameInMap("ZoneTypeName")
    private String zoneTypeName;

    private ZoneType(Builder builder) {
        this.createTime = builder.createTime;
        this.name = builder.name;
        this.zoneTypeId = builder.zoneTypeId;
        this.zoneTypeLayer = builder.zoneTypeLayer;
        this.zoneTypeName = builder.zoneTypeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ZoneType create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return zoneTypeId
     */
    public String getZoneTypeId() {
        return this.zoneTypeId;
    }

    /**
     * @return zoneTypeLayer
     */
    public java.util.List < ZoneTypeLayer> getZoneTypeLayer() {
        return this.zoneTypeLayer;
    }

    /**
     * @return zoneTypeName
     */
    public String getZoneTypeName() {
        return this.zoneTypeName;
    }

    public static final class Builder {
        private String createTime; 
        private String name; 
        private String zoneTypeId; 
        private java.util.List < ZoneTypeLayer> zoneTypeLayer; 
        private String zoneTypeName; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * ZoneTypeId.
         */
        public Builder zoneTypeId(String zoneTypeId) {
            this.zoneTypeId = zoneTypeId;
            return this;
        }

        /**
         * ZoneTypeLayer.
         */
        public Builder zoneTypeLayer(java.util.List < ZoneTypeLayer> zoneTypeLayer) {
            this.zoneTypeLayer = zoneTypeLayer;
            return this;
        }

        /**
         * ZoneTypeName.
         */
        public Builder zoneTypeName(String zoneTypeName) {
            this.zoneTypeName = zoneTypeName;
            return this;
        }

        public ZoneType build() {
            return new ZoneType(this);
        } 

    } 

    public static class ZoneTypeLayer extends TeaModel {
        @NameInMap("Mask")
        private Long mask;

        @NameInMap("Name")
        private String name;

        private ZoneTypeLayer(Builder builder) {
            this.mask = builder.mask;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneTypeLayer create() {
            return builder().build();
        }

        /**
         * @return mask
         */
        public Long getMask() {
            return this.mask;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long mask; 
            private String name; 

            /**
             * Mask.
             */
            public Builder mask(Long mask) {
                this.mask = mask;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ZoneTypeLayer build() {
                return new ZoneTypeLayer(this);
            } 

        } 

    }
}
