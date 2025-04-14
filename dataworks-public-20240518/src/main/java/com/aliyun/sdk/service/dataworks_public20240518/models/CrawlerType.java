// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CrawlerType} extends {@link TeaModel}
 *
 * <p>CrawlerType</p>
 */
public class CrawlerType extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("SupportedEntityTypes")
    private java.util.List<SupportedEntityTypes> supportedEntityTypes;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private CrawlerType(Builder builder) {
        this.displayName = builder.displayName;
        this.supportedEntityTypes = builder.supportedEntityTypes;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CrawlerType create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return supportedEntityTypes
     */
    public java.util.List<SupportedEntityTypes> getSupportedEntityTypes() {
        return this.supportedEntityTypes;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String displayName; 
        private java.util.List<SupportedEntityTypes> supportedEntityTypes; 
        private String type; 

        private Builder() {
        } 

        private Builder(CrawlerType model) {
            this.displayName = model.displayName;
            this.supportedEntityTypes = model.supportedEntityTypes;
            this.type = model.type;
        } 

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * SupportedEntityTypes.
         */
        public Builder supportedEntityTypes(java.util.List<SupportedEntityTypes> supportedEntityTypes) {
            this.supportedEntityTypes = supportedEntityTypes;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public CrawlerType build() {
            return new CrawlerType(this);
        } 

    } 

    /**
     * 
     * {@link CrawlerType} extends {@link TeaModel}
     *
     * <p>CrawlerType</p>
     */
    public static class SupportedEntityTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Optional")
        private Boolean optional;

        @com.aliyun.core.annotation.NameInMap("ParentSubType")
        private String parentSubType;

        @com.aliyun.core.annotation.NameInMap("SubType")
        private String subType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private SupportedEntityTypes(Builder builder) {
            this.optional = builder.optional;
            this.parentSubType = builder.parentSubType;
            this.subType = builder.subType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedEntityTypes create() {
            return builder().build();
        }

        /**
         * @return optional
         */
        public Boolean getOptional() {
            return this.optional;
        }

        /**
         * @return parentSubType
         */
        public String getParentSubType() {
            return this.parentSubType;
        }

        /**
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean optional; 
            private String parentSubType; 
            private String subType; 
            private String type; 

            private Builder() {
            } 

            private Builder(SupportedEntityTypes model) {
                this.optional = model.optional;
                this.parentSubType = model.parentSubType;
                this.subType = model.subType;
                this.type = model.type;
            } 

            /**
             * Optional.
             */
            public Builder optional(Boolean optional) {
                this.optional = optional;
                return this;
            }

            /**
             * ParentSubType.
             */
            public Builder parentSubType(String parentSubType) {
                this.parentSubType = parentSubType;
                return this;
            }

            /**
             * SubType.
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SupportedEntityTypes build() {
                return new SupportedEntityTypes(this);
            } 

        } 

    }
}
