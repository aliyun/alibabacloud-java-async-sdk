// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link Owner} extends {@link TeaModel}
 *
 * <p>Owner</p>
 */
public class Owner extends TeaModel {
    @NameInMap("DisplayName")
    private String displayName;

    @NameInMap("ID")
    private String id;

    private Owner(Builder builder) {
        this.displayName = builder.displayName;
        this.id = builder.id;
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
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder {
        private String displayName; 
        private String id; 

        /**
         * The display name of the owner
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * The ID of the owner
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Owner build() {
            return new Owner(this);
        } 

    } 

}
