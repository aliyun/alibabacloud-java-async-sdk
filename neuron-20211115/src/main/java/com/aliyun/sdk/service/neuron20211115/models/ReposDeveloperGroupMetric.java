// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link ReposDeveloperGroupMetric} extends {@link TeaModel}
 *
 * <p>ReposDeveloperGroupMetric</p>
 */
public class ReposDeveloperGroupMetric extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("addLines")
    private Long addLines;

    @com.aliyun.core.annotation.NameInMap("commentLines")
    private Long commentLines;

    @com.aliyun.core.annotation.NameInMap("commitCnt")
    private Long commitCnt;

    @com.aliyun.core.annotation.NameInMap("delLines")
    private Long delLines;

    @com.aliyun.core.annotation.NameInMap("modLines")
    private Long modLines;

    @com.aliyun.core.annotation.NameInMap("showName")
    private String showName;

    @com.aliyun.core.annotation.NameInMap("workNo")
    private String workNo;

    private ReposDeveloperGroupMetric(Builder builder) {
        this.addLines = builder.addLines;
        this.commentLines = builder.commentLines;
        this.commitCnt = builder.commitCnt;
        this.delLines = builder.delLines;
        this.modLines = builder.modLines;
        this.showName = builder.showName;
        this.workNo = builder.workNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReposDeveloperGroupMetric create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addLines
     */
    public Long getAddLines() {
        return this.addLines;
    }

    /**
     * @return commentLines
     */
    public Long getCommentLines() {
        return this.commentLines;
    }

    /**
     * @return commitCnt
     */
    public Long getCommitCnt() {
        return this.commitCnt;
    }

    /**
     * @return delLines
     */
    public Long getDelLines() {
        return this.delLines;
    }

    /**
     * @return modLines
     */
    public Long getModLines() {
        return this.modLines;
    }

    /**
     * @return showName
     */
    public String getShowName() {
        return this.showName;
    }

    /**
     * @return workNo
     */
    public String getWorkNo() {
        return this.workNo;
    }

    public static final class Builder {
        private Long addLines; 
        private Long commentLines; 
        private Long commitCnt; 
        private Long delLines; 
        private Long modLines; 
        private String showName; 
        private String workNo; 

        private Builder() {
        } 

        private Builder(ReposDeveloperGroupMetric model) {
            this.addLines = model.addLines;
            this.commentLines = model.commentLines;
            this.commitCnt = model.commitCnt;
            this.delLines = model.delLines;
            this.modLines = model.modLines;
            this.showName = model.showName;
            this.workNo = model.workNo;
        } 

        /**
         * addLines.
         */
        public Builder addLines(Long addLines) {
            this.addLines = addLines;
            return this;
        }

        /**
         * commentLines.
         */
        public Builder commentLines(Long commentLines) {
            this.commentLines = commentLines;
            return this;
        }

        /**
         * commitCnt.
         */
        public Builder commitCnt(Long commitCnt) {
            this.commitCnt = commitCnt;
            return this;
        }

        /**
         * delLines.
         */
        public Builder delLines(Long delLines) {
            this.delLines = delLines;
            return this;
        }

        /**
         * modLines.
         */
        public Builder modLines(Long modLines) {
            this.modLines = modLines;
            return this;
        }

        /**
         * showName.
         */
        public Builder showName(String showName) {
            this.showName = showName;
            return this;
        }

        /**
         * workNo.
         */
        public Builder workNo(String workNo) {
            this.workNo = workNo;
            return this;
        }

        public ReposDeveloperGroupMetric build() {
            return new ReposDeveloperGroupMetric(this);
        } 

    } 

}
