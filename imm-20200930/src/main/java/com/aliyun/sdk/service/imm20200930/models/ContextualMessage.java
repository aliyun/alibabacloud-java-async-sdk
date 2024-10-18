// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ContextualMessage} extends {@link TeaModel}
 *
 * <p>ContextualMessage</p>
 */
public class ContextualMessage extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("Files")
    private java.util.List < ContextualFile > files;

    @com.aliyun.core.annotation.NameInMap("Role")
    private String role;

    private ContextualMessage(Builder builder) {
        this.content = builder.content;
        this.files = builder.files;
        this.role = builder.role;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContextualMessage create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return files
     */
    public java.util.List < ContextualFile > getFiles() {
        return this.files;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    public static final class Builder {
        private String content; 
        private java.util.List < ContextualFile > files; 
        private String role; 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * Files.
         */
        public Builder files(java.util.List < ContextualFile > files) {
            this.files = files;
            return this;
        }

        /**
         * Role.
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        public ContextualMessage build() {
            return new ContextualMessage(this);
        } 

    } 

}
