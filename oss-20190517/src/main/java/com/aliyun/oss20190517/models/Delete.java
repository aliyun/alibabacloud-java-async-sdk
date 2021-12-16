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
    @NameInMap("Object")
    private java.util.List < ObjectIdentifier > objects;

    @NameInMap("Quiet")
    private Boolean quiet;


    private Delete(Builder builder) {
        this.objects = builder.objects;
        this.quiet = builder.quiet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Delete create() {
        return builder().build();
    }

    /**
     * @return objects
     */
    public java.util.List < ObjectIdentifier > getObjects() {
        return this.objects;
    }

    /**
     * @return quiet
     */
    public Boolean getQuiet() {
        return this.quiet;
    }

    public static final class Builder {
        private java.util.List < ObjectIdentifier > objects; 
        private Boolean quiet; 

        /**
         * <p>description</p>
         */
        public Builder objects(java.util.List < ObjectIdentifier > objects) {
            this.objects = objects;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder quiet(Boolean quiet) {
            this.quiet = quiet;
            return this;
        }

        public Delete build() {
            return new Delete(this);
        } 

    } 

}
