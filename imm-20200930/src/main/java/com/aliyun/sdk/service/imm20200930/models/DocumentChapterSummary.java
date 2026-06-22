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
 * {@link DocumentChapterSummary} extends {@link TeaModel}
 *
 * <p>DocumentChapterSummary</p>
 */
public class DocumentChapterSummary extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<ChapterSummary> data;

    @com.aliyun.core.annotation.NameInMap("NextMarker")
    private Integer nextMarker;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private DocumentChapterSummary(Builder builder) {
        this.data = builder.data;
        this.nextMarker = builder.nextMarker;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DocumentChapterSummary create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<ChapterSummary> getData() {
        return this.data;
    }

    /**
     * @return nextMarker
     */
    public Integer getNextMarker() {
        return this.nextMarker;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private java.util.List<ChapterSummary> data; 
        private Integer nextMarker; 
        private String version; 

        private Builder() {
        } 

        private Builder(DocumentChapterSummary model) {
            this.data = model.data;
            this.nextMarker = model.nextMarker;
            this.version = model.version;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<ChapterSummary> data) {
            this.data = data;
            return this;
        }

        /**
         * NextMarker.
         */
        public Builder nextMarker(Integer nextMarker) {
            this.nextMarker = nextMarker;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public DocumentChapterSummary build() {
            return new DocumentChapterSummary(this);
        } 

    } 

}
