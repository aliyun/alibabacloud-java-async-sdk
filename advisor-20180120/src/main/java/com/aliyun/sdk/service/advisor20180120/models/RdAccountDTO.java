// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

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
 * {@link RdAccountDTO} extends {@link TeaModel}
 *
 * <p>RdAccountDTO</p>
 */
public class RdAccountDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountType")
    private String accountType;

    @com.aliyun.core.annotation.NameInMap("Checked")
    private Boolean checked;

    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    private RdAccountDTO(Builder builder) {
        this.accountType = builder.accountType;
        this.checked = builder.checked;
        this.displayName = builder.displayName;
        this.id = builder.id;
        this.name = builder.name;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RdAccountDTO create() {
        return builder().build();
    }

    /**
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return checked
     */
    public Boolean getChecked() {
        return this.checked;
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
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder {
        private String accountType; 
        private Boolean checked; 
        private String displayName; 
        private Long id; 
        private String name; 
        private java.util.List<Tags> tags; 

        /**
         * AccountType.
         */
        public Builder accountType(String accountType) {
            this.accountType = accountType;
            return this;
        }

        /**
         * Checked.
         */
        public Builder checked(Boolean checked) {
            this.checked = checked;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.id = id;
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
         * Tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        public RdAccountDTO build() {
            return new RdAccountDTO(this);
        } 

    } 

    /**
     * 
     * {@link RdAccountDTO} extends {@link TeaModel}
     *
     * <p>RdAccountDTO</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
