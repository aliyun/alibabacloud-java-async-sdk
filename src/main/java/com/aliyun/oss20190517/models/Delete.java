// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link Delete} extends {@link TeaModel}
 *
 * <p>Delete</p>
 */
public class Delete extends TeaModel {
    @NameInMap("Quiet")
    private Boolean quiet;

    @NameInMap("Object")
    private java.util.List < ObjectIdentifier > objects;


    private Delete(Builder builder) {
        this.quiet = builder.quiet;
        this.objects = builder.objects;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Delete create() {
        return builder().build();
    }

    /**
     * @return quiet
     */
    public Boolean quiet() {
        return this.quiet;
    }

    /**
     * @return objects
     */
    public java.util.List < ObjectIdentifier > objects() {
        return this.objects;
    }

    public static final class Builder {
        private Boolean quiet; 
        private java.util.List < ObjectIdentifier > objects; 

        /**
         * <p>description</p>
         */
        public Builder quiet(Boolean quiet) {
            this.quiet = quiet;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder objects(java.util.List < ObjectIdentifier > objects) {
            this.objects = objects;
            return this;
        }

        public Delete build() {
            return new Delete(this);
        } 

    } 

}
