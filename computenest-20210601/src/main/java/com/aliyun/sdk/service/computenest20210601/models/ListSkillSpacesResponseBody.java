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
 * {@link ListSkillSpacesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSkillSpacesResponseBody</p>
 */
public class ListSkillSpacesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SkillSpaces")
    private java.util.List<SkillSpaces> skillSpaces;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListSkillSpacesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.skillSpaces = builder.skillSpaces;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSkillSpacesResponseBody create() {
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
     * @return skillSpaces
     */
    public java.util.List<SkillSpaces> getSkillSpaces() {
        return this.skillSpaces;
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
        private java.util.List<SkillSpaces> skillSpaces; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListSkillSpacesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.skillSpaces = model.skillSpaces;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The maximum number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next page.</p>
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
         * <p>4DB0F536-B3BE-4F0D-BD29-E83FB56D550C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of SkillSpaces.</p>
         */
        public Builder skillSpaces(java.util.List<SkillSpaces> skillSpaces) {
            this.skillSpaces = skillSpaces;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSkillSpacesResponseBody build() {
            return new ListSkillSpacesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSkillSpacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSkillSpacesResponseBody</p>
     */
    public static class SkillSpaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("SkillSpaceDescription")
        private String skillSpaceDescription;

        @com.aliyun.core.annotation.NameInMap("SkillSpaceId")
        private String skillSpaceId;

        @com.aliyun.core.annotation.NameInMap("SkillSpaceName")
        private String skillSpaceName;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private SkillSpaces(Builder builder) {
            this.createTime = builder.createTime;
            this.skillSpaceDescription = builder.skillSpaceDescription;
            this.skillSpaceId = builder.skillSpaceId;
            this.skillSpaceName = builder.skillSpaceName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillSpaces create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return skillSpaceDescription
         */
        public String getSkillSpaceDescription() {
            return this.skillSpaceDescription;
        }

        /**
         * @return skillSpaceId
         */
        public String getSkillSpaceId() {
            return this.skillSpaceId;
        }

        /**
         * @return skillSpaceName
         */
        public String getSkillSpaceName() {
            return this.skillSpaceName;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String skillSpaceDescription; 
            private String skillSpaceId; 
            private String skillSpaceName; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(SkillSpaces model) {
                this.createTime = model.createTime;
                this.skillSpaceDescription = model.skillSpaceDescription;
                this.skillSpaceId = model.skillSpaceId;
                this.skillSpaceName = model.skillSpaceName;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The time when the SkillSpace was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-11-03T22:58:52Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the SkillSpace.</p>
             * 
             * <strong>example:</strong>
             * <p>All-in-one office toolkit — generate reports, process data, manage files, and streamline workflows effortlessly.</p>
             */
            public Builder skillSpaceDescription(String skillSpaceDescription) {
                this.skillSpaceDescription = skillSpaceDescription;
                return this;
            }

            /**
             * <p>SkillSpace ID</p>
             * 
             * <strong>example:</strong>
             * <p>ss-xxxxx</p>
             */
            public Builder skillSpaceId(String skillSpaceId) {
                this.skillSpaceId = skillSpaceId;
                return this;
            }

            /**
             * <p>The name of the SkillSpace.</p>
             * 
             * <strong>example:</strong>
             * <p>office-toolkit-skills</p>
             */
            public Builder skillSpaceName(String skillSpaceName) {
                this.skillSpaceName = skillSpaceName;
                return this;
            }

            /**
             * <p>The time when the SkillSpace was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-11-03T22:57:29Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public SkillSpaces build() {
                return new SkillSpaces(this);
            } 

        } 

    }
}
