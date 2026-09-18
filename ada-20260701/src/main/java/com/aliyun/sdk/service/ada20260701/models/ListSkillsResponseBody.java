// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ada20260701.models;

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
 * {@link ListSkillsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSkillsResponseBody</p>
 */
public class ListSkillsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Skills")
    private java.util.List<?> skills;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private ListSkillsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.skills = builder.skills;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSkillsResponseBody create() {
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
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return skills
     */
    public java.util.List<?> getSkills() {
        return this.skills;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private java.util.List<?> skills; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListSkillsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.skills = model.skills;
            this.total = model.total;
        } 

        /**
         * <p>The number of entries per page for the current cursor-based pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next page. An empty string is returned if there is no next page.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The current page number for compatible page-number-based pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page for compatible page-number-based pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0A1B2C3D-4E5F-6789-ABCD-EF0123456789</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of Skill summaries. The current public contract does not define a fixed structure for list items. For common fields, see &quot;Supplementary description of response elements&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;skillId&quot;:&quot;skill_example123&quot;,&quot;name&quot;:&quot;code-review&quot;,&quot;official&quot;:false,&quot;description&quot;:&quot;A Skill for performing code reviews&quot;,&quot;iconUrl&quot;:&quot;<a href="https://example.com/icons/code-review.png%22,%22visibility%22:%22user%22,%22status%22:%22PUBLISHED%22,%22publishedVersion%22:2,%22creatorId%22:%22example-user%22,%22createdAt%22:1760000000000,%22canModify%22:true,%22canDelete%22:true%7D%5D">https://example.com/icons/code-review.png&quot;,&quot;visibility&quot;:&quot;user&quot;,&quot;status&quot;:&quot;PUBLISHED&quot;,&quot;publishedVersion&quot;:2,&quot;creatorId&quot;:&quot;example-user&quot;,&quot;createdAt&quot;:1760000000000,&quot;canModify&quot;:true,&quot;canDelete&quot;:true}]</a></p>
         */
        public Builder skills(java.util.List<?> skills) {
            this.skills = skills;
            return this;
        }

        /**
         * <p>The total number of Skills that match the current visibility and filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListSkillsResponseBody build() {
            return new ListSkillsResponseBody(this);
        } 

    } 

}
