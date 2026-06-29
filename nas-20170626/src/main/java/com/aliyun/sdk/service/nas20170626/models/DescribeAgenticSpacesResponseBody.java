// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link DescribeAgenticSpacesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAgenticSpacesResponseBody</p>
 */
public class DescribeAgenticSpacesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgenticSpaces")
    private AgenticSpaces agenticSpaces;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAgenticSpacesResponseBody(Builder builder) {
        this.agenticSpaces = builder.agenticSpaces;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAgenticSpacesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agenticSpaces
     */
    public AgenticSpaces getAgenticSpaces() {
        return this.agenticSpaces;
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

    public static final class Builder {
        private AgenticSpaces agenticSpaces; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAgenticSpacesResponseBody model) {
            this.agenticSpaces = model.agenticSpaces;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * AgenticSpaces.
         */
        public Builder agenticSpaces(AgenticSpaces agenticSpaces) {
            this.agenticSpaces = agenticSpaces;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAgenticSpacesResponseBody build() {
            return new DescribeAgenticSpacesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAgenticSpacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAgenticSpacesResponseBody</p>
     */
    public static class Quota extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileCountLimit")
        private Long fileCountLimit;

        @com.aliyun.core.annotation.NameInMap("SizeLimit")
        private Long sizeLimit;

        private Quota(Builder builder) {
            this.fileCountLimit = builder.fileCountLimit;
            this.sizeLimit = builder.sizeLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quota create() {
            return builder().build();
        }

        /**
         * @return fileCountLimit
         */
        public Long getFileCountLimit() {
            return this.fileCountLimit;
        }

        /**
         * @return sizeLimit
         */
        public Long getSizeLimit() {
            return this.sizeLimit;
        }

        public static final class Builder {
            private Long fileCountLimit; 
            private Long sizeLimit; 

            private Builder() {
            } 

            private Builder(Quota model) {
                this.fileCountLimit = model.fileCountLimit;
                this.sizeLimit = model.sizeLimit;
            } 

            /**
             * FileCountLimit.
             */
            public Builder fileCountLimit(Long fileCountLimit) {
                this.fileCountLimit = fileCountLimit;
                return this;
            }

            /**
             * SizeLimit.
             */
            public Builder sizeLimit(Long sizeLimit) {
                this.sizeLimit = sizeLimit;
                return this;
            }

            public Quota build() {
                return new Quota(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAgenticSpacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAgenticSpacesResponseBody</p>
     */
    public static class AgenticSpace extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgenticSpaceId")
        private String agenticSpaceId;

        @com.aliyun.core.annotation.NameInMap("Azone")
        private String azone;

        @com.aliyun.core.annotation.NameInMap("CreateTimeUtc")
        private String createTimeUtc;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FileCountUsage")
        private Long fileCountUsage;

        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("FileSystemPath")
        private String fileSystemPath;

        @com.aliyun.core.annotation.NameInMap("Quota")
        private Quota quota;

        @com.aliyun.core.annotation.NameInMap("SpaceUsage")
        private Long spaceUsage;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTimeUtc")
        private String updateTimeUtc;

        private AgenticSpace(Builder builder) {
            this.agenticSpaceId = builder.agenticSpaceId;
            this.azone = builder.azone;
            this.createTimeUtc = builder.createTimeUtc;
            this.description = builder.description;
            this.fileCountUsage = builder.fileCountUsage;
            this.fileSystemId = builder.fileSystemId;
            this.fileSystemPath = builder.fileSystemPath;
            this.quota = builder.quota;
            this.spaceUsage = builder.spaceUsage;
            this.status = builder.status;
            this.updateTimeUtc = builder.updateTimeUtc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgenticSpace create() {
            return builder().build();
        }

        /**
         * @return agenticSpaceId
         */
        public String getAgenticSpaceId() {
            return this.agenticSpaceId;
        }

        /**
         * @return azone
         */
        public String getAzone() {
            return this.azone;
        }

        /**
         * @return createTimeUtc
         */
        public String getCreateTimeUtc() {
            return this.createTimeUtc;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fileCountUsage
         */
        public Long getFileCountUsage() {
            return this.fileCountUsage;
        }

        /**
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        /**
         * @return fileSystemPath
         */
        public String getFileSystemPath() {
            return this.fileSystemPath;
        }

        /**
         * @return quota
         */
        public Quota getQuota() {
            return this.quota;
        }

        /**
         * @return spaceUsage
         */
        public Long getSpaceUsage() {
            return this.spaceUsage;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTimeUtc
         */
        public String getUpdateTimeUtc() {
            return this.updateTimeUtc;
        }

        public static final class Builder {
            private String agenticSpaceId; 
            private String azone; 
            private String createTimeUtc; 
            private String description; 
            private Long fileCountUsage; 
            private String fileSystemId; 
            private String fileSystemPath; 
            private Quota quota; 
            private Long spaceUsage; 
            private String status; 
            private String updateTimeUtc; 

            private Builder() {
            } 

            private Builder(AgenticSpace model) {
                this.agenticSpaceId = model.agenticSpaceId;
                this.azone = model.azone;
                this.createTimeUtc = model.createTimeUtc;
                this.description = model.description;
                this.fileCountUsage = model.fileCountUsage;
                this.fileSystemId = model.fileSystemId;
                this.fileSystemPath = model.fileSystemPath;
                this.quota = model.quota;
                this.spaceUsage = model.spaceUsage;
                this.status = model.status;
                this.updateTimeUtc = model.updateTimeUtc;
            } 

            /**
             * <p>AgenticSpace Id。</p>
             * 
             * <strong>example:</strong>
             * <p>agentic-229oypxjgpau2****</p>
             */
            public Builder agenticSpaceId(String agenticSpaceId) {
                this.agenticSpaceId = agenticSpaceId;
                return this;
            }

            /**
             * Azone.
             */
            public Builder azone(String azone) {
                this.azone = azone;
                return this;
            }

            /**
             * CreateTimeUtc.
             */
            public Builder createTimeUtc(String createTimeUtc) {
                this.createTimeUtc = createTimeUtc;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * FileCountUsage.
             */
            public Builder fileCountUsage(Long fileCountUsage) {
                this.fileCountUsage = fileCountUsage;
                return this;
            }

            /**
             * FileSystemId.
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * FileSystemPath.
             */
            public Builder fileSystemPath(String fileSystemPath) {
                this.fileSystemPath = fileSystemPath;
                return this;
            }

            /**
             * Quota.
             */
            public Builder quota(Quota quota) {
                this.quota = quota;
                return this;
            }

            /**
             * SpaceUsage.
             */
            public Builder spaceUsage(Long spaceUsage) {
                this.spaceUsage = spaceUsage;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UpdateTimeUtc.
             */
            public Builder updateTimeUtc(String updateTimeUtc) {
                this.updateTimeUtc = updateTimeUtc;
                return this;
            }

            public AgenticSpace build() {
                return new AgenticSpace(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAgenticSpacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAgenticSpacesResponseBody</p>
     */
    public static class AgenticSpaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgenticSpace")
        private java.util.List<AgenticSpace> agenticSpace;

        private AgenticSpaces(Builder builder) {
            this.agenticSpace = builder.agenticSpace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgenticSpaces create() {
            return builder().build();
        }

        /**
         * @return agenticSpace
         */
        public java.util.List<AgenticSpace> getAgenticSpace() {
            return this.agenticSpace;
        }

        public static final class Builder {
            private java.util.List<AgenticSpace> agenticSpace; 

            private Builder() {
            } 

            private Builder(AgenticSpaces model) {
                this.agenticSpace = model.agenticSpace;
            } 

            /**
             * AgenticSpace.
             */
            public Builder agenticSpace(java.util.List<AgenticSpace> agenticSpace) {
                this.agenticSpace = agenticSpace;
                return this;
            }

            public AgenticSpaces build() {
                return new AgenticSpaces(this);
            } 

        } 

    }
}
