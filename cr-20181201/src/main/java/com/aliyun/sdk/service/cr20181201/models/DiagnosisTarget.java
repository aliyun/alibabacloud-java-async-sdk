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
 * {@link DiagnosisTarget} extends {@link TeaModel}
 *
 * <p>DiagnosisTarget</p>
 */
public class DiagnosisTarget extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("Extra")
    private java.util.Map<String, String> extra;

    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("RelatedId")
    private String relatedId;

    @com.aliyun.core.annotation.NameInMap("Repository")
    private String repository;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Tag")
    private String tag;

    private DiagnosisTarget(Builder builder) {
        this.endTime = builder.endTime;
        this.extra = builder.extra;
        this.namespace = builder.namespace;
        this.relatedId = builder.relatedId;
        this.repository = builder.repository;
        this.startTime = builder.startTime;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DiagnosisTarget create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return extra
     */
    public java.util.Map<String, String> getExtra() {
        return this.extra;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return relatedId
     */
    public String getRelatedId() {
        return this.relatedId;
    }

    /**
     * @return repository
     */
    public String getRepository() {
        return this.repository;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    public static final class Builder {
        private String endTime; 
        private java.util.Map<String, String> extra; 
        private String namespace; 
        private String relatedId; 
        private String repository; 
        private String startTime; 
        private String tag; 

        private Builder() {
        } 

        private Builder(DiagnosisTarget model) {
            this.endTime = model.endTime;
            this.extra = model.extra;
            this.namespace = model.namespace;
            this.relatedId = model.relatedId;
            this.repository = model.repository;
            this.startTime = model.startTime;
            this.tag = model.tag;
        } 

        /**
         * <p>The end of the diagnostic time window, in ISO 8601 format. Must be after <code>StartTime</code>.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:30:00+08:00</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>A map of key-value pairs providing additional context for the diagnosis.</p>
         */
        public Builder extra(java.util.Map<String, String> extra) {
            this.extra = extra;
            return this;
        }

        /**
         * <p>The namespace that contains the repository.</p>
         * 
         * <strong>example:</strong>
         * <p>test_namespace</p>
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The ID of a related operation, such as a previous diagnostic task.</p>
         */
        public Builder relatedId(String relatedId) {
            this.relatedId = relatedId;
            return this;
        }

        /**
         * <p>The name of the repository.</p>
         * 
         * <strong>example:</strong>
         * <p>test_repo</p>
         */
        public Builder repository(String repository) {
            this.repository = repository;
            return this;
        }

        /**
         * <p>The start of the diagnostic time window, in ISO 8601 format.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00+08:00</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The container image tag.</p>
         * 
         * <strong>example:</strong>
         * <p>latest</p>
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        public DiagnosisTarget build() {
            return new DiagnosisTarget(this);
        } 

    } 

}
