// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link DescribeSynchronizationObjectModifyStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSynchronizationObjectModifyStatusResponseBody</p>
 */
public class DescribeSynchronizationObjectModifyStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInitializationStatus")
    private DataInitializationStatus dataInitializationStatus;

    @com.aliyun.core.annotation.NameInMap("DataSynchronizationStatus")
    private DataSynchronizationStatus dataSynchronizationStatus;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("PrecheckStatus")
    private PrecheckStatus precheckStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StructureInitializationStatus")
    private StructureInitializationStatus structureInitializationStatus;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeSynchronizationObjectModifyStatusResponseBody(Builder builder) {
        this.dataInitializationStatus = builder.dataInitializationStatus;
        this.dataSynchronizationStatus = builder.dataSynchronizationStatus;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.errorMessage = builder.errorMessage;
        this.precheckStatus = builder.precheckStatus;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.structureInitializationStatus = builder.structureInitializationStatus;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSynchronizationObjectModifyStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataInitializationStatus
     */
    public DataInitializationStatus getDataInitializationStatus() {
        return this.dataInitializationStatus;
    }

    /**
     * @return dataSynchronizationStatus
     */
    public DataSynchronizationStatus getDataSynchronizationStatus() {
        return this.dataSynchronizationStatus;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return precheckStatus
     */
    public PrecheckStatus getPrecheckStatus() {
        return this.precheckStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return structureInitializationStatus
     */
    public StructureInitializationStatus getStructureInitializationStatus() {
        return this.structureInitializationStatus;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private DataInitializationStatus dataInitializationStatus; 
        private DataSynchronizationStatus dataSynchronizationStatus; 
        private String errCode; 
        private String errMessage; 
        private String errorMessage; 
        private PrecheckStatus precheckStatus; 
        private String requestId; 
        private String status; 
        private StructureInitializationStatus structureInitializationStatus; 
        private String success; 

        private Builder() {
        } 

        private Builder(DescribeSynchronizationObjectModifyStatusResponseBody model) {
            this.dataInitializationStatus = model.dataInitializationStatus;
            this.dataSynchronizationStatus = model.dataSynchronizationStatus;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.errorMessage = model.errorMessage;
            this.precheckStatus = model.precheckStatus;
            this.requestId = model.requestId;
            this.status = model.status;
            this.structureInitializationStatus = model.structureInitializationStatus;
            this.success = model.success;
        } 

        /**
         * <p>The status of full data synchronization.</p>
         */
        public Builder dataInitializationStatus(DataInitializationStatus dataInitializationStatus) {
            this.dataInitializationStatus = dataInitializationStatus;
            return this;
        }

        /**
         * <p>The status of incremental data synchronization.</p>
         * <blockquote>
         * <p> This parameter and its sub-parameters will be removed in the future.</p>
         * </blockquote>
         */
        public Builder dataSynchronizationStatus(DataSynchronizationStatus dataSynchronizationStatus) {
            this.dataSynchronizationStatus = dataSynchronizationStatus;
            return this;
        }

        /**
         * <p>The error code returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The request processing has failed due to some unknown error.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The error message returned if the task failed to modify the objects to be synchronized.</p>
         * 
         * <strong>example:</strong>
         * <p>DTS-070211: Connect Source DB failed. cause by [com.mysql.jdbc.exceptions.jdbc4.MySQLNonTransientConnectionException:Could not create connection to database server. Attempted reconnect 3 times. Giving up.][com.mysql.jdbc.exceptions.jdbc4.CommunicationsException:Communications link failure\n\nThe last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.][java.net.ConnectException:Connection timed out (Connection timed out)] About more information in [<a href="https://yq.aliyun.com/articles/499178%5D">https://yq.aliyun.com/articles/499178]</a>.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The precheck status.</p>
         */
        public Builder precheckStatus(PrecheckStatus precheckStatus) {
            this.precheckStatus = precheckStatus;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B38C644B-4395-4F6F-86E3-592F26BE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the task that changes the objects to be synchronized. Valid values:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: The task is not started.</li>
         * <li><strong>Prechecking</strong>: The task is being prechecked.</li>
         * <li><strong>PrecheckFailed</strong>: The task failed to pass the precheck.</li>
         * <li><strong>Migrating</strong>: The task is running.</li>
         * <li><strong>Failed</strong>: The task failed.</li>
         * <li><strong>Finished</strong>: The task is completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The status of schema synchronization.</p>
         */
        public Builder structureInitializationStatus(StructureInitializationStatus structureInitializationStatus) {
            this.structureInitializationStatus = structureInitializationStatus;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeSynchronizationObjectModifyStatusResponseBody build() {
            return new DescribeSynchronizationObjectModifyStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSynchronizationObjectModifyStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSynchronizationObjectModifyStatusResponseBody</p>
     */
    public static class DataInitializationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DataInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataInitializationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private String percent; 
            private String progress; 
            private String status; 

            private Builder() {
            } 

            private Builder(DataInitializationStatus model) {
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message returned if full data synchronization failed.</p>
             * 
             * <strong>example:</strong>
             * <p>java.lang.NumberFormatException: For input string: &quot;&quot;</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of full data synchronization. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of records that have been synchronized during full data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>39754</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The status of full data synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: Full data synchronization is not started.</li>
             * <li><strong>Migrating</strong>: Full data synchronization is in progress.</li>
             * <li><strong>Failed</strong>: Full data synchronization failed.</li>
             * <li><strong>Finished</strong>: Full data synchronization is completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DataInitializationStatus build() {
                return new DataInitializationStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSynchronizationObjectModifyStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSynchronizationObjectModifyStatusResponseBody</p>
     */
    public static class DataSynchronizationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Delay")
        private String delay;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DataSynchronizationStatus(Builder builder) {
            this.delay = builder.delay;
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSynchronizationStatus create() {
            return builder().build();
        }

        /**
         * @return delay
         */
        public String getDelay() {
            return this.delay;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String delay; 
            private String errorMessage; 
            private String percent; 
            private String status; 

            private Builder() {
            } 

            private Builder(DataSynchronizationStatus model) {
                this.delay = model.delay;
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.status = model.status;
            } 

            /**
             * <p>The synchronization latency, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder delay(String delay) {
                this.delay = delay;
                return this;
            }

            /**
             * <p>The error message returned if incremental data synchronization failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-070211: Connect Source DB failed. cause by [com.mysql.jdbc.exceptions.jdbc4.MySQLNonTransientConnectionException:Could not create connection to database server. Attempted reconnect 3 times. Giving up.][com.mysql.jdbc.exceptions.jdbc4.CommunicationsException:Communications link failure\n\nThe last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.][java.net.ConnectException:Connection timed out (Connection timed out)] About more information in [<a href="https://yq.aliyun.com/articles/499178%5D">https://yq.aliyun.com/articles/499178]</a>.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of incremental data synchronization. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The status of incremental data synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: Incremental data synchronization is not started.</li>
             * <li><strong>Migrating</strong>: Incremental data synchronization is in progress.</li>
             * <li><strong>Failed</strong>: Incremental data synchronization failed.</li>
             * <li><strong>Finished</strong>: Incremental data synchronization is completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Migrating</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DataSynchronizationStatus build() {
                return new DataSynchronizationStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSynchronizationObjectModifyStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSynchronizationObjectModifyStatusResponseBody</p>
     */
    public static class Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckStatus")
        private String checkStatus;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("ItemName")
        private String itemName;

        @com.aliyun.core.annotation.NameInMap("RepairMethod")
        private String repairMethod;

        private Detail(Builder builder) {
            this.checkStatus = builder.checkStatus;
            this.errorMessage = builder.errorMessage;
            this.itemName = builder.itemName;
            this.repairMethod = builder.repairMethod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return checkStatus
         */
        public String getCheckStatus() {
            return this.checkStatus;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return repairMethod
         */
        public String getRepairMethod() {
            return this.repairMethod;
        }

        public static final class Builder {
            private String checkStatus; 
            private String errorMessage; 
            private String itemName; 
            private String repairMethod; 

            private Builder() {
            } 

            private Builder(Detail model) {
                this.checkStatus = model.checkStatus;
                this.errorMessage = model.errorMessage;
                this.itemName = model.itemName;
                this.repairMethod = model.repairMethod;
            } 

            /**
             * <p>The precheck result. Valid values:</p>
             * <ul>
             * <li>Success: The task passed the precheck.</li>
             * <li>Failed: The task failed to pass the precheck.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder checkStatus(String checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * <p>The error message returned if the task failed to pass the precheck.</p>
             * <blockquote>
             * <p> This parameter is returned only if the return value of the <strong>CheckStatus</strong> parameter is <strong>Failed</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Original error: Access denied for user &quot;dtstest&quot;@&quot;100.104.xxx.xx&quot; (using password: YES)</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The name of the precheck item.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK_CONN_SRC</p>
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * <p>The method to fix the precheck failure.</p>
             * <blockquote>
             * <p> This parameter is returned only if the return value of the <strong>CheckStatus</strong> parameter is Failed.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>CHECK_ERROR_DEST_CONN_REPAIR2</p>
             */
            public Builder repairMethod(String repairMethod) {
                this.repairMethod = repairMethod;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSynchronizationObjectModifyStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSynchronizationObjectModifyStatusResponseBody</p>
     */
    public static class PrecheckStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private java.util.List<Detail> detail;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private PrecheckStatus(Builder builder) {
            this.detail = builder.detail;
            this.percent = builder.percent;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrecheckStatus create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.List<Detail> getDetail() {
            return this.detail;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List<Detail> detail; 
            private String percent; 
            private String status; 

            private Builder() {
            } 

            private Builder(PrecheckStatus model) {
                this.detail = model.detail;
                this.percent = model.percent;
                this.status = model.status;
            } 

            /**
             * <p>The result of each precheck item.</p>
             */
            public Builder detail(java.util.List<Detail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The precheck progress. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The precheck status.</p>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public PrecheckStatus build() {
                return new PrecheckStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSynchronizationObjectModifyStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSynchronizationObjectModifyStatusResponseBody</p>
     */
    public static class StructureInitializationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private StructureInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StructureInitializationStatus create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private String percent; 
            private String progress; 
            private String status; 

            private Builder() {
            } 

            private Builder(StructureInitializationStatus model) {
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message returned if schema synchronization failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-1020042 Execute sql error sql: Table &quot;customer&quot; already exists</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of schema synchronization. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of tables whose schemas have been synchronized.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The status of schema synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: Schema synchronization is not started.</li>
             * <li><strong>Migrating</strong>: Schema synchronization is in progress.</li>
             * <li><strong>Failed</strong>: Schema synchronization failed.</li>
             * <li><strong>Finished</strong>: Schema synchronization is completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public StructureInitializationStatus build() {
                return new StructureInitializationStatus(this);
            } 

        } 

    }
}
