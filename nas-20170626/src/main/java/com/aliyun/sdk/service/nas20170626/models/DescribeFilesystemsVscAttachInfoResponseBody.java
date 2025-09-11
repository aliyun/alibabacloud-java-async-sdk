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
 * {@link DescribeFilesystemsVscAttachInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFilesystemsVscAttachInfoResponseBody</p>
 */
public class DescribeFilesystemsVscAttachInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VscAttachInfo")
    private VscAttachInfo vscAttachInfo;

    private DescribeFilesystemsVscAttachInfoResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vscAttachInfo = builder.vscAttachInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFilesystemsVscAttachInfoResponseBody create() {
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return vscAttachInfo
     */
    public VscAttachInfo getVscAttachInfo() {
        return this.vscAttachInfo;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private VscAttachInfo vscAttachInfo; 

        private Builder() {
        } 

        private Builder(DescribeFilesystemsVscAttachInfoResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.vscAttachInfo = model.vscAttachInfo;
        } 

        /**
         * <p>The number of directories to return for each query.</p>
         * <p>Valid values: 10 to 1000.</p>
         * <p>Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Query token, which is the NextToken value returned from the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291cmNlU****mVzJjE1MTI2NjY4NzY5MTAzOTEmMiZORnI4NDhVeEtrUT0=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BC7C825C-5F65-4B56-BEF6-98C56C7C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of associated information.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>A collection of file system and virtual channel association data.</p>
         */
        public Builder vscAttachInfo(VscAttachInfo vscAttachInfo) {
            this.vscAttachInfo = vscAttachInfo;
            return this;
        }

        public DescribeFilesystemsVscAttachInfoResponseBody build() {
            return new DescribeFilesystemsVscAttachInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFilesystemsVscAttachInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFilesystemsVscAttachInfoResponseBody</p>
     */
    public static class VscAttachInfoVscAttachInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VscId")
        private String vscId;

        private VscAttachInfoVscAttachInfo(Builder builder) {
            this.fileSystemId = builder.fileSystemId;
            this.status = builder.status;
            this.vscId = builder.vscId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VscAttachInfoVscAttachInfo create() {
            return builder().build();
        }

        /**
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vscId
         */
        public String getVscId() {
            return this.vscId;
        }

        public static final class Builder {
            private String fileSystemId; 
            private String status; 
            private String vscId; 

            private Builder() {
            } 

            private Builder(VscAttachInfoVscAttachInfo model) {
                this.fileSystemId = model.fileSystemId;
                this.status = model.status;
                this.vscId = model.vscId;
            } 

            /**
             * <p>The ID of the file system.</p>
             * 
             * <strong>example:</strong>
             * <p>bmcpfs-290t15yn4uo8lid****</p>
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * <p>The association status of the file system and virtual channel. Valid values:</p>
             * <ul>
             * <li>Attaching: The association is being made.</li>
             * <li>Attached: The association is complete.</li>
             * <li>Detaching: The association is being canceled.</li>
             * <li>Detached: The association is canceled.</li>
             * <li>Failed: The association failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Attached</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the virtual storage channel.</p>
             * 
             * <strong>example:</strong>
             * <p>vsc-8vb864o3ppwfvh****</p>
             */
            public Builder vscId(String vscId) {
                this.vscId = vscId;
                return this;
            }

            public VscAttachInfoVscAttachInfo build() {
                return new VscAttachInfoVscAttachInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFilesystemsVscAttachInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFilesystemsVscAttachInfoResponseBody</p>
     */
    public static class VscAttachInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VscAttachInfo")
        private java.util.List<VscAttachInfoVscAttachInfo> vscAttachInfo;

        private VscAttachInfo(Builder builder) {
            this.vscAttachInfo = builder.vscAttachInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VscAttachInfo create() {
            return builder().build();
        }

        /**
         * @return vscAttachInfo
         */
        public java.util.List<VscAttachInfoVscAttachInfo> getVscAttachInfo() {
            return this.vscAttachInfo;
        }

        public static final class Builder {
            private java.util.List<VscAttachInfoVscAttachInfo> vscAttachInfo; 

            private Builder() {
            } 

            private Builder(VscAttachInfo model) {
                this.vscAttachInfo = model.vscAttachInfo;
            } 

            /**
             * <p>A collection of file system and virtual channel association data.</p>
             */
            public Builder vscAttachInfo(java.util.List<VscAttachInfoVscAttachInfo> vscAttachInfo) {
                this.vscAttachInfo = vscAttachInfo;
                return this;
            }

            public VscAttachInfo build() {
                return new VscAttachInfo(this);
            } 

        } 

    }
}
