// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * Indicates whether the request was successful. If this parameter was not empty and the value of this parameter was not 200, the request failed.
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProjectResponseBody build() {
            return new GetProjectResponseBody(this);
        } 

    } 

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
             * The list of IP addresses.
             */
            public Builder ipList(String ipList) {
                this.ipList = ipList;
                return this;
            }

            /**
             * The list of virtual private cloud (VPC) IP addresses.
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
             * The name of the encryption algorithm.
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * Indicates whether data encryption is enabled. Valid values: true and false.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The key of the encryption algorithm.
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
             * The long-term storage.
             */
            public Builder longTermSize(Long longTermSize) {
                this.longTermSize = longTermSize;
                return this;
            }

            /**
             * The IA storage.
             */
            public Builder lowFrequencySize(Long lowFrequencySize) {
                this.lowFrequencySize = lowFrequencySize;
                return this;
            }

            /**
             * The standard storage.
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
             * The backup storage.
             */
            public Builder projectBackupSize(Long projectBackupSize) {
                this.projectBackupSize = projectBackupSize;
                return this;
            }

            /**
             * The total storage.
             */
            public Builder projectTotalSize(Long projectTotalSize) {
                this.projectTotalSize = projectTotalSize;
                return this;
            }

            /**
             * The tiered storage.
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
             * The type of the lifecycle. Valid values: -**mandatory**: The lifecycle clause is required. You must configure a lifecycle for a table. -**optional**: The lifecycle clause is optional in a table creation statement. If you do not configure a lifecycle for a table, the table does not expire. -**inherit**: If you do not configure a lifecycle for a table when you create the table, the value of the odps.table.lifecycle.value parameter is used by default.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The retention period of a table. Unit: days.
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
    public static class DaysAfterLastAccessGreaterThan extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("conditionCode")
        private String conditionCode;

        @com.aliyun.core.annotation.NameInMap("value")
        private Long value;

        private DaysAfterLastAccessGreaterThan(Builder builder) {
            this.conditionCode = builder.conditionCode;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DaysAfterLastAccessGreaterThan create() {
            return builder().build();
        }

        /**
         * @return conditionCode
         */
        public String getConditionCode() {
            return this.conditionCode;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String conditionCode; 
            private Long value; 

            /**
             * conditionCode.
             */
            public Builder conditionCode(String conditionCode) {
                this.conditionCode = conditionCode;
                return this;
            }

            /**
             * The retention period of a table. Unit: days.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public DaysAfterLastAccessGreaterThan build() {
                return new DaysAfterLastAccessGreaterThan(this);
            } 

        } 

    }
    public static class DaysAfterLastModificationGreaterThan extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("conditionCode")
        private String conditionCode;

        @com.aliyun.core.annotation.NameInMap("value")
        private Long value;

        private DaysAfterLastModificationGreaterThan(Builder builder) {
            this.conditionCode = builder.conditionCode;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DaysAfterLastModificationGreaterThan create() {
            return builder().build();
        }

        /**
         * @return conditionCode
         */
        public String getConditionCode() {
            return this.conditionCode;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String conditionCode; 
            private Long value; 

            /**
             * conditionCode.
             */
            public Builder conditionCode(String conditionCode) {
                this.conditionCode = conditionCode;
                return this;
            }

            /**
             * The retention period of a table. Unit: days.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public DaysAfterLastModificationGreaterThan build() {
                return new DaysAfterLastModificationGreaterThan(this);
            } 

        } 

    }
    public static class DaysAfterLastTierModificationGreaterThan extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("conditionCode")
        private String conditionCode;

        @com.aliyun.core.annotation.NameInMap("value")
        private Long value;

        private DaysAfterLastTierModificationGreaterThan(Builder builder) {
            this.conditionCode = builder.conditionCode;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DaysAfterLastTierModificationGreaterThan create() {
            return builder().build();
        }

        /**
         * @return conditionCode
         */
        public String getConditionCode() {
            return this.conditionCode;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String conditionCode; 
            private Long value; 

            /**
             * conditionCode.
             */
            public Builder conditionCode(String conditionCode) {
                this.conditionCode = conditionCode;
                return this;
            }

            /**
             * The retention period of a table. Unit: days.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public DaysAfterLastTierModificationGreaterThan build() {
                return new DaysAfterLastTierModificationGreaterThan(this);
            } 

        } 

    }
    public static class TierToLongterm extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("daysAfterLastAccessGreaterThan")
        private DaysAfterLastAccessGreaterThan daysAfterLastAccessGreaterThan;

        @com.aliyun.core.annotation.NameInMap("daysAfterLastModificationGreaterThan")
        private DaysAfterLastModificationGreaterThan daysAfterLastModificationGreaterThan;

        @com.aliyun.core.annotation.NameInMap("daysAfterLastTierModificationGreaterThan")
        private DaysAfterLastTierModificationGreaterThan daysAfterLastTierModificationGreaterThan;

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
        public DaysAfterLastAccessGreaterThan getDaysAfterLastAccessGreaterThan() {
            return this.daysAfterLastAccessGreaterThan;
        }

        /**
         * @return daysAfterLastModificationGreaterThan
         */
        public DaysAfterLastModificationGreaterThan getDaysAfterLastModificationGreaterThan() {
            return this.daysAfterLastModificationGreaterThan;
        }

        /**
         * @return daysAfterLastTierModificationGreaterThan
         */
        public DaysAfterLastTierModificationGreaterThan getDaysAfterLastTierModificationGreaterThan() {
            return this.daysAfterLastTierModificationGreaterThan;
        }

        public static final class Builder {
            private DaysAfterLastAccessGreaterThan daysAfterLastAccessGreaterThan; 
            private DaysAfterLastModificationGreaterThan daysAfterLastModificationGreaterThan; 
            private DaysAfterLastTierModificationGreaterThan daysAfterLastTierModificationGreaterThan; 

            /**
             * daysAfterLastAccessGreaterThan.
             */
            public Builder daysAfterLastAccessGreaterThan(DaysAfterLastAccessGreaterThan daysAfterLastAccessGreaterThan) {
                this.daysAfterLastAccessGreaterThan = daysAfterLastAccessGreaterThan;
                return this;
            }

            /**
             * daysAfterLastModificationGreaterThan.
             */
            public Builder daysAfterLastModificationGreaterThan(DaysAfterLastModificationGreaterThan daysAfterLastModificationGreaterThan) {
                this.daysAfterLastModificationGreaterThan = daysAfterLastModificationGreaterThan;
                return this;
            }

            /**
             * daysAfterLastTierModificationGreaterThan.
             */
            public Builder daysAfterLastTierModificationGreaterThan(DaysAfterLastTierModificationGreaterThan daysAfterLastTierModificationGreaterThan) {
                this.daysAfterLastTierModificationGreaterThan = daysAfterLastTierModificationGreaterThan;
                return this;
            }

            public TierToLongterm build() {
                return new TierToLongterm(this);
            } 

        } 

    }
    public static class TierToLowFrequencyDaysAfterLastAccessGreaterThan extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("conditionCode")
        private String conditionCode;

        @com.aliyun.core.annotation.NameInMap("value")
        private Long value;

        private TierToLowFrequencyDaysAfterLastAccessGreaterThan(Builder builder) {
            this.conditionCode = builder.conditionCode;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TierToLowFrequencyDaysAfterLastAccessGreaterThan create() {
            return builder().build();
        }

        /**
         * @return conditionCode
         */
        public String getConditionCode() {
            return this.conditionCode;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String conditionCode; 
            private Long value; 

            /**
             * conditionCode.
             */
            public Builder conditionCode(String conditionCode) {
                this.conditionCode = conditionCode;
                return this;
            }

            /**
             * The retention period of a table. Unit: days.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public TierToLowFrequencyDaysAfterLastAccessGreaterThan build() {
                return new TierToLowFrequencyDaysAfterLastAccessGreaterThan(this);
            } 

        } 

    }
    public static class TierToLowFrequencyDaysAfterLastModificationGreaterThan extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("conditionCode")
        private String conditionCode;

        @com.aliyun.core.annotation.NameInMap("value")
        private Long value;

        private TierToLowFrequencyDaysAfterLastModificationGreaterThan(Builder builder) {
            this.conditionCode = builder.conditionCode;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TierToLowFrequencyDaysAfterLastModificationGreaterThan create() {
            return builder().build();
        }

        /**
         * @return conditionCode
         */
        public String getConditionCode() {
            return this.conditionCode;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String conditionCode; 
            private Long value; 

            /**
             * conditionCode.
             */
            public Builder conditionCode(String conditionCode) {
                this.conditionCode = conditionCode;
                return this;
            }

            /**
             * The retention period of a table. Unit: days.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public TierToLowFrequencyDaysAfterLastModificationGreaterThan build() {
                return new TierToLowFrequencyDaysAfterLastModificationGreaterThan(this);
            } 

        } 

    }
    public static class TierToLowFrequencyDaysAfterLastTierModificationGreaterThan extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("conditionCode")
        private String conditionCode;

        @com.aliyun.core.annotation.NameInMap("value")
        private Long value;

        private TierToLowFrequencyDaysAfterLastTierModificationGreaterThan(Builder builder) {
            this.conditionCode = builder.conditionCode;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TierToLowFrequencyDaysAfterLastTierModificationGreaterThan create() {
            return builder().build();
        }

        /**
         * @return conditionCode
         */
        public String getConditionCode() {
            return this.conditionCode;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String conditionCode; 
            private Long value; 

            /**
             * conditionCode.
             */
            public Builder conditionCode(String conditionCode) {
                this.conditionCode = conditionCode;
                return this;
            }

            /**
             * The retention period of a table. Unit: days.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public TierToLowFrequencyDaysAfterLastTierModificationGreaterThan build() {
                return new TierToLowFrequencyDaysAfterLastTierModificationGreaterThan(this);
            } 

        } 

    }
    public static class TierToLowFrequency extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("daysAfterLastAccessGreaterThan")
        private TierToLowFrequencyDaysAfterLastAccessGreaterThan daysAfterLastAccessGreaterThan;

        @com.aliyun.core.annotation.NameInMap("daysAfterLastModificationGreaterThan")
        private TierToLowFrequencyDaysAfterLastModificationGreaterThan daysAfterLastModificationGreaterThan;

        @com.aliyun.core.annotation.NameInMap("daysAfterLastTierModificationGreaterThan")
        private TierToLowFrequencyDaysAfterLastTierModificationGreaterThan daysAfterLastTierModificationGreaterThan;

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
        public TierToLowFrequencyDaysAfterLastAccessGreaterThan getDaysAfterLastAccessGreaterThan() {
            return this.daysAfterLastAccessGreaterThan;
        }

        /**
         * @return daysAfterLastModificationGreaterThan
         */
        public TierToLowFrequencyDaysAfterLastModificationGreaterThan getDaysAfterLastModificationGreaterThan() {
            return this.daysAfterLastModificationGreaterThan;
        }

        /**
         * @return daysAfterLastTierModificationGreaterThan
         */
        public TierToLowFrequencyDaysAfterLastTierModificationGreaterThan getDaysAfterLastTierModificationGreaterThan() {
            return this.daysAfterLastTierModificationGreaterThan;
        }

        public static final class Builder {
            private TierToLowFrequencyDaysAfterLastAccessGreaterThan daysAfterLastAccessGreaterThan; 
            private TierToLowFrequencyDaysAfterLastModificationGreaterThan daysAfterLastModificationGreaterThan; 
            private TierToLowFrequencyDaysAfterLastTierModificationGreaterThan daysAfterLastTierModificationGreaterThan; 

            /**
             * daysAfterLastAccessGreaterThan.
             */
            public Builder daysAfterLastAccessGreaterThan(TierToLowFrequencyDaysAfterLastAccessGreaterThan daysAfterLastAccessGreaterThan) {
                this.daysAfterLastAccessGreaterThan = daysAfterLastAccessGreaterThan;
                return this;
            }

            /**
             * daysAfterLastModificationGreaterThan.
             */
            public Builder daysAfterLastModificationGreaterThan(TierToLowFrequencyDaysAfterLastModificationGreaterThan daysAfterLastModificationGreaterThan) {
                this.daysAfterLastModificationGreaterThan = daysAfterLastModificationGreaterThan;
                return this;
            }

            /**
             * daysAfterLastTierModificationGreaterThan.
             */
            public Builder daysAfterLastTierModificationGreaterThan(TierToLowFrequencyDaysAfterLastTierModificationGreaterThan daysAfterLastTierModificationGreaterThan) {
                this.daysAfterLastTierModificationGreaterThan = daysAfterLastTierModificationGreaterThan;
                return this;
            }

            public TierToLowFrequency build() {
                return new TierToLowFrequency(this);
            } 

        } 

    }
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
             * TierToLongterm.
             */
            public Builder tierToLongterm(TierToLongterm tierToLongterm) {
                this.tierToLongterm = tierToLongterm;
                return this;
            }

            /**
             * TierToLowFrequency.
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
    public static class Properties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("allowFullScan")
        private Boolean allowFullScan;

        @com.aliyun.core.annotation.NameInMap("elderTunnelQuota")
        private String elderTunnelQuota;

        @com.aliyun.core.annotation.NameInMap("enableDecimal2")
        private Boolean enableDecimal2;

        @com.aliyun.core.annotation.NameInMap("enableFdcCacheForce")
        private Boolean enableFdcCacheForce;

        @com.aliyun.core.annotation.NameInMap("enableTieredStorage")
        private Boolean enableTieredStorage;

        @com.aliyun.core.annotation.NameInMap("enableTunnelQuotaRoute")
        private Boolean enableTunnelQuotaRoute;

        @com.aliyun.core.annotation.NameInMap("encryption")
        private Encryption encryption;

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
            this.elderTunnelQuota = builder.elderTunnelQuota;
            this.enableDecimal2 = builder.enableDecimal2;
            this.enableFdcCacheForce = builder.enableFdcCacheForce;
            this.enableTieredStorage = builder.enableTieredStorage;
            this.enableTunnelQuotaRoute = builder.enableTunnelQuotaRoute;
            this.encryption = builder.encryption;
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
         * @return elderTunnelQuota
         */
        public String getElderTunnelQuota() {
            return this.elderTunnelQuota;
        }

        /**
         * @return enableDecimal2
         */
        public Boolean getEnableDecimal2() {
            return this.enableDecimal2;
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
            private String elderTunnelQuota; 
            private Boolean enableDecimal2; 
            private Boolean enableFdcCacheForce; 
            private Boolean enableTieredStorage; 
            private Boolean enableTunnelQuotaRoute; 
            private Encryption encryption; 
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
             * Indicates whether a full table scan on the project is enabled.
             */
            public Builder allowFullScan(Boolean allowFullScan) {
                this.allowFullScan = allowFullScan;
                return this;
            }

            /**
             * This operation does not return a value for this parameter.
             */
            public Builder elderTunnelQuota(String elderTunnelQuota) {
                this.elderTunnelQuota = elderTunnelQuota;
                return this;
            }

            /**
             * Indicates whether the DECIMAL data type in MaxCompute V2.0 is enabled.
             */
            public Builder enableDecimal2(Boolean enableDecimal2) {
                this.enableDecimal2 = enableDecimal2;
                return this;
            }

            /**
             * enableFdcCacheForce.
             */
            public Builder enableFdcCacheForce(Boolean enableFdcCacheForce) {
                this.enableFdcCacheForce = enableFdcCacheForce;
                return this;
            }

            /**
             * enableTieredStorage.
             */
            public Builder enableTieredStorage(Boolean enableTieredStorage) {
                this.enableTieredStorage = enableTieredStorage;
                return this;
            }

            /**
             * Indicates whether tunnel quota routing is enabled.
             */
            public Builder enableTunnelQuotaRoute(Boolean enableTunnelQuotaRoute) {
                this.enableTunnelQuotaRoute = enableTunnelQuotaRoute;
                return this;
            }

            /**
             * The encryption information.
             */
            public Builder encryption(Encryption encryption) {
                this.encryption = encryption;
                return this;
            }

            /**
             * fdcQuota.
             */
            public Builder fdcQuota(String fdcQuota) {
                this.fdcQuota = fdcQuota;
                return this;
            }

            /**
             * The number of days for which backup data can be retained.
             */
            public Builder retentionDays(Long retentionDays) {
                this.retentionDays = retentionDays;
                return this;
            }

            /**
             * The upper limit for the resources that are consumed by an SQL statement.
             */
            public Builder sqlMeteringMax(String sqlMeteringMax) {
                this.sqlMeteringMax = sqlMeteringMax;
                return this;
            }

            /**
             * The information about the tiered storage.
             */
            public Builder storageTierInfo(StorageTierInfo storageTierInfo) {
                this.storageTierInfo = storageTierInfo;
                return this;
            }

            /**
             * The lifecycle of the table in the project.
             */
            public Builder tableLifecycle(TableLifecycle tableLifecycle) {
                this.tableLifecycle = tableLifecycle;
                return this;
            }

            /**
             * tableLifecycleConfig.
             */
            public Builder tableLifecycleConfig(TableLifecycleConfig tableLifecycleConfig) {
                this.tableLifecycleConfig = tableLifecycleConfig;
                return this;
            }

            /**
             * The time zone of the project.
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * The name of the tunnel quota.
             */
            public Builder tunnelQuota(String tunnelQuota) {
                this.tunnelQuota = tunnelQuota;
                return this;
            }

            /**
             * The data type edition. Valid values: -**1**: MaxCompute V1.0 data type edition. -**2**: MaxCompute V2.0 data type edition. -**hive**: Hive-compatible data type edition.
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
             * The ID of the resource.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The type of the resource.
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
             * The exception policy. If cross-project data access operations are required, the project owner must configure an exception policy in advance to allow the specified user to transfer data of a specified object from the current project to a specified project. After the exception policy is configured, data of the object can be transferred to the specified project even if the project data protection feature is enabled.
             */
            public Builder exceptionPolicy(String exceptionPolicy) {
                this.exceptionPolicy = exceptionPolicy;
                return this;
            }

            /**
             * Indicates whether project data protection is enabled.
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
             * Indicates whether Download control is enabled.
             */
            public Builder enableDownloadPrivilege(Boolean enableDownloadPrivilege) {
                this.enableDownloadPrivilege = enableDownloadPrivilege;
                return this;
            }

            /**
             * Indicates whether label-based access control is enabled.
             */
            public Builder labelSecurity(Boolean labelSecurity) {
                this.labelSecurity = labelSecurity;
                return this;
            }

            /**
             * Indicates whether the object creator is allowed to perform operations on objects.
             */
            public Builder objectCreatorHasAccessPermission(Boolean objectCreatorHasAccessPermission) {
                this.objectCreatorHasAccessPermission = objectCreatorHasAccessPermission;
                return this;
            }

            /**
             * Indicates whether the object creator is allowed to authorize other users to perform operations on objects.
             */
            public Builder objectCreatorHasGrantPermission(Boolean objectCreatorHasGrantPermission) {
                this.objectCreatorHasGrantPermission = objectCreatorHasGrantPermission;
                return this;
            }

            /**
             * Indicates whether project data protection is enabled.
             */
            public Builder projectProtection(ProjectProtection projectProtection) {
                this.projectProtection = projectProtection;
                return this;
            }

            /**
             * Indicates whether ACL-based access control is enabled.
             */
            public Builder usingAcl(Boolean usingAcl) {
                this.usingAcl = usingAcl;
                return this;
            }

            /**
             * Indicates whether policy-based access control is enabled.
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
        private java.util.List < String > superAdmins;

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
        public java.util.List < String > getSuperAdmins() {
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
            private java.util.List < String > superAdmins; 
            private Boolean threeTierModel; 
            private String type; 

            /**
             * The comment of the project.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The storage usage.
             */
            public Builder costStorage(String costStorage) {
                this.costStorage = costStorage;
                return this;
            }

            /**
             * Create time
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The default computing quota.
             */
            public Builder defaultQuota(String defaultQuota) {
                this.defaultQuota = defaultQuota;
                return this;
            }

            /**
             * The IP address whitelist.
             */
            public Builder ipWhiteList(IpWhiteList ipWhiteList) {
                this.ipWhiteList = ipWhiteList;
                return this;
            }

            /**
             * The name of the MaxCompute project.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The owner of the project.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The billing method of the project.
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * The properties of the project.
             */
            public Builder properties(Properties properties) {
                this.properties = properties;
                return this;
            }

            /**
             * RegionID
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The tag.
             */
            public Builder saleTag(SaleTag saleTag) {
                this.saleTag = saleTag;
                return this;
            }

            /**
             * The permission properties.
             */
            public Builder securityProperties(SecurityProperties securityProperties) {
                this.securityProperties = securityProperties;
                return this;
            }

            /**
             * The status of the project. Valid values: -**AVAILABLE**: The project was available. -**READONLY**: The project was read only. -**FROZEN**: The project was frozen. -**DELETING**: The project was being deleted.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The Super_Administrator role.
             */
            public Builder superAdmins(java.util.List < String > superAdmins) {
                this.superAdmins = superAdmins;
                return this;
            }

            /**
             * Indicates whether the current project supports the three-layer model of MaxCompute.
             */
            public Builder threeTierModel(Boolean threeTierModel) {
                this.threeTierModel = threeTierModel;
                return this;
            }

            /**
             * The type of the project. Valid values: -**managed**: The project is an internal project. -**external**: The project is an external project.
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
