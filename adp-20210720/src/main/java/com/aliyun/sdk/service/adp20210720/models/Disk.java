// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Disk} extends {@link TeaModel}
 *
 * <p>Disk</p>
 */
public class Disk extends TeaModel {
    @NameInMap("capacity")
    private Integer capacity;

    @NameInMap("fsType")
    private String fsType;

    @NameInMap("mountPoint")
    private String mountPoint;

    @NameInMap("name")
    private String name;

    @NameInMap("remain")
    private Integer remain;

    @NameInMap("type")
    private String type;

    private Disk(Builder builder) {
        this.capacity = builder.capacity;
        this.fsType = builder.fsType;
        this.mountPoint = builder.mountPoint;
        this.name = builder.name;
        this.remain = builder.remain;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Disk create() {
        return builder().build();
    }

    /**
     * @return capacity
     */
    public Integer getCapacity() {
        return this.capacity;
    }

    /**
     * @return fsType
     */
    public String getFsType() {
        return this.fsType;
    }

    /**
     * @return mountPoint
     */
    public String getMountPoint() {
        return this.mountPoint;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return remain
     */
    public Integer getRemain() {
        return this.remain;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Integer capacity; 
        private String fsType; 
        private String mountPoint; 
        private String name; 
        private Integer remain; 
        private String type; 

        /**
         * capacity.
         */
        public Builder capacity(Integer capacity) {
            this.capacity = capacity;
            return this;
        }

        /**
         * fsType.
         */
        public Builder fsType(String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * mountPoint.
         */
        public Builder mountPoint(String mountPoint) {
            this.mountPoint = mountPoint;
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
         * remain.
         */
        public Builder remain(Integer remain) {
            this.remain = remain;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Disk build() {
            return new Disk(this);
        } 

    } 

}
