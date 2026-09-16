// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link DiagnosisIssue} extends {@link TeaModel}
 *
 * <p>DiagnosisIssue</p>
 */
public class DiagnosisIssue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Extra")
    private java.util.Map<String, String> extra;

    @com.aliyun.core.annotation.NameInMap("FirstOccurrence")
    private String firstOccurrence;

    @com.aliyun.core.annotation.NameInMap("LastOccurrence")
    private String lastOccurrence;

    @com.aliyun.core.annotation.NameInMap("Level")
    private String level;

    @com.aliyun.core.annotation.NameInMap("OccurrenceCount")
    private Long occurrenceCount;

    @com.aliyun.core.annotation.NameInMap("Solution")
    private String solution;

    private DiagnosisIssue(Builder builder) {
        this.code = builder.code;
        this.extra = builder.extra;
        this.firstOccurrence = builder.firstOccurrence;
        this.lastOccurrence = builder.lastOccurrence;
        this.level = builder.level;
        this.occurrenceCount = builder.occurrenceCount;
        this.solution = builder.solution;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DiagnosisIssue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return extra
     */
    public java.util.Map<String, String> getExtra() {
        return this.extra;
    }

    /**
     * @return firstOccurrence
     */
    public String getFirstOccurrence() {
        return this.firstOccurrence;
    }

    /**
     * @return lastOccurrence
     */
    public String getLastOccurrence() {
        return this.lastOccurrence;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return occurrenceCount
     */
    public Long getOccurrenceCount() {
        return this.occurrenceCount;
    }

    /**
     * @return solution
     */
    public String getSolution() {
        return this.solution;
    }

    public static final class Builder {
        private String code; 
        private java.util.Map<String, String> extra; 
        private String firstOccurrence; 
        private String lastOccurrence; 
        private String level; 
        private Long occurrenceCount; 
        private String solution; 

        private Builder() {
        } 

        private Builder(DiagnosisIssue model) {
            this.code = model.code;
            this.extra = model.extra;
            this.firstOccurrence = model.firstOccurrence;
            this.lastOccurrence = model.lastOccurrence;
            this.level = model.level;
            this.occurrenceCount = model.occurrenceCount;
            this.solution = model.solution;
        } 

        /**
         * <p>A unique code that identifies the issue type.</p>
         * 
         * <strong>example:</strong>
         * <p>RepoNumOverLimit</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>An object that contains additional, unstructured key-value information about the issue.</p>
         */
        public Builder extra(java.util.Map<String, String> extra) {
            this.extra = extra;
            return this;
        }

        /**
         * <p>The time, in ISO 8601 format, when the issue was first detected.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00+08:00</p>
         */
        public Builder firstOccurrence(String firstOccurrence) {
            this.firstOccurrence = firstOccurrence;
            return this;
        }

        /**
         * <p>The time, in ISO 8601 format, when the issue was last detected.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:30:00+08:00</p>
         */
        public Builder lastOccurrence(String lastOccurrence) {
            this.lastOccurrence = lastOccurrence;
            return this;
        }

        /**
         * <p>Specifies the severity of the issue. Valid values are <code>INFO</code>, <code>WARN</code>, and <code>ERROR</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        public Builder level(String level) {
            this.level = level;
            return this;
        }

        /**
         * <p>The total number of times the issue has occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder occurrenceCount(Long occurrenceCount) {
            this.occurrenceCount = occurrenceCount;
            return this;
        }

        /**
         * <p>The recommended action to resolve the issue.</p>
         * 
         * <strong>example:</strong>
         * <p>Buy repository quota</p>
         */
        public Builder solution(String solution) {
            this.solution = solution;
            return this;
        }

        public DiagnosisIssue build() {
            return new DiagnosisIssue(this);
        } 

    } 

}
