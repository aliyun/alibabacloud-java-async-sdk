// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link PreCheckSqlFlashbackTaskResponseBody} extends {@link TeaModel}
 *
 * <p>PreCheckSqlFlashbackTaskResponseBody</p>
 */
public class PreCheckSqlFlashbackTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private PreCheckSqlFlashbackTaskResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreCheckSqlFlashbackTaskResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(PreCheckSqlFlashbackTaskResponseBody model) {
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PreCheckSqlFlashbackTaskResponseBody build() {
            return new PreCheckSqlFlashbackTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PreCheckSqlFlashbackTaskResponseBody} extends {@link TeaModel}
     *
     * <p>PreCheckSqlFlashbackTaskResponseBody</p>
     */
    public static class CheckResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BinlogExists")
        private Boolean binlogExists;

        @com.aliyun.core.annotation.NameInMap("BinlogRowQueryEventEnabled")
        private Boolean binlogRowQueryEventEnabled;

        @com.aliyun.core.annotation.NameInMap("CanUpgradeSupportBinlogRowQueryEvents")
        private Boolean canUpgradeSupportBinlogRowQueryEvents;

        @com.aliyun.core.annotation.NameInMap("HasTable")
        private Boolean hasTable;

        @com.aliyun.core.annotation.NameInMap("SupportBinlogRowQueryEvents")
        private Boolean supportBinlogRowQueryEvents;

        private CheckResult(Builder builder) {
            this.binlogExists = builder.binlogExists;
            this.binlogRowQueryEventEnabled = builder.binlogRowQueryEventEnabled;
            this.canUpgradeSupportBinlogRowQueryEvents = builder.canUpgradeSupportBinlogRowQueryEvents;
            this.hasTable = builder.hasTable;
            this.supportBinlogRowQueryEvents = builder.supportBinlogRowQueryEvents;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckResult create() {
            return builder().build();
        }

        /**
         * @return binlogExists
         */
        public Boolean getBinlogExists() {
            return this.binlogExists;
        }

        /**
         * @return binlogRowQueryEventEnabled
         */
        public Boolean getBinlogRowQueryEventEnabled() {
            return this.binlogRowQueryEventEnabled;
        }

        /**
         * @return canUpgradeSupportBinlogRowQueryEvents
         */
        public Boolean getCanUpgradeSupportBinlogRowQueryEvents() {
            return this.canUpgradeSupportBinlogRowQueryEvents;
        }

        /**
         * @return hasTable
         */
        public Boolean getHasTable() {
            return this.hasTable;
        }

        /**
         * @return supportBinlogRowQueryEvents
         */
        public Boolean getSupportBinlogRowQueryEvents() {
            return this.supportBinlogRowQueryEvents;
        }

        public static final class Builder {
            private Boolean binlogExists; 
            private Boolean binlogRowQueryEventEnabled; 
            private Boolean canUpgradeSupportBinlogRowQueryEvents; 
            private Boolean hasTable; 
            private Boolean supportBinlogRowQueryEvents; 

            private Builder() {
            } 

            private Builder(CheckResult model) {
                this.binlogExists = model.binlogExists;
                this.binlogRowQueryEventEnabled = model.binlogRowQueryEventEnabled;
                this.canUpgradeSupportBinlogRowQueryEvents = model.canUpgradeSupportBinlogRowQueryEvents;
                this.hasTable = model.hasTable;
                this.supportBinlogRowQueryEvents = model.supportBinlogRowQueryEvents;
            } 

            /**
             * BinlogExists.
             */
            public Builder binlogExists(Boolean binlogExists) {
                this.binlogExists = binlogExists;
                return this;
            }

            /**
             * BinlogRowQueryEventEnabled.
             */
            public Builder binlogRowQueryEventEnabled(Boolean binlogRowQueryEventEnabled) {
                this.binlogRowQueryEventEnabled = binlogRowQueryEventEnabled;
                return this;
            }

            /**
             * CanUpgradeSupportBinlogRowQueryEvents.
             */
            public Builder canUpgradeSupportBinlogRowQueryEvents(Boolean canUpgradeSupportBinlogRowQueryEvents) {
                this.canUpgradeSupportBinlogRowQueryEvents = canUpgradeSupportBinlogRowQueryEvents;
                return this;
            }

            /**
             * HasTable.
             */
            public Builder hasTable(Boolean hasTable) {
                this.hasTable = hasTable;
                return this;
            }

            /**
             * SupportBinlogRowQueryEvents.
             */
            public Builder supportBinlogRowQueryEvents(Boolean supportBinlogRowQueryEvents) {
                this.supportBinlogRowQueryEvents = supportBinlogRowQueryEvents;
                return this;
            }

            public CheckResult build() {
                return new CheckResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link PreCheckSqlFlashbackTaskResponseBody} extends {@link TeaModel}
     *
     * <p>PreCheckSqlFlashbackTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckResult")
        private CheckResult checkResult;

        private Data(Builder builder) {
            this.checkResult = builder.checkResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return checkResult
         */
        public CheckResult getCheckResult() {
            return this.checkResult;
        }

        public static final class Builder {
            private CheckResult checkResult; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.checkResult = model.checkResult;
            } 

            /**
             * CheckResult.
             */
            public Builder checkResult(CheckResult checkResult) {
                this.checkResult = checkResult;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
