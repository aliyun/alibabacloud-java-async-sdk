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
 * {@link ChapterSummary} extends {@link TeaModel}
 *
 * <p>ChapterSummary</p>
 */
public class ChapterSummary extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("Summary")
    private java.util.List<Summary> summary;

    @com.aliyun.core.annotation.NameInMap("TimeRange")
    private java.util.List<Long> timeRange;

    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("TitleID")
    private String titleID;

    private ChapterSummary(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.summary = builder.summary;
        this.timeRange = builder.timeRange;
        this.title = builder.title;
        this.titleID = builder.titleID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChapterSummary create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return summary
     */
    public java.util.List<Summary> getSummary() {
        return this.summary;
    }

    /**
     * @return timeRange
     */
    public java.util.List<Long> getTimeRange() {
        return this.timeRange;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return titleID
     */
    public String getTitleID() {
        return this.titleID;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private java.util.List<Summary> summary; 
        private java.util.List<Long> timeRange; 
        private String title; 
        private String titleID; 

        private Builder() {
        } 

        private Builder(ChapterSummary model) {
            this.pageNumber = model.pageNumber;
            this.summary = model.summary;
            this.timeRange = model.timeRange;
            this.title = model.title;
            this.titleID = model.titleID;
        } 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * Summary.
         */
        public Builder summary(java.util.List<Summary> summary) {
            this.summary = summary;
            return this;
        }

        /**
         * TimeRange.
         */
        public Builder timeRange(java.util.List<Long> timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * TitleID.
         */
        public Builder titleID(String titleID) {
            this.titleID = titleID;
            return this;
        }

        public ChapterSummary build() {
            return new ChapterSummary(this);
        } 

    } 

}
