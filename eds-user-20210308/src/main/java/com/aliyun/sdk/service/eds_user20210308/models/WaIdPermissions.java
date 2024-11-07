// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link WaIdPermissions} extends {@link TeaModel}
 *
 * <p>WaIdPermissions</p>
 */
public class WaIdPermissions extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IsBasicChild")
    private Boolean isBasicChild;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("SubPermissions")
    private java.util.List < WaIdPermissions > subPermissions;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private WaIdPermissions(Builder builder) {
        this.code = builder.code;
        this.isBasicChild = builder.isBasicChild;
        this.name = builder.name;
        this.subPermissions = builder.subPermissions;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WaIdPermissions create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isBasicChild
     */
    public Boolean getIsBasicChild() {
        return this.isBasicChild;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return subPermissions
     */
    public java.util.List < WaIdPermissions > getSubPermissions() {
        return this.subPermissions;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String code; 
        private Boolean isBasicChild; 
        private String name; 
        private java.util.List < WaIdPermissions > subPermissions; 
        private String type; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * IsBasicChild.
         */
        public Builder isBasicChild(Boolean isBasicChild) {
            this.isBasicChild = isBasicChild;
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
         * SubPermissions.
         */
        public Builder subPermissions(java.util.List < WaIdPermissions > subPermissions) {
            this.subPermissions = subPermissions;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public WaIdPermissions build() {
            return new WaIdPermissions(this);
        } 

    } 

}
