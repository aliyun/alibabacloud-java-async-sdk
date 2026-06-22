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
 * {@link DocumentChapterSummarizeOption} extends {@link TeaModel}
 *
 * <p>DocumentChapterSummarizeOption</p>
 */
public class DocumentChapterSummarizeOption extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.NameInMap("Marker")
    private Integer marker;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private DocumentChapterSummarizeOption(Builder builder) {
        this.limit = builder.limit;
        this.marker = builder.marker;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DocumentChapterSummarizeOption create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return marker
     */
    public Integer getMarker() {
        return this.marker;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private Integer limit; 
        private Integer marker; 
        private String version; 

        private Builder() {
        } 

        private Builder(DocumentChapterSummarizeOption model) {
            this.limit = model.limit;
            this.marker = model.marker;
            this.version = model.version;
        } 

        /**
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Marker.
         */
        public Builder marker(Integer marker) {
            this.marker = marker;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public DocumentChapterSummarizeOption build() {
            return new DocumentChapterSummarizeOption(this);
        } 

    } 

}
