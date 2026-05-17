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
 * {@link MergeOncallSchedule} extends {@link TeaModel}
 *
 * <p>MergeOncallSchedule</p>
 */
public class MergeOncallSchedule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("detail")
    private java.util.Map<String, ?> detail;

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

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private MergeOncallSchedule(Builder builder) {
        this.detail = builder.detail;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.identifier = builder.identifier;
        this.name = builder.name;
        this.source = builder.source;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MergeOncallSchedule create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detail
     */
    public java.util.Map<String, ?> getDetail() {
        return this.detail;
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

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private java.util.Map<String, ?> detail; 
        private String gmtCreate; 
        private String gmtModified; 
        private String identifier; 
        private String name; 
        private String source; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(MergeOncallSchedule model) {
            this.detail = model.detail;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.identifier = model.identifier;
            this.name = model.name;
            this.source = model.source;
            this.workspace = model.workspace;
        } 

        /**
         * detail.
         */
        public Builder detail(java.util.Map<String, ?> detail) {
            this.detail = detail;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * identifier.
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public MergeOncallSchedule build() {
            return new MergeOncallSchedule(this);
        } 

    } 

}
