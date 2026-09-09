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

        private Builder() {
        } 

        private Builder(GetProjectResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.httpCode = model.httpCode;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>OBJECT_NOT_EXIST</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>This object does not exist.</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * <ul>
         * <li>1xx: Informational response - The request has been received and is being processed.</li>
         * <li>2xx: Success - The request has been successfully received, understood, and accepted by the server.</li>
         * <li>3xx: Redirection - The request has been redirected. Further action is required to complete the request.</li>
         * <li>4xx: Client error - The request contains incorrect parameters, syntax errors, or specific request conditions cannot be met.</li>
         * <li>5xx: Server error - The server is unable to fulfill the request due to other reasons.</li>
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

            private Builder() {
            } 

            private Builder(IpWhiteList model) {
                this.ipList = model.ipList;
                this.vpcIpList = model.vpcIpList;
            } 

            /**
             * <p>The IP whitelist for public network and cloud product interconnection network.</p>
             * <blockquote>
             * <p>If only the public network and cloud product interconnection network IP whitelist is configured, access through the public network and cloud product interconnection network is restricted by the configuration, and all VPC network access is prohibited.</p>
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
             * <p>The VPC network IP whitelist.</p>
             * <blockquote>
             * <p>If only the VPC network IP whitelist is configured, VPC network access is restricted by the configuration, and all public network and cloud product interconnection network access is prohibited.</p>
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

            private Builder() {
            } 

            private Builder(Encryption model) {
                this.algorithm = model.algorithm;
                this.enable = model.enable;
                this.key = model.key;
            } 

            /**
             * <p>The data encryption algorithm. Supported encryption algorithms include AES256, AESCTR, and RC4.</p>
             * 
             * <strong>example:</strong>
             * <p>AES256</p>
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * <p>Whether data encryption is enabled for the project. For more information about data encryption, see
             * &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/security-and-compliance/storage-encryption">Storage Encryption</a>
             * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/security-and-compliance/storage-encryption">Storage Encryption</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The key type used for data encryption, including the default key (MaxCompute Default Key) and Bring Your Own Key (BYOK). The default key (MaxCompute Default Key) is created internally by MaxCompute.</p>
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
        @com.aliyun.core.annotation.NameInMap("externalCatalogId")
        private String externalCatalogId;

        @com.aliyun.core.annotation.NameInMap("foreignServerName")
        private String foreignServerName;

        @com.aliyun.core.annotation.NameInMap("foreignServerType")
        private String foreignServerType;

        @com.aliyun.core.annotation.NameInMap("isExternalCatalogBound")
        private String isExternalCatalogBound;

        @com.aliyun.core.annotation.NameInMap("tableFormat")
        private String tableFormat;

        @com.aliyun.core.annotation.NameInMap("warehouse")
        private String warehouse;

        private ExternalProjectProperties(Builder builder) {
            this.externalCatalogId = builder.externalCatalogId;
            this.foreignServerName = builder.foreignServerName;
            this.foreignServerType = builder.foreignServerType;
            this.isExternalCatalogBound = builder.isExternalCatalogBound;
            this.tableFormat = builder.tableFormat;
            this.warehouse = builder.warehouse;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExternalProjectProperties create() {
            return builder().build();
        }

        /**
         * @return externalCatalogId
         */
        public String getExternalCatalogId() {
            return this.externalCatalogId;
        }

        /**
         * @return foreignServerName
         */
        public String getForeignServerName() {
            return this.foreignServerName;
        }

        /**
         * @return foreignServerType
         */
        public String getForeignServerType() {
            return this.foreignServerType;
        }

        /**
         * @return isExternalCatalogBound
         */
        public String getIsExternalCatalogBound() {
            return this.isExternalCatalogBound;
        }

        /**
         * @return tableFormat
         */
        public String getTableFormat() {
            return this.tableFormat;
        }

        /**
         * @return warehouse
         */
        public String getWarehouse() {
            return this.warehouse;
        }

        public static final class Builder {
            private String externalCatalogId; 
            private String foreignServerName; 
            private String foreignServerType; 
            private String isExternalCatalogBound; 
            private String tableFormat; 
            private String warehouse; 

            private Builder() {
            } 

            private Builder(ExternalProjectProperties model) {
                this.externalCatalogId = model.externalCatalogId;
                this.foreignServerName = model.foreignServerName;
                this.foreignServerType = model.foreignServerType;
                this.isExternalCatalogBound = model.isExternalCatalogBound;
                this.tableFormat = model.tableFormat;
                this.warehouse = model.warehouse;
            } 

            /**
             * externalCatalogId.
             */
            public Builder externalCatalogId(String externalCatalogId) {
                this.externalCatalogId = externalCatalogId;
                return this;
            }

            /**
             * foreignServerName.
             */
            public Builder foreignServerName(String foreignServerName) {
                this.foreignServerName = foreignServerName;
                return this;
            }

            /**
             * foreignServerType.
             */
            public Builder foreignServerType(String foreignServerType) {
                this.foreignServerType = foreignServerType;
                return this;
            }

            /**
             * <p>Whether this is a &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/user-guide/lake-warehouse-integrated-2-0-use-guide">Lakehouse 2.0</a>
             * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/lake-warehouse-integrated-2-0-use-guide">Lakehouse 2.0</a> external project.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isExternalCatalogBound(String isExternalCatalogBound) {
                this.isExternalCatalogBound = isExternalCatalogBound;
                return this;
            }

            /**
             * tableFormat.
             */
            public Builder tableFormat(String tableFormat) {
                this.tableFormat = tableFormat;
                return this;
            }

            /**
             * warehouse.
             */
            public Builder warehouse(String warehouse) {
                this.warehouse = warehouse;
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

            private Builder() {
            } 

            private Builder(StorageTierSize model) {
                this.longTermSize = model.longTermSize;
                this.lowFrequencySize = model.lowFrequencySize;
                this.standardSize = model.standardSize;
            } 

            /**
             * <p>The long-term storage usage.</p>
             * 
             * <strong>example:</strong>
             * <p>21764917</p>
             */
            public Builder longTermSize(Long longTermSize) {
                this.longTermSize = longTermSize;
                return this;
            }

            /**
             * <p>The infrequent access storage usage.</p>
             * 
             * <strong>example:</strong>
             * <p>767693</p>
             */
            public Builder lowFrequencySize(Long lowFrequencySize) {
                this.lowFrequencySize = lowFrequencySize;
                return this;
            }

            /**
             * <p>The standard storage usage.</p>
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

            private Builder() {
            } 

            private Builder(StorageTierInfo model) {
                this.projectBackupSize = model.projectBackupSize;
                this.projectTotalSize = model.projectTotalSize;
                this.storageTierSize = model.storageTierSize;
            } 

            /**
             * <p>The backup storage size.</p>
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
             * <p>The &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/user-guide/tiered-storage">tiered storage</a>
             * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/tiered-storage">tiered storage</a> information.</p>
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

            private Builder() {
            } 

            private Builder(TableLifecycle model) {
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The lifecycle type. Valid values:</p>
             * <ul>
             * <li><strong>mandatory</strong>: The Lifecycle clause is mandatory. Users must set the table lifecycle.</li>
             * <li><strong>optional</strong>: The Lifecycle clause is optional when creating a table. If the table lifecycle is not set, the table is permanently valid.</li>
             * <li><strong>inherit</strong>: If the table lifecycle is not set when creating a table, the table lifecycle defaults to the value of odps.table.lifecycle.value.</li>
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
             * <p>The table lifecycle in days. Valid values: 1 to 37231. Default value: 37231.</p>
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

            private Builder() {
            } 

            private Builder(TierToLongterm model) {
                this.daysAfterLastAccessGreaterThan = model.daysAfterLastAccessGreaterThan;
                this.daysAfterLastModificationGreaterThan = model.daysAfterLastModificationGreaterThan;
                this.daysAfterLastTierModificationGreaterThan = model.daysAfterLastTierModificationGreaterThan;
            } 

            /**
             * <p>The number of days after the last data access before automatic conversion, corresponding to the <code>LastAccessTime</code> of the table or partition.</p>
             * <blockquote>
             * <p>If the LastAccessTime of the table or partition is empty:</p>
             * <ul>
             * <li>For tables or partitions created before October 1, 2023, the default time is 2023.10.01 00:00:00 in the UTC+0 timezone.</li>
             * <li>For tables or partitions created after October 1, 2023, if the data has not been accessed, the CreateTime is used for calculation.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>180</p>
             */
            public Builder daysAfterLastAccessGreaterThan(Long daysAfterLastAccessGreaterThan) {
                this.daysAfterLastAccessGreaterThan = daysAfterLastAccessGreaterThan;
                return this;
            }

            /**
             * <p>The number of days after the last data modification before automatic conversion, corresponding to the <code>LastModifiedTime</code> of the table or partition.</p>
             * 
             * <strong>example:</strong>
             * <p>180</p>
             */
            public Builder daysAfterLastModificationGreaterThan(Long daysAfterLastModificationGreaterThan) {
                this.daysAfterLastModificationGreaterThan = daysAfterLastModificationGreaterThan;
                return this;
            }

            /**
             * <p>The number of days since the last storage tier conversion.</p>
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

            private Builder() {
            } 

            private Builder(TierToLowFrequency model) {
                this.daysAfterLastAccessGreaterThan = model.daysAfterLastAccessGreaterThan;
                this.daysAfterLastModificationGreaterThan = model.daysAfterLastModificationGreaterThan;
                this.daysAfterLastTierModificationGreaterThan = model.daysAfterLastTierModificationGreaterThan;
            } 

            /**
             * <p>The number of days after the last data access before automatic conversion, corresponding to the <code>LastAccessTime</code> of the table or partition.</p>
             * <blockquote>
             * <p>If the LastAccessTime of the table or partition is empty:</p>
             * <ul>
             * <li>For tables or partitions created before October 1, 2023, the default time is 2023.10.01 00:00:00 in the UTC+0 timezone.</li>
             * <li>For tables or partitions created after October 1, 2023, if the data has not been accessed, the CreateTime is used for calculation.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder daysAfterLastAccessGreaterThan(Long daysAfterLastAccessGreaterThan) {
                this.daysAfterLastAccessGreaterThan = daysAfterLastAccessGreaterThan;
                return this;
            }

            /**
             * <p>The number of days after the last data modification before automatic conversion, corresponding to the <code>LastModifiedTime</code> of the table or partition.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder daysAfterLastModificationGreaterThan(Long daysAfterLastModificationGreaterThan) {
                this.daysAfterLastModificationGreaterThan = daysAfterLastModificationGreaterThan;
                return this;
            }

            /**
             * <p>The number of days since the last storage tier conversion.</p>
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

            private Builder() {
            } 

            private Builder(TableLifecycleConfig model) {
                this.tierToLongterm = model.tierToLongterm;
                this.tierToLowFrequency = model.tierToLowFrequency;
            } 

            /**
             * <p>The long-term storage identifier.</p>
             */
            public Builder tierToLongterm(TierToLongterm tierToLongterm) {
                this.tierToLongterm = tierToLongterm;
                return this;
            }

            /**
             * <p>The infrequent access storage identifier.</p>
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

        @com.aliyun.core.annotation.NameInMap("enableDataMasking")
        private Boolean enableDataMasking;

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
            this.enableDataMasking = builder.enableDataMasking;
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
         * @return enableDataMasking
         */
        public Boolean getEnableDataMasking() {
            return this.enableDataMasking;
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
            private Boolean enableDataMasking; 
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

            private Builder() {
            } 

            private Builder(Properties model) {
                this.allowFullScan = model.allowFullScan;
                this.autoMvQuotaGb = model.autoMvQuotaGb;
                this.elderTunnelQuota = model.elderTunnelQuota;
                this.enableAutoMv = model.enableAutoMv;
                this.enableDataMasking = model.enableDataMasking;
                this.enableDecimal2 = model.enableDecimal2;
                this.enableDr = model.enableDr;
                this.enableFdcCacheForce = model.enableFdcCacheForce;
                this.enableTieredStorage = model.enableTieredStorage;
                this.enableTunnelQuotaRoute = model.enableTunnelQuotaRoute;
                this.encryption = model.encryption;
                this.externalProjectProperties = model.externalProjectProperties;
                this.fdcQuota = model.fdcQuota;
                this.retentionDays = model.retentionDays;
                this.sqlMeteringMax = model.sqlMeteringMax;
                this.storageTierInfo = model.storageTierInfo;
                this.tableLifecycle = model.tableLifecycle;
                this.tableLifecycleConfig = model.tableLifecycleConfig;
                this.timezone = model.timezone;
                this.tunnelQuota = model.tunnelQuota;
                this.typeSystem = model.typeSystem;
            } 

            /**
             * <p>Whether full table scans are allowed in the project. Full table scans consume significant resources, so this feature is disabled by default to improve processing efficiency.</p>
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
             * <p>The parent group of the Data Transfer Service resource group bound to the project (can be ignored).</p>
             * 
             * <strong>example:</strong>
             * <p>Default_p</p>
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
             * enableDataMasking.
             */
            public Builder enableDataMasking(Boolean enableDataMasking) {
                this.enableDataMasking = enableDataMasking;
                return this;
            }

            /**
             * <p>Whether the MaxCompute 2.0 Decimal data type is enabled for the project.</p>
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
             * <p>Whether to force enable external table caching.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableFdcCacheForce(Boolean enableFdcCacheForce) {
                this.enableFdcCacheForce = enableFdcCacheForce;
                return this;
            }

            /**
             * <p>Whether &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/user-guide/tiered-storage">tiered storage</a>
             * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/tiered-storage">tiered storage</a> is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableTieredStorage(Boolean enableTieredStorage) {
                this.enableTieredStorage = enableTieredStorage;
                return this;
            }

            /**
             * <p>Whether the Data Transfer Service resource group routing is enabled.</p>
             * <ul>
             * <li>true: Data Transfer Service tasks submitted by this project will use the bound Data Transfer Service resource group by default.</li>
             * <li>false: Data Transfer Service tasks submitted by this project will use the Data Transfer Service shared resource group by default.</li>
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
             * <p>The external project properties.</p>
             */
            public Builder externalProjectProperties(ExternalProjectProperties externalProjectProperties) {
                this.externalProjectProperties = externalProjectProperties;
                return this;
            }

            /**
             * <p>The external table cache quota.</p>
             * 
             * <strong>example:</strong>
             * <p>fdc_quota</p>
             */
            public Builder fdcQuota(String fdcQuota) {
                this.fdcQuota = fdcQuota;
                return this;
            }

            /**
             * <p>The number of days to retain backup data. During this period, you can restore the current version to any backed-up data version.
             * Valid values: [0, 30]. Default value: 1. A value of 0 indicates that the backup feature is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder retentionDays(Long retentionDays) {
                this.retentionDays = retentionDays;
                return this;
            }

            /**
             * <p>The maximum threshold for single SQL consumption.
             * Unit: scan volume (GB) × complexity.</p>
             * 
             * <strong>example:</strong>
             * <p>1500</p>
             */
            public Builder sqlMeteringMax(String sqlMeteringMax) {
                this.sqlMeteringMax = sqlMeteringMax;
                return this;
            }

            /**
             * <p>The &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/user-guide/tiered-storage">tiered storage</a>
             * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/tiered-storage">tiered storage</a> information.</p>
             */
            public Builder storageTierInfo(StorageTierInfo storageTierInfo) {
                this.storageTierInfo = storageTierInfo;
                return this;
            }

            /**
             * <p>The lifecycle properties of tables.</p>
             */
            public Builder tableLifecycle(TableLifecycle tableLifecycle) {
                this.tableLifecycle = tableLifecycle;
                return this;
            }

            /**
             * <p>The &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/user-guide/tiered-storage#f61fc9db76nna">tiered storage lifecycle rules</a>
             * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/tiered-storage#f61fc9db76nna">tiered storage lifecycle rules</a> properties. After configuration, the system will trigger automatic storage tier conversion based on these rules.</p>
             */
            public Builder tableLifecycleConfig(TableLifecycleConfig tableLifecycleConfig) {
                this.tableLifecycleConfig = tableLifecycleConfig;
                return this;
            }

            /**
             * <p>The project timezone, which is the <code>odps.sql.timezone</code> property.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * <p>The &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/user-guide/overview-of-dts">Data Transfer Service</a>
             * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/overview-of-dts">Data Transfer Service</a> resource group bound to the project.</p>
             * <ul>
             * <li><p>Default (Data Transfer Service shared resource group): This project is not allowed to use the Data Transfer Service (subscription) resource group. Regardless of the default Data Transfer Service resource group setting, Data Transfer Service tasks submitted by this project will automatically use the Default resource group.</p>
             * </li>
             * <li><p>Data Transfer Service (subscription) resource group: This project is allowed to use the Data Transfer Service (subscription) resource group.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder tunnelQuota(String tunnelQuota) {
                this.tunnelQuota = tunnelQuota;
                return this;
            }

            /**
             * <p>The data type edition. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Edition 1.0.</li>
             * <li><strong>2</strong>: Edition 2.0.</li>
             * <li><strong>hive</strong>: Hive-compatible type.</li>
             * </ul>
             * <p>For differences among the three data type editions, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/user-guide/data-type-editions">Data Type Editions</a>
             * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/data-type-editions">Data Type Editions</a>.</p>
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

            private Builder() {
            } 

            private Builder(SaleTag model) {
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The instance ID of the default computing quota.</p>
             * 
             * <strong>example:</strong>
             * <p>b7afb7d1-<strong><strong>-</strong></strong>-****-c393669c307b</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The billing type of the default computing quota.</p>
             * 
             * <strong>example:</strong>
             * <p>PayAsYouGo</p>
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

            private Builder() {
            } 

            private Builder(ProjectProtection model) {
                this.exceptionPolicy = model.exceptionPolicy;
                this._protected = model._protected;
            } 

            /**
             * <p>If project data protection is enabled, you can set exceptions or trusted projects to allow specified users to export data of specified objects to specified projects. All scenarios described in the Exception Policy can override the data protection mechanism.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;Version&quot;: &quot;1&quot;,
             *       &quot;Statement&quot;: [
             *             {
             *                   &quot;Effect&quot;: &quot;Allow&quot;,
             *                   &quot;Principal&quot;: &quot;&quot;,
             *                   &quot;Action&quot;: [
             *                         &quot;odps:[, , ...]&quot;
             *                   ],
             *                   &quot;Resource&quot;: &quot;acs:odps:*:&quot;,
             *                   &quot;Condition&quot;: {
             *                         &quot;StringEquals&quot;: {
             *                               &quot;odps:TaskType&quot;: [
             *                                     &quot;&quot;
             *                               ]
             *                         }
             *                   }
             *             }
             *       ]
             * }</p>
             */
            public Builder exceptionPolicy(String exceptionPolicy) {
                this.exceptionPolicy = exceptionPolicy;
                return this;
            }

            /**
             * <p>Whether the project &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/security-and-compliance/project-data-protection">data protection mechanism</a>
             * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/security-and-compliance/project-data-protection">data protection mechanism</a> is enabled to prohibit or allow data to flow out of the project. It is disabled by default.</p>
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

            private Builder() {
            } 

            private Builder(SecurityProperties model) {
                this.enableDownloadPrivilege = model.enableDownloadPrivilege;
                this.labelSecurity = model.labelSecurity;
                this.objectCreatorHasAccessPermission = model.objectCreatorHasAccessPermission;
                this.objectCreatorHasGrantPermission = model.objectCreatorHasGrantPermission;
                this.projectProtection = model.projectProtection;
                this.usingAcl = model.usingAcl;
                this.usingPolicy = model.usingPolicy;
            } 

            /**
             * <p>Whether the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/user-guide/download-control">download control</a>
             * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/label-based-access-control">download control</a> feature is enabled. It is disabled by default.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableDownloadPrivilege(Boolean enableDownloadPrivilege) {
                this.enableDownloadPrivilege = enableDownloadPrivilege;
                return this;
            }

            /**
             * <p>Whether the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/user-guide/label-based-access-control">label-based access control</a>
             * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/label-based-access-control">label-based access control</a> feature is enabled. It is disabled by default.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder labelSecurity(Boolean labelSecurity) {
                this.labelSecurity = labelSecurity;
                return this;
            }

            /**
             * <p>Whether the object creator is allowed to have access permissions on the object. This is allowed by default.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder objectCreatorHasAccessPermission(Boolean objectCreatorHasAccessPermission) {
                this.objectCreatorHasAccessPermission = objectCreatorHasAccessPermission;
                return this;
            }

            /**
             * <p>Whether the object creator is allowed to have grant permissions on the object. This is allowed by default.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder objectCreatorHasGrantPermission(Boolean objectCreatorHasGrantPermission) {
                this.objectCreatorHasGrantPermission = objectCreatorHasGrantPermission;
                return this;
            }

            /**
             * <p>The &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/security-and-compliance/project-data-protection">data protection</a>
             * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/security-and-compliance/project-data-protection">data protection</a> properties.</p>
             */
            public Builder projectProtection(ProjectProtection projectProtection) {
                this.projectProtection = projectProtection;
                return this;
            }

            /**
             * <p>Whether the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/user-guide/acl-based-access-control">ACL-based access control</a>
             * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/acl-based-access-control">ACL-based access control</a> feature is enabled. It is enabled by default.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder usingAcl(Boolean usingAcl) {
                this.usingAcl = usingAcl;
                return this;
            }

            /**
             * <p>Whether the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/user-guide/policy-based-access-control-1">policy-based access control</a>
             * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/policy-based-access-control-1">policy-based access control</a> feature is enabled. It is enabled by default.</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.comment = model.comment;
                this.costStorage = model.costStorage;
                this.createdTime = model.createdTime;
                this.defaultQuota = model.defaultQuota;
                this.ipWhiteList = model.ipWhiteList;
                this.name = model.name;
                this.owner = model.owner;
                this.productType = model.productType;
                this.properties = model.properties;
                this.regionId = model.regionId;
                this.saleTag = model.saleTag;
                this.securityProperties = model.securityProperties;
                this.status = model.status;
                this.superAdmins = model.superAdmins;
                this.threeTierModel = model.threeTierModel;
                this.type = model.type;
            } 

            /**
             * <p>The project description.</p>
             * 
             * <strong>example:</strong>
             * <p>BI_Analysis</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The total storage size.
             * Views the current storage size of the project. This storage size is consistent with the metering caliber, which is the logical storage size after compression at the Project level.</p>
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
             * <p>The default computing quota.
             * Used to allocate computing resources. If no computing quota is specified, jobs initiated by this project will consume resources from the default quota. For more information about computing resource usage, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/user-guide/use-of-computing-resources">Computing Resources - Quota Usage</a>
             * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/use-of-computing-resources">Computing Resources - Quota Usage</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>os_PayAsYouGoQuota</p>
             */
            public Builder defaultQuota(String defaultQuota) {
                this.defaultQuota = defaultQuota;
                return this;
            }

            /**
             * <p>The IP whitelist.</p>
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
             * <p>ALIYUN$odps****@aliyunid.com</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The billing mode of the default computing quota.</p>
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
             * <p>The instance ID and billing type of the default computing quota.</p>
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
             * <li><strong>AVAILABLE</strong>: normal.</li>
             * <li><strong>READONLY</strong>: read-only.</li>
             * <li><strong>FROZEN</strong>: frozen.</li>
             * <li><strong>DELETING</strong>: being deleted.</li>
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
             * <p>The list of members with the <code>Super_Administrator</code> role in the project.</p>
             */
            public Builder superAdmins(java.util.List<String> superAdmins) {
                this.superAdmins = superAdmins;
                return this;
            }

            /**
             * <p>Whether schema-based storage is supported.
             * MaxCompute supports Schema, which is an object between Project and Table/Resource/UDF for categorizing Tables, Resources, and UDFs. A Project can contain multiple Schemas. For more information, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/user-guide/schema-related-operations">Schema Operations</a>
             * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/schema-related-operations">Schema Operations</a>.</p>
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
             * <li><strong>managed</strong>: internal project.</li>
             * <li><strong>external</strong>: external project.</li>
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
