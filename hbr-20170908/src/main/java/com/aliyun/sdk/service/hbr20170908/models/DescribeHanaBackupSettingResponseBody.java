// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHanaBackupSettingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHanaBackupSettingResponseBody</p>
 */
public class DescribeHanaBackupSettingResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HanaBackupSetting")
    private HanaBackupSetting hanaBackupSetting;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeHanaBackupSettingResponseBody(Builder builder) {
        this.code = builder.code;
        this.hanaBackupSetting = builder.hanaBackupSetting;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHanaBackupSettingResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return hanaBackupSetting
     */
    public HanaBackupSetting getHanaBackupSetting() {
        return this.hanaBackupSetting;
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
        private String code; 
        private HanaBackupSetting hanaBackupSetting; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code. The status code 200 indicates that the call is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The backup settings.
         */
        public Builder hanaBackupSetting(HanaBackupSetting hanaBackupSetting) {
            this.hanaBackupSetting = hanaBackupSetting;
            return this;
        }

        /**
         * The message that is returned. If the call is successful, "successful" is returned. If the call fails, an error message is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call is successful. Valid values:
         * <p>
         * 
         * *   true: The call is successful.
         * *   false: The call fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeHanaBackupSettingResponseBody build() {
            return new DescribeHanaBackupSettingResponseBody(this);
        } 

    } 

    public static class HanaBackupSetting extends TeaModel {
        @NameInMap("CatalogBackupParameterFile")
        private String catalogBackupParameterFile;

        @NameInMap("CatalogBackupUsingBackint")
        private Boolean catalogBackupUsingBackint;

        @NameInMap("DataBackupParameterFile")
        private String dataBackupParameterFile;

        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("EnableAutoLogBackup")
        private Boolean enableAutoLogBackup;

        @NameInMap("LogBackupParameterFile")
        private String logBackupParameterFile;

        @NameInMap("LogBackupTimeout")
        private Long logBackupTimeout;

        @NameInMap("LogBackupUsingBackint")
        private Boolean logBackupUsingBackint;

        private HanaBackupSetting(Builder builder) {
            this.catalogBackupParameterFile = builder.catalogBackupParameterFile;
            this.catalogBackupUsingBackint = builder.catalogBackupUsingBackint;
            this.dataBackupParameterFile = builder.dataBackupParameterFile;
            this.databaseName = builder.databaseName;
            this.enableAutoLogBackup = builder.enableAutoLogBackup;
            this.logBackupParameterFile = builder.logBackupParameterFile;
            this.logBackupTimeout = builder.logBackupTimeout;
            this.logBackupUsingBackint = builder.logBackupUsingBackint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HanaBackupSetting create() {
            return builder().build();
        }

        /**
         * @return catalogBackupParameterFile
         */
        public String getCatalogBackupParameterFile() {
            return this.catalogBackupParameterFile;
        }

        /**
         * @return catalogBackupUsingBackint
         */
        public Boolean getCatalogBackupUsingBackint() {
            return this.catalogBackupUsingBackint;
        }

        /**
         * @return dataBackupParameterFile
         */
        public String getDataBackupParameterFile() {
            return this.dataBackupParameterFile;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return enableAutoLogBackup
         */
        public Boolean getEnableAutoLogBackup() {
            return this.enableAutoLogBackup;
        }

        /**
         * @return logBackupParameterFile
         */
        public String getLogBackupParameterFile() {
            return this.logBackupParameterFile;
        }

        /**
         * @return logBackupTimeout
         */
        public Long getLogBackupTimeout() {
            return this.logBackupTimeout;
        }

        /**
         * @return logBackupUsingBackint
         */
        public Boolean getLogBackupUsingBackint() {
            return this.logBackupUsingBackint;
        }

        public static final class Builder {
            private String catalogBackupParameterFile; 
            private Boolean catalogBackupUsingBackint; 
            private String dataBackupParameterFile; 
            private String databaseName; 
            private Boolean enableAutoLogBackup; 
            private String logBackupParameterFile; 
            private Long logBackupTimeout; 
            private Boolean logBackupUsingBackint; 

            /**
             * The configuration file for catalog backup.
             */
            public Builder catalogBackupParameterFile(String catalogBackupParameterFile) {
                this.catalogBackupParameterFile = catalogBackupParameterFile;
                return this;
            }

            /**
             * Indicates whether Backint is used to back up catalogs. Valid values:
             * <p>
             * 
             * *   true: Backint is used to back up catalogs.
             * *   false: Backint is not used to back up catalogs.
             */
            public Builder catalogBackupUsingBackint(Boolean catalogBackupUsingBackint) {
                this.catalogBackupUsingBackint = catalogBackupUsingBackint;
                return this;
            }

            /**
             * The configuration file for data backup.
             */
            public Builder dataBackupParameterFile(String dataBackupParameterFile) {
                this.dataBackupParameterFile = dataBackupParameterFile;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * Indicates whether automatic log backup is enabled. Valid values:
             * <p>
             * 
             * *   **true**: Automatic log backup is enabled.
             * *   **false**: Automatic log backup is disabled.
             */
            public Builder enableAutoLogBackup(Boolean enableAutoLogBackup) {
                this.enableAutoLogBackup = enableAutoLogBackup;
                return this;
            }

            /**
             * The configuration file for log backup.
             */
            public Builder logBackupParameterFile(String logBackupParameterFile) {
                this.logBackupParameterFile = logBackupParameterFile;
                return this;
            }

            /**
             * The interval at which logs are backed up. Unit: seconds.
             */
            public Builder logBackupTimeout(Long logBackupTimeout) {
                this.logBackupTimeout = logBackupTimeout;
                return this;
            }

            /**
             * Indicates whether Backint is used to back up logs. Valid values:
             * <p>
             * 
             * *   true: Backint is used to back up logs.
             * *   false: Backint is not used to back up logs.
             */
            public Builder logBackupUsingBackint(Boolean logBackupUsingBackint) {
                this.logBackupUsingBackint = logBackupUsingBackint;
                return this;
            }

            public HanaBackupSetting build() {
                return new HanaBackupSetting(this);
            } 

        } 

    }
}
