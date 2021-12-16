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
    @NameInMap("DisplayName")
    private String displayName;

    @NameInMap("ID")
    private String ID;


    private Owner(Builder builder) {
        this.displayName = builder.displayName;
        this.ID = builder.ID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Owner create() {
        return builder().build();
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return ID
     */
    public String getID() {
        return this.ID;
    }

    public static final class Builder {
        private String displayName; 
        private String ID; 

        /**
         * <p>The display name of the owner</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The ID of the owner</p>
         */
        public Builder ID(String ID) {
            this.ID = ID;
            return this;
        }

        public Owner build() {
            return new Owner(this);
        } 

    } 

}
