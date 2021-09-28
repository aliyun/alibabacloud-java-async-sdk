// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link Owner} extends {@link TeaModel}
 *
 * <p>Owner</p>
 */
public class Owner extends TeaModel {
    @NameInMap("ID")
    private String ID;

    @NameInMap("DisplayName")
    private String displayName;


    private Owner(Builder builder) {
        this.ID = builder.ID;
        this.displayName = builder.displayName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Owner create() {
        return builder().build();
    }

    /**
     * @return ID
     */
    public String ID() {
        return this.ID;
    }

    /**
     * @return displayName
     */
    public String displayName() {
        return this.displayName;
    }

    public static final class Builder {
        private String ID; 
        private String displayName; 

        /**
         * <p>The ID of the owner</p>
         */
        public Builder ID(String ID) {
            this.ID = ID;
            return this;
        }

        /**
         * <p>The display name of the owner</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Owner build() {
            return new Owner(this);
        } 

    } 

}
