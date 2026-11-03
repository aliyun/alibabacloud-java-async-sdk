// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link ListSkillFilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSkillFilesResponseBody</p>
 */
public class ListSkillFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SkillFiles")
    private java.util.List<SkillFiles> skillFiles;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListSkillFilesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.skillFiles = builder.skillFiles;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSkillFilesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return skillFiles
     */
    public java.util.List<SkillFiles> getSkillFiles() {
        return this.skillFiles;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<SkillFiles> skillFiles; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListSkillFilesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.skillFiles = model.skillFiles;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The maximum number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAWns8w4MmhzeptXVRG0PUEU=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2849EE73-AFFA-5AFD-9575-12FA886451DA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of skill files.</p>
         */
        public Builder skillFiles(java.util.List<SkillFiles> skillFiles) {
            this.skillFiles = skillFiles;
            return this;
        }

        /**
         * <p>The actual number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSkillFilesResponseBody build() {
            return new ListSkillFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSkillFilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSkillFilesResponseBody</p>
     */
    public static class SkillFiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FilePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("SignedUrl")
        private String signedUrl;

        private SkillFiles(Builder builder) {
            this.filePath = builder.filePath;
            this.signedUrl = builder.signedUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillFiles create() {
            return builder().build();
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return signedUrl
         */
        public String getSignedUrl() {
            return this.signedUrl;
        }

        public static final class Builder {
            private String filePath; 
            private String signedUrl; 

            private Builder() {
            } 

            private Builder(SkillFiles model) {
                this.filePath = model.filePath;
                this.signedUrl = model.signedUrl;
            } 

            /**
             * <p>The relative path of the internal file in the skill.</p>
             * 
             * <strong>example:</strong>
             * <p>SKILL.md</p>
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * <p>The accessible OSS URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://embedding-pic.oss-cn-beijing-internal.aliyuncs.com/SKILL.md">https://embedding-pic.oss-cn-beijing-internal.aliyuncs.com/SKILL.md</a></p>
             */
            public Builder signedUrl(String signedUrl) {
                this.signedUrl = signedUrl;
                return this;
            }

            public SkillFiles build() {
                return new SkillFiles(this);
            } 

        } 

    }
}
