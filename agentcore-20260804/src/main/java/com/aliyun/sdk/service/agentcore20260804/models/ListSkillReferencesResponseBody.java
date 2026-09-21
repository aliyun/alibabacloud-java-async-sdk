// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link ListSkillReferencesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSkillReferencesResponseBody</p>
 */
public class ListSkillReferencesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListSkillReferencesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSkillReferencesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListSkillReferencesResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The skill reference relationship data returned by the paged query. The data is returned with paging.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID, which is used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>5C6D9E10-1234-5678-9ABC-DEF012345678</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSkillReferencesResponseBody build() {
            return new ListSkillReferencesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSkillReferencesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSkillReferencesResponseBody</p>
     */
    public static class PageItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ownerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("ownerType")
        private String ownerType;

        @com.aliyun.core.annotation.NameInMap("ownerVersion")
        private String ownerVersion;

        @com.aliyun.core.annotation.NameInMap("selectorType")
        private String selectorType;

        @com.aliyun.core.annotation.NameInMap("selectorValue")
        private String selectorValue;

        @com.aliyun.core.annotation.NameInMap("skillName")
        private String skillName;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private PageItems(Builder builder) {
            this.ownerId = builder.ownerId;
            this.ownerType = builder.ownerType;
            this.ownerVersion = builder.ownerVersion;
            this.selectorType = builder.selectorType;
            this.selectorValue = builder.selectorValue;
            this.skillName = builder.skillName;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageItems create() {
            return builder().build();
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return ownerType
         */
        public String getOwnerType() {
            return this.ownerType;
        }

        /**
         * @return ownerVersion
         */
        public String getOwnerVersion() {
            return this.ownerVersion;
        }

        /**
         * @return selectorType
         */
        public String getSelectorType() {
            return this.selectorType;
        }

        /**
         * @return selectorValue
         */
        public String getSelectorValue() {
            return this.selectorValue;
        }

        /**
         * @return skillName
         */
        public String getSkillName() {
            return this.skillName;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String ownerId; 
            private String ownerType; 
            private String ownerVersion; 
            private String selectorType; 
            private String selectorValue; 
            private String skillName; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(PageItems model) {
                this.ownerId = model.ownerId;
                this.ownerType = model.ownerType;
                this.ownerVersion = model.ownerVersion;
                this.selectorType = model.selectorType;
                this.selectorValue = model.selectorValue;
                this.skillName = model.skillName;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The ID of the referencing entity (the identifier of the Agent or AgentSpec).</p>
             * 
             * <strong>example:</strong>
             * <p>agent-1234567890abcdef</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The type of the referencing entity. Valid values: AGENT and AGENTSPEC.</p>
             * 
             * <strong>example:</strong>
             * <p>AGENT</p>
             */
            public Builder ownerType(String ownerType) {
                this.ownerType = ownerType;
                return this;
            }

            /**
             * <p>The version of the referencing entity.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder ownerVersion(String ownerVersion) {
                this.ownerVersion = ownerVersion;
                return this;
            }

            /**
             * <p>The reference selector type. Valid values: LABEL and VERSION.</p>
             * 
             * <strong>example:</strong>
             * <p>LABEL</p>
             */
            public Builder selectorType(String selectorType) {
                this.selectorType = selectorType;
                return this;
            }

            /**
             * <p>The reference selector value, such as latest, a named label, HEAD, or a specific version.</p>
             * 
             * <strong>example:</strong>
             * <p>HEAD</p>
             */
            public Builder selectorValue(String selectorValue) {
                this.selectorValue = selectorValue;
                return this;
            }

            /**
             * <p>The name of the referenced skill.</p>
             * 
             * <strong>example:</strong>
             * <p>web-search</p>
             */
            public Builder skillName(String skillName) {
                this.skillName = skillName;
                return this;
            }

            /**
             * <p>The workspace ID to which the reference belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ws-1234567890abcdef</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public PageItems build() {
                return new PageItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSkillReferencesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSkillReferencesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("pageItems")
        private java.util.List<PageItems> pageItems;

        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("pagesAvailable")
        private Integer pagesAvailable;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.pageItems = builder.pageItems;
            this.pageNumber = builder.pageNumber;
            this.pagesAvailable = builder.pagesAvailable;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageItems
         */
        public java.util.List<PageItems> getPageItems() {
            return this.pageItems;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pagesAvailable
         */
        public Integer getPagesAvailable() {
            return this.pagesAvailable;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<PageItems> pageItems; 
            private Integer pageNumber; 
            private Integer pagesAvailable; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageItems = model.pageItems;
                this.pageNumber = model.pageNumber;
                this.pagesAvailable = model.pagesAvailable;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of skill reference relationships on the current page.</p>
             */
            public Builder pageItems(java.util.List<PageItems> pageItems) {
                this.pageItems = pageItems;
                return this;
            }

            /**
             * <p>The current page number, starting from 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The total number of available pages.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder pagesAvailable(Integer pagesAvailable) {
                this.pagesAvailable = pagesAvailable;
                return this;
            }

            /**
             * <p>The total number of reference relationships that match the filter conditions.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
