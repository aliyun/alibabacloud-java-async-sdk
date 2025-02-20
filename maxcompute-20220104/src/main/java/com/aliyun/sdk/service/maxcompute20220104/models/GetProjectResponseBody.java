// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link GetProjectResponseBody} extends {@link TeaModel}
 *
 * <p>GetProjectResponseBody</p>
 */
public class GetProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetProjectResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMsg; 
        private Integer httpCode; 
        private String requestId; 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>040002</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>error message.</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * <ul>
         * <li>1xx: informational response. The request is received and is being processed.</li>
         * <li>2xx: success. The request is successfully received, understood, and accepted by the server.</li>
         * <li>3xx: redirection. The request is redirected, and further actions are required to complete the request.</li>
         * <li>4xx: client error. The request contains invalid request parameters and syntaxes, or specific request conditions cannot be met.</li>
         * <li>5xx: server error. The server cannot meet requirements due to other reasons.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0b87b7b316643495896551555e855b</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProjectResponseBody build() {
            return new GetProjectResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetProjectResponseBody} extends {@link TeaModel}
     *
     * <p>GetProjectResponseBody</p>
     */
    public static class IpWhiteList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ipList")
        private String ipList;

        @com.aliyun.core.annotation.NameInMap("vpcIpList")
        private String vpcIpList;

        private IpWhiteList(Builder builder) {
            this.ipList = builder.ipList;
            this.vpcIpList = builder.vpcIpList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpWhiteList create() {
            return builder().build();
        }

        /**
         * @return ipList
         */
        public String getIpList() {
            return this.ipList;
        }

        /**
         * @return vpcIpList
         */
        public String getVpcIpList() {
            return this.vpcIpList;
        }

        public static final class Builder {
            private String ipList; 
            private String vpcIpList; 

            /**
             * <p>The IP address whitelist for access over the Internet or the network for interconnecting with other Alibaba Cloud services.</p>
             * <blockquote>
             * <p> If you configure only the IP address whitelist for access over the Internet or the network for interconnecting with other Alibaba Cloud services, the access over the Internet or the network for interconnecting with other Alibaba Cloud services is subject to configurations, and access over a virtual private cloud (VPC) is not allowed.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10.88.111.3</p>
             */
            public Builder ipList(String ipList) {
                this.ipList = ipList;
                return this;
            }

            /**
             * <p>The IP address whitelist for access over a VPC.</p>
             * <blockquote>
             * <p> If you configure only the IP address whitelist for access over a VPC, the access over a VPC is subject to configurations, and the access over the Internet or the network for interconnecting with other Alibaba Cloud services is not allowed.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10.88.111.3</p>
             */
            public Builder vpcIpList(String vpcIpList) {
                this.vpcIpList = vpcIpList;
                return this;
            }

            public IpWhiteList build() {
                return new IpWhiteList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProjectResponseBody} extends {@link TeaModel}
     *
     * <p>GetProjectResponseBody</p>
     */
    public static class Encryption extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("algorithm")
        private String algorithm;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        private Encryption(Builder builder) {
            this.algorithm = builder.algorithm;
            this.enable = builder.enable;
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Encryption create() {
            return builder().build();
        }

        /**
         * @return algorithm
         */
        public String getAlgorithm() {
            return this.algorithm;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String algorithm; 
            private Boolean enable; 
            private String key; 

            /**
             * <p>The data encryption algorithm that is supported by the key. Valid values: AES256, AESCTR, and RC4.</p>
             * 
             * <strong>example:</strong>
             * <p>SHA1</p>
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * <p>Indicates whether the data encryption feature needs to be enabled for the project. For more information about data encryption, see</p>
             * <p><a href="https://www.alibabacloud.com/help/zh/maxcompute/security-and-compliance/storage-encryption">Storage encryption</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The type of key that is used for data encryption. You can select MaxCompute Default Key or Bring Your Own Key (BYOK) as the key type. If you select MaxCompute Default Key, the default key that is created by MaxCompute is used.</p>
             * 
             * <strong>example:</strong>
             * <p>dafault</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public Encryption build() {
                return new Encryption(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProjectResponseBody} extends {@link TeaModel}
     *
     * <p>GetProjectResponseBody</p>
     */
    public static class ExternalProjectProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("isExternalCatalogBound")
        private String isExternalCatalogBound;

        private ExternalProjectProperties(Builder builder) {
            this.isExternalCatalogBound = builder.isExternalCatalogBound;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExternalProjectProperties create() {
            return builder().build();
        }

        /**
         * @return isExternalCatalogBound
         */
        public String getIsExternalCatalogBound() {
            return this.isExternalCatalogBound;
        }

        public static final class Builder {
            private String isExternalCatalogBound; 

            /**
             * <p>Indicates whether the external project is an external project for <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/lake-warehouse-integrated-2-0-use-guide">data lakehouse solution 2.0</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isExternalCatalogBound(String isExternalCatalogBound) {
                this.isExternalCatalogBound = isExternalCatalogBound;
                return this;
            }

            public ExternalProjectProperties build() {
                return new ExternalProjectProperties(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProjectResponseBody} extends {@link TeaModel}
     *
     * <p>GetProjectResponseBody</p>
     */
    public static class StorageTierSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("longTermSize")
        private Long longTermSize;

        @com.aliyun.core.annotation.NameInMap("lowFrequencySize")
        private Long lowFrequencySize;

        @com.aliyun.core.annotation.NameInMap("standardSize")
        private Long standardSize;

        private StorageTierSize(Builder builder) {
            this.longTermSize = builder.longTermSize;
            this.lowFrequencySize = builder.lowFrequencySize;
            this.standardSize = builder.standardSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageTierSize create() {
            return builder().build();
        }

        /**
         * @return longTermSize
         */
        public Long getLongTermSize() {
            return this.longTermSize;
        }

        /**
         * @return lowFrequencySize
         */
        public Long getLowFrequencySize() {
            return this.lowFrequencySize;
        }

        /**
         * @return standardSize
         */
        public Long getStandardSize() {
            return this.standardSize;
        }

        public static final class Builder {
            private Long longTermSize; 
            private Long lowFrequencySize; 
            private Long standardSize; 

            /**
             * <p>The storage usage at the long-term storage tier.</p>
             * 
             * <strong>example:</strong>
             * <p>21764917</p>
             */
            public Builder longTermSize(Long longTermSize) {
                this.longTermSize = longTermSize;
                return this;
            }

            /**
             * <p>The storage usage at the Infrequent Access (IA) layer.</p>
             * 
             * <strong>example:</strong>
             * <p>767693</p>
             */
            public Builder lowFrequencySize(Long lowFrequencySize) {
                this.lowFrequencySize = lowFrequencySize;
                return this;
            }

            /**
             * <p>The storage usage at the standard storage tier.</p>
             * 
             * <strong>example:</strong>
             * <p>27649172</p>
             */
            public Builder standardSize(Long standardSize) {
                this.standardSize = standardSize;
                return this;
            }

            public StorageTierSize build() {
                return new StorageTierSize(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProjectResponseBody} extends {@link TeaModel}
     *
     * <p>GetProjectResponseBody</p>
     */
    public static class StorageTierInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("projectBackupSize")
        private Long projectBackupSize;

        @com.aliyun.core.annotation.NameInMap("projectTotalSize")
        private Long projectTotalSize;

        @com.aliyun.core.annotation.NameInMap("storageTierSize")
        private StorageTierSize storageTierSize;

        private StorageTierInfo(Builder builder) {
            this.projectBackupSize = builder.projectBackupSize;
            this.projectTotalSize = builder.projectTotalSize;
            this.storageTierSize = builder.storageTierSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageTierInfo create() {
            return builder().build();
        }

        /**
         * @return projectBackupSize
         */
        public Long getProjectBackupSize() {
            return this.projectBackupSize;
        }

        /**
         * @return projectTotalSize
         */
        public Long getProjectTotalSize() {
            return this.projectTotalSize;
        }

        /**
         * @return storageTierSize
         */
        public StorageTierSize getStorageTierSize() {
            return this.storageTierSize;
        }

        public static final class Builder {
            private Long projectBackupSize; 
            private Long projectTotalSize; 
            private StorageTierSize storageTierSize; 

            /**
             * <p>The backup storage usage.</p>
             * 
             * <strong>example:</strong>
             * <p>86672917</p>
             */
            public Builder projectBackupSize(Long projectBackupSize) {
                this.projectBackupSize = projectBackupSize;
                return this;
            }

            /**
             * <p>The total storage usage.</p>
             * 
             * <strong>example:</strong>
             * <p>56066037</p>
             */
            public Builder projectTotalSize(Long projectTotalSize) {
                this.projectTotalSize = projectTotalSize;
                return this;
            }

            /**
             * <p>The <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/tiered-storage">storage tier</a> information.</p>
             */
            public Builder storageTierSize(StorageTierSize storageTierSize) {
                this.storageTierSize = storageTierSize;
                return this;
            }

            public StorageTierInfo build() {
                return new StorageTierInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProjectResponseBody} extends {@link TeaModel}
     *
     * <p>GetProjectResponseBody</p>
     */
    public static class TableLifecycle extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private TableLifecycle(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableLifecycle create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private String value; 

            /**
             * <p>The lifecycle type. Valid values:</p>
             * <ul>
             * <li><strong>mandatory</strong>: The lifecycle clause is required in a table creation statement.</li>
             * <li><strong>optional</strong>: The lifecycle clause is optional in a table creation statement. If you do not configure a lifecycle for a table, the table does not expire.</li>
             * <li><strong>inherit</strong>: If you do not configure a lifecycle for a table when you create the table, the value of the odps.table.lifecycle.value parameter is used as the table lifecycle by default.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>optional</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The table lifecycle. Unit: days. Valid values: 1 to 37231. Default value: 37231.</p>
             * 
             * <strong>example:</strong>
             * <p>37231</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TableLifecycle build() {
                return new TableLifecycle(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProjectResponseBody} extends {@link TeaModel}
     *
     * <p>GetProjectResponseBody</p>
     */
    public static class TierToLongterm extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DaysAfterLastAccessGreaterThan")
        private Long daysAfterLastAccessGreaterThan;

        @com.aliyun.core.annotation.NameInMap("DaysAfterLastModificationGreaterThan")
        private Long daysAfterLastModificationGreaterThan;

        @com.aliyun.core.annotation.NameInMap("DaysAfterLastTierModificationGreaterThan")
        private Long daysAfterLastTierModificationGreaterThan;

        private TierToLongterm(Builder builder) {
            this.daysAfterLastAccessGreaterThan = builder.daysAfterLastAccessGreaterThan;
            this.daysAfterLastModificationGreaterThan = builder.daysAfterLastModificationGreaterThan;
            this.daysAfterLastTierModificationGreaterThan = builder.daysAfterLastTierModificationGreaterThan;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TierToLongterm create() {
            return builder().build();
        }

        /**
         * @return daysAfterLastAccessGreaterThan
         */
        public Long getDaysAfterLastAccessGreaterThan() {
            return this.daysAfterLastAccessGreaterThan;
        }

        /**
         * @return daysAfterLastModificationGreaterThan
         */
        public Long getDaysAfterLastModificationGreaterThan() {
            return this.daysAfterLastModificationGreaterThan;
        }

        /**
         * @return daysAfterLastTierModificationGreaterThan
         */
        public Long getDaysAfterLastTierModificationGreaterThan() {
            return this.daysAfterLastTierModificationGreaterThan;
        }

        public static final class Builder {
            private Long daysAfterLastAccessGreaterThan; 
            private Long daysAfterLastModificationGreaterThan; 
            private Long daysAfterLastTierModificationGreaterThan; 

            /**
             * <p>The system triggers an automatic storage tier change N days after the last access time of data. N is specified by this parameter and corresponds to <code>LastAccessTime</code> that is configured for the table or partition.</p>
             * <blockquote>
             * <p> If LastAccessTime of a table or partition is left empty, the following rules are applied:</p>
             * </blockquote>
             * <ul>
             * <li><p>For tables or partitions that you created before October 1, 2023, 2023.10.01 00:00:00 in UTC+0 is considered as the last access time.</p>
             * </li>
             * <li><p>For tables or partitions that you created on or after October 1, 2023, if no data is accessed, the table or partition creation time is considered as the last access time.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>180</p>
             */
            public Builder daysAfterLastAccessGreaterThan(Long daysAfterLastAccessGreaterThan) {
                this.daysAfterLastAccessGreaterThan = daysAfterLastAccessGreaterThan;
                return this;
            }

            /**
             * <p>The system triggers an automatic storage tier change N days after the last modification time of data. N is specified by this parameter and corresponds to <code>LastModifiedTime</code> that is configured for the table or partition.</p>
             * 
             * <strong>example:</strong>
             * <p>180</p>
             */
            public Builder daysAfterLastModificationGreaterThan(Long daysAfterLastModificationGreaterThan) {
                this.daysAfterLastModificationGreaterThan = daysAfterLastModificationGreaterThan;
                return this;
            }

            /**
             * <p>The period after the previous storage tier change time.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder daysAfterLastTierModificationGreaterThan(Long daysAfterLastTierModificationGreaterThan) {
                this.daysAfterLastTierModificationGreaterThan = daysAfterLastTierModificationGreaterThan;
                return this;
            }

            public TierToLongterm build() {
                return new TierToLongterm(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProjectResponseBody} extends {@link TeaModel}
     *
     * <p>GetProjectResponseBody</p>
     */
    public static class TierToLowFrequency extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DaysAfterLastAccessGreaterThan")
        private Long daysAfterLastAccessGreaterThan;

        @com.aliyun.core.annotation.NameInMap("DaysAfterLastModificationGreaterThan")
        private Long daysAfterLastModificationGreaterThan;

        @com.aliyun.core.annotation.NameInMap("DaysAfterLastTierModificationGreaterThan")
        private Long daysAfterLastTierModificationGreaterThan;

        private TierToLowFrequency(Builder builder) {
            this.daysAfterLastAccessGreaterThan = builder.daysAfterLastAccessGreaterThan;
            this.daysAfterLastModificationGreaterThan = builder.daysAfterLastModificationGreaterThan;
            this.daysAfterLastTierModificationGreaterThan = builder.daysAfterLastTierModificationGreaterThan;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TierToLowFrequency create() {
            return builder().build();
        }

        /**
         * @return daysAfterLastAccessGreaterThan
         */
        public Long getDaysAfterLastAccessGreaterThan() {
            return this.daysAfterLastAccessGreaterThan;
        }

        /**
         * @return daysAfterLastModificationGreaterThan
         */
        public Long getDaysAfterLastModificationGreaterThan() {
            return this.daysAfterLastModificationGreaterThan;
        }

        /**
         * @return daysAfterLastTierModificationGreaterThan
         */
        public Long getDaysAfterLastTierModificationGreaterThan() {
            return this.daysAfterLastTierModificationGreaterThan;
        }

        public static final class Builder {
            private Long daysAfterLastAccessGreaterThan; 
            private Long daysAfterLastModificationGreaterThan; 
            private Long daysAfterLastTierModificationGreaterThan; 

            /**
             * <p>The system triggers an automatic storage tier change N days after the last access time of data. N is specified by this parameter and corresponds to <code>LastAccessTime</code> that is configured for the table or partition.</p>
             * <blockquote>
             * <p> If LastAccessTime of a table or partition is left empty, the following rules are applied:</p>
             * </blockquote>
             * <ul>
             * <li><p>For tables or partitions that you created before October 1, 2023, 2023.10.01 00:00:00 in UTC+0 is considered as the last access time.</p>
             * </li>
             * <li><p>For tables or partitions that you created on or after October 1, 2023, if no data is accessed, the table or partition creation time is considered as the last access time.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder daysAfterLastAccessGreaterThan(Long daysAfterLastAccessGreaterThan) {
                this.daysAfterLastAccessGreaterThan = daysAfterLastAccessGreaterThan;
                return this;
            }

            /**
             * <p>The system triggers an automatic storage tier change N days after the last modification time of data. N is specified by this parameter and corresponds to <code>LastModifiedTime</code> that is configured for the table or partition.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder daysAfterLastModificationGreaterThan(Long daysAfterLastModificationGreaterThan) {
                this.daysAfterLastModificationGreaterThan = daysAfterLastModificationGreaterThan;
                return this;
            }

            /**
             * <p>The period after the previous storage tier change time.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder daysAfterLastTierModificationGreaterThan(Long daysAfterLastTierModificationGreaterThan) {
                this.daysAfterLastTierModificationGreaterThan = daysAfterLastTierModificationGreaterThan;
                return this;
            }

            public TierToLowFrequency build() {
                return new TierToLowFrequency(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProjectResponseBody} extends {@link TeaModel}
     *
     * <p>GetProjectResponseBody</p>
     */
    public static class TableLifecycleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TierToLongterm")
        private TierToLongterm tierToLongterm;

        @com.aliyun.core.annotation.NameInMap("TierToLowFrequency")
        private TierToLowFrequency tierToLowFrequency;

        private TableLifecycleConfig(Builder builder) {
            this.tierToLongterm = builder.tierToLongterm;
            this.tierToLowFrequency = builder.tierToLowFrequency;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableLifecycleConfig create() {
            return builder().build();
        }

        /**
         * @return tierToLongterm
         */
        public TierToLongterm getTierToLongterm() {
            return this.tierToLongterm;
        }

        /**
         * @return tierToLowFrequency
         */
        public TierToLowFrequency getTierToLowFrequency() {
            return this.tierToLowFrequency;
        }

        public static final class Builder {
            private TierToLongterm tierToLongterm; 
            private TierToLowFrequency tierToLowFrequency; 

            /**
             * <p>The information about the long-term storage tier.</p>
             */
            public Builder tierToLongterm(TierToLongterm tierToLongterm) {
                this.tierToLongterm = tierToLongterm;
                return this;
            }

            /**
             * <p>The information about the IA storage tier.</p>
             */
            public Builder tierToLowFrequency(TierToLowFrequency tierToLowFrequency) {
                this.tierToLowFrequency = tierToLowFrequency;
                return this;
            }

            public TableLifecycleConfig build() {
                return new TableLifecycleConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProjectResponseBody} extends {@link TeaModel}
     *
     * <p>GetProjectResponseBody</p>
     */
    public static class Properties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("allowFullScan")
        private Boolean allowFullScan;

        @com.aliyun.core.annotation.NameInMap("autoMvQuotaGb")
        private Long autoMvQuotaGb;

        @com.aliyun.core.annotation.NameInMap("elderTunnelQuota")
        private String elderTunnelQuota;

        @com.aliyun.core.annotation.NameInMap("enableAutoMv")
        private Boolean enableAutoMv;

        @com.aliyun.core.annotation.NameInMap("enableDecimal2")
        private Boolean enableDecimal2;

        @com.aliyun.core.annotation.NameInMap("enableDr")
        private Boolean enableDr;

        @com.aliyun.core.annotation.NameInMap("enableFdcCacheForce")
        private Boolean enableFdcCacheForce;

        @com.aliyun.core.annotation.NameInMap("enableTieredStorage")
        private Boolean enableTieredStorage;

        @com.aliyun.core.annotation.NameInMap("enableTunnelQuotaRoute")
        private Boolean enableTunnelQuotaRoute;

        @com.aliyun.core.annotation.NameInMap("encryption")
        private Encryption encryption;

        @com.aliyun.core.annotation.NameInMap("externalProjectProperties")
        private ExternalProjectProperties externalProjectProperties;

        @com.aliyun.core.annotation.NameInMap("fdcQuota")
        private String fdcQuota;

        @com.aliyun.core.annotation.NameInMap("retentionDays")
        private Long retentionDays;

        @com.aliyun.core.annotation.NameInMap("sqlMeteringMax")
        private String sqlMeteringMax;

        @com.aliyun.core.annotation.NameInMap("storageTierInfo")
        private StorageTierInfo storageTierInfo;

        @com.aliyun.core.annotation.NameInMap("tableLifecycle")
        private TableLifecycle tableLifecycle;

        @com.aliyun.core.annotation.NameInMap("tableLifecycleConfig")
        private TableLifecycleConfig tableLifecycleConfig;

        @com.aliyun.core.annotation.NameInMap("timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("tunnelQuota")
        private String tunnelQuota;

        @com.aliyun.core.annotation.NameInMap("typeSystem")
        private String typeSystem;

        private Properties(Builder builder) {
            this.allowFullScan = builder.allowFullScan;
            this.autoMvQuotaGb = builder.autoMvQuotaGb;
            this.elderTunnelQuota = builder.elderTunnelQuota;
            this.enableAutoMv = builder.enableAutoMv;
            this.enableDecimal2 = builder.enableDecimal2;
            this.enableDr = builder.enableDr;
            this.enableFdcCacheForce = builder.enableFdcCacheForce;
            this.enableTieredStorage = builder.enableTieredStorage;
            this.enableTunnelQuotaRoute = builder.enableTunnelQuotaRoute;
            this.encryption = builder.encryption;
            this.externalProjectProperties = builder.externalProjectProperties;
            this.fdcQuota = builder.fdcQuota;
            this.retentionDays = builder.retentionDays;
            this.sqlMeteringMax = builder.sqlMeteringMax;
            this.storageTierInfo = builder.storageTierInfo;
            this.tableLifecycle = builder.tableLifecycle;
            this.tableLifecycleConfig = builder.tableLifecycleConfig;
            this.timezone = builder.timezone;
            this.tunnelQuota = builder.tunnelQuota;
            this.typeSystem = builder.typeSystem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Properties create() {
            return builder().build();
        }

        /**
         * @return allowFullScan
         */
        public Boolean getAllowFullScan() {
            return this.allowFullScan;
        }

        /**
         * @return autoMvQuotaGb
         */
        public Long getAutoMvQuotaGb() {
            return this.autoMvQuotaGb;
        }

        /**
         * @return elderTunnelQuota
         */
        public String getElderTunnelQuota() {
            return this.elderTunnelQuota;
        }

        /**
         * @return enableAutoMv
         */
        public Boolean getEnableAutoMv() {
            return this.enableAutoMv;
        }

        /**
         * @return enableDecimal2
         */
        public Boolean getEnableDecimal2() {
            return this.enableDecimal2;
        }

        /**
         * @return enableDr
         */
        public Boolean getEnableDr() {
            return this.enableDr;
        }

        /**
         * @return enableFdcCacheForce
         */
        public Boolean getEnableFdcCacheForce() {
            return this.enableFdcCacheForce;
        }

        /**
         * @return enableTieredStorage
         */
        public Boolean getEnableTieredStorage() {
            return this.enableTieredStorage;
        }

        /**
         * @return enableTunnelQuotaRoute
         */
        public Boolean getEnableTunnelQuotaRoute() {
            return this.enableTunnelQuotaRoute;
        }

        /**
         * @return encryption
         */
        public Encryption getEncryption() {
            return this.encryption;
        }

        /**
         * @return externalProjectProperties
         */
        public ExternalProjectProperties getExternalProjectProperties() {
            return this.externalProjectProperties;
        }

        /**
         * @return fdcQuota
         */
        public String getFdcQuota() {
            return this.fdcQuota;
        }

        /**
         * @return retentionDays
         */
        public Long getRetentionDays() {
            return this.retentionDays;
        }

        /**
         * @return sqlMeteringMax
         */
        public String getSqlMeteringMax() {
            return this.sqlMeteringMax;
        }

        /**
         * @return storageTierInfo
         */
        public StorageTierInfo getStorageTierInfo() {
            return this.storageTierInfo;
        }

        /**
         * @return tableLifecycle
         */
        public TableLifecycle getTableLifecycle() {
            return this.tableLifecycle;
        }

        /**
         * @return tableLifecycleConfig
         */
        public TableLifecycleConfig getTableLifecycleConfig() {
            return this.tableLifecycleConfig;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        /**
         * @return tunnelQuota
         */
        public String getTunnelQuota() {
            return this.tunnelQuota;
        }

        /**
         * @return typeSystem
         */
        public String getTypeSystem() {
            return this.typeSystem;
        }

        public static final class Builder {
            private Boolean allowFullScan; 
            private Long autoMvQuotaGb; 
            private String elderTunnelQuota; 
            private Boolean enableAutoMv; 
            private Boolean enableDecimal2; 
            private Boolean enableDr; 
            private Boolean enableFdcCacheForce; 
            private Boolean enableTieredStorage; 
            private Boolean enableTunnelQuotaRoute; 
            private Encryption encryption; 
            private ExternalProjectProperties externalProjectProperties; 
            private String fdcQuota; 
            private Long retentionDays; 
            private String sqlMeteringMax; 
            private StorageTierInfo storageTierInfo; 
            private TableLifecycle tableLifecycle; 
            private TableLifecycleConfig tableLifecycleConfig; 
            private String timezone; 
            private String tunnelQuota; 
            private String typeSystem; 

            /**
             * <p>Indicates whether a full table scan is allowed in the project. A full table scan occupies a large number of resources, which reduces data processing efficiency. By default, the full table scan feature is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder allowFullScan(Boolean allowFullScan) {
                this.allowFullScan = allowFullScan;
                return this;
            }

            /**
             * autoMvQuotaGb.
             */
            public Builder autoMvQuotaGb(Long autoMvQuotaGb) {
                this.autoMvQuotaGb = autoMvQuotaGb;
                return this;
            }

            /**
             * <p>The Tunnel parent resource group that is bound to the project. You do not need to pay attention to this group.</p>
             * 
             * <strong>example:</strong>
             * <p>No value</p>
             */
            public Builder elderTunnelQuota(String elderTunnelQuota) {
                this.elderTunnelQuota = elderTunnelQuota;
                return this;
            }

            /**
             * enableAutoMv.
             */
            public Builder enableAutoMv(Boolean enableAutoMv) {
                this.enableAutoMv = enableAutoMv;
                return this;
            }

            /**
             * <p>Indicates whether the DECIMAL type of the MaxCompute V2.0 data type edition is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableDecimal2(Boolean enableDecimal2) {
                this.enableDecimal2 = enableDecimal2;
                return this;
            }

            /**
             * enableDr.
             */
            public Builder enableDr(Boolean enableDr) {
                this.enableDr = enableDr;
                return this;
            }

            /**
             * <p>Indicates whether external table caching is forcefully enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableFdcCacheForce(Boolean enableFdcCacheForce) {
                this.enableFdcCacheForce = enableFdcCacheForce;
                return this;
            }

            /**
             * <p>Indicates whether <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/tiered-storage">tiered storage</a> is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableTieredStorage(Boolean enableTieredStorage) {
                this.enableTieredStorage = enableTieredStorage;
                return this;
            }

            /**
             * <p>Indicates whether the routing of the Tunnel resource group is enabled.</p>
             * <ul>
             * <li>true: The data transfer tasks that are submitted by the project by default use the Tunnel resource group that is bound to the project.</li>
             * <li>false: The data transfer tasks that are submitted by the project by default use the Tunnel shared resource group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableTunnelQuotaRoute(Boolean enableTunnelQuotaRoute) {
                this.enableTunnelQuotaRoute = enableTunnelQuotaRoute;
                return this;
            }

            /**
             * <p>The storage encryption properties.</p>
             */
            public Builder encryption(Encryption encryption) {
                this.encryption = encryption;
                return this;
            }

            /**
             * <p>The properties of the external project.</p>
             */
            public Builder externalProjectProperties(ExternalProjectProperties externalProjectProperties) {
                this.externalProjectProperties = externalProjectProperties;
                return this;
            }

            /**
             * <p>The quota for external table caching.</p>
             * 
             * <strong>example:</strong>
             * <p>fdc_quota</p>
             */
            public Builder fdcQuota(String fdcQuota) {
                this.fdcQuota = fdcQuota;
                return this;
            }

            /**
             * <p>The retention period for backup data. Unit: days. During the retention period, you can restore data of the version in use to the backup data of any version. Valid values: [0,30]. Default value: 1. The value 0 indicates that the backup feature is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder retentionDays(Long retentionDays) {
                this.retentionDays = retentionDays;
                return this;
            }

            /**
             * <p>The maximum consumption threshold of a single SQL statement. Formula: Amount of scanned data (GB) × Complexity.</p>
             * 
             * <strong>example:</strong>
             * <p>1500</p>
             */
            public Builder sqlMeteringMax(String sqlMeteringMax) {
                this.sqlMeteringMax = sqlMeteringMax;
                return this;
            }

            /**
             * <p>The <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/tiered-storage">storage tier</a> information.</p>
             */
            public Builder storageTierInfo(StorageTierInfo storageTierInfo) {
                this.storageTierInfo = storageTierInfo;
                return this;
            }

            /**
             * <p>The table lifecycle properties.</p>
             */
            public Builder tableLifecycle(TableLifecycle tableLifecycle) {
                this.tableLifecycle = tableLifecycle;
                return this;
            }

            /**
             * <p>The <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/tiered-storage#f61fc9db76nna">properties of tiered storage lifecycle rules</a>. After you configure the properties, the system triggers automatic switching of storage tiers based on the rules.</p>
             */
            public Builder tableLifecycleConfig(TableLifecycleConfig tableLifecycleConfig) {
                this.tableLifecycleConfig = tableLifecycleConfig;
                return this;
            }

            /**
             * <p>The time zone that is used by your project. The time zone is the same as the time zone specified by <code>odps.sql.timezone</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * <p>The <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/overview-of-dts">Tunnel</a> resource group that is bound to the project.</p>
             * <ul>
             * <li>Default resource group: The Tunnel shared resource group is used. You cannot use the subscription-based Tunnel resource group for the project. The default resource group is automatically used by the Tunnel service of your project, regardless of the parameter setting.</li>
             * <li>Subscription-based Tunnel resource group: You can use the subscription-based Tunnel resource group for the project.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Quota</p>
             */
            public Builder tunnelQuota(String tunnelQuota) {
                this.tunnelQuota = tunnelQuota;
                return this;
            }

            /**
             * <p>The data type edition. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: MaxCompute V1.0 data type edition</li>
             * <li><strong>2</strong>: MaxCompute V2.0 data type edition</li>
             * <li><strong>hive</strong>: Hive-compatible data type edition</li>
             * </ul>
             * <p>For more information about the differences among the three data type editions, see <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/data-type-editions">Data type editions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0</p>
             */
            public Builder typeSystem(String typeSystem) {
                this.typeSystem = typeSystem;
                return this;
            }

            public Properties build() {
                return new Properties(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProjectResponseBody} extends {@link TeaModel}
     *
     * <p>GetProjectResponseBody</p>
     */
    public static class SaleTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("resourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        private SaleTag(Builder builder) {
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaleTag create() {
            return builder().build();
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String resourceId; 
            private String resourceType; 

            /**
             * <p>The instance ID of the default computing quota.</p>
             * 
             * <strong>example:</strong>
             * <p>project_name</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The billing method of the default computing quota.</p>
             * 
             * <strong>example:</strong>
             * <p>project</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public SaleTag build() {
                return new SaleTag(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProjectResponseBody} extends {@link TeaModel}
     *
     * <p>GetProjectResponseBody</p>
     */
    public static class ProjectProtection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("exceptionPolicy")
        private String exceptionPolicy;

        @com.aliyun.core.annotation.NameInMap("protected")
        private Boolean _protected;

        private ProjectProtection(Builder builder) {
            this.exceptionPolicy = builder.exceptionPolicy;
            this._protected = builder._protected;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectProtection create() {
            return builder().build();
        }

        /**
         * @return exceptionPolicy
         */
        public String getExceptionPolicy() {
            return this.exceptionPolicy;
        }

        /**
         * @return _protected
         */
        public Boolean get_protected() {
            return this._protected;
        }

        public static final class Builder {
            private String exceptionPolicy; 
            private Boolean _protected; 

            /**
             * <p>If you enable the project data protection mechanism, you can configure exception or trusted projects. This allows specified users to transfer data of a specified object to a specified project. The project data protection mechanism does not take effect in all the situations that are specified in the exception policy.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;Version&quot;: &quot;1&quot;,
             *     &quot;Statement&quot;:
             *     [{
             *         &quot;Effect&quot;:&quot;Allow&quot;,
             *         &quot;Principal&quot;:&quot;<Principal>&quot;,
             *         &quot;Action&quot;:[&quot;odps:<Action1>[, <Action2>, ...]&quot;],
             *         &quot;Resource&quot;:&quot;acs:odps:*:<Resource>&quot;,
             *         &quot;Condition&quot;:{
             *             &quot;StringEquals&quot;: {
             *                 &quot;odps:TaskType&quot;:[&quot;<Tasktype>&quot;]
             *             }
             *         }
             *     }]
             *     }</p>
             */
            public Builder exceptionPolicy(String exceptionPolicy) {
                this.exceptionPolicy = exceptionPolicy;
                return this;
            }

            /**
             * <p>Indicates whether the <a href="https://www.alibabacloud.com/help/zh/maxcompute/security-and-compliance/project-data-protection">data protection mechanism</a> is enabled for the project. This allows or denies data transfer across projects. By default, the data protection mechanism is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder _protected(Boolean _protected) {
                this._protected = _protected;
                return this;
            }

            public ProjectProtection build() {
                return new ProjectProtection(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProjectResponseBody} extends {@link TeaModel}
     *
     * <p>GetProjectResponseBody</p>
     */
    public static class SecurityProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enableDownloadPrivilege")
        private Boolean enableDownloadPrivilege;

        @com.aliyun.core.annotation.NameInMap("labelSecurity")
        private Boolean labelSecurity;

        @com.aliyun.core.annotation.NameInMap("objectCreatorHasAccessPermission")
        private Boolean objectCreatorHasAccessPermission;

        @com.aliyun.core.annotation.NameInMap("objectCreatorHasGrantPermission")
        private Boolean objectCreatorHasGrantPermission;

        @com.aliyun.core.annotation.NameInMap("projectProtection")
        private ProjectProtection projectProtection;

        @com.aliyun.core.annotation.NameInMap("usingAcl")
        private Boolean usingAcl;

        @com.aliyun.core.annotation.NameInMap("usingPolicy")
        private Boolean usingPolicy;

        private SecurityProperties(Builder builder) {
            this.enableDownloadPrivilege = builder.enableDownloadPrivilege;
            this.labelSecurity = builder.labelSecurity;
            this.objectCreatorHasAccessPermission = builder.objectCreatorHasAccessPermission;
            this.objectCreatorHasGrantPermission = builder.objectCreatorHasGrantPermission;
            this.projectProtection = builder.projectProtection;
            this.usingAcl = builder.usingAcl;
            this.usingPolicy = builder.usingPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityProperties create() {
            return builder().build();
        }

        /**
         * @return enableDownloadPrivilege
         */
        public Boolean getEnableDownloadPrivilege() {
            return this.enableDownloadPrivilege;
        }

        /**
         * @return labelSecurity
         */
        public Boolean getLabelSecurity() {
            return this.labelSecurity;
        }

        /**
         * @return objectCreatorHasAccessPermission
         */
        public Boolean getObjectCreatorHasAccessPermission() {
            return this.objectCreatorHasAccessPermission;
        }

        /**
         * @return objectCreatorHasGrantPermission
         */
        public Boolean getObjectCreatorHasGrantPermission() {
            return this.objectCreatorHasGrantPermission;
        }

        /**
         * @return projectProtection
         */
        public ProjectProtection getProjectProtection() {
            return this.projectProtection;
        }

        /**
         * @return usingAcl
         */
        public Boolean getUsingAcl() {
            return this.usingAcl;
        }

        /**
         * @return usingPolicy
         */
        public Boolean getUsingPolicy() {
            return this.usingPolicy;
        }

        public static final class Builder {
            private Boolean enableDownloadPrivilege; 
            private Boolean labelSecurity; 
            private Boolean objectCreatorHasAccessPermission; 
            private Boolean objectCreatorHasGrantPermission; 
            private ProjectProtection projectProtection; 
            private Boolean usingAcl; 
            private Boolean usingPolicy; 

            /**
             * <p>Indicates whether the <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/label-based-access-control">download control</a> feature is enabled. By default, this feature is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableDownloadPrivilege(Boolean enableDownloadPrivilege) {
                this.enableDownloadPrivilege = enableDownloadPrivilege;
                return this;
            }

            /**
             * <p>Indicates whether the <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/label-based-access-control">label-based access control</a> feature is enabled. By default, this feature is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder labelSecurity(Boolean labelSecurity) {
                this.labelSecurity = labelSecurity;
                return this;
            }

            /**
             * <p>Indicates whether to allow the object creator to have the access permissions on the object. The default value is true, which indicates that the object creator has the access permissions on the object.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder objectCreatorHasAccessPermission(Boolean objectCreatorHasAccessPermission) {
                this.objectCreatorHasAccessPermission = objectCreatorHasAccessPermission;
                return this;
            }

            /**
             * <p>Indicates whether the object creator has the authorization permissions on the object. The default value is true, which indicates that the object creator has the authorization permissions on the object.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder objectCreatorHasGrantPermission(Boolean objectCreatorHasGrantPermission) {
                this.objectCreatorHasGrantPermission = objectCreatorHasGrantPermission;
                return this;
            }

            /**
             * <p>The properties of the <a href="https://www.alibabacloud.com/help/zh/maxcompute/security-and-compliance/project-data-protection">data protection mechanism</a>.</p>
             */
            public Builder projectProtection(ProjectProtection projectProtection) {
                this.projectProtection = projectProtection;
                return this;
            }

            /**
             * <p>Indicates whether the <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/acl-based-access-control">ACL-based access control</a> feature is enabled. By default, this feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder usingAcl(Boolean usingAcl) {
                this.usingAcl = usingAcl;
                return this;
            }

            /**
             * <p>Indicates whether the <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/policy-based-access-control-1">policy-based access control</a> feature is enabled. By default, this feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder usingPolicy(Boolean usingPolicy) {
                this.usingPolicy = usingPolicy;
                return this;
            }

            public SecurityProperties build() {
                return new SecurityProperties(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProjectResponseBody} extends {@link TeaModel}
     *
     * <p>GetProjectResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("costStorage")
        private String costStorage;

        @com.aliyun.core.annotation.NameInMap("createdTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("defaultQuota")
        private String defaultQuota;

        @com.aliyun.core.annotation.NameInMap("ipWhiteList")
        private IpWhiteList ipWhiteList;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("productType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("properties")
        private Properties properties;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("saleTag")
        private SaleTag saleTag;

        @com.aliyun.core.annotation.NameInMap("securityProperties")
        private SecurityProperties securityProperties;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("superAdmins")
        private java.util.List<String> superAdmins;

        @com.aliyun.core.annotation.NameInMap("threeTierModel")
        private Boolean threeTierModel;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Data(Builder builder) {
            this.comment = builder.comment;
            this.costStorage = builder.costStorage;
            this.createdTime = builder.createdTime;
            this.defaultQuota = builder.defaultQuota;
            this.ipWhiteList = builder.ipWhiteList;
            this.name = builder.name;
            this.owner = builder.owner;
            this.productType = builder.productType;
            this.properties = builder.properties;
            this.regionId = builder.regionId;
            this.saleTag = builder.saleTag;
            this.securityProperties = builder.securityProperties;
            this.status = builder.status;
            this.superAdmins = builder.superAdmins;
            this.threeTierModel = builder.threeTierModel;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return costStorage
         */
        public String getCostStorage() {
            return this.costStorage;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return defaultQuota
         */
        public String getDefaultQuota() {
            return this.defaultQuota;
        }

        /**
         * @return ipWhiteList
         */
        public IpWhiteList getIpWhiteList() {
            return this.ipWhiteList;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return properties
         */
        public Properties getProperties() {
            return this.properties;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return saleTag
         */
        public SaleTag getSaleTag() {
            return this.saleTag;
        }

        /**
         * @return securityProperties
         */
        public SecurityProperties getSecurityProperties() {
            return this.securityProperties;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return superAdmins
         */
        public java.util.List<String> getSuperAdmins() {
            return this.superAdmins;
        }

        /**
         * @return threeTierModel
         */
        public Boolean getThreeTierModel() {
            return this.threeTierModel;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String comment; 
            private String costStorage; 
            private Long createdTime; 
            private String defaultQuota; 
            private IpWhiteList ipWhiteList; 
            private String name; 
            private String owner; 
            private String productType; 
            private Properties properties; 
            private String regionId; 
            private SaleTag saleTag; 
            private SecurityProperties securityProperties; 
            private String status; 
            private java.util.List<String> superAdmins; 
            private Boolean threeTierModel; 
            private String type; 

            /**
             * <p>The project description.</p>
             * 
             * <strong>example:</strong>
             * <p>maxcompute project</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The total storage usage. The storage space that is occupied by your project, which is the logical storage space after your project data is collected and compressed.</p>
             * 
             * <strong>example:</strong>
             * <p>16489027</p>
             */
            public Builder costStorage(String costStorage) {
                this.costStorage = costStorage;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1704380838000</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The default computing quota that is used to allocate computing resources. If you do not specify a computing quota for your project, the jobs that are initiated by your project consume the computing resources in the default quota. For more information about how to use computing resources, see <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/use-of-computing-resources">Use quota groups for computing resources</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>quota_a</p>
             */
            public Builder defaultQuota(String defaultQuota) {
                this.defaultQuota = defaultQuota;
                return this;
            }

            /**
             * <p>The information about the IP address whitelist.</p>
             */
            public Builder ipWhiteList(IpWhiteList ipWhiteList) {
                this.ipWhiteList = ipWhiteList;
                return this;
            }

            /**
             * <p>The project name.</p>
             * 
             * <strong>example:</strong>
             * <p>odps_project</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The account information of the project owner.</p>
             * 
             * <strong>example:</strong>
             * <p>1565950907343451</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The billing method of the default computing quota.</p>
             * 
             * <strong>example:</strong>
             * <p>PayAsYouGo</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The basic properties of the project.</p>
             */
            public Builder properties(Properties properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The instance ID and billing method of the default computing quota.</p>
             */
            public Builder saleTag(SaleTag saleTag) {
                this.saleTag = saleTag;
                return this;
            }

            /**
             * <p>The permission properties.</p>
             */
            public Builder securityProperties(SecurityProperties securityProperties) {
                this.securityProperties = securityProperties;
                return this;
            }

            /**
             * <p>The project status. Valid values:</p>
             * <ul>
             * <li><strong>AVAILABLE</strong></li>
             * <li><strong>READONLY</strong></li>
             * <li><strong>FROZEN</strong></li>
             * <li><strong>DELETING</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AVAILABLE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The list of <code>Super_Administrator</code> role members of the project.</p>
             */
            public Builder superAdmins(java.util.List<String> superAdmins) {
                this.superAdmins = superAdmins;
                return this;
            }

            /**
             * <p>Indicates whether data storage by schema is supported. MaxCompute supports the schema feature. This feature allows you to classify objects such as tables, resources, and user-defined functions (UDFs) in a project by schema. You can create multiple schemas in a project. For more information, see <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/schema-related-operations">Schema-related operations</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder threeTierModel(Boolean threeTierModel) {
                this.threeTierModel = threeTierModel;
                return this;
            }

            /**
             * <p>The project type. Valid values:</p>
             * <ul>
             * <li><strong>managed</strong>: internal project</li>
             * <li><strong>external</strong>: external project</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>managed</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
