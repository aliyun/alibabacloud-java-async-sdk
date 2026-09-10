// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link MergeContactGroup} extends {@link TeaModel}
 *
 * <p>MergeContactGroup</p>
 */
public class MergeContactGroup extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("contacts")
    private java.util.List<String> contacts;

    @com.aliyun.core.annotation.NameInMap("extend")
    private java.util.Map<String, ?> extend;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("identifier")
    private String identifier;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    private MergeContactGroup(Builder builder) {
        this.contacts = builder.contacts;
        this.extend = builder.extend;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.identifier = builder.identifier;
        this.name = builder.name;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MergeContactGroup create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contacts
     */
    public java.util.List<String> getContacts() {
        return this.contacts;
    }

    /**
     * @return extend
     */
    public java.util.Map<String, ?> getExtend() {
        return this.extend;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder {
        private java.util.List<String> contacts; 
        private java.util.Map<String, ?> extend; 
        private String gmtCreate; 
        private String gmtModified; 
        private String identifier; 
        private String name; 
        private String source; 

        private Builder() {
        } 

        private Builder(MergeContactGroup model) {
            this.contacts = model.contacts;
            this.extend = model.extend;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.identifier = model.identifier;
            this.name = model.name;
            this.source = model.source;
        } 

        /**
         * <p>A list of unique identifiers for the members in the group.</p>
         */
        public Builder contacts(java.util.List<String> contacts) {
            this.contacts = contacts;
            return this;
        }

        /**
         * <p>An extension field that stores additional information.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;department&quot;: &quot;运维部&quot;, &quot;role&quot;: &quot;工程师&quot; }</p>
         */
        public Builder extend(java.util.Map<String, ?> extend) {
            this.extend = extend;
            return this;
        }

        /**
         * <p>The time when the contact group was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-11T08:21:58.789Z</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The time when the contact group was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-11T08:21:58.789Z</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The unique identifier of the contact group.</p>
         * 
         * <strong>example:</strong>
         * <p>group-12345</p>
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * <p>The name of the contact group.</p>
         * 
         * <strong>example:</strong>
         * <p>运维团队</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The source system of the contact group.</p>
         * 
         * <strong>example:</strong>
         * <p>dingtalk</p>
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        public MergeContactGroup build() {
            return new MergeContactGroup(this);
        } 

    } 

}
