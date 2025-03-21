// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeBruteForceRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBruteForceRecordsResponseBody</p>
 */
public class DescribeBruteForceRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MachineList")
    private java.util.List<MachineList> machineList;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeBruteForceRecordsResponseBody(Builder builder) {
        this.machineList = builder.machineList;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBruteForceRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return machineList
     */
    public java.util.List<MachineList> getMachineList() {
        return this.machineList;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<MachineList> machineList; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * <p>The IP addresses.</p>
         */
        public Builder machineList(java.util.List<MachineList> machineList) {
            this.machineList = machineList;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>7E0618A9-D5EF-4220-9471-C42B5E92719F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBruteForceRecordsResponseBody build() {
            return new DescribeBruteForceRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBruteForceRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBruteForceRecordsResponseBody</p>
     */
    public static class MachineList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliNetOnline")
        private Boolean aliNetOnline;

        @com.aliyun.core.annotation.NameInMap("BlockExpireDate")
        private Long blockExpireDate;

        @com.aliyun.core.annotation.NameInMap("BlockIp")
        private String blockIp;

        @com.aliyun.core.annotation.NameInMap("BlockType")
        private String blockType;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private MachineList(Builder builder) {
            this.aliNetOnline = builder.aliNetOnline;
            this.blockExpireDate = builder.blockExpireDate;
            this.blockIp = builder.blockIp;
            this.blockType = builder.blockType;
            this.errorCode = builder.errorCode;
            this.id = builder.id;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.port = builder.port;
            this.ruleName = builder.ruleName;
            this.source = builder.source;
            this.status = builder.status;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MachineList create() {
            return builder().build();
        }

        /**
         * @return aliNetOnline
         */
        public Boolean getAliNetOnline() {
            return this.aliNetOnline;
        }

        /**
         * @return blockExpireDate
         */
        public Long getBlockExpireDate() {
            return this.blockExpireDate;
        }

        /**
         * @return blockIp
         */
        public String getBlockIp() {
            return this.blockIp;
        }

        /**
         * @return blockType
         */
        public String getBlockType() {
            return this.blockType;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Boolean aliNetOnline; 
            private Long blockExpireDate; 
            private String blockIp; 
            private String blockType; 
            private String errorCode; 
            private Long id; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String port; 
            private String ruleName; 
            private String source; 
            private Integer status; 
            private String uuid; 

            /**
             * <p>The status of the host network extension. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: online</li>
             * <li><strong>false</strong>: offline</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder aliNetOnline(Boolean aliNetOnline) {
                this.aliNetOnline = aliNetOnline;
                return this;
            }

            /**
             * <p>The timestamp when the block action on the IP address becomes invalid.</p>
             * 
             * <strong>example:</strong>
             * <p>1671506882063</p>
             */
            public Builder blockExpireDate(Long blockExpireDate) {
                this.blockExpireDate = blockExpireDate;
                return this;
            }

            /**
             * <p>The IP address that is blocked.</p>
             * 
             * <strong>example:</strong>
             * <p>10.12.XX.XX</p>
             */
            public Builder blockIp(String blockIp) {
                this.blockIp = blockIp;
                return this;
            }

            /**
             * <p>The blocking type. Valid values:</p>
             * <ul>
             * <li><strong>group</strong>: security group</li>
             * <li><strong>alinet</strong>: host network extension</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>alinet</p>
             */
            public Builder blockType(String blockType) {
                this.blockType = blockType;
                return this;
            }

            /**
             * <p>The error code returned when the defense rule fails to block the IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>InstanceSecurityGroupLimitExceeded</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The ID of the primary key that is recorded in the defense rule.</p>
             * 
             * <strong>example:</strong>
             * <p>112XX</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The instance name of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>record-test-***</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>120.79.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The port that is attacked.</p>
             * 
             * <strong>example:</strong>
             * <p>22/22</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The name of the defense rule.</p>
             * 
             * <strong>example:</strong>
             * <p>AntiRuleName</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The type of the defense rule. Valid values:</p>
             * <ul>
             * <li><strong>userRule</strong>: custom rule</li>
             * <li><strong>blinkRule</strong>: system rule</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>userRule</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The status of the defense rule. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: invalid</li>
             * <li><strong>1</strong>: enabled</li>
             * <li><strong>2</strong>: failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The UUID of the server on which the defense rule takes effect.</p>
             * 
             * <strong>example:</strong>
             * <p>6d5b361f-958d-48a8-a9d2-d6e82c1****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public MachineList build() {
                return new MachineList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBruteForceRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBruteForceRecordsResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page. Default value: <strong>20</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>263</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
