// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link OneMetaKnowledgeBase} extends {@link TeaModel}
 *
 * <p>OneMetaKnowledgeBase</p>
 */
public class OneMetaKnowledgeBase extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.NameInMap("ExtraInfo")
    private String extraInfo;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("KbUuid")
    private String kbUuid;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("State")
    private Integer state;

    @com.aliyun.core.annotation.NameInMap("Tag")
    private String tag;

    private OneMetaKnowledgeBase(Builder builder) {
        this.creator = builder.creator;
        this.description = builder.description;
        this.domain = builder.domain;
        this.extraInfo = builder.extraInfo;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.kbUuid = builder.kbUuid;
        this.name = builder.name;
        this.state = builder.state;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OneMetaKnowledgeBase create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return extraInfo
     */
    public String getExtraInfo() {
        return this.extraInfo;
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
     * @return kbUuid
     */
    public String getKbUuid() {
        return this.kbUuid;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return state
     */
    public Integer getState() {
        return this.state;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    public static final class Builder {
        private String creator; 
        private String description; 
        private String domain; 
        private String extraInfo; 
        private String gmtCreate; 
        private String gmtModified; 
        private String kbUuid; 
        private String name; 
        private Integer state; 
        private String tag; 

        private Builder() {
        } 

        private Builder(OneMetaKnowledgeBase model) {
            this.creator = model.creator;
            this.description = model.description;
            this.domain = model.domain;
            this.extraInfo = model.extraInfo;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.kbUuid = model.kbUuid;
            this.name = model.name;
            this.state = model.state;
            this.tag = model.tag;
        } 

        /**
         * <p>The creator of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>20464374909***</p>
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * <p>The description of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>order knowledgebase</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The domain of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>vehicle</p>
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * <p>Additional information about the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;keywords&quot;:&quot;sales,vehicle brand&quot;}</p>
         */
        public Builder extraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * <p>The time when the knowledge base was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-14 11:30:00</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The time when the knowledge base was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-14 11:30:39</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The UUID of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-***</p>
         */
        public Builder kbUuid(String kbUuid) {
            this.kbUuid = kbUuid;
            return this;
        }

        /**
         * <p>The name of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>order_kb</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The state of the knowledge base. Valid values include 0 (No data) and 1 (Available).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder state(Integer state) {
            this.state = state;
            return this;
        }

        /**
         * <p>The tag of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>4phsj52f81ymlm***</p>
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        public OneMetaKnowledgeBase build() {
            return new OneMetaKnowledgeBase(this);
        } 

    } 

}
