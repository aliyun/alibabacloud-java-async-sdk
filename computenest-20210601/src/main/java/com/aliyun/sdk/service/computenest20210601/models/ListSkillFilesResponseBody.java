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
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
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
         * SkillFiles.
         */
        public Builder skillFiles(java.util.List<SkillFiles> skillFiles) {
            this.skillFiles = skillFiles;
            return this;
        }

        /**
         * TotalCount.
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
             * FilePath.
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * SignedUrl.
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
