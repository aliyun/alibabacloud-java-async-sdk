// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link Answer} extends {@link TeaModel}
 *
 * <p>Answer</p>
 */
public class Answer extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("References")
    private java.util.List<ReferenceFile> references;

    private Answer(Builder builder) {
        this.content = builder.content;
        this.references = builder.references;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Answer create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return references
     */
    public java.util.List<ReferenceFile> getReferences() {
        return this.references;
    }

    public static final class Builder {
        private String content; 
        private java.util.List<ReferenceFile> references; 

        private Builder() {
        } 

        private Builder(Answer model) {
            this.content = model.content;
            this.references = model.references;
        } 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * References.
         */
        public Builder references(java.util.List<ReferenceFile> references) {
            this.references = references;
            return this;
        }

        public Answer build() {
            return new Answer(this);
        } 

    } 

}
