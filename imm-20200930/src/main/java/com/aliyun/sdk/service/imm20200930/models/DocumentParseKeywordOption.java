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
 * {@link DocumentParseKeywordOption} extends {@link TeaModel}
 *
 * <p>DocumentParseKeywordOption</p>
 */
public class DocumentParseKeywordOption extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Extract")
    private Boolean extract;

    private DocumentParseKeywordOption(Builder builder) {
        this.count = builder.count;
        this.extract = builder.extract;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DocumentParseKeywordOption create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return extract
     */
    public Boolean getExtract() {
        return this.extract;
    }

    public static final class Builder {
        private Integer count; 
        private Boolean extract; 

        private Builder() {
        } 

        private Builder(DocumentParseKeywordOption model) {
            this.count = model.count;
            this.extract = model.extract;
        } 

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * Extract.
         */
        public Builder extract(Boolean extract) {
            this.extract = extract;
            return this;
        }

        public DocumentParseKeywordOption build() {
            return new DocumentParseKeywordOption(this);
        } 

    } 

}
