// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.codesec20260401.models;

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
 * {@link DescribeProjectsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProjectsResponseBody</p>
 */
public class DescribeProjectsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private DescribeProjectsResponseBody(Builder builder) {
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProjectsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeProjectsResponseBody model) {
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>9A1F403F-0A85-5578-8B7C-55E3E9408659</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeProjectsResponseBody build() {
            return new DescribeProjectsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProjectsResponseBody</p>
     */
    public static class Engines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("sast")
        private Boolean sast;

        @com.aliyun.core.annotation.NameInMap("sca")
        private Boolean sca;

        private Engines(Builder builder) {
            this.sast = builder.sast;
            this.sca = builder.sca;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Engines create() {
            return builder().build();
        }

        /**
         * @return sast
         */
        public Boolean getSast() {
            return this.sast;
        }

        /**
         * @return sca
         */
        public Boolean getSca() {
            return this.sca;
        }

        public static final class Builder {
            private Boolean sast; 
            private Boolean sca; 

            private Builder() {
            } 

            private Builder(Engines model) {
                this.sast = model.sast;
                this.sca = model.sca;
            } 

            /**
             * sast.
             */
            public Builder sast(Boolean sast) {
                this.sast = sast;
                return this;
            }

            /**
             * sca.
             */
            public Builder sca(Boolean sca) {
                this.sca = sca;
                return this;
            }

            public Engines build() {
                return new Engines(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProjectsResponseBody</p>
     */
    public static class Source extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Source(Builder builder) {
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Source create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String type; 

            private Builder() {
            } 

            private Builder(Source model) {
                this.type = model.type;
            } 

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Source build() {
                return new Source(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProjectsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configRevision")
        private Long configRevision;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("createdBy")
        private String createdBy;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("engines")
        private Engines engines;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("instructionPrompt")
        private String instructionPrompt;

        @com.aliyun.core.annotation.NameInMap("lastScanTime")
        private String lastScanTime;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("source")
        private Source source;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        private Items(Builder builder) {
            this.configRevision = builder.configRevision;
            this.createdAt = builder.createdAt;
            this.createdBy = builder.createdBy;
            this.description = builder.description;
            this.engines = builder.engines;
            this.id = builder.id;
            this.instructionPrompt = builder.instructionPrompt;
            this.lastScanTime = builder.lastScanTime;
            this.name = builder.name;
            this.source = builder.source;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return configRevision
         */
        public Long getConfigRevision() {
            return this.configRevision;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return createdBy
         */
        public String getCreatedBy() {
            return this.createdBy;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return engines
         */
        public Engines getEngines() {
            return this.engines;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instructionPrompt
         */
        public String getInstructionPrompt() {
            return this.instructionPrompt;
        }

        /**
         * @return lastScanTime
         */
        public String getLastScanTime() {
            return this.lastScanTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return source
         */
        public Source getSource() {
            return this.source;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private Long configRevision; 
            private String createdAt; 
            private String createdBy; 
            private String description; 
            private Engines engines; 
            private Long id; 
            private String instructionPrompt; 
            private String lastScanTime; 
            private String name; 
            private Source source; 
            private String updatedAt; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.configRevision = model.configRevision;
                this.createdAt = model.createdAt;
                this.createdBy = model.createdBy;
                this.description = model.description;
                this.engines = model.engines;
                this.id = model.id;
                this.instructionPrompt = model.instructionPrompt;
                this.lastScanTime = model.lastScanTime;
                this.name = model.name;
                this.source = model.source;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * configRevision.
             */
            public Builder configRevision(Long configRevision) {
                this.configRevision = configRevision;
                return this;
            }

            /**
             * <p>扫描项目创建时间（RFC3339）</p>
             * 
             * <strong>example:</strong>
             * <p>2026-07-28T03:36:31.573Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * createdBy.
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * engines.
             */
            public Builder engines(Engines engines) {
                this.engines = engines;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * instructionPrompt.
             */
            public Builder instructionPrompt(String instructionPrompt) {
                this.instructionPrompt = instructionPrompt;
                return this;
            }

            /**
             * <p>Creation time of the most recent scan under this project, or null if the project has no scans.</p>
             */
            public Builder lastScanTime(String lastScanTime) {
                this.lastScanTime = lastScanTime;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * source.
             */
            public Builder source(Source source) {
                this.source = source;
                return this;
            }

            /**
             * <p>扫描项目更新时间（RFC3339）</p>
             * 
             * <strong>example:</strong>
             * <p>2026-07-28T03:36:31.573Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
