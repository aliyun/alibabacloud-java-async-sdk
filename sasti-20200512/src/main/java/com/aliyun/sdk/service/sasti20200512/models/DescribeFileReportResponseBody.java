// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sasti20200512.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFileReportResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFileReportResponseBody</p>
 */
public class DescribeFileReportResponseBody extends TeaModel {
    @NameInMap("Basic")
    private String basic;

    @NameInMap("FileHash")
    private String fileHash;

    @NameInMap("Intelligences")
    private String intelligences;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Sandbox")
    private String sandbox;

    @NameInMap("ThreatLevel")
    private String threatLevel;

    @NameInMap("ThreatTypes")
    private String threatTypes;

    private DescribeFileReportResponseBody(Builder builder) {
        this.basic = builder.basic;
        this.fileHash = builder.fileHash;
        this.intelligences = builder.intelligences;
        this.requestId = builder.requestId;
        this.sandbox = builder.sandbox;
        this.threatLevel = builder.threatLevel;
        this.threatTypes = builder.threatTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFileReportResponseBody create() {
        return builder().build();
    }

    /**
     * @return basic
     */
    public String getBasic() {
        return this.basic;
    }

    /**
     * @return fileHash
     */
    public String getFileHash() {
        return this.fileHash;
    }

    /**
     * @return intelligences
     */
    public String getIntelligences() {
        return this.intelligences;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sandbox
     */
    public String getSandbox() {
        return this.sandbox;
    }

    /**
     * @return threatLevel
     */
    public String getThreatLevel() {
        return this.threatLevel;
    }

    /**
     * @return threatTypes
     */
    public String getThreatTypes() {
        return this.threatTypes;
    }

    public static final class Builder {
        private String basic; 
        private String fileHash; 
        private String intelligences; 
        private String requestId; 
        private String sandbox; 
        private String threatLevel; 
        private String threatTypes; 

        /**
         * Basic.
         */
        public Builder basic(String basic) {
            this.basic = basic;
            return this;
        }

        /**
         * FileHash.
         */
        public Builder fileHash(String fileHash) {
            this.fileHash = fileHash;
            return this;
        }

        /**
         * Intelligences.
         */
        public Builder intelligences(String intelligences) {
            this.intelligences = intelligences;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Sandbox.
         */
        public Builder sandbox(String sandbox) {
            this.sandbox = sandbox;
            return this;
        }

        /**
         * ThreatLevel.
         */
        public Builder threatLevel(String threatLevel) {
            this.threatLevel = threatLevel;
            return this;
        }

        /**
         * ThreatTypes.
         */
        public Builder threatTypes(String threatTypes) {
            this.threatTypes = threatTypes;
            return this;
        }

        public DescribeFileReportResponseBody build() {
            return new DescribeFileReportResponseBody(this);
        } 

    } 

}
